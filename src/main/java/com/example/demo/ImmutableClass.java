package com.example.demo;

public final class ImmutableClass {

	// Can you write one immutable class?
	
	private final int id;     // Make fields private and final
    private final String name;

    // Constructor to initialize the fields
    public ImmutableClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters for the fields
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


	public static void main(String[] args) {
		ImmutableClass obj = new ImmutableClass(5, "Vaibhav");
        ImmutableClass obj2 = new ImmutableClass(6, "Vaibhav1");

        System.out.println("ID of obj: " + obj.getId());
        System.out.println("Name of obj: " + obj.getName());

        System.out.println("ID of obj2: " + obj2.getId());
        System.out.println("Name of obj2: " + obj.getName());

	}

}
