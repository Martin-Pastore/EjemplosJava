/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Martin
 */
public class Athlete extends Person implements PersonActions {

    private String category;

    public Athlete(String category, String name, String surname, int age, double weight) {
        super(name, surname, age, weight);
        this.category = category;
    }

    public Athlete() {
        super();
    }

    public Athlete(String category) {
        this.category = category;
    }

    @Override
    public String move(int meters) {
        String movement = "El atletla corrio " + String.valueOf(meters) + " metros";
        return movement;

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
