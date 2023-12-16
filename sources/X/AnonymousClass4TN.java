package X;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.rendercore.text.RCTextView;
import java.util.List;

/* renamed from: X.4TN  reason: invalid class name */
public class AnonymousClass4TN extends AnonymousClass066 {
    public AnonymousClass0WH A00;
    public final /* synthetic */ RCTextView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4TN(RCTextView rCTextView) {
        super(rCTextView);
        this.A01 = rCTextView;
        rCTextView.setFocusable(false);
        rCTextView.setImportantForAccessibility(1);
    }

    public int A0E(float f, float f2) {
        RCTextView rCTextView = this.A01;
        CharSequence charSequence = rCTextView.A0B;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            int i = 0;
            while (true) {
                ClickableSpan[] clickableSpanArr = rCTextView.A0F;
                if (i >= clickableSpanArr.length) {
                    break;
                }
                ClickableSpan clickableSpan = clickableSpanArr[i];
                int spanStart = spanned.getSpanStart(clickableSpan);
                int spanEnd = spanned.getSpanEnd(clickableSpan);
                int A012 = rCTextView.A01((int) f, (int) f2);
                if (A012 >= spanStart && A012 <= spanEnd) {
                    return i;
                }
                i++;
            }
        }
        return Integer.MIN_VALUE;
    }

    public void A0L(C05650Ui r12, int i) {
        int lineVisibleEnd;
        RCTextView rCTextView = this.A01;
        Spanned spanned = (Spanned) rCTextView.A0B;
        Rect A0N = AnonymousClass001.A0N();
        ClickableSpan[] clickableSpanArr = rCTextView.A0F;
        if (clickableSpanArr == null || i >= clickableSpanArr.length) {
            AccessibilityNodeInfo accessibilityNodeInfo = r12.A01;
            accessibilityNodeInfo.setText("");
            accessibilityNodeInfo.setBoundsInParent(A0N);
            return;
        }
        ClickableSpan clickableSpan = clickableSpanArr[i];
        int spanStart = spanned.getSpanStart(clickableSpan);
        int spanEnd = spanned.getSpanEnd(clickableSpan);
        int lineForOffset = rCTextView.A0A.getLineForOffset(spanStart);
        int lineForOffset2 = rCTextView.A0A.getLineForOffset(spanEnd);
        Path A06 = AnonymousClass002.A06();
        RectF A07 = AnonymousClass002.A07();
        if (lineForOffset == lineForOffset2) {
            lineVisibleEnd = spanEnd;
        } else {
            lineVisibleEnd = rCTextView.A0A.getLineVisibleEnd(lineForOffset);
        }
        rCTextView.A0A.getSelectionPath(spanStart, lineVisibleEnd, A06);
        A06.computeBounds(A07, true);
        A07.offset(rCTextView.A00, rCTextView.A01);
        A07.round(A0N);
        AccessibilityNodeInfo accessibilityNodeInfo2 = r12.A01;
        accessibilityNodeInfo2.setBoundsInParent(A0N);
        r12.A0H(true);
        accessibilityNodeInfo2.setFocusable(true);
        accessibilityNodeInfo2.setEnabled(true);
        accessibilityNodeInfo2.setVisibleToUser(true);
        accessibilityNodeInfo2.setText(spanned.subSequence(spanStart, spanEnd));
        accessibilityNodeInfo2.setClassName("android.widget.Button");
        if (clickableSpan instanceof AnonymousClass6E8) {
            AnonymousClass6E8 r5 = (AnonymousClass6E8) clickableSpan;
            String str = r5.A00;
            String str2 = r5.A01;
            if (str != null) {
                r12.A09(str);
            }
            C1001159m.A00(rCTextView.getContext(), (View) null, r12, str2);
        }
    }

    public void A0M(List list) {
        ClickableSpan[] clickableSpanArr = this.A01.A0F;
        if (clickableSpanArr != null) {
            int length = clickableSpanArr.length;
            for (int i = 0; i < length; i++) {
                C86634Kw.A1V(list, i);
            }
        }
    }

    public void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        RCTextView rCTextView = this.A01;
        if (!TextUtils.isEmpty(rCTextView.A0B)) {
            accessibilityEvent.getText().add(rCTextView.getTextForAccessibility());
        }
    }

    public void A0D(View view, C05650Ui r5) {
        super.A0D(view, r5);
        CharSequence A002 = ((RCTextView) view).getTextForAccessibility();
        if (!TextUtils.isEmpty(A002)) {
            AccessibilityNodeInfo accessibilityNodeInfo = r5.A01;
            accessibilityNodeInfo.setText(A002);
            accessibilityNodeInfo.addAction(256);
            accessibilityNodeInfo.addAction(512);
            accessibilityNodeInfo.setMovementGranularities(31);
            accessibilityNodeInfo.addAction(AnonymousClass35S.A0F);
        }
        AnonymousClass0WH r0 = this.A00;
        if (r0 != null) {
            r0.A0D(view, r5);
        }
    }

    public boolean A0P(int i, int i2, Bundle bundle) {
        return false;
    }
}
