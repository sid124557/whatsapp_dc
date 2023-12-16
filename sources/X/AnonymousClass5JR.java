package X;

import android.os.SystemClock;
import android.view.View;
import java.util.List;

/* renamed from: X.5JR  reason: invalid class name */
public class AnonymousClass5JR {
    public long A00 = SystemClock.elapsedRealtime();
    public boolean A01 = false;
    public final AnonymousClass8s5 A02 = new AnonymousClass6AI(this, 1);
    public final List A03 = AnonymousClass001.A0s();

    public AnonymousClass5JR(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass6AN(view, 2, this));
    }
}
