package X;

import android.view.View;
import com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog;
import com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel;

/* renamed from: X.5eQ  reason: invalid class name and case insensitive filesystem */
public class C109315eQ implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C109315eQ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static AudioChatBottomSheetViewModel A00(AudioChatBottomSheetDialog audioChatBottomSheetDialog, AnonymousClass3XG r2, int i) {
        r2.A00(i, 35);
        return (AudioChatBottomSheetViewModel) audioChatBottomSheetDialog.A0K.getValue();
    }

    public static void A01(View view, Object obj, int i) {
        view.setOnClickListener(new C109315eQ(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0231, code lost:
        X.C116085pi.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0234, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0430, code lost:
        if (r0.A0B() == false) goto L_0x0432;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x046e, code lost:
        if (r0.A0B() == false) goto L_0x0470;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0484, code lost:
        r3.Bpk(r5, r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0487, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x048b, code lost:
        r1.A01(java.lang.Integer.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0492, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x04a8, code lost:
        if (r0.A0B() == false) goto L_0x04aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x060f, code lost:
        if (r1 == 3) goto L_0x0611;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x06c5, code lost:
        r0.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x06c8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0730, code lost:
        r0.callOnClick();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0733, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d1, code lost:
        r3 = r4.A0F;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r15) {
        /*
            r14 = this;
            int r0 = r14.A01
            switch(r0) {
                case 0: goto L_0x025f;
                case 1: goto L_0x0734;
                case 2: goto L_0x0235;
                case 3: goto L_0x01fc;
                case 4: goto L_0x01a7;
                case 5: goto L_0x0187;
                case 6: goto L_0x0111;
                case 7: goto L_0x00e9;
                case 8: goto L_0x00ab;
                case 9: goto L_0x072a;
                case 10: goto L_0x0723;
                case 11: goto L_0x071b;
                case 12: goto L_0x0709;
                case 13: goto L_0x0734;
                case 14: goto L_0x0734;
                case 15: goto L_0x06d1;
                case 16: goto L_0x06c9;
                case 17: goto L_0x0654;
                case 18: goto L_0x061d;
                case 19: goto L_0x05d9;
                case 20: goto L_0x05cf;
                case 21: goto L_0x05c3;
                case 22: goto L_0x009b;
                case 23: goto L_0x05b8;
                case 24: goto L_0x0082;
                case 25: goto L_0x0061;
                case 26: goto L_0x05a4;
                case 27: goto L_0x0588;
                case 28: goto L_0x057f;
                case 29: goto L_0x004b;
                case 30: goto L_0x054c;
                case 31: goto L_0x051a;
                case 32: goto L_0x0501;
                case 33: goto L_0x04df;
                case 34: goto L_0x0493;
                case 35: goto L_0x044b;
                case 36: goto L_0x040d;
                case 37: goto L_0x0403;
                case 38: goto L_0x03f7;
                case 39: goto L_0x03e5;
                case 40: goto L_0x03d6;
                case 41: goto L_0x03b5;
                case 42: goto L_0x039f;
                case 43: goto L_0x002b;
                case 44: goto L_0x0397;
                case 45: goto L_0x038f;
                case 46: goto L_0x0386;
                case 47: goto L_0x0347;
                case 48: goto L_0x0319;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r14.A00
            com.whatsapp.chatinfo.view.custom.ContactDetailsCard r1 = (com.whatsapp.chatinfo.view.custom.ContactDetailsCard) r1
            X.3ZH r0 = r1.A0S
            if (r0 == 0) goto L_0x002a
            android.os.Bundle r0 = X.AnonymousClass002.A08()
            com.whatsapp.dialogs.AudioVideoBottomSheetDialogFragment r2 = new com.whatsapp.dialogs.AudioVideoBottomSheetDialogFragment
            r2.<init>()
            r2.A0u(r0)
            android.content.Context r1 = r1.getContext()
            java.lang.Class<X.4eZ> r0 = X.C89644eZ.class
            android.app.Activity r0 = X.C111095hX.A03(r1, r0)
            X.4ea r0 = (X.C89654ea) r0
            if (r0 == 0) goto L_0x002a
            r0.Boo(r2)
        L_0x002a:
            return
        L_0x002b:
            java.lang.Object r2 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            X.1RR r0 = X.AnonymousClass4SG.A2c(r2)
            if (r0 == 0) goto L_0x002a
            java.lang.String r1 = X.AnonymousClass36P.A02(r0)
            if (r1 == 0) goto L_0x002a
            X.3ZH r0 = r2.A1K
            boolean r0 = r0.A0R()
            com.whatsapp.chatinfo.view.custom.PhoneNumberSharedBottomSheet r1 = X.AnonymousClass25J.A00(r1, r0)
            java.lang.String r0 = "SharePhoneNumberBottomSheet"
            r2.Bon(r1, r0)
            return
        L_0x004b:
            java.lang.Object r1 = r14.A00
            com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment r1 = (com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment) r1
            r0 = 1
            r1.A1N(r0)
            X.03q r1 = r1.A0R()
            boolean r0 = r1 instanceof X.C181818nN
            if (r0 == 0) goto L_0x002a
            X.8nN r1 = (X.C181818nN) r1
            r1.BOa()
            return
        L_0x0061:
            java.lang.Object r1 = r14.A00
            X.5ZS r1 = (X.AnonymousClass5ZS) r1
            boolean r0 = r1.A0Q()
            if (r0 != 0) goto L_0x002a
            X.5UD r2 = r1.A0F
            if (r2 == 0) goto L_0x002a
            com.whatsapp.camera.CameraBottomSheetBehavior r1 = r2.A0B
            r0 = 3
            r1.A0S(r0)
            r0 = 1
            r1.A00 = r0
            android.view.View r1 = r2.A08
            r0 = 0
            r1.setVisibility(r0)
            r2.A00()
            return
        L_0x0082:
            java.lang.Object r2 = r14.A00
            X.5ZS r2 = (X.AnonymousClass5ZS) r2
            boolean r0 = r2.A0Q()
            if (r0 != 0) goto L_0x002a
            X.5Y6 r1 = r2.A0E
            X.678 r0 = r2.A0C
            java.lang.String r0 = r0.BLX()
            r1.A04(r0)
            r2.A09()
            return
        L_0x009b:
            java.lang.Object r1 = r14.A00
            X.5ZS r1 = (X.AnonymousClass5ZS) r1
            boolean r0 = r1.A0Q()
            if (r0 != 0) goto L_0x002a
            X.4ea r0 = r1.A0A
            r0.onBackPressed()
            return
        L_0x00ab:
            java.lang.Object r0 = r14.A00
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView r0 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView) r0
            X.8ih r0 = r0.A00
            if (r0 == 0) goto L_0x002a
            X.8Fc r0 = (X.C170938Fc) r0
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r1 = r0.A00
            X.66R r0 = r1.A0K
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel r4 = (com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel) r4
            android.content.Context r6 = r1.A0G()
            android.os.Bundle r1 = r1.A06
            if (r1 == 0) goto L_0x00e7
            java.lang.String r0 = "voice_chat_call_from_ui"
            int r9 = r1.getInt(r0)
        L_0x00cd:
            com.whatsapp.jid.GroupJid r1 = r4.A02
            if (r1 == 0) goto L_0x002a
            X.3Ex r3 = r4.A0F
            X.3ZH r2 = r3.A06(r1)
            if (r2 == 0) goto L_0x002a
            X.2rn r0 = r4.A0L
            X.2mt r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x073c
            X.08M r0 = r4.A09
            X.AnonymousClass0x9.A1I(r0)
            return
        L_0x00e7:
            r9 = 0
            goto L_0x00cd
        L_0x00e9:
            java.lang.Object r1 = r14.A00
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView r1 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView) r1
            X.8ih r0 = r1.A00
            if (r0 == 0) goto L_0x002a
            boolean r3 = r1.isSelected()
            X.8Fc r0 = (X.C170938Fc) r0
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r2 = r0.A00
            X.3XG r1 = r2.A1Y()
            r0 = 9
            if (r3 == 0) goto L_0x0103
            r0 = 10
        L_0x0103:
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel r0 = A00(r2, r1, r0)
            X.5b3 r0 = r0.A01
            if (r0 == 0) goto L_0x002a
            X.5pi r1 = r0.A1m
            r0 = 43
            goto L_0x0231
        L_0x0111:
            java.lang.Object r0 = r14.A00
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView r0 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView) r0
            X.8ih r1 = r0.A00
            if (r1 == 0) goto L_0x002a
            boolean r0 = r0.isSelected()
            X.8Fc r1 = (X.C170938Fc) r1
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r2 = r1.A00
            X.3XG r1 = r2.A1Y()
            int r0 = X.C18280x3.A00(r0)
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel r2 = A00(r2, r1, r0)
            X.57w r1 = r2.A00
            X.57w r0 = X.AnonymousClass57w.Creator
            if (r1 != r0) goto L_0x017a
            boolean r0 = r2.A06
            r0 = r0 ^ 1
            r2.A06 = r0
            X.08M r4 = r2.A0A
            java.lang.Object r5 = r4.A07()
            X.5Sr r5 = (X.C104875Sr) r5
            if (r5 == 0) goto L_0x002a
            java.util.List r0 = r5.A03
            boolean r3 = r2.A06
            java.util.ArrayList r8 = X.C73783g4.A0c(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x014f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0754
            java.lang.Object r1 = r2.next()
            X.7Vt r1 = (X.C151657Vt) r1
            boolean r0 = r1 instanceof X.C91384jV
            if (r0 == 0) goto L_0x016c
            X.4jV r1 = (X.C91384jV) r1
            boolean r0 = r1.A02
            X.4jV r1 = new X.4jV
            r1.<init>(r3, r0)
        L_0x0168:
            r8.add(r1)
            goto L_0x014f
        L_0x016c:
            boolean r0 = r1 instanceof X.C91394jW
            if (r0 == 0) goto L_0x0168
            X.4jW r1 = (X.C91394jW) r1
            boolean r0 = r1.A03
            X.4jW r1 = new X.4jW
            r1.<init>(r3, r0)
            goto L_0x0168
        L_0x017a:
            X.5b3 r1 = r2.A01
            if (r1 == 0) goto L_0x002a
            X.5sL r0 = new X.5sL
            r0.<init>(r1)
            X.C86644Kx.A1G(r0, r1)
            return
        L_0x0187:
            java.lang.Object r0 = r14.A00
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView r0 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView) r0
            X.8ih r0 = r0.A00
            if (r0 == 0) goto L_0x002a
            X.8Fc r0 = (X.C170938Fc) r0
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r2 = r0.A00
            X.3XG r1 = r2.A1Y()
            r0 = 24
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel r0 = A00(r2, r1, r0)
            X.5b3 r2 = r0.A01
            if (r2 == 0) goto L_0x002a
            r1 = 1
            r0 = 0
            r2.A0e(r0, r0, r1)
            return
        L_0x01a7:
            java.lang.Object r0 = r14.A00
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView r0 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView) r0
            X.8ih r0 = r0.A00
            if (r0 == 0) goto L_0x002a
            X.8Fc r0 = (X.C170938Fc) r0
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r2 = r0.A00
            X.3XG r1 = r2.A1Y()
            r0 = 6
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel r6 = A00(r2, r1, r0)
            android.content.Context r5 = r2.A0G()
            X.1VX r1 = r6.A0M
            r0 = 6688(0x1a20, float:9.372E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x01db
            X.4C6 r4 = X.AnonymousClass0IV.A00(r6)
            X.3gB r3 = r6.A0O
            r2 = 0
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel$joinCall$1 r1 = new com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel$joinCall$1
            r1.<init>(r5, r6, r2)
            r0 = 2
            X.C616131n.A02(r3, r1, r4, r2, r0)
            return
        L_0x01db:
            X.5b3 r2 = r6.A01
            if (r2 == 0) goto L_0x002a
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            X.C626936e.A06(r1)
            boolean r0 = r2.A1Q
            if (r0 != 0) goto L_0x01ed
            X.C86624Kv.A1G(r2, r1)
        L_0x01ed:
            X.66r r1 = r2.A1s
            X.5jl r1 = (X.C112455jl) r1
            r0 = 1
            boolean r0 = r1.A08(r5, r0)
            if (r0 == 0) goto L_0x002a
            com.whatsapp.voipcalling.Voip.acceptCall()
            return
        L_0x01fc:
            java.lang.Object r1 = r14.A00
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView r1 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView) r1
            X.8ih r0 = r1.A00
            if (r0 == 0) goto L_0x002a
            boolean r3 = r1.isSelected()
            X.8Fc r0 = (X.C170938Fc) r0
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r2 = r0.A00
            X.3XG r1 = r2.A1Y()
            r0 = 11
            if (r3 == 0) goto L_0x0216
            r0 = 12
        L_0x0216:
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel r3 = A00(r2, r1, r0)
            X.5b3 r2 = r3.A01
            if (r2 == 0) goto L_0x002a
            X.5pi r0 = r2.A1m
            int r1 = r0.A00
            r0 = 3
            if (r1 != r0) goto L_0x0765
            java.lang.String r0 = r3.A04
            boolean r0 = r2.A0u(r0)
            if (r0 != 0) goto L_0x0765
            X.5pi r1 = r2.A1m
            r0 = 44
        L_0x0231:
            X.C116085pi.A01(r1, r0)
            return
        L_0x0235:
            java.lang.Object r4 = r14.A00
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r4 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog) r4
            r3 = 0
            X.3XG r2 = r4.A1Y()
            r1 = 21
            r0 = 35
            r2.A00(r1, r0)
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r4.A01
            if (r1 == 0) goto L_0x024d
            r0 = 1
            r1.A0U(r3, r0)
        L_0x024d:
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r4.A01
            if (r1 == 0) goto L_0x0255
            r0 = 4
            r1.A0S(r0)
        L_0x0255:
            com.whatsapp.components.MaxHeightLinearLayout r1 = r4.A07
            if (r1 == 0) goto L_0x002a
            r0 = 19
            X.C117695sL.A01(r1, r4, r0)
            return
        L_0x025f:
            java.lang.Object r0 = r14.A00
            com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel r0 = (com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel) r0
            if (r0 == 0) goto L_0x002a
            X.4xk r0 = r0.A06
            X.5XK r5 = r0.A08()
            java.lang.String r4 = r5.A09
            if (r4 != 0) goto L_0x0276
            java.lang.String r1 = "CallDataSource/updateShareCallLinkOption/ call link token is null"
            r0 = 0
            X.C626936e.A0D(r0, r1)
            return
        L_0x0276:
            java.util.Iterator r10 = X.C61102zi.A03(r0)
        L_0x027a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x002a
            X.4VK r8 = X.C86664Kz.A15(r10)
            boolean r2 = r5.A0K
            boolean r0 = r8 instanceof com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel
            if (r0 == 0) goto L_0x027a
            com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel r8 = (com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel) r8
            X.7HF r1 = r8.A01
            if (r1 == 0) goto L_0x029c
            java.lang.String r0 = r1.A00
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x02a3
            boolean r0 = r1.A01
            if (r0 == r2) goto L_0x02a3
        L_0x029c:
            X.7HF r0 = new X.7HF
            r0.<init>(r4, r2)
            r8.A01 = r0
        L_0x02a3:
            X.4UC r1 = r8.A0E
            r0 = 0
            r1.A0H(r0)
            r9 = 0
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r0 = 2131893809(0x7f121e31, float:1.9422405E38)
            X.6pW r0 = X.AnonymousClass4L0.A0N(r1, r0)
            X.7HH r7 = new X.7HH
            r7.<init>(r0)
            java.lang.Object[] r2 = X.AnonymousClass002.A0L()
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r0 = 2131895980(0x7f1226ac, float:1.9426808E38)
            X.6pW r0 = X.AnonymousClass4L0.A0N(r1, r0)
            r2[r9] = r0
            r0 = 2131893811(0x7f121e33, float:1.942241E38)
            X.6pW r3 = X.AnonymousClass4L0.A0N(r2, r0)
            r2 = 2131231742(0x7f0803fe, float:1.8079574E38)
            r1 = 6
            X.7KU r0 = new X.7KU
            r0.<init>(r3, r1, r2)
            java.util.List r6 = r7.A01
            r6.add(r0)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r0 = 2131888325(0x7f1208c5, float:1.9411282E38)
            X.6pW r3 = X.AnonymousClass4L0.A0N(r1, r0)
            r2 = 2131231727(0x7f0803ef, float:1.8079543E38)
            r1 = 7
            X.7KU r0 = new X.7KU
            r0.<init>(r3, r1, r2)
            r6.add(r0)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r0 = 2131893809(0x7f121e31, float:1.9422405E38)
            X.6pW r3 = X.AnonymousClass4L0.A0N(r1, r0)
            r2 = 2131232731(0x7f0807db, float:1.808158E38)
            r1 = 8
            X.7KU r0 = new X.7KU
            r0.<init>(r3, r1, r2)
            r6.add(r0)
            X.08M r3 = r8.A04
            X.7Qw r2 = r7.A00
            X.6aY r1 = X.C129586aY.copyOf((java.util.Collection) r6)
            X.7HI r0 = new X.7HI
            r0.<init>(r1, r2)
            r3.A0H(r0)
            goto L_0x027a
        L_0x0319:
            java.lang.Object r5 = r14.A00
            com.whatsapp.chatinfo.view.custom.ContactDetailsCard r5 = (com.whatsapp.chatinfo.view.custom.ContactDetailsCard) r5
            X.4sd r1 = r5.A0V
            if (r1 == 0) goto L_0x0325
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A09 = r0
        L_0x0325:
            X.5hX r4 = r5.A0G
            android.content.Context r3 = r5.getContext()
            X.36r r2 = X.C86664Kz.A1B()
            android.content.Context r1 = r5.getContext()
            X.3ZH r0 = r5.A0S
            X.4uZ r0 = X.AnonymousClass3ZH.A01(r0)
            android.content.Intent r0 = X.C86634Kw.A0D(r1, r2, r0)
            android.content.Intent r1 = X.C86654Ky.A0D(r0)
            java.lang.String r0 = "ContactInfo"
            r4.A0C(r3, r1, r0)
            return
        L_0x0347:
            java.lang.Object r5 = r14.A00
            com.whatsapp.chatinfo.view.custom.ContactDetailsCard r5 = (com.whatsapp.chatinfo.view.custom.ContactDetailsCard) r5
            X.2on r1 = r5.A0b
            r0 = 6
            r1.A01(r0)
            X.3ZH r0 = r5.A0S
            X.4uZ r2 = X.AnonymousClass3ZH.A01(r0)
            X.36r r1 = X.C86664Kz.A1B()
            android.content.Context r0 = r5.getContext()
            android.content.Intent r4 = X.C86634Kw.A0D(r0, r1, r2)
            if (r2 == 0) goto L_0x0373
            X.5aW r0 = r5.A0O
            boolean r0 = r0.A0I(r2)
            if (r0 == 0) goto L_0x0373
            java.lang.String r1 = "chatlockEntryPoint"
            r0 = 4
            r4.putExtra(r1, r0)
        L_0x0373:
            X.5hX r3 = r5.A0G
            android.content.Context r2 = r5.getContext()
            java.lang.String r1 = "args_conversation_screen_entry_point"
            r0 = 1
            android.content.Intent r1 = r4.putExtra(r1, r0)
            java.lang.String r0 = "ContactInfo"
            r3.A0C(r2, r1, r0)
            return
        L_0x0386:
            java.lang.Object r1 = r14.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2
            X.C621433s.A01(r1, r0)
            return
        L_0x038f:
            java.lang.Object r0 = r14.A00
            com.whatsapp.chatinfo.ListChatInfoActivity r0 = (com.whatsapp.chatinfo.ListChatInfoActivity) r0
            r0.A7H()
            return
        L_0x0397:
            java.lang.Object r0 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r0 = (com.whatsapp.chatinfo.ContactInfoActivity) r0
            r0.A7d()
            return
        L_0x039f:
            java.lang.Object r4 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r4 = (com.whatsapp.chatinfo.ContactInfoActivity) r4
            X.4kJ r2 = r4.A0x
            r1 = 3
            X.5dl r0 = r4.A0e
            r2.A0G(r0, r1)
            X.66r r3 = r4.A0l
            X.3ZH r2 = r4.A1K
            r1 = 6
            r0 = 1
            r3.Bpk(r4, r2, r1, r0)
            return
        L_0x03b5:
            java.lang.Object r4 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r4 = (com.whatsapp.chatinfo.ContactInfoActivity) r4
            android.content.Context r1 = r4.getApplicationContext()
            X.3ZH r0 = r4.A1K
            com.whatsapp.jid.UserJid r3 = X.C86604Kt.A0d(r0)
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsJidNotificationActivity"
            X.C86604Kt.A13(r2, r3, r1, r0)
            r0 = 12
            r4.startActivityForResult(r2, r0)
            return
        L_0x03d6:
            java.lang.Object r2 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            X.5rC r0 = r2.A07
            X.66o r1 = X.C116985rC.A03(r0)
            r0 = 1
            r1.BpI(r2, r0)
            return
        L_0x03e5:
            java.lang.Object r1 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r1 = (com.whatsapp.chatinfo.ContactInfoActivity) r1
            X.5rC r0 = r1.A0A
            r0.A04()
            com.whatsapp.inappsupportai.component.AboutAiSupportAssistantBottomSheet r0 = new com.whatsapp.inappsupportai.component.AboutAiSupportAssistantBottomSheet
            r0.<init>()
            r1.Boo(r0)
            return
        L_0x03f7:
            java.lang.Object r2 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            X.2nM r1 = r2.A19
            java.lang.String r0 = "managing-ai-chats-with-third_party"
            r1.A01(r2, r0)
            return
        L_0x0403:
            java.lang.Object r0 = r14.A00
            X.4k4 r0 = (X.C91484k4) r0
            X.5QY r0 = r0.A0D
            r0.A00()
            return
        L_0x040d:
            java.lang.Object r5 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r5 = (com.whatsapp.chatinfo.ContactInfoActivity) r5
            X.2nX r1 = r5.A1f
            X.3ZH r0 = r5.A1K
            com.whatsapp.jid.UserJid r0 = X.C86604Kt.A0d(r0)
            boolean r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x0447
            X.4kJ r4 = r5.A0x
            java.lang.Integer r3 = r5.A1x
            boolean r2 = r5.A7b()
            X.5id r0 = r5.A0X
            if (r0 == 0) goto L_0x0432
            boolean r0 = r0.A0B()
            r1 = 1
            if (r0 != 0) goto L_0x0433
        L_0x0432:
            r1 = 0
        L_0x0433:
            r0 = 11
            r4.A0H(r3, r0, r2, r1)
            X.4kJ r2 = r5.A0x
            r1 = 3
            X.5dl r0 = r5.A0e
            r2.A0G(r0, r1)
            X.66r r3 = r5.A0l
            X.3ZH r2 = r5.A1K
            r1 = 6
            r0 = 1
            goto L_0x0484
        L_0x0447:
            X.2nX r1 = r5.A1f
            r0 = 4
            goto L_0x048b
        L_0x044b:
            java.lang.Object r5 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r5 = (com.whatsapp.chatinfo.ContactInfoActivity) r5
            X.2nX r1 = r5.A1f
            X.3ZH r0 = r5.A1K
            com.whatsapp.jid.UserJid r0 = X.C86604Kt.A0d(r0)
            boolean r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x0488
            X.4kJ r4 = r5.A0x
            java.lang.Integer r3 = r5.A1x
            boolean r2 = r5.A7b()
            X.5id r0 = r5.A0X
            if (r0 == 0) goto L_0x0470
            boolean r0 = r0.A0B()
            r1 = 1
            if (r0 != 0) goto L_0x0471
        L_0x0470:
            r1 = 0
        L_0x0471:
            r0 = 10
            r4.A0H(r3, r0, r2, r1)
            X.4kJ r2 = r5.A0x
            r1 = 2
            X.5dl r0 = r5.A0e
            r2.A0G(r0, r1)
            X.66r r3 = r5.A0l
            X.3ZH r2 = r5.A1K
            r1 = 6
            r0 = 0
        L_0x0484:
            r3.Bpk(r5, r2, r1, r0)
            return
        L_0x0488:
            X.2nX r1 = r5.A1f
            r0 = 3
        L_0x048b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01(r0)
            return
        L_0x0493:
            java.lang.Object r3 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r3 = (com.whatsapp.chatinfo.ContactInfoActivity) r3
            X.4kJ r5 = r3.A0x
            java.lang.Integer r4 = r3.A1x
            boolean r2 = r3.A7b()
            X.5id r0 = r3.A0X
            if (r0 == 0) goto L_0x04aa
            boolean r0 = r0.A0B()
            r1 = 1
            if (r0 != 0) goto L_0x04ab
        L_0x04aa:
            r1 = 0
        L_0x04ab:
            r0 = 9
            r5.A0H(r4, r0, r2, r1)
            X.4kJ r2 = r3.A0x
            r1 = 1
            X.5dl r0 = r3.A0e
            r2.A0G(r0, r1)
            android.content.Context r1 = r3.getApplicationContext()
            r0 = 0
            android.content.Intent r2 = X.C627736r.A08(r1, r0)
            X.3ZH r0 = r3.A1K
            com.whatsapp.jid.UserJid r0 = X.C86604Kt.A0d(r0)
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "jid"
            android.content.Intent r1 = r2.putExtra(r0, r1)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            android.content.Intent r2 = r1.addFlags(r0)
            X.5hX r1 = r3.A00
            java.lang.String r0 = "ContactInfoActivity"
            r1.A0C(r3, r2, r0)
            return
        L_0x04df:
            java.lang.Object r6 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r6 = (com.whatsapp.chatinfo.ContactInfoActivity) r6
            X.3ZH r0 = r6.A1K
            com.whatsapp.jid.UserJid r5 = X.C86604Kt.A0d(r0)
            long r2 = r6.A00
            android.content.Intent r4 = X.C18320x8.A07()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversation.conversationrow.message.KeptMessagesActivity"
            X.C627336j.A0E(r4, r5, r1, r0)
            java.lang.String r0 = "keptMessageCount"
            r4.putExtra(r0, r2)
            r6.startActivity(r4)
            return
        L_0x0501:
            java.lang.Object r3 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r3 = (com.whatsapp.chatinfo.ContactInfoActivity) r3
            X.3ZH r0 = r3.A1K
            com.whatsapp.jid.UserJid r2 = X.C86604Kt.A0d(r0)
            boolean r0 = r2 instanceof X.C27981fH
            if (r0 == 0) goto L_0x0516
            X.4FS r1 = r3.A04
            r0 = 1
            X.C86624Kv.A1M(r1, r3, r2, r0)
            return
        L_0x0516:
            r3.A7S(r2)
            return
        L_0x051a:
            java.lang.Object r4 = r14.A00
            X.5XG r4 = (X.AnonymousClass5XG) r4
            android.content.Context r3 = r4.A03
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.chatlock.ChatLockAuthActivity"
            r2.setClassName(r1, r0)
            X.4uZ r1 = r4.A0B
            boolean r0 = r1 instanceof X.C27991fJ
            if (r0 == 0) goto L_0x0549
            java.lang.String r0 = "gid"
        L_0x0535:
            X.AnonymousClass0x2.A0u(r2, r1, r0)
            android.app.Activity r1 = X.C111095hX.A02(r3)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.WaBaseActivity"
            X.C162457s7.A0K(r1, r0)
            X.4ea r1 = (X.C89654ea) r1
            r0 = 4660(0x1234, float:6.53E-42)
            r1.BpY(r2, r0)
            return
        L_0x0549:
            java.lang.String r0 = "jid"
            goto L_0x0535
        L_0x054c:
            java.lang.Object r1 = r14.A00
            com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment r1 = (com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment) r1
            r1.A1K()
            X.66R r0 = r1.A0Q
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel r4 = (com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel) r4
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel r0 = (com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel) r0
            X.0Wx r0 = r0.A00
            java.lang.Object r3 = r0.A07()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x056d
            java.lang.String r3 = ""
        L_0x056d:
            X.66R r0 = r1.A0M
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.5dt r1 = r1.A0F
            r0 = 1
            X.C162457s7.A0J(r2, r0)
            r4.A0E(r1, r2, r3)
            return
        L_0x057f:
            java.lang.Object r1 = r14.A00
            X.7l7 r1 = (X.C159097l7) r1
            r0 = 3
            r1.A08(r0)
            return
        L_0x0588:
            java.lang.Object r1 = r14.A00
            com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment r1 = (com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment) r1
            X.66R r0 = r1.A0Q
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel r0 = (com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel) r0
            X.0Wx r0 = r0.A00
            java.lang.Object r0 = r0.A07()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x05a0
            java.lang.String r0 = ""
        L_0x05a0:
            r1.A1L(r0)
            return
        L_0x05a4:
            java.lang.Object r0 = r14.A00
            X.4jw r0 = (X.C91454jw) r0
            X.66R r0 = r0.A09
            java.lang.Object r0 = r0.getValue()
            X.6H0 r0 = (X.AnonymousClass6H0) r0
            X.4UC r1 = r0.A06
            X.6gd r0 = X.C133066gd.A00
            r1.A0H(r0)
            return
        L_0x05b8:
            java.lang.Object r0 = r14.A00
            X.5ZS r0 = (X.AnonymousClass5ZS) r0
            r0.A0B()
            r0.A09()
            return
        L_0x05c3:
            java.lang.Object r1 = r14.A00
            X.12l r1 = (X.C197612l) r1
            android.content.Context r0 = X.C86664Kz.A0S(r15)
            r1.A07(r0)
            return
        L_0x05cf:
            java.lang.Object r0 = r14.A00
            X.12l r0 = (X.C197612l) r0
            android.widget.PopupMenu r0 = r0.A02
            r0.show()
            return
        L_0x05d9:
            java.lang.Object r2 = r14.A00
            com.whatsapp.calling.schedulecall.ScheduleCallFragment r2 = (com.whatsapp.calling.schedulecall.ScheduleCallFragment) r2
            android.app.TimePickerDialog r3 = r2.A01
            if (r3 != 0) goto L_0x0619
            android.content.Context r4 = r2.A0G()
            android.app.TimePickerDialog$OnTimeSetListener r5 = r2.A0J
            java.util.Calendar r1 = r2.A0F
            r0 = 11
            int r6 = r1.get(r0)
            java.util.Calendar r1 = r2.A0F
            r0 = 12
            int r7 = r1.get(r0)
            X.33j r0 = r2.A0B
            X.5Ki r0 = r0.A05()
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0611
            X.33j r0 = r2.A0B
            java.util.Locale r0 = X.C620733j.A02(r0)
            int r1 = X.C162307rf.A00(r0)
            if (r1 == 0) goto L_0x0611
            r0 = 3
            r8 = 0
            if (r1 != r0) goto L_0x0612
        L_0x0611:
            r8 = 1
        L_0x0612:
            android.app.TimePickerDialog r3 = new android.app.TimePickerDialog
            r3.<init>(r4, r5, r6, r7, r8)
            r2.A01 = r3
        L_0x0619:
            r3.show()
            return
        L_0x061d:
            java.lang.Object r4 = r14.A00
            com.whatsapp.calling.schedulecall.ScheduleCallFragment r4 = (com.whatsapp.calling.schedulecall.ScheduleCallFragment) r4
            X.94W r0 = r4.A08
            if (r0 != 0) goto L_0x0651
            java.util.Calendar r3 = java.util.Calendar.getInstance()
            android.content.Context r0 = r4.A0G()
            X.94W r1 = new X.94W
            r1.<init>(r0)
            r4.A08 = r1
            android.app.DatePickerDialog$OnDateSetListener r0 = r4.A0I
            r1.A05(r0)
            android.widget.DatePicker r2 = r1.A04()
            long r0 = r3.getTimeInMillis()
            r2.setMinDate(r0)
            r1 = 6
            r0 = 180(0xb4, float:2.52E-43)
            r3.add(r1, r0)
            long r0 = r3.getTimeInMillis()
            r2.setMaxDate(r0)
        L_0x0651:
            X.94W r0 = r4.A08
            goto L_0x06c5
        L_0x0654:
            java.lang.Object r5 = r14.A00
            com.whatsapp.calling.schedulecall.ScheduleCallFragment r5 = (com.whatsapp.calling.schedulecall.ScheduleCallFragment) r5
            com.whatsapp.WaEditText r0 = r5.A05
            android.text.Editable r0 = r0.getText()
            X.C626936e.A06(r0)
            java.lang.String r8 = r0.toString()
            boolean r0 = X.C107575bX.A0F(r8)
            if (r0 == 0) goto L_0x066d
            java.lang.String r8 = r5.A0E
        L_0x066d:
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            java.util.Calendar r0 = r5.A0F
            boolean r0 = r0.before(r1)
            if (r0 != 0) goto L_0x06ac
            java.util.Calendar r0 = r5.A0F
            long r3 = r0.getTimeInMillis()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x06ac
            X.2sH r4 = r5.A0A
            X.4uZ r3 = r5.A0D
            X.2sr r2 = r5.A02
            X.3Lv r1 = r5.A0C
            boolean r13 = r5.A0H
            java.util.Calendar r0 = r5.A0F
            long r11 = r0.getTimeInMillis()
            r0 = 1
            X.2z0 r7 = X.AnonymousClass35J.A00(r2, r4, r3, r0)
            long r9 = r4.A0H()
            X.1nW r6 = new X.1nW
            r6.<init>(r7, r8, r9, r11, r13)
            r1.A0V(r6)
            r5.A0G = r0
            r5.A1K()
            return
        L_0x06ac:
            X.0zH r2 = X.C18280x3.A0K(r5)
            r1 = 2131893294(0x7f121c2e, float:1.942136E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r5)
            java.lang.String r0 = r0.getString(r1)
            r2.A0g(r0)
            X.C19340zH.A06(r2)
            X.043 r0 = r2.create()
        L_0x06c5:
            r0.show()
            return
        L_0x06c9:
            java.lang.Object r0 = r14.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1K()
            return
        L_0x06d1:
            java.lang.Object r7 = r14.A00
            com.whatsapp.calling.schedulecall.ScheduleCallFragment r7 = (com.whatsapp.calling.schedulecall.ScheduleCallFragment) r7
            boolean r0 = r7.A0H
            r6 = r0 ^ 1
            r5 = 1
            r4 = 2131893434(0x7f121cba, float:1.9421644E38)
            r3 = 2130903047(0x7f030007, float:1.74129E38)
            com.whatsapp.SingleSelectionDialogFragment r2 = new com.whatsapp.SingleSelectionDialogFragment
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "dialogId"
            r1.putInt(r0, r5)
            java.lang.String r0 = "currentIndex"
            r1.putInt(r0, r6)
            java.lang.String r0 = "dialogTitleResId"
            r1.putInt(r0, r4)
            java.lang.String r0 = "itemsArrayResId"
            r1.putInt(r0, r3)
            r2.A0u(r1)
            X.0df r1 = r7.A0T()
            r0 = 0
            r2.A1O(r1, r0)
            return
        L_0x0709:
            java.lang.Object r1 = r14.A00
            com.whatsapp.calling.lightweightcalling.view.VoiceChatIntroCardDialog r1 = (com.whatsapp.calling.lightweightcalling.view.VoiceChatIntroCardDialog) r1
            r0 = 1
            r1.A03 = r0
            android.view.View$OnClickListener r0 = r1.A00
            if (r0 == 0) goto L_0x0717
            r0.onClick(r15)
        L_0x0717:
            r1.A1L()
            return
        L_0x071b:
            java.lang.Object r0 = r14.A00
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel r0 = (com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel) r0
            X.AnonymousClass4Ql.setViewModel$lambda$6(r0, r15)
            return
        L_0x0723:
            java.lang.Object r0 = r14.A00
            X.4Ql r0 = (X.AnonymousClass4Ql) r0
            com.whatsapp.WaImageButton r0 = r0.A0A
            goto L_0x0730
        L_0x072a:
            java.lang.Object r0 = r14.A00
            X.4Ql r0 = (X.AnonymousClass4Ql) r0
            com.whatsapp.WaImageButton r0 = r0.A09
        L_0x0730:
            r0.callOnClick()
            return
        L_0x0734:
            java.lang.Object r0 = r14.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1L()
            return
        L_0x073c:
            X.66r r5 = r4.A0D
            X.2sj r1 = r4.A0K
            X.2sr r0 = r4.A0B
            java.util.List r8 = X.AnonymousClass36T.A03(r0, r3, r1, r2)
            com.whatsapp.jid.GroupJid r7 = r4.A02
            r11 = 1
            boolean r12 = r4.A06
            X.5jl r5 = (X.C112455jl) r5
            r10 = 0
            r5.BL0(r6, r7, r8, r9, r10, r11, r12)
            r4.A07 = r11
            return
        L_0x0754:
            X.7Nq r6 = r5.A01
            boolean r9 = r5.A05
            boolean r10 = r5.A04
            X.7Qw r7 = r5.A02
            X.5Sr r5 = new X.5Sr
            r5.<init>(r6, r7, r8, r9, r10)
            r4.A0G(r5)
            return
        L_0x0765:
            X.5pi r2 = r2.A1m
            int r1 = r2.A00
            r0 = 3
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            r1 = r0 ^ 1
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r2.A0B(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109315eQ.onClick(android.view.View):void");
    }
}
