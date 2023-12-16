package com.whatsapp.calling.chatmessages;

import X.AnonymousClass0IT;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass20D;
import X.AnonymousClass41H;
import X.AnonymousClass58H;
import X.AnonymousClass5UX;
import X.AnonymousClass66R;
import X.AnonymousClass8PJ;
import X.C003203q;
import X.C08310eF;
import X.C107215at;
import X.C111095hX;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18300x5;
import X.C18330xA;
import X.C187958y5;
import X.C195111l;
import X.C39582Cn;
import X.C615931l;
import X.C616131n;
import X.C627436k;
import X.C64333Db;
import X.C77063sn;
import X.C77073so;
import X.C77083sp;
import X.C80043xb;
import X.C80053xc;
import X.C80063xd;
import X.C84814Du;
import X.C85494Gl;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.components.MaxHeightLinearLayout;
import com.whatsapp.util.Log;

public final class CallLogMessageParticipantBottomSheet extends Hilt_CallLogMessageParticipantBottomSheet {
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public C111095hX A03;
    public C39582Cn A04;
    public C195111l A05;
    public MaxHeightLinearLayout A06;
    public AnonymousClass1VX A07;
    public C187958y5 A08;
    public final AnonymousClass66R A09;

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        if (C154517dI.A00(AnonymousClass58H.NONE, new C80043xb(this)).getValue() != null) {
            AnonymousClass1VX r1 = this.A07;
            if (r1 == null) {
                throw C18270x1.A0R();
            } else if (this.A08 == null) {
                throw C18270x1.A0S("systemFeatures");
            } else if (C627436k.A0G(r1)) {
                this.A06 = (MaxHeightLinearLayout) view;
                A1Y();
                C39582Cn r0 = this.A04;
                if (r0 != null) {
                    AnonymousClass41H r4 = new AnonymousClass41H(this);
                    C64333Db r12 = r0.A00.A04;
                    Context context = r12.AdE.A00;
                    C615931l.A00(context);
                    this.A05 = new C195111l(context, (AnonymousClass5UX) r12.A6K.get(), C64333Db.A29(r12), r4);
                    RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
                    C195111l r02 = this.A05;
                    if (r02 == null) {
                        throw C18270x1.A0S("adapter");
                    }
                    recyclerView.setAdapter(r02);
                    this.A02 = C18300x5.A0G(view, R.id.start_group_call_button);
                    this.A01 = C18300x5.A0G(view, R.id.title);
                    this.A00 = C18300x5.A0G(view, R.id.description);
                    TextView textView = this.A02;
                    if (textView != null) {
                        C18300x5.A18(textView, this, 46);
                    }
                    C616131n.A02((C85494Gl) null, new CallLogMessageParticipantBottomSheet$initObservables$1(this, (C84814Du) null), AnonymousClass0IT.A00(A0V()), (AnonymousClass20D) null, 3);
                    return;
                }
                throw C18270x1.A0S("adapterFactory");
            }
        }
        Log.e("CallLogMessageParticipantBottomSheet/onViewCreated abprops not enabled");
        A1L();
    }

    public void onConfigurationChanged(Configuration configuration) {
        C162457s7.A0J(configuration, 0);
        super.onConfigurationChanged(configuration);
        A1Y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r0.A02 != 0) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDismiss(android.content.DialogInterface r6) {
        /*
            r5 = this;
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            super.onDismiss(r6)
            X.66R r0 = r5.A09
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel r4 = (com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel) r4
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x0052
            boolean r0 = r4.A04
            r3 = 1
            if (r0 == 0) goto L_0x0024
            X.3ZF r0 = r4.A00
            if (r0 == 0) goto L_0x0024
            r0.A0A()
            int r0 = r0.A02
            r2 = 1
            if (r0 == 0) goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            X.3ZF r0 = r4.A00
            if (r0 == 0) goto L_0x0053
            int r1 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x0053
            r0 = 2
            if (r1 == r0) goto L_0x003b
            r0 = 4
            if (r1 == r0) goto L_0x003b
            if (r1 == r3) goto L_0x003b
            if (r1 != 0) goto L_0x0053
        L_0x003b:
            if (r2 != 0) goto L_0x0041
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x0053
        L_0x0041:
            r3 = 7
        L_0x0042:
            boolean r2 = r4.A03
            boolean r1 = r4.A02
            r0 = 0
            X.4rh r1 = X.C107305b5.A03(r0, r3, r2, r1)
            X.5Z0 r0 = r4.A08
            X.4FV r0 = r0.A01
            r0.BhD(r1)
        L_0x0052:
            return
        L_0x0053:
            r3 = 8
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheet.onDismiss(android.content.DialogInterface):void");
    }

    public CallLogMessageParticipantBottomSheet() {
        super(R.layout.f8nameremoved);
        AnonymousClass66R A002 = C154517dI.A00(AnonymousClass58H.NONE, new C77073so(new C77063sn(this)));
        AnonymousClass8PJ A1E = AnonymousClass0x9.A1E(CallLogMessageParticipantBottomSheetViewModel.class);
        this.A09 = C18330xA.A02(new C77083sp(A002), new C80063xd(this, A002), new C80053xc(A002), A1E);
    }

    public void A0c() {
        super.A0c();
        this.A02 = null;
        this.A01 = null;
        this.A00 = null;
        this.A06 = null;
    }

    public final void A1Y() {
        C003203q A0Q = A0Q();
        if (A0Q != null) {
            float f = 0.85f;
            if (C08310eF.A09(this).getConfiguration().orientation == 2) {
                f = 1.0f;
            }
            MaxHeightLinearLayout maxHeightLinearLayout = this.A06;
            if (maxHeightLinearLayout != null) {
                maxHeightLinearLayout.setMaxHeight((int) (((float) C107215at.A00(A0Q)) * f));
            }
        }
    }
}
