package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        GetSetStudent alex = new GetSetStudent();

        alex.setName("Alex");
        alex.setNumberOfCredits(1);
        alex.setGpa(4.0);
        System.out.println(alex.getName());
    }
}
