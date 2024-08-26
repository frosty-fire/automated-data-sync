package vn.baodh.data_sync.infra.controller.http;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import vn.baodh.data_sync.app.monitor.LogTopic;
import vn.baodh.data_sync.app.monitor.Loggable;

@Loggable(topic = LogTopic.CONTROLLER)
@RestController
@RequiredArgsConstructor
public class PingController {
    @PostMapping(value = {"/ping"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<?>> ping(@RequestBody String requestTime) {
        String pong = "Pong" + "," + requestTime + "," + System.currentTimeMillis();
        return Mono.just(ResponseEntity.status(HttpStatus.OK).body(pong));
    }
}

