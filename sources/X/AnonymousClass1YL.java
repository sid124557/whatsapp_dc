package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1YL  reason: invalid class name */
public final class AnonymousClass1YL extends AnonymousClass3ZG {
    public Integer A00;
    public String A01;
    public String A02;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(3, this.A01);
        r3.Blb(2, this.A02);
    }

    public AnonymousClass1YL() {
        super(1128, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0E(C18270x1.A0F(AnonymousClass001.A0f(), this.A00, A0r), this.A01, A0r), this.A02);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamGifSearchNoResults {");
        C57292tP.A00(A0o, "gifSearchProvider", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "inputLanguageCode", this.A01);
        return AnonymousClass3ZG.A0G(this.A02, "languageCode", A0o);
    }
}
