package X;

import android.view.accessibility.AccessibilityManager;

/* renamed from: X.0ad  reason: invalid class name and case insensitive filesystem */
public final class C07290ad implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final C15850s3 A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07290ad)) {
            return false;
        }
        return this.A00.equals(((C07290ad) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public void onTouchExplorationStateChanged(boolean z) {
        this.A00.onTouchExplorationStateChanged(z);
    }

    public C07290ad(C15850s3 r1) {
        this.A00 = r1;
    }
}
