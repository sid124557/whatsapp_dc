package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.4Gx  reason: invalid class name and case insensitive filesystem */
public class C85604Gx extends BroadcastReceiver {
    public Object A00;
    public final int A01;

    public C85604Gx(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onReceive(Context context, Intent intent) {
        StringBuilder sb;
        String str;
        Locale locale;
        String str2;
        switch (this.A01) {
            case 0:
                ((AnonymousClass338) this.A00).A06.BkM(new C117165rU(this, 20, context));
                return;
            case 1:
                C53762nc r1 = (C53762nc) this.A00;
                if (r1.A02()) {
                    Log.i("reload commerce translation metadata since locale changed");
                    r1.A01();
                    return;
                }
                return;
            case 2:
                Log.d(" vname: purging cached contacts not matching current locale");
                C64773Ex r12 = (C64773Ex) this.A00;
                Locale A02 = C620733j.A02(r12.A0C);
                Map map = r12.A04.A01;
                synchronized (map) {
                    Iterator A0q = AnonymousClass000.A0q(map);
                    HashSet hashSet = null;
                    while (A0q.hasNext()) {
                        Map.Entry A0w = AnonymousClass001.A0w(A0q);
                        C95814uZ A0N = C18320x8.A0N(A0w);
                        AnonymousClass3ZH r0 = (AnonymousClass3ZH) A0w.getValue();
                        if (!(A0N == null || r0 == null || (locale = r0.A0c) == null || A02.equals(locale))) {
                            if (hashSet == null) {
                                hashSet = AnonymousClass002.A0K();
                            }
                            hashSet.add(A0N);
                        }
                    }
                    if (hashSet != null) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            map.remove(C18300x5.A0P(it));
                        }
                        StringBuilder A0o = AnonymousClass001.A0o();
                        C18260x0.A19("vname: purged ", A0o, hashSet);
                        C18260x0.A1J(A0o, " contact cache entries");
                    }
                }
                return;
            case 3:
                Log.d("AppAsyncInit/BroadcastReceiver/android.intent.action.LOCALE_CHANGED/received");
                C107505bQ.A00 = null;
                C107505bQ.A01 = null;
                C107505bQ.A02 = null;
                C47582dU r5 = (C47582dU) this.A00;
                AnonymousClass33X r4 = r5.A0C;
                C622234e A022 = r4.A05.A02();
                if (A022 != null) {
                    int i = A022.A01;
                    C18260x0.A0y("UserNoticeManager/handleLocaleChange/notice id:", AnonymousClass001.A0o(), i);
                    C623034m r13 = r4.A04;
                    r13.A04(i);
                    if (r4.A06.A02() && !AnonymousClass31f.A01(r4.A03, A022)) {
                        r13.A05(i);
                    }
                }
                AnonymousClass5ZU r14 = r5.A07;
                r14.A0C.clear();
                r14.A0D.clear();
                return;
            case 4:
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    sb = AnonymousClass001.A0o();
                    str = "unknown intent received in connectivity receiver ";
                    break;
                } else {
                    ((C67773Qp) this.A00).A00(false);
                    return;
                }
            default:
                String action = intent.getAction();
                C18260x0.A0s("xmpp/handler/logout-timer/timeout", action, AnonymousClass001.A0o());
                if (!"com.whatsapp.MessageHandler.LOGOUT_ACTION".equals(action)) {
                    sb = AnonymousClass001.A0o();
                    str = "unknown intent received in logout receiver ";
                    break;
                } else {
                    C61032zb r42 = (C61032zb) this.A00;
                    C626936e.A06(r42.A00);
                    if (!r42.A0B.A02()) {
                        C61032zb.A01(r42, action);
                        C66523Lt r15 = r42.A00;
                        Log.d("MessageHandler/onNoLogoutDueToLongConnect");
                        r15.A07();
                        return;
                    }
                    if (r42.A00.A0L.A01()) {
                        str2 = "voip call in prgress; reset logout timer";
                    } else if (r42.A03.A00) {
                        str2 = "app in foreground; reset logout timer";
                    } else {
                        C626936e.A06(r42.A00);
                        AnonymousClass4EW r2 = r42.A00.A08;
                        if (r2 != null) {
                            r2.BlM(false, 7);
                        } else {
                            Log.i("MessageHandler/onDoLogout ignoring due to null sending channel");
                        }
                        C67823Qu r16 = r42.A0C;
                        if (!r16.A08 && r16.A09("xmpp-bg-to-logout")) {
                            r16.A08 = true;
                        }
                        Handler handler = r42.A02;
                        handler.sendMessage(handler.obtainMessage(3, "com.whatsapp.MessageHandler.LOGOUT_ACTION"));
                        return;
                    }
                    Log.d(str2);
                    Log.i("xmpp/handler/logout-timer/reset");
                    if (r42.A03(action)) {
                        r42.A02(action);
                    }
                    C56732sT r22 = r42.A0A;
                    Log.i("ClientPingManager/on-demand-ping");
                    C70013Zn.A00(r22.A07, r22, 25);
                    return;
                }
        }
        C18260x0.A1S(sb, str, intent);
    }
}
