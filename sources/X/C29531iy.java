package X;

import java.util.Locale;
import java.util.Map;

/* renamed from: X.1iy  reason: invalid class name and case insensitive filesystem */
public final class C29531iy extends AnonymousClass1jX implements AnonymousClass4G9, C185488tl, AnonymousClass4GB, AnonymousClass4G8 {
    public String A00;
    public final C53522nE A01;
    public final C68003Rm A02;
    public final C60482yd A03;
    public final C53332mv A04;
    public final /* synthetic */ C68013Rn A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29531iy(AnonymousClass2E1 r2, AnonymousClass2VP r3, C68013Rn r4, C53522nE r5, C68003Rm r6, AnonymousClass1j2 r7, C60482yd r8, C53332mv r9) {
        super(r2, r3, r7);
        AnonymousClass0x2.A1A(r8, 1, r2);
        AnonymousClass0x2.A1B(r7, r3);
        this.A03 = r8;
        this.A04 = r9;
        this.A01 = r5;
        this.A02 = r6;
        this.A05 = r4;
    }

    public C08310eF B9o(String str, String str2, String str3, Map map, Map map2, int i) {
        C162457s7.A0J(str, 0);
        C18260x0.A0b(map, str3, map2, 2);
        return this.A02.B9o(str, str2, str3, map, map2, i);
    }

    public void BhG(C46772cB r8, String str, Map map, int i) {
        C162457s7.A0J(map, 0);
        C53332mv r1 = this.A04;
        Object obj = map.get("app_id");
        C162457s7.A0K(obj, "null cannot be cast to non-null type kotlin.String");
        r1.A02(r8, (String) obj, str, A00(map), i);
    }

    public static final Map A00(Map map) {
        Map map2;
        String upperCase = AnonymousClass0x2.A0d("fetch_channel", map).toUpperCase(Locale.ROOT);
        C162457s7.A0D(upperCase);
        int ordinal = AnonymousClass21U.valueOf(upperCase).ordinal();
        if (ordinal == 0) {
            Object obj = map.get("bloks_server_params");
            if (!(obj instanceof Map) || (map2 = (Map) obj) == null) {
                return C72043d5.A00();
            }
            return map2;
        } else if (ordinal == 1) {
            Object obj2 = map.get("fetch_channel_params");
            C162457s7.A0K(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            Object obj3 = ((Map) obj2).get("static_url");
            AnonymousClass3Z6[] r2 = new AnonymousClass3Z6[2];
            AnonymousClass3Z6.A09("should_load_bloks_through_cdn", Boolean.TRUE, r2, 0);
            AnonymousClass3Z6.A09("static_url", obj3, r2, 1);
            return C73813g7.A0F(r2);
        } else {
            throw C73153f1.A00();
        }
    }

    public boolean AwF(String str) {
        return this.A05.AwF(str);
    }

    public void Ay7(boolean z) {
        this.A02.Ay7(z);
    }

    public void B3J(Map map) {
        this.A01.A00(map);
    }

    public void BEs(String str, String str2) {
        this.A05.BEs(str, str2);
    }

    public void BEt(String str, Map map) {
        this.A05.BEt(str, map);
    }

    public void Bg0(String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, int i) {
        this.A02.Bg0(str, str2, str3, str4, str5, str6, map, map2, i);
    }

    public void BgH(C141576vn r14, String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, int i, int i2, boolean z) {
        this.A02.BgH(r14, str, str2, str3, str4, str5, str6, map, map2, i, i2, z);
    }
}
