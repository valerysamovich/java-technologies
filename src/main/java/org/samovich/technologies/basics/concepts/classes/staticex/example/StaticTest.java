package org.samovich.technologies.basics.concepts.classes.staticex.example;

public class StaticTest {

    public static void main(String[] args) {
        
        StaticExample obj = new StaticExample();
        obj.staticMethod();
        obj.staticMethod();
        StaticExample.staticMethod();
        obj.nonStaticMethod();
        obj.nonStaticMethod();
        System.out.println(" ");
        
        StaticExample obj2 = new StaticExample();
        obj2.staticMethod();
        obj.staticMethod();
        obj2.nonStaticMethod();
        obj2.nonStaticMethod();
    }

}
