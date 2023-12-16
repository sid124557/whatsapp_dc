package X;

/* renamed from: X.3PT  reason: invalid class name */
public final class AnonymousClass3PT implements AnonymousClass4D2 {
    public void BYV(C52952mJ r4, AnonymousClass1A3 r5, C624134x r6) {
        boolean A1U = C18270x1.A1U(r6, r5);
        if (r6.A1F) {
            AnonymousClass1ES A0O = C18280x3.A0O(r5);
            A0O.bitField0_ |= 128;
            A0O.starred_ = A1U;
        }
    }

    public void BYW(C50972j4 r3, AnonymousClass1ES r4, C624134x r5) {
        boolean A1U = C18270x1.A1U(r4, r5);
        if ((r4.bitField0_ & 128) != 0 && r4.starred_) {
            r5.A1F = A1U;
        }
    }
}
