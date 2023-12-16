package X;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: X.7eq  reason: invalid class name and case insensitive filesystem */
public final class C155417eq {
    public static final SimpleDateFormat A00;
    public static final SimpleDateFormat A01;

    static {
        Locale locale = Locale.US;
        A00 = new SimpleDateFormat("MMM dd", locale);
        A01 = new SimpleDateFormat("hh:mm a", locale);
    }
}
