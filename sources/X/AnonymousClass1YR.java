package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1YR  reason: invalid class name */
public final class AnonymousClass1YR extends AnonymousClass3ZG {
    public Integer A00;
    public Long A01;
    public String A02;

    public AnonymousClass1YR() {
        super(3906, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A01);
        r3.Blb(2, this.A02);
        r3.Blb(3, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A01, A0r), this.A02, A0r), this.A00);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamNonMessagePeerDataRequest {");
        C57292tP.A00(A0o, "peerDataRequestCount", this.A01);
        C57292tP.A00(A0o, "peerDataRequestSessionId", this.A02);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A00), "peerDataRequestType", A0o);
    }
}
