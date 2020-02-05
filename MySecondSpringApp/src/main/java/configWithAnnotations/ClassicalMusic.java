package configWithAnnotations;

import org.springframework.stereotype.Component;

@Component("musicBean")
public class ClassicalMusic implements Music{
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}