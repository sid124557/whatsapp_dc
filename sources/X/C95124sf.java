package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sf  reason: invalid class name and case insensitive filesystem */
public final class C95124sf extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;

    public C95124sf() {
        super(4476, new AnonymousClass5ZC(1, 10, 10, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(9, this.A02);
        r3.Blb(10, this.A03);
        r3.Blb(11, this.A04);
        r3.Blb(12, this.A05);
        r3.Blb(1, this.A00);
        r3.Blb(13, this.A01);
        r3.Blb(14, this.A06);
        r3.Blb(2, this.A07);
        r3.Blb(3, this.A08);
        r3.Blb(15, this.A09);
        r3.Blb(4, this.A0A);
        r3.Blb(5, this.A0B);
        r3.Blb(7, this.A0C);
        r3.Blb(8, this.A0D);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0H(C18270x1.A0G(AnonymousClass0x2.A0N(C18270x1.A0F(C18270x1.A0E(C18270x1.A0Q(C18270x1.A0P(C18270x1.A0D(C18270x1.A0O(C18270x1.A0N(C18270x1.A0M(C18300x5.A0Y(), this.A02, A0r), this.A03, A0r), this.A04, A0r), this.A05, A0r), this.A00, A0r), this.A01, A0r), this.A06, A0r), this.A07, A0r), this.A08, A0r), this.A09, A0r), this.A0A, A0r), this.A0B);
        AnonymousClass3ZG.A0I(A0r, 6);
        A0r.put(C18270x1.A0K(AnonymousClass0x7.A0g(), this.A0C, A0r), this.A0D);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamUpdatesTabOpen {");
        C57292tP.A00(A0o, "channelFollowedCount", this.A02);
        C57292tP.A00(A0o, "channelMutedCount", this.A03);
        C57292tP.A00(A0o, "channelUnreadCount", this.A04);
        C57292tP.A00(A0o, "channelUnreadPostsCount", this.A05);
        C57292tP.A00(A0o, "horizontalView", this.A00);
        C57292tP.A00(A0o, "isUpdatesTab", this.A01);
        C57292tP.A00(A0o, "mutedRecentStatusItems", this.A06);
        C57292tP.A00(A0o, "mutedStatusItems", this.A07);
        C57292tP.A00(A0o, "mutedStatusRows", this.A08);
        C57292tP.A00(A0o, "mutedViewedStatusItems", this.A09);
        C57292tP.A00(A0o, "recentStatusItems", this.A0A);
        C57292tP.A00(A0o, "recentStatusRows", this.A0B);
        C57292tP.A00(A0o, "viewedStatusItems", this.A0C);
        return AnonymousClass3ZG.A0G(this.A0D, "viewedStatusRows", A0o);
    }
}
