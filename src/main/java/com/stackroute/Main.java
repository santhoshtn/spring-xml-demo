package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args){
//      //Actor Using Bean Factory
//
//      BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
//      Actor actor=(Actor) beanFactory.getBean("actor1");
//      System.out.println(actor);
//
//      //Movie Using Bean Factory
//
//      Movie movie=(Movie) beanFactory.getBean("movie1");
//      System.out.println(movie);
//
//      //Using BeanDefinitionRegistry and BeanDefinitionReader
//
//      BeanDefinitionRegistry beanDefinitionRegistry=new DefaultListableBeanFactory();
//      BeanDefinitionReader beanDefinitionReader=new XmlBeanDefinitionReader(beanDefinitionRegistry);
//      beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
//      Actor actor2= (Actor) ((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("actor1");
//      System.out.println(actor2);

      //Using ApplicationContext

      ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
      Movie movie=(Movie) context.getBean("movie1");
      System.out.println(movie);
      Movie movie1=(Movie) context.getBean("movie2");
      System.out.println(movie1);

      Movie movie2=(Movie) context.getBean("movie3");
      System.out.println(movie2);

      Movie movie_1=(Movie) context.getBean("movie1");
      System.out.println(movie_1);
      System.out.println(movie==movie_1);

    }

}
