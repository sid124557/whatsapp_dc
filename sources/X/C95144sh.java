package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sh  reason: invalid class name and case insensitive filesystem */
public final class C95144sh extends AnonymousClass3ZG {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
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
    public String A0E;

    public C95144sh() {
        super(3796, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A03);
        r3.Blb(2, this.A01);
        r3.Blb(3, this.A02);
        r3.Blb(4, this.A00);
        r3.Blb(5, this.A0E);
        r3.Blb(16, this.A04);
        r3.Blb(17, this.A05);
        r3.Blb(6, this.A06);
        r3.Blb(7, this.A07);
        r3.Blb(8, this.A08);
        r3.Blb(10, this.A09);
        r3.Blb(11, this.A0A);
        r3.Blb(12, this.A0B);
        r3.Blb(14, this.A0C);
        r3.Blb(15, this.A0D);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A03, A0r), this.A01, A0r), this.A02, A0r), this.A00);
        AnonymousClass3ZG.A0I(A0r, 18);
        A0r.put(C18270x1.A0K(C18270x1.A0J(C18270x1.A0I(AnonymousClass0x2.A0P(AnonymousClass0x2.A0O(C18290x4.A0c(), this.A0E, A0r), this.A04, A0r), this.A05, A0r), this.A06, A0r), this.A07, A0r), this.A08);
        AnonymousClass3ZG.A0I(A0r, 9);
        A0r.put(C18270x1.A0O(C18270x1.A0N(AnonymousClass0x7.A0h(), this.A09, A0r), this.A0A, A0r), this.A0B);
        AnonymousClass3ZG.A0I(A0r, 13);
        A0r.put(AnonymousClass0x2.A0N(C18320x8.A0W(), this.A0C, A0r), this.A0D);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamNotificationEngagement {");
        C57292tP.A00(A0o, "avgNotifEngagementT", this.A03);
        C57292tP.A00(A0o, "groupSizeBucket", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "groupTypeClient", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "isAGroup", this.A00);
        C57292tP.A00(A0o, "threadId", this.A0E);
        C57292tP.A00(A0o, "totalMessageReminderNotifShown", this.A04);
        C57292tP.A00(A0o, "totalMessageReminderNotifTapToOpen", this.A05);
        C57292tP.A00(A0o, "totalNotifMarkAsRead", this.A06);
        C57292tP.A00(A0o, "totalNotifMissedCallVoipCallback", this.A07);
        C57292tP.A00(A0o, "totalNotifMissedCallVoipMessage", this.A08);
        C57292tP.A00(A0o, "totalNotifReply", this.A09);
        C57292tP.A00(A0o, "totalNotifRtcVoipAccept", this.A0A);
        C57292tP.A00(A0o, "totalNotifRtcVoipDecline", this.A0B);
        C57292tP.A00(A0o, "totalNotifShown", this.A0C);
        return AnonymousClass3ZG.A0G(this.A0D, "totalNotifTapToOpen", A0o);
    }
}
