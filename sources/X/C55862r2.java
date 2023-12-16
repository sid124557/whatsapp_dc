package X;

/* renamed from: X.2r2  reason: invalid class name and case insensitive filesystem */
public final class C55862r2 {
    public Integer A00;
    public Long A01;
    public String A02;
    public String A03;
    public final C56612sH A04;
    public final AnonymousClass4FV A05;

    public final void A05(Integer num, String str, int i, boolean z) {
        Long l = null;
        if (i != 1) {
            Long l2 = this.A01;
            if (l2 != null) {
                l = C18310x6.A0f(System.currentTimeMillis(), l2.longValue());
            }
        } else {
            this.A01 = Long.valueOf(System.currentTimeMillis());
        }
        C25121a0 r1 = new C25121a0();
        r1.A02 = Integer.valueOf(i);
        r1.A06 = this.A03;
        r1.A05 = this.A02;
        r1.A01 = num;
        r1.A04 = str;
        r1.A03 = l;
        r1.A00 = Boolean.valueOf(z);
        this.A05.BhD(r1);
    }

    public final void A00(int i) {
        Integer num = this.A00;
        if (num != null && num.intValue() == i) {
            this.A03 = null;
            this.A00 = null;
        }
    }

    public final void A01(int i) {
        if (this.A03 == null && this.A00 == null) {
            this.A03 = C18280x3.A0Y();
            this.A00 = Integer.valueOf(i);
        }
    }

    public final void A02(int i, String str, String str2) {
        AnonymousClass1Y0 r1 = new AnonymousClass1Y0();
        r1.A01 = str2;
        r1.A02 = str;
        r1.A00 = Integer.valueOf(i);
        this.A05.BhD(r1);
    }

    public final void A03(Boolean bool, int i) {
        AnonymousClass1ZL r1 = new AnonymousClass1ZL();
        r1.A04 = this.A03;
        r1.A03 = this.A02;
        r1.A01 = this.A00;
        r1.A02 = Integer.valueOf(i);
        r1.A00 = bool;
        this.A05.BhD(r1);
    }

    public final void A04(Integer num, String str, int i, boolean z) {
        C25121a0 r1 = new C25121a0();
        r1.A02 = Integer.valueOf(i);
        r1.A06 = this.A03;
        r1.A05 = this.A02;
        r1.A01 = num;
        r1.A04 = str;
        r1.A00 = Boolean.valueOf(z);
        this.A05.BhD(r1);
    }

    public C55862r2(C56612sH r1, AnonymousClass4FV r2) {
        C18260x0.A0Q(r2, r1);
        this.A05 = r2;
        this.A04 = r1;
    }
}
