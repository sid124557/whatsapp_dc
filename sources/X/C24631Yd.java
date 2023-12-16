package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Yd  reason: invalid class name and case insensitive filesystem */
public final class C24631Yd extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public String A02;

    public C24631Yd() {
        super(3560, AnonymousClass0x9.A0U(1, false), 2, 0);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A02);
        r3.Blb(3, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, A0r), this.A02, A0r), this.A01);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamStatusReplyReceived {");
        C57292tP.A00(A0o, "statusMediaType", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "statusPosterJid", this.A02);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A01), "statusReplyMessageType", A0o);
    }
}
