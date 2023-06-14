
import javax.swing.JOptionPane;

import Moneda.TipoCambio;

public class OpcionesMoneda {

	public void opciones() {
		Object[] menu = new Object[9];
		TipoCambio[] tipoDeCambio = TipoCambio.values();
		ConvertirMoneda moneda = new ConvertirMoneda();
		double valor = 0;
		
		menu = rellenaMenu(menu, tipoDeCambio);
				
		String op2 = JOptionPane.showInputDialog(null, "Seleccione una opción", "Conversor",
						JOptionPane.QUESTION_MESSAGE, null, menu, "Seleccion")
					.toString();
	
		double tipo = 0;
		String destino= "";
		String origen ="";

		for (int i = 0; i < tipoDeCambio.length; i++) {
			if (tipoDeCambio[i].getNombre() == op2) {

				tipo = tipoDeCambio[i].getValor();
				destino= tipoDeCambio[i].getDestino();
				origen = tipoDeCambio[i].getOrigen();
				break;
			}
		}
		try {
			double cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite una cantidad de "+ origen));
			valor = moneda.convertir(cantidad, tipo);
			
			JOptionPane.showMessageDialog(null, "El resultado es: " + valor + " "+ destino);
		}catch(NumberFormatException ex) {
			
			JOptionPane.showMessageDialog(null, "valor no valido");
		}
	}
	public Object[] rellenaMenu(Object[] menu,TipoCambio[] tipoDeCambio) {
		
		for (int i = 0; i < tipoDeCambio.length; i++) {
			
				menu[i]=tipoDeCambio[i].getNombre();
		}
		return menu;
	}

}
