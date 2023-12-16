package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1XY  reason: invalid class name */
public final class AnonymousClass1XY extends AnonymousClass3ZG {
    public Boolean A00;
    public Long A01;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A01);
    }

    public AnonymousClass1XY() {
        super(4422, AnonymousClass3ZG.A04(), 2, 248614979);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, A0r), this.A01);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamPsProxyMediaHealthCheck {");
        C57292tP.A00(A0o, "isHealthy", this.A00);
        return AnonymousClass3ZG.A0G(this.A01, "responseStatusCode", A0o);
    }
}
