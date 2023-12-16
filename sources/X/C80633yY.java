package X;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import org.json.JSONObject;

/* renamed from: X.3yY  reason: invalid class name and case insensitive filesystem */
public final class C80633yY extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ JSONObject $response;
    public final /* synthetic */ C54452ok this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80633yY(C54452ok r2, JSONObject jSONObject) {
        super(0);
        this.this$0 = r2;
        this.$response = jSONObject;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        WebMessagePort A00 = this.this$0.A00();
        if (A00 != null) {
            A00.postMessage(new WebMessage(this.$response.toString()));
        }
        return C59022wD.A00;
    }
}
