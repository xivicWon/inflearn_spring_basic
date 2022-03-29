package com.inflearn.basic.beanfind;

import com.inflearn.basic.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class ApplicationContextInfoTest {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
    
    
    @Test
    @DisplayName("모든 빈 조회")
    void findAllBean(){
        String[] beanDefinditionNames = ac.getBeanDefinitionNames();

        for (String beanDefinditionName : beanDefinditionNames) {
            Object bean = ac.getBean(beanDefinditionName);
            System.out.println("name = " + beanDefinditionName + " bean  = " + bean);
        }
    }

    @Test
    @DisplayName("애플리케이션 빈 조회")
    void findApplicationBean(){
        String[] beanDefinditionNames = ac.getBeanDefinitionNames();

        for (String beanDefinditionName : beanDefinditionNames) {
            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinditionName);

            if(beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION){
                Object bean = ac.getBean(beanDefinditionName);
                System.out.println("name = " + beanDefinditionName + " object  = " + bean);
            }
        }
    }
}
