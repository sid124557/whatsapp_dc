package X;

import com.whatsapp.util.Log;
import java.io.PrintStream;

/* renamed from: X.7eH  reason: invalid class name and case insensitive filesystem */
public class C155097eH {
    public static C151477Uy A00 = new C136256mN();

    public static void A00(C141976wR r4, String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        C151477Uy r1 = A00;
        String obj = stackTrace[2].toString();
        if (r1 instanceof C136266mO) {
            switch (r4.ordinal()) {
                case 1:
                    Log.d(C18260x0.A06(obj, " :", str));
                    return;
                case 2:
                    C18260x0.A0s(" :", str, AnonymousClass000.A0l(obj));
                    return;
                case 3:
                    Log.w(C18260x0.A06(obj, " :", str));
                    return;
                default:
                    C18260x0.A0r(" :", str, AnonymousClass000.A0l(obj));
                    return;
            }
        } else {
            PrintStream printStream = System.err;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(r4);
            A0o.append(": ");
            A0o.append(obj);
            printStream.println(AnonymousClass000.A0V(" : ", str, A0o));
        }
    }
}
