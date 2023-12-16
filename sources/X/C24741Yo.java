package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Yo  reason: invalid class name and case insensitive filesystem */
public final class C24741Yo extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;

    public C24741Yo() {
        super(3894, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A02);
        r3.Blb(2, this.A03);
        r3.Blb(3, this.A00);
        r3.Blb(4, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A02, A0r), this.A03, A0r), this.A00, A0r), this.A01);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAvatarStickerSend {");
        C57292tP.A00(A0o, "avatarStickerSendMessageType", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "avatarStickerSendOriginType", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "stickerIsAnimated", this.A00);
        return AnonymousClass3ZG.A0G(this.A01, "stickerIsCountry", A0o);
    }
}
