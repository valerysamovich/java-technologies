package org.samovich.technologies.basics.concepts.features.statements.exampleif;

public class IfExample {

    public static void main(String[] args) {
        
        int testScore = 81;
        String grade = "";
        
        if (testScore >= 50) {
            grade = "pass";
        }
        
        System.out.println("Grade: " + grade);

    }

}
