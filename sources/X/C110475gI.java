package X;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.whatsapp.R;
import com.whatsapp.registration.EULA;

/* renamed from: X.5gI  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C110475gI implements C15870s6 {
    public final /* synthetic */ EULA A00;

    public final void Bat(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        View findViewById = this.A00.findViewById(R.id.fade_view);
        if (findViewById != null) {
            int i5 = 8;
            if (i2 > 0) {
                i5 = 0;
            }
            findViewById.setVisibility(i5);
        }
    }

    public /* synthetic */ C110475gI(EULA eula) {
        this.A00 = eula;
    }
}
