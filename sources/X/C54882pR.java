package X;

/* renamed from: X.2pR  reason: invalid class name and case insensitive filesystem */
public class C54882pR {
    public final C29441ip A00;
    public final C56612sH A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass4FV A03;
    public final C158017jI A04;
    public final AnonymousClass2YQ A05;

    public final int A00() {
        Integer A002 = AnonymousClass26q.A00(this.A00.A0A());
        if (A002 == null) {
            return 0;
        }
        return A002.intValue();
    }

    public final long A01() {
        long A0H = this.A01.A0H();
        return A0H - (A0H % 86400000);
    }

    public synchronized void A02(int i, int i2) {
        synchronized (this) {
            long A012 = A01();
            int A002 = A00();
            C158017jI r5 = this.A04;
            int i3 = i;
            int i4 = i2;
            C160167n9 A003 = r5.A00(i3, A002, i4, A012, false);
            A003.A08++;
            r5.A01(A003, i3, A002, i4, A012, false);
        }
    }

    public synchronized void A03(C53922nt r21, int i, int i2) {
        synchronized (this) {
            long A012 = A01();
            int A002 = A00();
            C158017jI r5 = this.A04;
            int i3 = i;
            int i4 = i2;
            C160167n9 A003 = r5.A00(i4, A002, i3, A012, false);
            A003.A05++;
            r5.A01(A003, i4, A002, i3, A012, false);
            this.A05.A00(r21, A002);
        }
    }

    public C54882pR(C29441ip r1, C56612sH r2, AnonymousClass1VX r3, AnonymousClass4FV r4, C158017jI r5, AnonymousClass2YQ r6) {
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A05 = r6;
        this.A02 = r3;
    }
}
