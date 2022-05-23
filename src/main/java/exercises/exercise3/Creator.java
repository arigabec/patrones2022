package exercises.exercise3;

import factoryMethod.example.heladeria.IHelado;

public abstract class Creator {
    public Creator(){}

    public abstract IPasaje createProduct(Pasajero pasajero, int asiento);
}
