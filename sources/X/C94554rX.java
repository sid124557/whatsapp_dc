package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4rX  reason: invalid class name and case insensitive filesystem */
public final class C94554rX extends AnonymousClass3ZG {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A01);
        r3.Blb(2, this.A00);
        r3.Blb(3, this.A02);
        r3.Blb(4, this.A03);
    }

    public C94554rX() {
        super(4138, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A01, A0r), this.A00, A0r), this.A02, A0r), this.A03);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamMessageCtaImpression {");
        C57292tP.A00(A0o, "ctaName", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "isSenderSelf", this.A00);
        C57292tP.A00(A0o, "messageTypeCategory", C18270x1.A0T(this.A02));
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A03), "threadType", A0o);
    }
}
