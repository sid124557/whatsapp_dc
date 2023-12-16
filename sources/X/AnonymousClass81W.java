package X;

import com.facebook.android.exoplayer2.Timeline;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.81W  reason: invalid class name */
public abstract class AnonymousClass81W implements C185778uE {
    public C153737br A00;
    public Timeline A01;
    public Object A02;
    public final C160767oH A03 = new C160767oH();
    public final ArrayList A04 = AnonymousClass002.A0I(1);

    public abstract void A00();

    public abstract void A01(C153737br r1, boolean z);

    public final void A02(Timeline timeline, Object obj) {
        this.A01 = timeline;
        this.A02 = obj;
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            ((C180198ke) it.next()).Bbp(timeline, this, obj);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r1 == r3) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BhR(X.C153737br r3, X.C180198ke r4, boolean r5) {
        /*
            r2 = this;
            X.7br r1 = r2.A00
            if (r1 == 0) goto L_0x0007
            r0 = 0
            if (r1 != r3) goto L_0x0008
        L_0x0007:
            r0 = 1
        L_0x0008:
            X.C159197lM.A01(r0)
            java.util.ArrayList r0 = r2.A04
            r0.add(r4)
            X.7br r0 = r2.A00
            if (r0 != 0) goto L_0x001a
            r2.A00 = r3
            r2.A01(r3, r5)
        L_0x0019:
            return
        L_0x001a:
            com.facebook.android.exoplayer2.Timeline r1 = r2.A01
            if (r1 == 0) goto L_0x0019
            java.lang.Object r0 = r2.A02
            r4.Bbp(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass81W.BhR(X.7br, X.8ke, boolean):void");
    }

    public final void Bix(C180198ke r2) {
        ArrayList arrayList = this.A04;
        arrayList.remove(r2);
        if (arrayList.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            A00();
        }
    }

    public final void Bj9(AnonymousClass4FL r5) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A03.A02;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass7F9 r1 = (AnonymousClass7F9) it.next();
            if (r1.A01 == r5) {
                copyOnWriteArrayList.remove(r1);
            }
        }
    }
}
