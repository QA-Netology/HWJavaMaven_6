import ru.netology.sqr.SQRService;

public class Main {

    public static void main(String[] args) {
        int min = 200;
        int max = 1000;

        SQRService service = new SQRService();
        System.out.println(service.calcSQR(min, max));

    }
}
