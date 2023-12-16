package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1b7  reason: invalid class name and case insensitive filesystem */
public final class C25811b7 extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Long A0D;
    public Long A0E;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(15, this.A03);
        r3.Blb(19, this.A04);
        r3.Blb(5, this.A05);
        r3.Blb(6, this.A0D);
        r3.Blb(4, this.A06);
        r3.Blb(2, this.A07);
        r3.Blb(8, this.A08);
        r3.Blb(1, this.A00);
        r3.Blb(13, this.A09);
        r3.Blb(11, this.A01);
        r3.Blb(7, this.A0A);
        r3.Blb(9, this.A02);
        r3.Blb(3, this.A0E);
        r3.Blb(10, this.A0B);
        r3.Blb(12, this.A0C);
    }

    public C25811b7() {
        super(478, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0P(C18270x1.A0D(C18270x1.A0K(C18270x1.A0E(C18270x1.A0G(C18270x1.A0I(C18270x1.A0H(AnonymousClass3ZG.A05(AnonymousClass0x9.A0j(), this.A03, A0r), this.A04, A0r), this.A05, A0r), this.A0D, A0r), this.A06, A0r), this.A07, A0r), this.A08, A0r), this.A00, A0r), this.A09);
        AnonymousClass3ZG.A0I(A0r, 20);
        A0r.put(C18270x1.A0O(C18270x1.A0Q(AnonymousClass0x2.A0Q(C18270x1.A0M(C18270x1.A0F(C18270x1.A0L(C18270x1.A0J(AnonymousClass0x2.A0P(AnonymousClass0x2.A0O(C18300x5.A0Z(), this.A01, A0r), (Object) null, A0r), (Object) null, A0r), this.A0A, A0r), this.A02, A0r), this.A0E, A0r), this.A0B, A0r), (Object) null, A0r), (Object) null, A0r), this.A0C);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamE2eMessageRecv {");
        C57292tP.A00(A0o, "agentEngagementType", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "botType", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "e2eCiphertextType", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "e2eCiphertextVersion", this.A0D);
        C57292tP.A00(A0o, "e2eDestination", C18270x1.A0T(this.A06));
        C57292tP.A00(A0o, "e2eFailureReason", C18270x1.A0T(this.A07));
        C57292tP.A00(A0o, "e2eSenderType", C18270x1.A0T(this.A08));
        C57292tP.A00(A0o, "e2eSuccessful", this.A00);
        C57292tP.A00(A0o, "editType", C18270x1.A0T(this.A09));
        C57292tP.A00(A0o, "isLid", this.A01);
        C57292tP.A00(A0o, "messageMediaType", C18270x1.A0T(this.A0A));
        C57292tP.A00(A0o, "offline", this.A02);
        C57292tP.A00(A0o, "retryCount", this.A0E);
        C57292tP.A00(A0o, "revokeType", C18270x1.A0T(this.A0B));
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A0C), "typeOfGroup", A0o);
    }
}
