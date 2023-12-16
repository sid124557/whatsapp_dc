package X;

import android.text.TextUtils;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* renamed from: X.3fi  reason: invalid class name and case insensitive filesystem */
public class C73563fi extends SSLSocket {
    public final int A00;
    public final int A01;
    public final C56492s4 A02;
    public final SSLSocket A03;

    public synchronized void close() {
        this.A03.close();
    }

    public synchronized int getReceiveBufferSize() {
        return this.A03.getReceiveBufferSize();
    }

    public synchronized int getSendBufferSize() {
        return this.A03.getSendBufferSize();
    }

    public synchronized int getSoTimeout() {
        return this.A03.getSoTimeout();
    }

    public synchronized void setReceiveBufferSize(int i) {
        this.A03.setReceiveBufferSize(i);
    }

    public synchronized void setSendBufferSize(int i) {
        this.A03.setSendBufferSize(i);
    }

    public synchronized void setSoTimeout(int i) {
        this.A03.setSoTimeout(i);
    }

    public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.A03.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    public void bind(SocketAddress socketAddress) {
        this.A03.bind(socketAddress);
    }

    public void connect(SocketAddress socketAddress) {
        this.A03.connect(socketAddress);
    }

    public SocketChannel getChannel() {
        return this.A03.getChannel();
    }

    public boolean getEnableSessionCreation() {
        return this.A03.getEnableSessionCreation();
    }

    public String[] getEnabledCipherSuites() {
        return this.A03.getEnabledCipherSuites();
    }

    public String[] getEnabledProtocols() {
        return this.A03.getEnabledProtocols();
    }

    public InetAddress getInetAddress() {
        return this.A03.getInetAddress();
    }

    public InputStream getInputStream() {
        return new C36851zz(this.A02, this.A03.getInputStream(), Integer.valueOf(this.A00), Integer.valueOf(this.A01));
    }

    public boolean getKeepAlive() {
        return this.A03.getKeepAlive();
    }

    public InetAddress getLocalAddress() {
        return this.A03.getLocalAddress();
    }

    public int getLocalPort() {
        return this.A03.getLocalPort();
    }

    public SocketAddress getLocalSocketAddress() {
        return this.A03.getLocalSocketAddress();
    }

    public boolean getNeedClientAuth() {
        return this.A03.getNeedClientAuth();
    }

    public boolean getOOBInline() {
        return this.A03.getOOBInline();
    }

    public OutputStream getOutputStream() {
        return new AnonymousClass203(this.A02, this.A03.getOutputStream(), Integer.valueOf(this.A00), Integer.valueOf(this.A01));
    }

    public int getPort() {
        return this.A03.getPort();
    }

    public SocketAddress getRemoteSocketAddress() {
        return this.A03.getRemoteSocketAddress();
    }

    public boolean getReuseAddress() {
        return this.A03.getReuseAddress();
    }

    public SSLParameters getSSLParameters() {
        return this.A03.getSSLParameters();
    }

    public SSLSession getSession() {
        return this.A03.getSession();
    }

    public int getSoLinger() {
        return this.A03.getSoLinger();
    }

    public String[] getSupportedCipherSuites() {
        return this.A03.getSupportedCipherSuites();
    }

    public String[] getSupportedProtocols() {
        return this.A03.getSupportedProtocols();
    }

    public boolean getTcpNoDelay() {
        return this.A03.getTcpNoDelay();
    }

    public int getTrafficClass() {
        return this.A03.getTrafficClass();
    }

    public boolean getUseClientMode() {
        return this.A03.getUseClientMode();
    }

    public boolean getWantClientAuth() {
        return this.A03.getWantClientAuth();
    }

    public boolean isBound() {
        return this.A03.isBound();
    }

    public boolean isClosed() {
        return this.A03.isClosed();
    }

    public boolean isConnected() {
        return this.A03.isConnected();
    }

    public boolean isInputShutdown() {
        return this.A03.isInputShutdown();
    }

    public boolean isOutputShutdown() {
        return this.A03.isOutputShutdown();
    }

    public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.A03.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    public void sendUrgentData(int i) {
        this.A03.sendUrgentData(i);
    }

    public void setEnableSessionCreation(boolean z) {
        this.A03.setEnableSessionCreation(z);
    }

    public void setEnabledCipherSuites(String[] strArr) {
        this.A03.setEnabledCipherSuites(strArr);
    }

    public void setEnabledProtocols(String[] strArr) {
        String[] strArr2;
        SSLSocket sSLSocket = this.A03;
        int length = strArr.length;
        if (length >= 1) {
            if (length != 1) {
                strArr2 = strArr;
            } else if ("SSLv3".equals(strArr[0])) {
                strArr2 = sSLSocket.getSupportedProtocols();
            }
            ArrayList A0s = AnonymousClass001.A0s();
            for (String str : strArr2) {
                if (!"SSLv3".equals(str)) {
                    A0s.add(str);
                }
            }
            if (length != A0s.size() || length == 1) {
                C18260x0.A1L(AnonymousClass000.A0l("accounting-socket/set-enabled-protocols/current-list: "), TextUtils.join(", ", strArr));
                C18260x0.A1L(AnonymousClass000.A0l("accounting-socket/set-enabled-protocols/modified-list: "), TextUtils.join(", ", A0s));
            } else {
                TextUtils.join(", ", strArr);
                TextUtils.join(", ", A0s);
            }
            if (!A0s.isEmpty()) {
                strArr = C18300x5.A1b(A0s);
            }
            sSLSocket.setEnabledProtocols(strArr);
        }
        C18260x0.A1L(AnonymousClass000.A0l("accounting-socket/set-enabled-protocols/current-list: "), TextUtils.join(", ", strArr));
        sSLSocket.setEnabledProtocols(strArr);
    }

    public void setKeepAlive(boolean z) {
        this.A03.setKeepAlive(z);
    }

    public void setNeedClientAuth(boolean z) {
        this.A03.setNeedClientAuth(z);
    }

    public void setOOBInline(boolean z) {
        this.A03.setOOBInline(z);
    }

    public void setPerformancePreferences(int i, int i2, int i3) {
        this.A03.setPerformancePreferences(i, i2, i3);
    }

    public void setReuseAddress(boolean z) {
        this.A03.setReuseAddress(z);
    }

    public void setSSLParameters(SSLParameters sSLParameters) {
        this.A03.setSSLParameters(sSLParameters);
    }

    public void setSoLinger(boolean z, int i) {
        this.A03.setSoLinger(z, i);
    }

    public void setTcpNoDelay(boolean z) {
        this.A03.setTcpNoDelay(z);
    }

    public void setTrafficClass(int i) {
        this.A03.setTrafficClass(i);
    }

    public void setUseClientMode(boolean z) {
        this.A03.setUseClientMode(z);
    }

    public void setWantClientAuth(boolean z) {
        this.A03.setWantClientAuth(z);
    }

    public void shutdownInput() {
        this.A03.shutdownInput();
    }

    public void shutdownOutput() {
        this.A03.shutdownOutput();
    }

    public void startHandshake() {
        try {
            this.A03.startHandshake();
        } catch (SSLHandshakeException | SSLProtocolException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("accounting-socket-factory/enabled suites ");
            SSLSocket sSLSocket = this.A03;
            C18320x8.A1P(A0o, sSLSocket.getEnabledCipherSuites());
            A0o.append(" supported suites ");
            C18260x0.A1K(A0o, Arrays.toString(sSLSocket.getSupportedCipherSuites()));
            throw e;
        }
    }

    public String toString() {
        return this.A03.toString();
    }

    public C73563fi(C56492s4 r1, SSLSocket sSLSocket, int i, int i2) {
        this.A00 = i;
        this.A03 = sSLSocket;
        this.A02 = r1;
        this.A01 = i2;
    }

    public void connect(SocketAddress socketAddress, int i) {
        this.A03.connect(socketAddress, i);
    }
}
