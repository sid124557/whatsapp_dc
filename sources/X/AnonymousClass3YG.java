package X;

/* renamed from: X.3YG  reason: invalid class name */
public final class AnonymousClass3YG implements C84314Bw {
    public final C56612sH A00;
    public final C61182zq A01;

    public AnonymousClass3YG(C56612sH r1, C61182zq r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public boolean AxE(AnonymousClass2PJ r10, C833648c r11, C833748d r12) {
        boolean A1U = C18270x1.A1U(r12, r10);
        AnonymousClass3YL r122 = (AnonymousClass3YL) r12;
        String str = r122.A0F;
        C61182zq r5 = this.A01;
        long A0B = AnonymousClass0x2.A0B(r5.A00, C61182zq.A00(str, "eligibilityDurationAfterFirstImpression"));
        int i = r122.A00;
        if (i <= 0 || A0B <= 0 || AnonymousClass0x9.A05(A0B) > ((long) i)) {
            Object obj = r10.A01.get("param");
            if (obj != null) {
                if (System.currentTimeMillis() < r5.A02(C373021s.IMPRESSION, str) + (Long.parseLong((String) obj) * ((long) 1000))) {
                    return false;
                }
            } else {
                throw C18290x4.A0Y();
            }
        }
        return A1U;
    }
}
