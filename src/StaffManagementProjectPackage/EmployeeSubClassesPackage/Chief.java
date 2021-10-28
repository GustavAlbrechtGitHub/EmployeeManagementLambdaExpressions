package StaffManagementProjectPackage.EmployeeSubClassesPackage;

import StaffManagementProjectPackage.Employee;

    public class Chief extends Employee {


        public Chief(){
            super();
        }

        public Chief(int id, String firstname, String lastname, String birthday, double salary, String department) {
            super(id, firstname, lastname, birthday, salary, department);
        }

        @Override
        public void employeeBonus(){


            double chiefBonus = this.getSalary() * 0.4;

            double totalSalary = chiefBonus + this.getSalary();

            System.out.println("As a chief you get 40% bonus.");
            System.out.println("So you get: " + chiefBonus +  " kr");
            System.out.println("Total Salary with bonus: " + totalSalary + " kr");
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }


