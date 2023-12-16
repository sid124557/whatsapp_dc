package X;

import android.text.TextUtils;

/* renamed from: X.1mv  reason: invalid class name and case insensitive filesystem */
public class C30731mv extends AnonymousClass1nF implements AnonymousClass4FG, AnonymousClass4B9 {
    public C47142cm A00;

    public C30731mv(AnonymousClass2z0 r2, long j) {
        super(r2, (byte) 26, j);
    }

    public String B7t() {
        String str;
        String A1x;
        if (!TextUtils.isEmpty(this.A00.A03)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            C47142cm r1 = this.A00;
            A0o.append(r1.A02);
            A0o.append(" ");
            str = AnonymousClass000.A0X(r1.A03, A0o);
        } else {
            str = this.A00.A02;
        }
        if (!TextUtils.isEmpty(this.A01)) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            AnonymousClass0x2.A1N(A0o2, this.A01);
            A1x = AnonymousClass000.A0X(A1x(), A0o2);
        } else {
            A1x = A1x();
        }
        if (!TextUtils.isEmpty(A1x)) {
            return C18260x0.A06(A1x, " ", str);
        }
        return str;
    }

    public String BBe() {
        return this.A00.A02;
    }

    public String BBp() {
        return this.A00.A02;
    }

    public void BnY(C47142cm r1) {
        this.A00 = r1;
    }

    public String BA2(C620733j r3) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("📄 ");
        return AnonymousClass000.A0X(this.A00.A02, A0o);
    }

    public C47142cm BDY() {
        return this.A00;
    }

    public C30731mv(AnonymousClass33C r10, AnonymousClass2z0 r11, C30731mv r12, long j) {
        super(r10, r11, r12, r12.A1I, j, true);
        this.A00 = r12.A00.A00();
    }
}
