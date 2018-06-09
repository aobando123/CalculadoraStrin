package cr.ac.ucenfotec.kata.logica;

public class CalculadoraHileras {

	public CalculadoraHileras() {
		// TODO Auto-generated constructor stub
	}

	public int add(String string) throws Exception {
		if(string.isEmpty()) {
			return 0;
		}
		String[] numeros =  string.split(":|\\.|\\,");
		
		int acumulador = sumarTodosLosValores(numeros);
		
		return acumulador;
		
	}

	private int sumarTodosLosValores(String[] numeros) {
		int acumulador = 0;
		for (String numero : numeros ) {
			acumulador += Integer.parseInt(numero);
		}
		return acumulador;
	}

}
