package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.provider.Settings;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.whatsapp.R;
import com.whatsapp.text.FinalBackspaceAwareEntry;
import com.whatsapp.util.Log;

/* renamed from: X.4bb  reason: invalid class name and case insensitive filesystem */
public abstract class C89124bb extends C89714em {
    public float A00;
    public int A01;
    public TextPaint A02;
    public AnonymousClass1VX A03;
    public String A04;
    public String A05;
    public boolean A06 = this.A03.A0X(6616);

    public boolean A09() {
        if (!(this instanceof FinalBackspaceAwareEntry)) {
            return C86634Kw.A1X(this);
        }
        FinalBackspaceAwareEntry finalBackspaceAwareEntry = (FinalBackspaceAwareEntry) this;
        return TextUtils.isEmpty(finalBackspaceAwareEntry.A0A(finalBackspaceAwareEntry.getText()));
    }

    public void setHint(String str) {
        this.A04 = str;
        this.A05 = null;
        requestLayout();
    }

    public void setInputEnterAction(int i) {
        this.A01 = i;
        setRawInputType(180225);
        if (i == 0) {
            i = 1073741824;
        }
        C620633i r0 = this.A02;
        if (r0 != null) {
            AnonymousClass5UR A0R = r0.A0R();
            if (A0R == null) {
                Log.w("conversation-text-entry/set-input-enter-action cr=null");
            } else if ("com.htc.android.htcime/.HTCIMEService".equals(Settings.Secure.getString(A0R.A00, "default_input_method"))) {
                i |= 268435456;
            }
        }
        setImeOptions(i);
    }

    public C89124bb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        int i = this.A01;
        if (i != 0) {
            int i2 = editorInfo.imeOptions;
            int i3 = i2 & 255;
            if ((i3 & i) != 0) {
                int i4 = i | (i2 ^ i3);
                editorInfo.imeOptions = i4;
                i2 = i4;
            }
            if ((1073741824 & i2) != 0) {
                editorInfo.imeOptions = i2 & -1073741825;
            }
        }
        return onCreateInputConnection;
    }

    public void onDraw(Canvas canvas) {
        String str;
        int paddingLeft;
        super.onDraw(canvas);
        if (!isInEditMode() && this.A02 != null && !TextUtils.isEmpty(this.A05) && A09()) {
            C620733j r0 = this.A03;
            if (r0 == null || C620733j.A04(r0)) {
                str = this.A05;
                paddingLeft = getPaddingLeft();
            } else {
                this.A02.setTextAlign(Paint.Align.RIGHT);
                str = this.A05;
                paddingLeft = AnonymousClass001.A0I(this);
            }
            canvas.drawText(str, (float) paddingLeft, ((float) getTotalPaddingTop()) - this.A00, this.A02);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!TextUtils.isEmpty(this.A04) && A09()) {
            accessibilityNodeInfo.setText(this.A04);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextPaint textPaint;
        super.onLayout(z, i, i2, i3, i4);
        String str = this.A04;
        if (str != null && (textPaint = this.A02) != null && this.A06) {
            this.A05 = C86654Ky.A0l(textPaint, str, (float) (i3 - i));
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A04 != null) {
            if (this.A02 == null) {
                TextPaint textPaint = new TextPaint(1);
                this.A02 = textPaint;
                C86614Ku.A10(getContext(), textPaint, R.color.f5nameremoved);
                this.A02.setTextSize(getTextSize());
                this.A02.setTextAlign(Paint.Align.LEFT);
            }
            if (!this.A06) {
                int A062 = AnonymousClass000.A06(this, getMeasuredWidth());
                this.A05 = C86654Ky.A0l(this.A02, this.A04, (float) A062);
            }
            this.A00 = this.A02.getFontMetrics().top;
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (!TextUtils.isEmpty(this.A04) && A09()) {
            accessibilityEvent.getText().add(this.A04);
        }
    }

    public C89124bb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C89124bb(Context context) {
        super(context);
    }
}
