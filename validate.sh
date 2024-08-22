#!/bin/bash
# This script will be run when releasing or deploying a new version.

# Validate versions
EXPECTED_VERSION=$(cat version.conf)

check_version() {
  local pom_file=$1
  version=$(xmllint --xpath "/*[local-name()='project']/*[local-name()='version']/text()" "$pom_file")
  if [ "$version" != "$EXPECTED_VERSION" ]; then
    echo "Version mismatch in $pom_file: found $version, expected $EXPECTED_VERSION"
    return 1
  fi
  return 0
}

# Find all pom.xml files in the project, including submodules
error_found=0
while read -r pom_file; do
    check_version "$pom_file" || error_found=1
done < <(find . -name "pom.xml")

if [ $error_found -eq 1 ]; then
  exit 1
fi

echo "All pom.xml files have the correct version."
