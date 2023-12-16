package X;

import android.content.Context;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.whatsapp.WaEditText;

/* renamed from: X.6eM  reason: invalid class name and case insensitive filesystem */
public class C131896eM extends WaEditText {
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        editorInfo.actionLabel = null;
        editorInfo.inputType = 0;
        BaseInputConnection baseInputConnection = new BaseInputConnection(this, false);
        try {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (onCreateInputConnection != null) {
                return new AnonymousClass6F6(baseInputConnection, onCreateInputConnection);
            }
            return null;
        } catch (Exception unused) {
            return super.onCreateInputConnection(editorInfo);
        }
    }

    public C131896eM(Context context) {
        super(context);
    }
}
