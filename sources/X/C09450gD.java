package X;

/* renamed from: X.0gD  reason: invalid class name and case insensitive filesystem */
public class C09450gD implements C16240sh {
    public final C02360Fw A00;
    public final String A01;
    public final boolean A02;

    public C16780tx Bqm(AnonymousClass01G r2, C09320g0 r3) {
        if (r2.A0A) {
            return new C09210fp(this);
        }
        AnonymousClass0S3.A00("Animation contains merge paths but they are disabled.");
        return null;
    }

    public C09450gD(C02360Fw r1, String str, boolean z) {
        this.A01 = str;
        this.A00 = r1;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MergePaths{mode=");
        return AnonymousClass000.A0Q(this.A00, A0o);
    }
}
