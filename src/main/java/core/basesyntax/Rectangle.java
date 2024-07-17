package core.basesyntax;

class Rectangle extends Figure {
    private int rightSide;
    private int topSide;

    public Rectangle(String color, int topSide, int rightSide) {
        super(color);
        this.rightSide = rightSide;
        this.topSide = topSide;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: the top side is of length: ")
                .append(topSide)
                .append(" the right side is of length: ")
                .append(rightSide)
                .append(" and the color is ")
                .append(color);
        System.out.println(builder.toString());

        // Ignore the console log below, it made it for the purpose of committing again with no changes made
        System.out.println("Some new change made")
    }
}
