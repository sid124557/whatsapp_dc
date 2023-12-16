package X;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.webkit.WebMessagePort;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import org.json.JSONObject;

/* renamed from: X.37c  reason: invalid class name and case insensitive filesystem */
public final class C628837c implements Handler.Callback {
    public WebMessagePort A00;
    public C19100yl A01;
    public final Context A02;
    public final Handler A03;
    public final Looper A04;
    public final C627736r A05;
    public final UserJid A06;
    public final AnonymousClass9U4 A07;

    public boolean handleMessage(Message message) {
        C162457s7.A0J(message, 0);
        if (message.what != 0) {
            return true;
        }
        A02(new C80923z1(message, this));
        return true;
    }

    public static final void A02(AnonymousClass4GP r2) {
        if (Build.VERSION.SDK_INT >= 23) {
            r2.invoke();
        } else {
            Log.e("Api check failed");
        }
    }

    public C628837c(Context context, Looper looper, C627736r r4, UserJid userJid, AnonymousClass9U4 r6) {
        this.A02 = context;
        this.A04 = looper;
        this.A05 = r4;
        this.A06 = userJid;
        this.A07 = r6;
        this.A03 = new Handler(looper, this);
    }

    public final void A03(Object obj, JSONObject jSONObject) {
        Object obj2;
        JSONObject put = AnonymousClass0x9.A1G().put("responseData", AnonymousClass0x9.A1G().put("result", obj));
        Object obj3 = null;
        if (jSONObject != null) {
            obj2 = jSONObject.get("method");
        } else {
            obj2 = null;
        }
        JSONObject put2 = put.put("method", obj2);
        if (jSONObject != null) {
            obj3 = jSONObject.get("callbackID");
        }
        A02(new C80913z0(this, put2.put("callbackID", obj3)));
    }
}
