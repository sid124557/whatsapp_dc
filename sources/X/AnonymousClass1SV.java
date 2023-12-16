package X;

/* renamed from: X.1SV  reason: invalid class name */
public class AnonymousClass1SV extends AnonymousClass33W implements C837649r, C837749s, C837849t {
    public final AnonymousClass35N A00;
    public final C95814uZ A01;
    public final boolean A02;

    public AnonymousClass1SV(AnonymousClass33J r11, AnonymousClass35N r12, C95814uZ r13, String str, long j, boolean z, boolean z2) {
        super(C60642yt.A03, r11, str, "regular_low", 3, j, z2);
        this.A01 = r13;
        this.A02 = z;
        this.A00 = r12;
    }

    public AnonymousClass18L A06() {
        C130546c9 A0G = C21281Bf.DEFAULT_INSTANCE.A0G();
        boolean z = this.A02;
        C21281Bf r1 = (C21281Bf) C18320x8.A0C(A0G);
        r1.bitField0_ |= 1;
        r1.read_ = z;
        AnonymousClass1CO A04 = this.A00.A04();
        C21281Bf r12 = (C21281Bf) C18320x8.A0C(A0G);
        A04.getClass();
        r12.messageRange_ = A04;
        r12.bitField0_ |= 2;
        AnonymousClass18L A06 = super.A06();
        AnonymousClass1EO A002 = AnonymousClass33W.A00(A06);
        C21281Bf r0 = (C21281Bf) A0G.A06();
        r0.getClass();
        A002.markChatAsReadAction_ = r0;
        A002.bitField0_ |= 32768;
        return A06;
    }

    public boolean BJD() {
        return !this.A02;
    }

    public AnonymousClass35N B9b() {
        return this.A00;
    }

    public C95814uZ getChatJid() {
        return this.A01;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass33W.A02(this, "MarkChatAsReadMutation{rowId=", A0o);
        A0o.append(", chatJid=");
        A0o.append(this.A01);
        A0o.append(", isRead=");
        A0o.append(this.A02);
        A0o.append(", messageRange=");
        C18310x6.A1J(this.A00, A0o);
        AnonymousClass33W.A05(this, A0o, this.A04);
        return A0o.toString();
    }
}
