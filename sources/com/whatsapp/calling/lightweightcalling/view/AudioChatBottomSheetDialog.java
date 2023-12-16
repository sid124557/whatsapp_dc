package com.whatsapp.calling.lightweightcalling.view;

import X.AnonymousClass001;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass1VX;
import X.AnonymousClass30V;
import X.AnonymousClass32V;
import X.AnonymousClass3XG;
import X.AnonymousClass4FS;
import X.AnonymousClass4VK;
import X.AnonymousClass58H;
import X.AnonymousClass5UY;
import X.AnonymousClass60Q;
import X.AnonymousClass66R;
import X.AnonymousClass746;
import X.AnonymousClass7DG;
import X.AnonymousClass8PJ;
import X.AnonymousClass8XH;
import X.AnonymousClass93G;
import X.C003203q;
import X.C06560Yg;
import X.C1001059l;
import X.C1001359q;
import X.C106895aL;
import X.C107215at;
import X.C109315eQ;
import X.C111095hX;
import X.C117695sL;
import X.C13750ng;
import X.C154517dI;
import X.C158547k9;
import X.C162457s7;
import X.C170938Fc;
import X.C174668Vk;
import X.C174678Vl;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C77133su;
import X.C77143sv;
import X.C77153sw;
import X.C77163sx;
import X.C77173sy;
import X.C80093xg;
import X.C80103xh;
import X.C80113xi;
import X.C80123xj;
import X.C86604Kt;
import X.C86614Ku;
import X.C95814uZ;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.callgrid.view.CallGrid;
import com.whatsapp.calling.callgrid.viewmodel.VoiceChatGridViewModel;
import com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel;
import com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel;
import com.whatsapp.components.MaxHeightLinearLayout;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;

public final class AudioChatBottomSheetDialog extends Hilt_AudioChatBottomSheetDialog {
    public View A00;
    public BottomSheetBehavior A01;
    public C111095hX A02;
    public WaTextView A03;
    public CallGrid A04;
    public AudioChatBottomSheetFooterView A05;
    public AnonymousClass3XG A06;
    public MaxHeightLinearLayout A07;
    public AnonymousClass1VX A08;
    public AnonymousClass30V A09;
    public AnonymousClass5UY A0A;
    public AnonymousClass5UY A0B;
    public AnonymousClass5UY A0C;
    public AnonymousClass5UY A0D;
    public AnonymousClass4FS A0E;
    public boolean A0F;
    public final int A0G = R.layout.f8nameremoved;
    public final AnonymousClass66R A0H;
    public final AnonymousClass66R A0I;
    public final AnonymousClass66R A0J;
    public final AnonymousClass66R A0K;

    public void A0w(Bundle bundle, View view) {
        String str;
        String str2;
        Integer num;
        String str3;
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            str = bundle2.getString("audio_chat_call_id");
        } else {
            str = null;
        }
        AnonymousClass32V r3 = GroupJid.Companion;
        Bundle bundle3 = this.A06;
        if (bundle3 != null) {
            str2 = bundle3.getString("voice_chat_group_jid");
        } else {
            str2 = null;
        }
        GroupJid A032 = r3.A03(str2);
        Bundle bundle4 = this.A06;
        if (bundle4 != null) {
            num = Integer.valueOf(bundle4.getInt("voice_chat_call_from_ui"));
        } else {
            num = null;
        }
        if (str == null) {
            AnonymousClass1VX r1 = this.A08;
            if (r1 != null) {
                if (r1.A0N(5429) == 0) {
                    str3 = "AudioChatBottomSheetDialog/onViewCreated no call id argument";
                } else if (A032 == null || (num != null && num.intValue() == 0)) {
                    str3 = "AudioChatBottomSheetDialog/onViewCreated no groupJid or callFromUi argument";
                }
                Log.e(str3);
                A1L();
                return;
            }
            throw C18270x1.A0R();
        }
        ViewParent parent = view.getParent();
        C162457s7.A0K(parent, "null cannot be cast to non-null type android.view.View");
        BottomSheetBehavior A012 = BottomSheetBehavior.A01((View) parent);
        this.A01 = A012;
        if (A012 != null) {
            A012.A0U(0, false);
        }
        BottomSheetBehavior bottomSheetBehavior = this.A01;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.A0S(3);
        }
        A0T().A0j(new AnonymousClass93G(this, 0), A0V(), "participant_list_request");
        ViewParent parent2 = view.getParent();
        C162457s7.A0K(parent2, "null cannot be cast to non-null type android.view.View");
        C86614Ku.A11(view.getContext(), (View) parent2, R.drawable.audio_chat_activity_bottom_sheet_background);
        this.A07 = (MaxHeightLinearLayout) view;
        A1Z();
        View A0E2 = C18280x3.A0E(view, R.id.minimize_btn);
        if (C1001059l.A04) {
            ImageView A0J2 = C86604Kt.A0J(A0E2, R.id.minimize_icon);
            ViewGroup.LayoutParams layoutParams = A0J2.getLayoutParams();
            if (layoutParams != null) {
                int dimensionPixelSize = A0J2.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                layoutParams.height = dimensionPixelSize;
                layoutParams.width = dimensionPixelSize;
                C106895aL.A01(A0J2, new C158547k9(0, A0J2.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), 0, 0));
                A0J2.setLayoutParams(layoutParams);
                A0J2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            } else {
                throw AnonymousClass001.A0g("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        C109315eQ.A01(A0E2, this, 1);
        C18300x5.A13(A0E2.getContext(), A0E2, R.string.f11nameremoved);
        this.A03 = AnonymousClass0x7.A0L(view, R.id.title);
        this.A0D = AnonymousClass0x2.A0M(view, R.id.participant_count_container_stub);
        View A022 = C06560Yg.A02(view, R.id.participant_list_btn);
        this.A00 = A022;
        if (A022 != null) {
            C109315eQ.A01(A022, this, 2);
        }
        C18290x4.A1I(C06560Yg.A02(view, R.id.header_layout), this, view, 5);
        this.A0B = AnonymousClass0x2.A0M(view, R.id.confirmation_lobby_stub);
        this.A0C = new AnonymousClass5UY(C18280x3.A0E(view, R.id.dots_wave_view_stub));
        ((VoiceChatGridViewModel) this.A0J.getValue()).A00 = new AnonymousClass7DG(this);
        this.A0A = C18290x4.A0X(view, R.id.call_grid_stub);
        AudioChatBottomSheetFooterView audioChatBottomSheetFooterView = (AudioChatBottomSheetFooterView) C18280x3.A0E(view, R.id.footer_layout);
        audioChatBottomSheetFooterView.A00 = new C170938Fc(this);
        this.A05 = audioChatBottomSheetFooterView;
        AnonymousClass66R r6 = this.A0K;
        AudioChatBottomSheetViewModel audioChatBottomSheetViewModel = (AudioChatBottomSheetViewModel) r6.getValue();
        if (str != null) {
            audioChatBottomSheetViewModel.A04 = str;
            AnonymousClass4VK.A02(audioChatBottomSheetViewModel.A0C, audioChatBottomSheetViewModel);
        } else {
            audioChatBottomSheetViewModel.A02 = A032;
            audioChatBottomSheetViewModel.A0N.BkP(C117695sL.A00(audioChatBottomSheetViewModel, 22));
        }
        C86604Kt.A1N(A0V(), ((AudioChatBottomSheetViewModel) r6.getValue()).A09, new AnonymousClass746(this, 5), 152);
        C86604Kt.A1N(A0V(), ((AudioChatBottomSheetViewModel) r6.getValue()).A0A, C1001359q.A00(this, 15), 153);
        C86604Kt.A1N(A0V(), ((AudioChatBottomSheetViewModel) r6.getValue()).A08, new AnonymousClass60Q(this), 154);
        AudioChatCallingViewModel audioChatCallingViewModel = (AudioChatCallingViewModel) this.A0I.getValue();
        audioChatCallingViewModel.A08 = true;
        audioChatCallingViewModel.A09 = true;
        audioChatCallingViewModel.A0E.A0H(Boolean.FALSE);
        AnonymousClass30V r12 = this.A09;
        if (r12 != null) {
            r12.A02((C95814uZ) null, 35);
            return;
        }
        throw C18270x1.A0S("navigationTimeSpentManager");
    }

    public void onConfigurationChanged(Configuration configuration) {
        C162457s7.A0J(configuration, 0);
        super.onConfigurationChanged(configuration);
        A1Z();
    }

    public int A1S() {
        return this.A0G;
    }

    public final AnonymousClass3XG A1Y() {
        AnonymousClass3XG r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("callUserJourneyLogger");
    }

    public AudioChatBottomSheetDialog() {
        AnonymousClass66R A002 = C154517dI.A00(AnonymousClass58H.NONE, new C174678Vl(new C174668Vk(this)));
        AnonymousClass8PJ r4 = new AnonymousClass8PJ(AudioChatBottomSheetViewModel.class);
        this.A0K = new C13750ng(new C77173sy(A002), new C80123xj(this, A002), new C80113xi(A002), r4);
        AnonymousClass8PJ r42 = new AnonymousClass8PJ(AudioChatCallingViewModel.class);
        this.A0I = new C13750ng(new C77133su(this), new C77143sv(this), new C80093xg(this), r42);
        AnonymousClass8PJ r43 = new AnonymousClass8PJ(VoiceChatGridViewModel.class);
        this.A0J = new C13750ng(new C77153sw(this), new C77163sx(this), new C80103xh(this), r43);
        this.A0H = C154517dI.A01(AnonymousClass8XH.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0c() {
        /*
            r4 = this;
            super.A0c()
            boolean r0 = r4.A0F
            if (r0 == 0) goto L_0x0097
            X.66R r0 = r4.A0K
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel r2 = (com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel) r2
            X.57w r1 = r2.A00
            X.57w r0 = X.AnonymousClass57w.Joiner
            if (r1 != r0) goto L_0x0090
            X.5b3 r2 = r2.A01
            if (r2 == 0) goto L_0x001e
            r1 = 1
            r0 = 0
            r2.A0e(r0, r0, r1)
        L_0x001e:
            r0 = 1
        L_0x001f:
            r2 = 35
            X.3XG r1 = r4.A1Y()
            if (r0 == 0) goto L_0x0092
            r0 = 24
            r1.A00(r0, r2)
            r3 = 1
        L_0x002d:
            android.app.Dialog r0 = r4.A03
            if (r0 == 0) goto L_0x003c
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto L_0x003c
            r0 = 128(0x80, float:1.794E-43)
            r1.clearFlags(r0)
        L_0x003c:
            r2 = 0
            r4.A01 = r2
            X.66R r0 = r4.A0I
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel r1 = (com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel) r1
            r0 = 0
            r1.A08 = r0
            if (r3 != 0) goto L_0x0051
            X.4xk r0 = r1.A0H
            X.AnonymousClass4VK.A02(r0, r1)
        L_0x0051:
            r4.A07 = r2
            r4.A03 = r2
            r4.A0D = r2
            X.66R r0 = r4.A0J
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.calling.callgrid.viewmodel.VoiceChatGridViewModel r0 = (com.whatsapp.calling.callgrid.viewmodel.VoiceChatGridViewModel) r0
            r0.A00 = r2
            com.whatsapp.calling.callgrid.view.CallGrid r0 = r4.A04
            if (r0 == 0) goto L_0x006c
            X.08A r1 = r4.A0L
            X.0vG r0 = r0.A0b
            r1.A01(r0)
        L_0x006c:
            com.whatsapp.calling.callgrid.view.CallGrid r1 = r4.A04
            if (r1 == 0) goto L_0x007f
            java.lang.String r0 = "CallGrid/clearRecyclerViewAdapter Setting adapters to null"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            androidx.recyclerview.widget.RecyclerView r0 = r1.A0g
            r0.setAdapter(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r1.A0f
            r0.setAdapter(r2)
        L_0x007f:
            r4.A04 = r2
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView r0 = r4.A05
            if (r0 == 0) goto L_0x0087
            r0.A00 = r2
        L_0x0087:
            r4.A05 = r2
            r4.A0C = r2
            r4.A00 = r2
            r4.A0B = r2
            return
        L_0x0090:
            r0 = 0
            goto L_0x001f
        L_0x0092:
            r0 = 13
            r1.A00(r0, r2)
        L_0x0097:
            r3 = 0
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog.A0c():void");
    }

    public Dialog A1J(Bundle bundle) {
        Dialog A1J = super.A1J(bundle);
        Context A1D = A1D();
        if (A1D != null) {
            Window window = A1J.getWindow();
            if (window != null) {
                window.setNavigationBarColor(AnonymousClass0Y8.A04(A1D, R.color.f5nameremoved));
            }
            Window window2 = A1J.getWindow();
            if (window2 != null) {
                window2.addFlags(128);
            }
        }
        return A1J;
    }

    public final void A1Z() {
        C003203q A0Q = A0Q();
        if (A0Q != null) {
            float f = 0.85f;
            if (C86604Kt.A0A(this).orientation == 2) {
                f = 1.0f;
            }
            MaxHeightLinearLayout maxHeightLinearLayout = this.A07;
            if (maxHeightLinearLayout != null) {
                maxHeightLinearLayout.setMaxHeight((int) (((float) C107215at.A00(A0Q)) * f));
            }
        }
    }
}
