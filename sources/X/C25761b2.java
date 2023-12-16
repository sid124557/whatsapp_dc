package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1b2  reason: invalid class name and case insensitive filesystem */
public final class C25761b2 extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public String A0B;
    public String A0C;

    public C25761b2() {
        super(2292, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(14, this.A04);
        r3.Blb(12, this.A05);
        r3.Blb(6, this.A06);
        r3.Blb(11, this.A00);
        r3.Blb(13, this.A01);
        r3.Blb(5, this.A07);
        r3.Blb(4, this.A08);
        r3.Blb(2, this.A02);
        r3.Blb(8, this.A03);
        r3.Blb(9, this.A09);
        r3.Blb(10, this.A0B);
        r3.Blb(1, this.A0C);
        r3.Blb(3, this.A0A);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0F(C18270x1.A0D(C18270x1.A0M(C18270x1.A0L(C18270x1.A0K(C18270x1.A0E(C18270x1.A0G(C18270x1.A0H(C18270x1.A0P(C18270x1.A0N(C18270x1.A0I(C18270x1.A0O(C18320x8.A0W(), this.A04, A0r), this.A05, A0r), this.A06, A0r), this.A00, A0r), this.A01, A0r), this.A07, A0r), this.A08, A0r), this.A02, A0r), this.A03, A0r), this.A09, A0r), this.A0B, A0r), this.A0C, A0r), this.A0A);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamMdBootstrapHistoryDataUploaded {");
        C57292tP.A00(A0o, "historySyncChunkOrder", this.A04);
        C57292tP.A00(A0o, "historySyncStageProgress", this.A05);
        C57292tP.A00(A0o, "mdBootstrapChatsCount", this.A06);
        C57292tP.A00(A0o, "mdBootstrapHistoryPayloadType", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "mdBootstrapHistoryUploadStepResult", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "mdBootstrapMessagesCount", this.A07);
        C57292tP.A00(A0o, "mdBootstrapPayloadSize", this.A08);
        C57292tP.A00(A0o, "mdBootstrapPayloadType", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "mdBootstrapStepResult", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "mdHsOldestMessageTimestamp", this.A09);
        C57292tP.A00(A0o, "mdRegAttemptId", this.A0B);
        C57292tP.A00(A0o, "mdSessionId", this.A0C);
        return AnonymousClass3ZG.A0G(this.A0A, "mdTimestamp", A0o);
    }
}
