package X;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.0dN  reason: invalid class name and case insensitive filesystem */
public final class C08130dN implements AnonymousClass0s1 {
    public AnonymousClass0Tq BZV(View view, AnonymousClass0Tq r13) {
        CharSequence coerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            AnonymousClass000.A19(r13, "onReceive: ", "ReceiveContent", AnonymousClass001.A0o());
        }
        C16950uI r2 = r13.A00;
        if (r2.BDA() == 2) {
            return r13;
        }
        ClipData B5Y = r2.B5Y();
        int B7j = r2.B7j();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < B5Y.getItemCount(); i++) {
            ClipData.Item itemAt = B5Y.getItemAt(i);
            if ((B7j & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (!z) {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                }
            }
        }
        return null;
    }
}
