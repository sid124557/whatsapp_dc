package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.4Ma  reason: invalid class name and case insensitive filesystem */
public class C86834Ma extends Handler {
    public final C183538qC A00;
    public final C183538qC A01;

    public void handleMessage(Message message) {
        if (!((C29321id) this.A01.get()).A09()) {
            ((C55602qc) this.A00.get()).A04(true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86834Ma(Looper looper, C183538qC r2, C183538qC r3) {
        super(looper);
        C626936e.A06(looper);
        this.A00 = r2;
        this.A01 = r3;
    }
}
