/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import org.joda.time.DateTime;
/**
 *
 * @author Ciaran
 */
public class Main {
     public static void main(String[] args) {
         
         Course ECE = new Course("ECE", new DateTime("2020-09-01"), new DateTime("2020-05-30"));
         
         Modules comps = new Modules("Comps", 387964);
         Modules elec = new Modules("elec", 182787);
         
         Student student1 = new Student("Mary", "Jo", "12/08/1997", 23, 1234);
         Student student2 = new Student("Bren", "Dan", "17/04/1998", 22, 1234);
         Student student3 = new Student("Barry", "Legnelle", "21/12/1996", 24, 1234);
         
         ECE.addModule(comps);
         ECE.addModule(elec);
         ECE.addStudent(student1);
         ECE.addStudent(student2);
         ECE.addStudent(student3);
         
         
         System.out.println(ECE);
         System.out.println(comps.toString());
         System.out.println(student1.toString());
         
     }
}
