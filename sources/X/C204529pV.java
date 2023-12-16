package X;

import android.os.Handler;
import android.os.Message;
import java.util.List;

/* renamed from: X.9pV  reason: invalid class name and case insensitive filesystem */
public class C204529pV implements Handler.Callback {
    public Object A00;
    public final int A01;

    public C204529pV(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public boolean handleMessage(Message message) {
        if (this.A01 != 0) {
            AnonymousClass9WO r5 = (AnonymousClass9WO) this.A00;
            if (message.what != 1) {
                return false;
            }
            List list = r5.A0A;
            List list2 = r5.A09;
            int i = message.arg1;
            r5.A03(r5.A02());
            if (list == null || list2 == null || i >= list.size()) {
                return true;
            }
            C194439Sw r1 = r5.A0F;
            list2.get(list2.size() - 1);
            list.get(list.size() - 1);
            List list3 = r1.A00;
            if (0 >= list3.size()) {
                return true;
            }
            list3.get(0);
            throw AnonymousClass001.A0g("onZoomChange");
        }
        if (message.what == 1) {
            AnonymousClass9XE r4 = (AnonymousClass9XE) this.A00;
            if (r4.A0B) {
                List list4 = r4.A0A;
                int i2 = message.arg1;
                if (list4 == null || i2 >= list4.size()) {
                    return true;
                }
                list4.get(i2);
                list4.get(0);
                list4.get(list4.size() - 1);
                List list5 = r4.A06.A00;
                if (0 >= list5.size()) {
                    return true;
                }
                list5.get(0);
                throw AnonymousClass001.A0g("onZoomChange");
            }
        }
        if (message.what != 2) {
            return false;
        }
        List list6 = ((AnonymousClass9XE) this.A00).A06.A00;
        if (0 >= list6.size()) {
            return true;
        }
        list6.get(0);
        throw AnonymousClass001.A0g("onZoomError");
    }
}
