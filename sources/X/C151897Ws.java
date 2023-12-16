package X;

/* renamed from: X.7Ws  reason: invalid class name and case insensitive filesystem */
public final class C151897Ws {
    public int A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final String A04;

    public void A02() {
        int i;
        int i2 = this.A00;
        if (i2 == Integer.MIN_VALUE) {
            i = this.A02;
        } else {
            i = i2 + this.A03;
        }
        this.A00 = i;
        this.A01 = AnonymousClass000.A0Y(this.A04, AnonymousClass001.A0o(), i);
    }

    public final void A03() {
        if (this.A00 == Integer.MIN_VALUE) {
            throw AnonymousClass001.A0e("generateNewId() must be called before retrieving ids.");
        }
    }

    public C151897Ws(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = AnonymousClass000.A0X("/", C18320x8.A0j(i));
        } else {
            str = "";
        }
        this.A04 = str;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = Integer.MIN_VALUE;
        this.A01 = "";
    }

    public static C185598tw A00(C187028wK r2, C151897Ws r3) {
        r3.A03();
        return r2.Br0(r3.A00, 1);
    }

    public static String A01(C151897Ws r0) {
        r0.A02();
        r0.A03();
        return r0.A01;
    }
}
