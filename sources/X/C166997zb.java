package X;

import android.view.ViewTreeObserver;
import com.whatsapp.util.Log;

/* renamed from: X.7zb  reason: invalid class name and case insensitive filesystem */
public class C166997zb implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ViewTreeObserver A00;
    public final /* synthetic */ AnonymousClass560 A01;
    public final /* synthetic */ boolean A02;

    public C166997zb(ViewTreeObserver viewTreeObserver, AnonymousClass560 r2, boolean z) {
        this.A01 = r2;
        this.A00 = viewTreeObserver;
        this.A02 = z;
    }

    public void onGlobalLayout() {
        Log.d("DraggableChildContainer/setOneTimeLayoutListener onGlobalLayout Called");
        this.A00.removeOnGlobalLayoutListener(this);
        AnonymousClass560 r1 = this.A01;
        r1.A06();
        r1.A0B(this.A02);
    }
}
