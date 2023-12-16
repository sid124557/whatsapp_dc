package X;

import android.net.SSLSessionCache;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.3fk  reason: invalid class name and case insensitive filesystem */
public class C73583fk extends SSLSocketFactory {
    public final /* synthetic */ SSLSessionCache A00;
    public final /* synthetic */ C32561r8 A01;
    public final /* synthetic */ SSLContext A02;
    public final /* synthetic */ SSLSocketFactory A03;

    public C73583fk(SSLSessionCache sSLSessionCache, C32561r8 r2, SSLContext sSLContext, SSLSocketFactory sSLSocketFactory) {
        this.A01 = r2;
        this.A03 = sSLSocketFactory;
        this.A02 = sSLContext;
        this.A00 = sSLSessionCache;
    }

    public static void A00(C73583fk r3, String str, Socket socket, int i) {
        C32561r8 r2 = r3.A01;
        r2.A02(socket);
        C617231z.A00(r3.A00, str, r3.A02, i);
        r2.A00.incrementAndGet();
    }

    public Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.A03.createSocket(inetAddress, i);
        C32561r8 r3 = this.A01;
        r3.A02(createSocket);
        C617231z.A00(this.A00, inetAddress.getHostName(), this.A02, i);
        r3.A00.incrementAndGet();
        return createSocket;
    }

    public String[] getDefaultCipherSuites() {
        return this.A03.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.A03.getSupportedCipherSuites();
    }

    public Socket createSocket(String str, int i) {
        Socket createSocket = this.A03.createSocket(str, i);
        A00(this, str, createSocket, i);
        return createSocket;
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.A03.createSocket(inetAddress, i, inetAddress2, i2);
        C32561r8 r3 = this.A01;
        r3.A02(createSocket);
        C617231z.A00(this.A00, inetAddress2.getHostName(), this.A02, i);
        r3.A00.incrementAndGet();
        return createSocket;
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.A03.createSocket(socket, str, i, z);
        A00(this, str, createSocket, i);
        return createSocket;
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.A03.createSocket(str, i, inetAddress, i2);
        A00(this, str, createSocket, i);
        return createSocket;
    }
}
