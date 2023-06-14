
import javax.swing.JOptionPane;

public class Pantalla {

	public static void main(String[] args) {

		OpcionesMoneda moneda = new OpcionesMoneda();
		OpcionesTemperatura temperatura = new OpcionesTemperatura();
		boolean band = true;
		int resp = 0;

		while (band) {
			try {
				String op = JOptionPane.showInputDialog(null, "Seleccione una opción", "Conversor",
						JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Moneda", "Temperatura" }, "Seleccion")
						.toString();

				switch (op) {
				case "Moneda":
					moneda.opciones();
					break;

				case "Temperatura":
					temperatura.opciones();
					break;

				default:
					break;
				}

				resp = JOptionPane.showConfirmDialog(null, "¿Desea reslizar una nueva conversión?");
				if (resp == JOptionPane.OK_OPTION) {
					band = true;
				} else {
					band = false;
					JOptionPane.showMessageDialog(null, "Programa Terminado");
				}
			} catch (NullPointerException ex) {
				band = false;
				JOptionPane.showMessageDialog(null, "Opción no seleccionada, programa terminado");
			}
		}
	}

}
