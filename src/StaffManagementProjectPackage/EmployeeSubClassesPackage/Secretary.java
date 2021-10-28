package StaffManagementProjectPackage.EmployeeSubClassesPackage;

import StaffManagementProjectPackage.Employee;


    public class Secretary extends Employee {


        public Secretary(){
            super();
        }


        public Secretary(int id, String firstname, String lastname, String birthday, double salary, String department) {
            super(id, firstname, lastname, birthday, salary, department);
        }
        @Override
        public void employeeBonus(){


            double secretaryBonus = this.getSalary() * 0.25;

            double totalSalary = secretaryBonus + this.getSalary();

            System.out.println("As a secretary you get 25% bonus.");
            System.out.println("So you get: " + secretaryBonus +  " kr");
            System.out.println("Total Salary with bonus: " + totalSalary + " kr");
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
