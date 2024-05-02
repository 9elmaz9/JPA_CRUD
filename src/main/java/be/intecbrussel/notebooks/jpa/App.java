package be.intecbrussel.notebooks.jpa;

//Hier is de hoofdklasse om het student object te persisteren met behulp van de EntityManager#persist
//method

public class App {
    public static void main(String[] args) {

        CRUDOperations crudOperations = new CRUDOperations();
        crudOperations.insertEntity();
        crudOperations.findEntity(1);
        crudOperations.updateEntity(1);
        crudOperations.removeEntity(1);

    }
}
