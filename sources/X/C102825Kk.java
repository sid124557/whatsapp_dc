package X;

import android.content.Context;
import android.content.res.Resources;
import android.widget.PopupWindow;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.mediacomposer.bottombar.recipients.RecipientsView;

/* renamed from: X.5Kk  reason: invalid class name and case insensitive filesystem */
public final class C102825Kk {
    public boolean A00;
    public final int A01;
    public final Context A02;
    public final PopupWindow A03;
    public final WaTextView A04;
    public final C620733j A05;
    public final RecipientsView A06;
    public final int[] A07 = new int[2];

    public C102825Kk(Context context, C620733j r7, RecipientsView recipientsView) {
        C162457s7.A0J(r7, 2);
        this.A02 = context;
        this.A05 = r7;
        this.A06 = recipientsView;
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.f6nameremoved);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.f6nameremoved);
        WaTextView waTextView = new WaTextView(context);
        this.A04 = waTextView;
        AnonymousClass0x2.A0q(context, waTextView, R.color.f5nameremoved);
        C106905aM.A04(waTextView);
        waTextView.setPadding(dimensionPixelOffset2, dimensionPixelOffset * 2, dimensionPixelOffset2, dimensionPixelOffset);
        this.A01 = dimensionPixelOffset;
        PopupWindow popupWindow = new PopupWindow(waTextView, -2, -2, false);
        this.A03 = popupWindow;
        popupWindow.setFocusable(true);
    }
}
