package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1XA  reason: invalid class name */
public final class AnonymousClass1XA extends AnonymousClass3ZG {
    public Integer A00;
    public String A01;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(21, this.A01);
    }

    public AnonymousClass1XA() {
        super(470, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        AnonymousClass3ZG.A0I(A0r, 3);
        A0r.put(AnonymousClass3ZG.A07(C18270x1.A0N(AnonymousClass3ZG.A05(C18270x1.A0I(C18270x1.A0H(C18270x1.A0O(C18270x1.A0G(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), this.A01);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamContactUsSession {");
        C57292tP.A00(A0o, "contactUsExitState", C18270x1.A0T(this.A00));
        return AnonymousClass3ZG.A0G(this.A01, "languageCode", A0o);
    }
}
