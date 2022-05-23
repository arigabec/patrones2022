package exercises.exercise3;

public abstract class Creator {
    public Creator(){}

    public abstract IPasaje createProduct(Pasajero pasajero, int asiento);
}
