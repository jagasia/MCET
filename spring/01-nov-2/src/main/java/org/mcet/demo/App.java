package org.mcet.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        Mathematics m1=new Mathematics();
//        m1.setNo1(2);
//        m1.setNo2(3);
//        m1.sum();
//        System.out.println(m1.getResult());
        
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
//        Mathematics m2 = ctx.getBean(Mathematics.class);
////        m2.product();
//        m2.sum();
//        System.out.println(m2.getResult());
        
        Book b1=(Book) ctx.getBean("b1");
        System.out.println(b1);
//        System.out.println(b1.getId());
//        System.out.println(b1.getTitle());
//        System.out.println(b1.getAuthor().getFirstName());
//        System.out.println(b1.getAuthor().getLastName());
        
    }
}
