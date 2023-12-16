package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4rR  reason: invalid class name and case insensitive filesystem */
public final class C94494rR extends AnonymousClass3ZG {
    public Double A00;
    public String A01;
    public String A02;

    public C94494rR() {
        super(2128, new AnonymousClass5ZC(1, 1, 20, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A01);
        r3.Blb(2, this.A02);
        r3.Blb(3, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A01, A0r), this.A02, A0r), this.A00);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamSuperpackDecompressionFailure {");
        C57292tP.A00(A0o, "assetName", this.A01);
        C57292tP.A00(A0o, "exceptionMessage", this.A02);
        return AnonymousClass3ZG.A0G(this.A00, "freeSpaceAvailable", A0o);
    }
}
