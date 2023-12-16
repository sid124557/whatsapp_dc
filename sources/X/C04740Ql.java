package X;

import android.content.Context;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: X.0Ql  reason: invalid class name and case insensitive filesystem */
public abstract class C04740Ql {
    public Context A00;
    public C15130qp A01;
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04 = false;
    public boolean A05 = true;
    public boolean A06 = false;

    public void A00() {
        AnonymousClass08c r5 = (AnonymousClass08c) this;
        if (r5.A02 != null) {
            if (!r5.A06) {
                r5.A03 = true;
            }
            if (r5.A01 == null) {
                C13330n0 r2 = r5.A02;
                r2.A03.set(true);
                if (r2.A02.cancel(false)) {
                    r5.A01 = r5.A02;
                    r5.A07();
                }
            }
            r5.A02 = null;
        }
    }

    public abstract void A03();

    public void A01() {
    }

    public void A02() {
    }

    public void A04(Object obj) {
        C15130qp r2 = this.A01;
        if (r2 != null) {
            C06270Wx r22 = (C06270Wx) r2;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                r22.A0H(obj);
            } else {
                r22.A0G(obj);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        AnonymousClass0I1.A00(this, sb);
        sb.append(" id=");
        sb.append(0);
        return AnonymousClass000.A0g(sb);
    }

    public C04740Ql(Context context) {
        this.A00 = context.getApplicationContext();
    }

    @Deprecated
    public void A05(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(0);
        printWriter.print(" mListener=");
        printWriter.println(this.A01);
        if (this.A06 || this.A03 || this.A04) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.A06);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.A03);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.A04);
        }
        if (this.A02 || this.A05) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.A02);
            printWriter.print(" mReset=");
            printWriter.println(this.A05);
        }
    }
}
