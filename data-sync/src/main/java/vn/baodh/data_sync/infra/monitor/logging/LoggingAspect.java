package vn.baodh.data_sync.infra.monitor.logging;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import reactor.core.publisher.Mono;

@Aspect
@EnableAspectJAutoProxy
public class LoggingAspect {
    @Pointcut("within(@vn.baodh.data_sync.app.monitor.Loggable *)")
    public void loggable() {
    }

    @Pointcut("execution(public * *..*(..))")
    public void publicMethod() {
    }

    @Around("loggable() && publicMethod()")
    public Mono<Object> around(ProceedingJoinPoint joinPoint) throws Throwable {
//        var target = (Mono<Object>) pjp.getTarget();
        return Mono.empty();
    }
}
