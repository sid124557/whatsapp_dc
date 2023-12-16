package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ah  reason: invalid class name and case insensitive filesystem */
public final class C25551ah extends AnonymousClass3ZG {
    public Boolean A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;

    public C25551ah() {
        super(3680, AnonymousClass0x9.A0U(1, false), 2, 0);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A01);
        r3.Blb(9, this.A00);
        r3.Blb(2, this.A02);
        r3.Blb(3, this.A03);
        r3.Blb(4, this.A04);
        r3.Blb(5, this.A05);
        r3.Blb(6, this.A06);
        r3.Blb(7, this.A07);
        r3.Blb(8, this.A08);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(C18270x1.A0L(AnonymousClass001.A0f(), this.A01, A0r), this.A00, A0r), this.A02, A0r), this.A03, A0r), this.A04, A0r), this.A05, A0r), this.A06, A0r), this.A07);
        AnonymousClass3ZG.A0I(A0r, 10);
        A0r.put(C18310x6.A0e(), this.A08);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamPollsDailyStats {");
        C57292tP.A00(A0o, "groupSizeBucket", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "isAGroup", this.A00);
        C57292tP.A00(A0o, "optionsCount", this.A02);
        C57292tP.A00(A0o, "pollCreationDs", this.A03);
        C57292tP.A00(A0o, "pollId", this.A04);
        C57292tP.A00(A0o, "pollVoteDeletes", this.A05);
        C57292tP.A00(A0o, "pollVotes", this.A06);
        C57292tP.A00(A0o, "pollVotesChanged", this.A07);
        return AnonymousClass3ZG.A0G(this.A08, "usersParticipated", A0o);
    }
}
