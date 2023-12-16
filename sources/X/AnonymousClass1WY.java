package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1WY  reason: invalid class name */
public final class AnonymousClass1WY extends AnonymousClass3ZG {
    public Long A00;

    public AnonymousClass1WY() {
        super(2524, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(AnonymousClass001.A0f(), this.A00);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamMdWifiSpeedbump {");
        return AnonymousClass3ZG.A0G(this.A00, "estimatedSizeOfCompressedPayloadKb", A0o);
    }
}
