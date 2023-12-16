package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1YU  reason: invalid class name */
public final class AnonymousClass1YU extends AnonymousClass3ZG {
    public Integer A00;
    public Long A01;
    public Long A02;

    public AnonymousClass1YU() {
        super(3256, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A01);
        r3.Blb(3, this.A00);
        r3.Blb(4, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(AnonymousClass001.A0f(), this.A01);
        AnonymousClass3ZG.A0I(A0r, 2);
        A0r.put(C18290x4.A0a(), this.A00);
        AnonymousClass3ZG.A0I(A0r, 5);
        A0r.put(C18290x4.A0b(), this.A02);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamPrivacyNoticeBadging {");
        C57292tP.A00(A0o, "noticeBadgingId", this.A01);
        C57292tP.A00(A0o, "noticeBadgingStage", C18270x1.A0T(this.A00));
        return AnonymousClass3ZG.A0G(this.A02, "noticeBadgingVersion", A0o);
    }
}
