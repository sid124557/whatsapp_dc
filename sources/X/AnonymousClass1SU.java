package X;

/* renamed from: X.1SU  reason: invalid class name */
public class AnonymousClass1SU extends AnonymousClass33W implements C837649r, C837749s {
    public final AnonymousClass35N A00;
    public final C95814uZ A01;
    public final boolean A02;
    public final boolean A03;

    public AnonymousClass1SU(AnonymousClass33J r11, AnonymousClass35N r12, C95814uZ r13, String str, long j, boolean z, boolean z2, boolean z3) {
        super(C60642yt.A03, r11, str, "regular_high", 6, j, z3);
        this.A01 = r13;
        this.A03 = z;
        this.A02 = z2;
        this.A00 = r12;
    }

    public AnonymousClass18L A06() {
        C130546c9 A0G = C21021Af.DEFAULT_INSTANCE.A0G();
        AnonymousClass1CO A04 = this.A00.A04();
        C21021Af r1 = (C21021Af) C18320x8.A0C(A0G);
        A04.getClass();
        r1.messageRange_ = A04;
        r1.bitField0_ |= 1;
        AnonymousClass18L A06 = super.A06();
        AnonymousClass1EO A002 = AnonymousClass33W.A00(A06);
        C21021Af r0 = (C21021Af) A0G.A06();
        r0.getClass();
        A002.clearChatAction_ = r0;
        A002.bitField0_ |= 65536;
        return A06;
    }

    public AnonymousClass35N B9b() {
        return this.A00;
    }

    public C95814uZ getChatJid() {
        return this.A01;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass33W.A02(this, "ClearChatMutation{rowId=", A0o);
        A0o.append(", chatJid=");
        A0o.append(this.A01);
        A0o.append(", deleteStarredMessages=");
        A0o.append(this.A03);
        A0o.append(", deleteMediaFiles=");
        A0o.append(this.A02);
        A0o.append(", messageRange=");
        C18310x6.A1J(this.A00, A0o);
        AnonymousClass33W.A05(this, A0o, this.A04);
        return A0o.toString();
    }
}
