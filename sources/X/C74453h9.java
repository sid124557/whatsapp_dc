package X;

import com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.json.JSONObject;

@DebugMetadata(c = "com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository", f = "FlowsWebViewDataRepository.kt", i = {0, 0}, l = {227}, m = "addPublicKeyAfterVersionCheck", n = {"this", "flowDataResponse"}, s = {"L$0", "L$1"})
/* renamed from: X.3h9  reason: invalid class name and case insensitive filesystem */
public final class C74453h9 extends C75013pU {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlowsWebViewDataRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74453h9(FlowsWebViewDataRepository flowsWebViewDataRepository, C84814Du r2) {
        super(r2);
        this.this$0 = flowsWebViewDataRepository;
    }

    public final Object A09(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A02((C53832nk) null, (C41572Kt) null, (UserJid) null, (String) null, this, (JSONObject) null);
    }
}
