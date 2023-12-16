package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1aM  reason: invalid class name and case insensitive filesystem */
public final class C25341aM extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Long A02;
    public Long A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    public C25341aM() {
        super(1368, new AnonymousClass5ZC(1, 1, 5, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(4, this.A04);
        r3.Blb(6, this.A00);
        r3.Blb(2, this.A01);
        r3.Blb(1, this.A05);
        r3.Blb(9, this.A06);
        r3.Blb(7, this.A02);
        r3.Blb(8, this.A07);
        r3.Blb(3, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        AnonymousClass3ZG.A0I(A0r, 5);
        A0r.put(C18270x1.A0F(C18270x1.A0K(C18270x1.A0J(C18270x1.A0L(C18270x1.A0D(C18270x1.A0E(C18270x1.A0I(C18290x4.A0b(), this.A04, A0r), this.A00, A0r), this.A01, A0r), this.A05, A0r), this.A06, A0r), this.A02, A0r), this.A07, A0r), this.A03);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAndroidEmojiDictionaryFetch {");
        C57292tP.A00(A0o, "currentLanguages", this.A04);
        C57292tP.A00(A0o, "doNetworkFetch", this.A00);
        C57292tP.A00(A0o, "isFirstAttempt", this.A01);
        C57292tP.A00(A0o, "requestedLanguages", this.A05);
        C57292tP.A00(A0o, "result", this.A06);
        C57292tP.A00(A0o, "resultHttpCode", this.A02);
        C57292tP.A00(A0o, "resultLanguages", this.A07);
        return AnonymousClass3ZG.A0G(this.A03, "timeSinceLastRequestMsT", A0o);
    }
}
