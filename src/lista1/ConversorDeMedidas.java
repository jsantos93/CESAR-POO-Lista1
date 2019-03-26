package lista1;

public class ConversorDeMedidas {
	
	public String converterDistancia(Medidas medida1, Medidas medida2) {
		if((medida1.getUnidadeDeDistancia() == "km") && (medida2.getUnidadeDeDistancia() == "mi")){
			medida1.setDistancia(medida1.getDistancia()/1.609);
			medida1.setUnidadeDeDistancia("mi"); 			
		}
		else if((medida1.getUnidadeDeDistancia() == "mi") && (medida2.getUnidadeDeDistancia() == "km")){
			medida1.setDistancia(medida1.getDistancia() * 1.609);
			medida1.setUnidadeDeDistancia("km");			
		}
		else {
			return "Erro";
		}
		return medida1.getDistancia() + medida1.getUnidadeDeDistancia();
	}
	
	public String converterMassa(Medidas medida1, Medidas medida2) {
		if((medida1.getUnidadeDeMassa() == "kg") && (medida2.getUnidadeDeMassa() == "lb")) {
			medida1.setMassa(medida1.getMassa() * 2.2046);
			medida1.setUnidadeDeMassa("lb");
		}
		else if((medida1.getUnidadeDeMassa() == "lb") && (medida2.getUnidadeDeMassa() == "kg")) {
			medida1.setMassa(medida1.getMassa() / 2.2046);
			medida1.setUnidadeDeMassa("kg");
		}
		else {
			return "Erro";
		}
		return medida1.getMassa() + medida1.getUnidadeDeMassa();
	}
	
	public String converterTemperatura(Medidas medida1, Medidas medida2) {
		if((medida1.getUnidadeDeTemperatura() == "C") && (medida2.getUnidadeDeTemperatura() == "F")) {
			medida1.setTemperatura((int)(medida1.getTemperatura()* 1.8) + 32);
			medida1.setUnidadeDeTemperatura("F");
		}
		else if((medida1.getUnidadeDeTemperatura() == "F") && (medida2.getUnidadeDeTemperatura() == "C")){
			medida1.setTemperatura((int)((medida1.getTemperatura()- 32) / 1.8));
			medida1.setUnidadeDeTemperatura("C");
		}
		else {
			return "Erro";
		}
		return medida1.getTemperatura() + medida1.getUnidadeDeTemperatura();
	}

	public static void main(String[] args) {
		Medidas uniDeMedida1 = new Medidas("mi", 20, "kg", 10, "C", 1);
		Medidas uniDeMedida2 = new Medidas("km", 30, "lb", 20, "F", 2);
		ConversorDeMedidas conversor = new ConversorDeMedidas();
		System.out.println(conversor.converterDistancia(uniDeMedida1, uniDeMedida2));

	}

}
