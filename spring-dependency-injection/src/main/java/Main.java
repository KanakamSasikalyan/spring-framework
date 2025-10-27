import io.di.spring.Atom;
import io.di.spring.Element;
import io.di.spring.JavaConfig;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {

        /*System.out.println("Spring IOC -- BeanFactory!!");
        //Spring IOC Container --> BeanFactory
        Resource resource = new ClassPathResource("app-context.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        Atom atom = (Atom) beanFactory.getBean("Atom");
        System.out.println("Atom Bean Created --- "+ atom);

        Element element = (Element) beanFactory.getBean("Element");
        System.out.println("Element Bean Created --- "+ element);


        //Spring IOC --> BeanDefinitionRegistry
        System.out.println("Spring IOC -- BeanDefinitionReader!!");
        Resource resource = new ClassPathResource("app-context.xml");

        BeanDefinitionRegistry beanFactory = new DefaultListableBeanFactory();
        BeanDefinitionReader beanReader = new XmlBeanDefinitionReader(beanFactory);
        beanReader.loadBeanDefinitions(resource);

        Atom atom = (Atom) ((DefaultListableBeanFactory) beanFactory).getBean("Atom");
        System.out.println("Atom Bean Created --- "+ atom);

        Element element = (Element) ((DefaultListableBeanFactory) beanFactory).getBean("Element");
        System.out.println("Element Bean Created --- "+ element);

        //Spring IOC --> ApplicationContext

        ApplicationContext appContext = new ClassPathXmlApplicationContext("new-app-context.xml");
        Atom atom = (Atom) appContext.getBean("Atom");
        System.out.println("Atom Bean Created --- "+ atom);

        Element element = (Element) appContext.getBean("Element");
        System.out.println("Element Bean Created --- "+ element);

         */

        //Referencing Beans

//        ApplicationContext appContext = new ClassPathXmlApplicationContext("new-app-context.xml");
//        Element element = (Element) appContext.getBean("Element");
//        System.out.println("Element Bean Created -- "+ element);


        //Bean -- Java Config

        ApplicationContext appContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        Element element = (Element) appContext.getBean("elementBean");
        System.out.println("Element Bean Created -- "+ element);
    }
}
