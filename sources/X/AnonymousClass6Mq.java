package X;

import com.facebook.msys.mci.NotificationCenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6Mq  reason: invalid class name */
public class AnonymousClass6Mq extends C172568Lu {
    public final /* synthetic */ C180418l0 A00;
    public final /* synthetic */ NotificationCenter A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ Map A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6Mq(C180418l0 r2, NotificationCenter notificationCenter, String str, ArrayList arrayList, Map map) {
        super("dispatchNotificationToCallbacks");
        this.A01 = notificationCenter;
        this.A03 = arrayList;
        this.A02 = str;
        this.A00 = r2;
        this.A04 = map;
    }

    public void run() {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((NotificationCenter.NotificationCallback) it.next()).onNewNotification(this.A02, this.A00, this.A04);
        }
    }
}
