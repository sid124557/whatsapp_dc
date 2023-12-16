package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* renamed from: X.037  reason: invalid class name */
public class AnonymousClass037 extends CheckedTextView {
    public static final int[] A01 = {16843016};
    public final AnonymousClass0WJ A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass037(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16843720);
        context.getResources();
        context.getResources();
        AnonymousClass0XB.A04(this);
        AnonymousClass0WJ r0 = new AnonymousClass0WJ(this);
        this.A00 = r0;
        r0.A0B(attributeSet, 16843720);
        r0.A03();
        AnonymousClass0UD A002 = AnonymousClass0UD.A00(getContext(), attributeSet, A01, 16843720, 0);
        setCheckMarkDrawable(A002.A02(0));
        A002.A02.recycle();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        AnonymousClass0WJ r0 = this.A00;
        if (r0 != null) {
            r0.A03();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C02540Gq.A00(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AnonymousClass0XW.A02(this, i));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AnonymousClass0Y9.A00(callback, this));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        AnonymousClass0WJ r0 = this.A00;
        if (r0 != null) {
            r0.A06(context, i);
        }
    }
}
