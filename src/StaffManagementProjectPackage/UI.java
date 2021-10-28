package StaffManagementProjectPackage;

public class UI {

        public static void showMainMenu(){

            System.out.println("""
       ______________________________________________
                         Main Menu
       ______________________________________________  
       1. Employee Management
       2. Employee Statistics
       3. Employee Sort
       0. Exit application
       
       Please choose option:           """);
        }

        public static void showManagementMenu(){
            System.out.println("""
        _______________________________________________
                 Employee Management Menu
        _______________________________________________
        1. Register Employee
        2. Delete Employee
        3. Update Employee
        4. Search Employee By Name
        5. Search Employee By Id Number
        6. Search Employee By Department
        7. Show All Employees 
        0. Back To Main Menu
        
        Please choose: """);
        }

        public static void showStatisticsMenu(){
            System.out.println("""
        ________________________________________________
                  Employee Statistics Menu
        ________________________________________________
        1. Average Salary
        2. Average Salary Based On Department
        3. Maximum Salary
        4. Minimum salary
        5. Women Percentage
        6. Men Percentage On Department   
        7. Bonus For Different Professions
        0. Back To Main Menu  
                          
        Please choose: """);
        }

        public static void showSortMenu(){
            System.out.println("""
      _________________________________________________ 
                     Employee Sort Menu
      __________________________________________________      
      1. Employee Sort By First Name 
      2. Employee Sort By Last Name   
      3. Employee Sort By Salary Ascending Order
      4. Employee Sort By Salary Descending Order
      0. Back To Main Menu
      ___________________________________________________
      
      Please choose:  """);

        }

        public static void showUpdateMenu() {
            System.out.println("""
        ___________________________________________________
                               Update Menu
        ___________________________________________________
        1. Update Employee Name
        2. Update Employee Birthday
        3. Update Employee  Salary
        4. Update Employee Department                              
        0. Exit Update Menu
        
        Please choose: """);
        }

        public static void header(){
            System.out.println("""
        ________________________________________________________________________________________________
          ID          NAME                 BIRTHDAY               SALARY               DEPARTMENT
        ________________________________________________________________________________________________ """);

        }
        public static void footer(){
            System.out.println("________________________________________________________________________________________________\n\n");

        }
    }


