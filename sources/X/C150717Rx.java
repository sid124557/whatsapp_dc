package X;

import android.os.Message;
import java.util.List;

/* renamed from: X.7Rx  reason: invalid class name and case insensitive filesystem */
public final class C150717Rx {
    public Message A00;
    public C160207nD A01;

    public void A01() {
        Message message = this.A00;
        message.getClass();
        message.sendToTarget();
        this.A00 = null;
        this.A01 = null;
        List list = C160207nD.A01;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(this);
            }
        }
    }

    public static void A00(C160207nD r2, Object obj, int i) {
        C150717Rx A002 = C160207nD.A00();
        A002.A00 = r2.A00.obtainMessage(i, obj);
        A002.A01 = r2;
        A002.A01();
    }
}
