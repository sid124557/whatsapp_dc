package X;

/* renamed from: X.32U  reason: invalid class name */
public final class AnonymousClass32U {
    public static final AnonymousClass2z0 A01(AnonymousClass1ET r4) {
        if (AnonymousClass0x2.A1X(r4.bitField0_)) {
            C95814uZ A05 = C95814uZ.A00.A05(r4.remoteJid_);
            if (A05 == null) {
                throw AnonymousClass24W.A01(0, "Message Key is malformed: failed to parse remote JID.");
            } else if ((r4.bitField0_ & 4) != 0) {
                String str = r4.id_;
                if (AnonymousClass0x7.A06(str) != 0) {
                    return AnonymousClass2z0.A05(A05, str, r4.fromMe_);
                }
                throw AnonymousClass24W.A01(0, "Message Key is malformed: ID is null or empty");
            } else {
                throw AnonymousClass24W.A01(0, "Message Key is malformed: no message ID set.");
            }
        } else {
            throw AnonymousClass24W.A01(0, "Message Key is malformed: no remote JID set.");
        }
    }

    public final AnonymousClass2z0 A02(AnonymousClass1ES r3) {
        if ((r3.bitField0_ & 1) != 0) {
            AnonymousClass1ET r0 = r3.key_;
            if (r0 == null) {
                r0 = AnonymousClass1ET.DEFAULT_INSTANCE;
            }
            C162457s7.A0D(r0);
            return A01(r0);
        }
        throw AnonymousClass24W.A01(0, "Message Key was not set.");
    }

    public static final long A00(AnonymousClass1ES r3) {
        if ((r3.bitField0_ & 4) != 0) {
            return r3.messageTimestamp_ * 1000;
        }
        return 0;
    }
}
