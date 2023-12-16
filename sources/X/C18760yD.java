package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.0yD  reason: invalid class name and case insensitive filesystem */
public final class C18760yD extends Handler {
    public final C28861ht A00;
    public final WeakReference A01;

    public void handleMessage(Message message) {
        Activity activity = (Activity) this.A01.get();
        if (activity == null) {
            removeMessages(1);
        } else if (message.what == 1) {
            Log.e("restore>VerifyMessageStoreHelper/timeout");
            removeMessages(1);
            if (this.A00.A00) {
                AnonymousClass344.A01(new DisplayExceptionDialogFactory$LoginFailedDialogFragment(), ((C003203q) activity).getSupportFragmentManager());
                return;
            }
            C621433s.A01(activity, 200);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18760yD(Looper looper, C28861ht r2, WeakReference weakReference) {
        super(looper);
        C626936e.A06(looper);
        this.A00 = r2;
        this.A01 = weakReference;
    }
}
