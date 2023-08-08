package AssignmentWeek7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.xml.sax.InputSource;

public class Week7_5 {
	public static void main(String[] args) {
		InputStreamReader sc = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sc);
		try {
			String nu = br.readLine();
			int x = Integer.parseInt(nu);
			System.out.println(x * x);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
