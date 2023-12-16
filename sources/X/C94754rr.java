package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4rr  reason: invalid class name and case insensitive filesystem */
public final class C94754rr extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;

    public C94754rr() {
        super(3522, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A02);
        r3.Blb(2, this.A03);
        r3.Blb(3, this.A04);
        r3.Blb(4, this.A00);
        r3.Blb(5, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A02, A0r), this.A03, A0r), this.A04, A0r), this.A00, A0r), this.A01);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamPrivacyHighlightDaily {");
        C57292tP.A00(A0o, "dialogAppearCount", this.A02);
        C57292tP.A00(A0o, "dialogSelectCount", this.A03);
        C57292tP.A00(A0o, "narrativeAppearCount", this.A04);
        C57292tP.A00(A0o, "privacyHighlightCategory", C18270x1.A0T(this.A00));
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A01), "privacyHighlightSurface", A0o);
    }
}
