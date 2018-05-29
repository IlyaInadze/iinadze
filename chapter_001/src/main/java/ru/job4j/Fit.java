package ru.job4j;

/**
 * Программа расчета идеального веса.
 */
public class Fit {
/**
 * Вес идеальный для мужчин
 * Входящий параметр рост(height)
 * return weight
 */
    public double manWeight(double height) {
        return (height - 100) * 1.15;
    }
/**
 * Вес идеальный для женщин
 * Входящий параметр рост(height)
 * return weight
 */
    public double womanWeight(double height) {
        return (height - 110) * 1.15;
    }
}