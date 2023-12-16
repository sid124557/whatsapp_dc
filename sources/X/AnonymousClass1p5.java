package X;

import android.text.TextUtils;

/* renamed from: X.1p5  reason: invalid class name */
public class AnonymousClass1p5 extends C30481mW implements AnonymousClass4FG, AnonymousClass4B9, AnonymousClass4BA {
    public C47142cm A00;

    public AnonymousClass1p5(AnonymousClass2z0 r8, AnonymousClass1p5 r9, long j) {
        super(r8, r9, j, true);
        this.A00 = r9.A00.A00();
    }

    public void BnY(C47142cm r1) {
        this.A00 = r1;
    }

    public String A20() {
        if (C624134x.A0a(this)) {
            return this.A00.A02;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("*");
        A0o2.append(A13());
        C18270x1.A1C("*", A0o2, A0o);
        A0o.append("\n");
        return AnonymousClass000.A0X(this.A00.A02, A0o);
    }

    public /* bridge */ /* synthetic */ C624134x Az2(AnonymousClass2z0 r2, long j) {
        return A1v(r2, j);
    }

    public String B7t() {
        C47142cm r2;
        String str;
        if (!C624134x.A0a(this)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(A13());
            A0o.append(" ");
            r2 = this.A00;
            str = AnonymousClass000.A0X(r2.A02, A0o);
        } else {
            r2 = this.A00;
            str = r2.A02;
        }
        if (TextUtils.isEmpty(r2.A03)) {
            return str;
        }
        return AnonymousClass000.A0X(this.A00.A03, AnonymousClass000.A0m(str, " "));
    }

    public String BA2(C620733j r2) {
        if (!C624134x.A0a(this)) {
            return A13();
        }
        return this.A00.A02;
    }

    public String BBe() {
        if (!C624134x.A0a(this)) {
            return A13();
        }
        return this.A00.A02;
    }

    public String BBp() {
        return A20();
    }

    public C47142cm BDY() {
        return this.A00;
    }

    public AnonymousClass1p5(AnonymousClass2z0 r2, long j) {
        super(r2, (byte) 27, j);
    }
}
