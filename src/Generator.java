import java.util.Random;

public class Generator {
    static String[] nouns = {"continuous testing", "continuous integration",
            "continuous deployment", "continuous improvement", "devops"};
    static String[] adj = {"complete", "modern", "self-service", "integrated", "end-to-end"};
    static String[] adverbs = {"remarkably", "enormously", "substantially", "significantly",
            "seriously"};
    static String[] verbs = {"accelerates", "improves", "enhances", "revamps", "boosts"};

    public static void main(String[] args) {
        System.out.println(generateRandomPhrase());
    }

    public static String generateRandomPhrase() {
        Random rand = new Random();
        String phrase = nouns[rand.nextInt(5)] + ' ' + adj[rand.nextInt(5)] + ' ' + adverbs[rand.nextInt(5)] + ' ' + verbs[rand.nextInt(5)];
        return phrase;
    }
}
