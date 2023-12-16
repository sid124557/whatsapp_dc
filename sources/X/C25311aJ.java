package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1aJ  reason: invalid class name and case insensitive filesystem */
public final class C25311aJ extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public String A05;
    public String A06;

    public C25311aJ() {
        super(1844, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(6, this.A05);
        r3.Blb(5, this.A00);
        r3.Blb(1, this.A04);
        r3.Blb(3, this.A01);
        r3.Blb(2, this.A02);
        r3.Blb(7, this.A03);
        r3.Blb(4, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0G(C18270x1.A0J(C18270x1.A0E(C18270x1.A0F(C18270x1.A0D(C18270x1.A0H(C18290x4.A0d(), this.A05, A0r), this.A00, A0r), this.A04, A0r), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A06);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamStickerPackDownload {");
        C57292tP.A00(A0o, "stickerPackDownloadErrorReason", this.A05);
        C57292tP.A00(A0o, "stickerPackDownloadFailed", this.A00);
        C57292tP.A00(A0o, "stickerPackDownloadOrigin", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "stickerPackIsAvatar", this.A01);
        C57292tP.A00(A0o, "stickerPackIsFirstParty", this.A02);
        C57292tP.A00(A0o, "stickerPackIsLottie", this.A03);
        return AnonymousClass3ZG.A0G(this.A06, "waAvatarSessionId", A0o);
    }
}
