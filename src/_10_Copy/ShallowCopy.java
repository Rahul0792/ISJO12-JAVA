package _10_Copy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class ShallowCopy {
        public static void main(String[] args) throws CloneNotSupportedException {
        @NoArgsConstructor
        @AllArgsConstructor
        @Data
        @ToString
        class Address{
            private String city;
            private String state;
            private String country;
        }

        @NoArgsConstructor
        @AllArgsConstructor
        @Data
        @ToString
        class Employee implements  Cloneable{
            private int id;
            private int salary;
            private String name;
            private Address address;

            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        }

        Employee employee = new Employee();
        employee.setId(101);
        employee.setName("Rahul");
        employee.setSalary(5000);

        Address address = new Address();
        address.setCity("Pune");
        address.setState("Maharashtra");
        address.setCountry("India");
        employee.setAddress(address);

        Employee employee2 = (Employee) employee.clone();
            System.out.println(employee);
            System.out.println(employee2);
            employee.getAddress().setCity("Tamilnadu");
            System.out.println(employee2);
            System.out.println(employee);

    }
}
