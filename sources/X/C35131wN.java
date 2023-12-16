package X;

/* renamed from: X.1wN  reason: invalid class name and case insensitive filesystem */
public final class C35131wN extends C41022Iq implements C84304Bv {
    public final C34801vq A00;
    public final C35051wF A01;

    public void AwE(C58892vz r7) {
        C35051wF r4 = this.A01;
        String str = r4.A04;
        String str2 = r4.A02;
        C34801vq r5 = this.A00;
        if ("gcm".equals(str)) {
            r7.A03[0] = str2;
            Long l = r4.A00;
            if (l != null) {
                C18280x3.A1R(r7.A01, 0, l.longValue());
            }
        } else if ("fbns".equals(str)) {
            r7.A02[0] = str2;
        }
        if (r5 != null) {
            r7.A04[0] = r5.A00;
        }
        Long l2 = r4.A01;
        if (l2 != null) {
            C18280x3.A1R(r7.A05, 0, l2.longValue());
        }
        r7.A06[0] = r4.A03;
        r7.A07[0] = r4.A05;
    }

    public C35131wN(AnonymousClass36K r3) {
        AnonymousClass36K.A0N(r3, "config");
        this.A01 = (C35051wF) C626836d.A02(r3, C86304Jp.A00(83), 0);
        this.A00 = (C34801vq) C626836d.A08(r3, new String[]{"item"}, 84);
        this.A00 = r3;
    }
}
