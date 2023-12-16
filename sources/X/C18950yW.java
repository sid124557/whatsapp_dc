package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.util.Log;
import java.util.ArrayDeque;

/* renamed from: X.0yW  reason: invalid class name and case insensitive filesystem */
public final class C18950yW extends Handler implements AnonymousClass4EX {
    public final /* synthetic */ C18970yY A00;

    public void Bla(Message message) {
        message.what = 2;
        sendMessage(message);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18950yW(Looper looper, C18970yY r2) {
        super(looper);
        this.A00 = r2;
    }

    public void BlJ(AnonymousClass30X r2) {
        Log.d("WriterThread/sendConnected");
        C18290x4.A1C(this, r2, 0);
    }

    public void BlN() {
        Log.d("WriterThread/sendDisconnected");
        sendEmptyMessage(1);
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            Log.i("WriterThread/recv/connected");
            C18970yY r3 = this.A00;
            r3.A00 = (AnonymousClass30X) message.obj;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("WriterThread/handleConnected re-sending stanzas from the queue, size=");
            ArrayDeque arrayDeque = r3.A09;
            C18260x0.A1G(A0o, arrayDeque.size());
            r3.A01 = false;
            while (!r3.A01 && !arrayDeque.isEmpty()) {
                r3.A02((Message) arrayDeque.remove());
            }
        } else if (i == 1) {
            Log.d("WriterThread/recv/disconnected");
            this.A00.A01 = true;
        } else if (i == 2) {
            this.A00.A02(message);
        }
    }
}
