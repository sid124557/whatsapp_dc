package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1WB  reason: invalid class name */
public final class AnonymousClass1WB extends AnonymousClass3ZG {
    public Integer A00;

    public AnonymousClass1WB() {
        super(3678, AnonymousClass0x9.A0U(1, false), 2, 0);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(3, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        AnonymousClass3ZG.A0I(A0r, 2);
        A0r.put(C18290x4.A0a(), this.A00);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamCtwaReliabilityUnderstand {");
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A00), "reliabilityActionEnum", A0o);
    }
}
