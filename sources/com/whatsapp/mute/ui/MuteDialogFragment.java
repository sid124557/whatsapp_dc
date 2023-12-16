package com.whatsapp.mute.ui;

import X.AnonymousClass0x9;
import X.AnonymousClass33p;
import X.AnonymousClass4FS;
import X.AnonymousClass58H;
import X.AnonymousClass66R;
import X.AnonymousClass8PJ;
import X.C154517dI;
import X.C18330xA;
import X.C28891hw;
import X.C69263Wi;
import X.C73723fy;
import X.C78923vn;
import X.C78933vo;
import X.C78943vp;
import X.C80793yo;
import X.C80803yp;
import X.C95814uZ;
import android.content.DialogInterface;
import java.util.List;

public final class MuteDialogFragment extends Hilt_MuteDialogFragment {
    public C69263Wi A00;
    public AnonymousClass33p A01;
    public AnonymousClass4FS A02;
    public final AnonymousClass66R A03;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        if (r3 != null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r1 != true) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1J(android.os.Bundle r19) {
        /*
            r18 = this;
            r2 = r18
            android.os.Bundle r1 = r2.A06
            if (r1 == 0) goto L_0x015c
            java.lang.String r0 = "mute_in_conversation_fragment"
            boolean r5 = r1.getBoolean(r0)
        L_0x000d:
            android.os.Bundle r0 = r2.A06
            java.lang.String r6 = "jid"
            r3 = 1
            if (r0 == 0) goto L_0x001b
            boolean r1 = r0.containsKey(r6)
            r0 = 1
            if (r1 == r3) goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            r4 = 0
            if (r0 == 0) goto L_0x012a
            X.5Yw r1 = X.C95814uZ.A00
            android.os.Bundle r0 = r2.A06
            if (r0 == 0) goto L_0x0127
            java.lang.String r0 = r0.getString(r6)
        L_0x0029:
            X.4uZ r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x0033
            java.util.List r4 = X.C18290x4.A12(r0)
        L_0x0033:
            android.os.Bundle r1 = r2.A06
            if (r1 == 0) goto L_0x0051
            java.lang.String r0 = "mute_entry_point"
            int r3 = r1.getInt(r0)
            X.21R[] r1 = X.AnonymousClass21R.values()
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            if (r3 < 0) goto L_0x0051
            int r0 = r1.length
            int r0 = r0 + -1
            if (r3 > r0) goto L_0x0051
            r3 = r1[r3]
            if (r3 != 0) goto L_0x0053
        L_0x0051:
            X.21R r3 = X.AnonymousClass21R.CHAT_LIST_SCREEN
        L_0x0053:
            X.66R r0 = r2.A03
            r17 = r0
            java.lang.Object r1 = r17.getValue()
            com.whatsapp.mute.ui.MuteDialogViewModel r1 = (com.whatsapp.mute.ui.MuteDialogViewModel) r1
            r0 = 2
            X.C162457s7.A0J(r3, r0)
            r1.A02 = r4
            r1.A03 = r5
            r1.A00 = r3
            X.0zH r7 = X.C18300x5.A0M(r2)
            r0 = 2131890892(0x7f1212cc, float:1.9416489E38)
            r7.A0B(r0)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 71
            X.C85804Hr.A01(r7, r2, r0, r1)
            r1 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r0 = 72
            X.C85804Hr.A00(r7, r2, r0, r1)
            X.03q r0 = r2.A0R()
            android.view.LayoutInflater r3 = r0.getLayoutInflater()
            r1 = 2131625496(0x7f0e0618, float:1.8878202E38)
            r0 = 0
            android.view.View r6 = X.AnonymousClass001.A0R(r3, r0, r1)
            r0 = 2131431632(0x7f0b10d0, float:1.8484999E38)
            android.view.View r5 = X.C18280x3.A0E(r6, r0)
            android.widget.RadioGroup r5 = (android.widget.RadioGroup) r5
            X.221[] r9 = X.AnonymousClass221.values()
            int r0 = r9.length
            r16 = r0
            r10 = 0
        L_0x00a2:
            r0 = r16
            if (r10 >= r0) goto L_0x0164
            r12 = r9[r10]
            java.lang.Object r0 = r17.getValue()
            com.whatsapp.mute.ui.MuteDialogViewModel r0 = (com.whatsapp.mute.ui.MuteDialogViewModel) r0
            X.221 r0 = r0.A01
            boolean r3 = X.AnonymousClass000.A1Y(r12, r0)
            android.content.res.Resources r1 = X.C08310eF.A09(r2)
            r0 = 2131168272(0x7f070c10, float:1.7950841E38)
            float r0 = r1.getDimension(r0)
            int r11 = (int) r0
            android.content.res.Resources r1 = X.C08310eF.A09(r2)
            r0 = 2131168275(0x7f070c13, float:1.7950847E38)
            float r0 = r1.getDimension(r0)
            int r8 = (int) r0
            android.content.Context r0 = r2.A1D()
            android.widget.RadioButton r4 = new android.widget.RadioButton
            r4.<init>(r0)
            int r0 = X.AnonymousClass0YH.A00()
            r4.setId(r0)
            int r15 = r12.ordinal()
            r14 = 2
            r13 = 1
            r1 = 1
            r0 = 0
            if (r15 == r0) goto L_0x011e
            if (r15 == r13) goto L_0x011a
            if (r15 != r14) goto L_0x015f
            X.33j r1 = r2.A01
            r0 = 2131890891(0x7f1212cb, float:1.9416487E38)
            java.lang.String r0 = r1.A0B(r0)
        L_0x00f3:
            X.C162457s7.A0D(r0)
            r4.setText(r0)
            r4.setChecked(r3)
            java.lang.String r0 = r12.name()
            r4.setTag(r0)
            r3 = -1
            r0 = -2
            android.widget.RadioGroup$LayoutParams r1 = new android.widget.RadioGroup$LayoutParams
            r1.<init>(r3, r0)
            r0 = 0
            r1.setMargins(r0, r11, r0, r11)
            r4.setLayoutParams(r1)
            r4.setPaddingRelative(r8, r0, r0, r0)
            r5.addView(r4)
            int r10 = r10 + 1
            goto L_0x00a2
        L_0x011a:
            X.33j r0 = r2.A01
            r14 = 4
            goto L_0x0122
        L_0x011e:
            X.33j r0 = r2.A01
            r1 = 8
        L_0x0122:
            java.lang.String r0 = X.C107565bW.A05(r0, r1, r14)
            goto L_0x00f3
        L_0x0127:
            r0 = r4
            goto L_0x0029
        L_0x012a:
            android.os.Bundle r0 = r2.A06
            java.lang.String r1 = "jids"
            if (r0 == 0) goto L_0x0033
            boolean r0 = r0.containsKey(r1)
            if (r0 != r3) goto L_0x0033
            android.os.Bundle r0 = r2.A06
            if (r0 == 0) goto L_0x0033
            java.util.ArrayList r0 = r0.getStringArrayList(r1)
            if (r0 == 0) goto L_0x0033
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r1 = r0.iterator()
        L_0x0148:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = X.AnonymousClass001.A0m(r1)
            X.4uZ r0 = X.C18310x6.A0S(r0)
            if (r0 == 0) goto L_0x0148
            r4.add(r0)
            goto L_0x0148
        L_0x015c:
            r5 = 0
            goto L_0x000d
        L_0x015f:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x0164:
            r1 = 2
            X.4Hq r0 = new X.4Hq
            r0.<init>(r2, r1, r5)
            r5.setOnCheckedChangeListener(r0)
            r7.setView(r6)
            X.043 r0 = X.C18300x5.A0H(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mute.ui.MuteDialogFragment.A1J(android.os.Bundle):android.app.Dialog");
    }

    public void onCancel(DialogInterface dialogInterface) {
        List list;
        C95814uZ r1;
        C28891hw r0;
        MuteDialogViewModel muteDialogViewModel = (MuteDialogViewModel) this.A03.getValue();
        if (!muteDialogViewModel.A03 && (list = muteDialogViewModel.A02) != null && (r1 = (C95814uZ) C73723fy.A04(list)) != null && (r0 = muteDialogViewModel.A09) != null) {
            r0.A0A(r1);
        }
    }

    public MuteDialogFragment() {
        AnonymousClass66R A002 = C154517dI.A00(AnonymousClass58H.NONE, new C78933vo(new C78923vn(this)));
        AnonymousClass8PJ A1E = AnonymousClass0x9.A1E(MuteDialogViewModel.class);
        this.A03 = C18330xA.A02(new C78943vp(A002), new C80803yp(this, A002), new C80793yo(A002), A1E);
    }
}
