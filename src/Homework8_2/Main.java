package Homework8_2;

public class Main {
    /*
    Задача 2:
Создать класс, который будет хранить в себе коллекцию с названиями животных.
Реализовать методы удаления и добавления животных по следующим правилам:
добавляется всегда в начало коллекции, а удаляется всегда из конца.
Показать работу объекта этого класса в main методе другого класса.
     */
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.addAnimal("Dog");
        System.out.println(animal.getAnimals());

        animal.addAnimal("Cat");
        System.out.println(animal.getAnimals());

        animal.addAnimal("Cow");
        System.out.println(animal.getAnimals());

        // Удаляем dog
        animal.removeAnimal();
        System.out.println(animal.getAnimals());

        // Удаляем cat
        animal.removeAnimal();
        System.out.println(animal.getAnimals());

        // Удаляем cow
        animal.removeAnimal();
        System.out.println(animal.getAnimals());

        // Пытаемся удалить животное из пустой коллекции
        animal.removeAnimal();
        System.out.println(animal.getAnimals());
    }
}