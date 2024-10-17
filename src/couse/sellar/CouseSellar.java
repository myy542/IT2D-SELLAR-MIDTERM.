
package couse.sellar;

import java.util.Scanner;

public class CouseSellar {

   
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
       String response = null;
       
       do{
        System.out.println("1.ADD");
        System.out.println("2. VIEW");
        System.out.println("3. UPDATE");
        System.out.println("4. DELETE");
        System.out.println("5. EXIT");
       
       
        System.out.print("Enter Action:");
        int action = sc.nextInt();
       
      CouseSellar course= new CouseSellar();
        switch (action){
            case 1:
               course.addecourse();
               
             break;
            case 2:
           course.viewcourse();
           
            break;
            case 3:
               
            course.viewcourse();
            course.updatcourse();
            course.viewcourse();  
           
           
            break;
            case 4:
               
        course.viewcourse();
          course.deletecourse();
           course.viewcourse();

         System.out.print("Do you want to continue? (yes/no):");
            response = sc.next();
        }while(response.equalsIgnoreCase("yes"));
        System.out.println("Thankyou,See you soonest");
       
       
   

    public void addCourse(){
        Scanner sc =  new Scanner(System.in);
        config conf = new config();
        System.out.print("Course Name:");
        String fname= sc.next();
         System.out.print("Course Code:");
        String code= sc.next();
         System.out.print("Course credits:");
        String credits= sc.next();
        System.out.print("Course Semester:");
        String semester= sc.next();
        System.out.print("Course Year:");
        String year= sc.next();
       
         String sql = "INSERT INTO tbl_course(c_name, c_code, c_credits, c_semester, c_year ) VALUES (?, ?, ?, ?, ?)";
      conf.addcourse(sql, name, code, credits, semester, year);
       
    }private void viewCourse() {
       config conf = new config();
        String votersQuery = "SELECT * FROM tbl_course";
        String[] votersHeaders = {"Course_Id", " Name", "Code", "Credits", "Semester", "Year"};
        String[] votersColumns = {"e_id", "e_fname", "e_lname", "e_position"};

        conf.viewRecords(votersQuery, votersHeaders, votersColumns);
           
       
       
    }

    private void updateCourse() {
        Scanner sc = new Scanner (System.in);
        config conf = new config();
       
        System.out.println("Enter the id to update:");
         int id = sc.nextInt();
         
         System.out.print(" New First Name:");
        String fname = sc.next();
        System.out.print("New Last Nane:");
        String lname = sc.next();
        System.out.print("New Position");
        String position = sc.next();
       
        String sql = " UPDATE t_employee SET e_fname = ?, e_lname = ?, e_position = ?, WHERE e_id = ?";
   
        conf.updatecourse(sql,fname,lname,position, id);
       
       
    }

    private void deleteCourse() {
      Scanner sc = new Scanner(System.in);
       System.out.print("Enter the id to delete:");
       
        int id= sc.nextInt();
       
          String qry = "DELETE FROM tbl_course WHERE e_id = ?";
         
        config conf = new config();
        conf.deleteRecord(qry,id);
        
    }

    private void addecourse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewcourse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void updatcourse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void deletecourse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
