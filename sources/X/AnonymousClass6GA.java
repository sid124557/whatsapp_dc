package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButtonGroup;
import com.whatsapp.wds.components.internal.header.WDSHeader;

/* renamed from: X.6GA  reason: invalid class name */
public final class AnonymousClass6GA extends ConstraintLayout implements C183528qB {
    public C140096t9 A00;
    public final View A01 = C18280x3.A0E(this, R.id.footer);
    public final ViewGroup A02 = ((ViewGroup) C18280x3.A0E(this, R.id.content_container));
    public final Button A03 = ((Button) C18280x3.A0E(this, R.id.primary_button));
    public final Button A04 = ((Button) C18280x3.A0E(this, R.id.secondary_button));
    public final NestedScrollView A05 = ((NestedScrollView) C18280x3.A0E(this, R.id.content_scroller));
    public final WaTextView A06 = C86604Kt.A0O(this, R.id.footnote);
    public final WaTextView A07 = C86604Kt.A0O(this, R.id.footnote_footer);
    public final WDSButtonGroup A08 = ((WDSButtonGroup) C18280x3.A0E(this, R.id.button_group));
    public final WDSHeader A09;
    public final AnonymousClass66R A0A;
    public final AnonymousClass66R A0B;

    public AnonymousClass6GA(Context context) {
        super(context, (AttributeSet) null);
        this.A0A = AnonymousClass8P7.A00(new C174938Wl(context));
        this.A0B = AnonymousClass8P7.A00(new C174958Wn(context));
        C86604Kt.A0z(context, this, R.color.f5nameremoved);
        View.inflate(context, R.layout.f8nameremoved, this);
        WDSHeader wDSHeader = (WDSHeader) C18280x3.A0E(this, R.id.header);
        this.A09 = wDSHeader;
        wDSHeader.setHeaderTextGravity(1);
        wDSHeader.setHeaderImageMarginEnabled(true);
    }

    public void setViewState(C140096t9 r5) {
        AnonymousClass75U r0;
        C162457s7.A0J(r5, 0);
        this.A09.setViewState(r5.A02);
        AnonymousClass75U r1 = r5.A04;
        C140096t9 r02 = this.A00;
        if (r02 != null) {
            r0 = r02.A04;
        } else {
            r0 = null;
        }
        if (!C162457s7.A0P(r1, r0)) {
            setContent(r1);
        }
        C141626vs r12 = r5.A03;
        WaTextView waTextView = this.A07;
        waTextView.setText((CharSequence) null);
        waTextView.setVisibility(8);
        WaTextView waTextView2 = this.A06;
        waTextView2.setText((CharSequence) null);
        waTextView2.setVisibility(8);
        int ordinal = r12.ordinal();
        if (ordinal == 0) {
            waTextView = waTextView2;
        } else if (ordinal != 1) {
            throw C73153f1.A00();
        }
        CharSequence charSequence = r5.A05;
        C106895aL.A02(waTextView, charSequence);
        waTextView.setText(charSequence);
        AnonymousClass7YW r3 = r5.A00;
        AnonymousClass7YW r2 = r5.A01;
        int i = 8;
        AnonymousClass75S.A00(this.A03, r3, 8);
        AnonymousClass75S.A00(this.A04, r2, 8);
        WDSButtonGroup wDSButtonGroup = this.A08;
        if (!(r3 == null && r2 == null)) {
            i = 0;
        }
        wDSButtonGroup.setVisibility(i);
        C106895aL.A03(new C174948Wm(this), this.A05);
        this.A00 = r5;
    }

    private final int getScrollableContentFooterColor() {
        return AnonymousClass0x2.A09(this.A0A);
    }

    private final int getUnscrollableContentFooterColor() {
        return AnonymousClass0x2.A09(this.A0B);
    }

    private final void setContent(AnonymousClass75U r6) {
        ViewGroup viewGroup = this.A02;
        C106895aL.A02(viewGroup, r6);
        if (r6 instanceof C140076t7) {
            viewGroup.removeAllViews();
            C18280x3.A0D(this).inflate(((C140076t7) r6).A00, viewGroup);
        } else if (r6 instanceof C140066t6) {
            viewGroup.removeAllViews();
            for (C152467Yz viewState : ((C140066t6) r6).A00) {
                AnonymousClass6G7 r0 = new AnonymousClass6G7(C18290x4.A0F(this));
                r0.setViewState(viewState);
                viewGroup.addView(r0);
            }
        } else if (r6 == null) {
            viewGroup.removeAllViews();
        }
    }
}
