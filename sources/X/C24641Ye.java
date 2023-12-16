package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Ye  reason: invalid class name and case insensitive filesystem */
public final class C24641Ye extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;

    public C24641Ye() {
        super(1842, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A02);
        r3.Blb(5, this.A00);
        r3.Blb(4, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0H(AnonymousClass001.A0f(), this.A02, A0r), this.A00);
        AnonymousClass3ZG.A0I(A0r, 3);
        A0r.put(C18270x1.A0J(C18270x1.A0I(C18270x1.A0E(C18290x4.A0b(), this.A01, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamStickerAddToFavorite {");
        C57292tP.A00(A0o, "stickerAddToFavoriteOrigin", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "stickerIsAi", this.A00);
        return AnonymousClass3ZG.A0G(this.A01, "stickerIsAvatar", A0o);
    }
}
