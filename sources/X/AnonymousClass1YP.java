package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1YP  reason: invalid class name */
public final class AnonymousClass1YP extends AnonymousClass3ZG {
    public Boolean A00;
    public Integer A01;
    public Integer A02;

    public AnonymousClass1YP() {
        super(2304, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A01);
        r3.Blb(16, this.A00);
        r3.Blb(1, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(AnonymousClass3ZG.A09(AnonymousClass0x2.A0O(C18270x1.A0F(C18270x1.A0O(C18270x1.A0N(C18270x1.A0Q(C18280x3.A0S(), this.A01, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), this.A00, A0r), (Object) null);
        AnonymousClass0x2.A1H((Object) null, A0r, 24);
        AnonymousClass0x2.A1H((Object) null, A0r, 25);
        AnonymousClass0x2.A1H((Object) null, A0r, 17);
        AnonymousClass0x2.A1H((Object) null, A0r, 18);
        AnonymousClass0x2.A1H((Object) null, A0r, 19);
        AnonymousClass0x2.A1H((Object) null, A0r, 26);
        AnonymousClass0x2.A1H((Object) null, A0r, 36);
        AnonymousClass0x2.A1H((Object) null, A0r, 20);
        AnonymousClass0x2.A1H((Object) null, A0r, 37);
        AnonymousClass0x2.A1H((Object) null, A0r, 21);
        AnonymousClass0x2.A1H((Object) null, A0r, 27);
        AnonymousClass0x2.A1H((Object) null, A0r, 28);
        AnonymousClass0x2.A1H((Object) null, A0r, 29);
        AnonymousClass0x2.A1H((Object) null, A0r, 30);
        AnonymousClass0x2.A1H((Object) null, A0r, 31);
        AnonymousClass0x2.A1H((Object) null, A0r, 32);
        AnonymousClass0x2.A1H((Object) null, A0r, 33);
        AnonymousClass0x2.A1H((Object) null, A0r, 22);
        AnonymousClass0x2.A1H((Object) null, A0r, 34);
        A0r.put(C18270x1.A0K(C18270x1.A0J(C18270x1.A0I(C18270x1.A0M(AnonymousClass0x2.A0N(C18270x1.A0H(C18270x1.A0L(C18270x1.A0D(C18270x1.A0P(35, (Object) null, A0r), (Object) null, A0r), this.A02, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamMdFatalError {");
        C57292tP.A00(A0o, "collection", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "isFatal", this.A00);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A02), "mdFatalErrorCode", A0o);
    }
}
