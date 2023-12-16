package X;

import java.util.Map;

/* renamed from: X.5T0  reason: invalid class name */
public final class AnonymousClass5T0 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Map A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5T0) && C162457s7.A0P(this.A04, ((AnonymousClass5T0) obj).A04));
    }

    public int hashCode() {
        return this.A04.hashCode();
    }

    public AnonymousClass5T0(Map map) {
        boolean z;
        this.A04 = map;
        this.A03 = C18310x6.A0o("title", map);
        this.A00 = C18310x6.A0o("body", map);
        if (map.get("hide_date") != null) {
            Object obj = map.get("hide_date");
            C162457s7.A0K(obj, "null cannot be cast to non-null type kotlin.Boolean");
            z = AnonymousClass001.A1Z(obj);
        } else {
            z = true;
        }
        this.A05 = z;
        Object A0Z = C18320x8.A0Z(map, "btn_primary_text");
        C162457s7.A0K(A0Z, "null cannot be cast to non-null type kotlin.String");
        this.A02 = (String) A0Z;
        Object A0Z2 = C18320x8.A0Z(map, "btn_primary_url");
        C162457s7.A0K(A0Z2, "null cannot be cast to non-null type kotlin.String");
        this.A01 = (String) A0Z2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CustomForceUpgradeData(customForceUpgradeData=");
        return C18260x0.A04(this.A04, A0o);
    }
}
