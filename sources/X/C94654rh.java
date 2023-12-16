package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4rh  reason: invalid class name and case insensitive filesystem */
public final class C94654rh extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public String A04;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A04);
        r3.Blb(2, this.A03);
        r3.Blb(3, this.A00);
        r3.Blb(4, this.A01);
        r3.Blb(5, this.A02);
    }

    public C94654rh() {
        super(4708, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A04, A0r), this.A03, A0r), this.A00, A0r), this.A01, A0r), this.A02);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamCallSheet {");
        C57292tP.A00(A0o, "callRandomId", this.A04);
        C57292tP.A00(A0o, "callSheetEntryPoint", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "callSheetIsComplete", this.A00);
        C57292tP.A00(A0o, "isLinkedGroupCall", this.A01);
        return AnonymousClass3ZG.A0G(this.A02, "isVideoCall", A0o);
    }
}
