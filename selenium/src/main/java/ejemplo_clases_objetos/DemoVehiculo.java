package ejemplo_clases_objetos;

public class DemoVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo minivan = new Vehiculo();
		
		int rango;
		
		//asignar valores a los campos de minivan
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh = 20;
		
		//calcular el rango con tanque lleno
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("La minivan puede llevar " + minivan.pasajeros + "pasajeros con un rango de " + rango + "kilometros");
		
		Vehiculo carro = new Vehiculo();
		carro.pasajeros = 4;
		System.out.println("numero de pasajeros de carro es " + carro.pasajeros);
		
		

	}

}
