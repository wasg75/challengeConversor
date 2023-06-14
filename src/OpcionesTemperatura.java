
import javax.swing.JOptionPane;
import Temperatura.TipoConversion;

public class OpcionesTemperatura {

	public void opciones() {
		Object[] menu = new Object[6];
		TipoConversion[] tipoConversion = TipoConversion.values();

		double valor = 0;

		menu = rellenaMenu(menu, tipoConversion);

		String op2 = JOptionPane.showInputDialog(null, "Seleccione una opción", "Conversor",
				JOptionPane.QUESTION_MESSAGE, null, menu, "Seleccion").toString();

		double tipo = 0;
		String destino = "";
		String origen = "";
		for (int i = 0; i < tipoConversion.length; i++) {
			if (tipoConversion[i].getNombre() == op2) {

				tipo = tipoConversion[i].getValor();
				destino = tipoConversion[i].getDestino();
				origen = tipoConversion[i].getOrigen();
				break;
			}
		}
		try {
			double cantidad = Double
					.parseDouble(JOptionPane.showInputDialog(null, "Digite una cantidad en grados " + origen));

			switch (op2) {

			case "Celsius a Farenheit":
				valor = cantidad * 1.8 + 32;
				break;

			case "Kelvin a Celsius":
				valor = cantidad - 273.15;
				break;
			case "Farenheit a Kelvin":
				valor = (cantidad - 32) * 1.8 + 273.15;
				break;
			case "Farenheit a Celsius":
				valor = (cantidad - 32) / 1.8;
				break;
			case "Celsius a Kelvin":
				valor = cantidad + 273.15;

				break;
			case "Kelvin a Farenheit":
				valor = (cantidad - 273.15) * 1.8 + 32;
				break;

			}
			JOptionPane.showMessageDialog(null, "El resultado es: " + valor + " " + destino);
		} catch (NumberFormatException ex) {

			JOptionPane.showMessageDialog(null, "valor no valido");
		}
	}

	public Object[] rellenaMenu(Object[] menu, TipoConversion[] tipoConversion) {

		for (int i = 0; i < tipoConversion.length; i++) {

			menu[i] = tipoConversion[i].getNombre();
		}
		return menu;
	}

}
