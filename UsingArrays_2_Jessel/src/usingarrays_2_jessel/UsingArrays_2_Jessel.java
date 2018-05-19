/*
Jessel -  // in the previous program - we declared an array and also stated the size ... = new int[10]; 
    // but we do have other options     
    // take a look at the following line - an array is declared and the values are loaded at the point of 
    // the array being instantiated 
*/
package usingarrays_2_jessel;
  import java.lang.Math; 
/**
 *
 * @author mitchellpallatte
 */
public class UsingArrays_2_Jessel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
  {
     
    // in the previous program - we declared an array and also stated the size ... = new int[10]; 
    // but we do have other options     
    // take a look at the following line - an array is declared and the values are loaded at the point of 
    // the array being instantiated 
    
    String[] strNames = new String[]{"John", "Jack", "Jane", "Jake"};
    // in this version - we don't need to state the number of items ... but because the number of items is not stated 
    // we actually need to have that to know how to handle the loop (how many times should the loop repeat?)
    
    int intNumberOfCellsInNames = strNames.length; //length is an integer property within the Array class // so no brackets () 
    
    
    System.out.println("Number of names in the array is " + intNumberOfCellsInNames); 
    
    int[] intNum = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    
    int intNumberOfCellsInNum = intNum.length; 
    System.out.println("Number of numbers in the array is " + intNumberOfCellsInNum); 
    //------------------------------------------------------------------------------------------------------------------------
    System.out.println();
    // so how will the integer variable that has the number of cells be used
    // also take note and remember why I am subtracting 1 below - because the index is from 0 to 3 - which makes 4 cells 
    for (int intCount = 0; intCount <= (intNumberOfCellsInNames -1); intCount++){
        System.out.print(strNames[intCount] + "  ");
    }
    //------------------------------------------------------------------------------------------------------------------------
    // Now lets consider something interesting 
    // an object is an instance of a class 
    
    Student stud1 = new Student(); 
    stud1.setStudentNumber("123456");
    stud1.setName("Joesph");
    stud1.setCourse("Diploma IT");
    
    // we know the above code - create an object - call the set methods - pass a value 
    // and then use the get method to print and use the value in some way 
    
    // so if I wanted to create more than one student - I would need to create that many number of objects 
    // but now trying to refer to "each student" (stud1, stud2, stud3, stud4, etc. ...) is going to be a long process 
    // also makes much more work ... 
    // just think about it - sure - each one of you might come up with better ways to handle the data 
    // through the use of methods (procedures and functions) - through parameters  
    // 
    // I just want to offer a different solution - since we are using arrays here 
    // I want to create an array of Student objects ... 
    
    Student[] arrStud = new Student[3];     // how do we allow it to recieve Data input
    
    arrStud[0] = new Student();
    arrStud[0].setStudentNumber("11111");
    arrStud[0].setName("Jennifer");
    arrStud[0].setCourse("IT");
    
    arrStud[1] = new Student();
    arrStud[1].setStudentNumber("22222");
    arrStud[1].setName("Jackie");
    arrStud[1].setCourse("IT");
    
    arrStud[2] = new Student();
    arrStud[2].setStudentNumber("33333");
    arrStud[2].setName("Jessie");
    arrStud[2].setCourse("IT");
    
    // take note of where the index is used 
    // also - I could use a loop to read in the values from the user and then load the values into the array 
    // it is the index that will help me to see each cell 
    // n.b. note that each cell doesn't contain just one value - but actually contains an instance of the class Student (an object)
    
    for (int intCount2 = 0; intCount2 <= 2; intCount2++){
        System.out.println("Student #: " + arrStud[intCount2].getStudentNumber() + "\n" + 
                           "Name     : " + arrStud[intCount2].getName() + "\n" + 
                           "Course   : " + arrStud[intCount2].getCourse());
    }
  }
}
//==================================================================================
public class Student
{
  //private fields (used as the properties of the class
  private String strStudentNumber;
  private String strName;
  private String strCourse; 
   
  //get and set methods for private fields 
  public void setStudentNumber(String strNewStudentNumber){
    strStudentNumber = strNewStudentNumber; 
  }
  public String getStudentNumber(){
    return strStudentNumber; 
  }
  //---------------------------------------------------------
  public void setName(String strNewName){
    strName = strNewName; 
  }
  public String getName(){
    return strName; 
  }
  //---------------------------------------------------------
  public void setCourse(String strNewCourse){
    strCourse = strNewCourse; 
  }
  public String getCourse(){
    return strCourse; 
  }
  //---------------------------------------------------------
}
    }
    
}
