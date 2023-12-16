package X;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import org.json.JSONObject;

/* renamed from: X.3z0  reason: invalid class name and case insensitive filesystem */
public final class C80913z0 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ JSONObject $response;
    public final /* synthetic */ C628837c this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80913z0(C628837c r2, JSONObject jSONObject) {
        super(0);
        this.this$0 = r2;
        this.$response = jSONObject;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        WebMessagePort A00 = this.this$0.A00;
        if (A00 == null) {
            throw C18270x1.A0S("sendPort");
        }
        A00.postMessage(new WebMessage(this.$response.toString()));
        return C59022wD.A00;
    }
}
