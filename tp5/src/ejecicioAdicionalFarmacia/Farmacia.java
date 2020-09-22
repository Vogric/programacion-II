package ejecicioAdicionalFarmacia;

import java.util.ArrayList;

public class Farmacia {
	ArrayList<Medicamento> medicamentos;

	/**
	 * @param medicamentos
	 */
	public Farmacia() {
		this.medicamentos = new ArrayList<Medicamento>();
	}

	public void agregarMedicamento(Medicamento m) {
		this.medicamentos.add(m);
	}

	public boolean buscarMedicamento(Medicamento m) {
		return this.medicamentos.contains(m);
	}

}
