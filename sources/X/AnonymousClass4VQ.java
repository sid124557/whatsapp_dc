package X;

import android.content.Intent;
import android.database.Cursor;
import android.os.Handler;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4VQ  reason: invalid class name */
public class AnonymousClass4VQ extends C05550Ty {
    public int A00 = 0;
    public int A01;
    public int A02 = 0;
    public int A03 = 8;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public long A08 = -1;
    public long A09 = Long.MIN_VALUE;
    public long A0A = 1;
    public long A0B = Long.MIN_VALUE;
    public C42242Ni A0C = null;
    public C54702p9 A0D;
    public C624134x A0E;
    public C624134x A0F = null;
    public C624134x A0G;
    public C183538qC A0H;
    public String A0I;
    public String A0J;
    public ArrayList A0K;
    public Set A0L;
    public boolean A0M;
    public boolean A0N = false;
    public boolean A0O = true;
    public final long A0P;
    public final Intent A0Q;
    public final Handler A0R = AnonymousClass000.A0A();
    public final AnonymousClass08M A0S;
    public final AnonymousClass08M A0T;
    public final AnonymousClass08M A0U;
    public final AnonymousClass08M A0V = AnonymousClass08M.A01();
    public final AnonymousClass08M A0W = AnonymousClass0x9.A0b();
    public final AnonymousClass08M A0X = AnonymousClass0x9.A0b();
    public final AnonymousClass08M A0Y;
    public final AnonymousClass08M A0Z;
    public final AnonymousClass0XV A0a;
    public final C116985rC A0b;
    public final C56972sr A0c;
    public final C153167am A0d;
    public final AnonymousClass5G5 A0e;
    public final C40262Fd A0f;
    public final MessageSelectionViewModel A0g;
    public final C104235Qe A0h;
    public final C56612sH A0i;
    public final C620733j A0j;
    public final C44922Xz A0k;
    public final C56982ss A0l;
    public final C66543Lv A0m;
    public final C49482gb A0n;
    public final C55062pj A0o;
    public final AnonymousClass4FW A0p;
    public final C29431io A0q;
    public final C56382rt A0r;
    public final C56362rr A0s;
    public final AnonymousClass3ZH A0t;
    public final C55072pk A0u;
    public final C56112rR A0v;
    public final AnonymousClass1VX A0w;
    public final C95814uZ A0x;
    public final C56212rc A0y;
    public final C48192eV A0z;
    public final AnonymousClass35J A10;
    public final C55832qz A11;
    public final C989053r A12;
    public final AnonymousClass4UC A13 = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A14 = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A15 = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A16 = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A17 = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A18 = new AnonymousClass4UC(Collections.emptyList());
    public final AnonymousClass4UC A19 = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A1A = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A1B;
    public final AnonymousClass4UC A1C = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A1D = AnonymousClass0x9.A0b();
    public final AnonymousClass4FS A1E;
    public final AnonymousClass5RW A1F;
    public final AnonymousClass66v A1G;
    public final ArrayList A1H = AnonymousClass001.A0s();
    public final List A1I = AnonymousClass001.A0s();
    public final Map A1J = AnonymousClass001.A0t();
    public final Set A1K = AnonymousClass002.A0K();
    public final AnonymousClass4GQ A1L;
    public final boolean A1M;
    public final boolean A1N;

    public final int A0D() {
        int i;
        synchronized (this) {
            i = this.A02;
        }
        return i + this.A1I.size() + (AnonymousClass001.A1W(this.A07) ? 1 : 0);
    }

    public final void A0K() {
        this.A07 = 0;
        this.A05 = 0;
        this.A06 = 0;
        this.A09 = Long.MIN_VALUE;
    }

    public synchronized void A0Q(C42242Ni r4) {
        int i;
        this.A0C = r4;
        Cursor cursor = r4.A00;
        if (cursor == null || cursor.isClosed() || !cursor.moveToFirst()) {
            this.A0F = null;
            i = 0;
        } else {
            this.A0F = this.A11.A04(cursor, this.A0x);
            i = cursor.getCount();
        }
        this.A02 = i;
        A0L();
    }

    public static void A02(AnonymousClass4VQ r3) {
        r3.A1E.BkP(new C117625sE(r3, 17));
    }

    public void A0C() {
        this.A0q.A07(this.A0p);
        C58112uj r2 = C58112uj.A01;
        AnonymousClass4GQ r1 = this.A1L;
        C162457s7.A0J(r1, 0);
        synchronized (r2) {
            C58112uj.A02.remove(r1);
        }
    }

    public final int A0E() {
        int i = this.A07;
        int i2 = this.A00;
        int i3 = i2 - 10;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        if (i > i3) {
            A0o2.append("conversation/page size (from unseen):");
            C18260x0.A1G(A0o2, i + 10);
            return this.A07 + 10;
        }
        C18260x0.A0y("conversation/page size:", A0o2, i2);
        return this.A00;
    }

    public final C42242Ni A0F(int i, long j) {
        C66543Lv r2 = this.A0m;
        C95814uZ r3 = this.A0x;
        C42242Ni A0B2 = r2.A0B(r3, i, this.A0A, j, true);
        if (r3 instanceof C95804uY) {
            this.A0y.A04((C95804uY) r3, (C83994Ap) null, (Long) null, i);
        }
        A0B2.A00.getCount();
        return A0B2;
    }

    public C624134x A0G() {
        C624134x r0;
        List list = this.A1I;
        if (!list.isEmpty()) {
            return (C624134x) C18300x5.A0c(list);
        }
        synchronized (this) {
            r0 = this.A0F;
        }
        return r0;
    }

    public void A0H() {
        List list = this.A1I;
        list.clear();
        AnonymousClass4UC r2 = this.A14;
        AnonymousClass5OX r1 = new AnonymousClass5OX();
        r1.A00 = C129586aY.copyOf((Collection) list);
        r1.A06 = true;
        r2.A0H(r1.A00());
        A0L();
    }

    public final void A0J() {
        this.A1D.A0H(new C104165Px(this.A05, this.A06, this.A07));
    }

    public final void A0L() {
        AnonymousClass5YS.A00(this.A0U, A0G());
    }

    public void A0M(long j) {
        this.A0A = j;
        this.A0a.A06("start_ref", Long.valueOf(j));
    }

    public void A0N(long j) {
        this.A0B = j;
        this.A0a.A06("start_sort_ref", Long.valueOf(j));
    }

    public final void A0O(long j) {
        C95814uZ r2 = this.A0x;
        if (r2 instanceof C95804uY) {
            Set set = this.A0L;
            if (set == null) {
                set = AnonymousClass002.A0K();
                this.A0L = set;
            }
            Long valueOf = Long.valueOf(j);
            if (!set.contains(valueOf)) {
                this.A0L.add(valueOf);
                this.A1E.BkN(new C70083Zv(this, j, 9), AnonymousClass000.A0P(r2, "MessageViewModel/scheduleCheckForGapsInNewsletter/", AnonymousClass001.A0o()));
            }
        }
    }

    public void A0P(AnonymousClass5MU r21, C624134x r22, List list, int i, int i2, int i3, int i4, boolean z) {
        boolean z2;
        C42242Ni r9;
        C624134x r10 = r22;
        if (r10.A1M < this.A0B) {
            long j = this.A0P;
            C95814uZ r6 = this.A0x;
            long j2 = r10.A1L;
            C66543Lv r5 = this.A0m;
            C95814uZ r12 = r6;
            long j3 = j;
            z2 = true;
            r9 = r5.A0B(r12, 100, r5.A1P.A04(r12, 100, j2, j3), j3, true);
            r9.A00.getCount();
            A0M(r9.A01);
            A0N(r9.A02);
            A0Q(r9);
            A0H();
        } else {
            z2 = false;
            r9 = null;
        }
        AnonymousClass4UC r62 = this.A1A;
        int A032 = this.A0s.A03(this.A0x, this.A0B, r10.A1M);
        if (this.A07 > 0 && A032 >= i2) {
            A032++;
        }
        r62.A0H(new C104415Qw(r21, r9, r10, list, A032, i, i3, i4, this.A0P, z2, z));
    }

    public void A0R(C624134x r4) {
        if (!AnonymousClass75J.A00(this.A0E, r4)) {
            this.A0E = r4;
            AnonymousClass0XV r1 = this.A0a;
            if (r4 != null) {
                A00(r1, r4.A1J, "commentedParentMessage_");
            } else {
                A01(r1, "commentedParentMessage_");
            }
            this.A0S.A0H(r4);
        }
    }

    public void A0S(C624134x r5) {
        if (!AnonymousClass75J.A00(this.A0G, r5)) {
            this.A0G = r5;
            HashMap hashMap = this.A0e.A00;
            AnonymousClass0XV r1 = this.A0a;
            if (r5 != null) {
                A00(r1, r5.A1J, "quotedMessage_");
                hashMap.put(this.A0x, r5);
            } else {
                A01(r1, "quotedMessage_");
                hashMap.remove(this.A0x);
            }
            this.A0Z.A0H(r5);
        }
    }

    public final void A0T(C624134x r8) {
        long A062 = C56952sp.A06(this.A0w, 4736);
        long A042 = A062 - C56612sH.A04(this.A0i, r8);
        C18260x0.A10("MessagesViewModel/scheduleBotTypingIndicatorTimeoutCheck/delay:", AnonymousClass001.A0o(), A042);
        this.A0R.postDelayed(new C70083Zv(this, A062, 10), A042);
    }

    public final void A0U(C624134x r7) {
        byte b;
        if (r7 != null && (b = r7.A1I) != 7 && b != 87) {
            AnonymousClass4UC r5 = this.A1B;
            if (!C86604Kt.A1Z(r5)) {
                C116985rC r1 = this.A0b;
                if (!r1.A07()) {
                    return;
                }
                if (((r1.A07() && C116985rC.A03(r1).BH2(r7.A1J.A00)) || this.A0t.A0T()) && r7.A1J.A02 && r7.A0D >= 4 && C56612sH.A04(this.A0i, r7) < C56952sp.A06(this.A0w, 4736) && A0G().A1J.A02) {
                    C86654Ky.A1H(r5);
                    A0T(r7);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002b, code lost:
        if (r12.A0O != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0V(boolean r33) {
        /*
            r32 = this;
            r2 = 100
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r12 = r32
            X.4uZ r0 = r12.A0x
            r17 = r0
            java.lang.String r0 = r17.getRawString()
            r1.append(r0)
            java.lang.String r0 = "_"
            r1.append(r0)
            r1.append(r2)
            r1.append(r0)
            long r2 = r12.A0P
            java.lang.String r13 = X.AnonymousClass001.A0k(r1, r2)
            java.util.Set r11 = r12.A1K
            monitor-enter(r11)
            if (r33 != 0) goto L_0x002d
            boolean r0 = r12.A0O     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x006f
        L_0x002d:
            boolean r0 = r11.add(r13)     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x006f
            X.4FS r14 = r12.A1E     // Catch:{ all -> 0x0071 }
            X.3Lv r0 = r12.A0m     // Catch:{ all -> 0x0071 }
            r16 = r0
            X.2qz r15 = r12.A11     // Catch:{ all -> 0x0071 }
            long r7 = r12.A0A     // Catch:{ all -> 0x0071 }
            long r5 = r12.A0B     // Catch:{ all -> 0x0071 }
            X.2ss r10 = r12.A0l     // Catch:{ all -> 0x0071 }
            X.2rr r9 = r12.A0s     // Catch:{ all -> 0x0071 }
            X.2rc r4 = r12.A0y     // Catch:{ all -> 0x0071 }
            java.util.List r1 = r12.A1I     // Catch:{ all -> 0x0071 }
            X.7Dp r0 = new X.7Dp     // Catch:{ all -> 0x0071 }
            r0.<init>(r12)     // Catch:{ all -> 0x0071 }
            X.5s7 r12 = new X.5s7     // Catch:{ all -> 0x0071 }
            r30 = r5
            r26 = r2
            r28 = r7
            r23 = r13
            r24 = r1
            r25 = r11
            r20 = r17
            r21 = r4
            r22 = r15
            r17 = r10
            r18 = r16
            r19 = r9
            r15 = r12
            r16 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30)     // Catch:{ all -> 0x0071 }
            r14.BkP(r12)     // Catch:{ all -> 0x0071 }
        L_0x006f:
            monitor-exit(r11)     // Catch:{ all -> 0x0071 }
            return
        L_0x0071:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0071 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VQ.A0V(boolean):void");
    }

    public static void A00(AnonymousClass0XV r4, AnonymousClass2z0 r5, String str) {
        String A0X2 = AnonymousClass000.A0X("fMessageKeyJid", AnonymousClass000.A0l(str));
        String A0X3 = AnonymousClass000.A0X("fMessageKeyFromMe", AnonymousClass000.A0l(str));
        r4.A06(AnonymousClass000.A0X("fMessageKeyId", AnonymousClass000.A0l(str)), r5.A01);
        r4.A06(A0X3, Boolean.valueOf(r5.A02));
        r4.A06(A0X2, C627336j.A07(r5.A00));
    }

    public static void A01(AnonymousClass0XV r4, String str) {
        String A0X2 = AnonymousClass000.A0X("fMessageKeyJid", AnonymousClass000.A0l(str));
        String A0X3 = AnonymousClass000.A0X("fMessageKeyFromMe", AnonymousClass000.A0l(str));
        r4.A05(AnonymousClass000.A0X("fMessageKeyId", AnonymousClass000.A0l(str)));
        r4.A05(A0X3);
        r4.A05(A0X2);
    }

    public void A0I() {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("messagesViewModel/recreatemessagelist/");
        A0o2.append(this.A0A);
        A0o2.append(" ");
        C18260x0.A1V(A0o2, this.A0O);
        int A0D2 = A0D();
        C42242Ni A0F2 = A0F(A0E(), this.A0P);
        A0M(A0F2.A01);
        A0N(A0F2.A02);
        if (this.A07 > A0F2.A00.getCount()) {
            A0K();
        }
        A0Q(A0F2);
        this.A0X.A0H(new AnonymousClass5QE(new C104165Px(this.A05, this.A06, this.A07), A0F2, this.A01, this.A0O));
        this.A1I.clear();
        if (this.A0O && A0D2 > A0D()) {
            Log.i("messagesViewModel/messagesViewModel/loadMoreMessages");
            A0V(false);
        }
        A0L();
    }

    public AnonymousClass4VQ(Intent intent, AnonymousClass0XV r16, C116985rC r17, C56972sr r18, C153167am r19, AnonymousClass5G5 r20, C40262Fd r21, MessageSelectionViewModel messageSelectionViewModel, C104235Qe r23, C56612sH r24, C620733j r25, C44922Xz r26, C56982ss r27, C66543Lv r28, C49482gb r29, C55062pj r30, C29431io r31, C56382rt r32, C56362rr r33, AnonymousClass3ZH r34, C55072pk r35, C56112rR r36, AnonymousClass1VX r37, C95814uZ r38, C56212rc r39, C48192eV r40, AnonymousClass35J r41, C55832qz r42, C989053r r43, AnonymousClass4FS r44, AnonymousClass5RW r45, AnonymousClass66v r46, C183538qC r47) {
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A0Z = A012;
        this.A0S = AnonymousClass08M.A01();
        this.A0Y = AnonymousClass08M.A01();
        this.A1B = new AnonymousClass4UC(Boolean.FALSE);
        this.A0U = AnonymousClass08M.A01();
        this.A0T = AnonymousClass08M.A01();
        this.A1L = new C86364Jv(this, 8);
        C124166Bf r2 = new C124166Bf(this, 11);
        this.A0p = r2;
        this.A0w = r37;
        this.A0s = r33;
        this.A0m = r28;
        this.A11 = r42;
        this.A1E = r44;
        this.A0l = r27;
        this.A0r = r32;
        this.A0j = r25;
        this.A0k = r26;
        this.A0c = r18;
        this.A0H = r47;
        this.A0y = r39;
        this.A0z = r40;
        this.A0u = r35;
        this.A1G = r46;
        AnonymousClass5G5 r8 = r20;
        this.A0e = r8;
        this.A0v = r36;
        this.A1F = r45;
        this.A12 = r43;
        this.A10 = r41;
        this.A0i = r24;
        this.A0f = r21;
        this.A0h = r23;
        C49482gb r6 = r29;
        this.A0n = r6;
        this.A0o = r30;
        C29431io r5 = r31;
        this.A0q = r5;
        this.A0b = r17;
        AnonymousClass0XV r10 = r16;
        this.A0a = r10;
        C95814uZ r3 = r38;
        this.A0x = r3;
        AnonymousClass3ZH r4 = r34;
        this.A0t = r4;
        this.A0Q = intent;
        this.A0g = messageSelectionViewModel;
        this.A0d = r19;
        Number number = (Number) r10.A04("start_ref");
        if (number != null) {
            this.A0A = number.longValue();
        }
        Number number2 = (Number) r10.A04("start_sort_ref");
        if (number2 != null) {
            this.A0B = number2.longValue();
        }
        String A0X2 = AnonymousClass000.A0X("fMessageKeyJid", AnonymousClass000.A0l("quotedMessage_"));
        String A0X3 = AnonymousClass000.A0X("fMessageKeyFromMe", AnonymousClass000.A0l("quotedMessage_"));
        String A0X4 = AnonymousClass000.A0X("fMessageKeyId", AnonymousClass000.A0l("quotedMessage_"));
        C162457s7.A0J(A0X2, 0);
        Map map = r10.A03;
        if (map.containsKey(A0X2)) {
            C162457s7.A0J(A0X3, 0);
            if (map.containsKey(A0X3)) {
                C162457s7.A0J(A0X4, 0);
                if (map.containsKey(A0X4)) {
                    C624134x A052 = this.A11.A05(new AnonymousClass2z0(C18310x6.A0S(C18310x6.A0o(A0X2, map)), C18310x6.A0o(A0X4, map), Boolean.TRUE.equals(map.get(A0X3))));
                    this.A0G = A052;
                    if (A052 != null) {
                        A012.A0G(A052);
                        r8.A00.put(r3, this.A0G);
                    }
                }
            }
        }
        this.A0P = r6.A00;
        this.A1M = r4.A0U();
        this.A1N = r4.A0H instanceof AnonymousClass1fS;
        r5.A06(r2);
    }
}
