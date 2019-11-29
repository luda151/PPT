import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Tool_IO {
	public Tool_IO() {}

	public void writeFirst (String f) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("soubor.txt")))
		{
			bw.write(f);
			bw.flush();
		}
		catch (Exception e)
		{
			System.err.println("Do souboru se nepovedlo zapsat.");
		}
	}

	public void writeToFile (String f) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("soubor.txt",true)))
		{
			bw.write(f);
			bw.flush();
		}
		catch (Exception e)
		{
			System.err.println("Do souboru se nepovedlo zapsat.");
		}
	}
	
	public void writeNewLine () {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("soubor.txt",true)))
		{
			bw.newLine();
			bw.flush();
		}
		catch (Exception e)
		{
			System.err.println("Do souboru se nepovedlo zapsat.");
		}
	}
	
	public void read() {
		System.out.println("Vypisuji celý soubor:");
		try (BufferedReader br = new BufferedReader(new FileReader("soubor.txt")))
		{
		    String s;
		    while ((s = br.readLine()) != null)
		    {
		        System.out.println(s);
		    }
		}
		catch (Exception e)
		{
		    System.err.println("Chyba při čtení ze souboru.");
		}
	}
}
