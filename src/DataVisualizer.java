import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.util.*;

public class DataVisualizer {
    public static void showBarChart(Map<String, Integer> data, String title, String category, String value) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        data.forEach(dataset::setValue);

        JFreeChart chart = ChartFactory.createBarChart(title, category, value, dataset);
        displayChart(chart, title);
    }

    private static void displayChart(JFreeChart chart, String title) {
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        ChartPanel chartPanel = new ChartPanel(chart);
        frame.add(chartPanel);
        frame.setVisible(true);
    }
}
