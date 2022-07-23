package lesson14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;
import java.net.*;

public class Main1 {
    public static void main(String[] args) {

        try {
            FileInputStream fin = new FileInputStream("C://Java/ip.txt");
            int i;
            String result ="";
            while ((i=fin.read())!=-1){
                if (i==13) continue;
                else if (i==10) {
                    String ip = result.split(":")[0];
                    int port = Integer.parseInt(result.split(":")[1]);
                    checkProxy(ip,port);
                    result = "";
                }
                else if (i==9){
                    result +=":";
                } else {
                    result+=(char) i;
                }
            }
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        ///////////// 2 пример //////////////////
//        try {
//            FileInputStream fin = new FileInputStream("C://Java/test.txt");
//            int i;
//            while ((i=fin.read())!=-1){
//                System.out.print((char) i);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//////////////// 1 пример ////////////////////////
//        String text = "Hello world!";
//        try {
//            FileOutputStream fos = new FileOutputStream("C://Java/test.txt",  true);
//            byte[] buffer = text.getBytes();
//
//            fos.write(buffer, 0 , buffer.length);
//            System.out.println("The file has been written");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    public static void checkProxy(String ip,int port){
        //System.out.println("Запрос к серверу с " + ip + ":" + port);
        // каждый второй айпи уходит в отдельный файл
        try {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));
            URL url = new URL("https://vozhzhaev.ru/test.php");
            URLConnection connection = url.openConnection(proxy);
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            System.out.println("ip: " + ip + " port: " + port + " - РАБОТАЕТ!");
            in.close();
        } catch (Exception e) {
            System.out.println("ip: " + ip + " port: " + port + " - НЕ РАБОТАЕТ!");
            //e.printStackTrace();
        }
    }
}
