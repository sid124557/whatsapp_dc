package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4OJ  reason: invalid class name */
public class AnonymousClass4OJ extends ArrayAdapter {
    public int A00 = 0;
    public final List A01;

    public View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = C18280x3.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false);
        }
        TextView A0G = C18300x5.A0G(view, R.id.title);
        TextView A0G2 = C18300x5.A0G(view, R.id.subtitle);
        CompoundButton compoundButton = (CompoundButton) C06560Yg.A02(view, R.id.phone_number_selection_radio_button);
        AnonymousClass541 r3 = new AnonymousClass541(this, i, 3);
        C108675dN r2 = (C108675dN) this.A01.get(i);
        String str = r2.A01;
        if (TextUtils.isEmpty(str)) {
            A0G.setVisibility(8);
        } else {
            A0G.setVisibility(0);
            A0G.setText(str);
        }
        A0G2.setText(r2.A00);
        if (i == this.A00) {
            z = true;
        }
        compoundButton.setChecked(z);
        compoundButton.setOnClickListener(r3);
        view.setOnClickListener(r3);
        return view;
    }

    public AnonymousClass4OJ(Context context, List list) {
        super(context, R.layout.f8nameremoved, list);
        this.A01 = list;
    }
}
