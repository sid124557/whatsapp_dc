package X;

import android.util.Log;

/* renamed from: X.82J  reason: invalid class name */
public class AnonymousClass82J implements C186438vJ {
    public static final AnonymousClass82J A00 = new AnonymousClass82J();

    public void B1C(String str, String str2) {
        A00(3, str, str2);
    }

    public void B1D(String str, String str2, Throwable th) {
        A01(str, str2, th, 3);
    }

    public void B2F(String str, String str2) {
        A00(6, str, str2);
    }

    public void B2G(String str, String str2, Throwable th) {
        A01(str, str2, th, 6);
    }

    public void BFi(String str, String str2) {
        A00(4, str, str2);
    }

    public boolean BI0(int i) {
        return AnonymousClass6C8.A1P(5, i);
    }

    public void BsD(String str, String str2) {
        A00(2, str, str2);
    }

    public void BsJ(String str, String str2) {
        A00(5, str, str2);
    }

    public void BsK(String str, String str2, Throwable th) {
        A01(str, str2, th, 5);
    }

    public void Bsm(String str, String str2) {
        A00(6, str, str2);
    }

    public void Bsn(String str, String str2, Throwable th) {
        A01(str, str2, th, 6);
    }

    public final void A00(int i, String str, String str2) {
        Log.println(i, AnonymousClass000.A0V(":", str, AnonymousClass000.A0l("unknown")), str2);
    }

    public final void A01(String str, String str2, Throwable th, int i) {
        String stackTraceString;
        String A0V = AnonymousClass000.A0V(":", str, AnonymousClass000.A0l("unknown"));
        StringBuilder A0l = AnonymousClass000.A0l(str2);
        A0l.append(10);
        if (th == null) {
            stackTraceString = "";
        } else {
            stackTraceString = Log.getStackTraceString(th);
        }
        Log.println(i, A0V, AnonymousClass000.A0X(stackTraceString, A0l));
    }

    public int B9n() {
        return 5;
    }
}
