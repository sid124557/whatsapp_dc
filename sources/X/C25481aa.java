package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1aa  reason: invalid class name and case insensitive filesystem */
public final class C25481aa extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public String A08;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A01);
        r3.Blb(9, this.A02);
        r3.Blb(10, this.A03);
        r3.Blb(3, this.A04);
        r3.Blb(4, this.A05);
        r3.Blb(5, this.A06);
        r3.Blb(6, this.A07);
        r3.Blb(7, this.A08);
    }

    public C25481aa() {
        super(4884, AnonymousClass3ZG.A04(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(AnonymousClass001.A0f(), this.A00);
        AnonymousClass3ZG.A0I(A0r, 8);
        A0r.put(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0M(C18270x1.A0L(C18280x3.A0S(), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A04, A0r), this.A05, A0r), this.A06, A0r), this.A07, A0r), this.A08);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamConsumerDisclosureEvents {");
        C57292tP.A00(A0o, "consumerDisclosureAction", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "consumerDisclosureEventType", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "consumerDisclosureResultType", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "consumerDisclosureServiceAccessType", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "consumerDisclosureSource", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "consumerDisclosureSuppressionReason", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "consumerDisclosureType", C18270x1.A0T(this.A06));
        C57292tP.A00(A0o, "consumerDisclosureVersion", this.A07);
        return AnonymousClass3ZG.A0G(this.A08, "threadIdHmac", A0o);
    }
}
