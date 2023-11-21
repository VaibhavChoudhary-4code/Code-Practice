package com.example.demo1;


class Superclass {
    static void staticMethod() {
        System.out.println("Superclass staticMethod");
    }
}

class Subclass extends Superclass {
    static void staticMethod() {
        System.out.println("Subclass staticMethod");
    }
}

public class OverrideStaticMethod {

	public static void main(String[] args) {
		Superclass obj = new Subclass();
        obj.staticMethod();

	}

}
