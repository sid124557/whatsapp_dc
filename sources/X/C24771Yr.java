package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Yr  reason: invalid class name and case insensitive filesystem */
public final class C24771Yr extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;

    public C24771Yr() {
        super(2582, AnonymousClass0x9.A0T(1, 1000, 2000), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A02);
        r3.Blb(2, this.A03);
        r3.Blb(4, this.A00);
        r3.Blb(3, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0F(C18270x1.A0G(C18270x1.A0E(AnonymousClass001.A0f(), this.A02, A0r), this.A03, A0r), this.A00, A0r), this.A01);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamCallStanzaReceive {");
        C57292tP.A00(A0o, "callStanzaDuration", this.A02);
        C57292tP.A00(A0o, "callStanzaOfflineCount", this.A03);
        C57292tP.A00(A0o, "callStanzaStage", C18270x1.A0T(this.A00));
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A01), "callStanzaType", A0o);
    }
}
