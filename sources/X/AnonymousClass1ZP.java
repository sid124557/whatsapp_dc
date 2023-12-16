package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ZP  reason: invalid class name */
public final class AnonymousClass1ZP extends AnonymousClass3ZG {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public String A04;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(3, this.A01);
        r3.Blb(1, this.A02);
        r3.Blb(5, this.A00);
        r3.Blb(4, this.A03);
        r3.Blb(2, this.A04);
    }

    public AnonymousClass1ZP() {
        super(3764, AnonymousClass3ZG.A04(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0E(C18270x1.A0G(C18270x1.A0H(C18270x1.A0D(C18290x4.A0a(), this.A01, A0r), this.A02, A0r), this.A00, A0r), this.A03, A0r), this.A04);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamBusinessTemplateMessageNotificationStats {");
        C57292tP.A00(A0o, "businessMessageSentTs", this.A01);
        C57292tP.A00(A0o, "businessPhoneNumber", this.A02);
        C57292tP.A00(A0o, "contactType", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "messageDeliveredTs", this.A03);
        return AnonymousClass3ZG.A0G(this.A04, "templateId", A0o);
    }
}
