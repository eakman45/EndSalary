public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }

    public double tax(){
        double tax=0;
        if (this.salary>1000){
            tax=this.salary*0.03;
            return tax;
        }
        return tax;
    }
    public double bonus(){
        double bonus=0;
        if(workHours>40){
            bonus=(workHours-40)*30;
            return bonus;
        }
        return 0;
    }
     double raiseSalary(){
        int currentYear=2021;
        int totalYear = currentYear-this.hireYear;
        double raise=0;

        if(totalYear <10){
            raise=salary*0.05;
            return raise;
        }else if(totalYear <20 && totalYear >=10){
            raise=salary*0.05;
            return raise;
        }else if(totalYear >=20){
            raise=salary*0.15;
            return raise;
        }
        return 0;
    }
    public void toTheString(){
        System.out.println("==================================");
        System.out.println("Name : "+this.name);
        System.out.println("Salary : "+this.salary);
        System.out.println("Worked Hours : "+this.workHours);
        System.out.println("Hire Year : "+this.hireYear);
        System.out.println("Tax : "+ tax());
        System.out.println("Bonus : "+bonus());
        System.out.println("Salary with tax and bonus : "+(this.salary-tax()+bonus()));
        System.out.println("Salary raise : "+raiseSalary());
        System.out.println("Total Salary is : "+(this.salary+bonus()+raiseSalary()-tax()));
        System.out.println("==================================");

    }
}
