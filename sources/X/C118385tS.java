package X;

import java.util.HashMap;

/* renamed from: X.5tS  reason: invalid class name and case insensitive filesystem */
public class C118385tS extends HashMap<String, Object> {
    public final /* synthetic */ AnonymousClass4PH this$0;
    public final /* synthetic */ long val$currentTime;
    public final /* synthetic */ String val$surface;

    public C118385tS(AnonymousClass4PH r3, String str, long j) {
        this.this$0 = r3;
        this.val$currentTime = j;
        this.val$surface = str;
        put("duration", C18310x6.A0f(j, r3.A0H));
        put("surface", str == null ? "unknown" : str);
    }
}
