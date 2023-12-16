package X;

import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.net.URLConnection;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRL;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import javax.naming.NamingException;
import javax.naming.directory.InitialDirContext;

/* renamed from: X.7p4  reason: invalid class name and case insensitive filesystem */
public class C161137p4 {
    public static Map A00 = Collections.synchronizedMap(new WeakHashMap());

    public static Collection A00(URI uri, CertificateFactory certificateFactory) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("java.naming.factory.initial", "com.sun.jndi.ldap.LdapCtxFactory");
        hashtable.put("java.naming.provider.url", uri.toString());
        try {
            byte[] bArr = (byte[]) new InitialDirContext(hashtable).getAttributes("").get("certificateRevocationList;binary").get();
            if (bArr != null && bArr.length != 0) {
                return certificateFactory.generateCRLs(AnonymousClass0x9.A0d(bArr));
            }
            throw new CRLException(AnonymousClass000.A0P(uri, "no CRL returned from: ", AnonymousClass001.A0o()));
        } catch (NamingException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            C18270x1.A1H(A0o, "issue connecting to: ", uri);
            throw new CRLException(A0o.toString(), e);
        }
    }

    public static synchronized C173638Qz A01(URI uri, CertificateFactory certificateFactory, Date date) {
        Collection<? extends CRL> generateCRLs;
        C173638Qz r3;
        synchronized (C161137p4.class) {
            Map map = A00;
            WeakReference weakReference = (WeakReference) map.get(uri);
            if (!(weakReference == null || (r3 = (C173638Qz) weakReference.get()) == null)) {
                Iterator A0u = AnonymousClass6C7.A0u(r3.A00);
                while (A0u.hasNext()) {
                    Date nextUpdate = ((X509CRL) A0u.next()).getNextUpdate();
                    if (nextUpdate == null || !nextUpdate.before(date)) {
                    }
                }
                return r3;
            }
            if (uri.getScheme().equals("ldap")) {
                generateCRLs = A00(uri, certificateFactory);
            } else {
                URLConnection openConnection = uri.toURL().openConnection();
                openConnection.setConnectTimeout(15000);
                openConnection.setReadTimeout(15000);
                InputStream inputStream = openConnection.getInputStream();
                generateCRLs = certificateFactory.generateCRLs(inputStream);
                inputStream.close();
            }
            C173638Qz r1 = new C173638Qz(new AnonymousClass8R0(generateCRLs));
            map.put(uri, AnonymousClass0x9.A14(r1));
            return r1;
        }
    }
}
