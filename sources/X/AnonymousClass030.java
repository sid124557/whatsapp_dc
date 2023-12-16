package X;

import android.content.Context;
import android.widget.ArrayAdapter;

/* renamed from: X.030  reason: invalid class name */
public class AnonymousClass030 extends ArrayAdapter {
    public boolean hasStableIds() {
        return true;
    }

    public AnonymousClass030(Context context, CharSequence[] charSequenceArr, int i) {
        super(context, i, 16908308, charSequenceArr);
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
