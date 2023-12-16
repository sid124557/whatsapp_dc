package X;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: X.0iO  reason: invalid class name and case insensitive filesystem */
public class C10710iO implements Runnable {
    public final /* synthetic */ ActionBarOverlayLayout A00;

    public C10710iO(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.A00 = actionBarOverlayLayout;
    }

    public void run() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.A00;
        actionBarOverlayLayout.A00();
        actionBarOverlayLayout.A05 = actionBarOverlayLayout.A07.animate().translationY((float) (-actionBarOverlayLayout.A07.getHeight())).setListener(actionBarOverlayLayout.A0K);
    }
}
