package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import com.whatsapp.R;

/* renamed from: X.03g  reason: invalid class name and case insensitive filesystem */
public class C002903g extends MultiAutoCompleteTextView implements C15000qc {
    public static final int[] A02 = {16843126};
    public final C04780Qq A00;
    public final AnonymousClass0WJ A01;

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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C002903g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f3nameremoved);
        context.getResources();
        context.getResources();
        AnonymousClass0XB.A04(this);
        AnonymousClass0UD A002 = AnonymousClass0UD.A00(getContext(), attributeSet, A02, R.attr.f3nameremoved, 0);
        TypedArray typedArray = A002.A02;
        if (typedArray.hasValue(0)) {
            setDropDownBackgroundDrawable(A002.A02(0));
        }
        typedArray.recycle();
        C04780Qq r0 = new C04780Qq(this);
        this.A00 = r0;
        r0.A07(attributeSet, R.attr.f3nameremoved);
        AnonymousClass0WJ r02 = new AnonymousClass0WJ(this);
        this.A01 = r02;
        r02.A0B(attributeSet, R.attr.f3nameremoved);
        r02.A03();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C04780Qq r0 = this.A00;
        if (r0 != null) {
            r0.A02();
        }
        AnonymousClass0WJ r02 = this.A01;
        if (r02 != null) {
            r02.A03();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C02540Gq.A00(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
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

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AnonymousClass0XW.A02(this, i));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        AnonymousClass0WJ r0 = this.A01;
        if (r0 != null) {
            r0.A06(context, i);
        }
    }
}
