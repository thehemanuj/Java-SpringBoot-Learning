package org.ayushshukla;

public class Alien {
    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    Laptop laptop;
    public void code(){
        laptop.boot();
        System.out.println("I am coding");
    }
}
