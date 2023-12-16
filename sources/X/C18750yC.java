package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.messaging.xmpp.XmppProcessingAndLogoutWorker;
import com.whatsapp.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0yC  reason: invalid class name and case insensitive filesystem */
public final class C18750yC extends Handler {
    public final /* synthetic */ XmppProcessingAndLogoutWorker A00;

    public void handleMessage(Message message) {
        Object r2;
        C162457s7.A0J(message, 0);
        int i = message.what;
        if (i == 1) {
            XmppProcessingAndLogoutWorker xmppProcessingAndLogoutWorker = this.A00;
            C67823Qu r3 = xmppProcessingAndLogoutWorker.A0C;
            if (!r3.A07()) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("XmppProcessingAndLogoutWorker/work is done; is processing: ");
                C18260x0.A1V(A0o, r3.A07());
            } else {
                AnonymousClass66R r6 = xmppProcessingAndLogoutWorker.A0D;
                long A0D = C18290x4.A0D(r6);
                boolean z = xmppProcessingAndLogoutWorker.A02;
                int i2 = xmppProcessingAndLogoutWorker.A00;
                if (r3.A07()) {
                    if (!z && i2 == 1) {
                        A0D += 1000;
                    }
                    if (r3.A08(A0D) && xmppProcessingAndLogoutWorker.A08.A0Y(C58422vE.A02, 5409)) {
                        Log.i("XmppProcessingAndLogoutWorker/doWork seems like stanzas stuck");
                        xmppProcessingAndLogoutWorker.A05.A0A("xmpp-lifecycle-worker-stuck-stanza", false, r3.A01());
                        r3.A05(3);
                    }
                }
                if (AnonymousClass0x7.A0E(xmppProcessingAndLogoutWorker.A01) >= 300000) {
                    if (!xmppProcessingAndLogoutWorker.A04.A00) {
                        xmppProcessingAndLogoutWorker.A05.A0A("xmpp-tracking-work", false, r3.A01());
                    }
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("XmppProcessingAndLogoutWorker/300000 milliseconds time out reached; stop the job; is processing: ");
                    C18260x0.A1V(A0o2, r3.A07());
                    r3.A05(0);
                } else {
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    A0o3.append("XmppProcessingAndLogoutWorker/cycle: ");
                    int i3 = xmppProcessingAndLogoutWorker.A00;
                    xmppProcessingAndLogoutWorker.A00 = i3 + 1;
                    A0o3.append(i3);
                    A0o3.append(" started: ");
                    C18260x0.A1L(A0o3, r3.A01());
                    AnonymousClass0x9.A0A(xmppProcessingAndLogoutWorker.A0E).sendEmptyMessageDelayed(1, C18290x4.A0D(r6));
                    return;
                }
            }
            xmppProcessingAndLogoutWorker.A0C(C18290x4.A0D(xmppProcessingAndLogoutWorker.A0F));
        } else if (i == 2) {
            Log.i("XmppProcessingAndLogoutWorker/checkLogout");
            XmppProcessingAndLogoutWorker xmppProcessingAndLogoutWorker2 = this.A00;
            if (xmppProcessingAndLogoutWorker2.A0A.A00("XmppProcessingAndLogoutWorker")) {
                Log.i("XmppProcessingAndLogoutWorker/performed logout");
                TimeUnit timeUnit = TimeUnit.SECONDS;
                CountDownLatch A14 = C18290x4.A14();
                xmppProcessingAndLogoutWorker2.A06.A08(new AnonymousClass260(A14, 1));
                boolean z2 = !A14.await(1, timeUnit);
                if (z2) {
                    xmppProcessingAndLogoutWorker2.A05.A0A("xmpp-logout-worker-waited-logout-too-long", false, (String) null);
                }
                C18260x0.A1E("XmppProcessingAndLogoutWorker/logout complete did timeout: ", AnonymousClass001.A0o(), z2);
                r2 = new C01410Ap();
            } else if (!AnonymousClass0x9.A0A(xmppProcessingAndLogoutWorker2.A0E).hasMessages(1)) {
                r2 = new C01400Ao();
            } else {
                return;
            }
            xmppProcessingAndLogoutWorker2.A09.A00 = null;
            xmppProcessingAndLogoutWorker2.A0C.A02();
            xmppProcessingAndLogoutWorker2.A03.A05(r2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18750yC(Looper looper, XmppProcessingAndLogoutWorker xmppProcessingAndLogoutWorker) {
        super(looper);
        this.A00 = xmppProcessingAndLogoutWorker;
    }
}
