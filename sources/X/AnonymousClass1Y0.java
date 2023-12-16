package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Y0  reason: invalid class name */
public final class AnonymousClass1Y0 extends AnonymousClass3ZG {
    public Integer A00;
    public String A01;
    public String A02;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A01);
        r3.Blb(2, this.A02);
        r3.Blb(3, this.A00);
    }

    public AnonymousClass1Y0() {
        super(3916, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A01, A0r), this.A02, A0r), this.A00);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAvatarHealth {");
        C57292tP.A00(A0o, "avatarHealthEventData", this.A01);
        C57292tP.A00(A0o, "avatarHealthEventReason", this.A02);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A00), "avatarHealthEventType", A0o);
    }
}
