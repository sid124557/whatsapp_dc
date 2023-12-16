package X;

import com.whatsapp.messaging.offline.DelayedStanzasFetcher$StanzaFetcher;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messaging.offline.DelayedStanzasFetcher$StanzaFetcher", f = "DelayedStanzasFetcher.kt", i = {0}, l = {135}, m = "sendPullIqAndWaitForResult", n = {"this"}, s = {"L$0"})
/* renamed from: X.3gm  reason: invalid class name and case insensitive filesystem */
public final class C74223gm extends C75013pU {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DelayedStanzasFetcher$StanzaFetcher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74223gm(DelayedStanzasFetcher$StanzaFetcher delayedStanzasFetcher$StanzaFetcher, C84814Du r2) {
        super(r2);
        this.this$0 = delayedStanzasFetcher$StanzaFetcher;
    }

    public final Object A09(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00(this);
    }
}
