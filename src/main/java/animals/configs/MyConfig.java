package animals.configs;

import animals.entities.Cat;
import animals.entities.Dog;
import animals.entities.Parrot;
import animals.misc.MyBFPP;
import animals.misc.MyBPP;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig
{
    @Bean
    public Cat cat()
    {
        return new Cat();
    }

    @Bean
    public Dog dog()
    {
        return new Dog();
    }

    @Bean("parrot-kesha")
    public Parrot parrot()
    {
        return new Parrot();
    }

    /*@Bean
    public Cat catKiller(Parrot parrot)
    {
        Cat cat = new Cat();
        cat.setName(parrot.getName() + "-killer");
        return cat;
    }*/

    @Bean
    public MyBPP myBeanPostProcessor() {
        return new MyBPP();
    }

    @Bean
    public MyBFPP myBeanFactoryPostProcessor() {
        return new MyBFPP();
    }
}
