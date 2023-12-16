package X;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.TrustManager;

/* renamed from: X.3fh  reason: invalid class name and case insensitive filesystem */
public class C73553fh extends SSLServerSocketFactory {
    public SSLServerSocketFactory A00;
    public final PrivateKey A01;
    public final Certificate A02;
    public final SSLContext A03;

    public final SSLServerSocketFactory A00() {
        SSLServerSocketFactory sSLServerSocketFactory = this.A00;
        if (sSLServerSocketFactory == null) {
            SSLContext sSLContext = this.A03;
            try {
                char[] charArray = "pass".toCharArray();
                KeyStore instance = KeyStore.getInstance(KeyStore.getDefaultType());
                instance.load((InputStream) null, (char[]) null);
                instance.setKeyEntry("self-signed-certificate", this.A01, charArray, new Certificate[]{this.A02});
                KeyManagerFactory instance2 = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                instance2.init(instance, charArray);
                sSLContext.init(instance2.getKeyManagers(), (TrustManager[]) null, (SecureRandom) null);
                sSLServerSocketFactory = sSLContext.getServerSocketFactory();
                this.A00 = sSLServerSocketFactory;
            } catch (IOException | KeyManagementException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException e) {
                throw C18310x6.A0i("fpm/SslSocketFactoryWithGivenCertificate/", e);
            }
        }
        return sSLServerSocketFactory;
    }

    public C73553fh(PrivateKey privateKey, Certificate certificate) {
        this();
        this.A01 = privateKey;
        this.A02 = certificate;
    }

    public ServerSocket createServerSocket(int i, int i2, InetAddress inetAddress) {
        return A00().createServerSocket(i, i2, inetAddress);
    }

    public String[] getDefaultCipherSuites() {
        return A00().getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return A00().getSupportedCipherSuites();
    }

    public C73553fh() {
        try {
            this.A03 = SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            C18260x0.A14(" algorithm not available for SSLContext: ", AnonymousClass000.A0l("TLS"), e);
            throw C18330xA.A09(e);
        }
    }

    public ServerSocket createServerSocket(int i, int i2) {
        return A00().createServerSocket(i, i2);
    }

    public ServerSocket createServerSocket(int i) {
        return A00().createServerSocket(i);
    }

    public ServerSocket createServerSocket() {
        return A00().createServerSocket();
    }
}
