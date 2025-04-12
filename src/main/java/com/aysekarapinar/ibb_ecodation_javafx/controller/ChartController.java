package com.aysekarapinar.ibb_ecodation_javafx.controller;

import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;

public class ChartController {

    @FXML
    private PieChart pieChart;

    @FXML
    private LineChart<Number, Number> lineChart;

    @FXML
    private NumberAxis xAxis;

    @FXML
    private NumberAxis yAxis;

    public void initialize() {
        // Pie chart verileri
        PieChart.Data slice1 = new PieChart.Data("Category 1", 25);
        PieChart.Data slice2 = new PieChart.Data("Category 2", 50);
        PieChart.Data slice3 = new PieChart.Data("Category 3", 25);

        pieChart.getData().addAll(slice1, slice2, slice3);

        // Line chart verileri
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("Data Series");
        series.getData().add(new XYChart.Data<>(1, 10));
        series.getData().add(new XYChart.Data<>(2, 20));
        series.getData().add(new XYChart.Data<>(3, 30));
        lineChart.getData().add(series);
    }
}
