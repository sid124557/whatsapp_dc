package com.whatsapp.biz.catalog.view;

import X.AnonymousClass0YZ;
import X.AnonymousClass4SX;
import X.AnonymousClass7MZ;
import X.AnonymousClass90T;
import X.AnonymousClass93V;
import X.C06560Yg;
import X.C107555bV;
import X.C111685iW;
import X.C125136Fr;
import X.C148107Gy;
import X.C18280x3;
import X.C18320x8;
import X.C43072Qq;
import X.C620733j;
import X.C86604Kt;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import X.C88864av;
import X.C90544hh;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.whatsapp.InfoCard;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.Iterator;
import java.util.List;

public class CategoryMediaCard extends InfoCard {
    public HorizontalScrollView A00;
    public LinearLayout A01;
    public C620733j A02;
    public boolean A03;

    public void A01() {
        if (!this.A03) {
            this.A03 = true;
            this.A02 = C88864av.A02((C111685iW) generatedComponent());
        }
    }

    public void setError(String str) {
        this.A01.setVisibility(8);
    }

    public CategoryMediaCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        C18280x3.A0D(this).inflate(R.layout.f8nameremoved, this, true);
        this.A01 = C86654Ky.A0N(this, R.id.media_card_thumbs);
        this.A00 = (HorizontalScrollView) C06560Yg.A02(this, R.id.media_card_scroller);
    }

    public final C125136Fr A03(AnonymousClass7MZ r11) {
        C125136Fr r3 = new C125136Fr(getContext());
        ThumbnailButton A16 = C86664Kz.A16(r3, R.id.category_thumbnail_image);
        C86644Kx.A1A(A16);
        AnonymousClass4SX.A00(this, A16);
        AnonymousClass0YZ.A0F(A16, (String) null);
        String str = r11.A03;
        if (str != null) {
            r3.setText(str);
        }
        Drawable drawable = r11.A00;
        if (drawable != null) {
            A16.setImageDrawable(drawable);
        }
        C18320x8.A15(r3, r11, 31);
        C148107Gy r0 = r11.A02;
        if (r0 != null) {
            C90544hh r2 = r0.A01;
            C43072Qq r1 = r0.A00;
            A16.setTag(r1.A01);
            r2.A02.A02(A16, r1.A00, new AnonymousClass90T(A16, 2), new AnonymousClass93V(A16, 1), 2);
        }
        return r3;
    }

    public void setup(List list, AnonymousClass7MZ r5) {
        HorizontalScrollView horizontalScrollView;
        int i;
        if (list.size() == 0) {
            horizontalScrollView = this.A00;
            i = 8;
        } else {
            LinearLayout linearLayout = this.A01;
            linearLayout.removeAllViews();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linearLayout.addView(A03((AnonymousClass7MZ) it.next()));
            }
            if (r5 != null) {
                C125136Fr A032 = A03(r5);
                C86604Kt.A1B(A032, R.id.category_thumbnail_text_bg);
                linearLayout.addView(A032);
            }
            C620733j r0 = this.A02;
            horizontalScrollView = this.A00;
            C107555bV.A0A(horizontalScrollView, r0);
            i = 0;
        }
        horizontalScrollView.setVisibility(i);
    }

    public CategoryMediaCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CategoryMediaCard(Context context) {
        this(context, (AttributeSet) null);
    }
}
