package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sQ  reason: invalid class name and case insensitive filesystem */
public final class C94994sQ extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public String A07;
    public String A08;
    public String A09;

    public C94994sQ() {
        super(3568, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A07);
        r3.Blb(2, this.A02);
        r3.Blb(3, this.A00);
        r3.Blb(12, this.A08);
        r3.Blb(6, this.A03);
        r3.Blb(7, this.A04);
        r3.Blb(8, this.A05);
        r3.Blb(9, this.A06);
        r3.Blb(13, this.A09);
        r3.Blb(11, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0N(C18270x1.A0P(C18270x1.A0L(C18270x1.A0K(C18270x1.A0J(C18270x1.A0I(C18270x1.A0O(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A07, A0r), this.A02, A0r), this.A00, A0r), this.A08, A0r), this.A03, A0r), this.A04, A0r), this.A05, A0r), this.A06, A0r), this.A09, A0r), this.A01);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamStatusCrossPost {");
        C57292tP.A00(A0o, "cacSessionId", this.A07);
        C57292tP.A00(A0o, "defaultStatusPrivacySettings", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "isAutoCrossPosted", this.A00);
        C57292tP.A00(A0o, "statusCrossPostErrorName", this.A08);
        C57292tP.A00(A0o, "statusCrossPostMediaType", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "statusCrossPostOrigin", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "statusCrossPostPerPostStatusPrivacySetting", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "statusCrossPostResult", C18270x1.A0T(this.A06));
        C57292tP.A00(A0o, "statusId", this.A09);
        return AnonymousClass3ZG.A0G(this.A01, "undoClicked", A0o);
    }
}
