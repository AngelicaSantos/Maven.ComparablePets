package io.zipcoder.Pets;

public abstract class Pet {

    private String name;


    public Pet(String name) {

        this.name=name;
    }


    public String getName() {

        return name;
    }

    public void setName() {

        this.name=name;
    }


   //abstract method
    abstract public String speak();


    public String getType() {
        return name;
    }

}
