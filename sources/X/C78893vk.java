package X;

import android.os.Looper;
import com.whatsapp.messaging.xmpp.XmppProcessingAndLogoutWorker;

/* renamed from: X.3vk  reason: invalid class name and case insensitive filesystem */
public final class C78893vk extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ XmppProcessingAndLogoutWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78893vk(XmppProcessingAndLogoutWorker xmppProcessingAndLogoutWorker) {
        super(0);
        this.this$0 = xmppProcessingAndLogoutWorker;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        XmppProcessingAndLogoutWorker xmppProcessingAndLogoutWorker = this.this$0;
        Looper A00 = xmppProcessingAndLogoutWorker.A0B.A00();
        C162457s7.A0D(A00);
        return new C18750yC(A00, xmppProcessingAndLogoutWorker);
    }
}
