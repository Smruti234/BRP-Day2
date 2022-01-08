
class Employee{
   private int salary;
   private String name;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}

    class Sqaure{
    int side;
         public int area(){
           return side*side;
        }
        public int parameter(){
             return 4*side;
        }
    }




public class Ch_40 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("shaym");
        employee.setSalary(6858685);
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());

        Sqaure sq =new Sqaure();
        sq.side =32;
        System.out.println(sq.area());
        System.out.println(sq.parameter());
    }


}
