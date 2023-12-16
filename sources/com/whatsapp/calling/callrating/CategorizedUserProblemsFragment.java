package com.whatsapp.calling.callrating;

import X.AnonymousClass0R6;
import X.AnonymousClass0YZ;
import X.AnonymousClass0x2;
import X.AnonymousClass52L;
import X.AnonymousClass5Y0;
import X.AnonymousClass66R;
import X.C102555Jh;
import X.C104475Rc;
import X.C109095e4;
import X.C119055wM;
import X.C119065wN;
import X.C119075wO;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C18310x6;
import X.C18320x8;
import X.C183538qC;
import X.C86664Kz;
import X.C999658w;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel;
import java.util.ArrayList;

public final class CategorizedUserProblemsFragment extends Hilt_CategorizedUserProblemsFragment {
    public View A00;
    public C183538qC A01;
    public final AnonymousClass66R A02 = C154517dI.A01(new C119055wM(this));
    public final AnonymousClass66R A03 = C154517dI.A01(new C119065wN(this));
    public final AnonymousClass66R A04 = C154517dI.A01(new C119075wO(this));

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return C18310x6.A0I(layoutInflater, viewGroup, R.layout.f8nameremoved, false);
    }

    public void A0w(Bundle bundle, View view) {
        View view2 = view;
        C162457s7.A0J(view2, 0);
        RecyclerView A0w = C86664Kz.A0w(view2, R.id.user_problems_recycler_view);
        int i = 0;
        AnonymousClass0YZ.A0G(A0w, false);
        view2.getContext();
        C18320x8.A19(A0w, 1);
        A0w.setAdapter((AnonymousClass0R6) this.A03.getValue());
        View findViewById = view2.findViewById(R.id.user_problem_free_text_layout);
        AnonymousClass66R r6 = this.A04;
        CallRatingViewModel A14 = C86664Kz.A14(r6);
        int A09 = AnonymousClass0x2.A09(this.A02);
        ArrayList arrayList = A14.A0D;
        if (A09 >= arrayList.size() || ((C104475Rc) arrayList.get(A09)).A00 != C999658w.OTHER) {
            i = 8;
        } else {
            C183538qC r0 = this.A01;
            if (r0 != null) {
                C102555Jh r2 = (C102555Jh) r0.get();
                WaEditText waEditText = (WaEditText) C18290x4.A0M(view2, R.id.user_problem_descriptive_text);
                CallRatingViewModel A142 = C86664Kz.A14(r6);
                C162457s7.A0J(waEditText, 0);
                C162457s7.A0J(A142, 1);
                C109095e4.A00(waEditText, new C109095e4[1], EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
                AnonymousClass5Y0 r12 = r2.A03;
                waEditText.addTextChangedListener(new AnonymousClass52L(waEditText, A142, r2.A00, r2.A01, r2.A02, r12, r2.A04));
            } else {
                throw C18270x1.A0S("userFeedbackTextFilter");
            }
        }
        findViewById.setVisibility(i);
        this.A00 = findViewById;
    }

    public void A0c() {
        super.A0c();
        this.A00 = null;
    }
}
