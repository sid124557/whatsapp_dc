package X;

import android.view.View;
import com.whatsapp.mediaview.MediaViewFragment;

/* renamed from: X.7zU  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C166927zU implements View.OnSystemUiVisibilityChangeListener {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ AnonymousClass5YG A01;

    public final void onSystemUiVisibilityChange(int i) {
        MediaViewFragment mediaViewFragment = this.A00;
        if (this.A01.A0e()) {
            mediaViewFragment.A1W(AnonymousClass000.A1T(i & 4), false);
        }
    }

    public /* synthetic */ C166927zU(MediaViewFragment mediaViewFragment, AnonymousClass5YG r2) {
        this.A00 = mediaViewFragment;
        this.A01 = r2;
    }
}
