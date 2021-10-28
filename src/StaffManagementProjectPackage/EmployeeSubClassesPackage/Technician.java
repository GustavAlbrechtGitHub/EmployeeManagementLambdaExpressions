package StaffManagementProjectPackage.EmployeeSubClassesPackage;

import StaffManagementProjectPackage.Employee;


    public class Technician extends Employee {


        public Technician(){
            super();
        }


        public Technician(int id, String firstname, String lastname, String birthday, double salary, String department) {
            super(id, firstname, lastname, birthday, salary, department);
        }
        @Override
        public void employeeBonus(){


            double technicianBonus = this.getSalary() * 0.10;
            double totalSalary = technicianBonus + this.getSalary();

            System.out.println("As a technician you get 10% bonus.");
            System.out.println("So you get: " + technicianBonus +  " kr");
            System.out.println("Total Salary with bonus: " + totalSalary + " kr");
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
