package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Z2  reason: invalid class name */
public final class AnonymousClass1Z2 extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public String A03;

    public AnonymousClass1Z2() {
        super(3180, new AnonymousClass5ZC(1, 1, 100, false), 2, 0);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(4, this.A01);
        r3.Blb(5, this.A03);
        r3.Blb(6, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, A0r), (Object) null, A0r), (Object) null, A0r), this.A01, A0r), this.A03, A0r), this.A02);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamMdAppStateSyncMutationStats {");
        C57292tP.A00(A0o, "applied", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "orphan", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "syncdAction", this.A03);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A02), "unsupported", A0o);
    }
}
