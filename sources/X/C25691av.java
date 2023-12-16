package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1av  reason: invalid class name and case insensitive filesystem */
public final class C25691av extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public String A0A;

    public C25691av() {
        super(2298, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(5, this.A02);
        r3.Blb(14, this.A06);
        r3.Blb(11, this.A07);
        r3.Blb(10, this.A03);
        r3.Blb(3, this.A04);
        r3.Blb(2, this.A05);
        r3.Blb(6, this.A08);
        r3.Blb(1, this.A0A);
        r3.Blb(4, this.A09);
        r3.Blb(13, this.A00);
        r3.Blb(7, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0N(C18270x1.A0Q(C18290x4.A0c(), this.A02, A0r), this.A06, A0r), this.A07);
        AnonymousClass3ZG.A0I(A0r, 8);
        A0r.put(C18270x1.A0J(C18270x1.A0P(C18270x1.A0G(C18270x1.A0D(C18270x1.A0L(C18270x1.A0O(C18270x1.A0I(C18270x1.A0E(C18270x1.A0F(AnonymousClass0x7.A0h(), this.A03, A0r), this.A04, A0r), this.A05, A0r), this.A08, A0r), (Object) null, A0r), (Object) null, A0r), this.A0A, A0r), this.A09, A0r), this.A00, A0r), this.A01);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamMdBootstrapDataApplied {");
        C57292tP.A00(A0o, "collection", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "historySyncChunkOrder", this.A06);
        C57292tP.A00(A0o, "historySyncStageProgress", this.A07);
        C57292tP.A00(A0o, "mdBootstrapHistoryPayloadType", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "mdBootstrapPayloadType", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "mdBootstrapSource", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "mdBootstrapStepDuration", this.A08);
        C57292tP.A00(A0o, "mdSessionId", this.A0A);
        C57292tP.A00(A0o, "mdTimestamp", this.A09);
        C57292tP.A00(A0o, "sentViaMms", this.A00);
        return AnonymousClass3ZG.A0G(this.A01, "usedSnapshot", A0o);
    }
}
