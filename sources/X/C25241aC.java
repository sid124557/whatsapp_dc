package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1aC  reason: invalid class name and case insensitive filesystem */
public final class C25241aC extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public String A05;
    public String A06;

    public C25241aC() {
        super(3748, new AnonymousClass5ZC(1, 20, 20, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A00);
        r3.Blb(3, this.A04);
        r3.Blb(4, this.A01);
        r3.Blb(5, this.A05);
        r3.Blb(6, this.A02);
        r3.Blb(7, this.A06);
        r3.Blb(8, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        AnonymousClass3ZG.A0I(A0r, 1);
        A0r.put(C18270x1.A0K(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18280x3.A0S(), this.A00, A0r), this.A04, A0r), this.A01, A0r), this.A05, A0r), this.A02, A0r), this.A06, A0r), this.A03);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamNotificationDelivery {");
        C57292tP.A00(A0o, "notificationAction", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "notificationDeliveryT", this.A04);
        C57292tP.A00(A0o, "notificationDestination", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "notificationId", this.A05);
        C57292tP.A00(A0o, "notificationSource", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "threadId", this.A06);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A03), "uiNotificationType", A0o);
    }
}
