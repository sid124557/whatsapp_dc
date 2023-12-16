package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3bF  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70903bF implements Runnable {
    public final /* synthetic */ C95814uZ A00;
    public final /* synthetic */ AnonymousClass3XV A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public final void run() {
        UserJid userJid;
        Integer num;
        C55012pe r0;
        String str;
        String str2;
        AnonymousClass4DV r02;
        AnonymousClass39W B5s;
        AnonymousClass39P r03;
        AnonymousClass3XV r6 = this.A01;
        String str3 = this.A02;
        String str4 = this.A03;
        C95814uZ r8 = this.A00;
        String str5 = this.A04;
        String str6 = this.A05;
        boolean z = this.A06;
        String valueOf = String.valueOf(str4);
        AnonymousClass2z0 A032 = AnonymousClass2z0.A03(r8, valueOf);
        C66543Lv r3 = r6.A05;
        C624134x A002 = C55832qz.A00(r3, A032);
        JSONObject A1G = AnonymousClass0x9.A1G();
        try {
            A1G.put("cta", str6);
            A1G.put("flow_id", str5);
            A1G.put("extensions_message_id", C57142tA.A00(valueOf));
            A1G.put("session_id", C57142tA.A00(str3));
        } catch (JSONException e) {
            C18260x0.A17("SendExtensionsResponseMessage/sendWamEvent/", AnonymousClass001.A0o(), e);
        }
        Object obj = null;
        if (r8 instanceof UserJid) {
            userJid = (UserJid) r8;
            if (userJid != null) {
                num = Integer.valueOf(AnonymousClass30C.A00(r6.A03.A01(userJid)));
                r0 = r6.A04.A01.A01(userJid);
            }
            num = null;
            r0 = null;
        } else {
            userJid = null;
            num = null;
            r0 = null;
        }
        C50312hy r7 = r6.A06;
        String A0o = C18290x4.A0o(A1G);
        if (r0 != null) {
            str = r0.A06;
            str2 = r0.A05;
        } else {
            str = null;
            str2 = null;
        }
        r7.A01(userJid, A002, num, A0o, str, str2, valueOf, 2);
        if ((A002 instanceof AnonymousClass4DV) && (r02 = (AnonymousClass4DV) A002) != null && (B5s = r02.B5s()) != null && B5s.A00 == 5 && (r03 = B5s.A03) != null) {
            List list = r03.A03;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (AnonymousClass395.A00(next, str6)) {
                        obj = next;
                        break;
                    }
                }
                AnonymousClass395 r2 = (AnonymousClass395) obj;
                if (r2 != null) {
                    r2.A00 = z;
                }
            }
            r3.A0Y(A002);
        }
    }

    public /* synthetic */ C70903bF(C95814uZ r1, AnonymousClass3XV r2, String str, String str2, String str3, String str4, boolean z) {
        this.A01 = r2;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = r1;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = z;
    }
}
