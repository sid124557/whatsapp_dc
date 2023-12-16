package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.whatsapp.calling.callgrid.view.CallGrid;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.8zc  reason: invalid class name and case insensitive filesystem */
public class C188868zc extends AnonymousClass0P5 {
    public Object A00;
    public final int A01;

    public C188868zc(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A01(Drawable drawable) {
        switch (this.A01) {
            case 0:
                AnonymousClass4SN r0 = (AnonymousClass4SN) this.A00;
                ColorStateList colorStateList = r0.A02;
                if (colorStateList != null) {
                    AnonymousClass0YG.A06(drawable, colorStateList.getColorForState(r0.A0F, colorStateList.getDefaultColor()));
                    return;
                }
                return;
            case 2:
                AnonymousClass0P5 r02 = ((StickerView) this.A00).A01;
                if (r02 != null) {
                    r02.A01(drawable);
                    return;
                }
                return;
            default:
                super.A01(drawable);
                return;
        }
    }

    public void A02(Drawable drawable) {
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                ColorStateList colorStateList = ((AnonymousClass4SN) obj).A02;
                if (colorStateList != null) {
                    AnonymousClass0YG.A01(colorStateList, drawable);
                    return;
                }
                return;
            case 1:
                AnonymousClass0AR r0 = ((CallGrid) obj).A02;
                if (r0 != null) {
                    r0.start();
                    return;
                }
                return;
            default:
                AnonymousClass0P5 r02 = ((StickerView) obj).A01;
                if (r02 != null) {
                    r02.A02(drawable);
                    return;
                }
                return;
        }
    }
}
