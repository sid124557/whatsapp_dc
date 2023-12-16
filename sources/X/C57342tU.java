package X;

/* renamed from: X.2tU  reason: invalid class name and case insensitive filesystem */
public final class C57342tU {
    public static final void A00(AnonymousClass1ES r2, C624134x r3) {
        String str;
        AnonymousClass1ET r0 = r2.key_;
        AnonymousClass1ET r1 = r0;
        if (r0 == null) {
            r0 = AnonymousClass1ET.DEFAULT_INSTANCE;
        }
        if ((r0.bitField0_ & 8) != 0) {
            if (r1 == null) {
                r1 = AnonymousClass1ET.DEFAULT_INSTANCE;
            }
            str = r1.participant_;
        } else if ((r2.bitField0_ & 16) != 0) {
            str = r2.participant_;
        } else {
            return;
        }
        r3.A1J(AnonymousClass32Y.A08(str));
    }
}
