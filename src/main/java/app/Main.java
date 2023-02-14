package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
//        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        Calculator calculator = context.getBean(Calculator.class);
        System.out.println(calculator);
    }
}
