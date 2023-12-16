package com.whatsapp.calling.chatmessages;

import X.AnonymousClass0IT;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass20D;
import X.AnonymousClass3ZF;
import X.AnonymousClass45M;
import X.AnonymousClass58H;
import X.AnonymousClass5UX;
import X.AnonymousClass66R;
import X.AnonymousClass8PJ;
import X.C003203q;
import X.C08310eF;
import X.C107215at;
import X.C107305b5;
import X.C111095hX;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18300x5;
import X.C18330xA;
import X.C187958y5;
import X.C195011k;
import X.C39572Cm;
import X.C615931l;
import X.C616131n;
import X.C627436k;
import X.C64333Db;
import X.C77003sh;
import X.C77013si;
import X.C77023sj;
import X.C80013xY;
import X.C80023xZ;
import X.C80033xa;
import X.C84814Du;
import X.C85494Gl;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.components.MaxHeightLinearLayout;
import com.whatsapp.util.Log;

public final class AdhocParticipantBottomSheet extends Hilt_AdhocParticipantBottomSheet {
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public C111095hX A04;
    public C39572Cm A05;
    public C195011k A06;
    public MaxHeightLinearLayout A07;
    public AnonymousClass1VX A08;
    public C187958y5 A09;
    public final AnonymousClass66R A0A;

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        if (C154517dI.A00(AnonymousClass58H.NONE, new C80013xY(this)).getValue() != null) {
            AnonymousClass1VX r1 = this.A08;
            if (r1 == null) {
                throw C18270x1.A0R();
            } else if (this.A09 == null) {
                throw C18270x1.A0S("systemFeatures");
            } else if (C627436k.A0G(r1)) {
                this.A07 = (MaxHeightLinearLayout) view;
                A1Y();
                C39572Cm r0 = this.A05;
                if (r0 != null) {
                    AnonymousClass45M r4 = new AnonymousClass45M(this);
                    C64333Db r12 = r0.A00.A04;
                    Context context = r12.AdE.A00;
                    C615931l.A00(context);
                    this.A06 = new C195011k(context, (AnonymousClass5UX) r12.A6K.get(), C64333Db.A29(r12), r4);
                    RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.adhoc_recycler_view);
                    C195011k r02 = this.A06;
                    if (r02 == null) {
                        throw C18270x1.A0S("adapter");
                    }
                    recyclerView.setAdapter(r02);
                    this.A02 = C18300x5.A0G(view, R.id.start_audio_call_button);
                    this.A03 = C18300x5.A0G(view, R.id.start_video_call_button);
                    this.A01 = C18300x5.A0G(view, R.id.title);
                    this.A00 = C18300x5.A0G(view, R.id.description);
                    TextView textView = this.A02;
                    if (textView != null) {
                        C18300x5.A18(textView, this, 44);
                    }
                    TextView textView2 = this.A03;
                    if (textView2 != null) {
                        C18300x5.A18(textView2, this, 45);
                    }
                    C616131n.A02((C85494Gl) null, new AdhocParticipantBottomSheet$initObservables$1(this, (C84814Du) null), AnonymousClass0IT.A00(A0V()), (AnonymousClass20D) null, 3);
                    return;
                }
                throw C18270x1.A0S("adapterFactory");
            }
        }
        Log.e("AdhocParticipantBottomSheet/onViewCreated abprops not enabled");
        A1L();
    }

    public void onConfigurationChanged(Configuration configuration) {
        C162457s7.A0J(configuration, 0);
        super.onConfigurationChanged(configuration);
        A1Y();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        int i;
        C162457s7.A0J(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        AdhocParticipantBottomSheetViewModel adhocParticipantBottomSheetViewModel = (AdhocParticipantBottomSheetViewModel) this.A0A.getValue();
        boolean z = adhocParticipantBottomSheetViewModel.A01;
        if (!z) {
            AnonymousClass3ZF r0 = adhocParticipantBottomSheetViewModel.A00;
            if (r0 != null) {
                int i2 = r0.A00;
                if (Integer.valueOf(i2) != null && (i2 == 2 || i2 == 4 || i2 == 1 || i2 == 0)) {
                    i = 7;
                    adhocParticipantBottomSheetViewModel.A06.A01.BhD(C107305b5.A03((String) null, i, adhocParticipantBottomSheetViewModel.A02, z));
                }
            }
            i = 8;
            adhocParticipantBottomSheetViewModel.A06.A01.BhD(C107305b5.A03((String) null, i, adhocParticipantBottomSheetViewModel.A02, z));
        }
    }

    public AdhocParticipantBottomSheet() {
        super(R.layout.f8nameremoved);
        AnonymousClass66R A002 = C154517dI.A00(AnonymousClass58H.NONE, new C77013si(new C77003sh(this)));
        AnonymousClass8PJ A1E = AnonymousClass0x9.A1E(AdhocParticipantBottomSheetViewModel.class);
        this.A0A = C18330xA.A02(new C77023sj(A002), new C80033xa(this, A002), new C80023xZ(A002), A1E);
    }

    public void A0c() {
        super.A0c();
        this.A02 = null;
        this.A03 = null;
        this.A01 = null;
        this.A00 = null;
        this.A07 = null;
    }

    public final void A1Y() {
        C003203q A0Q = A0Q();
        if (A0Q != null) {
            float f = 0.85f;
            if (C08310eF.A09(this).getConfiguration().orientation == 2) {
                f = 1.0f;
            }
            MaxHeightLinearLayout maxHeightLinearLayout = this.A07;
            if (maxHeightLinearLayout != null) {
                maxHeightLinearLayout.setMaxHeight((int) (((float) C107215at.A00(A0Q)) * f));
            }
        }
    }
}
