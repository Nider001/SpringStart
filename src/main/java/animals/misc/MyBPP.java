package animals.misc;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBPP implements BeanPostProcessor
{
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
    {
        System.out.println(beanName + " is about to be added to AppContext...");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
    {
        System.out.println(beanName + " is successfully added to AppContext!");
        return bean;
    }
}
