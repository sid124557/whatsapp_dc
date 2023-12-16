package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.whatsapp.status.playback.fragment.OpenLinkConfirmationDialogFragment;
import com.whatsapp.status.playback.fragment.OpenLinkDialogFragment;
import java.util.Set;

/* renamed from: X.5VM  reason: invalid class name */
public final class AnonymousClass5VM {
    public static final void A00(Context context, C184988ss r9, AnonymousClass66G r10, String str, String str2, Set set, boolean z, boolean z2) {
        OpenLinkDialogFragment A00;
        C162457s7.A0J(str, 0);
        Context context2 = context;
        C184988ss r2 = r9;
        C18260x0.A0Z(context, str2, r9, 1);
        if (set != null) {
            A00 = C379624s.A00(str, str2, set);
        } else if (!z || z2) {
            r2.BkY(context2, Uri.parse(str), (C624134x) null, 0, 1);
            return;
        } else {
            A00 = new OpenLinkConfirmationDialogFragment();
            Bundle A08 = AnonymousClass002.A08();
            A08.putString("url", str);
            A08.putString("message_key_id", str2);
            A00.A0u(A08);
        }
        A00.A04 = r10;
        C111095hX.A05(context).Boo(A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        if (r0.A0o == null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (X.AnonymousClass35Z.A04((X.AnonymousClass1nB) r12) == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(X.AnonymousClass1VX r10, X.C48132eP r11, X.C624134x r12) {
        /*
            boolean r8 = X.C18270x1.A1U(r11, r12)
            boolean r3 = r12 instanceof X.C30471mV
            boolean r2 = r12 instanceof X.C31971pB
            r9 = 0
            if (r2 == 0) goto L_0x0015
            r0 = r12
            X.1nB r0 = (X.AnonymousClass1nB) r0
            boolean r0 = X.AnonymousClass35Z.A04(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            X.2z0 r0 = r12.A1J
            boolean r0 = r0.A02
            if (r3 == 0) goto L_0x0022
            if (r0 == 0) goto L_0x0023
            if (r2 == 0) goto L_0x0022
            if (r1 != 0) goto L_0x0023
        L_0x0022:
            return r8
        L_0x0023:
            r6 = r12
            X.1mV r6 = (X.C30471mV) r6
            X.33C r5 = r6.A01
            if (r5 == 0) goto L_0x0072
            r7 = 0
            if (r10 == 0) goto L_0x0033
            r0 = 2917(0xb65, float:4.088E-42)
            java.lang.String r7 = r10.A0Q(r0)
        L_0x0033:
            byte r1 = r12.A1I
            r0 = 3
            boolean r4 = X.AnonymousClass000.A1U(r1, r0)
            boolean r3 = r5.A0c
            X.1I7 r0 = r11.A00(r5)
            if (r0 == 0) goto L_0x0047
            X.2sU r0 = r0.A0o
            r2 = 1
            if (r0 != 0) goto L_0x0048
        L_0x0047:
            r2 = 0
        L_0x0048:
            int r0 = r5.A07
            boolean r1 = X.AnonymousClass001.A1X(r0, r8)
            if (r4 == 0) goto L_0x005c
            if (r3 == 0) goto L_0x005c
            if (r2 == 0) goto L_0x005c
            boolean r0 = X.C107535bT.A0C(r7)
            if (r0 != 0) goto L_0x005c
        L_0x005a:
            r9 = 1
        L_0x005b:
            return r9
        L_0x005c:
            boolean r0 = r12 instanceof X.AnonymousClass1n2
            if (r0 == 0) goto L_0x0067
            boolean r0 = X.C627636p.A0x(r6)
            if (r0 == 0) goto L_0x0067
            goto L_0x005a
        L_0x0067:
            boolean r0 = r5.A0R
            if (r0 == 0) goto L_0x005b
            if (r1 == 0) goto L_0x005b
            java.io.File r0 = r5.A0F
            if (r0 == 0) goto L_0x005b
            goto L_0x005a
        L_0x0072:
            java.lang.IllegalArgumentException r0 = X.C18300x5.A0X()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5VM.A01(X.1VX, X.2eP, X.34x):boolean");
    }
}
