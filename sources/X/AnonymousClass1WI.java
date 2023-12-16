package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1WI  reason: invalid class name */
public final class AnonymousClass1WI extends AnonymousClass3ZG {
    public Integer A00;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
    }

    public AnonymousClass1WI() {
        super(1126, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(AnonymousClass001.A0f(), this.A00);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamGifSearchCancelled {");
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A00), "gifSearchProvider", A0o);
    }
}
