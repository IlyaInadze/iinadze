package ru.job4j.maximum;
public class Max {
    public int max(int first, int second, int third, int fourth) {
        return this.max(this.max(first, second), this.max(third, fourth));
    }
    public int max(int first, int second, int third) {
        return this.max(this.max(first, second), third);
    }
    public int max(int first, int second) {
        return (first > second) ? first : second;
    }
}




