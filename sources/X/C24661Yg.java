package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Yg  reason: invalid class name and case insensitive filesystem */
public final class C24661Yg extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public String A02;

    public C24661Yg() {
        super(1846, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A00);
        r3.Blb(4, this.A01);
        r3.Blb(3, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18280x3.A0S(), this.A00);
        AnonymousClass3ZG.A0I(A0r, 1);
        A0r.put(C18270x1.A0F(C18290x4.A0b(), this.A01, A0r), this.A02);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamStickerPackDelete {");
        C57292tP.A00(A0o, "stickerPackIsAvatar", this.A00);
        C57292tP.A00(A0o, "stickerPackIsLottie", this.A01);
        return AnonymousClass3ZG.A0G(this.A02, "waAvatarSessionId", A0o);
    }
}
