package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.28A  reason: invalid class name */
public class AnonymousClass28A implements AnonymousClass4EL {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass28A(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void BQr(Exception exc) {
        switch (this.A02) {
            case 2:
                ((AnonymousClass4EJ) this.A00).BQp();
                return;
            case 3:
                ((C84964Ek) this.A01).BQp();
                return;
            default:
                ((AnonymousClass4EJ) this.A00).BSB(exc);
                return;
        }
    }

    public void BSB(Exception exc) {
        if (3 - this.A02 != 0) {
            ((AnonymousClass4EJ) this.A00).BSB(exc);
        } else {
            ((C84964Ek) this.A01).BSC(exc, 480);
        }
    }

    public void BdT(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        AnonymousClass4GQ r1;
        Object obj;
        switch (this.A02) {
            case 0:
                C18260x0.A0O(x509Certificate, x509Certificate2);
                r1 = (AnonymousClass4GQ) this.A01;
                obj = new C52772m1(num, publicKey, x509Certificate, x509Certificate2);
                break;
            case 1:
                C18260x0.A0O(x509Certificate, x509Certificate2);
                r1 = (AnonymousClass4GQ) this.A01;
                obj = new C52962mK(num, publicKey, x509Certificate, x509Certificate2);
                break;
            case 2:
                C18260x0.A0O(x509Certificate, x509Certificate2);
                r1 = (AnonymousClass4GQ) this.A01;
                obj = new C53032mR(num, publicKey, x509Certificate, x509Certificate2);
                break;
            default:
                ((C70363aN) this.A00).run();
                return;
        }
        r1.invoke(obj);
    }
}
