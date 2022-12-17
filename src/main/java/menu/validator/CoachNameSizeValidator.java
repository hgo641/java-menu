package menu.validator;

import menu.exception.SizeException;

public class CoachNameSizeValidator implements SizeValidator {
    private static final int MIN_SIZE = 2;
    private static final int MAX_SIZE = 4;
    private static final String NAME = "코치 이름";

    @Override
    public void validate(int size) {
        if (isLessThanMinSize(size) || isGreaterThanMaxSize(size)) {
            throw new SizeException(NAME, MIN_SIZE, MAX_SIZE);
        }
    }

    @Override
    public boolean isLessThanMinSize(int size) {
        return size < MIN_SIZE;
    }

    @Override
    public boolean isGreaterThanMaxSize(int size) {
        return size > MAX_SIZE;
    }
}