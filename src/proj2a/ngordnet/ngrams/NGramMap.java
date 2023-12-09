package proj2a.ngordnet.ngrams;

import edu.princeton.cs.introcs.In;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/** An object that provides utility methods for making queries on the
 *  Google NGrams dataset (or a subset thereof).
 *
 *  An NGramMap stores pertinent data from a "words file" and a "counts
 *  file". It is not a map in the strict sense, but it does provide additional
 *  functionality.
 *
 *  @author Josh Hug
 */
public class NGramMap {
    // map of words with record of thw word and TimeSeries
    Map<String, TimeSeries> wordInYears = new HashMap<String, TimeSeries>();
    TimeSeries totalCount = new TimeSeries();
    /** Constructs an NGramMap from WORDSFILENAME and COUNTSFILENAME. */
    public NGramMap(String wordsFilename, String countsFilename) {
        In words = new In(wordsFilename);
        String line, word;
        String[] tokens;
        Integer year;
        Double count;
        while (words.hasNextLine()) {
            line = words.readLine();
            tokens = line.split("[\t]+");
            word = tokens[0];
            year = Integer.parseInt(tokens[1]);
            count = Double.parseDouble(tokens[2]);
            if (wordInYears.containsKey(word)) {
                wordInYears.get(word).put(year, count);
            } else {
                TimeSeries ts = new TimeSeries();
                ts.put(year, count);
                wordInYears.put(word, ts);
            }
        }
        In wordCounts = new In(countsFilename);
        while (wordCounts.hasNextLine()) {
            line = wordCounts.readLine();
            tokens = line.split("[,]+");
            totalCount.put(Integer.parseInt(tokens[0]), Double.parseDouble(tokens[1]));
        }
    }

    /** Provides the history of WORD. The returned TimeSeries should be a copy,
     *  not a link to this NGramMap's TimeSeries. In other words, changes made
     *  to the object returned by this function should not also affect the
     *  NGramMap. This is also known as a "defensive copy". */
    public TimeSeries countHistory(String word) {
        TimeSeries originalTS = wordInYears.get(word);
        return new TimeSeries(originalTS, originalTS.firstKey(), originalTS.lastKey());
    }

    /** Provides the history of WORD between STARTYEAR and ENDYEAR, inclusive of both ends. The
     *  returned TimeSeries should be a copy, not a link to this NGramMap's TimeSeries. In other words,
     *  changes made to the object returned by this function should not also affect the
     *  NGramMap. This is also known as a "defensive copy". */
    public TimeSeries countHistory(String word, int startYear, int endYear) {
        TimeSeries originalTS = wordInYears.get(word);
        return new TimeSeries(originalTS, startYear, endYear);
    }

    /** Returns a defensive copy of the total number of words recorded per year in all volumes. */
    public TimeSeries totalCountHistory() {
        return null;
    }

    /** Provides a TimeSeries containing the relative frequency per year of WORD compared to
     *  all words recorded in that year. */
    public TimeSeries weightHistory(String word) {
        return null;
    }

    /** Provides a TimeSeries containing the relative frequency per year of WORD between STARTYEAR
     *  and ENDYEAR, inclusive of both ends. */
    public TimeSeries weightHistory(String word, int startYear, int endYear) {
        return null;
    }

    /** Returns the summed relative frequency per year of all words in WORDS. */
    public TimeSeries summedWeightHistory(Collection<String> words) {
        return null;
    }

    /** Provides the summed relative frequency per year of all words in WORDS
     *  between STARTYEAR and ENDYEAR, inclusive of both ends. If a word does not exist in
     *  this time frame, ignore it rather than throwing an exception. */
    public TimeSeries summedWeightHistory(Collection<String> words,
                              int startYear, int endYear) {
        return null;
    }


}
