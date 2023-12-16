package X;

/* renamed from: X.5MS  reason: invalid class name */
public final class AnonymousClass5MS {
    public final C116985rC A00;

    public final AnonymousClass58L A00(C624134x r4) {
        C162457s7.A0J(r4, 0);
        byte b = r4.A1I;
        if (b == 20) {
            if (r4.A0P == null) {
                return AnonymousClass58L.STICKERS;
            }
        } else if (!(b == 23 || b == 37 || b == 42 || b == 43)) {
            if (b == 1 || b == 3) {
                String A1w = ((C30471mV) r4).A1w();
                if (A1w == null || A1w.length() == 0) {
                    return AnonymousClass58L.IMAGES;
                }
            } else if (b == 0) {
                C116985rC r1 = this.A00;
                if (r1.A07() && C116985rC.A03(r1).B21(r4)) {
                    return AnonymousClass58L.AGENT_LINKS;
                }
            }
        }
        return AnonymousClass58L.NONE;
    }

    public AnonymousClass5MS(C116985rC r1) {
        this.A00 = r1;
    }
}
