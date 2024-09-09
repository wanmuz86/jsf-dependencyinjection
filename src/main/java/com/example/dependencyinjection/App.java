package com.example.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.dependencyinjection.config.AppConfig;
import com.example.dependencyinjection.service.MyService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new 
        		AnnotationConfigApplicationContext(AppConfig.class);
        MyService service = context.getBean(MyService.class);
        service.performService();
        
        // (AnnotationConfigApplicationContext) means casting 
        // indicate that context is of type AnnotationConfigApplicationContext
        
        // Other than Java, the way to create Bean is using XML
        // And groovy 
        
        ((AnnotationConfigApplicationContext)context).close();
    }
}
