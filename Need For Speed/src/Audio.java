import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class    Audio implements Runnable {

    @Override
    public void run() {
        try {
            File soundFile = new File("resources/flatout_2_12. Alkaline Trio - Mercy Me.wav"); //Звуковой файл
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(ais);
            clip.setFramePosition(0);
            clip.start();

            Thread.sleep(clip.getMicrosecondLength()/1000);
            clip.stop();
            clip.close();
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
            exc.printStackTrace();
        } catch (InterruptedException exc) {}



    }
}
