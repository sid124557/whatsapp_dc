package X;

/* renamed from: X.2p5  reason: invalid class name and case insensitive filesystem */
public class C54662p5 {
    public int A00;
    public boolean A01;
    public final int A02;
    public final C60902zM A03;

    public static C54662p5 A00() {
        return new C54662p5(3, C625635p.A0L);
    }

    public synchronized Long A01() {
        Long l;
        if (A04()) {
            l = this.A03.A01();
        } else {
            l = null;
        }
        return l;
    }

    public synchronized void A02() {
        this.A01 = true;
    }

    public synchronized boolean A03() {
        return this.A01;
    }

    public synchronized boolean A04() {
        int i;
        i = this.A00;
        this.A00 = i + 1;
        return AnonymousClass001.A1Y(i, this.A02);
    }

    public C54662p5(int i, long j) {
        this.A02 = i;
        this.A03 = new C60902zM(AnonymousClass29O.A00(), i, j);
    }
}
