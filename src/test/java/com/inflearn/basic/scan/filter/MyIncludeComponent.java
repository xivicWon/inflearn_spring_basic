package com.inflearn.basic.scan.filter;

import org.springframework.stereotype.Indexed;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyIncludeComponent{
}
