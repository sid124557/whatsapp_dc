package X;

import android.view.View;
import com.whatsapp.WaEditText;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel$onSearchInputFocusChanged$1;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet;

/* renamed from: X.39u  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C635839u implements View.OnFocusChangeListener {
    public final /* synthetic */ WaEditText A00;
    public final /* synthetic */ ExpressionsKeyboardSearchBottomSheet A01;

    public final void onFocusChange(View view, boolean z) {
        String str;
        ExpressionsKeyboardSearchBottomSheet expressionsKeyboardSearchBottomSheet = this.A01;
        WaEditText waEditText = this.A00;
        ExpressionsSearchViewModel A0L = C18320x8.A0L(expressionsKeyboardSearchBottomSheet);
        String valueOf = String.valueOf(waEditText.getText());
        C162457s7.A0J(valueOf, 0);
        if (z) {
            C616131n.A02((C85494Gl) null, new ExpressionsSearchViewModel$onSearchInputFocusChanged$1(A0L, valueOf, (C84814Du) null), AnonymousClass0IV.A00(A0L), (AnonymousClass20D) null, 3);
            return;
        }
        int indexOf = A0L.A04.indexOf(A0L.A03);
        if (A0L.A04.isEmpty()) {
            str = "expression_search_input_focus_failed_expression_tabs_is_empty";
        } else if (indexOf < 0) {
            str = "expression_search_input_focus_failed";
        } else {
            AnonymousClass08M r1 = A0L.A07;
            C41552Kr r5 = A0L.A03;
            r1.A0H(new AnonymousClass1TQ(A0L.A02, r5, A0L.A04, A0L.A04.indexOf(r5), false));
            return;
        }
        A0L.A0F(str, Integer.valueOf(indexOf));
    }

    public /* synthetic */ C635839u(WaEditText waEditText, ExpressionsKeyboardSearchBottomSheet expressionsKeyboardSearchBottomSheet) {
        this.A01 = expressionsKeyboardSearchBottomSheet;
        this.A00 = waEditText;
    }
}
