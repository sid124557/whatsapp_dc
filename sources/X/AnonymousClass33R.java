package X;

import android.os.Build;
import com.whatsapp.bonsai.sync.discovery.DiscoveryBots;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.33R  reason: invalid class name */
public final class AnonymousClass33R {
    public final AnonymousClass08M A00 = C18330xA.A01((Object) null);
    public final C47082cg A01;
    public final C44672Xa A02;
    public final C64773Ex A03;
    public final C56612sH A04;
    public final AnonymousClass1VX A05;
    public final AnonymousClass4FS A06;
    public final C183538qC A07;
    public volatile AnonymousClass3ZH A08;

    public final void A04(C15910sA r8, AnonymousClass4GQ r9, boolean z) {
        AnonymousClass3ZH r0 = this.A08;
        AnonymousClass4GQ r4 = r9;
        if (r0 != null) {
            r9.invoke(r0);
        } else {
            this.A06.BkP(new C71643cR(this, r8, r4, 3, z));
        }
    }

    public final boolean A05(DiscoveryBots discoveryBots) {
        String str;
        if (discoveryBots == null) {
            str = "bonsaiprewarmer/not ready/no bots";
        } else {
            boolean z = false;
            long j = discoveryBots.A00;
            long A042 = C56952sp.A04(this.A05, 4417) + j;
            long A0H = this.A04.A0H();
            if (A0H <= A042) {
                z = true;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("bonsaiprewarmer/lastbots upToDate=");
            A0o.append(z);
            A0o.append("; now=");
            A0o.append(A00(A0H));
            A0o.append("; last=");
            A0o.append(A00(j));
            A0o.append("; expire=");
            C18260x0.A1J(A0o, A00(A042));
            if (!z) {
                str = "bonsaiprewarmer/not ready/bots outdated";
            } else {
                Collection<C52822m6> A002 = AnonymousClass25B.A00(discoveryBots);
                LinkedHashSet A17 = AnonymousClass0x9.A17();
                for (C52822m6 r0 : A002) {
                    A17.add(r0.A01);
                }
                if (!A06(A17)) {
                    str = "bonsaiprewarmer/not ready/individual bots not prewarmed";
                } else {
                    List<AnonymousClass2l5> list = discoveryBots.A02;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        for (AnonymousClass2l5 r02 : list) {
                            if (!r02.A02.isEmpty()) {
                                Log.d("bonsaiprewarmer/ready");
                                return true;
                            }
                        }
                    }
                    str = "bonsaiprewarmer/not ready, all sections are empty";
                }
            }
        }
        Log.d(str);
        return false;
    }

    public static final String A00(long j) {
        if (AnonymousClass000.A1U(Build.VERSION.SDK_INT, 27) || j <= 0) {
            return "0";
        }
        return C18290x4.A0o(new Date(j));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.whatsapp.bonsai.sync.discovery.DiscoveryBots A01(boolean r6) {
        /*
            r5 = this;
            java.lang.String r0 = "bonsaiprewarmer/updateAndGet"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.08M r3 = r5.A00
            java.lang.Object r4 = r3.A07()
            com.whatsapp.bonsai.sync.discovery.DiscoveryBots r4 = (com.whatsapp.bonsai.sync.discovery.DiscoveryBots) r4
            if (r4 == 0) goto L_0x0019
            boolean r0 = r5.A05(r4)
            if (r0 == 0) goto L_0x0019
        L_0x0015:
            r3.A0G(r4)
            return r4
        L_0x0019:
            X.2Xa r0 = r5.A02
            com.whatsapp.bonsai.sync.discovery.DiscoveryBots r4 = r0.A00()
            java.lang.String r0 = "bonsaiprewarmer/default bot load"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r2 = 0
            if (r4 == 0) goto L_0x004e
            X.2m6 r0 = r4.A01
            com.whatsapp.jid.UserJid r1 = r0.A01
            java.util.List r0 = X.C18290x4.A12(r1)
            boolean r0 = r5.A06(r0)
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = "bonsaiprewarmer/default bot loaded, invoke ready"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.3Ex r0 = r5.A03
            X.3ZH r0 = r0.A0A(r1)
            r5.A08 = r0
        L_0x0042:
            boolean r0 = r5.A05(r4)
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = "bonsaiprewarmer/ready and prewarmed"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            goto L_0x0015
        L_0x004e:
            java.lang.String r0 = "bonsaiprewarmer/default bot not loaded"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            goto L_0x0042
        L_0x0054:
            if (r6 == 0) goto L_0x005e
            java.lang.String r0 = "bonsaiprewarmer/post null"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r3.A0G(r2)
        L_0x005e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass33R.A01(boolean):com.whatsapp.bonsai.sync.discovery.DiscoveryBots");
    }

    public final AnonymousClass3ZH A02(boolean z) {
        Log.d("bonsaiprewarmer/getDefaultBotForInvoke");
        if (z) {
            A03();
        } else if (this.A08 == null) {
            A01(false);
        }
        return this.A08;
    }

    public final void A03() {
        Log.d("bonsaiprewarmer/prewarmIfNeeded");
        if (A01(false) != null) {
            return;
        }
        if (this.A05.A0O(C58422vE.A02, 4417) < 0) {
            Log.d("bonsaiprewarmer/updateFromNetwork disabled");
            return;
        }
        Log.d("bonsaiprewarmer/call fetchBotProfileList");
        C40192Ew r6 = new C40192Ew(this.A01);
        Log.d("BotProfileSyncManager/fetchBotProfileList start fetch the bot list");
        C47082cg r2 = r6.A00;
        C41232Jl r5 = new C41232Jl(r2.A04, r2.A05);
        AnonymousClass3XA r4 = new AnonymousClass3XA();
        AnonymousClass2ZO r3 = new AnonymousClass2ZO(r4, r6, r2);
        AnonymousClass31C r62 = r5.A01;
        String A032 = r62.A03();
        C35641xC r22 = new C35641xC(new C35351wj(new C35351wj(A032, 8), 10));
        r62.A0D(new C35571x5(r22, new C41222Jk(r3, r5), 2), C41032Ir.A05(r22), A032, 395, 32000);
        r4.A04(new C86234Ji(this, 0), new C86044Ip(this.A06, 1));
    }

    public final boolean A06(Collection collection) {
        String A0P;
        File A002;
        Map A012 = ((C48902ff) this.A07.get()).A01(collection);
        if (A012.isEmpty()) {
            A0P = "bonsaiprewarmer/not ready/bots empty";
        } else {
            Set keySet = A012.keySet();
            C47082cg r8 = this.A01;
            for (Object next : keySet) {
                C95814uZ r7 = (C95814uZ) next;
                C162457s7.A0J(r7, 0);
                AnonymousClass3ZH A0A = r8.A01.A0A(r7);
                int i = A0A.A05;
                if (i >= 0 && (i == 0 || (A002 = r8.A02.A00(A0A)) == null || !A002.exists() || A002.length() == 0)) {
                    C18260x0.A1P(AnonymousClass001.A0o(), "BotProfileSyncManager/need profile photo for ", r7);
                    if (next == null) {
                        return true;
                    }
                    A0P = AnonymousClass000.A0P(next, "bonsaiprewarmer/not ready/bot data not ready: ", AnonymousClass001.A0o());
                }
            }
            return true;
        }
        Log.d(A0P);
        return false;
    }

    public AnonymousClass33R(C47082cg r2, C44672Xa r3, C64773Ex r4, C56612sH r5, AnonymousClass1VX r6, AnonymousClass4FS r7, C183538qC r8) {
        C18260x0.A0f(r5, r6, r7, r4, r3);
        C18260x0.A0U(r8, r2);
        this.A04 = r5;
        this.A05 = r6;
        this.A06 = r7;
        this.A03 = r4;
        this.A02 = r3;
        this.A07 = r8;
        this.A01 = r2;
    }
}
