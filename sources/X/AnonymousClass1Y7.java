package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Y7  reason: invalid class name */
public final class AnonymousClass1Y7 extends AnonymousClass3ZG {
    public Boolean A00;
    public Double A01;
    public Long A02;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A01);
        r3.Blb(2, this.A02);
        r3.Blb(3, this.A00);
    }

    public AnonymousClass1Y7() {
        super(3738, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A01, A0r), this.A02, A0r), this.A00);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamCallReplayerUpload {");
        C57292tP.A00(A0o, "compressionGain", this.A01);
        C57292tP.A00(A0o, "sizeAfterCompression", this.A02);
        return AnonymousClass3ZG.A0G(this.A00, "uploadSuccess", A0o);
    }
}
