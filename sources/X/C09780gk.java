package X;

import java.util.List;

/* renamed from: X.0gk  reason: invalid class name and case insensitive filesystem */
public class C09780gk implements C17010uP {
    public float A00;
    public float A01;
    public int A02 = -1;
    public AnonymousClass0Ps A03 = null;
    public List A04 = AnonymousClass001.A0s();
    public boolean A05;
    public boolean A06 = true;
    public boolean A07 = false;
    public final /* synthetic */ AnonymousClass0YF A08;

    public void AxI(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        this.A07 = true;
        this.A06 = false;
        AnonymousClass0Ps r0 = this.A03;
        AnonymousClass0YF.A09(this, r0.A02, r0.A03, f, f2, f3, f4, f5, z, z2);
        this.A06 = true;
        this.A05 = false;
    }

    public C09780gk(C09790gl r3, AnonymousClass0YF r4) {
        this.A08 = r4;
        if (r3 != null) {
            r3.A02(this);
            if (this.A05) {
                this.A04.get(-1);
                throw AnonymousClass001.A0g("add");
            }
        }
    }

    public void B1B(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.A06 || this.A07) {
            AnonymousClass0Ps r1 = this.A03;
            r1.A00(f, f2);
            this.A04.add(r1);
            this.A07 = false;
        }
        this.A03 = new AnonymousClass0Ps(this.A08, f5, f6, f5 - f3, f6 - f4);
        this.A05 = false;
    }

    public void BJh(float f, float f2) {
        AnonymousClass0Ps r1 = this.A03;
        r1.A00(f, f2);
        this.A04.add(r1);
        AnonymousClass0YF r2 = this.A08;
        AnonymousClass0Ps r12 = this.A03;
        this.A03 = new AnonymousClass0Ps(r2, f, f2, f - r12.A02, f2 - r12.A03);
        this.A05 = false;
    }

    public void BLL(float f, float f2) {
        if (this.A05) {
            AnonymousClass0Ps r1 = this.A03;
            List list = this.A04;
            r1.A01((AnonymousClass0Ps) list.get(this.A02));
            list.set(this.A02, this.A03);
            this.A05 = false;
        }
        AnonymousClass0Ps r12 = this.A03;
        if (r12 != null) {
            this.A04.add(r12);
        }
        this.A00 = f;
        this.A01 = f2;
        this.A03 = new AnonymousClass0Ps(this.A08, f, f2, 0.0f, 0.0f);
        this.A02 = this.A04.size();
    }

    public void Bhz(float f, float f2, float f3, float f4) {
        AnonymousClass0Ps r1 = this.A03;
        r1.A00(f, f2);
        this.A04.add(r1);
        this.A03 = new AnonymousClass0Ps(this.A08, f3, f4, f3 - f, f4 - f2);
        this.A05 = false;
    }

    public void close() {
        this.A04.add(this.A03);
        BJh(this.A00, this.A01);
        this.A05 = true;
    }
}
