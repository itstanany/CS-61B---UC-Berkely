package proj2b.ngordnet.main;

import proj2a.ngordnet.main.HistoryHandler;
import proj2a.ngordnet.main.HistoryTextHandler;
import proj2a.ngordnet.ngrams.NGramMap;
import proj2b.ngordnet.hugbrowsermagic.HugNgordnetServer;

public class Main {
    public static void main(String[] args) {
        HugNgordnetServer hns = new HugNgordnetServer();
        String wordFile = "src/data/ngrams/top_49887_words.csv";
        String countFile = "src/data/ngrams/total_counts.csv";

        String synsetFile = "src/data/wordnet/synsets.txt";
        String hyponymFile = "src/data/wordnet/hyponyms.txt";

        NGramMap ngm = new NGramMap(wordFile, countFile);

        hns.startUp();
        hns.register("history", new HistoryHandler(ngm));
        hns.register("historytext", new HistoryTextHandler(ngm));
    }
}
