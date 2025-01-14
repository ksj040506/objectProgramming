// InvalidDataException: 잘못된 데이터 형식이 감지되었을 때 발생하는 사용자 정의 예외 클래스
public class InvalidDataException extends Exception {

    /**
     * 사용자 정의 예외 생성자
     * @param message 예외 메시지
     */
    public InvalidDataException(String message) {
        super(message);
    }
}
