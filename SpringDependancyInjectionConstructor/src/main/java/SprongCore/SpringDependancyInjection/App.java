package SprongCore.SpringDependancyInjection;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.denpendancyInjection.model.Communication;

public class App 
{
    public static void main( String[] args )
    {
    	 AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
         Communication app = (Communication)context.getBean("communication");
         app.communicate();
    }
}
