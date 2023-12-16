package X;

/* renamed from: X.2xO  reason: invalid class name and case insensitive filesystem */
public class C59732xO {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public C59732xO(C21811Dg r4) {
        Integer num;
        Integer num2;
        Integer num3;
        boolean z;
        boolean z2;
        boolean z3;
        Integer num4 = null;
        if (r4 == null || (r4.bitField0_ & 1) == 0) {
            num = null;
        } else {
            num = Integer.valueOf(r4.fullSyncDaysLimit_);
        }
        this.A00 = num;
        if (r4 == null || (r4.bitField0_ & 2) == 0) {
            num2 = null;
        } else {
            num2 = Integer.valueOf(r4.fullSyncSizeMbLimit_);
        }
        this.A01 = num2;
        if (r4 == null || (r4.bitField0_ & 4) == 0) {
            num3 = null;
        } else {
            num3 = Integer.valueOf(r4.storageQuotaMb_);
        }
        this.A03 = num3;
        boolean z4 = false;
        if (r4 == null || (r4.bitField0_ & 8) == 0) {
            z = false;
        } else {
            z = r4.inlineInitialPayloadInE2EeMsg_;
        }
        this.A04 = z;
        if (!(r4 == null || (r4.bitField0_ & 16) == 0)) {
            num4 = Integer.valueOf(r4.recentSyncDaysLimit_);
        }
        this.A02 = num4;
        if (r4 == null || (r4.bitField0_ & 32) == 0) {
            z2 = false;
        } else {
            z2 = r4.supportCallLogHistory_;
        }
        this.A07 = z2;
        if (r4 == null || (r4.bitField0_ & 64) == 0) {
            z3 = false;
        } else {
            z3 = r4.supportBotUserAgentChatHistory_;
        }
        this.A05 = z3;
        if (!(r4 == null || (r4.bitField0_ & 128) == 0)) {
            z4 = r4.supportCagReactionsAndPolls_;
        }
        this.A06 = z4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("fullSyncDaysLimit: ");
        A0o.append(this.A00);
        A0o.append(", fullSyncSizeMbLimit: ");
        A0o.append(this.A01);
        A0o.append(", storageQuotaMb: ");
        A0o.append(this.A03);
        A0o.append(", inlineInitialHistSyncPayloadEnabled: ");
        A0o.append(this.A04);
        A0o.append(", recentSyncDaysLimit: ");
        A0o.append(this.A02);
        A0o.append(", supportCallLogHistory: ");
        A0o.append(this.A07);
        A0o.append(", supportBotUserAgentChatHistory: ");
        A0o.append(this.A05);
        A0o.append(", supportCagReactionsAndPolls: ");
        return C18300x5.A0m(A0o, this.A06);
    }

    public C59732xO(boolean z, boolean z2) {
        this.A05 = z;
        this.A06 = z2;
        this.A00 = null;
        this.A01 = null;
        this.A03 = null;
        this.A04 = false;
        this.A02 = null;
        this.A07 = false;
    }
}
