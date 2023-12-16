package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1a5  reason: invalid class name and case insensitive filesystem */
public final class C25171a5 extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;

    public C25171a5() {
        super(2280, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(3, this.A00);
        r3.Blb(5, this.A01);
        r3.Blb(4, this.A02);
        r3.Blb(1, this.A05);
        r3.Blb(6, this.A03);
        r3.Blb(2, this.A06);
        r3.Blb(7, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0J(C18270x1.A0E(C18270x1.A0I(C18270x1.A0D(C18270x1.A0G(C18270x1.A0H(C18290x4.A0a(), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A05, A0r), this.A03, A0r), this.A06, A0r), this.A04);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamChatMute {");
        C57292tP.A00(A0o, "actionConducted", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "chatMuteNotificationChoice", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "muteChatType", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "muteDuration", this.A05);
        C57292tP.A00(A0o, "muteEntryPoint", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "muteGroupSize", this.A06);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A04), "waOfficialAccountName", A0o);
    }
}
