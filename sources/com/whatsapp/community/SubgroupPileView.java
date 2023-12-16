package com.whatsapp.community;

import X.AnonymousClass0VX;
import X.AnonymousClass0x9;
import X.AnonymousClass3ZH;
import X.AnonymousClass5UX;
import X.AnonymousClass651;
import X.C100895Cr;
import X.C105365Uq;
import X.C107555bV;
import X.C112745kE;
import X.C131666dx;
import X.C620733j;
import X.C86624Kv;
import X.C86634Kw;
import X.C86654Ky;
import X.C86664Kz;
import X.C87374Qn;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;

@Deprecated
public class SubgroupPileView extends C87374Qn implements AnonymousClass651 {
    public ImageView A00;
    public ThumbnailButton A01;
    public AnonymousClass5UX A02;
    public C620733j A03;

    public View getTransitionView() {
        return this.A01;
    }

    public void setSubgroupProfilePhoto(AnonymousClass3ZH r4, int i, boolean z, C105365Uq r7) {
        int i2;
        r7.A05(this.A01, new C112745kE(this.A02, r4), r4, false);
        if (z) {
            i2 = R.drawable.vec_ic_subgroup_bottom_cresents_toolbar;
            if (i == 3) {
                i2 = R.drawable.vec_ic_subgroup_bottom_cresents_cag_toolbar;
            }
        } else {
            i2 = R.drawable.vec_ic_subgroup_bottom_cresents;
            if (i == 3) {
                i2 = R.drawable.vec_ic_subgroup_bottom_cresents_cag;
            }
        }
        setBottomCirclesDrawable(i2);
    }

    public SubgroupPileView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        setGravity(1);
        this.A01 = C86664Kz.A16(this, R.id.subgroup_pile_top_profile_photo);
        this.A00 = AnonymousClass0x9.A0E(this, R.id.subgroup_pile_bottom_cresents);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100895Cr.A09);
            int A05 = C86634Kw.A05(getResources(), obtainStyledAttributes, R.dimen.f6nameremoved, 0);
            obtainStyledAttributes.recycle();
            C86654Ky.A14(this.A00, -2, A05);
            C86624Kv.A0t(this.A01, A05);
        }
    }

    private void setBottomCirclesDrawable(int i) {
        Context context = getContext();
        C131666dx r0 = new C131666dx(AnonymousClass0VX.A01(context, i), this.A03);
        ImageView imageView = this.A00;
        imageView.setImageDrawable(r0);
        C107555bV.A03(imageView, 0, getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
    }

    public SubgroupPileView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SubgroupPileView(Context context) {
        this(context, (AttributeSet) null);
    }
}
