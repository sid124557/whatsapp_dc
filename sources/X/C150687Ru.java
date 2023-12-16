package X;

import android.os.SystemClock;

/* renamed from: X.7Ru  reason: invalid class name and case insensitive filesystem */
public final class C150687Ru {
    public long A00;
    public Exception A01;

    public void A00(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Exception exc2 = this.A01;
        if (exc2 == null) {
            this.A01 = exc;
            exc2 = exc;
            this.A00 = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.A00) {
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.A01;
            this.A01 = null;
            throw exc3;
        }
    }
}
