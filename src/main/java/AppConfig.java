import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration                               //Класс с аннотацией @Configuration говорит о том, что он является источником определения бинов.
public class AppConfig {
 
    @Bean(name="helloworld")                     //по умолчанию Singleton
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name = "cat")
    @Scope("prototype")                         // создается новый объект при каждом запросе getCat()
    public Cat getCat() {
        Cat cat = new Cat();
        cat.setName("Беляш");
        return cat;
    }
}