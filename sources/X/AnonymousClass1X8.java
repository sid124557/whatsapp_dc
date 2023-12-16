package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1X8  reason: invalid class name */
public final class AnonymousClass1X8 extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A01);
    }

    public AnonymousClass1X8() {
        super(4432, AnonymousClass3ZG.A04(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, A0r), this.A01);
        AnonymousClass3ZG.A0I(A0r, 3);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamClickToWhatsappCallingPrivate {");
        C57292tP.A00(A0o, "clickToWhatsappCallingActionPrivate", C18270x1.A0T(this.A00));
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A01), "clickToWhatsappCallingButtonPrivate", A0o);
    }
}
