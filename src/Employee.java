public class Employee {
    private String name;
    public double salary;
    private int workHours, hireYear;


    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    public double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03;
        }
        return 0.0;
    }

    public double bonus() {
        int extrahours=this.workHours-40;
        if (extrahours > 0){
            return 30 * extrahours;
        }
        return 0.0;
    }

    public double incrase() {
        int year = 2022 - this.hireYear;
        if (year < 10) {
            return this.salary * 0.05;
        } else if (year > 10 && year < 20) {

                return this.salary * 0.010;

            }
            else{
                return this.salary * 0.015;
            }

        }

    }
