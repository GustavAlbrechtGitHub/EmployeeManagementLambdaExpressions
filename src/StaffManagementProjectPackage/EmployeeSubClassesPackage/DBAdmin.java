package StaffManagementProjectPackage.EmployeeSubClassesPackage;

import StaffManagementProjectPackage.Employee;

    public class DBAdmin extends Employee {


        public DBAdmin(){
            super();

        }

        public DBAdmin(int id, String firstname, String lastname, String birthday, double salary, String department) {
            super(id, firstname, lastname, birthday, salary, department);
        }
        @Override
        public void employeeBonus(){

            double dbadminBonus = this.getSalary() * 0.2;

            double totalSalary = dbadminBonus + this.getSalary();

            System.out.println("As a dbadmin you get 20% bonus.");
            System.out.println("So you get: " + dbadminBonus +  " kr");
            System.out.println("Total Salary with bonus: " + totalSalary + " kr");


        }

        @Override
        public String toString() {
            return super.toString();
        }
    }


