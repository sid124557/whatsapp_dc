package X;

/* renamed from: X.1SK  reason: invalid class name */
public final class AnonymousClass1SK extends AnonymousClass33W {
    public final String A00;
    public final String A01;

    public AnonymousClass18L A06() {
        C130546c9 A0G = C21101An.DEFAULT_INSTANCE.A0G();
        String str = this.A00;
        C21101An r1 = (C21101An) C18320x8.A0C(A0G);
        r1.bitField0_ |= 1;
        r1.version_ = str;
        AnonymousClass18L A06 = super.A06();
        if (A06 == null) {
            return null;
        }
        AnonymousClass1EO r2 = (AnonymousClass1EO) C18320x8.A0C(A06);
        C21101An r0 = (C21101An) A0G.A06();
        r0.getClass();
        r2.primaryVersionAction_ = r0;
        r2.bitField0_ |= 67108864;
        return A06;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1SK(AnonymousClass33J r10, String str, String str2, String str3, long j) {
        super(C60642yt.A03, r10, str3, "regular_low", 7, j, false);
        C18260x0.A0S(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        StringBuilder A0w = C18290x4.A0w("PrimaryVersionMutation{", A0o);
        AnonymousClass33W.A02(this, "rowId=", A0w);
        C18270x1.A1C(", ", A0w, A0o);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("versionType=");
        A0o2.append(this.A01);
        C18270x1.A1C(", ", A0o2, A0o);
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("appVersion=");
        A0o3.append(this.A00);
        C18270x1.A1C(", ", A0o3, A0o);
        StringBuilder A0o4 = AnonymousClass001.A0o();
        A0o4.append("timestamp=");
        A0o4.append(this.A04);
        C18270x1.A1C(", ", A0o4, A0o);
        StringBuilder A0o5 = AnonymousClass001.A0o();
        A0o5.append("operation=");
        A0o5.append(this.A05);
        C18270x1.A1C(", ", A0o5, A0o);
        StringBuilder A0o6 = AnonymousClass001.A0o();
        A0o6.append("collectionName=");
        A0o6.append(this.A06);
        C18270x1.A1C(", ", A0o6, A0o);
        StringBuilder A0o7 = AnonymousClass001.A0o();
        A0o7.append("keyId=");
        return C18260x0.A08(AnonymousClass000.A0R(this.A00, A0o7), A0o);
    }
}
