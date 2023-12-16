package X;

import com.whatsapp.net.tls13.WtCachedPsk;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionBindingEvent;
import javax.net.ssl.SSLSessionBindingListener;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.CertificateException;
import javax.security.cert.X509Certificate;

/* renamed from: X.8P3  reason: invalid class name */
public class AnonymousClass8P3 implements SSLSession {
    public int A00;
    public long A01;
    public long A02;
    public WtCachedPsk A03;
    public AnonymousClass8P4 A04;
    public String A05;
    public String A06;
    public LinkedHashSet A07 = AnonymousClass0x9.A17();
    public Map A08 = AnonymousClass001.A0t();
    public boolean A09 = true;
    public byte[] A0A;
    public Certificate[] A0B;
    public final Map A0C = AnonymousClass001.A0t();

    public void invalidate() {
        this.A09 = false;
    }

    public Byte A00() {
        Certificate[] certificateArr = this.A0B;
        if (certificateArr == null) {
            return null;
        }
        byte b = 0;
        for (Certificate publicKey : certificateArr) {
            for (byte b2 : publicKey.getPublicKey().getEncoded()) {
                b = (byte) (b ^ b2);
            }
        }
        return Byte.valueOf(b);
    }

    public void A01(Certificate[] certificateArr) {
        Certificate[] certificateArr2;
        if (certificateArr != null) {
            certificateArr2 = (Certificate[]) certificateArr.clone();
        } else {
            certificateArr2 = null;
        }
        this.A0B = certificateArr2;
    }

    public int getApplicationBufferSize() {
        return 16384;
    }

    public String getCipherSuite() {
        return this.A05;
    }

    public long getCreationTime() {
        return this.A01;
    }

    public byte[] getId() {
        byte[] bArr = this.A0A;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return null;
    }

    public long getLastAccessedTime() {
        return this.A02;
    }

    public Certificate[] getLocalCertificates() {
        return null;
    }

    public Principal getLocalPrincipal() {
        return null;
    }

    public int getPacketBufferSize() {
        return 16645;
    }

    public X509Certificate[] getPeerCertificateChain() {
        Certificate[] certificateArr = this.A0B;
        if (certificateArr == null || (r7 = certificateArr.length) == 0) {
            throw new SSLPeerUnverifiedException("No peer certificates found");
        }
        ArrayList A0s = AnonymousClass001.A0s();
        for (Certificate encoded : certificateArr) {
            try {
                A0s.add(X509Certificate.getInstance(encoded.getEncoded()));
            } catch (CertificateEncodingException | CertificateException e) {
                C155097eH.A00(C141976wR.DEBUG, AnonymousClass000.A0P(e, "Could not parse certificates. Exception ", AnonymousClass001.A0o()));
            }
        }
        return (X509Certificate[]) A0s.toArray(new X509Certificate[0]);
    }

    public Certificate[] getPeerCertificates() {
        Certificate[] certificateArr = this.A0B;
        if (certificateArr != null) {
            return (Certificate[]) certificateArr.clone();
        }
        return null;
    }

    public String getPeerHost() {
        return this.A06;
    }

    public int getPeerPort() {
        return this.A00;
    }

    public Principal getPeerPrincipal() {
        Certificate[] certificateArr = this.A0B;
        if (certificateArr != null && certificateArr.length != 0) {
            return ((java.security.cert.X509Certificate) certificateArr[0]).getSubjectX500Principal();
        }
        throw new SSLPeerUnverifiedException("No peer certificates found.");
    }

    public final String getProtocol() {
        return "TLSv1.3";
    }

    public SSLSessionContext getSessionContext() {
        return this.A04;
    }

    public Object getValue(String str) {
        if (str != null) {
            return this.A0C.get(str);
        }
        throw AnonymousClass001.A0c("key cannot be null.");
    }

    public String[] getValueNames() {
        return (String[]) this.A0C.keySet().toArray(new String[0]);
    }

    public boolean isValid() {
        long currentTimeMillis;
        boolean z = this.A09;
        if (!z) {
            return z;
        }
        HashSet A0K = AnonymousClass002.A0K();
        LinkedHashSet linkedHashSet = this.A07;
        WtCachedPsk[] wtCachedPskArr = null;
        if (linkedHashSet != null) {
            wtCachedPskArr = (WtCachedPsk[]) linkedHashSet.toArray(new WtCachedPsk[0]);
        }
        if (wtCachedPskArr != null) {
            for (WtCachedPsk wtCachedPsk : wtCachedPskArr) {
                if (wtCachedPsk.useTestTime) {
                    currentTimeMillis = 3600000;
                } else {
                    currentTimeMillis = System.currentTimeMillis();
                }
                if (currentTimeMillis - wtCachedPsk.ticketIssuedTime > wtCachedPsk.ticketLifetime || !wtCachedPsk.sni.equals(this.A06)) {
                    this.A07.remove(wtCachedPsk);
                } else {
                    A0K.add(Byte.valueOf(wtCachedPsk.certsID));
                }
            }
        }
        Iterator A0i = C18280x3.A0i(this.A08);
        while (A0i.hasNext()) {
            if (!A0K.contains(A0i.next())) {
                A0i.remove();
            }
        }
        LinkedHashSet linkedHashSet2 = this.A07;
        if (linkedHashSet2 == null || linkedHashSet2.isEmpty()) {
            this.A09 = false;
        }
        return this.A09;
    }

    public void putValue(String str, Object obj) {
        if (str == null || obj == null) {
            throw AnonymousClass001.A0c("key and value cannot be null.");
        }
        Object put = this.A0C.put(str, obj);
        if (put instanceof SSLSessionBindingListener) {
            ((SSLSessionBindingListener) put).valueUnbound(new SSLSessionBindingEvent(this, str));
        }
        if (obj instanceof SSLSessionBindingListener) {
            ((SSLSessionBindingListener) obj).valueBound(new SSLSessionBindingEvent(this, str));
        }
    }

    public void removeValue(String str) {
        if (str != null) {
            Object remove = this.A0C.remove(str);
            if (remove instanceof SSLSessionBindingListener) {
                ((SSLSessionBindingListener) remove).valueUnbound(new SSLSessionBindingEvent(this, str));
                return;
            }
            return;
        }
        throw AnonymousClass001.A0c("key cannot be null");
    }

    public AnonymousClass8P3(AnonymousClass8P4 r3, String str, String str2, int i) {
        long currentTimeMillis = System.currentTimeMillis();
        this.A02 = currentTimeMillis;
        this.A01 = currentTimeMillis;
        this.A04 = r3;
        this.A06 = str;
        this.A00 = i;
        this.A05 = str2;
        this.A0A = C162257rX.A09(str, str2, i);
    }
}
