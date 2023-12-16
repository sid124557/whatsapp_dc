package X;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: X.01x  reason: invalid class name */
public final class AnonymousClass01x extends Handler {
    public WeakReference A00;

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == -3 || i == -2 || i == -1) {
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.A00.get(), i);
        } else if (i == 1) {
            ((DialogInterface) message.obj).dismiss();
        }
    }

    public AnonymousClass01x(DialogInterface dialogInterface) {
        this.A00 = new WeakReference(dialogInterface);
    }
}
