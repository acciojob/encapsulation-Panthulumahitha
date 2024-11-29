package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly(); // Step 3: Create an object of RWOnly class

        // Step 4: Try to access and set the private variable directly
        // obj.name = "John"; // Error: 'name' has private access in RWOnly
        // System.out.println(obj.name); // Error: 'name' has private access in RWOnly
         // Step 6: Set value using setter
        obj.setName("John");

        // Step 6: Access value using getter
        System.out.println(obj.getName()); // Output: John
    }
}
