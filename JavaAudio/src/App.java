import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class App {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);
        File sampleAudio = new File("file_example_WAV_1MG.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(sampleAudio);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);

        String response = "";
        while (!response.equals("Q")) {
            System.out.println("P = play Q = quit R = reset S = stop");
            System.out.println("Enter your choice: ");
            response = scanner.next();
            response = response.toUpperCase();
            switch (response) {
                case "P" -> clip.start();
                case "Q" -> clip.close();
                case "R" -> clip.setMicrosecondPosition(0);
                case "S" -> clip.stop();
                default -> System.out.println("Enter valid choice");
            }

        }
        System.out.println("player exited");

        scanner.close();

    }
}
