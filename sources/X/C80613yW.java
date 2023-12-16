package X;

import android.os.Message;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer;
import com.whatsapp.util.Log;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import org.json.JSONException;

/* renamed from: X.3yW  reason: invalid class name and case insensitive filesystem */
public final class C80613yW extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ Message $msg;
    public final /* synthetic */ C628737b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80613yW(Message message, C628737b r3) {
        super(0);
        this.$msg = message;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        Object obj = this.$msg.obj;
        C162457s7.A0K(obj, "null cannot be cast to non-null type android.webkit.WebMessage");
        String data = ((WebMessage) obj).getData();
        if (data.length() <= 1024) {
            try {
                C628737b r0 = this.this$0;
                FlowsWebBottomSheetContainer flowsWebBottomSheetContainer = r0.A03;
                if (flowsWebBottomSheetContainer != null) {
                    WebMessagePort A00 = r0.A00;
                    if (A00 == null) {
                        throw C18270x1.A0S("sendPort");
                    }
                    flowsWebBottomSheetContainer.A1Z(A00, AnonymousClass0x9.A1H(data));
                }
            } catch (JSONException unused) {
                str = "Exception while parsing data from JS";
            } catch (NoSuchAlgorithmException unused2) {
                str = "Key algorithm not supported";
            } catch (InvalidKeySpecException unused3) {
                str = "Invalid public key";
            }
        } else {
            str = "Payload size exceeds limit";
            Log.e(str);
        }
        return C59022wD.A00;
    }
}
