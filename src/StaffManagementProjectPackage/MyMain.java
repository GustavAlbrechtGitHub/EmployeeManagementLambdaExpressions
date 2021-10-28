package StaffManagementProjectPackage;

import StaffManagementProjectPackage.EmployeeSubClassesPackage.*;

import static StaffManagementProjectPackage.EmployeeManagement.*;
import static StaffManagementProjectPackage.UI.*;
import static StaffManagementProjectPackage.Utilities.*;
import static StaffManagementProjectPackage.SortManagement.*;
import static StaffManagementProjectPackage.StatisticsManagement.*;



    public class MyMain {


        static boolean mainLoop = true;
        static boolean managementLoop = true;
        static boolean statisticsLoop = true;
        static boolean sortLoop = true;

        public static void main(String[] args) {

            loadListWithEmployees();

            while (mainLoop) {

                managementLoop = true;
                statisticsLoop = true;
                sortLoop = true;

                runEmployeeManagementProgram();
            }
        }


        private static void runEmployeeManagementProgram() {

            showMainMenu();

            String choice = getStringInput();

            switch (choice) {

                case "1" -> {
                    while (managementLoop) {
                        employeeManagement();
                    }
                }
                case "2" -> {
                    while (statisticsLoop) {
                        employeeStatistics();
                    }
                }
                case "3" -> {
                    while (sortLoop) {
                        employeeSortManagement();
                    }
                }
                case "0" -> mainLoop = false;
                default -> System.out.println("Wrong input, please choose 1-2");

            }
        }

        private static void employeeManagement() {

            showManagementMenu();

            String choice = getStringInput();

            switch (choice) {

                case "1" -> chooseDepartment();
                case "2" -> deleteEmployeeById();
                case "3" -> updateEmployee();
                case "4" -> searchEmployeeName();
                case "5" -> searchEmployeeIdNumber();
                case "6" -> searchByDepartment();
                case "7" -> showAllEmployees();
                case "0" -> managementLoop = false;
                default -> System.out.println("Wrong input, please choose 1-6");
            }
        }

        public static Chief registerChief() {

            Chief c = new Chief();

            c = (Chief) fillEmployee(c);

            c.setDepartment("Chief");

            System.out.println("Chief has been added!");

            getStringInput();

            return c;
        }

        public static WebDesigner registerWebDesigner() {

            WebDesigner w = new WebDesigner();

            w = (WebDesigner) fillEmployee(w);

            w.setDepartment("WebDesigner");


            System.out.println("WebDesigner has been added!");

            getStringInput();

            return w;
        }

        public static Secretary registerSecretary() {

            Secretary s = new Secretary();

            s = (Secretary) fillEmployee(s);

            s.setDepartment("Secretary");

            System.out.println("Secretary has been added!");

            getStringInput();

            return s;
        }

        public static Marketer registerMarketer() {

            Marketer m = new Marketer();

            m = (Marketer) fillEmployee(m);

            m.setDepartment("Marketer");

            System.out.println("Marketer has been added!");

            getStringInput();

            return m;

        }

        public static Technician registerTechnician() {
            Technician t = new Technician();


            t = (Technician) fillEmployee(t);

            t.setDepartment("Technician");


            System.out.println("Technician has been added!");

            getStringInput();

            return t;
        }

        public static Developer registerDevelepor() {

            Developer d = new Developer();

            d = (Developer) fillEmployee(d);

            d.setDepartment("Developer");


            System.out.println("Developer has been added!");

            getStringInput();

            return d;

        }

        private static Employee fillEmployee(Employee d) {
            System.out.print("Enter First Name: ");
            d.setFirstname(getStringInput());

            System.out.print("Enter Last Name: ");
            d.setLastname(getStringInput());

            System.out.print("Enter birthday(YYYYMMDD****): ");
            d.setBirthday(getStringInput());

            System.out.print("Enter salary: ");
            d.setSalary(getDoubleInput());

            return d;
        }

        public static DBAdmin registerDBAdmin() {
            DBAdmin da = new DBAdmin();

            da = (DBAdmin) fillEmployee(da);

            da.setDepartment("DBAdmin");

            System.out.println("DBAdmin has been added!");

            getStringInput();


            return da;

        }

        private static void employeeStatistics() {

            showStatisticsMenu();

            String input = getStringInput();

            switch (input) {
                case "1" -> averageSalary();
                case "2" -> averageSalaryDepartment();
                case "3" -> maximumSalary();
                case "4" -> minimumSalary();
                case "5" -> womenPercentage();
                case "6" -> menPercentageDepartment();
                case "7" -> bonusInDepartment();
                case "0" -> statisticsLoop = false;
                default -> System.out.println("Wrong input, please choose 1-6");
            }
        }

        private static void employeeSortManagement() {

            showSortMenu();

            String input = getStringInput();

            switch (input) {
                case "1" -> sortByFirstName();
                case "2" -> sortByLastName();
                case "3" -> sortSalaryAscendingOrder();
                case "4" -> sortSalaryDescendingOrder();
                case "0" -> sortLoop = false;
                default -> System.out.println("Wrong input, please choose 1-4");
            }
        }

    }

