package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Wx  reason: invalid class name and case insensitive filesystem */
public final class C24311Wx extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;

    public C24311Wx() {
        super(4538, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(3, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0F(AnonymousClass001.A0f(), this.A00, A0r), this.A01);
        AnonymousClass3ZG.A0I(A0r, 2);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAiStickerSend {");
        C57292tP.A00(A0o, "aiStickerSendMessageType", C18270x1.A0T(this.A00));
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A01), "aiStickerSendOriginType", A0o);
    }
}
