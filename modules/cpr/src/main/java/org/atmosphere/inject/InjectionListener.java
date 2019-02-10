/**
 * Copyright 2016 Yulplay.com
 */
package org.atmosphere.inject;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;

/**
 * @author Jeanfrancois Arcand
 */
public interface InjectionListener {

    <T extends java.lang.Object, U extends T> void preFieldInjection(Field field, U instance, Class<T> clazz);

    <T extends java.lang.Object, U extends T> void postFieldInjection(Field field, U instance, Class<T> clazz);

    <T extends java.lang.Object, U extends T> void preMethodInjection(Method method, U instance, Class<T> clazz);

    <T extends java.lang.Object, U extends T> void postMethodInjection(Method method, U instance, Class<T> clazz);

    <T extends java.lang.Object, U extends T> void nullFieldInjectionFor(Field field, U instance, Class<T> clazz);

    void injectionFailed(LinkedHashSet<Object> pushBackInjection);

    <T extends java.lang.Object, U extends T> void fieldInjectionException(Field field, U instance, Class<T> clazz, Exception ex);

    <T extends java.lang.Object, U extends T> void methodInjectionException(Method method, U instance, Class<T> clazz, Exception ex);
}
