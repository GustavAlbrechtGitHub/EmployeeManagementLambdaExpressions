package StaffManagementProjectPackage;

import java.util.Collections;
import java.util.Comparator;


import static StaffManagementProjectPackage.EmployeeManagement.*;
import static StaffManagementProjectPackage.Utilities.*;

public class SortManagement {

        public static void sortByFirstName(){

            UI.header();

            alEmployees.stream().sorted(Comparator.comparing(Employee::getFirstname))
                    .forEach(e->System.out.println("  " +
                            fixString(6, String.valueOf(e.getId())) +
                            fixString(22, e.getFirstname() + " " + e.getLastname()) +
                            fixString(22, e.getBirthday()) +
                            fixString(19, String.valueOf(e.getSalary())) +
                            fixString(18, e.getDepartment())));

            UI.footer();

            System.out.println("\n Press any key to continue.");
            getStringInput();


        }


        public static void sortByLastName(){


            UI.header();

            alEmployees.stream().sorted(Comparator.comparing(Employee::getLastname))
                    .forEach(e->System.out.println("  " +
                            fixString(6, String.valueOf(e.getId())) +
                            fixString(22, e.getFirstname() + " " + e.getLastname()) +
                            fixString(22, e.getBirthday()) +
                            fixString(19, String.valueOf(e.getSalary())) +
                            fixString(18, e.getDepartment())));

            UI.footer();
            System.out.println("\n Press any key to continue.");
            getStringInput();




        }


        public static void sortSalaryAscendingOrder(){


            UI.header();

            alEmployees.stream().sorted((e1, e2) -> Double.compare( e2.getSalary(), e1.getSalary()  ) )
                    .forEach(e->System.out.println("  " +
                            fixString(6, String.valueOf(e.getId())) +
                            fixString(22, e.getFirstname() + " " + e.getLastname()) +
                            fixString(22, e.getBirthday()) +
                            fixString(19, String.valueOf(e.getSalary())) +
                            fixString(18, e.getDepartment())));

            UI.footer();


            System.out.println("\n Press any key to continue.");
            getStringInput();




        }
        public static void sortSalaryDescendingOrder(){



            UI.header();


            alEmployees.stream().sorted(Comparator.comparingDouble(Employee::getSalary))
                    .forEach(e->System.out.println("  " +
                            fixString(6, String.valueOf(e.getId())) +
                            fixString(22, e.getFirstname() + " " + e.getLastname()) +
                            fixString(22, e.getBirthday()) +
                            fixString(19, String.valueOf(e.getSalary())) +
                            fixString(18, e.getDepartment())));

            UI.footer();

            System.out.println("\n Press any key to continue.");
            getStringInput();


        }

}


