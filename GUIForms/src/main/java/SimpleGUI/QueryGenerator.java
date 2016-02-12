package SimpleGUI;

import java.io.File;

/**
 * Created by santhilata on 6/2/16.
 */
public class QueryGenerator {
    private int noEpochs;
    private String[] distributions;
    private int[] numbQs;
    private String[] distQueryrepetition;
    private int[] percentQueryRepetition;
    private String[] distSubQueryrepetition;
    private int[] percentSubqueryRepetition;
    private double[] meanValues ;
    private double[] meanExponentialValues;

    private int[] uniformLowerLimit ;
    private int[] uniformUpperLimit;


    public QueryGenerator(){}

    public int getNoEpochs() {
        return noEpochs;
    }

    public void setNoEpochs(int noEpochs) {
        this.noEpochs = noEpochs;
    }

    public String[] getDistributions() {
        return distributions;
    }

    public void setDistributions(String[] distributions) {
        this.distributions = distributions;
    }

    public int[] getNumbQs() {
        return numbQs;
    }

    public void setNumbQs(int[] numbQs) {
        this.numbQs = numbQs;
    }

    public int[] getPercentQueryRepetition() {
        return percentQueryRepetition;
    }

    public void setPercentQueryRepetition(int[] percentQueryRepetition) {
        this.percentQueryRepetition = percentQueryRepetition;
    }

    public int[] getPercentSubqueryRepetition() {
        return percentSubqueryRepetition;
    }

    public void setPercentSubqueryRepetition(int[] percentSubqueryRepetition) {
        this.percentSubqueryRepetition = percentSubqueryRepetition;
    }

    public double[] getMeanValues() {
        return meanValues;
    }

    public void setMeanValues(double[] meanValues) {
        this.meanValues = meanValues;
    }

    public double[] getMeanExponentialValues() {
        return meanExponentialValues;
    }

    public void setMeanExponentialValues(double[] meanExponentialValues) {
        this.meanExponentialValues = meanExponentialValues;
    }

    public int[] getUniformLowerLimit() {
        return uniformLowerLimit;
    }

    public void setUniformLowerLimit(int[] uniformLowerLimit) {
        this.uniformLowerLimit = uniformLowerLimit;
    }

    public int[] getUniformUpperLimit() {
        return uniformUpperLimit;
    }

    public void setUniformUpperLimit(int[] uniformUpperLimit) {
        this.uniformUpperLimit = uniformUpperLimit;
    }

    public String[] getDistQueryrepetition() {
        return distQueryrepetition;
    }

    public void setDistQueryrepetition(String[] distQueryrepetition) {
        this.distQueryrepetition = distQueryrepetition;
    }

    public String[] getDistSubQueryrepetition() {
        return distSubQueryrepetition;
    }

    public void setDistSubQueryrepetition(String[] distSubQueryrepetition) {
        this.distSubQueryrepetition = distSubQueryrepetition;
    }

    public File generateQuerySet(){
        File file = new File("");

        return file;
    }
}
