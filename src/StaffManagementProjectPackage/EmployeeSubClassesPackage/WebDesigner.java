package StaffManagementProjectPackage.EmployeeSubClassesPackage;

import StaffManagementProjectPackage.Employee;


    public class WebDesigner extends Employee {


        public WebDesigner(){
            super();
        }

        public WebDesigner(int id, String firstname, String lastname, String birthday, double salary, String department) {
            super(id, firstname, lastname, birthday, salary, department);
        }
        @Override
        public void employeeBonus(){

            double webBonus = this.getSalary() * 0.15;

            double totalSalary = webBonus + this.getSalary();

            System.out.println("As a Webdesigner you get 15% bonus.");
            System.out.println("So you get: " + webBonus +  " kr");
            System.out.println("Total Salary with bonus: " + totalSalary + " kr");
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
