package X;

import java.util.Enumeration;
import java.util.Iterator;
import javax.net.ssl.SSLSession;

/* renamed from: X.8Nb  reason: invalid class name and case insensitive filesystem */
public class C172848Nb implements Enumeration {
    public SSLSession A00;
    public final /* synthetic */ AnonymousClass8P4 A01;
    public final /* synthetic */ Iterator A02;

    public C172848Nb(AnonymousClass8P4 r1, Iterator it) {
        this.A01 = r1;
        this.A02 = it;
    }

    public boolean hasMoreElements() {
        SSLSession sSLSession;
        if (this.A00 != null) {
            return true;
        }
        do {
            Iterator it = this.A02;
            if (it.hasNext()) {
                sSLSession = (SSLSession) it.next();
            } else {
                this.A00 = null;
                return false;
            }
        } while (!sSLSession.isValid());
        this.A00 = sSLSession;
        return true;
    }

    public /* bridge */ /* synthetic */ Object nextElement() {
        if (hasMoreElements()) {
            byte[] id = this.A00.getId();
            this.A00 = null;
            return id;
        }
        throw AnonymousClass6CA.A0c();
    }
}
