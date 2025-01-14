public class DataIntegrator {
    private final List<Map<String, String>> integratedData = new ArrayList<>();

    public void integrateData(PopulationData localData, PopulationData longForeignerData,
                              PopulationData tempForeignerData, Map<String, String> mapping) {
        for (Map<String, String> localRecord : localData.getRecords()) {
            String dongCode = localRecord.get("행정동코드");
            Map<String, String> mergedRecord = new HashMap<>(localRecord);
            mergedRecord.put("지역명", mapping.getOrDefault(dongCode, "Unknown"));

            for (Map<String, String> foreignRecord : longForeignerData.getRecords()) {
                if (dongCode.equals(foreignRecord.get("행정동코드"))) {
                    mergedRecord.put("장기체류외국인", foreignRecord.get("총생활인구수"));
                }
            }
            integratedData.add(mergedRecord);
        }
    }

    public List<Map<String, String>> getIntegratedData() {
        return integratedData;
    }
}
