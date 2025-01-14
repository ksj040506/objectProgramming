public class Main {
    public static void main(String[] args) {
        try {
            // 데이터 로드
            PopulationData localData = new DistrictPopulation();
            localData.loadData("data/LOCAL_PEOPLE_DONG_202412.csv");

            PopulationData longForeignerData = new DistrictPopulation();
            longForeignerData.loadData("data/LONG_FOREIGNER_DONG_202412.csv");

            PopulationData tempForeignerData = new CityPopulation();
            tempForeignerData.loadData("data/TEMP_FOREIGNER_GU_2023.csv");

            // 행정동 코드 매핑 로드
            Map<String, String> mapping = ExcelMappingLoader.loadMapping("data/행정동코드_매핑정보_20241218.xlsx");

            // 데이터 통합
            DataIntegrator integrator = new DataIntegrator();
            integrator.integrateData(localData, longForeignerData, tempForeignerData, mapping);

            // 결과 저장
            integrator.saveToCsv("data/IntegratedPopulationData.csv");

            // 시각화
            Map<String, Integer> timePopulation = new HashMap<>();
            for (Map<String, String> record : integrator.getIntegratedData()) {
                String time = record.get("시간대구분");
                int population = Integer.parseInt(record.get("총생활인구수"));
                timePopulation.put(time, timePopulation.getOrDefault(time, 0) + population);
            }
            DataVisualizer.showBarChart(timePopulation, "시간대별 총생활인구", "시간대", "총생활인구수");

        } catch (Exception e) {
            System.out.println("오류: " + e.getMessage());
        }
    }
}
