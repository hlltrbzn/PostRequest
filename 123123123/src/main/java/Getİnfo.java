import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class Getİnfo {

	public static void main(String[] args) throws IOException {
		String body = "{\"name\": \"Apple iPad Air\", \"data\": { \"Generation\": \"4th\", \"Price\": \"519.99\", \"Capacity\": \"256 GB\" }}";
		URL url = new URL("http://localhost:8080/user");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		conn.setDoOutput(true);
		conn.setRequestProperty("Content-Type", "application/json");
		conn.setRequestProperty("User-Agent", "Mozilla/5.0");

		try (DataOutputStream dos = new DataOutputStream(conn.getOutputStream())) {
		    dos.writeBytes(body);
		}

		try (BufferedReader bf = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
		    String line;
		    while ((line = bf.readLine()) != null) {
		        System.out.println(line);
		    }
		}

	}

}
