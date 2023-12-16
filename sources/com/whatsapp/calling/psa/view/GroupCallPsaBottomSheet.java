package com.whatsapp.calling.psa.view;

import X.AnonymousClass0IT;
import X.AnonymousClass0x9;
import X.AnonymousClass20D;
import X.AnonymousClass2FB;
import X.AnonymousClass4GP;
import X.AnonymousClass5Vo;
import X.AnonymousClass66R;
import X.AnonymousClass7PH;
import X.AnonymousClass8PJ;
import X.C06560Yg;
import X.C139796sd;
import X.C162457s7;
import X.C18270x1;
import X.C18300x5;
import X.C18330xA;
import X.C196111w;
import X.C616131n;
import X.C77233t4;
import X.C77243t5;
import X.C80153xm;
import X.C84814Du;
import X.C85494Gl;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.calling.psa.viewmodel.GroupCallPsaViewModel;

public final class GroupCallPsaBottomSheet extends Hilt_GroupCallPsaBottomSheet {
    public TextView A00;
    public RecyclerView A01;
    public C196111w A02;
    public AnonymousClass4GP A03;
    public final int A04 = R.layout.f8nameremoved;
    public final AnonymousClass66R A05;

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        this.A00 = C18300x5.A0G(view, R.id.psa_title);
        RecyclerView recyclerView = (RecyclerView) C06560Yg.A02(view, R.id.group_recycler_view);
        this.A01 = recyclerView;
        if (recyclerView != null) {
            C196111w r0 = this.A02;
            if (r0 != null) {
                recyclerView.setAdapter(r0);
            } else {
                throw C18270x1.A0S("adapter");
            }
        }
        C196111w r1 = this.A02;
        if (r1 != null) {
            r1.A00 = new AnonymousClass2FB(this);
            RecyclerView recyclerView2 = this.A01;
            if (recyclerView2 != null) {
                A0G();
                C18270x1.A0u(recyclerView2);
            }
            C616131n.A02((C85494Gl) null, new GroupCallPsaBottomSheet$onViewCreated$2(this, (C84814Du) null), AnonymousClass0IT.A00(A0V()), (AnonymousClass20D) null, 3);
            return;
        }
        throw C18270x1.A0S("adapter");
    }

    public void A1W(AnonymousClass5Vo r3) {
        C162457s7.A0J(r3, 0);
        AnonymousClass7PH r1 = r3.A00;
        r1.A06 = true;
        r1.A04 = C139796sd.A00;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        AnonymousClass4GP r0 = this.A03;
        if (r0 != null) {
            r0.invoke();
        }
    }

    public GroupCallPsaBottomSheet() {
        AnonymousClass8PJ A1E = AnonymousClass0x9.A1E(GroupCallPsaViewModel.class);
        this.A05 = C18330xA.A02(new C77233t4(this), new C77243t5(this), new C80153xm(this), A1E);
    }

    public void A0c() {
        super.A0c();
        this.A00 = null;
        this.A01 = null;
    }

    public int A1S() {
        return this.A04;
    }
}
