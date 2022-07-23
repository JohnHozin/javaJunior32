package lesson14;

import java.io.*;

public class Main {
    static int chet = 1;

    public static void main(String[] args) {

        try {
            FileInputStream fin = new FileInputStream("C://Java/ip.txt");
            int i;
            String result = "";
            while ((i = fin.read()) != -1) {
                if (i == 13) continue;
                else if (i == 10) {
                    String ip = result.split(":")[0];
                    int port = Integer.parseInt(result.split(":")[1]);
                    checkProxy(ip, port);
                    Main.chet++;
                    result = "";
                } else if (i == 9) {
                    result += ":";
                } else {
                    result += (char) i;
                }
            }
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void checkProxy(String ip, int port) {
//        // каждый второй айпи уходит в отдельный файл

        if (Main.chet % 2 == 0) {
            String testIP = Main.chet + ") " + ip + ":" + port + "\n";
            try {
                FileOutputStream fos = new FileOutputStream("C://Java/testIP.txt", true);
                byte[] buffer = testIP.getBytes();
                fos.write(buffer, 0, buffer.length);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
