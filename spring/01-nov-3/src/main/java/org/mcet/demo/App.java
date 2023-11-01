package org.mcet.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.scan("org.mcet");
        ctx.refresh();
        Book b=ctx.getBean(Book.class);
        System.out.println(b);
    }
}
