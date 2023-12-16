package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4rS  reason: invalid class name and case insensitive filesystem */
public final class C94504rS extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public String A02;

    public C94504rS() {
        super(2606, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A02);
        r3.Blb(1, this.A00);
        r3.Blb(3, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18280x3.A0S(), this.A02);
        AnonymousClass3ZG.A0I(A0r, 6);
        A0r.put(AnonymousClass001.A0f(), this.A00);
        AnonymousClass3ZG.A0I(A0r, 5);
        A0r.put(C18290x4.A0a(), this.A01);
        AnonymousClass3ZG.A0I(A0r, 4);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamWaShopsStorefront {");
        C57292tP.A00(A0o, "shopsSellerJid", this.A02);
        C57292tP.A00(A0o, "storefrontAction", C18270x1.A0T(this.A00));
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A01), "waShopsEntryPointSpecifier", A0o);
    }
}
