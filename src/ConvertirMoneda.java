
public class ConvertirMoneda {
	public double convertir(double cantidad, Double tipoCambio) {
		double conversion = cantidad / tipoCambio;

		conversion = (double) Math.round(conversion * 100d) / 100;
		return conversion;
		// JOptionPane.showMessageDialog(null, "El resultado es:"+ conversion);

	}
}
