package X;

import com.whatsapp.messaging.xmpp.XmppLifecycleWorker;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messaging.xmpp.XmppLifecycleWorker", f = "XmppLifecycleWorker.kt", i = {0}, l = {56}, m = "doWork", n = {"this"}, s = {"L$0"})
/* renamed from: X.3gn  reason: invalid class name and case insensitive filesystem */
public final class C74233gn extends C75013pU {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ XmppLifecycleWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74233gn(XmppLifecycleWorker xmppLifecycleWorker, C84814Du r2) {
        super(r2);
        this.this$0 = xmppLifecycleWorker;
    }

    public final Object A09(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A0D(this);
    }
}
