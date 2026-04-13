package Homework8_2;

import java.util.LinkedList;

public class Animal {

    private LinkedList<String> animals = new LinkedList<>();

    // Добавление животного в начало коллекции
    public void addAnimal(String animal) {
        animals.addFirst(animal);
    }

    // Удаление животного с конца коллекции
    public void removeAnimal() {
        if (animals.isEmpty()) {
            System.out.println("Массив пустой. Нечего удалять.");
        } else {
            animals.removeLast();
        }
    }

    // Возвращает коллекцию animals
    public LinkedList<String> getAnimals() {
            return animals;
    }
}