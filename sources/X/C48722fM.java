package X;

import java.util.Map;

/* renamed from: X.2fM  reason: invalid class name and case insensitive filesystem */
public final class C48722fM {
    public final C60482yd A00;
    public final String A01;

    public C48722fM(C60482yd r2, String str) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
        this.A01 = str;
    }

    public final void A00(AnonymousClass21K r11, C60752z6 r12, String str, String str2, String str3, Map map) {
        C162457s7.A0J(r11, 0);
        C18260x0.A0Q(str, str2);
        this.A00.A02(this.A01).A01(new C69393Wv(r11, r12, str, (String) C73723fy.A03(AnonymousClass2AB.A01(str2, ":")), C57412tb.A00(str2), str3, map));
    }

    public final void A01(C60752z6 r6, String str, String str2, Map map) {
        Map map2;
        C162457s7.A0J(str2, 1);
        C54522or A02 = this.A00.A02(this.A01);
        if (map != null) {
            map2 = C160967ok.A01((Integer) map.get(C373621y.ERROR_CODE.key), C18310x6.A0o(C373621y.ERROR_NAME.key, map), C18310x6.A0o(C373621y.ERROR_MESSAGE.key, map), AnonymousClass0x9.A1B(C373621y.ERROR_PARAMS.key, map));
        } else if (r6 != null) {
            map2 = C160967ok.A01(r6.A00, r6.A02, r6.A01, (Map) null);
        } else {
            map2 = null;
        }
        A02.A01(new C198009eE(str, str2, map2));
    }
}
