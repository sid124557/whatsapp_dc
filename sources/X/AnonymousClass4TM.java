package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4TM  reason: invalid class name */
public class AnonymousClass4TM extends AnonymousClass066 {
    public final /* synthetic */ Chip A00;

    public void A0J(int i, boolean z) {
        if (i == 1) {
            Chip chip = this.A00;
            chip.A09 = z;
            chip.refreshDrawableState();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4TM(Chip chip, Chip chip2) {
        super(chip2);
        this.A00 = chip;
    }

    public int A0E(float f, float f2) {
        Chip chip = this.A00;
        if (!chip.A07() || !chip.getCloseIconTouchBounds().contains(f, f2)) {
            return 0;
        }
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0K(X.C05650Ui r5) {
        /*
            r4 = this;
            com.google.android.material.chip.Chip r2 = r4.A00
            X.4aX r0 = r2.A06
            if (r0 == 0) goto L_0x000b
            boolean r1 = r0.A0g
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            android.view.accessibility.AccessibilityNodeInfo r3 = r5.A01
            r3.setCheckable(r0)
            boolean r0 = r2.isClickable()
            r5.A0H(r0)
            java.lang.CharSequence r0 = r2.getAccessibilityClassName()
            r3.setClassName(r0)
            java.lang.CharSequence r2 = r2.getText()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x002d
            r3.setText(r2)
            return
        L_0x002d:
            r5.A09(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TM.A0K(X.0Ui):void");
    }

    public void A0L(C05650Ui r8, int i) {
        CharSequence charSequence = "";
        if (i == 1) {
            Chip chip = this.A00;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription == null) {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                Object[] objArr = new Object[1];
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                closeIconContentDescription = C86614Ku.A0s(context, charSequence, objArr, R.string.f11nameremoved).trim();
            }
            r8.A09(closeIconContentDescription);
            Rect A002 = chip.getCloseIconTouchBoundsInt();
            AccessibilityNodeInfo accessibilityNodeInfo = r8.A01;
            accessibilityNodeInfo.setBoundsInParent(A002);
            r8.A07(C06220Ws.A08);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            return;
        }
        r8.A09(charSequence);
        r8.A01.setBoundsInParent(Chip.A0J);
    }

    public boolean A0P(int i, int i2, Bundle bundle) {
        if (i2 != 16) {
            return false;
        }
        if (i == 0) {
            return this.A00.performClick();
        }
        if (i != 1) {
            return false;
        }
        Chip chip = this.A00;
        boolean z = false;
        chip.playSoundEffect(0);
        View.OnClickListener onClickListener = chip.A04;
        if (onClickListener != null) {
            onClickListener.onClick(chip);
            z = true;
        }
        if (!chip.A0E) {
            return z;
        }
        chip.A0H.A0I(1, 1);
        return z;
    }

    public void A0M(List list) {
        C88654aX r0;
        list.add(C18290x4.A0Z());
        Chip chip = this.A00;
        if (chip.A07() && (r0 = chip.A06) != null && r0.A0j && chip.A04 != null) {
            list.add(AnonymousClass001.A0f());
        }
    }
}
