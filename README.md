# Population Analysis Project

## 프로젝트 개요
서울시 생활인구 데이터를 분석하여 행정수요를 예측하고 정책 설계에 필요한 기초 자료를 제공하는 프로그램입니다.  
시간대별, 지역별 생활인구 분석, 내국인과 외국인의 비율 비교, 특정 연령대 밀집 지역 분석, 그리고 행정 서비스 정책 추천을 수행합니다.

---

## 주요 기능
1. **데이터 통합**:
   - 내국인, 장기체류 외국인, 단기체류 외국인 데이터를 행정동 및 자치구 단위로 통합.
   - 지역 이름(행정동코드)을 매핑하여 가독성 향상.

2. **데이터 분석**:
   - 시간대별 총생활인구 분석.
   - 내국인과 외국인의 비율 계산.
   - 특정 연령대 및 성별 인구 밀집 지역 파악.

3. **시각화**:
   - 시간대별 생활인구 변화 (막대그래프).
   - 내국인과 외국인 비율 (파이차트).

4. **결과 저장**:
   - 통합 및 분석 결과를 CSV로 저장.

5. **행정 서비스 정책 지원**:
   - 분석 결과를 기반으로 행정 서비스 필요도 우선순위 설정.

---

## 기술 스택
- **프로그래밍 언어**: Java
- **라이브러리**:
  - Apache POI: Excel 파일 처리
  - JFreeChart: 데이터 시각화
- **빌드 도구**: Maven 또는 Gradle

---

## 디렉토리 구조
PopulationAnalysis/ │ ├── src/ # 소스 코드 디렉토리 │ ├── Main.java # 메인 클래스 │ ├── PopulationData.java # 추상 클래스 │ ├── DistrictPopulation.java # 행정동 데이터 처리 │ ├── CityPopulation.java # 자치구 데이터 처리 │ ├── PolicyRecommender.java # 정책 추천 │ ├── DataIntegrator.java # 데이터 통합 │ ├── DataVisualizer.java # 시각화 │ ├── ExcelMappingLoader.java # 행정동 매핑 로드 │ └── InvalidDataException.java # 사용자 정의 예외 │ ├── data/ # 데이터 파일 디렉토리 │ ├── LOCAL_PEOPLE_DONG_202412.csv │ ├── LONG_FOREIGNER_DONG_202412.csv │ ├── TEMP_FOREIGNER_GU_2023.csv │ └── 행정동코드_매핑정보_20241218.xlsx │ ├── lib/ # 라이브러리 디렉토리 │ ├── jfreechart-1.5.3.jar │ ├── poi-5.2.3.jar │ └── poi-ooxml-5.2.3.jar │ └── README.md # 실행 안내 및 설명

yaml
코드 복사

---

## 설치 및 실행 방법

### 1. **사전 준비**
- Java Development Kit (JDK) 11 이상 설치.
- Maven 또는 Gradle 설치 (빌드 도구).

### 2. **프로젝트 다운로드**
- 프로젝트를 다운로드하거나 클론합니다:
  ```bash
  git clone https://github.com/your-repo/PopulationAnalysis.git
  cd PopulationAnalysis
### 3. 데이터 파일 준비
-파일을 다운로드하여 data/ 디렉토리에 저장합니다:
    LOCAL_PEOPLE_DONG_202412.csv
    LONG_FOREIGNER_DONG_202412.csv
    TEMP_FOREIGNER_GU_2023.csv
    행정동코드_매핑정보_20241218.xlsx





