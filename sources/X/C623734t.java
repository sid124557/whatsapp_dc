package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.34t  reason: invalid class name and case insensitive filesystem */
public class C623734t {
    public C68403Ta A00;
    public C41402Kc A01;
    public Long A02;
    public final C116985rC A03;
    public final C55682qk A04;
    public final C65203Gp A05;
    public final C56422rx A06;
    public final C55052pi A07;
    public final C53592nL A08;
    public final C50552iM A09;
    public final C56882si A0A;
    public final C44822Xp A0B;
    public final C619732z A0C;
    public final AnonymousClass4E5 A0D = new AnonymousClass3F3(this);
    public final AnonymousClass314 A0E;
    public final C56612sH A0F;
    public final C56662sM A0G;
    public final AnonymousClass33Z A0H;
    public final AnonymousClass318 A0I;
    public final AnonymousClass1VX A0J;
    public final AnonymousClass31C A0K;
    public final C1907099n A0L;
    public final AnonymousClass9U4 A0M;
    public final C56452s0 A0N;
    public final C183538qC A0O;
    public final Map A0P = AnonymousClass001.A0t();
    public final Map A0Q = AnonymousClass001.A0t();
    public final Map A0R = AnonymousClass001.A0t();
    public final Map A0S = AnonymousClass001.A0t();
    public final Map A0T = AnonymousClass001.A0t();

    public final synchronized C68403Ta A02() {
        C68403Ta r0;
        r0 = this.A00;
        if (r0 == null) {
            AnonymousClass1VX r4 = this.A0J;
            C55682qk r1 = this.A04;
            AnonymousClass31C r5 = this.A0K;
            r0 = new C68403Ta(r1, this.A0D, this.A0G, r4, r5);
            this.A00 = r0;
        }
        return r0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x000e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(X.AnonymousClass3ZH r3, java.util.Set r4, boolean r5) {
        /*
            X.4uZ r1 = r3.A0H
            boolean r0 = X.C627336j.A0L(r1)
            if (r0 == 0) goto L_0x0010
            boolean r0 = r4.contains(r1)
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r2 = 1
        L_0x000f:
            return r2
        L_0x0010:
            X.4uZ r0 = r3.A0H
            boolean r0 = X.C627336j.A0L(r0)
            r2 = 0
            if (r0 != 0) goto L_0x000f
            boolean r0 = r3.A0t
            if (r0 == 0) goto L_0x0023
            int r1 = r3.A07
            r0 = 2
            if (r1 != r0) goto L_0x0023
            return r2
        L_0x0023:
            X.2k5 r0 = r3.A0F
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x000e
            X.4uZ r0 = r3.A0H
            if (r0 != 0) goto L_0x0036
            if (r5 != 0) goto L_0x000f
            goto L_0x000e
        L_0x0036:
            boolean r0 = X.C621733w.A02(r0)
            if (r0 == 0) goto L_0x000f
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C623734t.A01(X.3ZH, java.util.Set, boolean):boolean");
    }

    public final boolean A04(AnonymousClass3ZH r4, Set set) {
        boolean A0Y = this.A0J.A0Y(C58422vE.A02, 723);
        boolean A0R2 = r4.A0R();
        if (!A0Y ? !A0R2 : !(A0R2 && !C627336j.A0L(r4.A0H))) {
            if (set.contains(AnonymousClass3ZH.A03(r4))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean A05(C25931bJ r7, String str, Future future) {
        try {
            future.get(64000, TimeUnit.MILLISECONDS);
            if (this.A01 != null) {
                return true;
            }
            C18260x0.A1L(AnonymousClass000.A0l(str), "/no result");
            Long l = this.A02;
            if (l != null) {
                r7.A09 = l;
                return false;
            }
            return false;
        } catch (RuntimeException e) {
            C18260x0.A0u(str, "/exception", AnonymousClass001.A0o(), e);
            C55682qk.A05(this.A04, str, e);
            return false;
        } catch (ExecutionException e2) {
            C18260x0.A0u(str, "/exception", AnonymousClass001.A0o(), e2);
            if ((e2.getCause() instanceof RuntimeException) || ((e2.getCause() instanceof Error) && !(e2.getCause() instanceof AssertionError) && !(e2.getCause() instanceof OutOfMemoryError))) {
                C55682qk.A05(this.A04, str, e2);
            }
        } catch (InterruptedException | TimeoutException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r6.isEmpty() == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A06(java.util.List r6, java.util.List r7, java.util.List r8) {
        /*
            r5 = this;
            X.3Gp r4 = r5.A05
            r4.A0L(r6, r7)
            boolean r0 = r7.isEmpty()
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0014
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            r1 = 1
        L_0x0015:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x001f
            r4.A0M(r8, r3)
            return r2
        L_0x001f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C623734t.A06(java.util.List, java.util.List, java.util.List):boolean");
    }

    public C623734t(C116985rC r2, C55682qk r3, C65203Gp r4, C56422rx r5, C55052pi r6, C53592nL r7, C50552iM r8, C56882si r9, C44822Xp r10, C619732z r11, AnonymousClass314 r12, C56612sH r13, C56662sM r14, AnonymousClass33Z r15, AnonymousClass318 r16, AnonymousClass1VX r17, AnonymousClass31C r18, C1907099n r19, AnonymousClass9U4 r20, C56452s0 r21, C183538qC r22) {
        this.A0F = r13;
        this.A0J = r17;
        this.A04 = r3;
        this.A05 = r4;
        this.A0K = r18;
        this.A0B = r10;
        this.A0M = r20;
        this.A0G = r14;
        this.A0C = r11;
        this.A0I = r16;
        this.A03 = r2;
        this.A07 = r6;
        this.A0N = r21;
        this.A06 = r5;
        this.A0E = r12;
        this.A0H = r15;
        this.A0L = r19;
        this.A09 = r8;
        this.A0A = r9;
        this.A08 = r7;
        this.A0O = r22;
    }

    public static final AnonymousClass304 A00(C15630rg r3, String str) {
        AnonymousClass304 r0;
        AnonymousClass33M A012 = AnonymousClass33M.A01(str);
        try {
            r0 = (AnonymousClass304) r3.apply(str);
        } catch (RuntimeException e) {
            Log.e("ContactSyncHelper/runAndHandleExceptions", e);
            r0 = AnonymousClass304.A02;
        } catch (Throwable th) {
            A012.A07();
            throw th;
        }
        A012.A07();
        return r0;
    }

    public final void A03(Collection collection, List list, Map map) {
        C51602k5 r0;
        StringBuilder A0o;
        String str;
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            AnonymousClass3ZH A0R2 = C18310x6.A0R(it);
            boolean z2 = true;
            if (A0R2 == null || (r0 = A0R2.A0F) == null) {
                z = true;
            } else {
                C626936e.A06(r0);
                String str2 = r0.A01;
                AnonymousClass2UJ r1 = (AnonymousClass2UJ) map.get(str2);
                if (r1 == null) {
                    A0o = AnonymousClass001.A0o();
                    str = "sync/phone-number/missing_response/";
                } else {
                    int i = r1.A04;
                    if (i == 0) {
                        A0o = AnonymousClass001.A0o();
                        str = "sync/phone-number/unassigned/";
                    } else {
                        if (i != 1) {
                            z2 = false;
                        }
                        UserJid userJid = r1.A0D;
                        C95814uZ r12 = (C95814uZ) AnonymousClass3ZH.A03(A0R2);
                        if (A0R2.A10 != z2 || !AnonymousClass75J.A00(A0R2.A0H, userJid)) {
                            A0R2.A10 = z2;
                            A0R2.A0H = userJid;
                            if (collection != null) {
                                collection.add(A0R2);
                            }
                            if (!A0R2.A10 && r12 != null) {
                                this.A07.A02(r12);
                            }
                        }
                    }
                }
                A0o.append(str);
                C18260x0.A1M(A0o, C107575bX.A0B(str2, 4));
            }
        }
        if (z) {
            this.A04.A0A("sync/updateContactsFromSyncUsers/found-invalid-contacts", false, (String) null);
        }
    }
}
