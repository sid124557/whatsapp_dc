package com.whatsapp.calling.avatar.view;

import X.AnonymousClass001;
import X.AnonymousClass1VX;
import X.AnonymousClass59B;
import X.AnonymousClass5Vo;
import X.AnonymousClass7PH;
import X.C08310eF;
import X.C111095hX;
import X.C139786sc;
import X.C162457s7;
import X.C18270x1;
import X.C185408tb;
import X.C620633i;
import X.C69263Wi;
import X.C86644Kx;
import X.C86664Kz;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.WaButtonWithLoader;

public abstract class FLMConsentBottomSheet extends Hilt_FLMConsentBottomSheet {
    public C111095hX A00;
    public C69263Wi A01;
    public WaButtonWithLoader A02;
    public WaButtonWithLoader A03;
    public AnonymousClass59B A04;
    public C620633i A05;
    public AnonymousClass1VX A06;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        View A0K = super.A0K(bundle, layoutInflater, viewGroup);
        ViewStub viewStub = null;
        if (A0K != null) {
            viewStub = C86664Kz.A0n(A0K, R.id.content_stub);
        }
        AnonymousClass59B B7k = A1Y().B7k();
        this.A04 = B7k;
        if (viewStub != null) {
            if (B7k == null) {
                throw C18270x1.A0S("consentType");
            }
            int ordinal = B7k.ordinal();
            if (ordinal != 0) {
                int i = R.layout.f8nameremoved;
                if (ordinal != 1) {
                    i = R.layout.f8nameremoved;
                }
                viewStub.setLayoutResource(i);
                viewStub.inflate();
            } else {
                throw AnonymousClass001.A0e("Invalid consent type");
            }
        }
        return A0K;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0083, code lost:
        if (r10 == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0088, code lost:
        if (r9 != 2) goto L_0x00dc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0w(android.os.Bundle r23, android.view.View r24) {
        /*
            r22 = this;
            r5 = 0
            r8 = r24
            X.C162457s7.A0J(r8, r5)
            r6 = r22
            r0 = r23
            super.A0w(r0, r8)
            X.59B r1 = r6.A04
            java.lang.String r12 = "consentType"
            if (r1 != 0) goto L_0x0018
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r12)
            throw r0
        L_0x0018:
            X.59B r0 = X.AnonymousClass59B.DISABLED
            if (r1 == r0) goto L_0x0036
            X.59B r0 = X.AnonymousClass59B.DOGFOODING
            if (r1 == r0) goto L_0x0036
            r0 = 2131434290(0x7f0b1b32, float:1.849039E38)
            android.widget.TextView r2 = X.AnonymousClass0x2.A0I(r8, r0)
            boolean r1 = r6.A1b()
            r0 = 2131887228(0x7f12047c, float:1.9409057E38)
            if (r1 == 0) goto L_0x0033
            r0 = 2131887229(0x7f12047d, float:1.940906E38)
        L_0x0033:
            r2.setText(r0)
        L_0x0036:
            X.59B r0 = r6.A04
            if (r0 != 0) goto L_0x003f
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r12)
            throw r0
        L_0x003f:
            int r0 = r0.ordinal()
            if (r0 == r5) goto L_0x01d2
            r1 = 1
            if (r0 == r1) goto L_0x008b
            r0 = 2131428221(0x7f0b037d, float:1.847808E38)
            android.view.View r2 = X.C18280x3.A0E(r8, r0)
            com.whatsapp.calling.avatar.view.FLMConsentBulletRow r2 = (com.whatsapp.calling.avatar.view.FLMConsentBulletRow) r2
            boolean r10 = r6.A1b()
            r0 = 2131887219(0x7f120473, float:1.9409039E38)
            if (r10 == 0) goto L_0x005d
            r0 = 2131887220(0x7f120474, float:1.940904E38)
        L_0x005d:
            r2.setTitle(r0)
            X.59B r0 = r6.A04
            if (r0 != 0) goto L_0x0069
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r12)
            throw r0
        L_0x0069:
            int r9 = r0.ordinal()
            java.lang.String r7 = "Invalid consent type"
            r4 = 5
            r3 = 4
            r2 = 3
            r0 = 2
            if (r9 == r0) goto L_0x0080
            if (r9 == r2) goto L_0x00d9
            if (r9 == r3) goto L_0x00d9
            if (r9 == r4) goto L_0x0085
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r7)
            throw r0
        L_0x0080:
            r11 = 2131887222(0x7f120476, float:1.9409045E38)
            if (r10 != 0) goto L_0x016c
        L_0x0085:
            r11 = 2131887221(0x7f120475, float:1.9409043E38)
            if (r9 == r0) goto L_0x016c
            goto L_0x00dc
        L_0x008b:
            android.content.Context r3 = r6.A0G()
            r2 = 2131887214(0x7f12046e, float:1.9409029E38)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            android.text.Spanned r9 = X.C107575bX.A00(r3, r0, r2)
            X.C162457s7.A0D(r9)
            char[] r7 = new char[r1]
            r0 = 10
            r7[r5] = r0
            int r4 = r9.length()
            int r4 = r4 - r1
            r3 = 0
            r2 = 0
        L_0x00a8:
            if (r3 > r4) goto L_0x00c6
            r0 = r4
            if (r2 != 0) goto L_0x00ae
            r0 = r3
        L_0x00ae:
            char r1 = r9.charAt(r0)
            char r0 = r7[r5]
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            if (r2 != 0) goto L_0x00c1
            if (r0 != 0) goto L_0x00be
            r2 = 1
            goto L_0x00a8
        L_0x00be:
            int r3 = r3 + 1
            goto L_0x00a8
        L_0x00c1:
            if (r0 == 0) goto L_0x00c6
            int r4 = r4 + -1
            goto L_0x00a8
        L_0x00c6:
            int r0 = r4 + 1
            java.lang.CharSequence r1 = r9.subSequence(r3, r0)
            r0 = 2131428070(0x7f0b02e6, float:1.8477774E38)
            android.widget.TextView r0 = X.AnonymousClass002.A09(r8, r0)
            if (r0 == 0) goto L_0x011e
            r0.setText(r1)
            goto L_0x011e
        L_0x00d9:
            r11 = 2131887218(0x7f120472, float:1.9409037E38)
        L_0x00dc:
            if (r9 == r2) goto L_0x0170
            if (r9 != r3) goto L_0x016c
            java.lang.String r10 = "https://faq.whatsapp.com/829127588693564"
        L_0x00e2:
            r0 = 2131428222(0x7f0b037e, float:1.8478082E38)
            android.view.View r0 = X.C18280x3.A0E(r8, r0)
            com.whatsapp.calling.avatar.view.FLMConsentBulletRow r0 = (com.whatsapp.calling.avatar.view.FLMConsentBulletRow) r0
            X.1VX r9 = r6.A06
            if (r9 == 0) goto L_0x01cd
            X.3Wi r7 = r6.A01
            if (r7 == 0) goto L_0x01c6
            X.5hX r15 = r6.A00
            if (r15 == 0) goto L_0x01bf
            X.33i r4 = r6.A05
            if (r4 == 0) goto L_0x01b8
            android.content.Context r13 = r0.getContext()
            com.whatsapp.TextEmojiLabel r3 = r0.A00
            android.content.Context r2 = r0.getContext()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "privacy-policy"
            java.lang.String r20 = X.AnonymousClass002.A0F(r2, r0, r1, r5, r11)
            android.net.Uri r14 = android.net.Uri.parse(r10)
            r18 = r4
            r19 = r9
            r21 = r0
            r16 = r7
            r17 = r3
            X.C107635bd.A0E(r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x011e:
            r0 = 2131432617(0x7f0b14a9, float:1.8486997E38)
            android.view.View r0 = r8.findViewById(r0)
            com.whatsapp.WaButtonWithLoader r0 = (com.whatsapp.WaButtonWithLoader) r0
            r6.A02 = r0
            r0 = 2131433379(0x7f0b17a3, float:1.8488542E38)
            android.view.View r3 = r8.findViewById(r0)
            com.whatsapp.WaButtonWithLoader r3 = (com.whatsapp.WaButtonWithLoader) r3
            r6.A03 = r3
            com.whatsapp.WaButtonWithLoader r2 = r6.A02
            if (r2 == 0) goto L_0x0141
            r1 = 26
            X.5eP r0 = new X.5eP
            r0.<init>(r6, r1)
            r2.A00 = r0
        L_0x0141:
            if (r3 == 0) goto L_0x015c
            r1 = 27
            X.5eP r0 = new X.5eP
            r0.<init>(r6, r1)
            r3.A00 = r0
            r0 = 2131428364(0x7f0b040c, float:1.847837E38)
            android.view.View r1 = r3.findViewById(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = (com.whatsapp.wds.components.button.WDSButton) r1
            if (r1 == 0) goto L_0x015c
            X.6wU r0 = X.C142006wU.BORDERLESS
            r1.setVariant(r0)
        L_0x015c:
            com.whatsapp.WaButtonWithLoader r2 = r6.A02
            java.lang.String r4 = "Invalid consent type"
            r3 = 1
            if (r2 == 0) goto L_0x018b
            X.59B r0 = r6.A04
            if (r0 != 0) goto L_0x0174
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r12)
            throw r0
        L_0x016c:
            java.lang.String r10 = "https://www.whatsapp.com/legal/recommended-avatars-privacy-notice"
            goto L_0x00e2
        L_0x0170:
            java.lang.String r10 = "https://faq.whatsapp.com/334507007438726"
            goto L_0x00e2
        L_0x0174:
            int r0 = r0.ordinal()
            if (r0 == r5) goto L_0x01b3
            if (r0 == r3) goto L_0x0198
            boolean r1 = r6.A1b()
            r0 = 2131887225(0x7f120479, float:1.9409051E38)
            if (r1 == 0) goto L_0x0188
            r0 = 2131887226(0x7f12047a, float:1.9409053E38)
        L_0x0188:
            r2.setButtonText((int) r0)
        L_0x018b:
            com.whatsapp.WaButtonWithLoader r2 = r6.A03
            if (r2 == 0) goto L_0x01ad
            X.59B r0 = r6.A04
            if (r0 != 0) goto L_0x019c
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r12)
            throw r0
        L_0x0198:
            r0 = 2131887215(0x7f12046f, float:1.940903E38)
            goto L_0x0188
        L_0x019c:
            int r1 = r0.ordinal()
            if (r1 == r5) goto L_0x01ae
            r0 = 2131887216(0x7f120470, float:1.9409033E38)
            if (r1 == r3) goto L_0x01aa
            r0 = 2131887227(0x7f12047b, float:1.9409055E38)
        L_0x01aa:
            r2.setButtonText((int) r0)
        L_0x01ad:
            return
        L_0x01ae:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r4)
            throw r0
        L_0x01b3:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r4)
            throw r0
        L_0x01b8:
            java.lang.String r0 = "systemServices"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01bf:
            java.lang.String r0 = "activityUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01c6:
            java.lang.String r0 = "globalUI"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01cd:
            java.lang.RuntimeException r0 = X.C18270x1.A0R()
            throw r0
        L_0x01d2:
            java.lang.String r0 = "Invalid consent type"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.avatar.view.FLMConsentBottomSheet.A0w(android.os.Bundle, android.view.View):void");
    }

    public void A1W(AnonymousClass5Vo r3) {
        C162457s7.A0J(r3, 0);
        AnonymousClass7PH r1 = r3.A00;
        r1.A06 = false;
        r1.A04 = C139786sc.A00;
    }

    public abstract C185408tb A1Y();

    public abstract boolean A1b();

    public void onDismiss(DialogInterface dialogInterface) {
        DialogFragment dialogFragment;
        C162457s7.A0J(dialogInterface, 0);
        C08310eF A0D = A0R().getSupportFragmentManager().A0D(FLMConsentErrorDialogFragment.class.getName());
        if ((A0D instanceof DialogFragment) && (dialogFragment = (DialogFragment) A0D) != null) {
            dialogFragment.A1L();
        }
        A1Y().BSe();
        super.onDismiss(dialogInterface);
        this.A02 = null;
        this.A03 = null;
    }

    public final void A1Z() {
        WaButtonWithLoader waButtonWithLoader = this.A02;
        if (waButtonWithLoader != null) {
            waButtonWithLoader.A06 = false;
            waButtonWithLoader.A00();
        }
        WaButtonWithLoader waButtonWithLoader2 = this.A02;
        if (waButtonWithLoader2 != null) {
            waButtonWithLoader2.setEnabled(true);
        }
        WaButtonWithLoader waButtonWithLoader3 = this.A03;
        if (waButtonWithLoader3 != null) {
            waButtonWithLoader3.A06 = false;
            waButtonWithLoader3.A00();
        }
        WaButtonWithLoader waButtonWithLoader4 = this.A03;
        if (waButtonWithLoader4 != null) {
            waButtonWithLoader4.setEnabled(true);
        }
    }

    public final void A1a() {
        A1Z();
        C86644Kx.A1C(new FLMConsentErrorDialogFragment(), A0R());
    }

    public int A1S() {
        return R.layout.f8nameremoved;
    }
}
