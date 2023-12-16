package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.webkit.WebMessage;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3z1  reason: invalid class name and case insensitive filesystem */
public final class C80923z1 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ Message $msg;
    public final /* synthetic */ C628837c this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80923z1(Message message, C628837c r3) {
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
                JSONObject A1H = AnonymousClass0x9.A1H(data);
                Object obj2 = A1H.get("method");
                if (C162457s7.A0P(obj2, "isSupported")) {
                    C628837c r3 = this.this$0;
                    Object obj3 = A1H.get("data");
                    C162457s7.A0K(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                    Object obj4 = ((JSONObject) obj3).get("feature");
                    C162457s7.A0K(obj4, "null cannot be cast to non-null type kotlin.String");
                    if (!C162457s7.A0P(obj4, "UPI_PAY") || r3.A07.A0H("UPI") == null) {
                        r3.A03(Boolean.FALSE, A1H);
                    } else {
                        C628837c.A02(new C80933z2(r3, AnonymousClass0x9.A1G().put("responseData", AnonymousClass0x9.A1G().put("result", true).put("webview_token", A1H.get("webview_token"))).put("method", A1H.get("method")).put("callbackID", A1H.get("callbackID"))));
                    }
                } else if (C162457s7.A0P(obj2, "startUpiPayment")) {
                    C628837c r12 = this.this$0;
                    C19100yl r1 = r12.A01;
                    if (r1 == null) {
                        throw C18270x1.A0S("secureWebView");
                    } else if (!r1.A05(A1H.getString("webview_token"))) {
                        r12.A03("FAILURE", A1H);
                    } else {
                        Object obj5 = A1H.get("data");
                        C162457s7.A0K(obj5, "null cannot be cast to non-null type org.json.JSONObject");
                        JSONObject jSONObject = (JSONObject) obj5;
                        Object obj6 = jSONObject.get("reference_id");
                        C162457s7.A0K(obj6, "null cannot be cast to non-null type kotlin.String");
                        String str2 = (String) obj6;
                        Object obj7 = jSONObject.get("payment_config");
                        C162457s7.A0K(obj7, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj7;
                        Object obj8 = jSONObject.get("amount");
                        C162457s7.A0K(obj8, "null cannot be cast to non-null type kotlin.String");
                        String str4 = (String) obj8;
                        Object obj9 = jSONObject.get(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE);
                        C162457s7.A0K(obj9, "null cannot be cast to non-null type kotlin.String");
                        String str5 = (String) obj9;
                        Object obj10 = jSONObject.get("signature_type");
                        C162457s7.A0K(obj10, "null cannot be cast to non-null type kotlin.String");
                        String str6 = (String) obj10;
                        Set A06 = C73833g9.A06(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, "signature_type", "webview_token");
                        C162457s7.A0J(A06, 1);
                        JSONObject A1G = AnonymousClass0x9.A1G();
                        Iterator<String> keys = jSONObject.keys();
                        C162457s7.A0D(keys);
                        Iterator it = C829345m.A04(new C821642n(A06), new C626335w(new C72623e1(AnonymousClass455.A00, C829545o.A06(keys)), 4)).iterator();
                        while (it.hasNext()) {
                            String A0m = AnonymousClass001.A0m(it);
                            A1G.put(A0m, jSONObject.get(A0m));
                        }
                        C632438m r6 = new C632438m(str5, str6, C18290x4.A0o(A1G));
                        Context context = r12.A02;
                        UserJid userJid = r12.A06;
                        Intent A07 = C18320x8.A07();
                        A07.setClassName(context.getPackageName(), "com.whatsapp.payments.ui.IndiaWebViewUpiP2mHybridActivity");
                        AnonymousClass0x2.A0u(A07, userJid, "extra_receiver_jid");
                        A07.putExtra("extra_order_id", str2);
                        A07.putExtra("extra_payment_config_id", str3);
                        A07.putExtra("extra_p2m_amount", str4);
                        Object obj11 = A1H.get("method");
                        C162457s7.A0K(obj11, "null cannot be cast to non-null type kotlin.String");
                        A07.putExtra("method", (String) obj11);
                        Object obj12 = A1H.get("callbackID");
                        C162457s7.A0K(obj12, "null cannot be cast to non-null type kotlin.String");
                        A07.putExtra("callbackID", (String) obj12);
                        A07.putExtra("extra_merchant_signature_data", r6);
                        A07.putExtra("referral_screen", "webview");
                        A07.putExtra("extra_payment_config_id", str3);
                        A07.putExtra("extra_transaction_type", "p2m");
                        ((Activity) context).startActivityForResult(A07, 1000);
                    }
                }
            } catch (JSONException unused) {
                str = "Exception while parsing data from JS";
            } catch (NoSuchAlgorithmException unused2) {
                str = "Key algorithm not supported";
            } catch (InvalidKeySpecException unused3) {
                str = "Invalid public key";
            } catch (SignatureException unused4) {
                str = "Invalid signature";
            }
        } else {
            str = "Payload size exceeds limit";
            Log.e(str);
        }
        return C59022wD.A00;
    }
}
