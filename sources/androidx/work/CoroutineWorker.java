package androidx.work;

import X.AnonymousClass001;
import X.AnonymousClass0BT;
import X.AnonymousClass0QH;
import X.AnonymousClass20D;
import X.AnonymousClass349;
import X.AnonymousClass34M;
import X.AnonymousClass4C6;
import X.C09160fk;
import X.C10070hL;
import X.C11110j7;
import X.C162457s7;
import X.C188268yc;
import X.C616131n;
import X.C73853gB;
import X.C831246f;
import X.C84814Du;
import X.C85474Gj;
import X.C85494Gl;
import android.content.Context;
import java.util.concurrent.CancellationException;

public abstract class CoroutineWorker extends AnonymousClass0QH {
    public final AnonymousClass0BT A00;
    public final C73853gB A01;
    public final C831246f A02 = A05();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C162457s7.A0J(context, 1);
        C162457s7.A0J(workerParameters, 2);
        AnonymousClass0BT A002 = AnonymousClass0BT.A00();
        this.A00 = A002;
        A002.AwV(new C11110j7(this), ((C09160fk) this.A01.A06).A01);
        this.A01 = AnonymousClass34M.A00();
    }

    public static /* synthetic */ C831246f A05() {
        return new C831246f((C85474Gj) null);
    }

    public final C188268yc A08() {
        C831246f A05 = A05();
        AnonymousClass4C6 A022 = AnonymousClass349.A02(A0E().plus(A05));
        C10070hL r2 = new C10070hL(A05);
        C85474Gj unused = C616131n.A02((C85494Gl) null, new CoroutineWorker$getForegroundInfoAsync$1(this, r2, (C84814Du) null), A022, (AnonymousClass20D) null, 3);
        return r2;
    }

    public abstract Object A0D(C84814Du r1);

    public static final void A06(CoroutineWorker coroutineWorker) {
        if (coroutineWorker.A00.isCancelled()) {
            coroutineWorker.A02.AyX((CancellationException) null);
        }
    }

    public final void A0A() {
        this.A00.cancel(false);
    }

    public final AnonymousClass0BT A0B() {
        return this.A00;
    }

    public Object A0C(C84814Du r2) {
        throw AnonymousClass001.A0e("Not implemented");
    }

    public C73853gB A0E() {
        return this.A01;
    }

    public final C188268yc A09() {
        C85474Gj unused = C616131n.A02((C85494Gl) null, new CoroutineWorker$startWork$1(this, (C84814Du) null), AnonymousClass349.A02(A0E().plus(this.A02)), (AnonymousClass20D) null, 3);
        return this.A00;
    }
}
