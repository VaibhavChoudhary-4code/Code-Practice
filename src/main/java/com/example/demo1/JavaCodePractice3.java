package com.example.demo1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.hibernate.mapping.Collection;

public final class JavaCodePractice3 {

	private class PrivateInnerClass {
		public void innerMethod() {
            System.out.println("Inside the private inner class method");
        }
    }
	
//	public void createInnerObject() {
//		PrivateInnerClass p3 = new PrivateInnerClass();
//		p3.innerMethod();
//	}
	
	final int intstanceConstant;
	static final int classConstant = 123;
	
	static int i = 9;
	
	public JavaCodePractice3(int intstanceConstant){
		this.intstanceConstant = intstanceConstant;
	}
	
	public static void main(String[] args) {

//		JavaCodePractice3 p3 = new JavaCodePractice3();
//		p3.createInnerObject();
		
		
		
		JavaCodePractice3 j3 = new JavaCodePractice3(50);
		JavaCodePractice3 j4 = new JavaCodePractice3(75);
		
		j3.i = 10;
		
		System.out.println(" j3 "+j3.intstanceConstant);
		System.out.println(" j4 "+j4.intstanceConstant);
		
		System.out.println(" scope of i "+j3.i);
		System.out.println(" scope of i "+j4.i);
		
	}

}
