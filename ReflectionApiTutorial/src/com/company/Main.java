package com.company;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Class myClass = MyTestClass.class;
        String myClassForName = myClass.getName();
        String myClassNameNoPackage = myClass.getSimpleName();
        Field[] fields = myClass.getFields();

        //methods
        int modifiers = myClass.getModifiers();

        //superclass
        Class superClass = myClass.getSuperclass();
        //interfaces
        Class[] interfaces = myClass.getInterfaces();
        //constructor
        Constructor[] constructors = myClass.getConstructors();

        System.out.println(myClassForName);
        System.out.println(myClassNameNoPackage);
        System.out.println(modifiers);

    }
}
