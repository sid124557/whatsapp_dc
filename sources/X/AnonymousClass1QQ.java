package X;

import android.app.Activity;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1QQ  reason: invalid class name */
public class AnonymousClass1QQ extends AnonymousClass1QA {
    public final C59502x1 A00;
    public final C105035Th A01;
    public final C620433g A02;
    public final AnonymousClass5X1 A03;
    public final C620733j A04;
    public final C66543Lv A05;
    public final AnonymousClass1VX A06;
    public final C161447pg A07;
    public final C55832qz A08;
    public final C60092xz A09;

    public void A0D(Activity activity, AnonymousClass398 r13, String str, String str2, long j) {
        UserJid userJid;
        Activity activity2 = activity;
        Activity A002 = C621633u.A00(activity);
        if (A002 != null) {
            userJid = AnonymousClass3ZH.A07(((AnonymousClass4FC) A002).getContact());
        } else {
            userJid = null;
        }
        this.A02.A06(new C64433Dl(activity2, A002, this, r13, str, str2, j), userJid);
    }

    public void A0F(Activity activity, C95814uZ r12, String str, String str2, HashMap hashMap, long j) {
        AnonymousClass39W A0Y;
        AnonymousClass39P r0;
        ((AnonymousClass67A) activity).BlU(r12, str2, "address_message", C18280x3.A0d(hashMap), (String) null, j);
        C624134x A052 = this.A08.A05(AnonymousClass2z0.A03(r12, str));
        if (A052 != null && (A0Y = AnonymousClass0x9.A0Y(A052)) != null && A0Y.A00 == 5 && (r0 = A0Y.A03) != null) {
            Iterator it = r0.A03.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnonymousClass395 r1 = (AnonymousClass395) it.next();
                if (r1.A01.A00.equals("address_message")) {
                    r1.A00 = true;
                    break;
                }
            }
            this.A05.A0Y(A052);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f3, code lost:
        if (r1 == null) goto L_0x00f5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(android.app.Activity r13, android.app.Activity r14, X.C108985dt r15, X.AnonymousClass1QQ r16, X.AnonymousClass398 r17, java.lang.String r18, java.lang.String r19, long r20) {
        /*
            r12 = r16
            r7 = r14
            X.5Th r0 = r12.A01
            java.lang.String r1 = r0.A00(r15)
            java.lang.String r0 = "UNBLOCKED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c5
            X.1VX r2 = r12.A06
            r1 = 3572(0xdf4, float:5.005E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r2 = r2.A0Y(r0, r1)
            r14 = r17
            r15 = r18
            r16 = r19
            r0 = r20
            if (r2 == 0) goto L_0x0043
            java.lang.String r2 = r14.A01
            java.util.Map r5 = X.AnonymousClass31O.A01(r2)
            java.util.HashMap r4 = X.AnonymousClass001.A0t()
            java.lang.String r3 = "action"
            java.lang.String r2 = "start"
            r4.put(r3, r2)
            java.util.Map r18 = r12.A0E(r13, r14, r5)
            r19 = r0
            r17 = r4
            r12.A0G(r13, r14, r15, r16, r17, r18, r19)
        L_0x0042:
            return
        L_0x0043:
            r17 = r0
            super.A0D(r13, r14, r15, r16, r17)
            X.2xz r3 = r12.A09
            java.lang.String r6 = "address_message"
            r2 = 0
            X.C162457s7.A0J(r6, r2)
            X.66R r2 = r3.A01
            java.lang.Object r4 = X.C18280x3.A0V(r6, r2)
            X.9PF r4 = (X.AnonymousClass9PF) r4
            if (r4 == 0) goto L_0x00c2
            boolean r2 = r4.A03
            if (r2 == 0) goto L_0x0042
            java.lang.String r9 = r4.A01
        L_0x0060:
            if (r7 == 0) goto L_0x0042
            r8 = 0
            X.33j r12 = r12.A04
            r5 = r9
            if (r4 == 0) goto L_0x00a7
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = r4.A01
            r3.append(r2)
            java.lang.String r2 = r4.A02
            java.lang.String r5 = X.AnonymousClass000.A0X(r2, r3)
            long r3 = r4.A00
            r10 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r10
            r10 = 0
            int r2 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x00aa
            r10 = 0
        L_0x0083:
            android.content.Intent r4 = X.C627736r.A0L(r7, r10, r9, r8)
            X.4FC r7 = (X.AnonymousClass4FC) r7
            java.lang.String r3 = X.C627336j.A06(r7)
            java.lang.String r2 = "chat_id"
            r4.putExtra(r2, r3)
            java.lang.String r2 = "message_id"
            r4.putExtra(r2, r15)
            java.lang.String r2 = "action_name"
            r4.putExtra(r2, r6)
            java.lang.String r2 = "message_row_id"
            r4.putExtra(r2, r0)
            r13.startActivity(r4)
            return
        L_0x00a7:
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
        L_0x00aa:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0l(r5)
            java.lang.String r2 = ":"
            r5.append(r2)
            java.lang.String r2 = r12.A08()
            java.lang.String r5 = X.AnonymousClass000.A0X(r2, r5)
            r2 = 1
            X.39C r10 = new X.39C
            r10.<init>(r3, r5, r2)
            goto L_0x0083
        L_0x00c2:
            java.lang.String r9 = "com.bloks.www.whatsapp.commerce.address_message"
            goto L_0x0060
        L_0x00c5:
            X.5X1 r6 = r12.A03
            r0 = 1
            X.C162457s7.A0J(r13, r0)
            r5 = 2131886647(0x7f120237, float:1.9407879E38)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r3 = 0
            if (r15 == 0) goto L_0x00f5
            com.whatsapp.jid.UserJid r2 = r15.A08
            if (r2 == 0) goto L_0x00f5
            X.2rx r0 = r6.A01
            X.2qS r0 = r0.A00(r2)
            if (r0 == 0) goto L_0x010f
            java.lang.String r1 = r0.A08
        L_0x00e1:
            boolean r0 = X.C107575bX.A0F(r1)
            if (r0 == 0) goto L_0x00f3
            X.3Ex r0 = r6.A00
            X.3ZH r1 = r0.A0A(r2)
            X.5ZU r0 = r6.A02
            java.lang.String r1 = r0.A0H(r1)
        L_0x00f3:
            if (r1 != 0) goto L_0x00f7
        L_0x00f5:
            java.lang.String r1 = ""
        L_0x00f7:
            java.lang.String r0 = X.C18300x5.A0e(r13, r1, r4, r3, r5)
            X.0zH r3 = X.C19340zH.A00(r13, r0)
            r2 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r1 = 5
            X.4I1 r0 = new X.4I1
            r0.<init>(r1)
            r3.A0Y(r0, r2)
            X.C18280x3.A0q(r3)
            return
        L_0x010f:
            r1 = 0
            goto L_0x00e1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QQ.A00(android.app.Activity, android.app.Activity, X.5dt, X.1QQ, X.398, java.lang.String, java.lang.String, long):void");
    }

    public void A0G(Activity activity, AnonymousClass398 r21, String str, String str2, HashMap hashMap, Map map, long j) {
        HashMap hashMap2 = hashMap;
        Map map2 = map;
        this.A07.A07((AnonymousClass4B3) null, new AnonymousClass3SN(activity, this, r21, str, str2, hashMap2, C18320x8.A0s("supported_actions", map2), j), new C52622lm("address_message", (String) null, hashMap2), "", (String) null, map2);
    }

    public AnonymousClass1QQ(AnonymousClass2VM r2, C59502x1 r3, C105035Th r4, C620433g r5, AnonymousClass5X1 r6, C194449Sx r7, C620733j r8, C66543Lv r9, AnonymousClass1VX r10, C55832qz r11, C60092xz r12) {
        super(r7);
        this.A04 = r8;
        this.A06 = r10;
        this.A05 = r9;
        this.A08 = r11;
        this.A07 = r2.A00((C51052jC) null);
        this.A00 = r3;
        this.A09 = r12;
        this.A01 = r4;
        this.A02 = r5;
        this.A03 = r6;
    }

    public final Map A0E(Activity activity, AnonymousClass398 r5, Map map) {
        Map A0C = A0C(activity, r5);
        A0C.put("country", map.get("country"));
        boolean containsKey = map.containsKey("saved_addresses");
        if (containsKey) {
            containsKey = !C18320x8.A0s("saved_addresses", map).isEmpty();
        }
        A0C.put("has_saved_addresses", Boolean.valueOf(containsKey));
        A0C.put("has_validation_errors", Boolean.valueOf(map.containsKey("validation_errors")));
        return A0C;
    }
}
