package ru.job4j.fit;

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
		double weight = (height - 100) * 1.15;
        return weight;
    }
/**
 * Вес идеальный для женщин
 * Входящий параметр рост(height)
 * return weight
 */
    public double womanWeight(double height) {
		double weight = (height - 110) * 1.15;
        return weight;
    }
}