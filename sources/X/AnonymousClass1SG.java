package X;

/* renamed from: X.1SG  reason: invalid class name */
public class AnonymousClass1SG extends AnonymousClass33W {
    public final String A00;

    public AnonymousClass1SG(AnonymousClass33J r10, String str, String str2, long j) {
        super(C60642yt.A03, r10, str, "critical_block", 1, j, false);
        this.A00 = str2;
    }

    public AnonymousClass18L A06() {
        C130546c9 A0G = C21121Ap.DEFAULT_INSTANCE.A0G();
        String str = this.A00;
        C21121Ap r1 = (C21121Ap) C18320x8.A0C(A0G);
        str.getClass();
        r1.bitField0_ |= 1;
        r1.name_ = str;
        AnonymousClass18L A06 = super.A06();
        AnonymousClass1EO A002 = AnonymousClass33W.A00(A06);
        C21121Ap r0 = (C21121Ap) A0G.A06();
        r0.getClass();
        A002.pushNameSetting_ = r0;
        A002.bitField0_ |= 64;
        return A06;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass33W.A02(this, "PushNameSettingMutation{rowId=", A0o);
        A0o.append(", pushName=");
        A0o.append(this.A00);
        A0o.append(", timestamp=");
        AnonymousClass33W.A05(this, A0o, this.A04);
        return A0o.toString();
    }
}
