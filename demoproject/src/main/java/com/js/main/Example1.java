package com.js.main;

import com.js.beans.Vehicle;
import com.js.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle name from non-spring context is: " + vehicle.getName());
        /*
        The var keyword was introduced in Java 10. Type inference is used in
        var keyword in which it detects automatically the datatype of a variable
        based on the surrounding context.
        * */

        /* J2EE 1999 - Java EE 2006 - Jakarta Enterprise Edition 2019 */

        /* Spring Core Leverages the Jakarta EE - Spring -2004 */

        /* Loose Coupling - Spring Framework */

        /* xml config, classPath config, Annotation config */

        /* AnnotationConfigApplicationContext is the implementation class of ApplicationContext Interface (which is more advanced compared to BeanFactory).
        AnnotationConfigApplicationContext will act as IOC container (Inversion of Control.)
        Principle- dependency injection (DI)
        context - memory locations of Bean objects
        Bean - POJO class maintained by IOC container
        SpEl- Bean properties/methods invocation operations*/
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());

        /*
        We don’t need to do any explicit casting while fetching a bean from context.
        Spring is smart enough to look for a bean of the type you requested in its context.
        If such a bean doesn’t exist,Spring will throw an exception.
        * */
        String hello = context.getBean(String.class);
        System.out.println("String value from Spring Context is: " + hello);
        Integer num = context.getBean(Integer.class);
        System.out.println("Integer value from Spring Context is: " + num);
    }
}
