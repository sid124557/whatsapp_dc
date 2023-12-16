package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Yi  reason: invalid class name and case insensitive filesystem */
public final class C24681Yi extends AnonymousClass3ZG {
    public Boolean A00;
    public Long A01;
    public String A02;

    public C24681Yi() {
        super(2126, AnonymousClass0x9.A0T(1, 20, 200), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A02);
        r3.Blb(2, this.A01);
        r3.Blb(3, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A02, A0r), this.A01, A0r), this.A00);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamSuperpackDecompressionSuccess {");
        C57292tP.A00(A0o, "assetName", this.A02);
        C57292tP.A00(A0o, "decompressionT", this.A01);
        return AnonymousClass3ZG.A0G(this.A00, "isMainThread", A0o);
    }
}
