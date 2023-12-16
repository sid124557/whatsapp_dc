package X;

import java.util.Map;

/* renamed from: X.3Wv  reason: invalid class name and case insensitive filesystem */
public final class C69393Wv implements AnonymousClass48Z {
    public final AnonymousClass21K A00;
    public final C60752z6 A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Map A05;

    public C69393Wv(AnonymousClass21K r2, C60752z6 r3, String str, String str2, String str3, String str4, Map map) {
        C18270x1.A11(str2, 3, str3);
        this.A00 = r2;
        this.A03 = str;
        this.A04 = str3;
        this.A02 = str4;
        this.A05 = map;
        this.A01 = r3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FcsResourceExecutionEvent: ");
        A0o.append(this.A00);
        A0o.append(" resourceId = ");
        A0o.append(this.A03);
        A0o.append(" stateName = ");
        A0o.append(this.A04);
        A0o.append(" error = ");
        return AnonymousClass000.A0R(this.A01, A0o);
    }
}
