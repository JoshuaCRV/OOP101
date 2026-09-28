/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angieluz cervania
 */
public class JavaEnvironmentSummary {

    public static void main(String[] args) {
        // Retrieve system properties
        String javaVersion = System.getProperty("java.version");
        String jvmName = System.getProperty("java.vm.name");
        String osName = System.getProperty("os.name");

        // Display student and environment info
        System.out.println("========== Java Environment Summary ==========");
        System.out.println("Student Name: Uriel Joshua V. Cervania");
        System.out.println("Program/Section: BSCSSE - TA21");
        System.out.println("==============================================");
        System.out.println("Java Version: " + javaVersion);
        System.out.println("JVM Name:     " + jvmName);
        System.out.println("OS Name:      " + osName);
        System.out.println("----------------------------------------------");

        // Display execution flow
        System.out.println("Execution Flow:");
        System.out.println(".java source -> javac compiler -> .class bytecode -> JVM -> output");
    }
}