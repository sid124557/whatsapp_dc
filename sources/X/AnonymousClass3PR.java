package X;

/* renamed from: X.3PR  reason: invalid class name */
public final class AnonymousClass3PR implements AnonymousClass4D2 {
    public void BYV(C52952mJ r4, AnonymousClass1A3 r5, C624134x r6) {
        boolean A1U = C18270x1.A1U(r6, r5);
        if (r6.A1B) {
            AnonymousClass1ES A0O = C18280x3.A0O(r5);
            A0O.bitField0_ |= 256;
            A0O.broadcast_ = A1U;
        }
    }

    public void BYW(C50972j4 r2, AnonymousClass1ES r3, C624134x r4) {
        C18260x0.A0O(r3, r4);
        if ((r3.bitField0_ & 256) != 0) {
            r4.A1B = r3.broadcast_;
        }
    }
}
