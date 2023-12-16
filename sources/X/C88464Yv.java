package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.components.SegmentedProgressBar;
import com.whatsapp.storage.SizeTickerView;

/* renamed from: X.4Yv  reason: invalid class name and case insensitive filesystem */
public class C88464Yv extends C05570Ua {
    public long A00;
    public long A01;
    public AnimatorSet A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final View A07;
    public final C55682qk A08;
    public final WaImageView A09;
    public final WaTextView A0A;
    public final WaTextView A0B;
    public final WaTextView A0C;
    public final WaTextView A0D;
    public final SegmentedProgressBar A0E;
    public final C620733j A0F;
    public final SizeTickerView A0G;
    public final SizeTickerView A0H;
    public final int[] A0I;

    public C88464Yv(View view, C55682qk r11, C620733j r12) {
        super(view);
        this.A08 = r11;
        this.A0F = r12;
        SizeTickerView sizeTickerView = (SizeTickerView) C06560Yg.A02(view, R.id.used_space_text);
        this.A0H = sizeTickerView;
        View view2 = this.A0H;
        sizeTickerView.A0E(0, AnonymousClass5Yj.A03(view2.getContext(), view2.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved), false);
        this.A0D = AnonymousClass0x7.A0L(view, R.id.used_space_description_text);
        SizeTickerView sizeTickerView2 = (SizeTickerView) C06560Yg.A02(view, R.id.free_space_text);
        this.A0G = sizeTickerView2;
        sizeTickerView2.A0E(0, AnonymousClass0Y8.A04(view2.getContext(), R.color.f5nameremoved), false);
        this.A09 = AnonymousClass0x9.A0L(view, R.id.free_space_critical_icon);
        this.A0A = AnonymousClass0x7.A0L(view, R.id.free_space_description_text);
        this.A0E = (SegmentedProgressBar) C06560Yg.A02(view, R.id.progress_bar);
        this.A07 = C06560Yg.A02(view, R.id.progress_bar_legend_container);
        WaTextView A0L = AnonymousClass0x7.A0L(view, R.id.media_description_text);
        this.A0B = A0L;
        WaTextView A0L2 = AnonymousClass0x7.A0L(view, R.id.other_description_text);
        this.A0C = A0L2;
        Context context = view.getContext();
        int[] A1Z = C86664Kz.A1Z();
        this.A0I = A1Z;
        A1Z[0] = C18300x5.A03(context, R.attr.f3nameremoved, R.color.f5nameremoved);
        A1Z[1] = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
        this.A05 = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
        this.A04 = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
        this.A06 = C18300x5.A03(context, R.attr.f3nameremoved, R.color.f5nameremoved);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        Drawable A002 = AnonymousClass0RP.A00(context, R.drawable.storage_usage_green_circle);
        A002.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        A0L.setCompoundDrawables(A002, (Drawable) null, (Drawable) null, (Drawable) null);
        Drawable A003 = AnonymousClass0RP.A00(context, R.drawable.storage_usage_yellow_circle);
        A003.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        A0L2.setCompoundDrawables(A003, (Drawable) null, (Drawable) null, (Drawable) null);
    }
}
