package vn.baodh.data_sync.domain.repository.reactive;

import reactor.core.publisher.Mono;
import vn.baodh.data_sync.domain.model.AttendanceRecord;

public interface ReactiveAttendanceRepository {
    Mono<AttendanceRecord> create(AttendanceRecord attendanceRecord);
}
