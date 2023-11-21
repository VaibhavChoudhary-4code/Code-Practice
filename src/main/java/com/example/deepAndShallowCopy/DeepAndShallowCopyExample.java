package com.example.deepAndShallowCopy;

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Person implements Cloneable{
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow clone method
    public Person shallowClone() {
        try {
        	System.out.println("Super Clone "+super.clone().toString());
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Deep clone method
    public Person deepClone() {
        Address clonedAddress = new Address(this.address.city);
        return new Person(this.name, clonedAddress);
    }
    
    @Override
    public String toString() {
        return "Person [name=" + name + ", address=" + address.city + "]";
    }
}

public class DeepAndShallowCopyExample {

	public static void main(String[] args) {
        Address originalAddress = new Address("New York");
        Person originalPerson = new Person("Alice", originalAddress);
        
        // Shallow cloning
        Person shallowCopy = originalPerson.shallowClone();
        shallowCopy.name = "Bob";
        shallowCopy.address.city = "Chicago";

        // Deep cloning
        Person deepCopy = originalPerson.deepClone();
        deepCopy.name = "Charlie";
        deepCopy.address.city = "Los Angeles";

        System.out.println("Original Person: " + originalPerson.name + " - " + originalPerson.address.city);
        System.out.println("Shallow Copy: " + shallowCopy.name + " - " + shallowCopy.address.city);
        System.out.println("Deep Copy: " + deepCopy.name + " - " + deepCopy.address.city);
        
	}

}
