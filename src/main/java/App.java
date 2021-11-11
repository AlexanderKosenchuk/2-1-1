import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld beanSecond = (HelloWorld) applicationContext.getBean("helloworld");

        Cat beanCatOne = (Cat) applicationContext.getBean("cat");

        Cat beanCatTwo = (Cat) applicationContext.getBean("cat");

        boolean compareBeanHelloWorld = bean == beanSecond;
        System.out.println(compareBeanHelloWorld);

        boolean compareBeanCat = beanCatOne == beanCatTwo;
        System.out.println(compareBeanCat);
    }
}