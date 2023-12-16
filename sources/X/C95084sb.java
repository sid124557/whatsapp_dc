package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sb  reason: invalid class name and case insensitive filesystem */
public final class C95084sb extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;

    public C95084sb() {
        super(3126, new AnonymousClass5ZC(1, 1, 20, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A00);
        r3.Blb(3, this.A01);
        r3.Blb(4, this.A02);
        r3.Blb(6, this.A03);
        r3.Blb(7, this.A04);
        r3.Blb(8, this.A05);
        r3.Blb(1, this.A06);
        r3.Blb(12, this.A07);
        r3.Blb(15, this.A08);
        r3.Blb(17, this.A09);
        r3.Blb(18, this.A0A);
        r3.Blb(20, this.A0B);
        r3.Blb(21, this.A0C);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0G(C18270x1.A0F(C18280x3.A0S(), this.A00, A0r), this.A01, A0r), this.A02);
        AnonymousClass3ZG.A0I(A0r, 5);
        A0r.put(C18270x1.A0K(C18270x1.A0J(C18290x4.A0d(), this.A03, A0r), this.A04, A0r), this.A05);
        AnonymousClass3ZG.A0I(A0r, 9);
        A0r.put(C18270x1.A0P(C18270x1.A0O(C18270x1.A0N(C18270x1.A0M(AnonymousClass001.A0f(), this.A06, A0r), (Object) null, A0r), (Object) null, A0r), this.A07, A0r), (Object) null);
        AnonymousClass0x2.A1H((Object) null, A0r, 14);
        A0r.put(AnonymousClass0x9.A0j(), this.A08);
        AnonymousClass3ZG.A0I(A0r, 16);
        A0r.put(AnonymousClass0x2.A0Q(17, this.A09, A0r), this.A0A);
        AnonymousClass3ZG.A0I(A0r, 19);
        A0r.put(C86634Kw.A0u(20, this.A0B, A0r), this.A0C);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamGroupInfo {");
        C57292tP.A00(A0o, "exitGroup", this.A00);
        C57292tP.A00(A0o, "groupAddParticipants", this.A01);
        C57292tP.A00(A0o, "groupAudioCall", this.A02);
        C57292tP.A00(A0o, "groupDescription", this.A03);
        C57292tP.A00(A0o, "groupDisappearingMessages", this.A04);
        C57292tP.A00(A0o, "groupEncryption", this.A05);
        C57292tP.A00(A0o, "groupInfoVisit", this.A06);
        C57292tP.A00(A0o, "groupMuteClick", this.A07);
        C57292tP.A00(A0o, "groupSearch", this.A08);
        C57292tP.A00(A0o, "groupStarredMessages", this.A09);
        C57292tP.A00(A0o, "groupVideoCall", this.A0A);
        C57292tP.A00(A0o, "inviteToGroupViaLink", this.A0B);
        return AnonymousClass3ZG.A0G(this.A0C, "reportGroup", A0o);
    }
}
