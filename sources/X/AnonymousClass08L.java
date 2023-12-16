package X;

import android.os.Bundle;

/* renamed from: X.08L  reason: invalid class name */
public class AnonymousClass08L extends AnonymousClass08M implements C15130qp {
    public C15910sA A00;
    public C08360eK A01;
    public C04740Ql A02;
    public final Bundle A03;
    public final C04740Ql A04;

    public void A08() {
        C04740Ql r1 = this.A04;
        r1.A06 = true;
        r1.A05 = false;
        r1.A02 = false;
        r1.A03();
    }

    public void A09() {
        C04740Ql r1 = this.A04;
        r1.A06 = false;
        r1.A02();
    }

    public C04740Ql A0I(boolean z) {
        C04740Ql r3 = this.A04;
        r3.A00();
        r3.A02 = true;
        C08360eK r2 = this.A01;
        if (r2 != null) {
            A0F(r2);
            if (z && r2.A00) {
                r2.A01.BVf(r2.A02);
            }
        }
        C15130qp r0 = r3.A01;
        if (r0 == null) {
            throw AnonymousClass001.A0e("No listener register");
        } else if (r0 == this) {
            r3.A01 = null;
            if ((r2 == null || r2.A00) && !z) {
                return r3;
            }
            r3.A01();
            r3.A05 = true;
            r3.A06 = false;
            r3.A02 = false;
            r3.A03 = false;
            r3.A04 = false;
            return this.A02;
        } else {
            throw AnonymousClass001.A0c("Attempting to unregister the wrong listener");
        }
    }

    public void A0J() {
        C15910sA r1 = this.A00;
        C08360eK r0 = this.A01;
        if (r1 != null && r0 != null) {
            super.A0F(r0);
            A0B(r1, r0);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        AnonymousClass000.A1J(sb, "LoaderInfo{", this);
        sb.append(" #");
        sb.append(0);
        sb.append(" : ");
        AnonymousClass0I1.A00(this.A04, sb);
        return AnonymousClass000.A0X("}}", sb);
    }

    public AnonymousClass08L(Bundle bundle, C04740Ql r3, C04740Ql r4) {
        this.A03 = bundle;
        this.A04 = r3;
        this.A02 = r4;
        if (r3.A01 == null) {
            r3.A01 = this;
            return;
        }
        throw AnonymousClass001.A0e("There is already a listener registered");
    }

    public void A0F(C15930sC r2) {
        super.A0F(r2);
        this.A00 = null;
        this.A01 = null;
    }

    public void A0H(Object obj) {
        super.A0H(obj);
        C04740Ql r1 = this.A02;
        if (r1 != null) {
            r1.A01();
            r1.A05 = true;
            r1.A06 = false;
            r1.A02 = false;
            r1.A03 = false;
            r1.A04 = false;
            this.A02 = null;
        }
    }
}
