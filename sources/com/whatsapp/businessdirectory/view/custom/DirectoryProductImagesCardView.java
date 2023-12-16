package com.whatsapp.businessdirectory.view.custom;

import X.AnonymousClass0x9;
import X.AnonymousClass43R;
import X.AnonymousClass4C5;
import X.C13760nh;
import X.C162457s7;
import X.C378924l;
import X.C829345m;
import X.C86624Kv;
import X.C86634Kw;
import X.C86654Ky;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import java.util.Iterator;

public final class DirectoryProductImagesCardView extends CardView {
    public ShimmerFrameLayout A00;
    public final LinearLayout A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DirectoryProductImagesCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        C86624Kv.A10(linearLayout, -1, linearLayout.getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        this.A01 = linearLayout;
        addView(linearLayout);
        setPreventCornerOverlap(false);
        setRadius(getResources().getDimension(R.dimen.f6nameremoved));
        setCardElevation(0.0f);
        setCardBackgroundColor(0);
    }

    public final boolean A00() {
        LinearLayout linearLayout = this.A01;
        C162457s7.A0J(linearLayout, 0);
        AnonymousClass4C5 A04 = C829345m.A04(new AnonymousClass43R(), new C13760nh(linearLayout));
        C162457s7.A0K(A04, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        Iterator it = A04.iterator();
        while (it.hasNext()) {
            if (AnonymousClass0x9.A0F(C86654Ky.A0H(it), R.id.product_image_view).getDrawable() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean A01() {
        LinearLayout linearLayout = this.A01;
        C162457s7.A0J(linearLayout, 0);
        AnonymousClass4C5 A04 = C829345m.A04(new AnonymousClass43R(), new C13760nh(linearLayout));
        C162457s7.A0K(A04, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        Iterator it = A04.iterator();
        while (it.hasNext()) {
            if (AnonymousClass0x9.A0F(C86654Ky.A0H(it), R.id.product_empty_view).getDrawable().isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final LinearLayout getImagesContainerView() {
        return this.A01;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DirectoryProductImagesCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    public /* synthetic */ DirectoryProductImagesCardView(Context context, AttributeSet attributeSet, int i, int i2, C378924l r7) {
        this(context, C86624Kv.A09(attributeSet, i2), C86634Kw.A02(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DirectoryProductImagesCardView(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
