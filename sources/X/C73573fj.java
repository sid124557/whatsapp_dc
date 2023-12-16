package X;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.3fj  reason: invalid class name and case insensitive filesystem */
public class C73573fj extends SSLSocketFactory {
    public final int A00 = 3;
    public final int A01 = 3;
    public final C56492s4 A02;
    public final SSLSocketFactory A03 = ((SSLSocketFactory) SSLSocketFactory.getDefault());

    public C73573fj(C56492s4 r3) {
        this.A02 = r3;
    }

    public static C73563fi A00(C73573fj r4, Object obj) {
        int i = r4.A00;
        return new C73563fi(r4.A02, (SSLSocket) obj, i, r4.A01);
    }

    public Socket createSocket(String str, int i) {
        return A00(this, this.A03.createSocket(str, i));
    }

    public String[] getDefaultCipherSuites() {
        return this.A03.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.A03.getSupportedCipherSuites();
    }

    public Socket createSocket(InetAddress inetAddress, int i) {
        return A00(this, this.A03.createSocket(inetAddress, i));
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return A00(this, this.A03.createSocket(str, i, inetAddress, i2));
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return A00(this, this.A03.createSocket(socket, str, i, z));
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return A00(this, this.A03.createSocket(inetAddress, i, inetAddress2, i2));
    }
}
