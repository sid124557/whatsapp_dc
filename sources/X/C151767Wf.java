package X;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* renamed from: X.7Wf  reason: invalid class name and case insensitive filesystem */
public class C151767Wf {
    public C147987Gm A00;
    public final AnonymousClass3ZT A01;
    public final AnonymousClass7RU A02 = new AnonymousClass7RU(this);
    public final LinkedHashMap A03 = C18320x8.A0r();

    public void A00(View view, AnonymousClass5Z2 r5) {
        WeakHashMap weakHashMap = C157977jE.A01;
        Object obj = weakHashMap.get(view);
        if (obj == null) {
            obj = new C157977jE(view);
            weakHashMap.put(view, obj);
        }
        C147987Gm r0 = this.A00;
        if (r0 != null && r5 != null) {
            C146807Br r1 = r0.A00;
            synchronized (r1) {
                r1.A00.put(obj, r5);
            }
        }
    }

    public final void A01(C46582bs r8, AnonymousClass5PK r9, AnonymousClass5U3 r10) {
        C146807Br r5 = new C146807Br();
        C147987Gm r0 = new C147987Gm(r9, r5, new AnonymousClass5LC(AnonymousClass000.A0A(), new AnonymousClass82Q(), r8, r5, r10));
        this.A00 = r0;
        r0.A01.A00 = this.A02;
    }

    public C151767Wf(AnonymousClass3ZT r2) {
        this.A01 = r2;
    }
}
