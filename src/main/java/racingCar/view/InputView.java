package racingCar.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private static Scanner scanner = new Scanner(System.in);

    private InputView() {}

    public static List<String> readCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String input = scanner.nextLine();
        String[] names = input.split(",");
        return Arrays.asList(names);
    }

    public static int readTryCount() {
        System.out.println("시도할 회수는 몇 회인가요?");
        String input = scanner.nextLine();
        return Integer.parseInt(input);
    }
}