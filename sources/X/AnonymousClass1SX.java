package X;

/* renamed from: X.1SX  reason: invalid class name */
public class AnonymousClass1SX extends AnonymousClass33W implements C837649r, C837849t {
    public final long A00;
    public final C95814uZ A01;
    public final boolean A02;

    public AnonymousClass1SX(AnonymousClass33J r11, C95814uZ r12, String str, long j, long j2, boolean z, boolean z2) {
        super(C60642yt.A03, r11, str, "regular_high", 2, j2, z2);
        this.A01 = r12;
        this.A02 = z;
        this.A00 = j;
    }

    public AnonymousClass18L A06() {
        C130546c9 A0G = AnonymousClass1CN.DEFAULT_INSTANCE.A0G();
        boolean z = this.A02;
        AnonymousClass1CN r1 = (AnonymousClass1CN) C18320x8.A0C(A0G);
        r1.bitField0_ |= 1;
        r1.muted_ = z;
        if (z) {
            long j = this.A00;
            AnonymousClass1CN r12 = (AnonymousClass1CN) C18320x8.A0C(A0G);
            r12.bitField0_ |= 2;
            r12.muteEndTimestamp_ = j;
        }
        AnonymousClass18L A06 = super.A06();
        AnonymousClass1EO A002 = AnonymousClass33W.A00(A06);
        AnonymousClass1CN r0 = (AnonymousClass1CN) A0G.A06();
        r0.getClass();
        A002.muteAction_ = r0;
        A002.bitField0_ |= 8;
        return A06;
    }

    public boolean BJD() {
        return !this.A02;
    }

    public C95814uZ getChatJid() {
        return this.A01;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass33W.A02(this, "MuteChatMutation{rowId=", A0o);
        A0o.append(", chatJid=");
        A0o.append(this.A01);
        A0o.append(", muteEndTimestamp=");
        A0o.append(this.A00);
        A0o.append(", isMuted=");
        A0o.append(this.A02);
        A0o.append(", timestamp=");
        AnonymousClass33W.A05(this, A0o, this.A04);
        return A0o.toString();
    }
}
