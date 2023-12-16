package X;

/* renamed from: X.908  reason: invalid class name */
public class AnonymousClass908 extends AnonymousClass8JF {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    public void BQs(String str) {
        int i;
        int i2 = this.A05;
        String str2 = str;
        C162457s7.A0J(str, 0);
        C161447pg r3 = (C161447pg) this.A03;
        C69263Wi r0 = r3.A04;
        Object obj = this.A02;
        Object obj2 = this.A00;
        if (i2 != 0) {
            i = 8;
        } else {
            i = 7;
        }
        r0.BkS(new C71613cO(this, r3, obj, obj2, str2, i));
    }

    public void BSN(AnonymousClass36K r11, String str) {
        boolean z;
        AnonymousClass36K r3 = r11;
        if (this.A05 != 0) {
            z = AnonymousClass0x2.A1Y(str, r11);
        } else {
            z = false;
            C18270x1.A14(str, r11);
        }
        C161447pg r5 = (C161447pg) this.A03;
        r5.A04.BkS(new AnonymousClass8MV(this, r3, this.A01, r5, this.A02, this.A00, this.A04, z ? 1 : 0));
    }

    public AnonymousClass908(AnonymousClass4DL r1, C161447pg r2, C52622lm r3, C35721xK r4, String str, int i) {
        this.A05 = i;
        this.A03 = r2;
        this.A02 = r3;
        this.A01 = r4;
        this.A00 = r1;
        this.A04 = str;
    }

    public void BdM(AnonymousClass36K r9, String str) {
        int i;
        int i2 = this.A05;
        AnonymousClass36K r4 = r9;
        C162457s7.A0J(r9, 1);
        C161447pg r2 = (C161447pg) this.A03;
        C69263Wi r0 = r2.A04;
        Object obj = this.A02;
        Object obj2 = this.A01;
        Object obj3 = this.A00;
        if (i2 != 0) {
            i = 14;
        } else {
            i = 13;
        }
        r0.BkS(new C71453c8(r2, obj, r4, obj2, obj3, i));
    }
}
