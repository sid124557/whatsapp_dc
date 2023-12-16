package X;

import android.view.View;
import android.view.WindowId;

/* renamed from: X.0f3  reason: invalid class name and case insensitive filesystem */
public class C08780f3 implements C15250r2 {
    public final WindowId A00;

    public boolean equals(Object obj) {
        if (!(obj instanceof C08780f3) || !((C08780f3) obj).A00.equals(this.A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C08780f3(View view) {
        this.A00 = view.getWindowId();
    }
}
