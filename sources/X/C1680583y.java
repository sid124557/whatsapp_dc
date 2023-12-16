package X;

import android.opengl.GLES20;

/* renamed from: X.83y  reason: invalid class name and case insensitive filesystem */
public class C1680583y implements C185288tO, C186198uu, C180458l6 {
    public int A00;
    public int A01;
    public int A02;
    public C185278tN A03;
    public C185558ts A04;
    public C162017r3 A05;
    public final C157207hv A06;
    public final AnonymousClass7Ow A07 = new AnonymousClass7Ow();
    public final C162017r3 A08;
    public final boolean A09;
    public volatile int A0A;
    public volatile AnonymousClass7EZ A0B;

    public C1680583y(C157207hv r3, C162017r3 r4, C162017r3 r5, boolean z) {
        this.A06 = r3;
        this.A08 = r4;
        this.A05 = r5;
        this.A09 = z;
        this.A0A = 5;
    }

    public synchronized int BAK() {
        return this.A0A;
    }

    public final void A00() {
        if (this.A03 == null) {
            C185558ts r3 = this.A04;
            if (r3 == null) {
                this.A06.A00(C142216wp.A0F);
                return;
            }
            int i = this.A02;
            boolean z = true;
            boolean A1W = AnonymousClass001.A1W(i);
            int i2 = this.A01;
            if (i2 <= 0) {
                z = false;
            }
            if (!A1W) {
                this.A06.A00(C142216wp.A0H);
                if (z) {
                    return;
                }
            } else if (z) {
                C185278tN B0f = r3.BDc().B0f((C151837Wm) null, r3, i, i2, this.A09);
                this.A03 = B0f;
                AnonymousClass7Ow r2 = this.A07;
                r2.A04 = B0f.BDb();
                int i3 = 3;
                if (B0f.BGy()) {
                    i3 = 7;
                }
                r2.A00 = i3;
                return;
            }
            this.A06.A00(C142216wp.A0G);
        }
    }

    public final void A01() {
        C185278tN r0 = this.A03;
        if (r0 != null) {
            try {
                r0.release();
            } finally {
                this.A03 = null;
                this.A07.A04 = null;
            }
        }
    }

    public void A02(int i, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        if (this.A02 != i || this.A01 != i2 || this.A00 != i3 || this.A03 == null) {
            boolean z = false;
            this.A00 = i3;
            int i6 = i;
            if (i3 % 180 != 0) {
                z = true;
                i6 = i2;
            }
            this.A02 = i6;
            int i7 = i2;
            if (z) {
                i7 = i;
            }
            this.A01 = i7;
            if (this.A04 != null) {
                A01();
                A00();
            }
            C162017r3 r0 = this.A08;
            r0.A03(this.A02, this.A01, i4, i5, this.A00, false, false);
            this.A07.A05 = r0.A02();
        }
    }

    public void AxN(C185558ts r1) {
        this.A04 = r1;
        A00();
    }

    public AnonymousClass7Ow B7r() {
        return this.A07;
    }

    public Object B9B() {
        return this;
    }

    public int BAH() {
        return this.A07.A00;
    }

    public void BFr(C185568tt r1) {
    }

    public boolean BHV(AnonymousClass7Ow r2) {
        return true;
    }

    public Exception BKR() {
        C185278tN r1 = this.A03;
        if (r1 == null || this.A04 == null) {
            if (r1 == null) {
                this.A06.A00(C142216wp.A0J);
                return AnonymousClass001.A0e("Frame buffer is null");
            } else if (this.A04 == null) {
                this.A06.A00(C142216wp.A0K);
                return AnonymousClass001.A0e("Gl context is null");
            }
        }
        try {
            r1.Axo();
            C159217lP.A02("Failure to bind frame buffer", AnonymousClass4L0.A0U());
            return null;
        } catch (AnonymousClass8RP e) {
            this.A06.A00(C142216wp.A0I);
            return e;
        }
    }

    public void BqU() {
        if (this.A03 == null) {
            this.A06.A00(C142216wp.A0M);
        } else {
            GLES20.glBindFramebuffer(36160, 0);
        }
    }

    public AnonymousClass7TK Brr(AnonymousClass7Ow r12) {
        C157207hv r1;
        C142216wp r0;
        C162017r3 r3 = this.A05;
        AnonymousClass7TK r13 = r12.A05;
        if (r13 == null) {
            r1 = this.A06;
            r0 = C142216wp.A0O;
        } else if (!r13.A00()) {
            r1 = this.A06;
            r0 = C142216wp.A0N;
        } else {
            r3.A03(r13.A01, r13.A00, this.A02, this.A01, -this.A00, false, false);
            AnonymousClass7Ow r2 = this.A07;
            r2.A02 = r12.A02;
            r2.A01 = r12.A01;
            r2.A03 = r12.A03;
            r2.A06 = r12.A06;
            return r3.A02();
        }
        r1.A00(r0);
        return null;
    }

    public void release() {
    }

    public void B1c() {
        A01();
        this.A04 = null;
    }

    public boolean contains(Object obj) {
        return AnonymousClass000.A1Y(obj, this);
    }
}
