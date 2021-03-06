/**
 * @file NonStaticCounter.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/01/05
 */

package org.samovich.technologies.basics.concepts.classes.staticex.counter;

public class NonStaticCounter {

    // Will get memory when instance is created.
    int count = 0;

    NonStaticCounter() {
        count++;
        System.out.println(count);
    }
}
