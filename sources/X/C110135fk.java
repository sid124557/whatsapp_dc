package X;

import android.view.ViewTreeObserver;
import com.whatsapp.wds.components.search.WDSSearchView;

/* renamed from: X.5fk  reason: invalid class name and case insensitive filesystem */
public final class C110135fk implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ WDSSearchView A00;
    public final /* synthetic */ AnonymousClass4GP A01;

    public C110135fk(WDSSearchView wDSSearchView, AnonymousClass4GP r2) {
        this.A00 = wDSSearchView;
        this.A01 = r2;
    }

    public void onWindowFocusChanged(boolean z) {
        if (z) {
            WDSSearchView wDSSearchView = this.A00;
            C117695sL.A01(wDSSearchView, this.A01, 11);
            wDSSearchView.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
    }
}
