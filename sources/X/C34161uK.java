package X;

import com.whatsapp.util.Log;
import java.net.ServerSocket;
import java.net.Socket;

/* renamed from: X.1uK  reason: invalid class name and case insensitive filesystem */
public class C34161uK extends C173778Rq {
    public Socket A00;
    public final C28901hx A01;
    public final AnonymousClass2HF A02;
    public final String A03;
    public final ServerSocket A04;

    public C34161uK(C28901hx r2, AnonymousClass2HF r3, String str, ServerSocket serverSocket) {
        super("ReceiverNetworkingThread");
        this.A03 = str;
        this.A04 = serverSocket;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void A00() {
        C624535b.A03(this.A00);
        C624535b.A03(this.A04);
        interrupt();
        Log.i("fpm/ReceiverNetworkingThread/sockets closed and thread interrupted");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:25|26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
        throw new X.C36811zv();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0075 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r6 = this;
            java.lang.String r0 = "fpm/ReceiverNetworkingThread/Waiting for donor to connect"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            java.net.ServerSocket r0 = r6.A04     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            java.net.Socket r0 = r0.accept()     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            r6.A00 = r0     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            java.lang.String r0 = "fpm/ReceiverNetworkingThread/Donor connected"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            X.2HF r0 = r6.A02     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            com.whatsapp.migration.transfer.service.ReceiverP2pTransferService r3 = r0.A00     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            X.2cA r1 = r3.A05     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            if (r1 == 0) goto L_0x002f
            X.1gc r0 = r1.A00     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = "fpm/ReceiverConnectionHandler/stopping discoverable service"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            X.1gc r0 = r1.A00     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            android.net.wifi.p2p.WifiP2pManager r2 = r0.A01     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            if (r2 == 0) goto L_0x002f
            android.net.wifi.p2p.WifiP2pManager$Channel r1 = r0.A00     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            r0 = 0
            r2.clearLocalServices(r1, r0)     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
        L_0x002f:
            X.1hx r0 = r3.A04     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            r0.A08()     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            java.net.Socket r0 = r6.A00     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            java.io.InputStream r5 = r0.getInputStream()     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            java.net.Socket r0 = r6.A00     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            java.io.OutputStream r4 = r0.getOutputStream()     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            r0 = 0
            X.32w r2 = X.AnonymousClass36H.A00(r0, r5)     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            int r1 = r2.A01     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            r0 = 300(0x12c, float:4.2E-43)
            if (r1 != r0) goto L_0x007b
            java.lang.String r3 = r6.A03     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            long r1 = r2.A02     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            int r0 = (int) r1     // Catch:{ SocketException -> 0x0075 }
            byte[] r2 = new byte[r0]     // Catch:{ SocketException -> 0x0075 }
            int r1 = r5.read(r2)     // Catch:{ SocketException -> 0x0075 }
            r0 = -1
            if (r1 == r0) goto L_0x006e
            java.lang.String r0 = X.C18320x8.A0h(r2)     // Catch:{ SocketException -> 0x0075 }
            boolean r0 = r3.equals(r0)     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = "fpm/ReceiverNetworkingThread/auth token verified"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            X.1hx r0 = r6.A01     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            r0.A0B(r5, r4)     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            return
        L_0x006e:
            java.lang.String r0 = "No bytes to read"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ SocketException -> 0x0075 }
            throw r0     // Catch:{ SocketException -> 0x0075 }
        L_0x0075:
            X.1zv r0 = new X.1zv     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            r0.<init>()     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            throw r0     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
        L_0x007b:
            X.1hx r2 = r6.A01     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            r1 = 107(0x6b, float:1.5E-43)
            java.lang.String r0 = "auth token does not match"
            r2.A0A(r1, r0)     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            r6.A00()     // Catch:{ SocketException -> 0x009c, IOException -> 0x0088 }
            return
        L_0x0088:
            r1 = move-exception
            java.lang.String r0 = "fpm/ReceiverNetworkingThread/server socket error occurred while waiting for connection"
            com.whatsapp.util.Log.e(r0, r1)
            X.1hx r2 = r6.A01
            r1 = 601(0x259, float:8.42E-43)
            java.lang.String r0 = "server socket error occurred while waiting for connection"
            r2.A0A(r1, r0)
            r6.A00()
            return
        L_0x009c:
            java.lang.String r0 = "fpm/ReceiverNetworkingThread/socket closed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34161uK.run():void");
    }
}
