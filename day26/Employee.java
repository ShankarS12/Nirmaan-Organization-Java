package day26;


import java.util.Objects;

public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee() {

    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        return Objects.equals(department, other.department) && id == other.id && Objects.equals(name, other.name);
    }

    @Override
    public int compareTo(Employee other) {
        // TODO Auto-generated method stub
        return Integer.compare(id, other.getId());
    }





}

