package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import com.whatsapp.R;

/* renamed from: X.03A  reason: invalid class name */
public class AnonymousClass03A extends EditText implements C15840s2, C15000qc {
    public final C04780Qq A00;
    public final AnonymousClass0OE A01;
    public final AnonymousClass0WJ A02;
    public final C08130dN A03;

    public boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        int i2 = 0;
        if ((i != 16908322 && i != 16908337) || C06560Yg.A0W(this) == null) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (clipboardManager == null || (primaryClip = clipboardManager.getPrimaryClip()) == null || primaryClip.getItemCount() <= 0) {
            return true;
        }
        AnonymousClass0KM r0 = new AnonymousClass0KM(primaryClip, 1);
        if (i != 16908322) {
            i2 = 1;
        }
        C16940uH r02 = r0.A00;
        r02.BmH(i2);
        C06560Yg.A04(this, r02.Ay9());
        return true;
    }

    public AnonymousClass0Tq BZW(AnonymousClass0Tq r2) {
        return this.A03.BZV(this, r2);
    }

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

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public TextClassifier getTextClassifier() {
        AnonymousClass0OE r0;
        if (Build.VERSION.SDK_INT >= 28 || (r0 = this.A01) == null) {
            return super.getTextClassifier();
        }
        return r0.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004d, code lost:
        android.util.Log.i("ReceiveContent", X.AnonymousClass000.A0P(r3, "Can't handle drop: no activity: view=", X.AnonymousClass001.A0o()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onDragEvent(android.view.DragEvent r4) {
        /*
            r3 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x005c
            java.lang.Object r0 = r4.getLocalState()
            if (r0 != 0) goto L_0x005c
            java.lang.String[] r0 = X.C06560Yg.A0W(r3)
            if (r0 == 0) goto L_0x005c
            android.content.Context r2 = r3.getContext()
        L_0x0016:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x004d
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0046
            android.app.Activity r2 = (android.app.Activity) r2
            if (r2 == 0) goto L_0x004d
            int r1 = r4.getAction()
            r0 = 1
            if (r1 != r0) goto L_0x0031
            boolean r0 = r3 instanceof android.widget.TextView
            r0 = r0 ^ 1
        L_0x002d:
            if (r0 == 0) goto L_0x005c
            r0 = 1
            return r0
        L_0x0031:
            int r1 = r4.getAction()
            r0 = 3
            if (r1 != r0) goto L_0x005c
            boolean r0 = r3 instanceof android.widget.TextView
            if (r0 == 0) goto L_0x0041
            boolean r0 = X.AnonymousClass0R9.A01(r2, r4, r3)
            goto L_0x002d
        L_0x0041:
            boolean r0 = X.AnonymousClass0R9.A00(r2, r4, r3)
            goto L_0x002d
        L_0x0046:
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            goto L_0x0016
        L_0x004d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Can't handle drop: no activity: view="
            java.lang.String r1 = X.AnonymousClass000.A0P(r3, r0, r1)
            java.lang.String r0 = "ReceiveContent"
            android.util.Log.i(r0, r1)
        L_0x005c:
            boolean r0 = super.onDragEvent(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass03A.onDragEvent(android.view.DragEvent):boolean");
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

    public void setTextClassifier(TextClassifier textClassifier) {
        AnonymousClass0OE r0;
        if (Build.VERSION.SDK_INT >= 28 || (r0 = this.A01) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            r0.A01(textClassifier);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass03A(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getResources();
        context.getResources();
        AnonymousClass0XB.A04(this);
        C04780Qq r0 = new C04780Qq(this);
        this.A00 = r0;
        r0.A07(attributeSet, i);
        AnonymousClass0WJ r02 = new AnonymousClass0WJ(this);
        this.A02 = r02;
        r02.A0B(attributeSet, i);
        r02.A03();
        this.A01 = new AnonymousClass0OE(this);
        this.A03 = new C08130dN();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C04780Qq r0 = this.A00;
        if (r0 != null) {
            r0.A02();
        }
        AnonymousClass0WJ r02 = this.A02;
        if (r02 != null) {
            r02.A03();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AnonymousClass0WJ.A02(editorInfo, onCreateInputConnection, this);
        C02540Gq.A00(this, editorInfo, onCreateInputConnection);
        String[] A0W = C06560Yg.A0W(this);
        if (onCreateInputConnection == null || A0W == null) {
            return onCreateInputConnection;
        }
        EditorInfoCompat.setContentMimeTypes(editorInfo, A0W);
        return InputConnectionCompat.createWrapper(onCreateInputConnection, editorInfo, (InputConnectionCompat.OnCommitContentListener) new C08180dS(this));
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

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AnonymousClass0Y9.A00(callback, this));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        AnonymousClass0WJ r0 = this.A02;
        if (r0 != null) {
            r0.A06(context, i);
        }
    }

    public AnonymousClass03A(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
    }
}
