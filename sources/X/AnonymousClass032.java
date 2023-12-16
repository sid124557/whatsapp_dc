package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.032  reason: invalid class name */
public class AnonymousClass032 extends BaseAdapter {
    public int A00 = -1;
    public final /* synthetic */ AnonymousClass0b9 A01;

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.A01.A01.inflate(R.layout.f8nameremoved, viewGroup, false);
        }
        C16480tT r2 = (C16480tT) view;
        C07890cz r0 = this.A01.A04;
        r0.A06();
        ArrayList arrayList = r0.A08;
        int i2 = this.A00;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        r2.BGB(AnonymousClass001.A0V(arrayList, i), 0);
        return view;
    }

    public AnonymousClass032(AnonymousClass0b9 r2) {
        this.A01 = r2;
        A00();
    }

    public void A00() {
        C07890cz r0 = this.A01.A04;
        C07910d1 r4 = r0.A04;
        if (r4 != null) {
            r0.A06();
            ArrayList arrayList = r0.A08;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == r4) {
                    this.A00 = i;
                    return;
                }
            }
        }
        this.A00 = -1;
    }

    public int getCount() {
        C07890cz r0 = this.A01.A04;
        r0.A06();
        int size = r0.A08.size();
        if (this.A00 >= 0) {
            return size - 1;
        }
        return size;
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        C07890cz r0 = this.A01.A04;
        r0.A06();
        ArrayList arrayList = r0.A08;
        int i2 = this.A00;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return AnonymousClass001.A0V(arrayList, i);
    }

    public void notifyDataSetChanged() {
        A00();
        super.notifyDataSetChanged();
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
