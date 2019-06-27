package com.company.baeldung;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {
//
//        We can use getMethod() to find any public method, be it static or instance that is defined in the class or any of its superclasses.
//
//        It receives the method name as the first argument, followed by the types of the method’s arguments:

        Method sumInstanceMethod
                = Operations.class.getMethod("publicSum", int.class, double.class);

        Method multiplyStaticMethod
                = Operations.class.getMethod(
                "publicStaticMultiply", float.class, long.class);
    }
}
