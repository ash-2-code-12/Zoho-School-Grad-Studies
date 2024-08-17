package playmusic;

import java.util.Scanner;

public class MusicPlayerController {
    public static void main(String[] args) {
        Playable device = null;
        // = new MP3Player();
        // Playable cdPlayer = new CDPlayer();
        // Playable streamingPlayer = new StreamingPlayer();
        Scanner sc = new Scanner(System.in);

        int choice;
        while(true){
            System.out.println("1) MP3 Player\n 2) CD Player \n 3) Streaming Player" + "\nEnter choice :");
            choice= sc.nextInt();
            if(choice<1 || choice >3){
                System.out.println("\nEnter correct value");
                continue;
            }
            break;
        } 
        sc.close();

        switch (choice) {
            case 1:
                device = new MP3Player();
                break;
            case 2:
                device = new CDPlayer();
                break;
            case 3:
                device = new StreamingPlayer();
                break;
        
            default:
                break;
        }
        execute(device);
        
    }

    public static void execute(Playable device){

        System.out.println("Player : " + device.getClass());
        System.out.println("Play : ");
        device.play();
        System.out.println("Pause : ");
        device.pause();
        System.out.println("Stop : ");
        device.stop();

    }
}

