package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1a3  reason: invalid class name and case insensitive filesystem */
public final class C25151a3 extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public String A06;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A01);
        r3.Blb(3, this.A06);
        r3.Blb(4, this.A02);
        r3.Blb(5, this.A03);
        r3.Blb(6, this.A04);
        r3.Blb(7, this.A05);
    }

    public C25151a3() {
        super(3450, AnonymousClass3ZG.A04(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, A0r), this.A01, A0r), this.A06, A0r), this.A02, A0r), this.A03, A0r), this.A04, A0r), this.A05);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamBusinessInteraction {");
        C57292tP.A00(A0o, "businessInteractionAction", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "businessInteractionTargetScreen", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "businessJid", this.A06);
        C57292tP.A00(A0o, "entryPointApp", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "entryPointSource", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "internalEntryPoint", C18270x1.A0T(this.A04));
        return AnonymousClass3ZG.A0G(this.A05, "sequenceNumber", A0o);
    }
}
