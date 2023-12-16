package X;

/* renamed from: X.82O  reason: invalid class name */
public class AnonymousClass82O implements C180368kv {
    public final /* synthetic */ AnonymousClass7NX A00;
    public final /* synthetic */ C1679083g A01;

    public AnonymousClass82O(AnonymousClass7NX r1, C1679083g r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void Bim(Object obj) {
        boolean z;
        C172258Kh A02;
        AnonymousClass7AQ r0;
        C1679083g r3 = this.A01;
        AnonymousClass7NX r4 = this.A00;
        synchronized (r3) {
            int i = r4.A00;
            C153877cA.A01(AnonymousClass001.A1W(i));
            int i2 = i - 1;
            r4.A00 = i2;
            if (r4.A01 || i2 != 0) {
                z = false;
            } else {
                r3.A04.A04(r4.A04, r4);
                z = true;
            }
            A02 = r3.A02(r4);
        }
        if (A02 != null) {
            A02.close();
        }
        if (z && (r0 = r4.A03) != null) {
            Object obj2 = r4.A04;
            C149217Lm r1 = r0.A00;
            synchronized (r1) {
                r1.A03.add(obj2);
            }
        }
        r3.A04();
        r3.A03();
    }
}
