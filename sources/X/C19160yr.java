package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.inappsupport.ui.SupportTopicsActivity;
import java.util.ArrayList;

/* renamed from: X.0yr  reason: invalid class name and case insensitive filesystem */
public class C19160yr extends BaseAdapter {
    public SupportTopicsActivity A00;
    public ArrayList A01;

    public int getCount() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A01.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass2OH r0;
        C108955dq r5 = (C108955dq) this.A01.get(i);
        if (view == null) {
            r0 = new AnonymousClass2OH(this);
            view = LayoutInflater.from(this.A00).inflate(R.layout.f8nameremoved, viewGroup, false);
            r0.A01 = (WaTextView) view.findViewById(R.id.topic_title);
            r0.A00 = view.findViewById(R.id.topic_divider);
            view.setTag(r0);
        } else {
            r0 = (AnonymousClass2OH) view.getTag();
        }
        WaTextView waTextView = r0.A01;
        waTextView.setText(r5.A03);
        C18310x6.A19(waTextView, this, r5, 21);
        if (this.A00.A01 == 2) {
            int i2 = (int) (Resources.getSystem().getDisplayMetrics().density * 16.0f);
            waTextView.setPadding(i2, i2, i2, i2);
            r0.A00.setVisibility(0);
            return view;
        }
        r0.A00.setVisibility(8);
        return view;
    }

    public C19160yr(SupportTopicsActivity supportTopicsActivity, ArrayList arrayList) {
        this.A00 = supportTopicsActivity;
        this.A01 = arrayList;
    }
}
