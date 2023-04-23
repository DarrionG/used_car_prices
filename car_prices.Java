import java.lang.Math;

public class car_prices() {
    private double RMSE;
    
    private void lossFunction(double[] y_actual, double[] y_predict) {
        double err = 0;
        int n = y_actual.length;

        for (int i = 0; i < n; i++){
            err = Math.pow((y_actual[i] - y_predict[i]), 2) + err;
        }

        RMSE = err / n;
    }

    private void gradientDecent() {
        
    }
    
    
    public static void main(String[] args) {
        int epochs = 1000;
        float lrate = 0.01;
        double theta, gradients;
        int m = 100;
        
        
    }
}