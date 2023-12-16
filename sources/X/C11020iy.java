package X;

import androidx.preference.PreferenceGroup;

/* renamed from: X.0iy  reason: invalid class name and case insensitive filesystem */
public class C11020iy implements Runnable {
    public final /* synthetic */ PreferenceGroup A00;

    public void run() {
        synchronized (this) {
            this.A00.A06.clear();
        }
    }

    public C11020iy(PreferenceGroup preferenceGroup) {
        this.A00 = preferenceGroup;
    }
}
