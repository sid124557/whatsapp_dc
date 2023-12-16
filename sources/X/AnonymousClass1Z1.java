package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Z1  reason: invalid class name */
public final class AnonymousClass1Z1 extends AnonymousClass3ZG {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;

    public AnonymousClass1Z1() {
        super(3484, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(3, this.A00);
        r3.Blb(4, this.A01);
        r3.Blb(5, this.A02);
        r3.Blb(6, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18290x4.A0a(), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A03);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamKeepInChatNotif {");
        C57292tP.A00(A0o, "kicGroupNotificationTaps", this.A00);
        C57292tP.A00(A0o, "kicGroupNotifications", this.A01);
        C57292tP.A00(A0o, "kicNotificationTaps", this.A02);
        return AnonymousClass3ZG.A0G(this.A03, "kicNotifications", A0o);
    }
}
