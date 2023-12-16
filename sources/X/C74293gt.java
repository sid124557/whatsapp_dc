package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.reporttoadmin.xmpp.RtaXmppClient;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.reporttoadmin.xmpp.RtaXmppClient", f = "RtaXmppClient.kt", i = {0}, l = {50}, m = "reportMessageToAdmin", n = {"request"}, s = {"L$0"})
/* renamed from: X.3gt  reason: invalid class name and case insensitive filesystem */
public final class C74293gt extends C75013pU {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RtaXmppClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74293gt(RtaXmppClient rtaXmppClient, C84814Du r2) {
        super(r2);
        this.this$0 = rtaXmppClient;
    }

    public final Object A09(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01((C27991fJ) null, (UserJid) null, (String) null, this);
    }
}
