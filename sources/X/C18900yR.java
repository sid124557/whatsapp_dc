package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.0yR  reason: invalid class name and case insensitive filesystem */
public final class C18900yR extends Handler {
    public int A00 = -1;
    public final /* synthetic */ C18980yZ A01;

    public void A02() {
        sendEmptyMessageDelayed(2, 32000);
    }

    public void A03() {
        this.A00 = -1;
        removeCallbacksAndMessages((Object) null);
    }

    public void A04() {
        removeMessages(2);
    }

    public void A05() {
        removeMessages(0);
        this.A00 = -1;
    }

    public void A07(int i) {
        Message obtainMessage = obtainMessage(0);
        obtainMessage.arg1 = i;
        this.A00 = i;
        sendMessageDelayed(obtainMessage, 10000);
    }

    public boolean A09() {
        return hasMessages(0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18900yR(C18980yZ r2) {
        super(r2.getLooper());
        this.A01 = r2;
    }

    public void A06(int i) {
        Log.w("ConnectionThread/TimeoutHandler/fire-logout-timeout");
        Message obtainMessage = obtainMessage(0);
        obtainMessage.arg1 = i;
        this.A00 = i;
        sendMessage(obtainMessage);
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.A01.A0p(message.arg1);
            this.A00 = -1;
        } else if (i == 1) {
            AnonymousClass2z0 r7 = (AnonymousClass2z0) message.obj;
            C18260x0.A1P(AnonymousClass001.A0o(), "ConnectionThread/TimeoutHandler/recv/check; messageKey=", r7);
            C18980yZ r5 = this.A01;
            C624134x A05 = r5.A18.A05(r7);
            if (A05 != null) {
                int i2 = A05.A0D;
                if (AnonymousClass358.A00(i2, 4) < 0 && i2 != 20) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("ConnectionThread/TimeoutHandler/message receipt timeout fired; messageKey=");
                    A0o.append(r7);
                    C624134x.A0O(A05, "; fMessage.status=", A0o);
                    AnonymousClass0x2.A19(A0o);
                    removeMessages(1);
                    r5.A0t(0, 9, true);
                }
            }
        } else if (i == 2) {
            Log.w("ConnectionThread/TimeoutHandler/connection active timeout fired");
            removeMessages(2);
            this.A01.A0t(0, 10, true);
        }
    }

    public int A01() {
        return this.A00;
    }

    public void A08(AnonymousClass2z0 r4) {
        C18260x0.A1P(AnonymousClass001.A0o(), "ConnectionThread/TimeoutHandler/startReceiptTimeout; messageKey=", r4);
        sendMessageDelayed(obtainMessage(1, r4), 45000);
    }
}
