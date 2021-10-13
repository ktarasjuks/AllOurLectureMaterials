package lecture3;

public class LightDetector {
    public void detect(int lightSpectrum) {
        {
            if ((lightSpectrum >= 380) && (lightSpectrum <= 449)) {
                System.out.println("Violet");
            } else if ((lightSpectrum >= 450) && (lightSpectrum <= 494)) {
                System.out.println("Blue");
            } else if ((lightSpectrum >= 495) && (lightSpectrum <= 569)) {
                System.out.println("Green");
            } else if ((lightSpectrum >= 570) && (lightSpectrum <= 589)) {
                System.out.println("Yellow");
            } else if ((lightSpectrum >= 590) && (lightSpectrum <= 619)) {
                System.out.println("Orange");
            } else if ((lightSpectrum >= 620) && (lightSpectrum <= 750)) {
                System.out.println("Red");
            } else {
                System.out.println("Invisible");
            }
        }
    }
}
