package vn.baodh.data_sync.domain.repository;

import vn.baodh.data_sync.domain.model.AttendanceRecord;

public interface AttendanceRepository {
    AttendanceRecord create(AttendanceRecord attendanceRecord);
}
