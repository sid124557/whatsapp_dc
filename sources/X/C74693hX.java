package X;

import android.os.Bundle;
import com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository", f = "FlowsWebViewDataRepository.kt", i = {1, 1, 1, 1, 1, 1}, l = {173, 179, 186}, m = "prepareFlowMetadata", n = {"this", "bizJid", "flowId", "flowMessageVersion", "flowDataResponse", "instanceKey"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
/* renamed from: X.3hX  reason: invalid class name and case insensitive filesystem */
public final class C74693hX extends C75013pU {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlowsWebViewDataRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74693hX(FlowsWebViewDataRepository flowsWebViewDataRepository, C84814Du r2) {
        super(r2);
        this.this$0 = flowsWebViewDataRepository;
    }

    public final Object A09(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01((Bundle) null, (UserJid) null, this);
    }
}
