package X;

import java.util.Iterator;
import java.util.Map;
import java.util.Queue;

/* renamed from: X.42o  reason: invalid class name and case insensitive filesystem */
public final class C821742o extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass3CS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C821742o(AnonymousClass3CS r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map map = (Map) obj;
        C162457s7.A0J(map, 0);
        AnonymousClass3CS r4 = this.this$0;
        synchronized (r4) {
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                r4.A00.put(C18310x6.A0q(A0w), (byte[]) A0w.getValue());
            }
            Queue<Object> queue = r4.A04;
            for (Object A1K : queue) {
                AnonymousClass0x9.A1K(A1K);
            }
            queue.clear();
            r4.A07 = true;
        }
        return C59022wD.A00;
    }
}
