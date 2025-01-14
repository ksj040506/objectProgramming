public class PolicyRecommender {
    private final List<Map<String, String>> data;

    public PolicyRecommender(List<Map<String, String>> data) {
        this.data = data;
    }

    public void recommend() {
        Map<String, Double> demandScores = new HashMap<>();
        for (Map<String, String> record : data) {
            String region = record.get("행정동코드");
            double totalPopulation = Double.parseDouble(record.get("총생활인구수"));
            double seniorPopulation = Double.parseDouble(record.getOrDefault("65세이상", "0"));
            double score = totalPopulation * 0.7 + seniorPopulation * 0.3;
            demandScores.put(region, demandScores.getOrDefault(region, 0.0) + score);
        }
        demandScores.entrySet().stream()
            .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
            .forEach(entry -> 
                System.out.println("Region: " + entry.getKey() + ", Score: " + entry.getValue()));
    }
}
