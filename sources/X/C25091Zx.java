package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Zx  reason: invalid class name and case insensitive filesystem */
public final class C25091Zx extends AnonymousClass3ZG {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public String A05;

    public C25091Zx() {
        super(2870, new AnonymousClass5ZC(1, 1, 20, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(3, this.A01);
        r3.Blb(2, this.A05);
        r3.Blb(1, this.A00);
        r3.Blb(4, this.A02);
        r3.Blb(6, this.A03);
        r3.Blb(5, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0H(C18270x1.A0I(C18270x1.A0G(C18270x1.A0D(C18270x1.A0E(C18290x4.A0a(), this.A01, A0r), this.A05, A0r), this.A00, A0r), this.A02, A0r), this.A03, A0r), this.A04);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamStickerOrphanFileCleanUp {");
        C57292tP.A00(A0o, "numberOfStickersDeleted", this.A01);
        C57292tP.A00(A0o, "orphanFileCleanUpFailureReason", this.A05);
        C57292tP.A00(A0o, "orphanFileCleanUpResult", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "spaceSavedInKb", this.A02);
        C57292tP.A00(A0o, "timeToDeleteMs", this.A03);
        return AnonymousClass3ZG.A0G(this.A04, "timeToQueryMs", A0o);
    }
}
