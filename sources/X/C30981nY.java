package X;

import android.text.TextUtils;

/* renamed from: X.1nY  reason: invalid class name and case insensitive filesystem */
public class C30981nY extends AnonymousClass1n9 implements AnonymousClass4FG {
    public C47142cm A00;

    public C30981nY(AnonymousClass2z0 r9, C30981nY r10, long j) {
        super(r9, r10, r10.A1I, j, true);
        this.A00 = r10.A00.A00();
    }

    public String B7t() {
        if (TextUtils.isEmpty(this.A00.A03)) {
            return this.A00.A02;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        C47142cm r1 = this.A00;
        AnonymousClass0x2.A1N(A0o, r1.A02);
        return AnonymousClass000.A0X(r1.A03, A0o);
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
        A0o.append("📌 ");
        return AnonymousClass000.A0X(this.A00.A02, A0o);
    }

    public C47142cm BDY() {
        return this.A00;
    }

    public C30981nY(AnonymousClass2z0 r2, long j) {
        super(r2, (byte) 30, j);
    }
}
