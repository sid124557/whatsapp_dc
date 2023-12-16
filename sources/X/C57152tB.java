package X;

/* renamed from: X.2tB  reason: invalid class name and case insensitive filesystem */
public class C57152tB implements AnonymousClass4DP {
    public Object A00;
    public Object A01;
    public final int A02;

    public C57152tB(C43222Rg r1, AnonymousClass4DP r2, int i) {
        this.A02 = i;
        this.A01 = r1;
        this.A00 = r2;
    }

    public void onFailure(Exception exc) {
        int i;
        int i2 = this.A02;
        C162457s7.A0J(exc, 0);
        C69263Wi r2 = ((C43222Rg) this.A01).A00;
        Object obj = this.A00;
        if (i2 != 0) {
            i = 16;
        } else {
            i = 15;
        }
        r2.A0S(C70133a0.A00(obj, exc, i));
    }

    public void onSuccess() {
        C69263Wi r3;
        Runnable r2;
        if (this.A02 != 0) {
            C43222Rg r4 = (C43222Rg) this.A01;
            r3 = r4.A00;
            r2 = new C71403c3(r4, (AnonymousClass4DP) this.A00, 8);
        } else {
            r3 = ((C43222Rg) this.A01).A00;
            r2 = new C71273bq(this.A00, 4);
        }
        r3.A0S(r2);
    }
}
