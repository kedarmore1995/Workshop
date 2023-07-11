package com.assignment;

public class EmployeeDetails {
    private String name;
    private int age;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void CalcSalary(){
        int totalSalary= getSalary()*12;
        System.out.println("Annual Salary of "+getName()+": "+totalSalary+"\n");
    }

    public EmployeeDetails(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static void main(String[] args) {
        EmployeeDetails emp1=new EmployeeDetails("Kedar",28,5000);
        System.out.println("Emp name: "+emp1.getName()+"  Emp age: "+emp1.getAge()+"  mp salary: "+emp1.getSalary());
        emp1.CalcSalary();

        EmployeeDetails emp2=new EmployeeDetails("Manish",25,3000);
        System.out.println("Emp name: "+emp2.getName()+"  Emp age: "+emp2.getAge()+"  Emp salary: "+emp2.getSalary());
        emp2.CalcSalary();


    }

}
