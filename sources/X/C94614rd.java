package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4rd  reason: invalid class name and case insensitive filesystem */
public final class C94614rd extends AnonymousClass3ZG {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;

    public C94614rd() {
        super(3060, new AnonymousClass5ZC(1, 20, 20, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(5, this.A01);
        r3.Blb(3, this.A02);
        r3.Blb(4, this.A03);
        r3.Blb(2, this.A00);
        r3.Blb(1, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0D(C18270x1.A0E(C18270x1.A0G(C18270x1.A0F(C18290x4.A0c(), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A00, A0r), this.A04);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAndroidBgJobUsage {");
        C57292tP.A00(A0o, "numMessageObserverCalls", this.A01);
        C57292tP.A00(A0o, "numTotalJobs", this.A02);
        C57292tP.A00(A0o, "numWaworkerJobs", this.A03);
        C57292tP.A00(A0o, "sessionCategory", C18270x1.A0T(this.A00));
        return AnonymousClass3ZG.A0G(this.A04, "sessionDuration", A0o);
    }
}
