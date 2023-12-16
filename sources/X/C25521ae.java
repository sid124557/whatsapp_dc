package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ae  reason: invalid class name and case insensitive filesystem */
public final class C25521ae extends AnonymousClass3ZG {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;

    public C25521ae() {
        super(2300, AnonymousClass0x9.A0T(1, 20, 1000), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(11, this.A00);
        r3.Blb(4, this.A01);
        r3.Blb(12, this.A02);
        r3.Blb(9, this.A03);
        r3.Blb(1, this.A04);
        r3.Blb(7, this.A05);
        r3.Blb(8, this.A06);
        r3.Blb(5, this.A07);
        r3.Blb(10, this.A08);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0M(C18270x1.A0H(C18270x1.A0K(C18270x1.A0J(C18270x1.A0D(C18270x1.A0L(C18270x1.A0O(C18270x1.A0G(C18300x5.A0Z(), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A04, A0r), this.A05, A0r), this.A06, A0r), this.A07, A0r), this.A08);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamMdAppStateSyncDaily {");
        C57292tP.A00(A0o, "crossIndexConflictCount", this.A00);
        C57292tP.A00(A0o, "invalidActionCount", this.A01);
        C57292tP.A00(A0o, "keyRotationRemoveCount", this.A02);
        C57292tP.A00(A0o, "missingKeyCount", this.A03);
        C57292tP.A00(A0o, "mutationCount", this.A04);
        C57292tP.A00(A0o, "storedMutationCount", this.A05);
        C57292tP.A00(A0o, "unsetActionCount", this.A06);
        C57292tP.A00(A0o, "unsupportedActionCount", this.A07);
        return AnonymousClass3ZG.A0G(this.A08, "uploadConflictCount", A0o);
    }
}
