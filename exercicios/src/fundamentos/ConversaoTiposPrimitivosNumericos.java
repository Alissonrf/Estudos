package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

		public static void main(String[] args) {
			
			double a = 1.1245677888; //IMPLICITA NO DOUBLE CABE MAISSSSS
			System.out.println(a);
			
			float b = (float) 1.1245677888; // EXPLICITA (CAST)
			System.out.println(b);
			
			int c = 340;
			byte d = (byte) c; //EXPLICA (CAST)
			System.out.println(d);
			
			double e = 1.9999999;
			int f = (int) e; //EXPLICA (CAST)
			System.out.println(f);
			
		}
}
