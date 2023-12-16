package androidx.activity;

import X.AnonymousClass0GH;
import X.C004805c;
import X.C15910sA;
import X.C17280vG;
import android.view.View;
import android.view.Window;

public class ComponentActivity$3 implements C17280vG {
    public final /* synthetic */ C004805c A00;

    public ComponentActivity$3(C004805c r1) {
        this.A00 = r1;
    }

    public void BcK(AnonymousClass0GH r2, C15910sA r3) {
        Window window;
        View peekDecorView;
        if (r2 == AnonymousClass0GH.ON_STOP && (window = this.A00.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
            peekDecorView.cancelPendingInputEvents();
        }
    }
}
