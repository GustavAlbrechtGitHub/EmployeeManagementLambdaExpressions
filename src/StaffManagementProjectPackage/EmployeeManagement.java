package StaffManagementProjectPackage;

import StaffManagementProjectPackage.EmployeeSubClassesPackage.*;
import static StaffManagementProjectPackage.Utilities.*;
import static StaffManagementProjectPackage.UI.*;
import static StaffManagementProjectPackage.MyMain.*;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class EmployeeManagement {

    static ArrayList<Employee> alEmployees = new ArrayList<>();

    public static void addEmployee(Employee e) {
        alEmployees.add(e);
    }

    public static void updateEmployee() {

        System.out.print("Please enter id:");
        int id = getIntInput();

        System.out.println(findEmployeeById(id));

        boolean updateLoop = true;

        while (updateLoop) {

            showUpdateMenu();

            String input = getStringInput();

            switch (input) {

                case "1" -> updateEmployeeNameById(id);
                case "2" -> updateEmployeeBirthdayById(id);
                case "3" -> updateEmployeeSalaryById(id);
                case "4" -> updateEmployeeDepartmentById(id);
                case "0" -> updateLoop = false;
                default -> System.out.println("Wrong input, please choose 1-4.");


            }
        }

    }

    public static void updateEmployeeNameById(int id) {
        System.out.println("New first name: ");
        String newFirstName = getStringInput();
        System.out.println("New last name: ");
        String newLastName = getStringInput();

        Employee e = findEmployeeById(id);
        e.setFirstname(newFirstName);
        e.setLastname(newLastName);

        System.out.println("Name has been updated!");

        getStringInput();

    }

    public static void updateEmployeeBirthdayById(int id) {
        System.out.println("New Birthday: ");

        String newBirthday = getStringInput();

        Employee e = findEmployeeById(id);

        e.setBirthday(newBirthday);

        System.out.println("Birthday has been updated!");

        getStringInput();


    }

    public static void updateEmployeeSalaryById(int id) {
        System.out.println("New Salary: ");

        double newSalary = getDoubleInput();

        Employee e = findEmployeeById(id);

        e.setSalary(newSalary);

        System.out.println("Salary has been updated!");

        getStringInput();
    }

    public static void updateEmployeeDepartmentById(int id) {

        String department = choiceOfDepartment();

        Employee e = findEmployeeById(id);
        e.setDepartment(department);

        System.out.println("Department has been updated!");

        getStringInput();


    }

    public static void printFixStringOutput(Employee e){
        UI.header();
    System.out.println("  " +
    fixString(6, String.valueOf(e.getId())) +
    fixString(22, e.getFirstname() + " " + e.getLastname()) +
    fixString(22, e.getBirthday()) +
    fixString(19, String.valueOf(e.getSalary())) +
    fixString(18, e.getDepartment()));
        UI.footer();
    }

    public static Employee findEmployeeById(int id) {
        for (Employee e : alEmployees) {

            if (e.getId() == id)
                return e;
        }
        return null;
    }

    public static void deleteEmployeeById() {
        System.out.println("Please enter id: ");
        int id = getIntInput();

        Employee e = findEmployeeById(id);
        alEmployees.remove(e);

        System.out.println(e.toString() + " has been removed!");

        getStringInput();


    }

    public static void showAllEmployees() {
        UI.header();

        for (Employee e : alEmployees) {
            System.out.println("  " +
                    fixString(6, String.valueOf(e.getId())) +
                    fixString(22, e.getFirstname() + " " + e.getLastname()) +
                    fixString(22, e.getBirthday()) +
                    fixString(19, String.valueOf(e.getSalary())) +
                    fixString(18, e.getDepartment()));
        }
        UI.footer();
        System.out.println("\n Press any key to continue.");
        getStringInput();


    }

    public static void searchEmployeeName() {

        boolean foundLoop = false;

        System.out.println("Search employee by first name: ");

        String search = getStringInput();

        for (Employee alEmployee : alEmployees) {
            if (search.equalsIgnoreCase(alEmployee.getFirstname())) {
                foundLoop = true;
                System.out.println("Your search gave a hit for: " + alEmployee);


            }
        }
        if (!foundLoop) {
            System.out.println("Search was not found.");
        }

        getStringInput();

    }

    public static void searchEmployeeIdNumber() {
        boolean foundLoop = false;

        try {
            System.out.print("Search employee id number: ");

            int search = sc.nextInt();
            sc.nextLine();

            for (Employee alEmployee : alEmployees) {

                if (alEmployee.getId() == search) {
                    System.out.println("Your search gave a hit for employee: " + alEmployee);
                    foundLoop = true;

                }
            }
            if (!foundLoop) {

                System.out.println("Search was not found.");


            }
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input, Please input number.");
        }
        getStringInput();
    }

    public static void searchByDepartment() {


        String department = choiceOfDepartment();

        boolean foundLoop = false;

        for (Employee e: alEmployees ) {


            if (department.equalsIgnoreCase(e.getDepartment())) {
                foundLoop = true;
                System.out.println("Employees in this department: " + e);
            }

        }
        if (!foundLoop ){
            System.out.println("No employee in this department");

        }
        getStringInput();
    }

    public static void loadListWithEmployees() {


        Chief c1 = new Chief(1, "Gustav", "Albrecht", "199409073014", 100000, "Chief");
        Technician t1 = new Technician(2, "Linda", "Danielsson", "199403051245", 45000, "Technician");
        WebDesigner w1 = new WebDesigner(3, "Rebecka", "Strand", "199205062468", 50000, "Webdesigner");
        Secretary s1 = new Secretary(4, "Sara", "Svensson", "199003203586", 30000, "Secretary");
        Marketer m1 = new Marketer(5, "Julian", "Amandusson", "199605103576", 70000, "Marketer");
        Developer d1 = new Developer(6, "Adrian", "Juholt", "199208043095", 75000, "Developer");
        DBAdmin da1 = new DBAdmin(7, "Julia", "Arvidsson", "199006064262", 80000, "DBAdmin");
        DBAdmin da2 = new DBAdmin(8, "Andreas", "Andersson", "199004063174", 60000, "DBAdmin");

        alEmployees.add(c1);
        alEmployees.add(t1);
        alEmployees.add(w1);
        alEmployees.add(s1);
        alEmployees.add(m1);
        alEmployees.add(d1);
        alEmployees.add(da1);
        alEmployees.add(da2);

    }

    public static void chooseDepartment(){

        boolean departmentLoop = true;

        while (departmentLoop) {

            System.out.println("In what department do you want to register Employee? ");
            System.out.println("1.DBAdmin, 2.Developer, 3.Technician, 4.Marketing, 5.Secretary, 6.Web Designer 7. Chief");
            String choiceDepartment = getStringInput();


            switch (choiceDepartment) {

                case "1" -> {
                    addEmployee(registerDBAdmin());
                    departmentLoop = false;
                }

                case "2" -> {
                    addEmployee(registerDevelepor());
                    departmentLoop = false;
                }

                case "3" -> {
                    addEmployee(registerTechnician());
                    departmentLoop = false;
                }

                case "4" -> {
                    addEmployee(registerMarketer());
                    departmentLoop = false;
                }

                case "5" -> {
                    addEmployee(registerSecretary());
                    departmentLoop = false;
                }

                case "6" -> {
                    addEmployee(registerWebDesigner());
                    departmentLoop = false;
                }

                case "7" -> {
                    addEmployee(registerChief());
                    departmentLoop = false;
                }

                default -> {
                    System.out.println("Wrong input, please choose option 1-7 : ");
                    departmentLoop = true;
                }


            }

        }
        departmentLoop = false;




    }

    public static String choiceOfDepartment(){

        boolean loop = true;


        while (loop) {
            System.out.println("Please enter department: ");
            System.out.println("1.DBAdmin, 2.Developer, 3.Technician, 4.Marketing, 5.Secretary, 6.Web Designer 7. Chief");
            String choice = getStringInput();


            switch (choice) {
                case "1" -> {
                    loop = false;
                    return "DBAdmin";
                }
                case "2" -> {
                    loop = false;
                    return "Developer";
                }
                case "3" -> {
                    loop = false;
                    return "Technician";
                }
                case "4" -> {
                    loop = false;
                    return "Marketing";
                }
                case "5" -> {
                    loop = false;
                    return "Secretary";
                }
                case "6" -> {
                    loop = false;
                    return "Webdesigner";
                }
                case "7" -> {
                    loop = false;
                    return "Chief";
                }
                default -> System.out.println("Wrong input, Please choose option 1-7");
            }

        }

        return null;
    }



}

