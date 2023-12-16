package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.0yK  reason: invalid class name and case insensitive filesystem */
public class C18830yK extends Handler {
    public final /* synthetic */ C28891hw A00;
    public final /* synthetic */ C50012hU A01;
    public final /* synthetic */ C29431io A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18830yK(Looper looper, C28891hw r2, C50012hU r3, C29431io r4) {
        super(looper);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        C624134x r3;
        C624134x r4;
        int i = message.what;
        Object obj = message.obj;
        if (i == 11) {
            Pair pair = (Pair) obj;
            r3 = (C624134x) pair.first;
            r4 = (C624134x) pair.second;
        } else {
            r3 = (C624134x) obj;
            r4 = null;
            if (i != 2) {
                switch (i) {
                    case 10:
                        C29431io r2 = this.A02;
                        Iterator A04 = C61102zi.A04(r2, "MessageObservers/notifyMessageDetailsChanged");
                        while (A04.hasNext()) {
                            C29431io.A00(r2, A04).BWW(r3);
                        }
                        return;
                    case 11:
                        break;
                    case 12:
                        Log.d("msgstore/updatehandler/conversation-not-spam");
                        C28891hw r1 = this.A00;
                        C626936e.A06(AnonymousClass2z0.A00(r3));
                        Iterator A03 = C61102zi.A03(r1);
                        while (A03.hasNext()) {
                            A03.next();
                        }
                        return;
                    case 13:
                        Log.d("msgstore/updatehandler/conversation-marked-as-encrypted");
                        C28891hw r12 = this.A00;
                        C626936e.A06(AnonymousClass2z0.A00(r3));
                        Iterator A032 = C61102zi.A03(r12);
                        while (A032.hasNext()) {
                            A032.next();
                        }
                        return;
                    case 14:
                        Log.d("msgstore/updatehandler/message-add-on-status-changed");
                        C29431io r5 = this.A02;
                        C18260x0.A0w("MessageObservers/notifyMessageAddOnStatusChanged updateType:", AnonymousClass001.A0o(), message.arg1);
                        Iterator A033 = C61102zi.A03(r5);
                        while (A033.hasNext()) {
                            A033.next();
                            r5.A00++;
                        }
                        return;
                    default:
                        return;
                }
            } else {
                this.A01.A01(r3, message.arg1);
                return;
            }
        }
        Log.d("msgstore/updatehandler/placeholder-message-replaced");
        C29431io r22 = this.A02;
        if (r4 != null) {
            Iterator A042 = C61102zi.A04(r22, "MessageObservers/notifyPlaceholderMessageReplaced");
            while (A042.hasNext()) {
                C29431io.A00(r22, A042).BY9(r3, r4);
            }
        }
    }
}
