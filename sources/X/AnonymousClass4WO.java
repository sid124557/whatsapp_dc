package X;

import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.whatsapp.R;
import com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel;
import java.util.List;

/* renamed from: X.4WO  reason: invalid class name */
public final class AnonymousClass4WO extends AnonymousClass0R6 {
    public final CallRatingViewModel A00;
    public final List A01;

    public AnonymousClass4WO(CallRatingViewModel callRatingViewModel, List list) {
        C162457s7.A0J(callRatingViewModel, 2);
        this.A01 = list;
        this.A00 = callRatingViewModel;
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        return new C125476Ie(C18300x5.A0F(C86604Kt.A0E(viewGroup, 0), viewGroup, R.layout.f8nameremoved), this);
    }

    public int A0G() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r6, int i) {
        C125476Ie r62 = (C125476Ie) r6;
        C162457s7.A0J(r62, 0);
        AnonymousClass7Y9 r4 = (AnonymousClass7Y9) this.A01.get(i);
        C162457s7.A0J(r4, 0);
        r62.A01.setText(r4.A00);
        C18300x5.A18(r62.A0H, r62, 43);
        AppCompatCheckBox appCompatCheckBox = r62.A00;
        AnonymousClass4WO r2 = r62.A02;
        appCompatCheckBox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        appCompatCheckBox.setChecked(C86624Kv.A1a(r2.A00.A0E, r4.A01.ordinal()));
        appCompatCheckBox.setOnCheckedChangeListener(new C167117zn(r2, r4));
    }
}
