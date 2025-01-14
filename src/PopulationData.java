import java.io.*;
import java.util.*;

abstract class PopulationData {
    protected List<Map<String, String>> records = new ArrayList<>();

    public abstract void loadData(String filePath) throws IOException;

    public void saveData(String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            if (!records.isEmpty()) {
                writer.write(String.join(",", records.get(0).keySet()));
                writer.newLine();
                for (Map<String, String> record : records) {
                    writer.write(String.join(",", record.values()));
                    writer.newLine();
                }
            }
        }
    }

    public List<Map<String, String>> getRecords() {
        return records;
    }
}
