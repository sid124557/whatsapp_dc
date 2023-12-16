package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ZB  reason: invalid class name */
public final class AnonymousClass1ZB extends AnonymousClass3ZG {
    public Integer A00;
    public Long A01;
    public Long A02;
    public String A03;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A01);
        r3.Blb(3, this.A03);
        r3.Blb(4, this.A02);
        r3.Blb(1, this.A00);
    }

    public AnonymousClass1ZB() {
        super(2740, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0D(C18270x1.A0G(C18270x1.A0F(C18280x3.A0S(), this.A01, A0r), this.A03, A0r), this.A02, A0r), this.A00);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamStickerCommonQueryToStaticServer {");
        C57292tP.A00(A0o, "httpResponseCode", this.A01);
        C57292tP.A00(A0o, "params", this.A03);
        C57292tP.A00(A0o, "queryLatencyMs", this.A02);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A00), "queryType", A0o);
    }
}
