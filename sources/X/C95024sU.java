package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sU  reason: invalid class name and case insensitive filesystem */
public final class C95024sU extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public String A09;
    public String A0A;

    public C95024sU() {
        super(3002, AnonymousClass0x9.A0U(1, false), 2, 113760892);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(3, this.A04);
        r3.Blb(2, this.A05);
        r3.Blb(11, this.A06);
        r3.Blb(5, this.A07);
        r3.Blb(6, this.A08);
        r3.Blb(4, this.A00);
        r3.Blb(8, this.A09);
        r3.Blb(9, this.A01);
        r3.Blb(10, this.A02);
        r3.Blb(7, this.A03);
        r3.Blb(1, this.A0A);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0D(C18270x1.A0J(C18270x1.A0M(C18270x1.A0L(C18270x1.A0K(C18270x1.A0G(C18270x1.A0I(C18270x1.A0H(C18270x1.A0N(C18270x1.A0E(C18290x4.A0a(), this.A04, A0r), this.A05, A0r), this.A06, A0r), this.A07, A0r), this.A08, A0r), this.A00, A0r), this.A09, A0r), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A0A);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamMessageTemplateBlocks {");
        C57292tP.A00(A0o, "blockEntryPoint", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "blockReason", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "blockReasonIndex", this.A06);
        C57292tP.A00(A0o, "businessMessageTime", this.A07);
        C57292tP.A00(A0o, "businessPhoneNumber", this.A08);
        C57292tP.A00(A0o, "didUserReply", this.A00);
        C57292tP.A00(A0o, "eventTimeSec", this.A09);
        C57292tP.A00(A0o, "isForcePublished", this.A01);
        C57292tP.A00(A0o, "isRandomized", this.A02);
        C57292tP.A00(A0o, "isUnsubBlock", this.A03);
        return AnonymousClass3ZG.A0G(this.A0A, "templateId", A0o);
    }
}
