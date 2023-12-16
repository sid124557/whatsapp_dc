package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4rK  reason: invalid class name */
public final class AnonymousClass4rK extends AnonymousClass3ZG {
    public Boolean A00;
    public Integer A01;
    public Integer A02;

    public AnonymousClass4rK() {
        super(4958, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A01);
        r3.Blb(2, this.A00);
        r3.Blb(3, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A01, A0r), this.A00, A0r), this.A02);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamChatLockSecretCode {");
        C57292tP.A00(A0o, "secretCodeAction", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "secretCodeActive", this.A00);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A02), "secretCodeFlowType", A0o);
    }
}
