package week11;

public enum Shapes {
    Circle("원형"),
    Oval("타원");

    private String ShapesName;

    private Shapes(String shapesName) {
        ShapesName = shapesName;
    }

    public String getShapesName() {
        return ShapesName;
    }

    public void setShapesName(String shapesName) {
        ShapesName = shapesName;
    }
}
