/*1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
Можно записать в текстовом виде, не обязательно реализовывать в java.*/

package Task15;

import java.time.LocalDate;
import java.util.ArrayList;

public class cat {
    private String name;
    private String owner;
    private String breed;
    private LocalDate dateBorn;
    private ArrayList<Vaccination> vaccinations = new ArrayList<>();

    public cat(String name, String owner, String breed, LocalDate dateBorn) {
        this.name = name;
        this.owner = owner;
        this.breed = breed;
        this.dateBorn = dateBorn;
    }

    @Override
    public String toString() {
        return "cat [name=" + name + ", owner=" + owner + ", breed=" + breed + ", dateBorn=" + dateBorn
                + ", vaccinations=" + vaccinations + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public LocalDate getDateBorn() {
        return dateBorn;
    }

    public void setDateBorn(LocalDate dateBorn) {
        this.dateBorn = dateBorn;
    }

    public void addVaccination(Vaccination vaccination){
        vaccinations.add(vaccination);
    }

}
