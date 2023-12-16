package X;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* renamed from: X.034  reason: invalid class name */
public abstract class AnonymousClass034 extends BaseAdapter implements AnonymousClass0u6, Filterable {
    public int A00;
    public Context A01;
    public Cursor A02;
    public DataSetObserver A03;
    public C000600n A04;
    public AnonymousClass03B A05;
    public boolean A06;
    public boolean A07;

    public static void A00(Context context, AnonymousClass034 r4) {
        r4.A06 = true;
        r4.A02 = null;
        r4.A07 = false;
        r4.A01 = context;
        r4.A00 = -1;
        r4.A04 = new C000600n(r4);
        r4.A03 = new C000700p(r4);
    }

    public abstract View A03(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract void A04(View view, Context context, Cursor cursor);

    public CharSequence Azk(Cursor cursor) {
        if (cursor == null) {
            return "";
        }
        return cursor.toString();
    }

    public Cursor B6e() {
        return this.A02;
    }

    public Cursor BqV(Cursor cursor) {
        Cursor cursor2 = this.A02;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C000600n r0 = this.A04;
            if (r0 != null) {
                cursor2.unregisterContentObserver(r0);
            }
            DataSetObserver dataSetObserver = this.A03;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.A02 = cursor;
        if (cursor != null) {
            C000600n r02 = this.A04;
            if (r02 != null) {
                cursor.registerContentObserver(r02);
            }
            DataSetObserver dataSetObserver2 = this.A03;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.A00 = cursor.getColumnIndexOrThrow("_id");
            this.A07 = true;
            notifyDataSetChanged();
            return cursor2;
        }
        this.A00 = -1;
        this.A07 = false;
        notifyDataSetInvalidated();
        return cursor2;
    }

    public int getCount() {
        Cursor cursor;
        if (!this.A07 || (cursor = this.A02) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.A07) {
            return null;
        }
        this.A02.moveToPosition(i);
        if (view == null) {
            view = A02(this.A01, this.A02, viewGroup);
        }
        A04(view, this.A01, this.A02);
        return view;
    }

    public Filter getFilter() {
        AnonymousClass03B r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass03B r02 = new AnonymousClass03B(this);
        this.A05 = r02;
        return r02;
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.A07 || (cursor = this.A02) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.A02;
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.A07 || (cursor = this.A02) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.A02.getLong(this.A00);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.A07) {
            throw AnonymousClass001.A0e("this should only be called when the cursor is valid");
        } else if (this.A02.moveToPosition(i)) {
            if (view == null) {
                view = A03(this.A01, this.A02, viewGroup);
            }
            A04(view, this.A01, this.A02);
            return view;
        } else {
            throw AnonymousClass001.A0e(AnonymousClass000.A0Y("couldn't move cursor to position ", AnonymousClass001.A0o(), i));
        }
    }

    public boolean hasStableIds() {
        return true;
    }

    public AnonymousClass034(Context context, Cursor cursor, boolean z) {
        A00(context, this);
    }

    public View A02(Context context, Cursor cursor, ViewGroup viewGroup) {
        return A03(context, cursor, viewGroup);
    }

    public void Ayj(Cursor cursor) {
        Cursor BqV = BqV(cursor);
        if (BqV != null) {
            BqV.close();
        }
    }

    public Cursor BkU(CharSequence charSequence) {
        return this.A02;
    }

    @Deprecated
    public AnonymousClass034(Context context) {
        A00(context, this);
    }
}
