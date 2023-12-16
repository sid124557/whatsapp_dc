package X;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.net.ssl.SSLSession;

/* renamed from: X.8Tl  reason: invalid class name and case insensitive filesystem */
public class C174228Tl extends LinkedHashMap<AnonymousClass7WP, SSLSession> {
    public final /* synthetic */ AnonymousClass8P4 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174228Tl(AnonymousClass8P4 r4) {
        super(64, 0.75f, true);
        this.this$0 = r4;
    }

    public boolean removeEldestEntry(Map.Entry entry) {
        return C86624Kv.A1W(size(), this.this$0.A02);
    }
}
