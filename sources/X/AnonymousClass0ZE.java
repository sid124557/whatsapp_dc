package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.0ZE  reason: invalid class name */
public final class AnonymousClass0ZE implements Handler.Callback {
    public final Handler.Callback A00;

    public boolean handleMessage(Message message) {
        String str;
        C162457s7.A0J(message, 0);
        Object obj = message.obj;
        if (obj instanceof C03520Kn) {
            C162457s7.A0K(obj, "null cannot be cast to non-null type com.bloks.foa.core.surface.MessageParam");
            str = ((C03520Kn) obj).A00;
            if (str != null) {
                AnonymousClass8DC.A00.A01(str);
            }
        } else {
            str = null;
        }
        try {
            return this.A00.handleMessage(message);
        } finally {
            if (str != null) {
                AnonymousClass8DC.A00.A00();
            }
        }
    }

    public AnonymousClass0ZE(Handler.Callback callback) {
        this.A00 = callback;
    }
}
