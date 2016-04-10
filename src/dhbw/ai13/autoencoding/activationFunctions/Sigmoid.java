package dhbw.ai13.autoencoding.activationFunctions;

import dhbw.ai13.autoencoding.ActivationFunction;

public class Sigmoid implements ActivationFunction {

    @Override
    public double[] function(double[] z) {
        double[] f = new double[z.length];
        for(int i = 0; i < f.length; i++){
            f[i] = function(z[i]);
        }
        return f;
    }

    @Override
    public double[] derivation(double[] z){
        double[] d = new double[z.length];
        for(int i = 0; i < d.length; i++){
            d[i] = function(z[i])*(1-function(z[i]));
        }
        return d;
    }

    @Override
    public double derivation(double z) {
        return function(z)*(1-function(z));
    }

    @Override
    public double function(double z){
        return 1.0/(1.0 + Math.exp(-z));
    }
}
