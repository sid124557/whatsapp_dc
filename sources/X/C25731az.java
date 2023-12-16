package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1az  reason: invalid class name and case insensitive filesystem */
public final class C25731az extends AnonymousClass3ZG {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Long A0A;
    public Long A0B;

    public C25731az() {
        super(3724, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(12, this.A01);
        r3.Blb(14, this.A02);
        r3.Blb(2, this.A03);
        r3.Blb(9, this.A04);
        r3.Blb(3, this.A05);
        r3.Blb(4, this.A06);
        r3.Blb(5, this.A07);
        r3.Blb(6, this.A00);
        r3.Blb(11, this.A0A);
        r3.Blb(7, this.A0B);
        r3.Blb(8, this.A08);
        r3.Blb(10, this.A09);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0Q(12, this.A01, A0r), this.A02);
        AnonymousClass3ZG.A0I(A0r, 1);
        A0r.put(C18270x1.A0F(C18270x1.A0L(C18280x3.A0S(), this.A03, A0r), this.A04, A0r), this.A05);
        AnonymousClass3ZG.A0I(A0r, 13);
        A0r.put(C18270x1.A0M(C18270x1.A0K(C18270x1.A0J(C18270x1.A0N(C18270x1.A0I(C18270x1.A0H(C18290x4.A0b(), this.A06, A0r), this.A07, A0r), this.A00, A0r), this.A0A, A0r), this.A0B, A0r), this.A08, A0r), this.A09);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamIncomingMessageDrop {");
        C57292tP.A00(A0o, "agentEngagementType", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "botType", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "e2eDestination", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "e2eFailureReason", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "e2eSenderType", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "messageDropReason", C18270x1.A0T(this.A06));
        C57292tP.A00(A0o, "messageMediaType", C18270x1.A0T(this.A07));
        C57292tP.A00(A0o, "offline", this.A00);
        C57292tP.A00(A0o, "offlineCount", this.A0A);
        C57292tP.A00(A0o, "retryCount", this.A0B);
        C57292tP.A00(A0o, "revokeType", C18270x1.A0T(this.A08));
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A09), "typeOfGroup", A0o);
    }
}
