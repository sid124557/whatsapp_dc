package X;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.36T  reason: invalid class name */
public class AnonymousClass36T {
    public static int A00(TelephonyManager telephonyManager, AnonymousClass5ZR r3) {
        if (telephonyManager != null && !r3.A0G()) {
            try {
                if (C107385bE.A09()) {
                    return telephonyManager.getCallStateForSubscription();
                }
                return telephonyManager.getCallState();
            } catch (SecurityException unused) {
                Log.w("voip/getTelephonyState SecurityException is caught");
            }
        }
        return 0;
    }

    public static AnonymousClass3ZH A01(C64773Ex r4, C66493Lq r5, GroupJid groupJid, C56572sD r7, boolean z) {
        AnonymousClass3ZH A09;
        C27991fJ r1;
        if (groupJid == null || (A09 = r4.A09(groupJid)) == null || (r1 = (C27991fJ) AnonymousClass3ZH.A04(A09)) == null || A09.A0J() == null || (!z && r7.A08(r1, Boolean.valueOf(r5.A0b.A0G(r1))))) {
            return null;
        }
        return A09;
    }

    public static String A02(Context context, C64773Ex r9, AnonymousClass5ZU r10, C620733j r11, C95814uZ r12, UserJid userJid, long j, boolean z) {
        String A0P;
        int i;
        Object[] A1X;
        if (userJid == null) {
            A0P = context.getString(R.string.f11nameremoved);
        } else {
            A0P = r10.A0P(r9.A0A(userJid), r10.A0A(r12));
        }
        String A04 = C107505bQ.A04(r11, j);
        String A00 = C107145am.A00(r11, j);
        if (z) {
            i = R.string.f11nameremoved;
            A1X = new Object[]{A04, A00};
        } else {
            i = R.string.f11nameremoved;
            A1X = AnonymousClass0x9.A1X();
            A1X[0] = A0P;
            A1X[1] = A04;
            A1X[2] = A00;
        }
        return context.getString(i, A1X);
    }

    public static boolean A06(C56972sr r6, C66663Mh r7, AnonymousClass5TW r8, C64773Ex r9, C56892sj r10, AnonymousClass3ZH r11, AnonymousClass1VX r12, GroupJid groupJid, C56072rN r14, boolean z) {
        if (groupJid != null && !r8.A01() && !r14.A04(r11, groupJid)) {
            C129526aS A02 = C56892sj.A01(r10, groupJid).A02();
            if (A02.size() != 1 || !A02.contains(C56972sr.A04(r6))) {
                if (!z) {
                    if (A02.size() > Math.min(64, r7.A03(C66663Mh.A1d))) {
                        C172878Nf it = A02.iterator();
                        while (it.hasNext()) {
                            if (r9.A0l(C18310x6.A0T(it))) {
                            }
                        }
                    }
                    return true;
                } else if (C627436k.A0B(r6, r12, A02.size()) || !r8.A01()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean A07(C66663Mh r3, C56982ss r4, C56892sj r5, AnonymousClass3ZH r6, GroupJid groupJid) {
        if (groupJid == null || r6.A0j || r4.A06(groupJid) == 3 || !r5.A0C(groupJid) || C56892sj.A00(r5, groupJid) > Math.min(64, r3.A03(C66663Mh.A1d))) {
            return false;
        }
        return true;
    }

    public static boolean A08(C56422rx r1, CallInfo callInfo) {
        if (callInfo == null || callInfo.isGroupCall) {
            return false;
        }
        return r1.A03(callInfo.getPeerJid());
    }

    public static List A03(C56972sr r3, C64773Ex r4, C56892sj r5, AnonymousClass3ZH r6) {
        GroupJid groupJid = (GroupJid) AnonymousClass3ZH.A04(r6);
        ArrayList A0s = AnonymousClass001.A0s();
        if (groupJid != null) {
            ArrayList A0J = AnonymousClass002.A0J(C56892sj.A01(r5, groupJid).A02());
            A0J.remove(C56972sr.A04(r3));
            Iterator it = A0J.iterator();
            while (it.hasNext()) {
                A0s.add(r4.A0A(C18300x5.A0P(it)));
            }
        } else {
            A0s.add(r6);
        }
        return A0s;
    }

    public static void A04(Context context, C69263Wi r8, C1230066r r9, AnonymousClass3LB r10, C56612sH r11, C56762sW r12, C56322rn r13, C55422qK r14, GroupJid groupJid, int i, long j) {
        C50392i6 A00;
        AnonymousClass3ZF r6;
        C18260x0.A1R(AnonymousClass001.A0o(), "scheduled-call/joinScheduledCall groupJid=", groupJid);
        C53312mt A03 = r13.A03(groupJid);
        if (A03 != null) {
            r6 = r12.A01(A03.A00);
            A00 = null;
        } else {
            A00 = r14.A00(j);
            r6 = null;
        }
        r8.A0S(new C71633cQ(context, r9, r10, r11, A00, r6, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        if ("video".equals(r7) != false) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(android.net.Uri r8, X.C89654ea r9, X.C69263Wi r10, X.C1230066r r11, int r12) {
        /*
            java.lang.String r1 = r8.getScheme()
            java.lang.String r0 = "whatsapp"
            boolean r0 = r0.equals(r1)
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = "call"
            boolean r0 = X.AnonymousClass0x9.A1O(r8, r0)
            if (r0 != 0) goto L_0x0037
        L_0x0017:
            java.lang.String r1 = "http"
            java.lang.String r0 = r8.getScheme()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x002f
            java.lang.String r1 = "https"
            java.lang.String r0 = r8.getScheme()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0080
        L_0x002f:
            java.lang.String r0 = "call.whatsapp.com"
            boolean r0 = X.AnonymousClass0x9.A1O(r8, r0)
            if (r0 == 0) goto L_0x0080
        L_0x0037:
            java.util.List r8 = r8.getPathSegments()
            int r0 = r8.size()
            r4 = 0
            if (r0 <= 0) goto L_0x0083
            java.lang.Object r7 = r8.get(r5)
        L_0x0046:
            int r0 = r8.size()
            if (r0 <= r6) goto L_0x0050
            java.lang.String r4 = X.AnonymousClass001.A0n(r8, r6)
        L_0x0050:
            java.lang.String r0 = "voice"
            boolean r0 = r0.equals(r7)
            java.lang.String r3 = "video"
            if (r0 != 0) goto L_0x0063
            boolean r0 = r3.equals(r7)
            r2 = 0
            if (r0 == 0) goto L_0x0064
        L_0x0063:
            r2 = 1
        L_0x0064:
            if (r4 == 0) goto L_0x0081
            int r1 = r4.length()
            r0 = 22
            if (r1 != r0) goto L_0x0081
        L_0x006e:
            int r1 = r8.size()
            r0 = 2
            if (r1 != r0) goto L_0x0085
            if (r2 == 0) goto L_0x0085
            if (r6 == 0) goto L_0x0085
            boolean r0 = r3.equals(r7)
            r11.BhT(r9, r4, r12, r0)
        L_0x0080:
            return
        L_0x0081:
            r6 = 0
            goto L_0x006e
        L_0x0083:
            r7 = r4
            goto L_0x0046
        L_0x0085:
            r0 = 2131890251(0x7f12104b, float:1.9415189E38)
            r10.A0H(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36T.A05(android.net.Uri, X.4ea, X.3Wi, X.66r, int):void");
    }
}
