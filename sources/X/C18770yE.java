package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.account.delete.DeleteAccountConfirmation;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.0yE  reason: invalid class name and case insensitive filesystem */
public final class C18770yE extends Handler {
    public final C51072jE A00;
    public final WeakReference A01;

    public void handleMessage(Message message) {
        Activity activity = (Activity) this.A01.get();
        if (activity == null) {
            Log.w("DeleteAccountConfirmation/delete account confirmation was garbage collected with messages still enqueued");
        } else if (message.what == 0) {
            Log.i("DeleteAccountConfirmation/timeout/expired");
            C621433s.A00(activity, 1);
            if (this.A00.A00() == 0) {
                Log.d("DeleteAccountConfirmation/go-to-eula");
                return;
            }
            Log.w("DeleteAccountConfirmation/dialog-delete-failed");
            C621433s.A01(activity, 3);
        }
    }

    public C18770yE(DeleteAccountConfirmation deleteAccountConfirmation, C51072jE r3) {
        super(Looper.getMainLooper());
        this.A00 = r3;
        this.A01 = AnonymousClass0x9.A14(deleteAccountConfirmation);
    }
}
