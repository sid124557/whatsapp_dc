package X;

import android.content.Context;
import android.widget.PopupWindow;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.5Ji  reason: invalid class name and case insensitive filesystem */
public final class C102565Ji {
    public final Context A00;
    public final PopupWindow A01;
    public final WaTextView A02;
    public final C620633i A03;
    public final C620733j A04;

    public C102565Ji(Context context, C620633i r7, C620733j r8) {
        this.A00 = context;
        this.A03 = r7;
        this.A04 = r8;
        WaTextView waTextView = new WaTextView(context);
        C86624Kv.A0v(waTextView, -2);
        C18320x8.A11(C18290x4.A0G(waTextView), waTextView, R.color.f5nameremoved);
        this.A02 = waTextView;
        this.A01 = new PopupWindow(waTextView, -2, -2, true);
    }
}
