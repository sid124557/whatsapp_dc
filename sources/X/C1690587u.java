package X;

import android.os.Looper;
import com.google.android.exoplayer2.Timeline;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.87u  reason: invalid class name and case insensitive filesystem */
public abstract class C1690587u implements C186428vI {
    public Looper A00;
    public Timeline A01;
    public final C156317gQ A02 = new C156317gQ();
    public final C159017kx A03 = new C159017kx();
    public final ArrayList A04 = AnonymousClass002.A0I(1);
    public final HashSet A05 = new HashSet(1);

    public abstract void A00();

    public abstract void A02(C178288hI r1);

    public final void A01(Timeline timeline) {
        this.A01 = timeline;
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            ((C180718lW) it.next()).Bbq(timeline, this);
        }
    }

    public final void B1g(C180718lW r4) {
        HashSet hashSet = this.A05;
        boolean z = !hashSet.isEmpty();
        hashSet.remove(r4);
        if (z && hashSet.isEmpty()) {
            if (this instanceof AnonymousClass6PJ) {
                Iterator A10 = C18290x4.A10(((AnonymousClass6PJ) this).A02);
                while (A10.hasNext()) {
                    C148627Jc r0 = (C148627Jc) A10.next();
                    r0.A01.B1g(r0.A00);
                }
            }
        }
    }

    public final void B2M(C180718lW r4) {
        this.A00.getClass();
        HashSet hashSet = this.A05;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(r4);
        if (isEmpty) {
            if (this instanceof AnonymousClass6PJ) {
                Iterator A10 = C18290x4.A10(((AnonymousClass6PJ) this).A02);
                while (A10.hasNext()) {
                    C148627Jc r0 = (C148627Jc) A10.next();
                    r0.A01.B2M(r0.A00);
                }
            }
        }
    }

    public final void Biy(C180718lW r2) {
        ArrayList arrayList = this.A04;
        arrayList.remove(r2);
        if (arrayList.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A05.clear();
            A00();
            return;
        }
        B1g(r2);
    }

    public final void BjA(AnonymousClass4F1 r5) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A03.A02;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass7G4 r1 = (AnonymousClass7G4) it.next();
            if (r1.A01 == r5) {
                copyOnWriteArrayList.remove(r1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == r2) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BhQ(X.C180718lW r4, X.C178288hI r5) {
        /*
            r3 = this;
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Looper r1 = r3.A00
            if (r1 == 0) goto L_0x000b
            r0 = 0
            if (r1 != r2) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            X.C161487pm.A03(r0)
            com.google.android.exoplayer2.Timeline r1 = r3.A01
            java.util.ArrayList r0 = r3.A04
            r0.add(r4)
            android.os.Looper r0 = r3.A00
            if (r0 != 0) goto L_0x0025
            r3.A00 = r2
            java.util.HashSet r0 = r3.A05
            r0.add(r4)
            r3.A02(r5)
        L_0x0024:
            return
        L_0x0025:
            if (r1 == 0) goto L_0x0024
            r3.B2M(r4)
            r4.Bbq(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1690587u.BhQ(X.8lW, X.8hI):void");
    }
}
