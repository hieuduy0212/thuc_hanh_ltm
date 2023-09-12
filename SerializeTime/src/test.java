/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELLLTT5521
 */
public class test {

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        // Gọi hàm bạn muốn đo thời gian ở đây
        yourFunctionToMeasure();

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        // Chuyển đổi thời gian tính bằng nanoseconds thành milliseconds
        double elapsedTimeInMilliseconds = (double) elapsedTime / 1_000_000;

        System.out.println("Thời gian chạy hàm là: " + elapsedTimeInMilliseconds + " milliseconds");
    }

    // Định nghĩa hàm bạn muốn đo thời gian ở đây
    public static void yourFunctionToMeasure() {
        // Đây là nơi để bạn thêm mã của hàm cần đo thời gian
        // Ví dụ:
        for (int i = 0; i < 1000000; i++) {
            // Thực hiện công việc gì đó ở đây
        }
    }
}
