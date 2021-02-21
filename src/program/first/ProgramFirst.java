/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.first;

/**
 *
 * @author MominAssi
 */
public class ProgramFirst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Person persons[] = {
          new Student ("asdas","asdasd",32.25),
          new Employee("dsad","asdasd",252.25),
          new Student ("dsad","asds",88.5)
      };
      persons.toString();
        show(persons);
        
        
       /*
        Double arr1[] = {3.0,2.0,6.2,2.0,4.0};
    show(arr1);
*/
    }
    public static <T> void show(T data[]){
        for(T d : data){
            System.out.println(d);
        }
    }
}
