package X;

/* renamed from: X.5Te  reason: invalid class name and case insensitive filesystem */
public final class C105005Te {
    public int A00 = -1;
    public String A01;
    public boolean A02;
    public final C89654ea A03;
    public final AnonymousClass33p A04;

    public C105005Te(C89654ea r2, AnonymousClass33p r3) {
        C162457s7.A0J(r3, 2);
        this.A03 = r2;
        this.A04 = r3;
    }

    public final void A00() {
        this.A02 = false;
        AnonymousClass36l.A00 = AnonymousClass0x9.A0v(AnonymousClass0x2.A0F(this.A04), "registration_failure_reason");
        String str = this.A01;
        if (str != null) {
            this.A03.Bou(str);
        }
        int i = this.A00;
        if (i != -1) {
            C621433s.A01(this.A03, i);
        }
        this.A01 = null;
        this.A00 = -1;
    }

    public final void A03(String str) {
        C162457s7.A0J(str, 0);
        if (!this.A02) {
            C89654ea r1 = this.A03;
            if (!r1.isFinishing()) {
                r1.Bou(str);
                return;
            }
        }
        this.A01 = str;
    }

    public final void A01(int i) {
        if (!this.A02) {
            C621433s.A01(this.A03, i);
        } else {
            this.A00 = i;
        }
    }

    public final void A02(int i) {
        if (!this.A02) {
            C89654ea r1 = this.A03;
            if (!r1.isFinishing()) {
                r1.Bot(i);
                return;
            }
        }
        C89654ea r0 = this.A03;
        r0.getString(i);
        this.A01 = r0.getString(i);
    }
}
