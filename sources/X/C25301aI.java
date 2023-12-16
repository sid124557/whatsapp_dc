package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1aI  reason: invalid class name and case insensitive filesystem */
public final class C25301aI extends AnonymousClass3ZG {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public String A05;
    public String A06;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A00);
        r3.Blb(1, this.A03);
        r3.Blb(3, this.A04);
        r3.Blb(4, this.A05);
        r3.Blb(6, this.A01);
        r3.Blb(7, this.A02);
        r3.Blb(5, this.A06);
    }

    public C25301aI() {
        super(2330, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0H(C18270x1.A0J(C18270x1.A0I(C18270x1.A0G(C18270x1.A0F(C18270x1.A0D(C18280x3.A0S(), this.A00, A0r), this.A03, A0r), this.A04, A0r), this.A05, A0r), this.A01, A0r), this.A02, A0r), this.A06);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamSqlSlowQueryLog {");
        C57292tP.A00(A0o, "onMainThread", this.A00);
        C57292tP.A00(A0o, "queryDuration", this.A03);
        C57292tP.A00(A0o, "resultCount", this.A04);
        C57292tP.A00(A0o, "sqlQueryId", this.A05);
        C57292tP.A00(A0o, "sqlQueryType", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "startupStage", C18270x1.A0T(this.A02));
        return AnonymousClass3ZG.A0G(this.A06, "tableName", A0o);
    }
}
