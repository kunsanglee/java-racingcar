package racinggame;

import java.util.List;
import racinggame.domain.RoundResult;

class OutputView {

    private OutputView() {
    }

    public static void printResult(List<RoundResult> results) {
        results.forEach(OutputView::printEachResult);
    }

    private static void printEachResult(RoundResult result) {
        result.carInfos().forEach(carInfo ->
            System.out.format("%s : %s%n", carInfo.name(), "-".repeat(carInfo.position())));
        System.out.println();
    }

    public static void printWinner(List<String> results) {
        System.out.format("%s가 최종 우승했습니다.", String.join(", ", results));
    }
}