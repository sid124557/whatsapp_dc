package X;

import android.util.Log;

/* renamed from: X.82N  reason: invalid class name */
public class AnonymousClass82N implements C180358ku {
    public final /* synthetic */ AnonymousClass7AS A00;
    public final /* synthetic */ AnonymousClass71N A01;

    public AnonymousClass82N(AnonymousClass7AS r1, AnonymousClass71N r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void Bjg(C158097jQ r4, Throwable th) {
        String str;
        String stackTraceString;
        Object A002 = r4.A00();
        if (A002 != null) {
            str = AnonymousClass000.A0O(A002);
        } else {
            str = "<value is null>";
        }
        Object[] objArr = new Object[4];
        AnonymousClass000.A1L(objArr, System.identityHashCode(this));
        AnonymousClass000.A1M(objArr, System.identityHashCode(r4));
        objArr[2] = str;
        if (th == null) {
            stackTraceString = "";
        } else {
            stackTraceString = Log.getStackTraceString(th);
        }
        objArr[3] = stackTraceString;
        C161577py.A04("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", objArr);
    }
}
