package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.4OL  reason: invalid class name */
public final class AnonymousClass4OL extends ArrayAdapter {
    public List A00;
    public final C55682qk A01;
    public final C620733j A02;

    public View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass5K5 r1;
        String A0I;
        WaTextView waTextView;
        int i2;
        C162457s7.A0J(viewGroup, 2);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.f8nameremoved, viewGroup, false);
            r1 = new AnonymousClass5K5(view);
            view.setTag(r1);
        } else {
            Object tag = view.getTag();
            C162457s7.A0K(tag, "null cannot be cast to non-null type com.whatsapp.accountswitching.ui.AccountSwitchingAdapter.ViewHolder");
            r1 = (AnonymousClass5K5) tag;
        }
        if (i >= this.A00.size()) {
            Log.i("AccountSwitchingAdapter/getView/position >= items.size");
            this.A01.A0A("AccountSwitchingAdapter/AdapterSizeMismatch", false, "position >= items.size");
            return view;
        }
        AnonymousClass3Z6 r10 = (AnonymousClass3Z6) this.A00.get(i);
        WaTextView waTextView2 = r1.A04;
        waTextView2.setText(((C53892nq) r10.first).A08);
        WaTextView waTextView3 = r1.A05;
        C620733j r4 = this.A02;
        waTextView3.setText(r4.A0I(AnonymousClass36P.A06(AnonymousClass32X.A00(((C53892nq) r10.first).A06))));
        Bitmap bitmap = (Bitmap) r10.second;
        WaImageView waImageView = r1.A02;
        if (bitmap == null) {
            waImageView.setImageResource(R.drawable.avatar_contact);
        } else {
            waImageView.setImageBitmap(bitmap);
        }
        ConstraintLayout constraintLayout = r1.A01;
        if (i == 0) {
            C86624Kv.A0h(getContext(), constraintLayout, new Object[]{waTextView2.getText(), waTextView3.getText()}, R.string.f11nameremoved);
            waTextView2.setTypeface(waTextView2.getTypeface(), 1);
            r1.A00.setChecked(true);
        } else {
            C86624Kv.A0h(getContext(), constraintLayout, new Object[]{waTextView2.getText(), waTextView3.getText()}, R.string.f11nameremoved);
            r1.A00.setChecked(false);
            int i3 = ((C53892nq) r10.first).A00;
            if (i3 > 0) {
                if (i3 < 9) {
                    A0I = String.valueOf(i3);
                } else {
                    A0I = r4.A0I(getContext().getString(R.string.f11nameremoved));
                }
                waTextView = r1.A03;
                waTextView.setText(A0I);
                i2 = 0;
                waTextView.setVisibility(i2);
                return view;
            }
        }
        waTextView = r1.A03;
        i2 = 8;
        waTextView.setVisibility(i2);
        return view;
    }

    public AnonymousClass4OL(Context context, C55682qk r3, C620733j r4, List list) {
        super(context, R.layout.f8nameremoved, list);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = list;
    }
}
