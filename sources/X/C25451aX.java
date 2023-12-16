package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1aX  reason: invalid class name and case insensitive filesystem */
public final class C25451aX extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Integer A06;
    public Integer A07;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(7, this.A00);
        r3.Blb(3, this.A01);
        r3.Blb(6, this.A02);
        r3.Blb(2, this.A03);
        r3.Blb(5, this.A04);
        r3.Blb(9, this.A05);
        r3.Blb(4, this.A06);
        r3.Blb(1, this.A07);
    }

    public C25451aX() {
        super(1840, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0L(C18270x1.A0H(C18270x1.A0E(C18270x1.A0I(C18270x1.A0F(AnonymousClass0x7.A0g(), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A04, A0r), this.A05);
        AnonymousClass3ZG.A0I(A0r, 8);
        A0r.put(C18270x1.A0D(C18290x4.A0b(), this.A06, A0r), this.A07);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamStickerSend {");
        C57292tP.A00(A0o, "stickerIsAi", this.A00);
        C57292tP.A00(A0o, "stickerIsAnimated", this.A01);
        C57292tP.A00(A0o, "stickerIsAvatar", this.A02);
        C57292tP.A00(A0o, "stickerIsFirstParty", this.A03);
        C57292tP.A00(A0o, "stickerIsFromStickerMaker", this.A04);
        C57292tP.A00(A0o, "stickerIsLottie", this.A05);
        C57292tP.A00(A0o, "stickerSendMessageType", C18270x1.A0T(this.A06));
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A07), "stickerSendOrigin", A0o);
    }
}
