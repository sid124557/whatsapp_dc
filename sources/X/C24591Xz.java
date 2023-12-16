package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Xz  reason: invalid class name and case insensitive filesystem */
public final class C24591Xz extends AnonymousClass3ZG {
    public Long A00;
    public String A01;
    public String A02;

    public static void A00(C24591Xz r1, long j, long j2) {
        r1.A00 = Long.valueOf(j - j2);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(3, this.A01);
        r3.Blb(2, this.A02);
    }

    public C24591Xz() {
        super(2052, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0E(C18270x1.A0F(AnonymousClass001.A0f(), this.A00, A0r), this.A01, A0r), this.A02);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAndroidPerfTimer {");
        C57292tP.A00(A0o, "androidPerfDuration", this.A00);
        C57292tP.A00(A0o, "androidPerfExtraData", this.A01);
        return AnonymousClass3ZG.A0G(this.A02, "androidPerfName", A0o);
    }
}
