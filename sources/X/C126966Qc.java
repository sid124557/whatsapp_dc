package X;

import com.google.android.gms.tasks.TaskExecutors;

/* renamed from: X.6Qc  reason: invalid class name and case insensitive filesystem */
public class C126966Qc extends AnonymousClass89B {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C126966Qc(android.content.Context r5) {
        /*
            r4 = this;
            X.7Jm r3 = X.AnonymousClass79F.A02
            X.88z r2 = X.C186678vl.A00
            X.89a r1 = new X.89a
            r1.<init>()
            X.7S6 r0 = new X.7S6
            r0.<init>()
            r0.A01 = r1
            X.7gG r0 = r0.A00()
            r4.<init>(r5, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C126966Qc.<init>(android.content.Context):void");
    }

    public void A04(C155807fX r6) {
        String simpleName = C155807fX.class.getSimpleName();
        C162177rO.A03(r6, "Listener must not be null");
        C162177rO.A03(simpleName, "Listener type must not be null");
        C162177rO.A07(simpleName, "Listener type must not be empty");
        C151557Vg r1 = new C151557Vg(r6, simpleName);
        C163007t7 r0 = this.A07;
        C152017Xf r4 = new C152017Xf();
        AnonymousClass6C7.A10(r0.A06, new C148757Jp(this, new AnonymousClass6RE(r1, r4), r0.A0D.get()), 13);
        r4.A00.continueWith(TaskExecutors.MAIN_THREAD, new AnonymousClass8BC());
    }
}
