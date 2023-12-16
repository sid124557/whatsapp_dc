package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: X.4OT  reason: invalid class name */
public final class AnonymousClass4OT extends BaseAdapter {
    public final ArrayList A00;

    public int getCount() {
        return this.A00.size();
    }

    public Object getItem(int i) {
        return C86654Ky.A0j(this.A00, i);
    }

    public AnonymousClass4OT(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        Object item = getItem(i);
        C162457s7.A0K(item, "null cannot be cast to non-null type com.whatsapp.components.button.ThumbnailButton");
        return (View) item;
    }
}
