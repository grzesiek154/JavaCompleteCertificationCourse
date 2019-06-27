package com.company;

import java.lang.reflect.Constructor;

public class ReflectionConstructors {

    public static void main(String[] args) throws NoSuchMethodException {

        Class myClass = MyTestClass.class;

        Constructor[] constructors = myClass.getConstructors();

        Constructor constructor =
                myClass.getConstructor(new Class[]{String.class});

        //You can read what parameters a given constructor takes like this:
        Class[] parameterTypes = constructor.getParameterTypes();

    }


}
