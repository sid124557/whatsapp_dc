package X;

import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.0iY  reason: invalid class name and case insensitive filesystem */
public class C10810iY implements Runnable {
    public final /* synthetic */ Toolbar A00;

    public C10810iY(Toolbar toolbar) {
        this.A00 = toolbar;
    }

    public void run() {
        C07530bB r0;
        ActionMenuView actionMenuView = this.A00.A0O;
        if (actionMenuView != null && (r0 = actionMenuView.A08) != null) {
            r0.A03();
        }
    }
}
