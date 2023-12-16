package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1YV  reason: invalid class name */
public final class AnonymousClass1YV extends AnonymousClass3ZG {
    public Boolean A00;
    public String A01;
    public String A02;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A01);
        r3.Blb(3, this.A02);
    }

    public AnonymousClass1YV() {
        super(4984, AnonymousClass3ZG.A04(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, A0r), this.A01, A0r), this.A02);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamPsIdHashHandshake {");
        C57292tP.A00(A0o, "isDummyHashReturned", this.A00);
        C57292tP.A00(A0o, "thirdPartyAppPackageName", this.A01);
        return AnonymousClass3ZG.A0G(this.A02, "thirdPartyAppSignatureHashes", A0o);
    }
}
