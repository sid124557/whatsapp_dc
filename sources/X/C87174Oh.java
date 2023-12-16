package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.documentpicker.DocumentPickerActivity;
import java.io.File;
import java.util.List;

/* renamed from: X.4Oh  reason: invalid class name and case insensitive filesystem */
public class C87174Oh extends BaseAdapter implements Filterable {
    public final C87274Ou A00;
    public final /* synthetic */ DocumentPickerActivity A01;

    public View getView(int i, View view, ViewGroup viewGroup) {
        C102635Jr r7;
        String A08;
        int i2 = 0;
        if (view != null) {
            r7 = (C102635Jr) view.getTag();
        } else {
            view = C86664Kz.A0g(this.A01.getLayoutInflater(), R.layout.f8nameremoved);
            r7 = new C102635Jr(view);
            view.setTag(r7);
        }
        DocumentPickerActivity documentPickerActivity = this.A01;
        List list = documentPickerActivity.A0U;
        if (list != null) {
            AnonymousClass5QG r5 = (AnonymousClass5QG) list.get(i);
            ImageView imageView = r7.A01;
            Context context = view.getContext();
            File file = r5.A02;
            if (file == null) {
                A08 = "";
            } else {
                A08 = C627536m.A08(file.getAbsolutePath());
                C162457s7.A0D(A08);
            }
            String A0X = C107655bf.A0X(A08);
            C162457s7.A0D(A0X);
            C162457s7.A0H(context);
            Drawable A012 = AnonymousClass5VP.A01(context, A0X, A08, false);
            C162457s7.A0D(A012);
            imageView.setImageDrawable(A012);
            r7.A04.setText(C86644Kx.A0d(view.getContext(), documentPickerActivity.A0I, C107075ae.A03, file.getName(), documentPickerActivity.A0S));
            C86634Kw.A1J(r7.A03, documentPickerActivity.A0I, r5.A01);
            TextView textView = r7.A02;
            C620733j r0 = documentPickerActivity.A0I;
            long j = r5.A00;
            textView.setText(C107565bW.A0F(r0, j, false));
            textView.setContentDescription(C107565bW.A0F(documentPickerActivity.A0I, j, true));
            View view2 = r7.A00;
            C18300x5.A13(documentPickerActivity, view2, R.string.f11nameremoved);
            if (documentPickerActivity.A0Y.contains(r5)) {
                view.setBackgroundResource(R.drawable.contact_row_selection);
            } else {
                view.setBackgroundResource(0);
                i2 = 8;
            }
            view2.setVisibility(i2);
        }
        return view;
    }

    public C87174Oh(DocumentPickerActivity documentPickerActivity) {
        this.A01 = documentPickerActivity;
        this.A00 = new C87274Ou(documentPickerActivity);
    }

    public int getCount() {
        return C86614Ku.A08(this.A01.A0U);
    }

    public Filter getFilter() {
        return this.A00;
    }

    public Object getItem(int i) {
        List list = this.A01.A0U;
        if (list == null) {
            return null;
        }
        return list.get(i);
    }

    public boolean isEmpty() {
        return false;
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
