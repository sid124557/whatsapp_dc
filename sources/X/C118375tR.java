package X;

import java.util.HashMap;

/* renamed from: X.5tR  reason: invalid class name and case insensitive filesystem */
public class C118375tR extends HashMap<String, Object> {
    public final /* synthetic */ C126006Ki this$0;
    public final /* synthetic */ String val$surface;

    public C118375tR(C126006Ki r3, String str) {
        this.this$0 = r3;
        this.val$surface = str;
        put("surface", str);
        put("bytes_downloaded", C86664Kz.A1I(r3.A01));
        put("cache_hit_count", C86664Kz.A1I(r3.A00));
        put("cache_miss_count", C86664Kz.A1I(r3.A01));
    }
}
