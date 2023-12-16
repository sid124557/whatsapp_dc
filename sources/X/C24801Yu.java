package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Yu  reason: invalid class name and case insensitive filesystem */
public final class C24801Yu extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;

    public C24801Yu() {
        super(2312, AnonymousClass0x9.A0T(1, 10, 20), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(3, this.A00);
        r3.Blb(2, this.A01);
        r3.Blb(4, this.A03);
        r3.Blb(1, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0D(C18270x1.A0G(C18270x1.A0E(C18290x4.A0a(), this.A00, A0r), this.A01, A0r), this.A03, A0r), this.A02);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamChatAction {");
        C57292tP.A00(A0o, "chatActionChatType", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "chatActionEntryPoint", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "chatActionMuteDuration", this.A03);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A02), "chatActionType", A0o);
    }
}
