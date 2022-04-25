package com.inflearn.basic;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HelloLombok {
    
    private String name;
    private int age ;
    
    
    public static void main(String[] args){
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setAge(11);
        helloLombok.setName("호호호호");
        System.out.println("helloLombok.getName() = " + helloLombok.getName());        
    }
}
