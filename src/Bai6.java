public class Bai6 {
    public static void main(String[] args) {
        String initialString = "Hello";
        String appendString = " World";
        int iterations = 1000000;

        // Nối chuỗi với String
        long startTime = System.currentTimeMillis();
        String resultString = initialString;
        for (int i = 0; i < iterations; i++) {
            resultString += appendString;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Thời gian với String: " + (endTime - startTime) + " ms");

        // Nối chuỗi với StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder(initialString);
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(appendString);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian với StringBuilder: " + (endTime - startTime) + " ms");

        // Nối chuỗi với StringBuffer
        startTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer(initialString);
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(appendString);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian với StringBuffer: " + (endTime - startTime) + " ms");
    }
}
