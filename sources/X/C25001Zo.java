package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Zo  reason: invalid class name and case insensitive filesystem */
public final class C25001Zo extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Double A04;
    public Integer A05;

    public C25001Zo() {
        super(1734, new AnonymousClass5ZC(1, 1, 5, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(3, this.A04);
        r3.Blb(1, this.A05);
        r3.Blb(6, this.A00);
        r3.Blb(5, this.A01);
        r3.Blb(2, this.A02);
        r3.Blb(9, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        AnonymousClass3ZG.A0I(A0r, 4);
        A0r.put(C18270x1.A0E(C18270x1.A0H(C18270x1.A0I(C18270x1.A0D(C18290x4.A0a(), this.A04, A0r), this.A05, A0r), this.A00, A0r), this.A01, A0r), this.A02);
        AnonymousClass3ZG.A0I(A0r, 7);
        A0r.put(C18300x5.A0Y(), this.A03);
        AnonymousClass3ZG.A0I(A0r, 8);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamMessageMediaDownload {");
        C57292tP.A00(A0o, "mediaSize", this.A04);
        C57292tP.A00(A0o, "messageMediaType", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "stickerIsAi", this.A00);
        C57292tP.A00(A0o, "stickerIsAvatar", this.A01);
        C57292tP.A00(A0o, "stickerIsFirstParty", this.A02);
        return AnonymousClass3ZG.A0G(this.A03, "stickerIsLottie", A0o);
    }
}
