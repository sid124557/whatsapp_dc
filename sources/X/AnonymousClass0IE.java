package X;

import android.view.WindowInsets;

/* renamed from: X.0IE  reason: invalid class name */
public final class AnonymousClass0IE {
    public static int A00(int i) {
        int statusBars;
        int i2 = 0;
        int i3 = 1;
        do {
            if ((i & i3) != 0) {
                if (i3 == 1) {
                    statusBars = WindowInsets.Type.statusBars();
                } else if (i3 == 2) {
                    statusBars = WindowInsets.Type.navigationBars();
                } else if (i3 == 4) {
                    statusBars = WindowInsets.Type.captionBar();
                } else if (i3 == 8) {
                    statusBars = WindowInsets.Type.ime();
                } else if (i3 == 16) {
                    statusBars = WindowInsets.Type.systemGestures();
                } else if (i3 == 32) {
                    statusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i3 == 64) {
                    statusBars = WindowInsets.Type.tappableElement();
                } else if (i3 == 128) {
                    statusBars = WindowInsets.Type.displayCutout();
                }
                i2 |= statusBars;
            }
            i3 <<= 1;
        } while (i3 <= 256);
        return i2;
    }
}
