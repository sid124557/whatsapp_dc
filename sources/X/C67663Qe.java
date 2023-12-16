package X;

import android.os.Message;

/* renamed from: X.3Qe  reason: invalid class name and case insensitive filesystem */
public class C67663Qe implements AnonymousClass4DA {
    public C112515jr A00;
    public final C66523Lt A01;

    public int[] B81() {
        return new int[]{150, 192, 193, 197};
    }

    public boolean BFA(Message message, int i) {
        if (!(i == 150 || i == 197)) {
            if (i != 192) {
                if (i != 193) {
                    return false;
                }
            } else if ("terminate".equals(((AnonymousClass2QR) message.obj).A01.tag)) {
                C61032zb.A00(this.A01.A0s, 4);
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("voip/onReceiveCallMessage/");
        C18260x0.A1F(A0o, message.arg1);
        this.A00.A00(new C106645Zu(Message.obtain(message), "receive_message"));
        return true;
    }

    public C67663Qe(C112515jr r1, C66523Lt r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
