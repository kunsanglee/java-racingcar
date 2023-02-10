package domain;

import error.ErrorMessage;

public class TryCount {
    public static final int MIN_COUNT = 1;

    private final int count;

    public TryCount(int count) {
        validate(count);
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    private void validate(int count) {
        if (count < MIN_COUNT) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_COUNT.getValue());
        }
    }
}