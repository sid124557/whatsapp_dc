package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

/* renamed from: X.4zi  reason: invalid class name and case insensitive filesystem */
public abstract class C98034zi extends C132256ex {
    public final FrameLayout A00;
    public final LinearLayout A01 = C86654Ky.A0N(this, R.id.button_frame);
    public final WaImageView A02 = AnonymousClass0x9.A0L(this, R.id.kept_status);
    public final WaImageView A03 = AnonymousClass0x9.A0L(this, R.id.starred_status);

    public abstract int getMark();

    public abstract float getRatio();

    public int getMarkTintColor() {
        return -1;
    }

    public void setMessage(C30471mV r3) {
        this.A01 = r3;
        A04(this.A03, this.A02);
    }

    public void setRadius(int i) {
        this.A00 = i;
        if (i > 0) {
            FrameLayout frameLayout = this.A00;
            C86614Ku.A11(getContext(), frameLayout, R.drawable.search_media_thumbnail_rounded_overlay);
            C86624Kv.A0x(frameLayout, -1);
            ((GradientDrawable) frameLayout.getBackground()).setCornerRadius((float) i);
        }
    }

    public C98034zi(Context context) {
        super(context);
        this.A00 = getRatio();
        View.inflate(context, R.layout.f8nameremoved, this);
        FrameLayout A0L = C86654Ky.A0L(this, R.id.overlay);
        this.A00 = A0L;
        ImageView A0E = AnonymousClass0x9.A0E(this, R.id.button_image);
        Drawable A002 = AnonymousClass0RP.A00(context, getMark());
        if (A002 != null) {
            int markTintColor = getMarkTintColor();
            A002 = markTintColor != -1 ? C107335b8.A07(context, A002, markTintColor) : A002;
            A0E.setImageDrawable(A002);
            A0L.setLayoutParams(new FrameLayout.LayoutParams(-1, A002.getIntrinsicHeight() * 2, 80));
            A0L.setVisibility(0);
            A0E.setImageDrawable(A002);
        }
    }
}
