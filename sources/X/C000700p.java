package X;

import android.database.DataSetObserver;

/* renamed from: X.00p  reason: invalid class name and case insensitive filesystem */
public class C000700p extends DataSetObserver {
    public final /* synthetic */ AnonymousClass034 A00;

    public C000700p(AnonymousClass034 r1) {
        this.A00 = r1;
    }

    public void onChanged() {
        AnonymousClass034 r1 = this.A00;
        r1.A07 = true;
        r1.notifyDataSetChanged();
    }

    public void onInvalidated() {
        AnonymousClass034 r1 = this.A00;
        r1.A07 = false;
        r1.notifyDataSetInvalidated();
    }
}
