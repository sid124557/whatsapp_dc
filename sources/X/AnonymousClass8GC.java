package X;

import android.icu.text.DisplayContext;
import android.icu.text.SimpleDateFormat;
import java.text.Format;

/* renamed from: X.8GC  reason: invalid class name */
public class AnonymousClass8GC implements C182348oG {
    public Format B7o(C620733j r4) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLLL yyyy", C620733j.A02(r4));
        simpleDateFormat.setContext(DisplayContext.CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE);
        return simpleDateFormat;
    }
}
