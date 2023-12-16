package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Xx  reason: invalid class name and case insensitive filesystem */
public final class C24571Xx extends AnonymousClass3ZG {
    public Integer A00;
    public Long A01;
    public Long A02;

    public C24571Xx() {
        super(2598, new AnonymousClass5ZC(1, 20, 20, false), 0, -1);
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
        A0o.append("WamAndroidKeystoreAuthkeySuccess {");
        C57292tP.A00(A0o, "androidKeystoreState", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "numFailures", this.A01);
        return AnonymousClass3ZG.A0G(this.A02, "numSuccessfulReads", A0o);
    }
}
