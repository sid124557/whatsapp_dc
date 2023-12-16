package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sB  reason: invalid class name and case insensitive filesystem */
public final class C94854sB extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;

    public C94854sB() {
        super(3398, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A02);
        r3.Blb(2, this.A00);
        r3.Blb(3, this.A01);
        r3.Blb(4, this.A03);
        r3.Blb(5, this.A04);
        r3.Blb(7, this.A05);
        r3.Blb(8, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A02, A0r), this.A00, A0r), this.A01, A0r), this.A03, A0r), this.A04);
        AnonymousClass3ZG.A0I(A0r, 9);
        A0r.put(C18270x1.A0K(AnonymousClass0x7.A0g(), this.A05, A0r), this.A06);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamDisappearingMessageChatPicker {");
        C57292tP.A00(A0o, "chatsSelected", this.A02);
        C57292tP.A00(A0o, "dmChatPickerEntryPoint", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "dmChatPickerEventName", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "ephemeralityDuration", this.A03);
        C57292tP.A00(A0o, "groupChatsSelected", this.A04);
        C57292tP.A00(A0o, "newlyEphemeralChats", this.A05);
        return AnonymousClass3ZG.A0G(this.A06, "totalChatsInChatPicker", A0o);
    }
}
