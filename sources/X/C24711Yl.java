package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Yl  reason: invalid class name and case insensitive filesystem */
public final class C24711Yl extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A01);
        r3.Blb(3, this.A02);
    }

    public C24711Yl() {
        super(3804, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        AnonymousClass3ZG.A0I(A0r, 4);
        A0r.put(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, A0r), this.A01, A0r), this.A02);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamUrlSend {");
        C57292tP.A00(A0o, "inlineVideoType", C18270x1.A0T(this.A00));
        AnonymousClass3ZG.A0H(C18270x1.A0T(this.A01), A0o);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A02), "urlPreviewState", A0o);
    }
}
