package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1aD  reason: invalid class name and case insensitive filesystem */
public final class C25251aD extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;

    public C25251aD() {
        super(3676, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(8, this.A02);
        r3.Blb(1, this.A03);
        r3.Blb(6, this.A00);
        r3.Blb(2, this.A01);
        r3.Blb(3, this.A04);
        r3.Blb(4, this.A05);
        r3.Blb(5, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(C18270x1.A0I(C18270x1.A0D(C18310x6.A0e(), this.A02, A0r), this.A03, A0r), this.A00, A0r), this.A01, A0r), this.A04, A0r), this.A05, A0r), this.A06);
        AnonymousClass3ZG.A0I(A0r, 7);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamPollsActions {");
        C57292tP.A00(A0o, "chatType", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "groupSizeBucket", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "isAGroup", this.A00);
        C57292tP.A00(A0o, "isAdmin", this.A01);
        C57292tP.A00(A0o, "pollAction", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "pollCreationDs", this.A05);
        return AnonymousClass3ZG.A0G(this.A06, "pollOptionsCount", A0o);
    }
}
