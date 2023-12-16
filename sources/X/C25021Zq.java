package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Zq  reason: invalid class name and case insensitive filesystem */
public final class C25021Zq extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public String A04;
    public String A05;

    public C25021Zq() {
        super(2638, new AnonymousClass5ZC(1, 20, 20, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(7, this.A00);
        r3.Blb(4, this.A01);
        r3.Blb(6, this.A04);
        r3.Blb(2, this.A03);
        r3.Blb(5, this.A05);
        r3.Blb(1, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(AnonymousClass0x7.A0g(), this.A00);
        AnonymousClass3ZG.A0I(A0r, 3);
        A0r.put(C18270x1.A0D(C18270x1.A0H(C18270x1.A0E(C18270x1.A0I(C18290x4.A0b(), this.A01, A0r), this.A04, A0r), this.A03, A0r), this.A05, A0r), this.A02);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamOfflineCountTooHigh {");
        C57292tP.A00(A0o, "callStanzaType", C18270x1.A0T(this.A00));
        AnonymousClass3ZG.A0H(C18270x1.A0T(this.A01), A0o);
        C57292tP.A00(A0o, "notificationStanzaType", this.A04);
        C57292tP.A00(A0o, "offlineCount", this.A03);
        C57292tP.A00(A0o, "receiptStanzaType", this.A05);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A02), "stanzaType", A0o);
    }
}
