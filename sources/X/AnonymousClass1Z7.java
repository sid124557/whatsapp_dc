package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Z7  reason: invalid class name */
public final class AnonymousClass1Z7 extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A02);
        r3.Blb(2, this.A00);
        r3.Blb(5, this.A03);
        r3.Blb(6, this.A01);
    }

    public AnonymousClass1Z7() {
        super(3300, AnonymousClass0x9.A0T(1, 200, 1000), 2, 56300709);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A02, A0r), this.A00, A0r), (Object) null, A0r), (Object) null, A0r), this.A03, A0r), this.A01);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamPsAppLaunch {");
        C57292tP.A00(A0o, "psAppLaunchCpuT", this.A02);
        C57292tP.A00(A0o, "psAppLaunchDestination", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "psAppLaunchT", this.A03);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A01), "psAppLaunchTypeT", A0o);
    }
}
