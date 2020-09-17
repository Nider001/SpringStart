package animals.entities;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Dog
{
    private String name = "Виталий";

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
        System.out.println("Пес добавлен в AppContext...");
    }*/

    @PreDestroy
    private void destroy()
    {
        System.out.println("Пес сейчас будет удален из AppContext...");
    }
}
