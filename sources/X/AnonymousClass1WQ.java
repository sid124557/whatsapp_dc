package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1WQ  reason: invalid class name */
public final class AnonymousClass1WQ extends AnonymousClass3ZG {
    public Boolean A00;

    public AnonymousClass1WQ() {
        super(2520, AnonymousClass0x9.A0T(1, 20, 1000), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18280x3.A0S(), this.A00);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamMdAppStateDirtyBits {");
        return AnonymousClass3ZG.A0G(this.A00, "dirtyBitsFalsePositive", A0o);
    }
}
