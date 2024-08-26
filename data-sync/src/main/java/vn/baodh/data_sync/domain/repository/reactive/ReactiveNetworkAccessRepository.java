package vn.baodh.data_sync.domain.repository.reactive;

import reactor.core.publisher.Mono;
import vn.baodh.data_sync.domain.model.NetworkAccessRecord;

public interface ReactiveNetworkAccessRepository {
    Mono<NetworkAccessRecord> create(NetworkAccessRecord attendanceRecord);
}
