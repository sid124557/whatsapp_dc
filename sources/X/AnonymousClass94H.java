package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.94H  reason: invalid class name */
public abstract class AnonymousClass94H extends LinearLayout {
    public int A00 = 2;
    public View.OnClickListener A01;
    public ViewGroup A02;
    public FrameLayout A03;
    public ImageView A04;
    public LinearLayout A05;
    public TextView A06;
    public TextView A07;
    public CharSequence A08;
    public CharSequence A09;
    public final List A0A = AnonymousClass001.A0s();

    /* JADX WARNING: Removed duplicated region for block: B:9:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(java.util.List r8) {
        /*
            r7 = this;
            java.util.List r3 = r7.A0A
            r3.clear()
            android.widget.LinearLayout r0 = r7.A05
            r0.removeAllViews()
            boolean r1 = r8.isEmpty()
            r4 = 8
            r2 = 0
            android.widget.FrameLayout r0 = r7.A03
            if (r1 == 0) goto L_0x00a1
            int r0 = r0.getChildCount()
            if (r0 <= 0) goto L_0x0091
            android.widget.FrameLayout r0 = r7.A03
            r0.setVisibility(r2)
        L_0x0020:
            android.view.ViewGroup r0 = r7.A02
            r0.setVisibility(r4)
        L_0x0025:
            int r1 = r8.size()
            int r0 = r7.A00
            int r0 = java.lang.Math.min(r1, r0)
            java.util.List r0 = r8.subList(r2, r0)
            r3.addAll(r0)
        L_0x0036:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x00c1
            java.lang.Object r6 = r8.get(r2)
            r4 = r7
            com.whatsapp.payments.ui.widget.TransactionsExpandableView r4 = (com.whatsapp.payments.ui.widget.TransactionsExpandableView) r4
            X.34w r6 = (X.C624034w) r6
            X.9P5 r5 = r4.A00
            int r1 = r6.A03
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L_0x0085
            boolean r0 = r6.A0P
            if (r0 == 0) goto L_0x0085
            android.content.Context r0 = r5.A01
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131625712(0x7f0e06f0, float:1.887864E38)
            android.view.View r5 = X.AnonymousClass001.A0R(r1, r4, r0)
        L_0x005e:
            java.lang.Object r4 = r8.get(r2)
            int r1 = r3.size()
            r0 = r5
            X.9nL r0 = (X.C203239nL) r0
            r0.Axw(r4)
            int r4 = r1 + -1
            r0 = 2131429504(0x7f0b0880, float:1.8480683E38)
            android.view.View r1 = r5.findViewById(r0)
            r0 = 8
            if (r2 >= r4) goto L_0x007a
            r0 = 0
        L_0x007a:
            r1.setVisibility(r0)
            android.widget.LinearLayout r0 = r7.A05
            r0.addView(r5)
            int r2 = r2 + 1
            goto L_0x0036
        L_0x0085:
            android.content.Context r4 = r5.A01
            X.9m8 r1 = r5.A02
            int r0 = r5.A00
            X.9G3 r5 = new X.9G3
            r5.<init>(r4, r1, r0)
            goto L_0x005e
        L_0x0091:
            android.view.ViewGroup r0 = r7.A02
            r0.setVisibility(r2)
            android.widget.TextView r1 = r7.A06
            java.lang.CharSequence r0 = r7.A08
            r1.setText(r0)
            android.view.ViewGroup r1 = r7.A02
            r0 = 0
            goto L_0x00bc
        L_0x00a1:
            r0.setVisibility(r4)
            int r1 = r8.size()
            int r0 = r7.A00
            if (r1 <= r0) goto L_0x0020
            android.view.ViewGroup r0 = r7.A02
            r0.setVisibility(r2)
            android.widget.TextView r1 = r7.A06
            java.lang.CharSequence r0 = r7.A09
            r1.setText(r0)
            android.view.ViewGroup r1 = r7.A02
            android.view.View$OnClickListener r0 = r7.A01
        L_0x00bc:
            r1.setOnClickListener(r0)
            goto L_0x0025
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass94H.A01(java.util.List):void");
    }

    public void setCustomEmptyView(View view) {
        this.A03.addView(view);
    }

    public void setSeeMoreView(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.A09 = charSequence;
        this.A08 = charSequence2;
        this.A01 = onClickListener;
    }

    public void setTitle(CharSequence charSequence) {
        this.A07.setText(charSequence);
        this.A07.setVisibility(0);
    }

    public AnonymousClass94H(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        setOrientation(1);
        this.A07 = C18300x5.A0G(this, R.id.header);
        this.A02 = C86644Kx.A0I(this, R.id.see_more_container);
        this.A04 = AnonymousClass0x9.A0E(this, R.id.see_more_icon);
        this.A06 = C18300x5.A0G(this, R.id.see_more_text);
        this.A03 = C86654Ky.A0L(this, R.id.custom_empty_view_container);
        this.A05 = C86654Ky.A0N(this, R.id.list_item_container);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass9M9.A03);
            try {
                this.A00 = obtainStyledAttributes.getInt(2, 2);
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId > 0) {
                    this.A04.setImageDrawable(context.getResources().getDrawable(resourceId));
                }
                int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
                if (resourceId2 > 0) {
                    this.A06.setText(resourceId2);
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public ImageView getSeeMoreImageView() {
        return this.A04;
    }

    public int getSizeLimit() {
        return this.A00;
    }

    public void setSizeLimit(int i) {
        this.A00 = i;
    }

    public AnonymousClass94H(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }

    public AnonymousClass94H(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }
}
