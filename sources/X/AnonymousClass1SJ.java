package X;

/* renamed from: X.1SJ  reason: invalid class name */
public class AnonymousClass1SJ extends AnonymousClass33W {
    public final boolean A00;

    public AnonymousClass1SJ(AnonymousClass33J r10, String str, long j, boolean z) {
        super(C60642yt.A03, r10, str, "regular_low", 4, j, false);
        this.A00 = z;
    }

    public AnonymousClass18L A06() {
        C130546c9 A0G = C21171Au.DEFAULT_INSTANCE.A0G();
        boolean z = this.A00;
        C21171Au r1 = (C21171Au) C18320x8.A0C(A0G);
        r1.bitField0_ |= 1;
        r1.unarchiveChats_ = z;
        AnonymousClass18L A06 = super.A06();
        AnonymousClass1EO A002 = AnonymousClass33W.A00(A06);
        C21171Au r0 = (C21171Au) A0G.A06();
        r0.getClass();
        A002.unarchiveChatsSetting_ = r0;
        A002.bitField0_ |= 262144;
        return A06;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass33W.A02(this, "UnarchiveChatsSettingMutation{rowId=", A0o);
        A0o.append(", isUnarchiveChatsSettingEnabled=");
        A0o.append(this.A00);
        A0o.append(", timestamp=");
        AnonymousClass33W.A05(this, A0o, this.A04);
        return A0o.toString();
    }
}
