package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ZA  reason: invalid class name */
public final class AnonymousClass1ZA extends AnonymousClass3ZG {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(3, this.A00);
        r3.Blb(1, this.A01);
        r3.Blb(4, this.A02);
        r3.Blb(2, this.A03);
    }

    public AnonymousClass1ZA() {
        super(1676, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0E(C18270x1.A0G(C18270x1.A0D(C18290x4.A0a(), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A03);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamStatusDaily {");
        C57292tP.A00(A0o, "statusAvailableCountDaily", this.A00);
        C57292tP.A00(A0o, "statusAvailableRowsCountDaily", this.A01);
        C57292tP.A00(A0o, "statusViewedCountDaily", this.A02);
        return AnonymousClass3ZG.A0G(this.A03, "statusViewedRowsCountDaily", A0o);
    }
}
