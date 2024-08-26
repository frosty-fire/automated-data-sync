package vn.baodh.data_sync.app.monitor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Loggable declaration
 *
 * @author Bao Dang
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Loggable {

    /**
     * @return topic name
     */
    LogTopic topic() default LogTopic.DEFAULT;

    /**
     * @return extra note
     */
    String note() default "";
}