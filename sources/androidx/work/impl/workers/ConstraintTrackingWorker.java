package androidx.work.impl.workers;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0BT;
import X.AnonymousClass0QH;
import X.AnonymousClass0VM;
import X.AnonymousClass0l2;
import X.C01390An;
import X.C01400Ao;
import X.C05500Tp;
import X.C06240Wu;
import X.C06250Wv;
import X.C06310Xb;
import X.C09080fc;
import X.C11170jD;
import X.C159507lx;
import X.C162457s7;
import X.C16740tt;
import X.C17060uV;
import X.C188268yc;
import android.content.Context;
import android.util.Log;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.UUID;

public final class ConstraintTrackingWorker extends AnonymousClass0QH implements C16740tt {
    public AnonymousClass0QH A00;
    public final WorkerParameters A01;
    public final AnonymousClass0BT A02 = AnonymousClass0BT.A00();
    public final Object A03 = AnonymousClass002.A0D();
    public volatile boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C162457s7.A0J(context, 1);
        C162457s7.A0J(workerParameters, 2);
        this.A01 = workerParameters;
    }

    public static final void A00(ConstraintTrackingWorker constraintTrackingWorker, C188268yc r3) {
        synchronized (constraintTrackingWorker.A03) {
            if (constraintTrackingWorker.A04) {
                constraintTrackingWorker.A02.A09(new C01390An());
            } else {
                constraintTrackingWorker.A02.A08(r3);
            }
        }
    }

    public C188268yc A09() {
        this.A01.A09.execute(new C11170jD(this));
        return this.A02;
    }

    public void A0A() {
        AnonymousClass0QH r1 = this.A00;
        if (r1 != null && !r1.A03) {
            r1.A03 = true;
            r1.A0A();
        }
    }

    public final void A0B() {
        AnonymousClass0BT r6 = this.A02;
        if (!r6.isCancelled()) {
            WorkerParameters workerParameters = this.A01;
            String A032 = workerParameters.A01.A03("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            C06240Wu A002 = C06240Wu.A00();
            C162457s7.A0D(A002);
            if (A032 == null || A032.length() == 0) {
                Log.e(AnonymousClass0VM.A00, "No worker to delegate to.");
            } else {
                C05500Tp r2 = workerParameters.A04;
                Context context = this.A00;
                AnonymousClass0QH A003 = r2.A00(context, this.A01, A032);
                this.A00 = A003;
                if (A003 == null) {
                    A002.A04(AnonymousClass0VM.A00, "No worker to delegate to.");
                } else {
                    C06310Xb A012 = C06310Xb.A01(context);
                    C162457s7.A0D(A012);
                    C17060uV A0J = A012.A04.A0J();
                    UUID uuid = workerParameters.A08;
                    String obj = uuid.toString();
                    C162457s7.A0D(obj);
                    C06250Wv BEX = A0J.BEX(obj);
                    if (BEX != null) {
                        C09080fc r1 = new C09080fc(this, A012.A09);
                        r1.BjY(C159507lx.A0g(BEX));
                        String obj2 = uuid.toString();
                        C162457s7.A0D(obj2);
                        boolean A004 = r1.A00(obj2);
                        String str = AnonymousClass0VM.A00;
                        StringBuilder A0o = AnonymousClass001.A0o();
                        if (A004) {
                            A0o.append("Constraints met for delegate ");
                            C06240Wu.A03(A002, A032, str, A0o);
                            try {
                                AnonymousClass0QH r0 = this.A00;
                                C162457s7.A0H(r0);
                                C188268yc A09 = r0.A09();
                                C162457s7.A0D(A09);
                                A09.AwV(new AnonymousClass0l2(this, A09), workerParameters.A09);
                                return;
                            } catch (Throwable th) {
                                StringBuilder A0o2 = AnonymousClass001.A0o();
                                A0o2.append("Delegated worker ");
                                A0o2.append(A032);
                                String A0X = AnonymousClass000.A0X(" threw exception in startWork.", A0o2);
                                if (A002.A00 <= 3) {
                                    Log.d(str, A0X, th);
                                }
                                synchronized (this.A03) {
                                    if (this.A04) {
                                        A002.A04(str, "Constraints were unmet, Retrying.");
                                        r6.A09(new C01390An());
                                    } else {
                                        r6.A09(new C01400Ao());
                                    }
                                    return;
                                }
                            }
                        } else {
                            A0o.append("Constraints not met for delegate ");
                            A0o.append(A032);
                            C06240Wu.A03(A002, ". Requesting retry.", str, A0o);
                            r6.A09(new C01390An());
                            return;
                        }
                    }
                }
            }
            r6.A09(new C01400Ao());
        }
    }

    public void BMM(List list) {
        C06240Wu.A02(C06240Wu.A00(), list, "Constraints changed for ", AnonymousClass0VM.A00, AnonymousClass001.A0o());
        synchronized (this.A03) {
            this.A04 = true;
        }
    }

    public void BML(List list) {
    }
}
