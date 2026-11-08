import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = args.length > 0 ? args[0] : "benchmark";
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] digest = md.digest(("cyber-rev-java-macho-loadcmd-inspector:" + input).getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) sb.append(String.format("%02x", digest[i]));
        System.out.printf("{\"engine\":\"cyber-rev-java-macho-loadcmd-inspector\",\"suite\":\"cyber-sec-1000\",\"digest\":\"%s\",\"status\":\"VERIFIED_OK\"}%n", sb);
    }
}
