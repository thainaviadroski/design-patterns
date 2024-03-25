import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public final class Singleton {
	private static Singleton instance;
	public String vlr;
	String name = "logged";
	private FileOutputStream log = new FileOutputStream(name + ".log", false);

	private Singleton(String vlr) throws IOException {
		this.vlr = vlr;
	}

	public static Singleton getInstance(String vlr) throws IOException {
		if (instance == null) {
			instance = new Singleton(vlr);
		}
		return instance;
	}

	public void createFile(String msgLogger) throws IOException {
		try {
			this.log.write(msgLogger.getBytes());
			log.write(System.getProperty("line.separator").getBytes());
			this.log.flush();
			System.out.println("GREAT, LOGGER created...");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
