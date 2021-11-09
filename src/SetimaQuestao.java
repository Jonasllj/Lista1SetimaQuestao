import java.util.Scanner;

public class SetimaQuestao {
	
	public static void salario(double salario) {
		double aumento,total;
		aumento= (salario*25)/100;
		total = aumento + salario;
		System.out.println(salario);
		System.out.println(aumento);
		System.out.println(total);
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		double salario,aumento,salario_novo;
		System.out.println("Digite o valor do salario");
		salario = sc.nextDouble();
		aumento = (salario *25)/100;
		salario_novo = salario + aumento;
		SetimaQuestao.salario(salario);
		
	}
}
