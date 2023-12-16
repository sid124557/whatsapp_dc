package X;

import android.os.Handler;
import com.whatsapp.messaging.xmpp.XmppProcessingAndLogoutWorker;
import com.whatsapp.util.Log;

/* renamed from: X.3vm  reason: invalid class name and case insensitive filesystem */
public final class C78913vm extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ XmppProcessingAndLogoutWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78913vm(XmppProcessingAndLogoutWorker xmppProcessingAndLogoutWorker) {
        super(0);
        this.this$0 = xmppProcessingAndLogoutWorker;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        XmppProcessingAndLogoutWorker xmppProcessingAndLogoutWorker = this.this$0;
        AnonymousClass66R r2 = xmppProcessingAndLogoutWorker.A0E;
        if (AnonymousClass0x9.A0A(r2).hasMessages(2)) {
            Log.i("XmppProcessingAndLogoutWorker/restart processing");
            Handler A0A = AnonymousClass0x9.A0A(r2);
            Log.i("XmppProcessingAndLogoutWorker/cancel logout");
            A0A.removeMessages(2);
            xmppProcessingAndLogoutWorker.A0B();
        }
        return C59022wD.A00;
    }
}
