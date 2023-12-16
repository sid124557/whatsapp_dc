package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4ru  reason: invalid class name and case insensitive filesystem */
public final class C94784ru extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Long A03;
    public Long A04;

    public C94784ru() {
        super(3952, new AnonymousClass5ZC(1, 100, 5000, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(5, this.A00);
        r3.Blb(3, this.A01);
        r3.Blb(4, this.A03);
        r3.Blb(1, this.A04);
        r3.Blb(2, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0E(C18270x1.A0D(C18270x1.A0G(C18270x1.A0F(C18290x4.A0c(), this.A00, A0r), this.A01, A0r), this.A03, A0r), this.A04, A0r), this.A02);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamSearchLatency {");
        C57292tP.A00(A0o, "isCached", this.A00);
        C57292tP.A00(A0o, "isStarred", this.A01);
        C57292tP.A00(A0o, "page", this.A03);
        C57292tP.A00(A0o, "searchDuration", this.A04);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A02), "searchType", A0o);
    }
}
