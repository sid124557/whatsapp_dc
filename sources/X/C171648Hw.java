package X;

/* renamed from: X.8Hw  reason: invalid class name and case insensitive filesystem */
public final class C171648Hw implements C203499no {
    public AnonymousClass4FV A00;
    public C153087ae A01;
    public AnonymousClass9TD A02;

    public /* bridge */ /* synthetic */ void BKC(Integer num, Integer num2, String str, String str2, boolean z) {
        C162457s7.A0J(str, 2);
        C134246ig B0d = B0d();
        C134246ig.A00(B0d, num2, str, 1);
        this.A00.BhD(B0d);
    }

    public C134246ig B0d() {
        String str;
        C134246ig r1 = new C134246ig();
        r1.A0V = this.A02.A00();
        C161357pU A022 = this.A01.A02();
        if (A022 != null) {
            str = A022.A03;
        } else {
            str = null;
        }
        r1.A0R = str;
        return r1;
    }

    public void BK0(AnonymousClass34V r4, int i) {
        int i2;
        AnonymousClass4FV r2 = this.A00;
        C134246ig B0d = B0d();
        B0d.A0B = Integer.valueOf(i);
        if (r4 != null) {
            B0d.A0S = String.valueOf(r4.A00);
            B0d.A0T = r4.A08;
            i2 = 2;
        } else {
            i2 = 1;
        }
        B0d.A0C = Integer.valueOf(i2);
        B0d.A08 = C18290x4.A0a();
        r2.BhD(B0d);
    }

    public void BKA(C134246ig r2) {
        String str;
        r2.A0V = this.A02.A00();
        C161357pU A022 = this.A01.A02();
        if (A022 != null) {
            str = A022.A03;
        } else {
            str = null;
        }
        r2.A0R = str;
        this.A00.BhD(r2);
    }

    public /* bridge */ /* synthetic */ void BKF(AnonymousClass303 r5, Integer num, Integer num2, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        int intValue = num.intValue();
        C134246ig B0d = B0d();
        C134246ig.A00(B0d, num2, "payment_transaction_details", intValue);
        if (str2 != null) {
            B0d.A0a = str2;
        }
        AnonymousClass6C8.A11(B0d, r5);
        B0d.A06 = Boolean.valueOf(z2);
        B0d.A0W = null;
        B0d.A0X = null;
        this.A00.BhD(B0d);
    }

    public void Bq0() {
        this.A02.A02();
    }

    public void reset() {
        this.A02.A01();
    }

    public C171648Hw(AnonymousClass4FV r1, C153087ae r2, AnonymousClass9TD r3) {
        C18260x0.A0V(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ void BKB(Integer num, Integer num2, String str, String str2) {
        int intValue = num.intValue();
        C162457s7.A0J(str, 2);
        C134246ig B0d = B0d();
        C134246ig.A00(B0d, num2, str, intValue);
        if (str2 != null) {
            B0d.A0a = str2;
        }
        this.A00.BhD(B0d);
    }

    public /* bridge */ /* synthetic */ void BKE(AnonymousClass303 r4, Integer num, Integer num2, String str, String str2) {
        int intValue = num.intValue();
        C162457s7.A0J(str, 2);
        C134246ig B0d = B0d();
        C134246ig.A00(B0d, num2, str, intValue);
        if (str2 != null) {
            B0d.A0a = str2;
        }
        AnonymousClass6C8.A11(B0d, r4);
        this.A00.BhD(B0d);
    }

    public /* bridge */ /* synthetic */ void BJy(AnonymousClass3ZO r1, Integer num, Integer num2, String str, String str2) {
    }
}
