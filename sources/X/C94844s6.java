package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4s6  reason: invalid class name and case insensitive filesystem */
public final class C94844s6 extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public Long A05;

    public C94844s6() {
        super(3698, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(7, this.A00);
        r3.Blb(2, this.A01);
        r3.Blb(3, this.A02);
        r3.Blb(4, this.A03);
        r3.Blb(5, this.A04);
        r3.Blb(6, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass0x7.A0g(), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A04, A0r), this.A05);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamKeepInChatErrors {");
        C57292tP.A00(A0o, "canEditDmSettings", this.A00);
        C57292tP.A00(A0o, "isAGroup", this.A01);
        C57292tP.A00(A0o, "isAdmin", this.A02);
        C57292tP.A00(A0o, "kicAction", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "kicErrorCode", C18270x1.A0T(this.A04));
        return AnonymousClass3ZG.A0G(this.A05, "kicMessageEphemeralityDuration", A0o);
    }
}
