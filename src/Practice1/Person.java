/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice1;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.paint.Color;


public class Person {
    
    
    private SimpleStringProperty name;
    private SimpleStringProperty age;
    private Color color;

    public Person(String name, String age, Color color) {
        this.name.set(name); 
        this.age.set(age); 
        this.color = color;
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name); 
    }

    public String getAge() {
        return age.get();
    }

    public void setAge(String age) {
        this.age.set(age);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    
}
