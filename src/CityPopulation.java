public class CityPopulation extends PopulationData {
    @Override
    public void loadData(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String[] headers = reader.readLine().split(",");
        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split(",");
            Map<String, String> record = new HashMap<>();
            for (int i = 0; i < headers.length; i++) {
                record.put(headers[i], values[i]);
            }
            records.add(record);
        }
    }
}
