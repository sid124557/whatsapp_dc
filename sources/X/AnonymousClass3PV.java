package X;

/* renamed from: X.3PV  reason: invalid class name */
public final class AnonymousClass3PV implements AnonymousClass4D2 {
    public static final void A00(AnonymousClass1A3 r4, C624134x r5) {
        String A14 = r5.A14();
        if (A14 != null) {
            C130546c9 A0K = C18300x5.A0K(C21221Az.DEFAULT_INSTANCE);
            C21221Az r1 = (C21221Az) A0K.A00;
            r1.bitField0_ |= 1;
            r1.serverCampaignId_ = A14;
            AnonymousClass1ES A0X = C18310x6.A0X(r4);
            C21221Az r0 = (C21221Az) A0K.A06();
            r0.getClass();
            A0X.premiumMessageInfo_ = r0;
            A0X.bitField1_ |= 256;
        }
    }

    public void BYV(C52952mJ r1, AnonymousClass1A3 r2, C624134x r3) {
        C18260x0.A0O(r3, r2);
        A00(r2, r3);
    }

    public void BYW(C50972j4 r2, AnonymousClass1ES r3, C624134x r4) {
        C18260x0.A0O(r3, r4);
        if ((r3.bitField1_ & 256) != 0) {
            C21221Az r0 = r3.premiumMessageInfo_;
            if (r0 == null) {
                r0 = C21221Az.DEFAULT_INSTANCE;
            }
            r4.A1b(r0.serverCampaignId_);
        }
    }
}
