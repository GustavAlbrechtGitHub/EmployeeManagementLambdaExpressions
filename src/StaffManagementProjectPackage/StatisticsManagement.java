package StaffManagementProjectPackage;

import java.util.DoubleSummaryStatistics;


import static StaffManagementProjectPackage.EmployeeManagement.alEmployees;
import static StaffManagementProjectPackage.EmployeeManagement.choiceOfDepartment;
import static StaffManagementProjectPackage.Utilities.getStringInput;


public class StatisticsManagement {
    static DoubleSummaryStatistics salaryStatistics = alEmployees.stream().map(Employee::getSalary).mapToDouble(e -> e).summaryStatistics();

    public static void menPercentageDepartment() {

     try {
         final String department = choiceOfDepartment();


         double numberOfMen = alEmployees.stream()
                 .filter(e -> e.getBirthday().charAt(10) % 2 == 1)
                 .filter(e -> e.getDepartment().equalsIgnoreCase(department))
                 .count();
         double totalOnDepartment = alEmployees.stream().filter(e -> e.getDepartment().equalsIgnoreCase(department)).count();

         System.out.println(totalOnDepartment);
         System.out.println(numberOfMen);

         double menPercentage = (numberOfMen / totalOnDepartment) * 100;

         System.out.println("Percentage of men is: " + menPercentage + "% at the " + department + " department!");

     } catch (StringIndexOutOfBoundsException e) {
         System.out.println("Incorrect input of birthday, please update in update birthday option.");
     }

        getStringInput();
    }

    public static void bonusInDepartment() {
        String department = choiceOfDepartment();

        alEmployees.stream().filter(e -> e.getDepartment().equalsIgnoreCase(department))
                        .forEach(e->e.employeeBonus());




        getStringInput();

    }

    public static void womenPercentage() {



        try {

           double numberOfWomen = alEmployees.stream().filter(e -> e.getBirthday().charAt(10) % 2 == 0).count();


            double womenPercentage = (numberOfWomen / alEmployees.size()) * 100;
            System.out.println("Percentage of women is: " + womenPercentage + "%" + " at your company!");

        }
        catch (StringIndexOutOfBoundsException e) {
        System.out.println("Incorrect input of birthday, please update in update birthday option.");
    }

        getStringInput();

    }

    public static void averageSalary() {



           System.out.println("The average salary is: " + salaryStatistics.getAverage() + " kr");

             getStringInput();


    }

    public static void averageSalaryDepartment() {



        String department = choiceOfDepartment();

        //count endast antal

        DoubleSummaryStatistics departmentSalary = alEmployees.stream().filter(e -> e.getDepartment().equalsIgnoreCase(department))
                .map(e -> e.getSalary()).mapToDouble(e -> e).summaryStatistics();



        System.out.println("The average salary is: " + departmentSalary.getAverage() + " kr" + " at " + department + " department");


        getStringInput();
    }

    public static void maximumSalary() {

        System.out.println("The highest salary is: " + salaryStatistics.getMax() + " kr");

        getStringInput();



    }

    public static void minimumSalary() {

        System.out.println("The highest salary is: " + salaryStatistics.getMin() + " kr");

        getStringInput();
    }


}

