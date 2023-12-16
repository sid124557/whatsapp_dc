package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/* renamed from: X.1ga  reason: invalid class name and case insensitive filesystem */
public class C28281ga extends C34101uE {
    public final C384427o A00;

    public C28281ga(C384427o r1, AnonymousClass4DB r2) {
        super(r2);
        this.A00 = r1;
    }

    public void run() {
        Socket accept;
        super.run();
        ServerSocket serverSocket = null;
        try {
            ServerSocket serverSocket2 = new ServerSocket(8988);
            serverSocket = serverSocket2;
            Log.i("fpm/GetIpThread/Waiting for client socket accept...");
            accept = serverSocket2.accept();
            Log.i("fpm/GetIpThread/Client connected, obtaining IP address");
            String hostAddress = accept.getInetAddress().getHostAddress();
            if (hostAddress != null) {
                AnonymousClass4IQ r1 = (AnonymousClass4IQ) this.A00;
                if (r1.A01 != 0) {
                    Log.i("fpm/ReceiverConnectionHandler/Successfully sent IP address");
                } else {
                    ((C61002zX) r1.A00).A05.A00(hostAddress);
                }
            } else {
                Log.e("fpm/GetIpThread/Unable to get host address");
                this.A00.BRy();
            }
            accept.close();
        } catch (IOException e) {
            try {
                Log.e("fpm/GetIpThread/Error connecting with client or server socket closed", e);
                this.A00.BRy();
            } catch (Throwable th) {
                C624535b.A03(serverSocket);
                interrupt();
                throw th;
            }
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        C624535b.A03(serverSocket);
        interrupt();
        return;
        throw th;
    }
}
