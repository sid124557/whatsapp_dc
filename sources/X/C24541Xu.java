package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Xu  reason: invalid class name and case insensitive filesystem */
public final class C24541Xu extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public String A02;

    public C24541Xu() {
        super(4130, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(4, this.A02);
        r3.Blb(3, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0F(C18270x1.A0G(AnonymousClass001.A0f(), this.A00, A0r), this.A02, A0r), this.A01);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAltLinkingFatalError {");
        C57292tP.A00(A0o, "altLinkingFatalErrorType", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "linkCodePairingRef", this.A02);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A01), "mdCompanionPlatformType", A0o);
    }
}
