package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.R;
import com.whatsapp.location.WaMapView;

/* renamed from: X.4Ic  reason: invalid class name and case insensitive filesystem */
public class C85914Ic implements ViewTreeObserver.OnPreDrawListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C85914Ic(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public boolean onPreDraw() {
        if (this.A02 != 0) {
            WaMapView waMapView = (WaMapView) this.A00;
            C626936e.A04(waMapView.A01);
            AnonymousClass0x7.A16(waMapView.A01, this);
            waMapView.A01.post(new C71533cG((Object) this, 22));
            return true;
        }
        View view = (View) this.A01;
        int height = view.getHeight();
        View findViewById = ((C009707r) this.A00).findViewById(R.id.faq_screen_content);
        findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), findViewById.getPaddingBottom() + height);
        AnonymousClass0x7.A16(view, this);
        return false;
    }
}
