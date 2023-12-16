package com.whatsapp.calling.fragment;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass33p;
import X.AnonymousClass36T;
import X.AnonymousClass3ZH;
import X.AnonymousClass47y;
import X.AnonymousClass4FU;
import X.C1230066r;
import X.C18260x0;
import X.C18280x3;
import X.C56892sj;
import X.C56972sr;
import X.C627336j;
import X.C64773Ex;
import X.C69263Wi;
import X.C89654ea;
import X.C95814uZ;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.quickcontact.QuickContactActivity;
import com.whatsapp.util.Log;
import java.util.List;

public class CallConfirmationFragment extends Hilt_CallConfirmationFragment {
    public C56972sr A00;
    public C1230066r A01;
    public C64773Ex A02;
    public AnonymousClass33p A03;
    public C56892sj A04;
    public boolean A05 = false;
    public final List A06 = AnonymousClass001.A0s();

    public static void A00(C89654ea r5, AnonymousClass3ZH r6, Integer num, boolean z) {
        CallConfirmationFragment callConfirmationFragment = new CallConfirmationFragment();
        Bundle A08 = AnonymousClass002.A08();
        Class<C95814uZ> cls = C95814uZ.class;
        A08.putString("jid", C627336j.A07(r6.A0I(cls)));
        A08.putBoolean("is_video_call", z);
        A08.putInt("call_from_ui", num.intValue());
        callConfirmationFragment.A0u(A08);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("showCallConfirmationDialog groupJid: ");
        C18260x0.A0o(r6.A0I(cls), A0o);
        r5.Boo(callConfirmationFragment);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.043} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.4SH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.043} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.043} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: X.043} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: X.043} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1J(android.os.Bundle r19) {
        /*
            r18 = this;
            r7 = r18
            X.03q r8 = r7.A0R()
            android.os.Bundle r1 = r7.A0H()
            java.lang.String r0 = "is_video_call"
            boolean r11 = r1.getBoolean(r0)
            android.os.Bundle r1 = r7.A0H()
            java.lang.String r0 = "jid"
            java.lang.String r0 = r1.getString(r0)
            X.4uZ r1 = X.C18310x6.A0S(r0)
            X.C626936e.A06(r1)
            X.3Ex r0 = r7.A02
            X.3ZH r9 = r0.A0A(r1)
            android.os.Bundle r1 = r7.A0H()
            java.lang.String r0 = "education_message_resouce_id"
            r6 = 0
            int r5 = r1.getInt(r0, r6)
            if (r5 != 0) goto L_0x00df
            boolean r0 = r9.A0U()
            if (r0 == 0) goto L_0x00c0
            X.4SH r2 = new X.4SH
            r2.<init>(r8, r6)
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources$Theme r3 = r0.getTheme()
            int[] r1 = X.C18330xA.A0E()
            r0 = 2130969261(0x7f0402ad, float:1.7547199E38)
            r1[r6] = r0
            android.content.res.TypedArray r0 = r3.obtainStyledAttributes(r1)
            boolean r0 = r0.getBoolean(r6, r6)
            r2.A09 = r0
            r0 = 2131624284(0x7f0e015c, float:1.8875743E38)
            r2.setContentView(r0)
            r0 = 2131428389(0x7f0b0425, float:1.8478421E38)
            android.view.View r4 = r2.findViewById(r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x009f
            r0 = 2131231929(0x7f0804b9, float:1.8079953E38)
            if (r11 == 0) goto L_0x0073
            r0 = 2131231931(0x7f0804bb, float:1.8079957E38)
        L_0x0073:
            android.graphics.drawable.Drawable r3 = X.AnonymousClass0RP.A00(r8, r0)
            if (r3 == 0) goto L_0x008a
            android.graphics.drawable.Drawable r3 = X.C06130Wj.A01(r3)
            r1 = 2130968687(0x7f04006f, float:1.7546035E38)
            r0 = 2131099770(0x7f06007a, float:1.7811903E38)
            int r0 = X.C18300x5.A03(r8, r1, r0)
            X.AnonymousClass0YG.A06(r3, r0)
        L_0x008a:
            X.33j r0 = r7.A01
            boolean r1 = X.C620733j.A04(r0)
            r0 = 0
            if (r1 == 0) goto L_0x00bc
            r4.setCompoundDrawablesWithIntrinsicBounds(r3, r0, r0, r0)
        L_0x0096:
            r10 = 1
            X.5en r6 = new X.5en
            r6.<init>(r7, r8, r9, r10, r11)
            r4.setOnClickListener(r6)
        L_0x009f:
            r0 = 2131429423(0x7f0b082f, float:1.8480518E38)
            android.view.View r1 = r2.findViewById(r0)
            if (r1 == 0) goto L_0x00ae
            r0 = 2131233540(0x7f080b04, float:1.808322E38)
            r1.setBackgroundResource(r0)
        L_0x00ae:
            r0 = 1
            r2.setCanceledOnTouchOutside(r0)
            boolean r0 = r8 instanceof X.AnonymousClass47y
            if (r0 == 0) goto L_0x00bb
            java.util.List r0 = r7.A06
            r0.add(r8)
        L_0x00bb:
            return r2
        L_0x00bc:
            r4.setCompoundDrawablesWithIntrinsicBounds(r0, r0, r3, r0)
            goto L_0x0096
        L_0x00c0:
            X.0zH r2 = X.AnonymousClass5V0.A00(r8)
            r0 = 2131886483(0x7f120193, float:1.9407546E38)
            if (r11 == 0) goto L_0x00cc
            r0 = 2131895017(0x7f1222e9, float:1.9424855E38)
        L_0x00cc:
            r2.A0A(r0)
            r1 = 2131887209(0x7f120469, float:1.9409019E38)
            X.372 r0 = new X.372
            r0.<init>(r8, r7, r9, r11)
            X.AnonymousClass0x2.A0t(r0, r2, r1)
            X.043 r2 = r2.create()
            goto L_0x00ae
        L_0x00df:
            android.os.Bundle r1 = r7.A0H()
            java.lang.String r0 = "education_message_display_limit"
            int r16 = r1.getInt(r0, r6)
            android.os.Bundle r1 = r7.A0H()
            java.lang.String r0 = "callee_name"
            java.lang.String r2 = r1.getString(r0)
            X.0zH r4 = X.AnonymousClass5V0.A00(r8)
            r3 = 2131886482(0x7f120192, float:1.9407544E38)
            if (r11 == 0) goto L_0x00ff
            r3 = 2131895016(0x7f1222e8, float:1.9424853E38)
        L_0x00ff:
            r0 = 1
            if (r2 != 0) goto L_0x0123
            android.content.res.Resources r2 = X.C08310eF.A09(r7)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = ""
            java.lang.String r0 = X.C18320x8.A0b(r2, r0, r1, r6, r5)
        L_0x010e:
            r4.setTitle(r0)
            X.375 r12 = new X.375
            r13 = r8
            r14 = r7
            r15 = r9
            r17 = r11
            r12.<init>(r13, r14, r15, r16, r17)
            X.AnonymousClass0x2.A0t(r12, r4, r3)
            X.043 r2 = r4.create()
            goto L_0x00ae
        L_0x0123:
            android.content.res.Resources r1 = X.C08310eF.A09(r7)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r0 = X.C18320x8.A0b(r1, r2, r0, r6, r5)
            goto L_0x010e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.fragment.CallConfirmationFragment.A1J(android.os.Bundle):android.app.Dialog");
    }

    public static void A01(C69263Wi r7, AnonymousClass3ZH r8, Integer num, String str, int i, boolean z) {
        Integer valueOf = Integer.valueOf(i);
        CallConfirmationFragment callConfirmationFragment = new CallConfirmationFragment();
        Bundle A08 = AnonymousClass002.A08();
        Class<C95814uZ> cls = C95814uZ.class;
        A08.putString("jid", C627336j.A07(r8.A0I(cls)));
        A08.putBoolean("is_video_call", z);
        A08.putInt("call_from_ui", num.intValue());
        if (valueOf != null) {
            A08.putInt("education_message_resouce_id", R.string.f11nameremoved);
            A08.putString("callee_name", str);
            A08.putInt("education_message_display_limit", valueOf.intValue());
        }
        callConfirmationFragment.A0u(A08);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("showCallConfirmationDialog groupJid: ");
        C18260x0.A0o(r8.A0I(cls), A0o);
        AnonymousClass4FU r1 = r7.A00;
        if (r1 != null) {
            r1.Bon(callConfirmationFragment, "CallConfirmationFragment");
        } else {
            Log.e("CallConfirmationFragment null dialog interface, show dialog failed.");
        }
    }

    public static boolean A02(C89654ea r2, AnonymousClass33p r3, AnonymousClass3ZH r4, Integer num, boolean z) {
        if (C18280x3.A02(AnonymousClass0x2.A0F(r3), "call_confirmation_dialog_count") >= 5 && !r4.A0U()) {
            return false;
        }
        A00(r2, r4, num, z);
        return true;
    }

    public static boolean A03(C89654ea r1, AnonymousClass3ZH r2, Integer num, boolean z) {
        if (!r2.A0U()) {
            return false;
        }
        A00(r1, r2, num, z);
        return true;
    }

    public final void A1V(Activity activity, AnonymousClass3ZH r11, boolean z) {
        int i = A0H().getInt("call_from_ui");
        Activity activity2 = activity;
        this.A01.Bpm(activity2, (GroupJid) AnonymousClass3ZH.A04(r11), AnonymousClass36T.A03(this.A00, this.A02, this.A04, r11), i, z);
        this.A05 = true;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.A05) {
            for (AnonymousClass47y r1 : this.A06) {
                ((QuickContactActivity) r1).A76(false);
            }
        }
        this.A06.clear();
    }
}
