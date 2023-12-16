package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Y4  reason: invalid class name */
public final class AnonymousClass1Y4 extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;

    public AnonymousClass1Y4() {
        super(4868, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(5, this.A00);
        r3.Blb(6, this.A01);
        r3.Blb(7, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        AnonymousClass3ZG.A0I(A0r, 1);
        A0r.put(C18270x1.A0J(C18270x1.A0I(C18290x4.A0c(), this.A00, A0r), this.A01, A0r), this.A02);
        AnonymousClass3ZG.A0I(A0r, 4);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamBotBizJourney {");
        C57292tP.A00(A0o, "botBizActionType", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "botBizEntryPoint", C18270x1.A0T(this.A01));
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A02), "botBizType", A0o);
    }
}
