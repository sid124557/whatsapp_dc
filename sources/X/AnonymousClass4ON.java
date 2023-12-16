package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4ON  reason: invalid class name */
public final class AnonymousClass4ON extends ArrayAdapter {
    public int A00;
    public final C106175Xx A01;
    public final List A02;

    public View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass7LI r1;
        C162457s7.A0J(viewGroup, 2);
        boolean z = false;
        if (view == null) {
            view = C18310x6.A0I(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved, false);
            r1 = new AnonymousClass7LI();
            view.setTag(r1);
            r1.A02 = C86614Ku.A0I(view);
            r1.A01 = AnonymousClass002.A09(view, R.id.subtitle);
            r1.A00 = (RadioButton) view.findViewById(R.id.radio);
        } else {
            Object tag = view.getTag();
            C162457s7.A0K(tag, "null cannot be cast to non-null type com.whatsapp.registration.SelectPhoneNumberDialog.MyArrayAdapter.ViewHolder");
            r1 = (AnonymousClass7LI) tag;
        }
        C108685dO r8 = (C108685dO) this.A02.get(i);
        String str = r8.A00;
        String str2 = r8.A02;
        TextView textView = r1.A02;
        if (textView != null) {
            textView.setText(AnonymousClass36l.A0A(this.A01, str, AnonymousClass000.A0T(str, str2)));
        }
        TextView textView2 = r1.A01;
        if (textView2 != null) {
            Context context = viewGroup.getContext();
            Object[] objArr = new Object[2];
            AnonymousClass000.A1P(objArr, i + 1, 0);
            objArr[1] = r8.A01;
            AnonymousClass001.A0y(context, textView2, objArr, R.string.f11nameremoved);
        }
        RadioButton radioButton = r1.A00;
        if (radioButton != null) {
            if (i == this.A00) {
                z = true;
            }
            radioButton.setChecked(z);
        }
        return view;
    }

    public int getCount() {
        return this.A02.size();
    }

    public AnonymousClass4ON(Context context, C106175Xx r3, List list) {
        super(context, R.layout.f8nameremoved, list);
        this.A01 = r3;
        this.A02 = list;
    }
}
