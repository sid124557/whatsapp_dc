package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ax  reason: invalid class name and case insensitive filesystem */
public final class C25711ax extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public String A08;
    public String A09;
    public String A0A;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A01);
        r3.Blb(3, this.A02);
        r3.Blb(11, this.A06);
        r3.Blb(4, this.A03);
        r3.Blb(8, this.A04);
        r3.Blb(5, this.A05);
        r3.Blb(10, this.A07);
        r3.Blb(6, this.A08);
        r3.Blb(9, this.A09);
        r3.Blb(7, this.A0A);
    }

    public C25711ax() {
        super(4740, AnonymousClass3ZG.A04(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0J(C18270x1.A0L(C18270x1.A0I(C18270x1.A0M(C18270x1.A0H(C18270x1.A0K(C18270x1.A0G(C18270x1.A0N(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A06, A0r), this.A03, A0r), this.A04, A0r), this.A05, A0r), this.A07, A0r), this.A08, A0r), this.A09, A0r), this.A0A);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamPaidMessagingUserInteractionsLogger {");
        C57292tP.A00(A0o, "pmxActionTarget", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "pmxActionType", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "pmxComponentType", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "pmxHashedMessageKey", this.A06);
        C57292tP.A00(A0o, "pmxHeaderMediaType", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "pmxHostStorage", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "pmxMarketingFormat", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "pmxMessageDeliveredTs", this.A07);
        C57292tP.A00(A0o, "pmxQueryParams", this.A08);
        C57292tP.A00(A0o, "pmxSenderCountryCode", this.A09);
        return AnonymousClass3ZG.A0G(this.A0A, "templateId", A0o);
    }
}
