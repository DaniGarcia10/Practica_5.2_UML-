package hotel;

public class Habitaciones {
	private String tipo;
	private int numero, capMax;
	private double tarifaNoche;
	@SuppressWarnings("unused")
	private enum Estado {DISPONIBLE, OCUPADA, LIMPIEZA};

	public Habitaciones() {
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCapMax() {
		return capMax;
	}

	public void setCapMax(int capMax) {
		this.capMax = capMax;
	}

	public double getTarifaNoche() {
		return tarifaNoche;
	}

	public void setTarifaNoche(double tarifaNoche) {
		this.tarifaNoche = tarifaNoche;
	}
	
}
