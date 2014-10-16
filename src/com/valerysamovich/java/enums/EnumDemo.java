/**
 * @file EnumDemo.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 10/15/2014
 */

package com.valerysamovich.java.enums;

/**
 * Enum showing topics covered under Tutorials
 */
enum Tutorials {
    topic1, topic2, topic3;
}

public class EnumDemo {

    public static void main(String[] args) {
    
        /**
         * The java.lang.Enum.compareTo() method compares this enum with the 
         * specified object for order.Enum constants are only comparable to 
         * other enum constants of the same enum type. 
         * 
         * public final int compareTo(E o)
         * 
         * o - This is object to be compared
         */
        
        Tutorials t1, t2,t3;
        
        t1 = Tutorials.topic1;
        t2 = Tutorials.topic2;
        t3 = Tutorials.topic3;
    }

}
