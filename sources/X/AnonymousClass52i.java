package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.ui.media.MediaCard;
import com.whatsapp.ui.media.MediaCardGrid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.52i  reason: invalid class name */
public abstract class AnonymousClass52i extends C131686e0 {
    public View A00;
    public HorizontalScrollView A01;
    public ImageView A02;
    public ImageView A03;
    public LinearLayout A04;
    public RelativeLayout A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public C620733j A0B;
    public C183208pf A0C;

    public static void A00(C183208pf r1) {
        C162457s7.A0J(r1, 0);
        r1.BPB();
    }

    public C91794l6 A03(ViewGroup.LayoutParams layoutParams, C149947On r4, int i) {
        C162457s7.A0J(r4, 0);
        C91794l6 r1 = new C91794l6(getContext());
        C86644Kx.A1A(r1);
        r1.setLayoutParams(layoutParams);
        r1.A00 = (float) (i / 6);
        r1.A04 = getThumbnailTextGravity();
        r1.A01 = getThumbnailIconGravity();
        String str = r4.A04;
        if (str != null) {
            r1.A0A = str;
        }
        String str2 = r4.A03;
        if (str2 != null) {
            r1.setContentDescription(str2);
        }
        Drawable drawable = r4.A00;
        if (drawable != null) {
            r1.A08 = drawable;
        }
        C18280x3.A0o(r1, r4, 48);
        AnonymousClass0YZ.A0F(r1, r4.A05);
        r4.A02.BTK(r1, i);
        return r1;
    }

    public final void A09(List list, int i) {
        C162457s7.A0J(list, 0);
        if (list.isEmpty()) {
            A04();
            return;
        }
        A05();
        int thumbnailPixelSize = getThumbnailPixelSize();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(thumbnailPixelSize, thumbnailPixelSize);
        layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        if (this.A03 == null) {
            ImageView A0H = C86614Ku.A0H(this);
            this.A03 = A0H;
            A0H.setLayoutParams(layoutParams);
            C18300x5.A13(A0H.getContext(), A0H, R.string.f11nameremoved);
            C86664Kz.A1R(A0H);
            A0H.setBackgroundResource(R.drawable.selector_orange_gradient);
            A0H.setImageDrawable(C107335b8.A07(getContext(), AnonymousClass0x7.A0J(getContext(), getWhatsAppLocale(), R.drawable.group_info_chevron_right), R.color.f5nameremoved));
            C183208pf r1 = this.A0C;
            if (r1 != null) {
                C18280x3.A0o(A0H, r1, 47);
            }
        }
        if (this instanceof MediaCardGrid) {
            MediaCardGrid mediaCardGrid = (MediaCardGrid) this;
            ArrayList arrayList = mediaCardGrid.A02;
            arrayList.clear();
            int size = list.size();
            if (size > i) {
                size = i;
            }
            for (int i2 = 0; i2 < size; i2++) {
                C91794l6 A032 = mediaCardGrid.A03(new AbsListView.LayoutParams(thumbnailPixelSize, thumbnailPixelSize), (C149947On) list.get(i2), thumbnailPixelSize);
                AnonymousClass4SX.A00(mediaCardGrid, A032);
                arrayList.add(A032);
            }
            if (mediaCardGrid.A01 == null) {
                AnonymousClass4OT r12 = new AnonymousClass4OT(arrayList);
                mediaCardGrid.A01 = r12;
                GridView gridView = mediaCardGrid.A00;
                if (gridView != null) {
                    gridView.setAdapter(r12);
                }
            }
            AnonymousClass4OT r0 = mediaCardGrid.A01;
            if (r0 != null) {
                r0.notifyDataSetChanged();
                return;
            }
            return;
        }
        MediaCard mediaCard = (MediaCard) this;
        LinearLayout linearLayout = mediaCard.A00;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linearLayout.addView(mediaCard.A03(layoutParams, (C149947On) it.next(), thumbnailPixelSize));
            }
            HorizontalScrollView horizontalScrollView = mediaCard.A01;
            if (horizontalScrollView != null) {
                C107555bV.A0A(horizontalScrollView, mediaCard.getWhatsAppLocale());
            }
            if (list.size() >= i) {
                linearLayout.addView(mediaCard.A03);
            }
            HorizontalScrollView horizontalScrollView2 = mediaCard.A01;
            if (horizontalScrollView2 != null) {
                horizontalScrollView2.setVisibility(0);
            }
        }
    }

    public abstract int getThumbnailPixelSize();

    public final void setSeeMoreClickListener(C183208pf r4) {
        C162457s7.A0J(r4, 0);
        this.A0C = r4;
        ImageView imageView = this.A03;
        if (imageView != null) {
            C18280x3.A0o(imageView, r4, 49);
        }
        TextView textView = this.A0A;
        if (textView != null) {
            C109395eY.A00(textView, r4, 0);
        }
        TextView textView2 = this.A09;
        if (textView2 != null) {
            C109395eY.A00(textView2, r4, 1);
        }
        TextView textView3 = this.A08;
        if (textView3 != null) {
            C109395eY.A00(textView3, r4, 2);
        }
        TextView textView4 = this.A07;
        if (textView4 != null) {
            C109395eY.A00(textView4, r4, 3);
        }
    }

    public final void setWhatsAppLocale(C620733j r2) {
        C162457s7.A0J(r2, 0);
        this.A0B = r2;
    }

    public void A04() {
        AnonymousClass0x2.A0x(this.A04);
        int A052 = C18290x4.A05(this.A00);
        RelativeLayout relativeLayout = this.A05;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(A052);
        }
        TextView textView = this.A06;
        if (textView != null) {
            textView.setVisibility(A052);
        }
    }

    public void A05() {
        int A052 = C18290x4.A05(this.A04);
        View view = this.A00;
        if (view != null) {
            view.setVisibility(0);
        }
        RelativeLayout relativeLayout = this.A05;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        TextView textView = this.A06;
        if (textView != null) {
            textView.setVisibility(A052);
        }
    }

    public void A06(int i, int i2) {
        View view = this.A00;
        if (view != null) {
            if (i < 0) {
                i = view.getPaddingLeft();
            }
            if (i2 < 0) {
                i2 = view.getPaddingRight();
            }
            C86624Kv.A0y(view, i, i2);
            TextView textView = this.A06;
            if (textView != null) {
                C86624Kv.A0y(textView, i, i2);
            }
        }
    }

    public void A08(View.OnClickListener onClickListener, int i) {
        if (this instanceof MediaCardGrid) {
            MediaCardGrid mediaCardGrid = (MediaCardGrid) this;
            ArrayList arrayList = mediaCardGrid.A02;
            arrayList.clear();
            for (int i2 = 0; i2 < i; i2++) {
                int thumbnailPixelSize = mediaCardGrid.getThumbnailPixelSize();
                AbsListView.LayoutParams layoutParams = new AbsListView.LayoutParams(thumbnailPixelSize, thumbnailPixelSize);
                ThumbnailButton thumbnailButton = new ThumbnailButton(mediaCardGrid.getContext());
                thumbnailButton.setBackgroundResource(R.drawable.catalog_product_placeholder_background);
                thumbnailButton.setLayoutParams(layoutParams);
                AnonymousClass4SX.A00(mediaCardGrid, thumbnailButton);
                arrayList.add(thumbnailButton);
            }
            AnonymousClass4OT r1 = new AnonymousClass4OT(arrayList);
            mediaCardGrid.A01 = r1;
            GridView gridView = mediaCardGrid.A00;
            if (gridView != null) {
                gridView.setAdapter(r1);
                return;
            }
            return;
        }
        MediaCard mediaCard = (MediaCard) this;
        int thumbnailPixelSize2 = mediaCard.getThumbnailPixelSize();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(thumbnailPixelSize2, thumbnailPixelSize2);
        int dimensionPixelSize = mediaCard.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        layoutParams2.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        for (int i3 = 0; i3 < i; i3++) {
            LinearLayout linearLayout = mediaCard.A00;
            if (linearLayout != null) {
                ThumbnailButton thumbnailButton2 = new ThumbnailButton(mediaCard.getContext());
                thumbnailButton2.setBackgroundResource(R.drawable.catalog_product_placeholder_background);
                thumbnailButton2.setLayoutParams(layoutParams2);
                if (onClickListener != null) {
                    thumbnailButton2.setOnClickListener(onClickListener);
                }
                linearLayout.addView(thumbnailButton2);
            }
        }
        HorizontalScrollView horizontalScrollView = mediaCard.A01;
        if (horizontalScrollView != null) {
            horizontalScrollView.setVisibility(0);
        }
    }

    public String getError() {
        TextView textView = this.A06;
        boolean z = false;
        if (textView != null && textView.getVisibility() == 0) {
            z = true;
        }
        CharSequence charSequence = null;
        if (!z) {
            return null;
        }
        TextView textView2 = this.A06;
        if (textView2 != null) {
            charSequence = textView2.getText();
        }
        return String.valueOf(charSequence);
    }

    public int getThumbnailIconGravity() {
        return 3;
    }

    public int getThumbnailTextGravity() {
        return 5;
    }

    public final C620733j getWhatsAppLocale() {
        C620733j r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    public final void setCatalogBrandingDrawable(Drawable drawable) {
        ImageView imageView = this.A02;
        if (imageView != null) {
            int i = 8;
            if (drawable != null) {
                i = 0;
            }
            imageView.setVisibility(i);
        }
        ImageView imageView2 = this.A02;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setError(String str) {
        TextView textView = this.A06;
        if (textView != null) {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }

    public final void setMediaInfo(String str) {
        TextView textView = this.A09;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.A07;
        if (textView2 != null) {
            textView2.setText(str);
        }
        if (str != null && str.length() != 0) {
            TextView textView3 = this.A09;
            if (textView3 != null) {
                C107555bV.A0B(textView3, getWhatsAppLocale(), R.drawable.chevron_right);
            }
            TextView textView4 = this.A07;
            if (textView4 != null) {
                C107555bV.A0B(textView4, getWhatsAppLocale(), R.drawable.chevron_right);
            }
        }
    }

    public final void setSeeMoreColor(int i) {
        TextView textView = this.A09;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public final void setTitle(String str) {
        TextView textView = this.A0A;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.A08;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    public final void setTitleTextColor(int i) {
        TextView textView = this.A0A;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public AnonymousClass52i(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A07(attributeSet);
    }

    /* JADX INFO: finally extract failed */
    public void A07(AttributeSet attributeSet) {
        C18280x3.A0D(this).inflate(R.layout.f8nameremoved, this, true);
        this.A0A = C18300x5.A0G(this, R.id.media_card_title);
        this.A08 = C18300x5.A0G(this, R.id.media_card_empty_title);
        this.A09 = C18300x5.A0G(this, R.id.media_card_info);
        this.A07 = C18300x5.A0G(this, R.id.media_card_empty_info);
        this.A00 = C06560Yg.A02(this, R.id.title_container);
        this.A01 = (HorizontalScrollView) C06560Yg.A02(this, R.id.media_card_scroller);
        this.A06 = C18300x5.A0G(this, R.id.media_card_error);
        this.A05 = (RelativeLayout) C06560Yg.A02(this, R.id.media_card_thumb_container);
        this.A04 = C86654Ky.A0N(this, R.id.media_card_empty);
        this.A02 = AnonymousClass0x9.A0E(this, R.id.branding_img);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = C86614Ku.A0C(this).obtainStyledAttributes(attributeSet, AnonymousClass78o.A00, 0, 0);
            C162457s7.A0D(obtainStyledAttributes);
            try {
                String A0G = getWhatsAppLocale().A0G(obtainStyledAttributes, 1);
                String A0G2 = getWhatsAppLocale().A0G(obtainStyledAttributes, 0);
                obtainStyledAttributes.recycle();
                TextView textView = this.A0A;
                if (textView != null) {
                    textView.setText(A0G);
                    C06560Yg.A0T(textView, true);
                }
                TextView textView2 = this.A08;
                if (textView2 != null) {
                    textView2.setText(A0G);
                }
                setMediaInfo(A0G2);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    public final void setTopShadowVisibility(int i) {
        int i2;
        int paddingLeft = getPaddingLeft();
        if (i == 0) {
            i2 = C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved);
        } else {
            i2 = 0;
        }
        C86604Kt.A1D(this, paddingLeft, i2);
    }

    public static final void setSeeMoreClickListener$lambda$20(C183208pf r0, View view) {
        A00(r0);
    }

    public static final void setSeeMoreClickListener$lambda$21(C183208pf r0, View view) {
        A00(r0);
    }

    public static final void setSeeMoreClickListener$lambda$22(C183208pf r0, View view) {
        A00(r0);
    }

    public static final void setSeeMoreClickListener$lambda$23(C183208pf r0, View view) {
        A00(r0);
    }

    public static final void setSeeMoreClickListener$lambda$24(C183208pf r0, View view) {
        A00(r0);
    }

    public static final void setup$lambda$12$lambda$11$lambda$10(C183208pf r0, View view) {
        A00(r0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass52i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }
}
