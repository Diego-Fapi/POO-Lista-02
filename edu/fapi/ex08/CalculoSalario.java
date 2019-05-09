package Ex08;

public class CalculoSalario {
	public float calcularSalario (Empregado empregado) {
		float total=0;
		
		if(empregado.horario_Entrada >= 06 && empregado.horario_Saida <= 22) {
			total = ((22-06) * 45) * empregado.dias_trabalhados;
		}else if(empregado.horario_Entrada == 22 && empregado.horario_Saida == 06){
			total = ((22-06) * 70) * empregado.dias_trabalhados;
		}else {
			System.out.println("Errrrroooouuu os horários. Você fez com que o seu funcionário não recebesse nada. Como se sente?");
		}
		
		System.out.println("O funcionário "+empregado.nome+" "+empregado.sobrenome+" receberá R$"+total+" reais.");
		return total;
	}
}
