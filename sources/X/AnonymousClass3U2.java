package X;

import com.whatsapp.account.remove.RemoveAccountActivity;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3U2  reason: invalid class name */
public final class AnonymousClass3U2 implements AnonymousClass4DX {
    public final /* synthetic */ RemoveAccountActivity A00;

    public AnonymousClass3U2(RemoveAccountActivity removeAccountActivity) {
        this.A00 = removeAccountActivity;
    }

    public void BSk() {
        RemoveAccountActivity removeAccountActivity = this.A00;
        C69253Wh r2 = removeAccountActivity.A07;
        if (r2 != null) {
            C69253Wh.A01(r2, new C70043Zq(removeAccountActivity, 26));
            return;
        }
        throw C18270x1.A0S("mainThreadHandler");
    }

    public void onSuccess() {
        Log.i("RemoveAccountActivity/startRemoveAccount/launch switch and remove activity");
        RemoveAccountActivity removeAccountActivity = this.A00;
        removeAccountActivity.A04.Bkn(new C70043Zq(removeAccountActivity, 27), "RemoveAccountActivity/startRemoveAccountIntent", TimeUnit.SECONDS.toMillis(2));
    }
}
