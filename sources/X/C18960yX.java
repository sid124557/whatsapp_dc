package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.0yX  reason: invalid class name and case insensitive filesystem */
public final class C18960yX extends Handler implements AnonymousClass48H {
    public final /* synthetic */ C18980yZ A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18960yX(C18980yZ r2) {
        super(r2.getLooper());
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            Log.i("ConnectionThread/WriterThreadObserver/sending_channel_ready");
            this.A00.A0z((AnonymousClass4EX) message.obj);
        } else if (i == 1) {
            Log.d("ConnectionThread/WriterThreadObserver/send_error");
            this.A00.A13((AnonymousClass30X) message.obj);
        } else if (i == 2) {
            Log.d("ConnectionThread/WriterThreadObserver/message_sent");
            this.A00.A12((AnonymousClass2z0) message.obj);
        }
    }
}
