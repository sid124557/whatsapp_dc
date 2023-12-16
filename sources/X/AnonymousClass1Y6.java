package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Y6  reason: invalid class name */
public final class AnonymousClass1Y6 extends AnonymousClass3ZG {
    public Boolean A00;
    public Integer A01;
    public Integer A02;

    public AnonymousClass1Y6() {
        super(3426, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A01);
        r3.Blb(2, this.A02);
        r3.Blb(4, this.A00);
    }

    public static AnonymousClass1Y6 A00(C51342jf r2) {
        AnonymousClass1Y6 r1 = new AnonymousClass1Y6();
        r1.A01 = Integer.valueOf(r2.A00);
        return r1;
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0G(C18270x1.A0E(AnonymousClass001.A0f(), this.A01, A0r), this.A02, A0r), this.A00);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamCadminDemote {");
        C57292tP.A00(A0o, "cadminDemoteOrigin", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "cadminDemoteResult", C18270x1.A0T(this.A02));
        return AnonymousClass3ZG.A0G(this.A00, "isLastCadminOrCreator", A0o);
    }
}
