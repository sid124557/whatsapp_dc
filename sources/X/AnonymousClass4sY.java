package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sY  reason: invalid class name */
public final class AnonymousClass4sY extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Long A08;
    public Long A09;
    public String A0A;
    public String A0B;

    public AnonymousClass4sY() {
        super(3008, AnonymousClass0x9.A0U(1, false), 2, 0);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(8, this.A02);
        r3.Blb(9, this.A03);
        r3.Blb(2, this.A0A);
        r3.Blb(6, this.A0B);
        r3.Blb(13, this.A00);
        r3.Blb(10, this.A01);
        r3.Blb(5, this.A04);
        r3.Blb(12, this.A05);
        r3.Blb(4, this.A08);
        r3.Blb(7, this.A09);
        r3.Blb(1, this.A06);
        r3.Blb(3, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0M(C18270x1.A0P(C18270x1.A0I(C18270x1.A0E(C18270x1.A0L(C18310x6.A0e(), this.A02, A0r), this.A03, A0r), this.A0A, A0r), this.A0B, A0r), this.A00, A0r), this.A01);
        AnonymousClass3ZG.A0I(A0r, 11);
        A0r.put(C18270x1.A0F(C18270x1.A0D(C18270x1.A0J(C18270x1.A0G(C18270x1.A0O(C18290x4.A0c(), this.A04, A0r), this.A05, A0r), this.A08, A0r), this.A09, A0r), this.A06, A0r), this.A07);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamBizProfileView {");
        C57292tP.A00(A0o, "bizFbSize", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "bizIgSize", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "businessProfileJid", this.A0A);
        C57292tP.A00(A0o, "catalogSessionId", this.A0B);
        C57292tP.A00(A0o, "hasCoverPhoto", this.A00);
        C57292tP.A00(A0o, "isProfileLinked", this.A01);
        C57292tP.A00(A0o, "linkedAccount", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "profileEntryPoint", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "scrollDepth", this.A08);
        C57292tP.A00(A0o, "sequenceNumber", this.A09);
        C57292tP.A00(A0o, "viewBusinessProfileAction", C18270x1.A0T(this.A06));
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A07), "websiteSource", A0o);
    }
}
