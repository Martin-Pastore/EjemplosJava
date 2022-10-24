/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Martin
 */
public class Student extends Person implements PersonActions {

    public Student() {
        super();
    }

    public Student(String name, String surname, int age, double weight) {
        super(name, surname, age, weight);
    }

    public String study() {
        return "Estudiando...";
    }

    public String study(String name) {
        return "Estudiando " + name;
    }

    @Override
    public String move(int meters) {
        String movement = "El estudiante camino " + String.valueOf(meters) + " metros";
        return movement;
    }

    @Override
    public void setWeight(double weight) {
        super.setWeight(weight);
    }

    @Override
    public double getWeight() {
        return super.getWeight();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

}
