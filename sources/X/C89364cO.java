package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.4cO  reason: invalid class name and case insensitive filesystem */
public abstract class C89364cO extends AnonymousClass4Qu {
    public TextEmojiLabel A00;
    public WaImageView A01;
    public WaTextView A02;
    public C620633i A03;
    public C620733j A04;
    public AnonymousClass1VX A05;
    public boolean A06;

    public void A05(AttributeSet attributeSet) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        float f2;
        float f3;
        float f4;
        AttributeSet attributeSet2 = attributeSet;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = C86614Ku.A0C(this).obtainStyledAttributes(attributeSet2, C100905Cs.A0B, 0, 0);
            try {
                i = obtainStyledAttributes.getResourceId(7, 0);
                i2 = obtainStyledAttributes.getResourceId(0, 0);
                i3 = obtainStyledAttributes.getResourceId(4, 0);
                i4 = obtainStyledAttributes.getColor(5, 0);
                i5 = obtainStyledAttributes.getColor(8, 0);
                i6 = obtainStyledAttributes.getColor(1, 0);
                this.A06 = obtainStyledAttributes.getBoolean(6, true);
                f4 = obtainStyledAttributes.getDimension(9, 0.0f);
                f = obtainStyledAttributes.getDimension(10, 0.0f);
                f2 = obtainStyledAttributes.getDimension(2, 0.0f);
                f3 = obtainStyledAttributes.getDimension(3, 0.0f);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            f4 = 0.0f;
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
        }
        View inflate = C18280x3.A0D(this).inflate(getRootLayoutID(), this, true);
        this.A02 = AnonymousClass0x7.A0L(inflate, R.id.list_item_title);
        this.A00 = AnonymousClass0x7.A0K(inflate, R.id.list_item_description);
        this.A01 = AnonymousClass0x9.A0L(inflate, R.id.list_item_icon);
        if (i != 0) {
            this.A02.setText(i);
        }
        if (i2 != 0) {
            setDescription(i2);
        }
        if (i5 != 0) {
            this.A02.setTextColor(i5);
        }
        if (i6 != 0) {
            this.A00.setTextColor(i6);
        }
        if (i4 != 0) {
            setIconColor(i4);
        }
        if (i3 != 0) {
            setIcon(i3);
        }
        if (f4 != 0.0f) {
            this.A02.setTextSize(0, f4);
        }
        if (f != 0.0f) {
            this.A02.setLineSpacing(f, 1.0f);
        }
        if (f2 != 0.0f) {
            this.A00.setTextSize(0, f2);
        }
        if (f3 != 0.0f) {
            this.A00.setLineSpacing(f3, 1.0f);
        }
        C107295b4.A06(this.A02, true);
    }

    public abstract int getRootLayoutID();

    public CharSequence getTitle() {
        return this.A02.getText();
    }

    public void setDescription(int i) {
        this.A00.setText(i);
    }

    public void setIcon(int i) {
        A04(i, this.A06);
    }

    public void setIconColor(int i) {
        C05040Rr.A00(ColorStateList.valueOf(i), this.A01);
    }

    public void setIconVisible(boolean z) {
        this.A01.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
    }

    public void setTitle(CharSequence charSequence) {
        this.A02.setText(charSequence);
    }

    public C89364cO(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A06 = true;
        A05(attributeSet);
    }

    public static void A01(Context context, C89364cO r1, int i) {
        r1.setTitle(context.getString(i));
    }

    public static void A02(Context context, C89364cO r1, int i) {
        r1.setDescription((CharSequence) context.getString(i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(int r4, boolean r5) {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.getResources()     // Catch:{ NotFoundException -> 0x000b }
            android.content.res.XmlResourceParser r0 = r0.getXml(r4)     // Catch:{ NotFoundException -> 0x000b }
            if (r0 == 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.graphics.drawable.Drawable r2 = X.C86644Kx.A0C(r3, r4)
            goto L_0x0019
        L_0x0010:
            android.content.res.Resources r1 = r3.getResources()
            r0 = 0
            X.0AQ r2 = X.AnonymousClass0AQ.A03(r0, r1, r4)
        L_0x0019:
            X.33j r0 = r3.A04
            X.6dx r1 = new X.6dx
            r1.<init>(r2, r0)
            r1.A00 = r5
            com.whatsapp.WaImageView r0 = r3.A01
            r0.setImageDrawable(r1)
            boolean r0 = X.C1001059l.A04
            if (r0 == 0) goto L_0x0032
            com.whatsapp.WaImageView r1 = r3.A01
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r1.setScaleType(r0)
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89364cO.A04(int, boolean):void");
    }

    public C89364cO(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setDescription(CharSequence charSequence) {
        this.A00.setText(charSequence);
    }
}
