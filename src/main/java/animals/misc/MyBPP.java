package animals.misc;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBPP implements BeanPostProcessor
{
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
    {
        System.out.println(beanName + " будет добавлен в AppContext...");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
    {
        System.out.println(beanName + " успешно добавлен в AppContext!");
        return bean;
    }
}
