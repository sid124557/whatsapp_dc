package X;

import android.app.Activity;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.0R9  reason: invalid class name */
public final class AnonymousClass0R9 {
    public static boolean A00(Activity activity, DragEvent dragEvent, View view) {
        activity.requestDragAndDropPermissions(dragEvent);
        C06560Yg.A04(view, new AnonymousClass0KM(dragEvent.getClipData(), 3).A00.Ay9());
        return true;
    }

    /* JADX INFO: finally extract failed */
    public static boolean A01(Activity activity, DragEvent dragEvent, TextView textView) {
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            C06560Yg.A04(textView, new AnonymousClass0KM(dragEvent.getClipData(), 3).A00.Ay9());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }
}
