package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.0yU  reason: invalid class name and case insensitive filesystem */
public final class C18930yU extends Handler implements C83904Ag, AnonymousClass48G {
    public boolean A00;
    public final /* synthetic */ C18980yZ A01;

    public void Bfr(Message message) {
        message.what = 0;
        sendMessage(message);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18930yU(C18980yZ r2) {
        super(r2.getLooper());
        this.A01 = r2;
    }

    public void A00() {
        Log.d("ConnectionThread/ReaderThreadHandler/finish");
        this.A00 = true;
    }

    public void handleMessage(Message message) {
        C18980yZ r1;
        String str;
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 4) {
                        this.A01.A0v(message);
                        return;
                    } else if (i == 5) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("ConnectionThread/ReaderThreadHandler/recv/ack; stanzaKey=");
                        C18260x0.A0m(message.obj, A0o);
                        C613430h A0D = this.A01.A0r;
                        C18290x4.A1C(A0D.A0A, message.obj, 6);
                        return;
                    } else {
                        return;
                    }
                } else if (this.A00) {
                    Log.d("ConnectionThread/ReaderThreadHandler/recv/reader_error (ignored)");
                    r1 = this.A01;
                    str = "ConnectionThread/ReaderThreadHandler/quit if error and finished";
                } else {
                    Log.d("ConnectionThread/ReaderThreadHandler/recv/reader_error");
                    C18980yZ r12 = this.A01;
                    if (r12.A19()) {
                        Log.d("ConnectionThread/ReaderThreadHandler/recv/reader_error/during-logout");
                        r12.A0l();
                        return;
                    }
                    r12.A0r(message.arg1);
                    return;
                }
            } else if (this.A00) {
                Log.d("ConnectionThread/ReaderThreadHandler/recv/logout (ignored)");
                r1 = this.A01;
                str = "ConnectionThread/ReaderThreadHandler/quit if logout is finished";
            } else {
                Log.d("ConnectionThread/ReaderThreadHandler/recv/logout");
                this.A01.A0l();
                return;
            }
            r1.A15(str);
            return;
        }
        this.A01.A0w(message);
    }
}
