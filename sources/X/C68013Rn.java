package X;

import android.net.Uri;
import java.util.Map;

/* renamed from: X.3Rn  reason: invalid class name and case insensitive filesystem */
public final class C68013Rn implements AnonymousClass4GB {
    public final C41172Jf A00;

    public C68013Rn(C41172Jf r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public boolean AwF(String str) {
        return AnonymousClass000.A1W(this.A00.A01.get(str));
    }

    public void BEs(String str, String str2) {
        C52792m3 r3 = (C52792m3) this.A00.A01.get(str);
        Uri parse = Uri.parse(str2);
        C162457s7.A0H(parse);
        Object A002 = AnonymousClass283.A00(parse);
        if (A002 == null) {
            A002 = C72043d5.A00();
        }
        if (r3 != null) {
            AnonymousClass3Z6[] r1 = new AnonymousClass3Z6[2];
            AnonymousClass3Z6.A09("deeplink", str2, r1, 0);
            AnonymousClass3Z6.A09("parameters", A002, r1, 1);
            r3.A02("on_success", C73813g7.A0F(r1));
        }
    }

    public void BEt(String str, Map map) {
        C52792m3 r2 = (C52792m3) this.A00.A01.get(str);
        if (r2 != null) {
            r2.A02("on_success", C57692u3.A04("parameters", map));
        }
    }
}
