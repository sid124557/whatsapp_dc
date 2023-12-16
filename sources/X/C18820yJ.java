package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.0yJ  reason: invalid class name and case insensitive filesystem */
public class C18820yJ extends Handler {
    public final /* synthetic */ C28871hu A00;
    public final /* synthetic */ C50012hU A01;
    public final /* synthetic */ C29431io A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18820yJ(Looper looper, C28871hu r2, C50012hU r3, C29431io r4) {
        super(looper);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        C624134x r5 = (C624134x) message.obj;
        int i = message.what;
        if (i == 3) {
            Log.d("msgstore/addhandler/duplicate");
            C29431io r2 = this.A02;
            Iterator A04 = C61102zi.A04(r2, "MessageObservers/notifyDuplicateMessageReceived");
            while (A04.hasNext()) {
                C29431io.A00(r2, A04).BRi(r5);
            }
        } else if (i == 4) {
            Log.d("msgstore/addhandler/chatadded");
            C28871hu r4 = this.A00;
            r4.A00.BkS(new C70093Zw(r4, 17, AnonymousClass2z0.A00(r5)));
            this.A02.A0B(r5, message.arg1);
        } else if (i == 5) {
            Log.d("msgstore/addhandler/chatchanged");
            C50012hU r3 = this.A01;
            r3.A04.A0B(r5, message.arg1);
            C624034w r22 = r5.A0P;
            if (r22 != null) {
                Iterator A03 = C61102zi.A03(r3.A05);
                while (A03.hasNext()) {
                    ((AnonymousClass4DI) A03.next()).BXx(r22);
                }
            }
            r3.A03.A0A(AnonymousClass2z0.A00(r5), false);
        } else if (i == 6) {
            Log.d("msgstore/addhandler/unarchived");
            this.A00.A08();
        } else if (i == 7) {
            Log.d("msgstore/addhandler/offline-completed");
            C29431io r23 = this.A02;
            Iterator A042 = C61102zi.A04(r23, "MessageObservers/notifyOfflineCompleteReceived");
            while (A042.hasNext()) {
                C29431io.A00(r23, A042).BXI();
            }
        }
    }
}
