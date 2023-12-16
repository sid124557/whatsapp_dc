package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Zt  reason: invalid class name and case insensitive filesystem */
public final class C25051Zt extends AnonymousClass3ZG {
    public Boolean A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public String A04;
    public String A05;

    public C25051Zt() {
        super(2166, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(6, this.A01);
        r3.Blb(7, this.A00);
        r3.Blb(3, this.A04);
        r3.Blb(1, this.A05);
        r3.Blb(4, this.A02);
        r3.Blb(5, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0J(C18290x4.A0d(), this.A01, A0r), this.A00);
        AnonymousClass3ZG.A0I(A0r, 2);
        A0r.put(C18270x1.A0H(C18270x1.A0G(C18270x1.A0D(C18290x4.A0a(), this.A04, A0r), this.A05, A0r), this.A02, A0r), this.A03);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamPushNotificationReceived {");
        C57292tP.A00(A0o, "deliveredPriority", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "payloadDecryptSuccess", this.A00);
        C57292tP.A00(A0o, "pushNotificationEventId", this.A04);
        C57292tP.A00(A0o, "pushNotificationId", this.A05);
        C57292tP.A00(A0o, "pushReceivedT", this.A02);
        return AnonymousClass3ZG.A0G(this.A03, "pushSentT", A0o);
    }
}
