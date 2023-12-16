package X;

import android.text.InputFilter;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaTextView;
import com.whatsapp.polls.PollCreatorViewModel;

/* renamed from: X.4yN  reason: invalid class name and case insensitive filesystem */
public class C97474yN extends AnonymousClass6I5 {
    public final WaEditText A00;
    public final WaTextView A01;
    public final boolean A02;

    public C97474yN(View view, C620633i r13, AnonymousClass487 r14, AnonymousClass5Y0 r15, AnonymousClass1VX r16, PollCreatorViewModel pollCreatorViewModel, C60152y5 r18) {
        super(view);
        AnonymousClass1VX r4 = r16;
        this.A02 = AnonymousClass29H.A00(r4);
        this.A01 = AnonymousClass0x7.A0L(view, R.id.poll_question_label);
        WaEditText waEditText = (WaEditText) C06560Yg.A02(view, R.id.poll_question_edit_text);
        this.A00 = waEditText;
        waEditText.setRawInputType(16385);
        waEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(5000), new C109095e4(r4.A0N(1406))});
        waEditText.setOnFocusChangeListener(new C1234768o(view, 1, this));
        waEditText.addTextChangedListener(new C109165eB(r13, r14, r15, this, pollCreatorViewModel, r18));
        waEditText.requestFocus();
    }
}
