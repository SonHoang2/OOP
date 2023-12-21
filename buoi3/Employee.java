public class Employee {
    private String name;
    private String cmnd;

    public Employee (String name, String cmnd) {
        this.name = name;
        this.cmnd = cmnd;
    }

    public String getCmnd() {
        return cmnd;
    }

    public String getName() {
        return name;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}

class bai2 {
    public static void main(String[] args) {
        Employee employee = new Employee("nguyen van a", "001082946357");
        System.out.println("Name: " + employee.getName());
        System.out.println("cmnd: " + employee.getCmnd());
    }
}