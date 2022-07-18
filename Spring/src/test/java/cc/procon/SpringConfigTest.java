package cc.procon;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p></p>
 *
 * @author Procon
 * @version v1.0
 * @since 2022/7/14
 */

@Slf4j
public class SpringConfigTest {

    @Test
    public void beanTest(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Person person = applicationContext.getBean(Person.class);
        log.info(person.toString());
        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
        for (String s : beanNamesForType) {
            log.info(s);
        }
    }
}
