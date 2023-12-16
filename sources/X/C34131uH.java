package X;

import android.os.CancellationSignal;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

/* renamed from: X.1uH  reason: invalid class name and case insensitive filesystem */
public class C34131uH extends C173778Rq {
    public final C28901hx A00;
    public final String A01;
    public final String A02;
    public final Socket A03;

    public C34131uH(C28901hx r2, String str, String str2, Socket socket) {
        super("DonorNetworkingThread");
        this.A01 = str;
        this.A02 = str2;
        this.A03 = socket;
        this.A00 = r2;
    }

    public void run() {
        try {
            Log.i("fpm/DonorNetworkingThread/Attempting to connect to receiver");
            Socket socket = this.A03;
            socket.bind((SocketAddress) null);
            socket.connect(new InetSocketAddress(this.A02, 8988), 5000);
            Log.i("fpm/DonorNetworkingThread/Connected to receiver");
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            AnonymousClass36H.A02((CancellationSignal) null, new C28321ge(this.A01.getBytes(C58152un.A0B), (byte[]) null, 300), outputStream);
            this.A00.A0B(inputStream, outputStream);
        } catch (IOException e) {
            Log.e("fpm/DonorNetworkingThread/error connecting to server socket", e);
            this.A00.A0A(604, "error connecting to server socket");
            C624535b.A03(this.A03);
            interrupt();
            Log.i("fpm/DonorNetworkingThread/socket closed and thread interrupted");
        }
    }
}
