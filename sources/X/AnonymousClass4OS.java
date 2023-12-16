package X;

import android.widget.BaseAdapter;

/* renamed from: X.4OS  reason: invalid class name */
public abstract class AnonymousClass4OS extends BaseAdapter {
    public long getItemId(int i) {
        return ((long) i) * 1024;
    }

    public int getViewTypeCount() {
        return 4;
    }

    public boolean hasStableIds() {
        return true;
    }

    public int getItemViewType(int i) {
        Object item = getItem(i);
        if (item instanceof C171088Fs) {
            return 1;
        }
        if (item instanceof C171098Ft) {
            return 2;
        }
        if (item instanceof C171068Fp) {
            return 3;
        }
        return 0;
    }
}
