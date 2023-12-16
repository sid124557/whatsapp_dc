package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Zc  reason: invalid class name and case insensitive filesystem */
public final class C24881Zc extends AnonymousClass3ZG {
    public Boolean A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public String A04;

    public C24881Zc() {
        super(3944, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A04);
        r3.Blb(2, this.A01);
        r3.Blb(5, this.A02);
        r3.Blb(3, this.A00);
        r3.Blb(4, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0G(C18270x1.A0F(C18270x1.A0H(C18270x1.A0E(AnonymousClass001.A0f(), this.A04, A0r), this.A01, A0r), this.A02, A0r), this.A00, A0r), this.A03);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamWaFsGroupJoinRequestAction {");
        C57292tP.A00(A0o, "groupJid", this.A04);
        C57292tP.A00(A0o, "groupJoinRequestAction", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "groupJoinRequestGroupsInCommon", this.A02);
        C57292tP.A00(A0o, "isSuccessful", this.A00);
        return AnonymousClass3ZG.A0G(this.A03, "serverResponseTime", A0o);
    }
}
