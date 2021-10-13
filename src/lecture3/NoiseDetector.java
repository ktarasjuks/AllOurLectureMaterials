package lecture3;

public class NoiseDetector {

    public void check(int noiseDb) {
        if (noiseDb <= 39) {
            System.out.println("Faint");
        } else if ((noiseDb >= 40) && (noiseDb <= 69)) {
            System.out.println("Moderate");
        } else if ((noiseDb >= 70) && (noiseDb <= 99)) {
            System.out.println("Very Loud");
        } else if ((noiseDb >= 100) && (noiseDb <= 129)) {
            System.out.println("Extremely Loud");
        } else  {
            System.out.println("Painful");
        }
    }
}
