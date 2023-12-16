package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4rz  reason: invalid class name and case insensitive filesystem */
public final class C94834rz extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;

    public C94834rz() {
        super(4288, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A03);
        r3.Blb(2, this.A04);
        r3.Blb(3, this.A00);
        r3.Blb(4, this.A01);
        r3.Blb(5, this.A02);
        r3.Blb(6, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A03, A0r), this.A04, A0r), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A05);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamBlockEventsFs {");
        C57292tP.A00(A0o, "blockEntryPoint", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "blockEventActionType", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "blockEventIsSuspicious", this.A00);
        C57292tP.A00(A0o, "blockEventIsUnsub", this.A01);
        C57292tP.A00(A0o, "pastCall", this.A02);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A05), "pastCallResult", A0o);
    }
}
