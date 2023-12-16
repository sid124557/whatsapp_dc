package androidx.appcompat.widget;

import X.AnonymousClass0PO;
import X.AnonymousClass0XB;
import X.C03900Lz;
import X.C04780Qq;
import X.C15000qc;
import X.C15020qe;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

public class AppCompatImageView extends ImageView implements C15000qc, C15020qe {
    public final C04780Qq A00;
    public final AnonymousClass0PO A01;

    public ColorStateList getSupportBackgroundTintList() {
        C04780Qq r0 = this.A00;
        if (r0 != null) {
            return C04780Qq.A00(r0);
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C04780Qq r0 = this.A00;
        if (r0 != null) {
            return C04780Qq.A01(r0);
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C03900Lz r0;
        AnonymousClass0PO r02 = this.A01;
        if (r02 == null || (r0 = r02.A00) == null) {
            return null;
        }
        return r0.A00;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C03900Lz r0;
        AnonymousClass0PO r02 = this.A01;
        if (r02 == null || (r0 = r02.A00) == null) {
            return null;
        }
        return r0.A01;
    }

    public boolean hasOverlappingRendering() {
        if ((this.A01.A02.getBackground() instanceof RippleDrawable) || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public void setImageResource(int i) {
        AnonymousClass0PO r0 = this.A01;
        if (r0 != null) {
            r0.A01(i);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C04780Qq r0 = this.A00;
        if (r0 != null) {
            r0.A05(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C04780Qq r0 = this.A00;
        if (r0 != null) {
            r0.A06(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        AnonymousClass0PO r2 = this.A01;
        if (r2 != null) {
            C03900Lz r1 = r2.A00;
            if (r1 == null) {
                r1 = new C03900Lz();
                r2.A00 = r1;
            }
            r1.A00 = colorStateList;
            r1.A02 = true;
            r2.A00();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        AnonymousClass0PO r2 = this.A01;
        if (r2 != null) {
            C03900Lz r1 = r2.A00;
            if (r1 == null) {
                r1 = new C03900Lz();
                r2.A00 = r1;
            }
            r1.A01 = mode;
            r1.A03 = true;
            r2.A00();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getResources();
        context.getResources();
        AnonymousClass0XB.A04(this);
        C04780Qq r0 = new C04780Qq(this);
        this.A00 = r0;
        r0.A07(attributeSet, i);
        AnonymousClass0PO r02 = new AnonymousClass0PO(this);
        this.A01 = r02;
        r02.A02(attributeSet, i);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C04780Qq r0 = this.A00;
        if (r0 != null) {
            r0.A02();
        }
        AnonymousClass0PO r02 = this.A01;
        if (r02 != null) {
            r02.A00();
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C04780Qq r0 = this.A00;
        if (r0 != null) {
            r0.A03();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C04780Qq r0 = this.A00;
        if (r0 != null) {
            r0.A04(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        AnonymousClass0PO r0 = this.A01;
        if (r0 != null) {
            r0.A00();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        AnonymousClass0PO r0 = this.A01;
        if (r0 != null) {
            r0.A00();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        AnonymousClass0PO r0 = this.A01;
        if (r0 != null) {
            r0.A00();
        }
    }

    public AppCompatImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
