package com.practice;

class CPU_Load_Usage {

    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        int numCores = rt.availableProcessors();

        while(true) {
            // Create threads equal to number of cores
            for(int i=0; i<numCores; i++) {
                CPUHeavyLoad t = new CPUHeavyLoad();
                t.start();
            }
        }

    }

}

class CPUHeavyLoad extends Thread {

    public void run() {
        while(true) {
            // Math operation for CPU loading
            double d = 100009000.001 / 12323232.1221;
        }
    }

}