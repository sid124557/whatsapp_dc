package X;

/* renamed from: X.1oZ  reason: invalid class name and case insensitive filesystem */
public class C31611oZ extends C31891p1 {
    public String A00;
    public String A01;

    public C31611oZ(C620833k r7, AnonymousClass39T r8, long j) {
        super(r7, r8, 1, j);
    }

    public String A1x() {
        String str;
        synchronized (this.A1K) {
            str = this.A00;
        }
        return str;
    }

    public void A1y(String str) {
        synchronized (this.A1K) {
            this.A00 = str;
        }
    }

    public void A1Z(String str) {
        A1y(str);
    }

    public C31611oZ(AnonymousClass2z0 r7, long j) {
        super(r7, (AnonymousClass39T) null, 1, j);
    }
}
