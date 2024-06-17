import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> pokemonsByName = new HashMap<>();
        Map<Integer, String> pokemonsByNumber = new HashMap<>();

        for (int i=0; i<n; i++) {
            String pokemon = br.readLine();
            pokemonsByName.put(pokemon, i+1);
            pokemonsByNumber.put(i+1, pokemon);
        }

        for (int i=0; i<m; i++) {
            String candidate = br.readLine();
            if (candidate.chars().allMatch(Character::isDigit)) {
                System.out.println(pokemonsByNumber.get(Integer.parseInt(candidate)));
            } else {
                System.out.println(pokemonsByName.get(candidate));
            }
        }
    }
}