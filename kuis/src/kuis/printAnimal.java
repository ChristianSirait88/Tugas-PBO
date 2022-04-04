/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis;

import Interface.Animal;

/**
 *
 * @author Christian Sirait
 */
public class printAnimal implements Interface.Animal {
    String name,type,sound;

    printAnimal(String name, String type) {
        this.name = name;
        this.type = type;
    }


    public void printAnimal(Animal animal) {
        System.out.println(name + " adalah " + type + " dengan Bunyi "+sound);
} 
    
    public void setName(String name) {
    this.name = name;
    }
    
    public void setType(String type) {
    this.type = type;
    }

    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void makeSound() {
        if ("macan".equals(type) || "Macan".equals(type)){
        sound = "auum";
        }
        else if("kambing".equals(type) || "Kambing".equals(type)){
        sound = "mbeee";
        }
        else if("burung".equals(type) || "Burung".equals(type)){
        sound = "caw";
        }
        else if("ayam".equals(type) || "Ayam".equals(type)){
        sound = "kukuruyuk";
        }
        else if("kuda".equals(type) || "Kuda".equals(type)){
        sound = "hiehrik";
        }
        else if("sapi".equals(type) || "sapi".equals(type)){
        sound = "moooo";
        }
        else {
        sound = "Tidak berbunyi";
        }
        
    }


}
