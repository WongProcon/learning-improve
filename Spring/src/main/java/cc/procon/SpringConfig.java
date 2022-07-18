package cc.procon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 *  <ul>
 *      <li>@Configuration 告诉spring这是一个person对象</li>
 *      <li>@Bean 相当于xml中的Bean标签</li>
 *  </ul>
 * </p>
 *
 * @author Procon
 * @version v1.0
 * @since 2022/7/14
 */

@Configuration
@ComponentScan(basePackages = {"cc.procon"})
public class SpringConfig {

    @Bean
    public Person person(){
        Person person = new Person();
        person.setAge("20");
        person.setName("里斯");
        return person;
    }
}
