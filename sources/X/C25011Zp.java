package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Zp  reason: invalid class name and case insensitive filesystem */
public final class C25011Zp extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;

    public C25011Zp() {
        super(3684, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A01);
        r3.Blb(3, this.A04);
        r3.Blb(7, this.A02);
        r3.Blb(8, this.A03);
        r3.Blb(9, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0M(C18270x1.A0N(C18270x1.A0L(C18270x1.A0K(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, A0r), this.A01, A0r), this.A04, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), this.A02, A0r), this.A03, A0r), this.A05, A0r), (Object) null, A0r), (Object) null);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamNotificationSetting {");
        C57292tP.A00(A0o, "groupReactionNotification", this.A00);
        C57292tP.A00(A0o, "groupShowNotification", this.A01);
        C57292tP.A00(A0o, "groupSoundTone", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "messageReactionNotification", this.A02);
        C57292tP.A00(A0o, "messageShowNotification", this.A03);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A05), "messageSoundTone", A0o);
    }
}
