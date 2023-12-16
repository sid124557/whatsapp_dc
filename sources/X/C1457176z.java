package X;

import java.io.PrintStream;

/* renamed from: X.76z  reason: invalid class name and case insensitive filesystem */
public final class C1457176z {
    public static final C150367Qi A00;

    static {
        C150367Qi r0;
        try {
            Integer num = (Integer) AnonymousClass6C9.A0a();
            if (num != null) {
                if (num.intValue() >= 19) {
                    r0 = new AnonymousClass6XR();
                    A00 = r0;
                }
            }
        } catch (Exception e) {
            PrintStream printStream = System.err;
            printStream.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(printStream);
        } catch (Throwable th) {
            PrintStream printStream2 = System.err;
            String name = AnonymousClass6XQ.class.getName();
            StringBuilder A0Y = AnonymousClass6CA.A0Y(name.length() + 133);
            A0Y.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            A0Y.append(name);
            printStream2.println(AnonymousClass000.A0X("will be used. The error is: ", A0Y));
            th.printStackTrace(printStream2);
            r0 = new AnonymousClass6XQ();
        }
        if (!Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
            r0 = new AnonymousClass6XS();
        } else {
            r0 = new AnonymousClass6XQ();
        }
        A00 = r0;
    }
}
