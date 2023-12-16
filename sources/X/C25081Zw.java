package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Zw  reason: invalid class name and case insensitive filesystem */
public final class C25081Zw extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public String A05;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A02);
        r3.Blb(2, this.A03);
        r3.Blb(3, this.A00);
        r3.Blb(4, this.A04);
        r3.Blb(5, this.A01);
        r3.Blb(6, this.A05);
    }

    public C25081Zw() {
        super(4508, AnonymousClass3ZG.A04(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A02, A0r), this.A03, A0r), this.A00, A0r), this.A04, A0r), this.A01, A0r), this.A05);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamSmbPaidMessagesButtonLogger {");
        C57292tP.A00(A0o, "businessPhoneNumber", this.A02);
        C57292tP.A00(A0o, "pmButtonCount", this.A03);
        C57292tP.A00(A0o, "pmButtonEventType", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "pmButtonIndex", this.A04);
        C57292tP.A00(A0o, "pmButtonType", C18270x1.A0T(this.A01));
        return AnonymousClass3ZG.A0G(this.A05, "pmServerCampaignId", A0o);
    }
}
