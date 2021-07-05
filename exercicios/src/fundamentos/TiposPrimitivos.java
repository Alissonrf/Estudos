package fundamentos;

public class TiposPrimitivos {

		public static void main(String[] args) {
			// informações do Funcionário
			
			// Tipos numericos inteiros
			byte anosDeEmpresa = 23;
			short numerosDeVoos = 542;
			int id = 56789;
			long pontosAcumulados = 3_134_845_223L;
			
			// tipos numericos reais
			float salario = 11_445.44F;
			double vendasAcumuladas = 2_991_797_103.01;
			
			// tipo boolean
			boolean estaDeFerias = false; // or true;
			
			// tipo caractere
			
			char status = 'A'; // A = Ativo, só pode colocar 1 letra dentro das ''

			// Dias de empresa
			System.out.println(anosDeEmpresa * 365);
			
			// Numeros de viagens
			System.out.println(numerosDeVoos / 2);
			
			// pontos por real
			System.out.println(pontosAcumulados / vendasAcumuladas);
			
			// Salario de tal id
			System.out.println(id +": ganha -> " + salario);
			
			// Esta de ferias?
			System.out.println("Ferias? " + estaDeFerias);
			
			// Status?
			System.out.println("Status? "+ status);
		}
}
