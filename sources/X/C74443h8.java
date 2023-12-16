package X;

import android.webkit.WebMessagePort;
import com.whatsapp.extensions.bloks.viewmodel.WaFlowsViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.json.JSONObject;

@DebugMetadata(c = "com.whatsapp.extensions.bloks.viewmodel.WaFlowsViewModel", f = "WaFlowsViewModel.kt", i = {0, 0}, l = {125}, m = "processWebBridgeAPICall", n = {"this", "methodName"}, s = {"L$0", "L$1"})
/* renamed from: X.3h8  reason: invalid class name and case insensitive filesystem */
public final class C74443h8 extends C75013pU {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ WaFlowsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74443h8(WaFlowsViewModel waFlowsViewModel, C84814Du r2) {
        super(r2);
        this.this$0 = waFlowsViewModel;
    }

    public final Object A09(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A0D((WebMessagePort) null, this, (JSONObject) null);
    }
}
