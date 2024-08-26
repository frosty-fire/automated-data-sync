package vn.baodh.data_sync.domain.repository;

import vn.baodh.data_sync.domain.model.AttendanceRecord;
import vn.baodh.data_sync.domain.model.NetworkAccessRecord;

public interface NetworkAccessRepository {
    NetworkAccessRecord create(NetworkAccessRecord attendanceRecord);
}
