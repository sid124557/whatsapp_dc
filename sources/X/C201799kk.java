package X;

import android.os.Looper;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.9kk  reason: invalid class name and case insensitive filesystem */
public class C201799kk extends FutureTask {
    public final String A00;
    public final ArrayList A01 = AnonymousClass001.A0s();
    public final UUID A02;
    public volatile boolean A03;
    public final /* synthetic */ C194959Vh A04;

    public synchronized void A00(AnonymousClass9SG r7) {
        C194959Vh r3;
        UUID uuid;
        C201199jg r1;
        if (isDone()) {
            try {
                Object obj = get();
                this.A04.A05(new C201199jg(r7, (Exception) null, obj, true), this.A02);
            } catch (CancellationException e) {
                r3 = this.A04;
                uuid = this.A02;
                r1 = new C201199jg(r7, e, (Object) null, false);
                r3.A05(r1, uuid);
            } catch (InterruptedException | ExecutionException e2) {
                r3 = this.A04;
                uuid = this.A02;
                r1 = new C201199jg(r7, e2, (Object) null, false);
                r3.A05(r1, uuid);
            }
        } else {
            this.A01.add(r7);
        }
    }

    public void done() {
        C194959Vh r3;
        UUID uuid;
        C201209jh r1;
        super.done();
        synchronized (this) {
            ArrayList arrayList = this.A01;
            ArrayList A0J = AnonymousClass002.A0J(arrayList);
            arrayList.clear();
            try {
                Object obj = get();
                Iterator it = A0J.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                this.A04.A05(new C201209jh((Exception) null, obj, A0J, true), this.A02);
            } catch (CancellationException e) {
                r3 = this.A04;
                uuid = this.A02;
                r1 = new C201209jh(e, (Object) null, A0J, false);
                r3.A05(r1, uuid);
            } catch (InterruptedException | ExecutionException e2) {
                if (A0J.isEmpty()) {
                    Looper looper = this.A04.A04.getLooper();
                    looper.getClass();
                    if (looper.getThread() != Thread.currentThread()) {
                        AnonymousClass9WT.A00();
                    }
                } else {
                    Iterator it2 = A0J.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                    r3 = this.A04;
                    uuid = this.A02;
                    r1 = new C201209jh(e2, (Object) null, A0J, false);
                    r3.A05(r1, uuid);
                }
            }
        }
        synchronized (this) {
            Trace.endSection();
        }
    }

    public void run() {
        synchronized (this) {
            Trace.beginSection(this.A00);
        }
        super.run();
    }

    public boolean runAndReset() {
        synchronized (this) {
            Trace.beginSection(this.A00);
        }
        return super.runAndReset();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C201799kk(C194959Vh r3, String str, UUID uuid, Callable callable) {
        super(callable);
        this.A04 = r3;
        C04890Rb.A01(uuid, AnonymousClass000.A0V("SessionId is null! Attempting to schedule task: ", str, AnonymousClass001.A0o()));
        this.A02 = uuid;
        C04890Rb.A01(str, "OpticFutureTask cannot have a null name.");
        this.A00 = str;
    }
}
