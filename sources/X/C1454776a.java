package X;

import android.util.Log;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.76a  reason: invalid class name and case insensitive filesystem */
public class C1454776a {
    public static QuickPerformanceLogger A00;

    public static QuickPerformanceLogger A00() {
        QuickPerformanceLogger quickPerformanceLogger = A00;
        if (quickPerformanceLogger != null) {
            return quickPerformanceLogger;
        }
        if (Log.isLoggable("QPLProvider", 6)) {
            Log.e("QPLProvider", "QuickPerformanceLogger instance wasn't installed in provider, returning noop. Please call QuickPerformanceLoggerProvider.setQuickPerformanceLogger() before getting the instance.", AnonymousClass001.A0e("No QPL instance provided"));
        }
        return null;
    }
}
