package com.inflearn.basic.beandefinition;

import com.inflearn.basic.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

class BeanDefinitionTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
//    GenericXmlApplicationContext ac = new GenericXmlApplicationContext("appConfig.xml");

    @Test
    @DisplayName("빈 설정 메타정보 확인")
    void findApplicationBean () {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for ( String beanDefinitionName : beanDefinitionNames ){
            BeanDefinition b = ac.getBeanDefinition(beanDefinitionName);
            if( b.getRole() == BeanDefinition.ROLE_APPLICATION){
                System.out.println("beanDefinitionNames = " + beanDefinitionNames + "\nbeanDefinition = " + b + "\n");
            }
        }
    }

}
