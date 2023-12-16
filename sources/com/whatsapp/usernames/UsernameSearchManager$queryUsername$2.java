package com.whatsapp.usernames;

import X.AnonymousClass001;
import X.AnonymousClass0PJ;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass227;
import X.AnonymousClass2UJ;
import X.AnonymousClass36P;
import X.AnonymousClass3ZH;
import X.AnonymousClass4GR;
import X.C18260x0;
import X.C18290x4;
import X.C27981fH;
import X.C41402Kc;
import X.C43702Td;
import X.C45902al;
import X.C56952sp;
import X.C56972sr;
import X.C57682u2;
import X.C59022wD;
import X.C59512x2;
import X.C618832q;
import X.C621733w;
import X.C626936e;
import X.C64773Ex;
import X.C66413Li;
import X.C68403Ta;
import X.C75003pT;
import X.C84814Du;
import android.os.SystemClock;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usernames.UsernameSearchManager$queryUsername$2", f = "UsernameSearchManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UsernameSearchManager$queryUsername$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $usernameSearchString;
    public int label;
    public final /* synthetic */ C43702Td this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernameSearchManager$queryUsername$2(C43702Td r2, String str, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r2;
        this.$usernameSearchString = str;
    }

    public final Object A09(Object obj) {
        C66413Li r3;
        String A00;
        PhoneUserJid A02;
        Integer num;
        if (this.label == 0) {
            C57682u2.A01(obj);
            Log.d("UsernameSearchManager/queryUsername");
            r3 = this.this$0.A04;
            String str = this.$usernameSearchString;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            AnonymousClass3ZH r10 = null;
            if (!r3.A04.A0F()) {
                Log.i("ContactQuerySyncManager/querySyncUsername: network_unavailable");
            } else {
                A00 = C621733w.A00("sync_sid_query");
                try {
                    C68403Ta A03 = r3.A03();
                    AnonymousClass227 r9 = AnonymousClass227.A0D;
                    int A002 = r3.A03.A00();
                    boolean A0F = C56952sp.A0F(r3.A0B);
                    C626936e.A0C(true);
                    C618832q r0 = new C618832q(str);
                    r0.A0C = true;
                    r0.A0L = true;
                    r0.A0J = true;
                    r0.A0B = true;
                    r0.A0F = true;
                    r0.A0H = true;
                    r0.A0N = true;
                    r0.A0M = A0F;
                    A03.A04(new C59512x2(r9, Collections.singletonList(r0.A03()), A002, true), A00, 32000).get(32000, TimeUnit.MILLISECONDS);
                    ConcurrentHashMap concurrentHashMap = r3.A0F;
                    C41402Kc r6 = (C41402Kc) concurrentHashMap.get(A00);
                    if (r6 == null) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("ContactQuerySyncManager/querySyncUsername: empty sync result for ");
                        A0o.append(str);
                        A0o.append(" (syncId is ");
                        A0o.append(A00);
                        C18260x0.A1K(A0o, ")");
                    } else {
                        AnonymousClass2UJ[] r8 = r6.A01;
                        if (r8.length == 0) {
                            C45902al r02 = r6.A00.A02;
                            if (r02 == null || (num = r02.A00) == null || num.intValue() != 429) {
                                C18260x0.A0r("ContactQuerySyncManager/querySyncUsername: no users for ", str, AnonymousClass001.A0o());
                            } else {
                                C18260x0.A0r("ContactQuerySyncManager/querySyncUsername: rate-limit-error ", str, AnonymousClass001.A0o());
                            }
                        } else {
                            AnonymousClass2UJ r82 = r8[0];
                            if (r82.A04 == 1) {
                                r10 = C64773Ex.A00(r3.A05, r82.A0D);
                                if (!C56972sr.A08(r3.A02, r10)) {
                                    r3.A06.A00(r82, r6.A00, r10, elapsedRealtime);
                                }
                            }
                            List list = r82.A0K;
                            if (list != null && list.size() > 0) {
                                r82.A0K.get(0);
                            }
                            AnonymousClass0PJ A0G = AnonymousClass0x9.A0G(r82, r10);
                            concurrentHashMap.remove(A00);
                            AnonymousClass3ZH r32 = (AnonymousClass3ZH) A0G.A01;
                            if (r32 != null) {
                                String str2 = this.$usernameSearchString;
                                String str3 = ((AnonymousClass2UJ) A0G.A00).A0J;
                                if (str2 == null ? str2 == str3 : !(str3 == null || !str2.equalsIgnoreCase(str3))) {
                                    r32.A0P = AnonymousClass0x2.A0e(str3, AnonymousClass001.A0o(), '@');
                                    C43702Td r2 = this.this$0;
                                    C27981fH r1 = (C27981fH) r32.A0I(C27981fH.class);
                                    if (!(r1 == null || (A02 = r2.A05.A02(r1)) == null)) {
                                        r32 = r2.A03.A0A(A02);
                                        if (r32.A0F == null) {
                                            r32.A0P = AnonymousClass36P.A07(A02.user);
                                        }
                                    }
                                    this.this$0.A02.A0G(C18290x4.A12(r32));
                                }
                            }
                        }
                    }
                    concurrentHashMap.remove(A00);
                } catch (TimeoutException unused) {
                    Log.e("ContactQuerySyncManager/querySyncUsername/timeout");
                } catch (ExecutionException e) {
                    r3.A04("querySyncUsername", e);
                } catch (InterruptedException e2) {
                    C18260x0.A0u("ContactQuerySync/querySyncUsername: exception during Query Sync ", str, AnonymousClass001.A0o(), e2);
                } catch (Throwable th) {
                    r3.A0F.remove(A00);
                    throw th;
                }
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
        r3.A0F.remove(A00);
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new UsernameSearchManager$queryUsername$2(this.this$0, this.$usernameSearchString, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
