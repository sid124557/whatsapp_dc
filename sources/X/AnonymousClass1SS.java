package X;

import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.1SS  reason: invalid class name */
public final class AnonymousClass1SS extends AnonymousClass33W {
    public static final C60642yt A02 = C60642yt.A03;
    public final C27981fH A00;
    public final PhoneUserJid A01;

    public AnonymousClass1SS(AnonymousClass33J r10, C27981fH r11, PhoneUserJid phoneUserJid, String str, long j) {
        super(A02, r10, str, "regular", 7, j, false);
        this.A00 = r11;
        this.A01 = phoneUserJid;
    }

    public AnonymousClass18L A06() {
        AnonymousClass18L A06 = super.A06();
        if (A06 != null) {
            C130546c9 A0G = C21091Am.DEFAULT_INSTANCE.A0G();
            String A0g = C18300x5.A0g(A0G, this.A01);
            C21091Am r1 = (C21091Am) A0G.A00;
            A0g.getClass();
            r1.bitField0_ |= 1;
            r1.pnJid_ = A0g;
            AnonymousClass1EO r2 = (AnonymousClass1EO) C18320x8.A0C(A06);
            C21091Am r0 = (C21091Am) A0G.A06();
            r0.getClass();
            r2.pnForLidChatAction_ = r0;
            r2.bitField0_ |= Integer.MIN_VALUE;
            return A06;
        }
        throw AnonymousClass001.A0g("Super returned null builder");
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PnForLidChatMutation(lidUserJid=");
        A0o.append(this.A00);
        A0o.append(", phoneUserJid=");
        return C18260x0.A04(this.A01, A0o);
    }
}
