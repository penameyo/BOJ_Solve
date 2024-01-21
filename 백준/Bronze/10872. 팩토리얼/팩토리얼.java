import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long N = Long.parseLong(br.readLine());
		br.close();
		int result = 1;

		for (long A = 1; A <= N; A++) {
			result *= A;
		}
		System.out.println(result);
	}
}