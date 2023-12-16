package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.0ZF  reason: invalid class name */
public class AnonymousClass0ZF implements Handler.Callback {
    public final /* synthetic */ C10110hP A00;

    public /* synthetic */ AnonymousClass0ZF(C10110hP r1) {
        this.A00 = r1;
    }

    public boolean handleMessage(Message message) {
        if (!C161827qc.A04()) {
            AnonymousClass020 A002 = this.A00.A04;
            A002.A00(A002.obtainMessage(message.what, message.obj));
            return true;
        }
        int i = message.what;
        if (i == 1) {
            C10110hP r1 = this.A00;
            Object obj = message.obj;
            obj.getClass();
            r1.A0B((AnonymousClass0C1) obj);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            C10110hP r12 = this.A00;
            Object obj2 = message.obj;
            obj2.getClass();
            r12.A0A((AnonymousClass0C0) obj2);
            return true;
        }
    }
}
