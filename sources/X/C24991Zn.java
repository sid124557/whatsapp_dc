package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Zn  reason: invalid class name and case insensitive filesystem */
public final class C24991Zn extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;

    public C24991Zn() {
        super(4146, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A02);
        r3.Blb(2, this.A00);
        r3.Blb(3, this.A01);
        r3.Blb(4, this.A04);
        r3.Blb(5, this.A05);
        r3.Blb(6, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A02, A0r), this.A00, A0r), this.A01, A0r), this.A04, A0r), this.A05, A0r), this.A03);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamMdGroupParticipantMissAck {");
        C57292tP.A00(A0o, "groupSizeBucket", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "isLid", this.A00);
        C57292tP.A00(A0o, "messageIsRevoke", this.A01);
        C57292tP.A00(A0o, "participantAddCount", this.A04);
        C57292tP.A00(A0o, "participantRemoveCount", this.A05);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A03), "typeOfGroup", A0o);
    }
}
