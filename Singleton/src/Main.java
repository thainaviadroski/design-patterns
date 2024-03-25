import java.io.IOException;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		System.out.println("Start... ");
		try {
			Singleton s0 = Singleton.getInstance("");
			s0.createFile("Criando 01");
			Singleton s1 = Singleton.getInstance("");
			s1.createFile("Criando 02");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}