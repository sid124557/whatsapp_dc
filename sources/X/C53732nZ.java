package X;

import java.util.Map;

/* renamed from: X.2nZ  reason: invalid class name and case insensitive filesystem */
public final class C53732nZ {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Map A06;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C53732nZ) && C162457s7.A0P(this.A06, ((C53732nZ) obj).A06));
    }

    public int hashCode() {
        return this.A06.hashCode();
    }

    public C53732nZ(Map map) {
        this.A06 = map;
        this.A05 = C18310x6.A0o("title", map);
        this.A00 = C18310x6.A0o("body", map);
        Object A0Z = C18320x8.A0Z(map, "btn_primary_text");
        C162457s7.A0D(A0Z);
        this.A02 = (String) A0Z;
        Object A0Z2 = C18320x8.A0Z(map, "btn_primary_url");
        C162457s7.A0D(A0Z2);
        this.A01 = (String) A0Z2;
        this.A04 = C18310x6.A0o("btn_secondary_text", map);
        this.A03 = C18310x6.A0o("btn_secondary_url", map);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CustomBlockScreenData(customBlockScreenData=");
        return C18260x0.A04(this.A06, A0o);
    }
}
