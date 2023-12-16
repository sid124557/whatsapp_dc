package X;

import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3U7  reason: invalid class name */
public class AnonymousClass3U7 implements AnonymousClass4FX {
    public final AnonymousClass4FV A00;
    public final AtomicInteger A01 = new AtomicInteger();

    public void Axd() {
        A00((String) null, new Object[0], 17);
    }

    public void B2g(String str) {
        if (str != null && str.length() > 200) {
            str = str.substring(0, 200);
        }
        Object[] A0L = AnonymousClass002.A0L();
        A0L[0] = str;
        A00("errorString:%s", A0L, 10);
    }

    public void BKs() {
        A00((String) null, new Object[0], 9);
    }

    public void BrL() {
        A00((String) null, new Object[0], 18);
    }

    public final void A00(String str, Object[] objArr, int i) {
        if (this.A01.getAndIncrement() < 5) {
            C24361Xc r1 = new C24361Xc();
            r1.A00 = Integer.valueOf(i);
            if (str != null) {
                r1.A01 = String.format(Locale.US, str, objArr);
            }
            this.A00.BhD(r1);
        }
    }

    public AnonymousClass3U7(AnonymousClass4FV r2) {
        this.A00 = r2;
    }

    public void Ax2(int i, String str) {
        Object[] A0M = AnonymousClass002.A0M();
        C18270x1.A1Q(A0M, i);
        A0M[1] = str;
        A00("markerId:%d, annotationKey:%s", A0M, 13);
    }

    public void Ax3(int i, String str) {
        Object[] A0M = AnonymousClass002.A0M();
        C18270x1.A1Q(A0M, i);
        A0M[1] = str;
        A00("markerId:%d, key:%s", A0M, 23);
    }

    public void Ax4(int i, String str, int i2) {
        Object[] A0M = AnonymousClass002.A0M();
        C18270x1.A1Q(A0M, i);
        A0M[1] = str;
        A00("markerId:%d, annotationKey:%s", A0M, 1);
    }

    public void B2d(String str) {
        A00("errorString:%s", AnonymousClass000.A1b(str), 16);
    }

    public void B2e(String str) {
        A00("errorString:%s", AnonymousClass000.A1b(str), 11);
    }

    public void B2f(String str) {
        A00("errorString:%s", AnonymousClass000.A1b(str), 15);
    }

    public void B2h(String str) {
        A00("errorString:%s", AnonymousClass000.A1b(str), 8);
    }

    public void B2n(int i) {
        Object[] A0L = AnonymousClass002.A0L();
        C18270x1.A1Q(A0L, i);
        A00("markerId:%d", A0L, 22);
    }

    public void BFj(int i, String str, double d) {
        Object[] A1X = AnonymousClass0x9.A1X();
        C18270x1.A1Q(A1X, i);
        A1X[1] = str;
        A1X[2] = Double.toString(d);
        A00("markerId:%d, annotationKey:%s, value:%s", A1X, 7);
    }

    public void BJT(int i, String str) {
        Object[] A0M = AnonymousClass002.A0M();
        C18270x1.A1Q(A0M, i);
        A0M[1] = str;
        A00("markerId:%d, errorString:%s", A0M, 6);
    }

    public void BKu(int i) {
        Object[] A0L = AnonymousClass002.A0L();
        C18270x1.A1Q(A0L, i);
        A00("markerId:%d", A0L, 3);
    }

    public void BKv(int i) {
        Object[] A0L = AnonymousClass002.A0L();
        C18270x1.A1Q(A0L, i);
        A00("markerId:%d", A0L, 2);
    }

    public void BLa(int i) {
        Object[] A0L = AnonymousClass002.A0L();
        C18270x1.A1Q(A0L, i);
        A00("markerId:%d", A0L, 20);
    }

    public void Bgv(int i, String str) {
        Object[] A0M = AnonymousClass002.A0M();
        C18270x1.A1Q(A0M, i);
        A0M[1] = str;
        A00("markerId:%d, data:%s", A0M, 14);
    }

    public void Bgw(int i, String str) {
        Object[] A0M = AnonymousClass002.A0M();
        C18270x1.A1Q(A0M, i);
        A0M[1] = str;
        A00("markerId:%d, pointName:%s", A0M, 12);
    }

    public void Bgx(int i, String str) {
        Object[] A0M = AnonymousClass002.A0M();
        C18270x1.A1Q(A0M, i);
        A0M[1] = str;
        A00("markerId:%d, pointName:%s", A0M, 5);
    }

    public void Bji(String str) {
        A00("msg: %s", AnonymousClass000.A1b(str), 24);
    }

    public void Bqy(Collection collection) {
        Object[] A0L = AnonymousClass002.A0L();
        String str = "null";
        if (collection != null) {
            str = collection.toString();
        }
        A0L[0] = str;
        A00("allOpenMarkerIds:%s", A0L, 4);
    }
}
