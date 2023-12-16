package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1YF  reason: invalid class name */
public final class AnonymousClass1YF extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Long A02;

    public AnonymousClass1YF() {
        super(4406, AnonymousClass0x9.A0U(1, false), 2, 0);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(3, this.A02);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A01);
    }

    public static void A00(AnonymousClass4FV r2, AnonymousClass1YF r3, int i) {
        r3.A00 = Integer.valueOf(i);
        r3.A02 = 1L;
        r2.BhD(r3);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0E(C18270x1.A0D(C18290x4.A0a(), this.A02, A0r), this.A00, A0r), this.A01);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamCtwaConsumerDisclosure {");
        C57292tP.A00(A0o, "ctwaConsumerDisclosureVersion", this.A02);
        C57292tP.A00(A0o, "disclosureAction", C18270x1.A0T(this.A00));
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A01), "disclosureType", A0o);
    }
}
