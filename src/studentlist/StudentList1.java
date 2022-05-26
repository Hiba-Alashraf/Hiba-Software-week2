/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package studentlist;

import java.util.Scanner;

/**
 *
 * @author Hibaa
 */
public class StudentList1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student[] studentlist = new Student[3];
        
        Scanner input= new Scanner(System.in);
          for(int i=0;i<studentlist.length;i++){
        System.out.println("Enter a name");
     studentlist[i]= new Student();
     studentlist[i].setName(input.nextLine());     
    }
          for(Student s : studentlist){
          System.out.println(s.getName());
           System.out.println(s.getName());}
        
 
    }

}
