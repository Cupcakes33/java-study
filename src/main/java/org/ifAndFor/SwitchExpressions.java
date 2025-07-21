package org.ifAndFor;

public class SwitchExpressions {
    public static void main(String[] args) {
        SwitchExpressions switchExpressions = new SwitchExpressions();
//        switchExpressions.beforeSwitchExpressions();
        switchExpressions.afterSwitchExpressions();
    }

    public void beforeSwitchExpressions() {
        int score = 95;
        String grade;
        switch (score / 10) {
            case 10:
            case 9:
                grade = "A";
                // break;
                // break 문을 빠뜨리면 예상치 못한 버그가 발생할 수 있다.
            case 8:
                grade = "B";
                break;
            default:
                grade = "C";
        }
        System.out.println("학점: " + grade);
        // 학점: B
    }

    public void afterSwitchExpressions() {
        int score = 95;
        String grade = switch (score / 10) { // 결과를 변수에 바로 할당
            case 10, 9 -> "A"; // 쉼표로 여러 조건 묶기, -> 사용, break 불필요
            case 8 -> "B";
            default -> "C";
        }; // 세미콜론(;) 필수!
        System.out.println("학점: " + grade);
    }
}
