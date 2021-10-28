package StaffManagementProjectPackage.EmployeeSubClassesPackage;

import StaffManagementProjectPackage.Employee;


    public class Marketer extends Employee {


        public Marketer(){
            super();
        }


        public Marketer(int id, String firstname, String lastname, String birthday, double salary, String department) {
            super(id, firstname, lastname, birthday, salary, department);
        }
        @Override
        public void employeeBonus(){


            double marketerBonus = this.getSalary() * 0.30;

            double totalSalary = marketerBonus + this.getSalary();

            System.out.println("As a chief you get 30% bonus.");
            System.out.println("So you get: " + marketerBonus +  " kr");
            System.out.println("Total Salary with bonus: " + totalSalary + " kr");


        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

