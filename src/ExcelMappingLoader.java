import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

// ExcelMappingLoader: Excel 파일에서 행정동 코드 매핑 정보를 로드하는 클래스
public class ExcelMappingLoader {

    /**
     * Excel 파일에서 행정동 코드와 지역 이름을 매핑한 Map을 로드합니다.
     * @param excelFilePath Excel 파일 경로
     * @return 행정동 코드와 지역 이름의 매핑 Map
     * @throws IOException 파일 읽기 오류 발생 시
     */
    public static Map<String, String> loadMapping(String excelFilePath) throws IOException {
        Map<String, String> mapping = new HashMap<>();

        try (FileInputStream fis = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0); // 첫 번째 시트를 로드
            for (Row row : sheet) {
                Cell dongCodeCell = row.getCell(0); // 행정동 코드
                Cell regionNameCell = row.getCell(4); // 지역 이름

                if (dongCodeCell != null && regionNameCell != null) {
                    String dongCode = dongCodeCell.getStringCellValue();
                    String regionName = regionNameCell.getStringCellValue();
                    mapping.put(dongCode, regionName);
                }
            }
        }

        return mapping;
    }
}
