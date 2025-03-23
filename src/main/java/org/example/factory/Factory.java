package org.example.factory;

import java.lang.reflect.Constructor;

public class Factory {
    public static Object getIOperationClassInstance(String className) throws Exception {
        String module = "org.example.model.operation.";
        // Carrega a classe com o nome dela
        Class<?> clazz = Class.forName(module + className);

        // Obtem o construtor padrao, sem argumentos
        Constructor<?> constructor = clazz.getDeclaredConstructor();

        return constructor.newInstance();
    }
}
