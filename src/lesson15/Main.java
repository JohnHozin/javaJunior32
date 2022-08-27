package lesson15;

import java.io.FileInputStream;
import java.io.*;
import java.net.*;

public class Main {
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
                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            checkProxy(ip, port);
                        }
                    });
                    thread.start();
                    result = "";
                } else if (i == 9) {
                    result += ":";
                } else {
                    result += (char) i;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void checkProxy(String ip, int port) {
        try {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));
            URL url = new URL("https://vozhzhaev.ru/test.php");
            URLConnection connection = url.openConnection(proxy);
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            System.out.println("ip: " + ip + " port: " + port + " - РАБОТАЕТ!");
            in.close();
        } catch (Exception e) {
            //System.out.println("ip: " + ip + " port: " + port + " - НЕ РАБОТАЕТ!");
        }
    }
}