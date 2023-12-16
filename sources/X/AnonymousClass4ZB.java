package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import android.view.View;
import android.widget.CheckBox;
import com.whatsapp.R;

/* renamed from: X.4ZB  reason: invalid class name */
public class AnonymousClass4ZB extends C05570Ua implements C15930sC {
    public final View A00;
    public final CheckBox A01;
    public final int[] A02;
    public final int[] A03;
    public final int[] A04;

    public void A07(boolean z, int i) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        CheckBox checkBox = this.A01;
        Resources resources = checkBox.getResources();
        int i2 = R.drawable.group_profile_emoji_editor_color_selection_unchecked;
        if (z) {
            i2 = R.drawable.group_profile_emoji_editor_color_selection_checked;
        }
        Drawable A002 = C02680He.A00(C86614Ku.A0C(checkBox), resources, i2);
        C626936e.A06(A002);
        LayerDrawable layerDrawable = (LayerDrawable) A002;
        int[] iArr = this.A03;
        int i3 = iArr[i % iArr.length];
        int[] iArr2 = this.A04;
        int i4 = iArr2[i % iArr2.length];
        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.color_selection_ring);
        Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.color_selection_circle);
        Drawable A0B = C107335b8.A0B(findDrawableByLayerId, i4);
        Drawable A0B2 = C107335b8.A0B(findDrawableByLayerId2, i3);
        layerDrawable.setDrawableByLayerId(R.id.color_selection_ring, A0B);
        layerDrawable.setDrawableByLayerId(R.id.color_selection_circle, A0B2);
        stateListDrawable.addState(StateSet.WILD_CARD, layerDrawable);
        stateListDrawable.mutate();
        Context context = checkBox.getContext();
        int[] iArr3 = this.A02;
        C18300x5.A13(context, checkBox, iArr3[i % iArr3.length]);
        checkBox.setButtonDrawable(stateListDrawable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r1 != false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (r1 != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BOf(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Number r7 = (java.lang.Number) r7
            int r5 = r6.A01()
            int r0 = r7.intValue()
            r4 = 1
            boolean r3 = X.AnonymousClass000.A1U(r5, r0)
            android.widget.CheckBox r2 = r6.A01
            boolean r1 = r2.isChecked()
            if (r3 == 0) goto L_0x001a
            r0 = 1
            if (r1 == 0) goto L_0x002c
        L_0x001a:
            r0 = 0
            if (r3 != 0) goto L_0x002c
            if (r1 == 0) goto L_0x002c
        L_0x001f:
            if (r5 < 0) goto L_0x0028
            if (r0 != 0) goto L_0x0025
            if (r4 == 0) goto L_0x0028
        L_0x0025:
            r6.A07(r3, r5)
        L_0x0028:
            r2.setChecked(r3)
            return
        L_0x002c:
            r4 = 0
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4ZB.BOf(java.lang.Object):void");
    }

    public AnonymousClass4ZB(View view, int[] iArr, int[] iArr2, int[] iArr3) {
        super(view);
        this.A00 = C06560Yg.A02(view, R.id.selectionRingContainer);
        CheckBox checkBox = (CheckBox) C06560Yg.A02(view, R.id.selectionRing);
        this.A01 = checkBox;
        C107295b4.A03(checkBox, R.string.f11nameremoved);
        this.A03 = iArr;
        this.A04 = iArr2;
        this.A02 = iArr3;
    }
}
