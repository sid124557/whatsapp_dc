package X;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.polls.PollCreatorViewModel;

/* renamed from: X.5eB  reason: invalid class name and case insensitive filesystem */
public class C109165eB implements TextWatcher {
    public final /* synthetic */ C620633i A00;
    public final /* synthetic */ AnonymousClass487 A01;
    public final /* synthetic */ AnonymousClass5Y0 A02;
    public final /* synthetic */ C97474yN A03;
    public final /* synthetic */ PollCreatorViewModel A04;
    public final /* synthetic */ C60152y5 A05;

    public C109165eB(C620633i r1, AnonymousClass487 r2, AnonymousClass5Y0 r3, C97474yN r4, PollCreatorViewModel pollCreatorViewModel, C60152y5 r6) {
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A05 = r6;
        this.A01 = r2;
        this.A04 = pollCreatorViewModel;
    }

    public void afterTextChanged(Editable editable) {
        C97474yN r1 = this.A03;
        WaEditText waEditText = r1.A00;
        Context context = waEditText.getContext();
        AnonymousClass5Y0 r6 = this.A02;
        Editable editable2 = editable;
        C107635bd.A0F(context, editable2, waEditText.getPaint(), this.A00, r6, this.A05, R.color.f5nameremoved, r1.A02);
        C107345b9.A07(waEditText.getContext(), waEditText.getPaint(), editable, r6);
        this.A04.A08.A00 = editable.toString();
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
