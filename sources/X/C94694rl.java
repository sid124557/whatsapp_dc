package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4rl  reason: invalid class name and case insensitive filesystem */
public final class C94694rl extends AnonymousClass3ZG {
    public Boolean A00;
    public Long A01;
    public String A02;
    public String A03;
    public String A04;

    public C94694rl() {
        super(3912, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A02);
        r3.Blb(6, this.A03);
        r3.Blb(3, this.A04);
        r3.Blb(4, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0G(C18270x1.A0F(C18270x1.A0I(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, A0r), this.A02, A0r), this.A03, A0r), this.A04, A0r), this.A01);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamDragAndDropStatus {");
        C57292tP.A00(A0o, "dragAndDropSuccess", this.A00);
        C57292tP.A00(A0o, "dragFailureReason", this.A02);
        C57292tP.A00(A0o, "dragMediaTypes", this.A03);
        C57292tP.A00(A0o, "dragSessionId", this.A04);
        return AnonymousClass3ZG.A0G(this.A01, "mediaCount", A0o);
    }
}
