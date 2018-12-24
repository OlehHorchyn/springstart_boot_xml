import components.Hammer;
import components.Saw;
import components.Tool;
import components.Worker;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        /// другий спосіб через xml реалізацію нашого  проекту з springstart

        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("appContext.xml");

        Worker bean = container.getBean("worker",Worker.class); // дістаємо нашого обєкта
        Tool tool = container.getBean("hammer",Hammer.class);
        bean.setTool(tool);
        System.out.println(bean);


    }
}
