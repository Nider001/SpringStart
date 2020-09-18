package animals.entities;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Dog
{
    private String name = "Vitaliy";

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
        System.out.println("Dog is added AppContext...");
    }*/

    @PreDestroy
    private void destroy()
    {
        System.out.println("Dog is about to be removed AppContext...");
    }
}
