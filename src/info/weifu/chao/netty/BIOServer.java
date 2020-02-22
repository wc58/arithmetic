package info.weifu.chao.netty;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BIOServer {

    public static void main(String[] args) throws Exception {

        ExecutorService threadPool = Executors.newCachedThreadPool();
        ServerSocket serverSocket = new ServerSocket(6666);
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("连接到一个客户端");
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    handler(socket);
                }
            });
        }
    }

    public static void handler(Socket socket) {
        System.out.println("线程：id=" + Thread.currentThread().getId() + "name=" + Thread.currentThread().getName());
        byte[] bytes = new byte[1024];
        try {
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(new String("Hello Client").getBytes());
            InputStream inputStream = socket.getInputStream();
            while (true) {
                System.out.println("线程：id=" + Thread.currentThread().getId() + "name=" + Thread.currentThread().getName());
                int read = inputStream.read(bytes);
                if (read != -1) {
                    System.out.println(new String(bytes, 0, read));
                } else {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("连接关闭了");
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
