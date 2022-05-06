package classes;

public class ReplaceExplicit {
    // Phương thức cũ dựa vào tham số đầu vào để thực thi
    private int height, width;

    public int setValue(String name, int value) {
        if (name.equals("height")) {
            this.height = value;
            return height;
        }
        if (name.equals("width")) {
            this.width = value;
            return width;
        }
        return value;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void showValue() {
        System.out.println("Height: " + height + "\nWidth: " + width);
    }
}
