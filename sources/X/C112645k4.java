package X;

import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.5k4  reason: invalid class name and case insensitive filesystem */
public final class C112645k4 implements AnonymousClass675 {
    public final C106995aW A00;
    public final AnonymousClass675 A01;
    public final List A02 = AnonymousClass001.A0s();

    public C112645k4(C106995aW r2, AnonymousClass675 r3) {
        C162457s7.A0J(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public Cursor B6e() {
        return this.A01.B6e();
    }

    /* renamed from: B8h */
    public C624134x getItem(int i) {
        List list = this.A02;
        if (list.size() > i) {
            return C18320x8.A0R(list, i);
        }
        return null;
    }

    public C624134x B8i(Cursor cursor, int i) {
        return this.A01.B8i(cursor, i);
    }

    public int B8m(C624134x r2, int i) {
        return this.A01.B8m(r2, i);
    }

    public View BEJ(View view, ViewGroup viewGroup, C624134x r4, int i) {
        return this.A01.BEJ(view, viewGroup, r4, i);
    }

    public Cursor BqV(Cursor cursor) {
        C95814uZ r2;
        List list = this.A02;
        list.clear();
        if (cursor != null) {
            int count = cursor.getCount();
            for (int i = 0; i < count; i++) {
                C624134x B8i = this.A01.B8i(cursor, i);
                if (B8i != null && ((r2 = B8i.A1J.A00) == null || (true ^ this.A00.A0I(r2)))) {
                    list.add(B8i);
                }
            }
        }
        return this.A01.BqV(cursor);
    }

    public boolean areAllItemsEnabled() {
        return this.A01.areAllItemsEnabled();
    }

    public int getCount() {
        return this.A02.size();
    }

    public long getItemId(int i) {
        return this.A01.getItemId(i);
    }

    public int getViewTypeCount() {
        return this.A01.getViewTypeCount();
    }

    public boolean hasStableIds() {
        return this.A01.hasStableIds();
    }

    public boolean isEmpty() {
        return this.A02.isEmpty();
    }

    public boolean isEnabled(int i) {
        return this.A01.isEnabled(i);
    }

    public void notifyDataSetChanged() {
        this.A01.notifyDataSetChanged();
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.A01.registerDataSetObserver(dataSetObserver);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.A01.unregisterDataSetObserver(dataSetObserver);
    }

    public int getItemViewType(int i) {
        return this.A01.B8m(getItem(i), i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return this.A01.BEJ(view, viewGroup, getItem(i), i);
    }
}
