package X;

import java.net.Socket;

/* renamed from: X.1gb  reason: invalid class name and case insensitive filesystem */
public class C28291gb extends C34101uE {
    public final String A00;
    public final Socket A01;

    public C28291gb(AnonymousClass4DB r1, String str, Socket socket) {
        super(r1);
        this.A01 = socket;
        this.A00 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        com.whatsapp.util.Log.e("fpm/SendIpThread/Failed to connect, retrying");
        java.lang.Thread.sleep((long) 1000);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        if (r2 >= 3) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        r5.A00.BRy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        X.C624535b.A03(r5.A01);
        interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0068, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
            super.run()
            java.net.Socket r3 = r5.A01     // Catch:{ IOException | InterruptedException -> 0x004b }
            r0 = 0
            r3.bind(r0)     // Catch:{ IOException | InterruptedException -> 0x004b }
            java.lang.String r0 = "fpm/SendIpThread/Trying to connect to server socket"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException | InterruptedException -> 0x004b }
            r2 = 0
        L_0x000f:
            java.lang.String r4 = r5.A00     // Catch:{ ConnectException -> 0x0035, IOException | InterruptedException -> 0x004b }
            r0 = 8988(0x231c, float:1.2595E-41)
            java.net.InetSocketAddress r1 = new java.net.InetSocketAddress     // Catch:{ ConnectException -> 0x0035, IOException | InterruptedException -> 0x004b }
            r1.<init>(r4, r0)     // Catch:{ ConnectException -> 0x0035, IOException | InterruptedException -> 0x004b }
            r0 = 5000(0x1388, float:7.006E-42)
            r3.connect(r1, r0)     // Catch:{ ConnectException -> 0x0035, IOException | InterruptedException -> 0x004b }
            X.4DB r1 = r5.A00     // Catch:{ ConnectException -> 0x0035, IOException | InterruptedException -> 0x004b }
            X.4IQ r1 = (X.AnonymousClass4IQ) r1     // Catch:{ ConnectException -> 0x0035, IOException | InterruptedException -> 0x004b }
            int r0 = r1.A01     // Catch:{ ConnectException -> 0x0035, IOException | InterruptedException -> 0x004b }
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = "fpm/ReceiverConnectionHandler/Successfully sent IP address"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ ConnectException -> 0x0035, IOException | InterruptedException -> 0x004b }
            goto L_0x0056
        L_0x002b:
            java.lang.Object r0 = r1.A00     // Catch:{ ConnectException -> 0x0035, IOException | InterruptedException -> 0x004b }
            X.2zX r0 = (X.C61002zX) r0     // Catch:{ ConnectException -> 0x0035, IOException | InterruptedException -> 0x004b }
            X.2We r0 = r0.A05     // Catch:{ ConnectException -> 0x0035, IOException | InterruptedException -> 0x004b }
            r0.A00(r4)     // Catch:{ ConnectException -> 0x0035, IOException | InterruptedException -> 0x004b }
            goto L_0x0056
        L_0x0035:
            java.lang.String r0 = "fpm/SendIpThread/Failed to connect, retrying"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException | InterruptedException -> 0x004b }
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0     // Catch:{ IOException | InterruptedException -> 0x004b }
            java.lang.Thread.sleep(r0)     // Catch:{ IOException | InterruptedException -> 0x004b }
            int r2 = r2 + 1
            r0 = 3
            if (r2 < r0) goto L_0x000f
            X.4DB r0 = r5.A00     // Catch:{ IOException | InterruptedException -> 0x004b }
            r0.BRy()     // Catch:{ IOException | InterruptedException -> 0x004b }
            goto L_0x0056
        L_0x004b:
            r1 = move-exception
            java.lang.String r0 = "fpm/SendIpThread/Failure while sending IP"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x005f }
            X.4DB r0 = r5.A00     // Catch:{ all -> 0x005f }
            r0.BRy()     // Catch:{ all -> 0x005f }
        L_0x0056:
            java.net.Socket r0 = r5.A01
            X.C624535b.A03(r0)
            r5.interrupt()
            return
        L_0x005f:
            r1 = move-exception
            java.net.Socket r0 = r5.A01
            X.C624535b.A03(r0)
            r5.interrupt()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28291gb.run():void");
    }
}
