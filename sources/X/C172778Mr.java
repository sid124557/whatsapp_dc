package X;

import android.os.Process;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;

/* renamed from: X.8Mr  reason: invalid class name and case insensitive filesystem */
public class C172778Mr implements Thread.UncaughtExceptionHandler {
    public void uncaughtException(Thread thread, Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("************ LOCATION OF ERROR ************\n\n");
        A0o.append("NPCI Common Library");
        A0o.append("\n");
        C18270x1.A1H(A0o, "\n************ CAUSE OF ERROR ************\n\n", stringWriter);
        A0o.append("\n");
        Log.e("Exception!!!", A0o.toString());
        Process.killProcess(Process.myPid());
    }
}
