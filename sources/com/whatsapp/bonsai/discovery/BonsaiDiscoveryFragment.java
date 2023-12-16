package com.whatsapp.bonsai.discovery;

import X.AnonymousClass0x9;
import X.AnonymousClass2PY;
import X.AnonymousClass442;
import X.AnonymousClass4K2;
import X.AnonymousClass5ZU;
import X.AnonymousClass8PJ;
import X.C105365Uq;
import X.C114015mM;
import X.C116985rC;
import X.C13750ng;
import X.C15910sA;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18330xA;
import X.C194811i;
import X.C54292oU;
import X.C76873sU;
import X.C76883sV;
import X.C79973xU;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.contact.photos.ContactPhotos$LoaderLifecycleEventObserver;

public final class BonsaiDiscoveryFragment extends Hilt_BonsaiDiscoveryFragment {
    public C116985rC A00;
    public AnonymousClass2PY A01;
    public AnonymousClass5ZU A02;
    public C105365Uq A03;
    public C114015mM A04;
    public C54292oU A05;

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        AnonymousClass8PJ A1E = AnonymousClass0x9.A1E(BonsaiDiscoveryViewModel.class);
        C13750ng A022 = C18330xA.A02(new C76873sU(this), new C76883sV(this), new C79973xU(this), A1E);
        int i = A0H().getInt("position");
        RecyclerView recyclerView = (RecyclerView) C18280x3.A0E(view, R.id.contacts);
        A1D();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        recyclerView.setLayoutManager(gridLayoutManager);
        C114015mM r4 = this.A04;
        if (r4 != null) {
            C15910sA A0V = A0V();
            C105365Uq A07 = r4.A07("bonsai-discovery", 0.0f, C18290x4.A0G(view).getDimensionPixelSize(R.dimen.f6nameremoved));
            A0V.getLifecycle().A00(new ContactPhotos$LoaderLifecycleEventObserver(A07));
            this.A03 = A07;
            C194811i r42 = new C194811i(this);
            recyclerView.setAdapter(r42);
            AnonymousClass4K2.A00(A0V(), ((BonsaiDiscoveryViewModel) A022.getValue()).A00, new AnonymousClass442(gridLayoutManager, r42, i), 10);
            return;
        }
        throw C18270x1.A0S("contactPhotos");
    }

    public BonsaiDiscoveryFragment() {
        super(R.layout.f8nameremoved);
    }
}
