package ru.denisch.service;

import ru.denisch.cache.Cache;
import ru.denisch.cache.Mutator;
import ru.denisch.cache.Run;

public class FunctionForTestImpl implements FunctionForTest {
    private int i;

    @Override
    @Mutator
    public void setI(int i) {
        System.out.println("    Установили значение в исходном классе " + i);
        this.i = i;
    }

    @Override
    @Run
    @Cache
    public String getI() {
        System.out.println("    Исходная версия функции");
        return String.valueOf(i);
    }
}
