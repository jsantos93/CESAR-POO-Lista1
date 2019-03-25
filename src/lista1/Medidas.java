package lista1;

public class Medidas {
	
	String 	unidadeDeDistancia;
	float distancia;
	String unidadeDeMassa;
	float massa;
	String unidadeDeTemperatura;
	int temperatura;

	
	public Medidas() {
		
	}
	
	public Medidas(String unidadeDeDistancia, float distancia, String unidadeDeMassa, float massa, String unidadeDeTemperatura, int temperatura) {
		this.unidadeDeDistancia = unidadeDeDistancia;
		this.distancia = distancia;
		this.unidadeDeMassa = unidadeDeMassa;
		this.massa = massa;
		this.unidadeDeTemperatura = unidadeDeTemperatura;
		this.temperatura = temperatura;
	}
	
	
	public String getUnidadeDeDistancia() {
		return unidadeDeDistancia;
	}

	public void setUnidadeDeDistancia(String unidadeDeDistancia) {
		this.unidadeDeDistancia = unidadeDeDistancia;
	}

	public float getDistancia() {
		return distancia;
	}

	public void setDistancia(float distancia) {
		this.distancia = distancia;
	}

	public String getUnidadeDeMassa() {
		return unidadeDeMassa;
	}

	public void setUnidadeDeMassa(String unidadeDeMassa) {
		this.unidadeDeMassa = unidadeDeMassa;
	}

	public float getMassa() {
		return massa;
	}

	public void setMassa(float massa) {
		this.massa = massa;
	}

	public String getUnidadeDeTemperatura() {
		return unidadeDeTemperatura;
	}

	public void setUnidadeDeTemperatura(String unidadeDeTemperatura) {
		this.unidadeDeTemperatura = unidadeDeTemperatura;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public static void main(String[] args) {
		

	}

}
