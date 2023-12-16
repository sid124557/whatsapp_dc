package X;

/* renamed from: X.1SY  reason: invalid class name */
public class AnonymousClass1SY extends AnonymousClass33W implements C837649r, C837849t {
    public final C95814uZ A00;
    public final boolean A01;

    public AnonymousClass1SY(C95814uZ r9, long j, boolean z) {
        this((AnonymousClass33J) null, r9, (String) null, j, z, false);
    }

    public AnonymousClass18L A06() {
        C130546c9 A0G = C21081Al.DEFAULT_INSTANCE.A0G();
        boolean z = this.A01;
        C21081Al r1 = (C21081Al) C18320x8.A0C(A0G);
        r1.bitField0_ |= 1;
        r1.pinned_ = z;
        AnonymousClass18L A06 = super.A06();
        AnonymousClass1EO A002 = AnonymousClass33W.A00(A06);
        C21081Al r0 = (C21081Al) A0G.A06();
        r0.getClass();
        A002.pinAction_ = r0;
        A002.bitField0_ |= 16;
        return A06;
    }

    public boolean BJD() {
        return !this.A01;
    }

    public C95814uZ getChatJid() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass33W.A02(this, "PinChatMutation{rowId=", A0o);
        A0o.append(", chatJid=");
        A0o.append(this.A00);
        A0o.append(", isPinned=");
        A0o.append(this.A01);
        A0o.append(", timestamp=");
        AnonymousClass33W.A05(this, A0o, this.A04);
        return A0o.toString();
    }

    public AnonymousClass1SY(AnonymousClass33J r10, C95814uZ r11, String str, long j, boolean z, boolean z2) {
        super(C60642yt.A03, r10, str, "regular_low", 5, j, z2);
        this.A00 = r11;
        this.A01 = z;
    }
}
