package X;

import java.lang.ref.WeakReference;

/* renamed from: X.1tl  reason: invalid class name and case insensitive filesystem */
public class C33831tl extends AnonymousClass5ZM {
    public final AnonymousClass0QU A00 = new AnonymousClass0QU();
    public final C620733j A01;
    public final AnonymousClass2Y1 A02;
    public final C60202yA A03;
    public final AnonymousClass319 A04;
    public final C95814uZ A05;
    public final WeakReference A06;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass319 r2 = this.A04;
        C95814uZ r3 = this.A05;
        int A012 = r2.A01(new C86594Ks(this, 1), r3, Integer.MAX_VALUE);
        C60202yA r0 = this.A03;
        AnonymousClass0QU r1 = this.A00;
        return Integer.valueOf(A012 + r0.A01(r1, r3) + this.A02.A00(r1, r3));
    }

    public void A09() {
        this.A00.A01();
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass10p r2 = (AnonymousClass10p) this.A06.get();
        if (r2 != null) {
            String format = this.A01.A0M().format(obj);
            C162457s7.A0J(format, 0);
            r2.A0B.A0H(format);
        }
    }

    public C33831tl(AnonymousClass10p r2, C620733j r3, AnonymousClass2Y1 r4, C60202yA r5, AnonymousClass319 r6, C95814uZ r7) {
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = r6;
        this.A02 = r4;
        this.A06 = AnonymousClass0x9.A14(r2);
        this.A05 = r7;
    }
}
