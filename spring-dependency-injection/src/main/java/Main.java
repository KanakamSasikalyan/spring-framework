import io.di.spring.Atom;
import io.di.spring.Element;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {

        System.out.println("Spring IOC -- BeanFactory!!");
        //Spring IOC Container --> BeanFactory
        Resource resource = new ClassPathResource("app-context.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        Atom atom = (Atom) beanFactory.getBean("Atom");
        System.out.println("Atom Bean Created --- "+ atom);

        Element element = (Element) beanFactory.getBean("Element");
        System.out.println("Element Bean Created --- "+ element);
     }
}
