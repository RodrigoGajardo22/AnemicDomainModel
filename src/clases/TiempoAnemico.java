package clases;

import java.time.LocalDateTime;

public class TiempoAnemico {

	private LocalDateTime fechaConHora;

	public TiempoAnemico() {
		fechaConHora = LocalDateTime.now();
	}

	public LocalDateTime fecha() {

		return fechaConHora;
	}

}
