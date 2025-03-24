package org.example.factory;

import java.lang.reflect.Constructor;

public class Factory {
    private static Factory instance;
    
    private Factory () {}

    public static Factory getInstance () {
        if(Factory.instance == null) {
            Factory.instance = new Factory();
        }

        return instance;
    }

    public static Object getIOperationClassInstance(String className) throws Exception {
        String module = "org.example.model.operation.";
        // Carrega a classe com o nome dela
        Class<?> clazz = Class.forName(module + className);

        // Obtem o construtor padrao, sem argumentos
        Constructor<?> constructor = clazz.getDeclaredConstructor();

        return constructor.newInstance();
    }
}
