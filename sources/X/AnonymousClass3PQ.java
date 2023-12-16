package X;

/* renamed from: X.3PQ  reason: invalid class name */
public final class AnonymousClass3PQ implements AnonymousClass4D2 {
    public static final void A00(AnonymousClass1A3 r6, C624134x r7) {
        Long A0f;
        if (r7.A1J.A02) {
            boolean A1W = AnonymousClass001.A1W(r7.A05);
            boolean A1U = AnonymousClass001.A1U(AnonymousClass358.A00(r7.A0D, 4));
            Long l = r7.A0r;
            if (l == null) {
                A0f = null;
            } else {
                A0f = C18310x6.A0f(l.longValue(), C18290x4.A0A(r7.A05));
            }
            if (A1W && A1U && A0f != null) {
                long A0B = C18290x4.A0B(A0f.longValue());
                AnonymousClass1ES A0O = C18280x3.A0O(r6);
                A0O.bitField0_ |= 1048576;
                A0O.ephemeralStartTimestamp_ = A0B;
            }
        } else if (AnonymousClass000.A1U(r7.A0A & 512, 512)) {
            AnonymousClass1ES A0O2 = C18280x3.A0O(r6);
            A0O2.bitField0_ |= 8388608;
            A0O2.ephemeralOutOfSync_ = true;
        }
    }

    public void BYV(C52952mJ r2, AnonymousClass1A3 r3, C624134x r4) {
        C18260x0.A0O(r4, r3);
        if (!AnonymousClass27M.A00(r3, r4)) {
            A00(r3, r4);
        }
    }

    public /* synthetic */ void BYW(C50972j4 r1, AnonymousClass1ES r2, C624134x r3) {
    }
}
