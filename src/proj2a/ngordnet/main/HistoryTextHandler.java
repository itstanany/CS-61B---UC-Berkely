package proj2a.ngordnet.main;

import proj2a.ngordnet.hugbrowsermagic.NgordnetQuery;
import proj2a.ngordnet.hugbrowsermagic.NgordnetQueryHandler;
import proj2a.ngordnet.ngrams.NGramMap;
import proj2a.ngordnet.ngrams.TimeSeries;

import java.util.List;

public class HistoryTextHandler extends NgordnetQueryHandler {
    private NGramMap map;
    public HistoryTextHandler(NGramMap map) {
        this.map = map;
    }

    @Override
    public String handle(NgordnetQuery q) {
        String output = "";
        List<String> words = q.words();
        int startYear = q.startYear();
        int endYear = q.endYear();
        for (String word: words) {
            TimeSeries ts = map.weightHistory(word, startYear, endYear);
            output += word + ": " + ts.toString() + "\n";
        }
        return output;
    }
}