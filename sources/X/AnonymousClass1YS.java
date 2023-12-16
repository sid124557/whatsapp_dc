package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1YS  reason: invalid class name */
public final class AnonymousClass1YS extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;

    public AnonymousClass1YS() {
        super(3014, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(3, this.A00);
        r3.Blb(2, this.A01);
        r3.Blb(1, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0D(C18270x1.A0E(C18290x4.A0a(), this.A00, A0r), this.A01, A0r), this.A02);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamPrekeysDepletion {");
        C57292tP.A00(A0o, "deviceSizeBucket", C18270x1.A0T(this.A00));
        AnonymousClass3ZG.A0H(C18270x1.A0T(this.A01), A0o);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A02), "prekeysFetchReason", A0o);
    }
}
