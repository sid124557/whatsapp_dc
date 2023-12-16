package X;

/* renamed from: X.3PG  reason: invalid class name */
public final class AnonymousClass3PG implements AnonymousClass4D2 {
    public void BYV(C52952mJ r9, AnonymousClass1A3 r10, C624134x r11) {
        C18260x0.A0O(r11, r10);
        if (!AnonymousClass27M.A00(r10, r11) && r11.A1J.A02 && r11.A0D != 0) {
            long j = r11.A0K / 1000;
            long j2 = r11.A0J / 1000;
            if (j2 > 0 && j2 != j) {
                AnonymousClass1ES A0O = C18280x3.A0O(r10);
                A0O.bitField0_ |= 32;
                A0O.messageC2STimestamp_ = j2;
            }
        }
    }

    public /* synthetic */ void BYW(C50972j4 r1, AnonymousClass1ES r2, C624134x r3) {
    }
}
