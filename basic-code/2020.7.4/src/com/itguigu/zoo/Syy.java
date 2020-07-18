package com.itguigu.zoo;

import java.security.PublicKey;

/**
 * @author z
 * @create 2020-07-15-15:09
 */
public class Syy {

        private Animal animal;
        public void feed(Animal animal){
            animal.eat();
        }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
