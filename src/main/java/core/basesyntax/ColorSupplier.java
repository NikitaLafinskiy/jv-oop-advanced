package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    public static final Random RANDOM = new Random();

    public String getRandomColor() {
        int randNumber = RANDOM.nextInt(Color.values().length);
        return Color.values()[randNumber].name();
    }
}

