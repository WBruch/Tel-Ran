package pravtice_5;

import java.util.Arrays;

public class Company {

    private String name;
    private String address;
    private Department[] departments;

    public Company(String name, String address, Department[] departments) {
        this.name = name;
        this.address = address;
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", departments=" + Arrays.toString(departments) +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Department[] getDepartments() {
        return departments;
    }
}
