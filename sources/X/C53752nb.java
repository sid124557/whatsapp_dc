package X;

import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.2nb  reason: invalid class name and case insensitive filesystem */
public class C53752nb {
    public final C146907Cb A00;
    public final LinkedList A01 = AnonymousClass0x9.A18();
    public final Map A02;
    public final Set A03 = AnonymousClass002.A0K();
    public final SynchronousQueue A04 = new SynchronousQueue();
    public final C73203f6 A05;
    public final boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int A00(java.lang.String r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L_0x0016
            java.util.Map r0 = r1.A02     // Catch:{ all -> 0x0013 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0013 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0016
            int r0 = r0.intValue()     // Catch:{ all -> 0x0013 }
            monitor-exit(r1)
            return r0
        L_0x0013:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0016:
            monitor-exit(r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53752nb.A00(java.lang.String):int");
    }

    public synchronized void A02(Job job) {
        this.A01.addFirst(job);
        A01(job);
        this.A05.A00.open();
    }

    public final void A01(Job job) {
        String str = job.parameters.groupId;
        if (str != null) {
            C18280x3.A1D(str, this.A02, A00(str) + 1);
        }
    }

    public C53752nb(C146907Cb r3, boolean z) {
        C73203f6 r1 = new C73203f6(this);
        this.A05 = r1;
        this.A02 = AnonymousClass001.A0t();
        this.A06 = z;
        this.A00 = r3;
        r1.start();
    }
}
