package X;

import java.io.PrintStream;

/* renamed from: X.76y  reason: invalid class name and case insensitive filesystem */
public final class C1457076y {
    public static final C150357Qh A00;

    static {
        C150357Qh r0;
        try {
            Integer num = (Integer) AnonymousClass6C9.A0a();
            if (num != null) {
                if (num.intValue() >= 19) {
                    r0 = new C128476Wf();
                    A00 = r0;
                }
            }
        } catch (Exception e) {
            PrintStream printStream = System.err;
            printStream.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(printStream);
        } catch (Throwable th) {
            PrintStream printStream2 = System.err;
            String name = C128466We.class.getName();
            StringBuilder A0Y = AnonymousClass6CA.A0Y(name.length() + 133);
            A0Y.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            A0Y.append(name);
            printStream2.println(AnonymousClass000.A0X("will be used. The error is: ", A0Y));
            th.printStackTrace(printStream2);
            r0 = new C128466We();
        }
        if (!Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
            r0 = new C128486Wg();
        } else {
            r0 = new C128466We();
        }
        A00 = r0;
    }
}
