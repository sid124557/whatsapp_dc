package X;

import android.database.DataSetObserver;

/* renamed from: X.6Co  reason: invalid class name and case insensitive filesystem */
public final class C124496Co extends DataSetObserver {
    public final /* synthetic */ AnonymousClass4X2 A00;

    public C124496Co(AnonymousClass4X2 r1) {
        this.A00 = r1;
    }

    public void onChanged() {
        super.onChanged();
        AnonymousClass4X2 r1 = this.A00;
        r1.A02 = true;
        r1.A05();
    }

    public void onInvalidated() {
        super.onInvalidated();
        AnonymousClass4X2 r1 = this.A00;
        r1.A02 = false;
        r1.A05();
    }
}
