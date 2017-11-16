package SprongCore.SpringDependencyInjection;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.dependancyInjection.Controller.Communication;
public class App 
{
    public static void main( String[] args )
    {
    	   AbstractApplicationContext context = new ClassPathXmlApplicationContext("springConfigration.xml");
           Communication app = (Communication)context.getBean("Communication");
           app.communicate();
    }
}