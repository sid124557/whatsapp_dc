package X;

/* renamed from: X.3M1  reason: invalid class name */
public final class AnonymousClass3M1 implements C85034Er {
    public final /* synthetic */ C49382gR A00;
    public final /* synthetic */ AnonymousClass39C A01;
    public final /* synthetic */ AnonymousClass3EF A02;
    public final /* synthetic */ String A03;

    public AnonymousClass3M1(C49382gR r1, AnonymousClass39C r2, AnonymousClass3EF r3, String str) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = str;
    }

    public void BLr() {
        String str;
        C49382gR r1 = this.A00;
        if (this.A02 instanceof C34321ut) {
            str = "Extensions bloks layout was not loaded";
        } else {
            str = "Commerce bloks layout was not loaded";
        }
        r1.A00(AnonymousClass001.A0e(str));
    }

    public void onSuccess() {
        AnonymousClass3EF r2 = this.A02;
        r2.A06.BkM(new C71603cN(r2, this.A00, this.A01, this.A03, 29));
    }

    public /* bridge */ /* synthetic */ void BSD(Integer num) {
        String str;
        int intValue = num.intValue();
        C49382gR r2 = this.A00;
        AnonymousClass3EF r1 = this.A02;
        if (r1 instanceof C34321ut) {
            str = "Extensions bloks layout was not loaded";
        } else {
            str = "Commerce bloks layout was not loaded";
        }
        r2.A00(AnonymousClass001.A0e(str));
        r1.A01(intValue);
    }

    public /* bridge */ /* synthetic */ void Be9(Integer num) {
        String str;
        int intValue = num.intValue();
        C49382gR r2 = this.A00;
        AnonymousClass3EF r1 = this.A02;
        if (r1 instanceof C34321ut) {
            str = "Extensions bloks layout was not loaded";
        } else {
            str = "Commerce bloks layout was not loaded";
        }
        r2.A00(AnonymousClass001.A0e(str));
        r1.A01(intValue);
    }
}
