import classes.IntroduceParameter;
import classes.Parameterize;
import classes.ReplaceExplicit;
import classes.ReplaceParameter;

public class App {

    public static void main(String[] args) throws Exception {
        // Parameterize Method
        // parameterizeMethod();

        // Replace Parameter with Explicit Methods
        // replaceExplicit();

        // Replace Parameter with Method Call
        // replaceParameter();
    }

    // Parameterize Method
    public static void parameterizeMethod() {
        System.out.println("\n========================= Parameterize Method =========================");
        Parameterize parameterize = new Parameterize();
        // Khai báo từng % số lương tăng
        parameterize.tenPercentRaise();
        parameterize.fivePercentRaise();

        // Gộp chung lại thành 1 nhân tố, % tăng của số lương sẽ là factor
        System.out.println("\nParameterize combine 2 method");
        parameterize.raise(0.5);
    }

    // Replace Parameter with Explicit Methods
    public static void replaceExplicit() {
        System.out.println(
                "\n========================= Replace Parameter with Explicit Methods =========================");
        ReplaceExplicit replaceExplicit = new ReplaceExplicit();
        // Sử dụng chung phương thức nhưng tách các phần tử như height và width, và phải
        // dựa vào tham số đầu vào. ( Để phân biệt là H hay W )
        replaceExplicit.setValue("height", 10);
        replaceExplicit.setValue("width", 40);
        replaceExplicit.showValue();

        // Phương thức này tách các phần tử trong nó thành 1 phương thức riêng biệt, chỉ
        // có duy nhất 1 tham số đầu vào là giá trị tham số độ dài hay độ cao, không cần
        // phải phân biệt chúng

        System.out.println("\nAfter separate each parts into method");
        replaceExplicit.setHeight(50);
        replaceExplicit.setWidth(50);
        replaceExplicit.showValue();
    }

    // Replace Parameter with Method Call
    public static void replaceParameter() {
        System.out.println(
                "\n========================= Replace Parameter with Method Call =========================");
        ReplaceParameter replaceParameter = new ReplaceParameter();
        replaceParameter.setQuantity(200);
        replaceParameter.getPrice();

        System.out.println("Price after Discount: " + replaceParameter.getPriceDiscounted());
    }
}
