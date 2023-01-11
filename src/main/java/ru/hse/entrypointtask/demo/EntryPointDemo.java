package ru.hse.entrypointtask.demo;

import ru.hse.entrypointtask.annotation.EntryPoint;

public class EntryPointDemo {
    @EntryPoint
    public void run() {
        System.out.println(
                """
                        Тестировщик заходит в бар и заказывает:
                                                
                        кружку пива,
                        2 кружки пива,
                        0 кружек пива,
                        999999999 кружек пива,
                        ящерицу в стакане,
                        –1 кружку пива,
                        qwertyuip кружек пива.
                                                
                        Первый реальный клиент заходит в бар и спрашивает, где туалет. Бар вспыхивает пламенем, все погибают."""
        );
    }
}
