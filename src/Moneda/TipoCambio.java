package Moneda;

public enum TipoCambio {
	Pesos_a_Dolar("Peso a Dolar","Pesos","Dolares",18.00),
	Pesos_a_Euro("Peso a Euro","Pesos","Euros",19.79),
	Pesos_a_Libra_Esterlina("Peso a Libra Esterlina","Pesos","Libras Esterlinas",22.40),
	Pesos_a_Yen_Japones("Peso a Yen Japones","Pesos","Yen Japonés",0.13),
	Pesos_a_Won_sul_coreano("Peso a Won Sul-Coreano","Pesos","Won sul-coreano",0.014),
	Dolar_a_Peso("Dolar a Peso","Dolar","Pesos",0.056),
	Euro_a_Peso("Euro a Peso","Euros","Pesos",0.51),
	Yen_Japones_a_Peso("Yen Japones a Peso","Yen Japones","Pesos",7.45),
	Won_sul_coreano_a_Peso("Won sul-coreano a Peso","Won sul-coreano","Pesos",73.91);
	
	
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
	
	private TipoCambio(String nombre, String origen, String destino, Double valor) {
		this.nombre = nombre;
		this.origen = origen;
		this.destino = destino;
		this.valor = valor;
	}

	
	public String  getOrigen() {
		return origen;
	}
	
	
	
}
