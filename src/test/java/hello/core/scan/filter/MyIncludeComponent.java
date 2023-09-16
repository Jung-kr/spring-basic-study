package hello.core.scan.filter;

import java.lang.annotation.*;

// @MyIncludeComponent가 붙은 것은 ComponentScan에 추가할꺼임
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyIncludeComponent {
}
