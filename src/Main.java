public class Main {
    public static void main(String[] args) {
        Employee emp1=new Employee( "burak",2000,45, 2015 );
        System.out.println(emp1.tax());
        System.out.println(emp1.bonus());
        System.out.println(emp1.incrase());
        double totalSalary= emp1.salary- emp1.tax()+ emp1.bonus();
        System.out.println("Total Salary With Tax And Bonus :" + totalSalary);
        System.out.println("Total Salary With The Raise Of Salary :"  +(emp1.salary + emp1.incrase()));

    }
}