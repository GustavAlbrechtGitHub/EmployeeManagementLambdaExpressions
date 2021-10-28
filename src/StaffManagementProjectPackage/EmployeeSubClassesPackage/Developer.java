package StaffManagementProjectPackage.EmployeeSubClassesPackage;

import StaffManagementProjectPackage.Employee;


    public class Developer extends Employee {


        public Developer(){
            super();
        }


        public Developer(int id, String firstname, String lastname, String birthday, double salary, String department) {
            super(id, firstname, lastname, birthday, salary, department);
        }
        @Override
        public void employeeBonus(){

            double developerBonus = this.getSalary() * 0.35;

            double totalSalary = developerBonus + this.getSalary();

            System.out.println("As a developer you get 35% bonus.");
            System.out.println("So you get: " + developerBonus +  " kr");
            System.out.println("Total Salary with bonus: " + totalSalary + " kr");

        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

