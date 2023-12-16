package X;

import android.content.Context;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* renamed from: X.08c  reason: invalid class name */
public abstract class AnonymousClass08c extends C04740Ql {
    public final Executor A00;
    public volatile C13330n0 A01;
    public volatile C13330n0 A02;

    public abstract Object A06();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass08c(Context context) {
        super(context);
        Executor executor = C13330n0.A09;
        this.A00 = executor;
    }

    public void A07() {
    }

    public void A08() {
        if (this.A01 == null && this.A02 != null) {
            C13330n0 r3 = this.A02;
            Executor executor = this.A00;
            if (r3.A05 != C02170Fd.PENDING) {
                int ordinal = r3.A05.ordinal();
                if (ordinal == 1) {
                    throw AnonymousClass001.A0e("Cannot execute task: the task is already running.");
                } else if (ordinal != 2) {
                    throw AnonymousClass001.A0e("We should never reach this state");
                } else {
                    throw AnonymousClass001.A0e("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
            } else {
                r3.A05 = C02170Fd.RUNNING;
                executor.execute(r3.A02);
            }
        }
    }

    @Deprecated
    public void A05(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.A05(str, fileDescriptor, printWriter, strArr);
        if (this.A02 != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.A02);
            printWriter.print(" waiting=");
            printWriter.println(false);
        }
        if (this.A01 != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.A01);
            printWriter.print(" waiting=");
            printWriter.println(false);
        }
    }

    public void A09() {
        A00();
        this.A02 = new C13330n0(this);
        A08();
    }

    public void A0A(C13330n0 r2, Object obj) {
        A0B(obj);
        if (this.A01 == r2) {
            if (this.A04) {
                if (this.A06) {
                    A09();
                } else {
                    this.A03 = true;
                }
            }
            SystemClock.uptimeMillis();
            this.A01 = null;
            A08();
        }
    }

    public void A0B(Object obj) {
    }
}
