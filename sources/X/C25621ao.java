package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ao  reason: invalid class name and case insensitive filesystem */
public final class C25621ao extends AnonymousClass3ZG {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public String A08;
    public String A09;

    public C25621ao() {
        super(2288, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(10, this.A05);
        r3.Blb(8, this.A06);
        r3.Blb(7, this.A01);
        r3.Blb(3, this.A02);
        r3.Blb(2, this.A03);
        r3.Blb(5, this.A04);
        r3.Blb(6, this.A08);
        r3.Blb(1, this.A09);
        r3.Blb(4, this.A07);
        r3.Blb(9, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0L(C18270x1.A0G(C18270x1.A0D(C18270x1.A0I(C18270x1.A0H(C18270x1.A0E(C18270x1.A0F(C18270x1.A0J(C18270x1.A0K(AnonymousClass0x7.A0h(), this.A05, A0r), this.A06, A0r), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A04, A0r), this.A08, A0r), this.A09, A0r), this.A07, A0r), this.A00);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamMdBootstrapDataGenerated {");
        C57292tP.A00(A0o, "historySyncChunkOrder", this.A05);
        C57292tP.A00(A0o, "historySyncStageProgress", this.A06);
        C57292tP.A00(A0o, "mdBootstrapHistoryPayloadType", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "mdBootstrapPayloadType", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "mdBootstrapSource", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "mdBootstrapStepResult", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "mdRegAttemptId", this.A08);
        C57292tP.A00(A0o, "mdSessionId", this.A09);
        C57292tP.A00(A0o, "mdTimestamp", this.A07);
        return AnonymousClass3ZG.A0G(this.A00, "sentViaMms", A0o);
    }
}
