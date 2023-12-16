package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ZX  reason: invalid class name */
public final class AnonymousClass1ZX extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;

    public AnonymousClass1ZX() {
        super(3132, new AnonymousClass5ZC(1, 20, 20, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(5, this.A00);
        r3.Blb(3, this.A01);
        r3.Blb(1, this.A02);
        r3.Blb(4, this.A03);
        r3.Blb(2, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0E(C18270x1.A0G(C18270x1.A0D(C18270x1.A0F(C18290x4.A0c(), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A04);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamMessageHighRetryCount {");
        C57292tP.A00(A0o, "deviceSizeBucket", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "e2eSenderType", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "mediaType", C18270x1.A0T(this.A02));
        AnonymousClass3ZG.A0H(C18270x1.A0T(this.A03), A0o);
        return AnonymousClass3ZG.A0G(this.A04, "retryCount", A0o);
    }
}
