package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1X6  reason: invalid class name */
public final class AnonymousClass1X6 extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A00);
        r3.Blb(1, this.A01);
    }

    public AnonymousClass1X6() {
        super(2948, AnonymousClass3ZG.A04(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0D(C18280x3.A0S(), this.A00, A0r), this.A01);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamChatComposerAction {");
        C57292tP.A00(A0o, "chatComposerActionTarget", C18270x1.A0T(this.A00));
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A01), "chatComposerActionType", A0o);
    }
}
