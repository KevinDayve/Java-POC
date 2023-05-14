import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class PassingExample {
    public static void main(String[] args) {
        String name = "Kevin";
        String newname = change(name);
        System.out.println(newname);
    }

    @Contract(pure = true)
    static @NotNull String change(String name) {
        name = "Puss in Boots";
        return name;
    }
}
