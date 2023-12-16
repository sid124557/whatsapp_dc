package com.whatsapp.voipcalling;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass5VS;
import X.AnonymousClass5ZU;
import X.C18280x3;
import X.C18300x5;
import X.C47702dg;
import X.C56972sr;
import X.C64773Ex;
import android.os.Bundle;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VoipErrorDialogFragment extends Hilt_VoipErrorDialogFragment {
    public int A00;
    public int A01;
    public C56972sr A02;
    public C47702dg A03;
    public C64773Ex A04;
    public AnonymousClass5ZU A05;
    public ArrayList A06 = AnonymousClass001.A0s();

    public static VoipErrorDialogFragment A02(List list, int i, boolean z) {
        VoipErrorDialogFragment voipErrorDialogFragment = new VoipErrorDialogFragment();
        Bundle A08 = AnonymousClass002.A08();
        A08.putInt("error", C18280x3.A00(z ? 1 : 0));
        A08.putParcelableArrayList("user_jids", AnonymousClass002.A0J(list));
        A08.putInt("call_size", i);
        voipErrorDialogFragment.A0u(A08);
        voipErrorDialogFragment.A03 = new C47702dg();
        return voipErrorDialogFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        r3 = r9.A00;
        r0 = new java.lang.Object[1];
        X.AnonymousClass000.A1P(r0, r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0073, code lost:
        return r7.A0L(r0, r6, (long) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00de, code lost:
        return X.AnonymousClass0x7.A0n(r9, A1X(r9.A06), new java.lang.Object[1], 0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fe, code lost:
        return X.C08310eF.A09(r9).getString(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A1V() {
        /*
            r9 = this;
            int r0 = r9.A01
            r4 = 0
            r5 = 1
            switch(r0) {
                case 1: goto L_0x0062;
                case 2: goto L_0x003b;
                case 3: goto L_0x0074;
                case 4: goto L_0x0078;
                case 5: goto L_0x008b;
                case 6: goto L_0x008f;
                case 7: goto L_0x0093;
                case 8: goto L_0x0097;
                case 9: goto L_0x009b;
                case 10: goto L_0x009f;
                case 11: goto L_0x00a3;
                case 12: goto L_0x00a7;
                case 13: goto L_0x00ab;
                case 14: goto L_0x00af;
                case 15: goto L_0x00b3;
                case 16: goto L_0x00b7;
                case 17: goto L_0x00bb;
                case 18: goto L_0x000f;
                case 19: goto L_0x00bf;
                case 20: goto L_0x00c3;
                case 21: goto L_0x00bf;
                case 22: goto L_0x00c7;
                case 23: goto L_0x00cb;
                case 24: goto L_0x0093;
                case 25: goto L_0x00cf;
                case 26: goto L_0x00df;
                case 27: goto L_0x000f;
                case 28: goto L_0x00bf;
                case 29: goto L_0x00bf;
                case 30: goto L_0x00e3;
                case 31: goto L_0x00e7;
                case 32: goto L_0x0014;
                case 33: goto L_0x00eb;
                case 34: goto L_0x00ef;
                case 35: goto L_0x00f3;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.String r0 = "Unknown error"
            X.C626936e.A0D(r4, r0)
            java.lang.String r0 = ""
            return r0
        L_0x000f:
            r2 = 2131895292(0x7f1223fc, float:1.9425413E38)
            goto L_0x00d2
        L_0x0014:
            java.util.ArrayList r2 = r9.A06
            int r0 = r2.size()
            if (r0 != r5) goto L_0x0036
            X.2sr r1 = r9.A02
            java.lang.Object r0 = r2.get(r4)
            X.4uZ r0 = (X.C95814uZ) r0
            boolean r0 = r1.A0a(r0)
            if (r0 == 0) goto L_0x0036
            r1 = 2131889100(0x7f120bcc, float:1.9412854E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r9)
            java.lang.String r0 = r0.getString(r1)
            return r0
        L_0x0036:
            r2 = 2131889099(0x7f120bcb, float:1.9412852E38)
            goto L_0x00d2
        L_0x003b:
            java.util.ArrayList r8 = r9.A06
            int r0 = r8.size()
            X.33j r7 = r9.A01
            r6 = 2131755407(0x7f10018f, float:1.9141692E38)
            if (r0 != r5) goto L_0x0067
            r6 = 2131755408(0x7f100190, float:1.9141694E38)
            int r0 = r9.A00
            long r1 = (long) r0
            java.lang.Object[] r3 = X.AnonymousClass002.A0M()
            java.lang.String r0 = r9.A1X(r8)
            r3[r4] = r0
            int r0 = r9.A00
            X.AnonymousClass000.A1P(r3, r0, r5)
            java.lang.String r0 = r7.A0L(r3, r6, r1)
            return r0
        L_0x0062:
            X.33j r7 = r9.A01
            r6 = 2131755406(0x7f10018e, float:1.914169E38)
        L_0x0067:
            int r3 = r9.A00
            long r1 = (long) r3
            java.lang.Object[] r0 = new java.lang.Object[r5]
            X.AnonymousClass000.A1P(r0, r3, r4)
            java.lang.String r0 = r7.A0L(r0, r6, r1)
            return r0
        L_0x0074:
            r1 = 2131895343(0x7f12242f, float:1.9425516E38)
            goto L_0x00f6
        L_0x0078:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r0 = 64
            X.AnonymousClass000.A1P(r2, r0, r4)
            r1 = 2131895336(0x7f122428, float:1.9425502E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r9)
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
        L_0x008b:
            r1 = 2131895306(0x7f12240a, float:1.9425441E38)
            goto L_0x00f6
        L_0x008f:
            r1 = 2131895311(0x7f12240f, float:1.9425451E38)
            goto L_0x00f6
        L_0x0093:
            r1 = 2131895310(0x7f12240e, float:1.942545E38)
            goto L_0x00f6
        L_0x0097:
            r1 = 2131895304(0x7f122408, float:1.9425437E38)
            goto L_0x00f6
        L_0x009b:
            r1 = 2131895308(0x7f12240c, float:1.9425445E38)
            goto L_0x00f6
        L_0x009f:
            r1 = 2131890472(0x7f121128, float:1.9415637E38)
            goto L_0x00f6
        L_0x00a3:
            r1 = 2131890468(0x7f121124, float:1.9415629E38)
            goto L_0x00f6
        L_0x00a7:
            r1 = 2131890469(0x7f121125, float:1.941563E38)
            goto L_0x00f6
        L_0x00ab:
            r1 = 2131890478(0x7f12112e, float:1.9415649E38)
            goto L_0x00f6
        L_0x00af:
            r1 = 2131890477(0x7f12112d, float:1.9415647E38)
            goto L_0x00f6
        L_0x00b3:
            r1 = 2131890470(0x7f121126, float:1.9415633E38)
            goto L_0x00f6
        L_0x00b7:
            r1 = 2131890479(0x7f12112f, float:1.941565E38)
            goto L_0x00f6
        L_0x00bb:
            r1 = 2131894180(0x7f121fa4, float:1.9423157E38)
            goto L_0x00f6
        L_0x00bf:
            r1 = 2131887247(0x7f12048f, float:1.9409096E38)
            goto L_0x00f6
        L_0x00c3:
            r1 = 2131887758(0x7f12068e, float:1.9410132E38)
            goto L_0x00f6
        L_0x00c7:
            r1 = 2131890251(0x7f12104b, float:1.9415189E38)
            goto L_0x00f6
        L_0x00cb:
            r1 = 2131892618(0x7f12198a, float:1.941999E38)
            goto L_0x00f6
        L_0x00cf:
            r2 = 2131893050(0x7f121b3a, float:1.9420866E38)
        L_0x00d2:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.util.ArrayList r0 = r9.A06
            java.lang.String r0 = r9.A1X(r0)
            java.lang.String r0 = X.AnonymousClass0x7.A0n(r9, r0, r1, r4, r2)
            return r0
        L_0x00df:
            r1 = 2131894547(0x7f122113, float:1.9423902E38)
            goto L_0x00f6
        L_0x00e3:
            r1 = 2131895305(0x7f122409, float:1.942544E38)
            goto L_0x00f6
        L_0x00e7:
            r1 = 2131893345(0x7f121c61, float:1.9421464E38)
            goto L_0x00f6
        L_0x00eb:
            r1 = 2131895186(0x7f122392, float:1.9425198E38)
            goto L_0x00f6
        L_0x00ef:
            r1 = 2131888330(0x7f1208ca, float:1.9411292E38)
            goto L_0x00f6
        L_0x00f3:
            r1 = 2131889186(0x7f120c22, float:1.9413028E38)
        L_0x00f6:
            android.content.res.Resources r0 = X.C08310eF.A09(r9)
            java.lang.String r0 = r0.getString(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipErrorDialogFragment.A1V():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        return X.C08310eF.A09(r9).getString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        return "";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A1W() {
        /*
            r9 = this;
            int r0 = r9.A01
            java.lang.String r1 = ""
            r7 = 0
            switch(r0) {
                case 1: goto L_0x0056;
                case 2: goto L_0x004a;
                case 3: goto L_0x0046;
                case 4: goto L_0x0042;
                case 5: goto L_0x003e;
                case 6: goto L_0x003e;
                case 7: goto L_0x003e;
                case 8: goto L_0x003a;
                case 9: goto L_0x0036;
                case 10: goto L_0x0032;
                case 11: goto L_0x0032;
                case 12: goto L_0x003a;
                case 13: goto L_0x0032;
                case 14: goto L_0x0032;
                case 15: goto L_0x0032;
                case 16: goto L_0x0032;
                case 17: goto L_0x0032;
                case 18: goto L_0x000d;
                case 19: goto L_0x002e;
                case 20: goto L_0x0046;
                case 21: goto L_0x002a;
                case 22: goto L_0x000d;
                case 23: goto L_0x0026;
                case 24: goto L_0x003e;
                case 25: goto L_0x000d;
                case 26: goto L_0x000d;
                case 27: goto L_0x000d;
                case 28: goto L_0x0022;
                case 29: goto L_0x001e;
                case 30: goto L_0x000d;
                case 31: goto L_0x001a;
                case 32: goto L_0x000d;
                case 33: goto L_0x0016;
                case 34: goto L_0x0012;
                case 35: goto L_0x000e;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.String r0 = "Unknown error"
            X.C626936e.A0D(r7, r0)
        L_0x000d:
            return r1
        L_0x000e:
            r1 = 2131889185(0x7f120c21, float:1.9413026E38)
            goto L_0x004d
        L_0x0012:
            r1 = 2131888329(0x7f1208c9, float:1.941129E38)
            goto L_0x004d
        L_0x0016:
            r1 = 2131895187(0x7f122393, float:1.94252E38)
            goto L_0x004d
        L_0x001a:
            r1 = 2131893346(0x7f121c62, float:1.9421466E38)
            goto L_0x004d
        L_0x001e:
            r1 = 2131893023(0x7f121b1f, float:1.942081E38)
            goto L_0x004d
        L_0x0022:
            r1 = 2131893051(0x7f121b3b, float:1.9420868E38)
            goto L_0x004d
        L_0x0026:
            r1 = 2131894547(0x7f122113, float:1.9423902E38)
            goto L_0x004d
        L_0x002a:
            r1 = 2131887377(0x7f120511, float:1.940936E38)
            goto L_0x004d
        L_0x002e:
            r1 = 2131887248(0x7f120490, float:1.9409098E38)
            goto L_0x004d
        L_0x0032:
            r1 = 2131895250(0x7f1223d2, float:1.9425328E38)
            goto L_0x004d
        L_0x0036:
            r1 = 2131895309(0x7f12240d, float:1.9425447E38)
            goto L_0x004d
        L_0x003a:
            r1 = 2131895305(0x7f122409, float:1.942544E38)
            goto L_0x004d
        L_0x003e:
            r1 = 2131895312(0x7f122410, float:1.9425453E38)
            goto L_0x004d
        L_0x0042:
            r1 = 2131895337(0x7f122429, float:1.9425504E38)
            goto L_0x004d
        L_0x0046:
            r1 = 2131895344(0x7f122430, float:1.9425518E38)
            goto L_0x004d
        L_0x004a:
            r1 = 2131895291(0x7f1223fb, float:1.942541E38)
        L_0x004d:
            android.content.res.Resources r0 = X.C08310eF.A09(r9)
            java.lang.String r0 = r0.getString(r1)
            return r0
        L_0x0056:
            java.util.ArrayList r8 = r9.A06
            int r1 = r8.size()
            r0 = 3
            r6 = 1
            X.33j r5 = r9.A01
            if (r1 > r0) goto L_0x0077
            r4 = 2131755405(0x7f10018d, float:1.9141688E38)
            int r0 = r8.size()
            long r2 = (long) r0
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = r9.A1X(r8)
            r1[r7] = r0
            java.lang.String r0 = r5.A0L(r1, r4, r2)
            return r0
        L_0x0077:
            r4 = 2131755404(0x7f10018c, float:1.9141686E38)
            int r0 = X.AnonymousClass0x9.A03(r8, r6)
            long r1 = (long) r0
            java.lang.Object[] r3 = X.AnonymousClass002.A0M()
            java.util.List r0 = r8.subList(r7, r6)
            java.lang.String r0 = r9.A1X(r0)
            r3[r7] = r0
            java.util.ArrayList r0 = r9.A06
            int r0 = X.AnonymousClass0x9.A03(r0, r6)
            X.AnonymousClass000.A1P(r3, r0, r6)
            java.lang.String r0 = r5.A0L(r3, r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipErrorDialogFragment.A1W():java.lang.String");
    }

    public static VoipErrorDialogFragment A00(Bundle bundle, C47702dg r3, int i) {
        Bundle A08 = AnonymousClass002.A08();
        A08.putAll(bundle);
        A08.putInt("error", i);
        VoipErrorDialogFragment voipErrorDialogFragment = new VoipErrorDialogFragment();
        voipErrorDialogFragment.A0u(A08);
        voipErrorDialogFragment.A03 = r3;
        return voipErrorDialogFragment;
    }

    public static VoipErrorDialogFragment A01(C47702dg r2, int i) {
        Bundle A08 = AnonymousClass002.A08();
        A08.putInt("error", i);
        VoipErrorDialogFragment voipErrorDialogFragment = new VoipErrorDialogFragment();
        voipErrorDialogFragment.A0u(A08);
        voipErrorDialogFragment.A03 = r2;
        return voipErrorDialogFragment;
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            this.A01 = bundle2.getInt("error");
            this.A06 = bundle2.getParcelableArrayList("user_jids");
            this.A00 = bundle2.getInt("call_size");
        }
        if (this.A06 == null) {
            this.A06 = AnonymousClass001.A0s();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1J(android.os.Bundle r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.A1W()
            java.lang.String r1 = r5.A1V()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0017
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r0 = 0
            if (r1 != 0) goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            X.C626936e.A0B(r0)
            X.0zH r3 = X.C18300x5.A0M(r5)
            java.lang.String r0 = r5.A1W()
            r3.A0h(r0)
            java.lang.String r0 = r5.A1V()
            r3.A0g(r0)
            r3.A0i(r4)
            int r0 = r5.A01
            switch(r0) {
                case 1: goto L_0x003a;
                case 2: goto L_0x003a;
                case 3: goto L_0x003a;
                case 4: goto L_0x003a;
                case 5: goto L_0x0079;
                case 6: goto L_0x003a;
                case 7: goto L_0x003a;
                case 8: goto L_0x003a;
                case 9: goto L_0x003a;
                case 10: goto L_0x003a;
                case 11: goto L_0x003a;
                case 12: goto L_0x003a;
                case 13: goto L_0x003a;
                case 14: goto L_0x003a;
                case 15: goto L_0x003a;
                case 16: goto L_0x003a;
                case 17: goto L_0x003a;
                case 18: goto L_0x003a;
                case 19: goto L_0x007f;
                case 20: goto L_0x007f;
                case 21: goto L_0x003a;
                case 22: goto L_0x003a;
                case 23: goto L_0x003a;
                case 24: goto L_0x003a;
                case 25: goto L_0x003a;
                case 26: goto L_0x003a;
                case 27: goto L_0x003a;
                case 28: goto L_0x003a;
                case 29: goto L_0x003a;
                case 30: goto L_0x003a;
                case 31: goto L_0x003a;
                case 32: goto L_0x003a;
                case 33: goto L_0x003a;
                case 34: goto L_0x003a;
                case 35: goto L_0x003a;
                default: goto L_0x0035;
            }
        L_0x0035:
            java.lang.String r0 = "Unknown error"
            X.C626936e.A0D(r2, r0)
        L_0x003a:
            int r0 = r5.A01
            switch(r0) {
                case 1: goto L_0x0064;
                case 2: goto L_0x0064;
                case 3: goto L_0x0064;
                case 4: goto L_0x0064;
                case 5: goto L_0x006a;
                case 6: goto L_0x0064;
                case 7: goto L_0x0064;
                case 8: goto L_0x0064;
                case 9: goto L_0x0064;
                case 10: goto L_0x0064;
                case 11: goto L_0x0070;
                case 12: goto L_0x0064;
                case 13: goto L_0x0064;
                case 14: goto L_0x0064;
                case 15: goto L_0x0064;
                case 16: goto L_0x0064;
                case 17: goto L_0x0064;
                case 18: goto L_0x0064;
                case 19: goto L_0x006a;
                case 20: goto L_0x006a;
                case 21: goto L_0x0070;
                case 22: goto L_0x0070;
                case 23: goto L_0x0070;
                case 24: goto L_0x0070;
                case 25: goto L_0x0064;
                case 26: goto L_0x0070;
                case 27: goto L_0x0064;
                case 28: goto L_0x0064;
                case 29: goto L_0x0064;
                case 30: goto L_0x0064;
                case 31: goto L_0x0064;
                case 32: goto L_0x0064;
                case 33: goto L_0x0064;
                case 34: goto L_0x0064;
                case 35: goto L_0x0064;
                default: goto L_0x003f;
            }
        L_0x003f:
            java.lang.String r0 = "Unknown error"
            X.C626936e.A0D(r2, r0)
        L_0x0044:
            android.os.Bundle r1 = r5.A06
            if (r1 == 0) goto L_0x005a
            java.lang.String r0 = "finish"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L_0x005a
            r2 = 1
            r1 = 3
            X.4JL r0 = new X.4JL
            r0.<init>(r5, r1)
            r3.A0M(r0)
        L_0x005a:
            X.043 r1 = r3.create()
            r0 = r2 ^ 1
            r1.setCanceledOnTouchOutside(r0)
            return r1
        L_0x0064:
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 116(0x74, float:1.63E-43)
            goto L_0x0075
        L_0x006a:
            r1 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r0 = 117(0x75, float:1.64E-43)
            goto L_0x0075
        L_0x0070:
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 118(0x76, float:1.65E-43)
        L_0x0075:
            X.C85804Hr.A00(r3, r5, r0, r1)
            goto L_0x0044
        L_0x0079:
            r1 = 2131895298(0x7f122402, float:1.9425425E38)
            r0 = 119(0x77, float:1.67E-43)
            goto L_0x0084
        L_0x007f:
            r1 = 2131887273(0x7f1204a9, float:1.9409148E38)
            r0 = 120(0x78, float:1.68E-43)
        L_0x0084:
            X.C85804Hr.A01(r3, r5, r0, r1)
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipErrorDialogFragment.A1J(android.os.Bundle):android.app.Dialog");
    }

    public final String A1X(List list) {
        ArrayList A0p = AnonymousClass000.A0p(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0p.add(C18300x5.A0h(this.A05, this.A04.A0A(C18300x5.A0P(it))));
        }
        if (A0p.size() <= 3) {
            return AnonymousClass5VS.A00(this.A05.A03, A0p, true);
        }
        int size = A0p.size() - 1;
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = A0p.get(0);
        AnonymousClass000.A1P(A0M, size, 1);
        return this.A01.A0L(A0M, R.plurals.f9nameremoved, (long) size);
    }
}
