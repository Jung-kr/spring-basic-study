package hello.core.autowired;

import hello.core.member.Member;
import jakarta.annotation.Nullable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

public class AutowiredTest {

    @Test
    void AutowiredOption() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);

    }

    static class TestBean {

        //호출 안됨
        @Autowired(required = false)
        public void setNoBean1(Member noBean1) {  // 스프링 관리하는 빈이 아닌 것 아무거나
            System.out.println("noBean1 = " + noBean1);
        }

        //null 호출
        @Autowired
        public void setNoBean2(@Nullable Member noBean2) {  // 스프링 관리하는 빈이 아닌 것 아무거나
            System.out.println("noBean2 = " + noBean2);
        }

        //Optional.empty 호출
        @Autowired(required = false)
        public void setNoBean3(Optional<Member> noBean3) {
            System.out.println("noBean3 = " + noBean3);
        }
    }
}
