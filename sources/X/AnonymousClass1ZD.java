package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ZD  reason: invalid class name */
public final class AnonymousClass1ZD extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Long A02;
    public Long A03;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A00);
        r3.Blb(1, this.A01);
        r3.Blb(4, this.A02);
        r3.Blb(3, this.A03);
    }

    public AnonymousClass1ZD() {
        super(2588, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0F(C18270x1.A0G(C18270x1.A0D(C18280x3.A0S(), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A03);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamThirdPartyPackImport {");
        C57292tP.A00(A0o, "animated", this.A00);
        C57292tP.A00(A0o, "importSuccess", this.A01);
        C57292tP.A00(A0o, "stickerCount", this.A02);
        return AnonymousClass3ZG.A0G(this.A03, "totalSizeIn10Kb", A0o);
    }
}
