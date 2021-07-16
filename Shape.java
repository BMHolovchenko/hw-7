abstract class Shape implements ShapeName {

    private final String name;

    protected Shape(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void printShape() {
        System.out.println(name);
    }
}
