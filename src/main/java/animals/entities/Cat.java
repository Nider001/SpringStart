package animals.entities;

import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.swing.plaf.IconUIResource;

@Component
public class Cat
{
    private String name = "Barsik";

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    /*@PostConstruct
    private void construct()
    {
        System.out.println("Cat is added to AppContext...");
    }*/

    @PreDestroy
    private void destroy()
    {
        System.out.println("Cat is about to be removed from AppContext...");
    }
}
