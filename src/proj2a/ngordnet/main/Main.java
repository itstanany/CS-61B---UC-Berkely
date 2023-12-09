package proj2a.ngordnet.main;

import proj2a.ngordnet.hugbrowsermagic.HugNgordnetServer;
import proj2a.ngordnet.ngrams.NGramMap;

public class Main {
    public static void main(String[] args) {
        HugNgordnetServer hns = new HugNgordnetServer();


        String wordFile = "src/proj2a/data/ngrams/top_14377_words.csv";
        String countFile = "src/proj2a/data/ngrams/total_counts.csv";
        NGramMap ngm = new NGramMap(wordFile, countFile);



        hns.startUp();
        hns.register("history", new HistoryHandler(ngm));
        hns.register("historytext", new HistoryTextHandler(ngm));
    }
}
