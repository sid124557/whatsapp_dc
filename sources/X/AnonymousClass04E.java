package X;

import android.view.Menu;
import android.view.View;
import android.view.Window;

/* renamed from: X.04E  reason: invalid class name */
public class AnonymousClass04E extends C07280ac {
    public final /* synthetic */ AnonymousClass03y A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass04E(Window.Callback callback, AnonymousClass03y r2) {
        super(callback);
        this.A00 = r2;
    }

    public View onCreatePanelView(int i) {
        if (i == 0) {
            return new View(((C07580bG) this.A00.A01).A09.getContext());
        }
        return super.onCreatePanelView(i);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (onPreparePanel) {
            AnonymousClass03y r2 = this.A00;
            if (!r2.A05) {
                ((C07580bG) r2.A01).A0D = true;
                r2.A05 = true;
            }
        }
        return onPreparePanel;
    }
}
