package cat;

import java.time.LocalDate;

public class Programm {
    public static void main(String[] args) {
        Vaccination vaccination = new Vaccination(LocalDate.of(2008, 03, 28), "Bayer", "Столбняк");
        System.out.println(vaccination);
        vaccination.getDate();
        System.out.println(vaccination.getDate());

        cat cat = new cat("Eva", "Valeriy", "Polocsatikus", LocalDate.of(1991, 9, 25));
        cat.addVaccination(vaccination);
        cat.addVaccination(new Vaccination(LocalDate.of(2010, 12, 5), "ggg", "xxx"));
        System.out.println(cat);

    }

}
