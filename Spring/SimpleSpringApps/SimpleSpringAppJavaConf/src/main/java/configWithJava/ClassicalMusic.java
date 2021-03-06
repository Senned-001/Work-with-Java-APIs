package configWithJava;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("singleton")
public class ClassicalMusic implements Music{
    private String track = "Hungarian Rhapsody";

    //@PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

   // @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong() {
        return track;
    }
}
