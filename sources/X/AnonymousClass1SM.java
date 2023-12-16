package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1SM  reason: invalid class name */
public final class AnonymousClass1SM extends AnonymousClass33W {
    public final UserJid A00;
    public final boolean A01;

    public AnonymousClass1SM(AnonymousClass33J r10, UserJid userJid, String str, long j, boolean z, boolean z2) {
        super(C60642yt.A03, r10, str, "regular_high", 7, j, z2);
        this.A00 = userJid;
        this.A01 = z;
    }

    public AnonymousClass18L A06() {
        C130546c9 A0G = C21181Av.DEFAULT_INSTANCE.A0G();
        boolean z = this.A01;
        C21181Av r1 = (C21181Av) C18320x8.A0C(A0G);
        r1.bitField0_ |= 1;
        r1.muted_ = z;
        AnonymousClass18L A06 = super.A06();
        C162457s7.A0H(A06);
        AnonymousClass1EO r2 = (AnonymousClass1EO) C18320x8.A0C(A06);
        C21181Av r0 = (C21181Av) A0G.A06();
        r0.getClass();
        r2.userStatusMuteAction_ = r0;
        r2.bitField0_ |= 8388608;
        return A06;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UserStatusMuteMutation{userJid=");
        A0o.append(this.A00);
        AnonymousClass33W.A02(this, ", rowId=", A0o);
        A0o.append(", isMuted=");
        A0o.append(this.A01);
        A0o.append(", timestamp=");
        A0o.append(this.A04);
        A0o.append(", keyId=");
        return AnonymousClass000.A0Q(this.A00, A0o);
    }
}
