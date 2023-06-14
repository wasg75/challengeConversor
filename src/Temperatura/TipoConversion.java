package Temperatura;

public enum TipoConversion {
	Celsius_a_Farenheit("Celsius a Farenheit","Celsius","Farenheit",18.00),
	Kelvin_Celsius("Kelvin Celsius","Kelvin","Celsius",19.79),
	Farenheit_a_Kelvin("Farenheit a Kelvin","Farenheit","Kelvin",22.40),
	Farenheit_a_Celsius("Farenheit a Celsius","Farenheit","Celsius",0.13),
	Celsius_a_Kelvin("Celsius a Kelvin","Celsius","Kelvin",0.014),
	Kelvin_a_Farenheit("Kelvin a Farenheit","kelvin","Farenheit",0.056);
	
	
	
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	private String nombre;
	private String origen;
	private String destino;
	private Double valor;
	
	
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public Double getValor() {
		return valor;
	}
	
	private TipoConversion(String nombre, String origen, String destino, Double valor) {
		this.nombre = nombre;
		this.origen = origen;
		this.destino = destino;
		this.valor = valor;
	}

	public String getOrigen() {
		
		return origen;
	}
	
	
	
}
