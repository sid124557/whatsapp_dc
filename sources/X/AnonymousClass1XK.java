package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1XK  reason: invalid class name */
public final class AnonymousClass1XK extends AnonymousClass3ZG {
    public Boolean A00;
    public Long A01;

    public AnonymousClass1XK() {
        super(3938, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, A0r), this.A01);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamFtsRestore {");
        C57292tP.A00(A0o, "restoreFtsSuccess", this.A00);
        return AnonymousClass3ZG.A0G(this.A01, "restoreFtsTimeSec", A0o);
    }
}
