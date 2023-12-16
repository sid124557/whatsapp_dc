package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.5NT  reason: invalid class name */
public final class AnonymousClass5NT {
    public List A00;
    public Map A01;
    public final C64773Ex A02;

    public AnonymousClass5NT(C64773Ex r2) {
        C162457s7.A0J(r2, 1);
        this.A02 = r2;
    }

    public final List A00() {
        List list;
        synchronized (this) {
            list = this.A00;
            if (list == null) {
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                this.A02.A0i(copyOnWriteArrayList);
                list = C73723fy.A0F(copyOnWriteArrayList);
                this.A00 = list;
            }
            C162457s7.A0K(list, "null cannot be cast to non-null type kotlin.collections.List<com.whatsapp.data.WAContact>");
        }
        return list;
    }
}
