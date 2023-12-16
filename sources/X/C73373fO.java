package X;

import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3fO  reason: invalid class name and case insensitive filesystem */
public class C73373fO extends HashMap<AnonymousClass2z0, C30471mV> {
    public final /* synthetic */ C620133d this$0;

    public C73373fO(C620133d r1) {
        this.this$0 = r1;
    }

    /* renamed from: A00 */
    public C30471mV remove(Object obj) {
        AnonymousClass1I7 A00;
        C30471mV r3 = (C30471mV) super.get(obj);
        if (!(r3 == null || r3.A01 == null)) {
            C620133d r4 = this.this$0;
            StringBuilder A0o = AnonymousClass001.A0o();
            C624134x.A0S(r3, "MediaDownloadManager/unmarkAsUrgent/download message.key=", A0o);
            A0o.append(", message.mediaHash=");
            C18260x0.A1J(A0o, r3.A04);
            C626936e.A06(r3.A01);
            C48132eP r2 = r4.A0P;
            AnonymousClass1I7 A002 = r2.A00(r3.A01);
            if (A002 != null) {
                A002.A13 = false;
                HashMap hashMap = r4.A0k;
                synchronized (hashMap) {
                    Iterator A0u = AnonymousClass001.A0u(hashMap);
                    while (A0u.hasNext()) {
                        Map.Entry A0w = AnonymousClass001.A0w(A0u);
                        r4.A08((AnonymousClass4EV) null, (C30471mV) A0w.getKey(), 1, C18320x8.A05(A0w.getValue()), true, true);
                    }
                    hashMap.clear();
                }
                synchronized (r4.A0Q) {
                    Iterator it = r4.A04().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Log.d("MediaDownloadManager/unmarkAsUrgent/unblocking");
                            r4.A01.open();
                            break;
                        }
                        AnonymousClass33C r0 = C18320x8.A0S(it).A01;
                        if (r0 != null && (A00 = r2.A00(r0)) != null && A00.A13) {
                            Log.d("MediaDownloadManager/unmarkAsUrgent/exists urgent download");
                            break;
                        }
                    }
                }
            }
        }
        return (C30471mV) super.remove(obj);
    }
}
