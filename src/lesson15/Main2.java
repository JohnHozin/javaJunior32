package lesson15;

import java.io.FileInputStream;
import java.io.*;
import java.net.*;

public class Main2 {
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
                    Thread thread = new Thread(new MyRunnableClassHome(ip, port));
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
            FileOutputStream fos = new FileOutputStream("C://Java/testIpProxy2.txt", true);
            String testIP = ip + ":" + port + "\n";
            byte[] buffer = testIP.getBytes();
            fos.write(buffer, 0, buffer.length);
            in.close();
        } catch (Exception e) {
            //System.out.println("ip: " + ip + " port: " + port + " - НЕ РАБОТАЕТ!");
        }
    }
}

class MyRunnableClassHome implements Runnable {
    private String ip;
    private int port;

    public MyRunnableClassHome(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    @Override
    public void run() {
        Main2.checkProxy(this.ip, this.port);
    }
}