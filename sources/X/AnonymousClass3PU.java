package X;

/* renamed from: X.3PU  reason: invalid class name */
public final class AnonymousClass3PU implements AnonymousClass4D2 {
    public static final void A00(AnonymousClass1A3 r4, C624134x r5) {
        if (AnonymousClass2z0.A0C(r5)) {
            long j = r5.A1M;
            AnonymousClass1ES A0O = C18280x3.A0O(r4);
            A0O.bitField1_ |= 16384;
            A0O.newsletterServerId_ = j;
        }
    }

    public void BYV(C52952mJ r1, AnonymousClass1A3 r2, C624134x r3) {
        C18260x0.A0O(r3, r2);
        A00(r2, r3);
    }

    public void BYW(C50972j4 r3, AnonymousClass1ES r4, C624134x r5) {
        C18260x0.A0O(r4, r5);
        if ((r4.bitField1_ & 16384) != 0) {
            r5.A1M = r4.newsletterServerId_;
        }
    }
}
