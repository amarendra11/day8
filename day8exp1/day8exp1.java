package day8exp1;

public class  {
    public class static {

    public static void main(String[] args) {

    }
        private int employeeId;
        private String employeeName;
        private double salary;
        private double netSalary;

        //setters
        public void setEmployeeId(int employeeId){
            this.employeeId=employeeId;
        }
        public void setEmployeeName(String employeeName){
            this.employeeName=employeeName;
        }
        public void setSalary(double salary){
            this.salary=salary;
        }
        public void netSalary(double netSalary){
            this.netSalary=netSalary;
        }

        //getters
        public int getEmployeeId(){
            return employeeId;
        }
        public String getEmployeeName(){
            return employeeName;
        }
        public double getSalary(){
            return salary;
        }
        public double getNetSalary(){
            return netSalary;
        }

        public void calculateNetSalary(int pfpercentage){

            double P = salary * pfpercentage;
            double p = 0;
            netSalary=salary- p;
        }
    }
    }

