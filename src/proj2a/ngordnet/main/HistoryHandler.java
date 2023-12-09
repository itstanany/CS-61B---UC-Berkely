package proj2a.ngordnet.main;

import org.knowm.xchart.XYChart;
import proj2a.ngordnet.hugbrowsermagic.NgordnetQuery;
import proj2a.ngordnet.hugbrowsermagic.NgordnetQueryHandler;
import proj2a.ngordnet.ngrams.NGramMap;
import proj2a.ngordnet.ngrams.TimeSeries;
import proj2a.ngordnet.plotting.Plotter;

import java.util.ArrayList;
import java.util.List;

public class HistoryHandler extends NgordnetQueryHandler {
    private NGramMap map;
    public HistoryHandler(NGramMap map) {
        this.map = map;
    }
    @Override
    public String handle(NgordnetQuery q) {
        List<String> words = q.words();
        int startYear = q.startYear();
        int endYear = q.endYear();
        ArrayList<TimeSeries> lts = new ArrayList<>();
        ArrayList<String> labels = new ArrayList<>();
        for (String word: words) {
            TimeSeries ts = map.weightHistory(word, startYear, endYear);
            lts.add(ts);
            labels.add(word);
        }
        XYChart chart = Plotter.generateTimeSeriesChart(labels, lts);
        String encodedImage = Plotter.encodeChartAsString(chart);
        return encodedImage;
    }
}