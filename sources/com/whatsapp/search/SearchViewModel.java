package com.whatsapp.search;

import X.AnonymousClass001;
import X.AnonymousClass08J;
import X.AnonymousClass08M;
import X.AnonymousClass0GH;
import X.AnonymousClass0XV;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass1fI;
import X.AnonymousClass2ML;
import X.AnonymousClass2R8;
import X.AnonymousClass314;
import X.AnonymousClass33p;
import X.AnonymousClass4FS;
import X.AnonymousClass4FV;
import X.AnonymousClass4FW;
import X.AnonymousClass4L0;
import X.AnonymousClass4UC;
import X.AnonymousClass5A6;
import X.AnonymousClass5ET;
import X.AnonymousClass5L5;
import X.AnonymousClass5LN;
import X.AnonymousClass5NT;
import X.AnonymousClass5P2;
import X.AnonymousClass5P7;
import X.AnonymousClass5QC;
import X.AnonymousClass5RD;
import X.AnonymousClass5U8;
import X.AnonymousClass5ZL;
import X.AnonymousClass5ZU;
import X.AnonymousClass659;
import X.AnonymousClass65X;
import X.AnonymousClass6C0;
import X.AnonymousClass6C6;
import X.AnonymousClass75J;
import X.AnonymousClass7ES;
import X.AnonymousClass8JP;
import X.C05550Ty;
import X.C06270Wx;
import X.C100385As;
import X.C100925Cu;
import X.C100945Cw;
import X.C101355El;
import X.C101385Eo;
import X.C101425Es;
import X.C101475Ex;
import X.C102845Km;
import X.C102955Kx;
import X.C103315Mk;
import X.C103815On;
import X.C104345Qp;
import X.C104395Qu;
import X.C105355Up;
import X.C105365Uq;
import X.C105745Wf;
import X.C106395Yu;
import X.C106685Zz;
import X.C107695bk;
import X.C108795dZ;
import X.C108875dh;
import X.C111515iD;
import X.C112365jc;
import X.C113435lQ;
import X.C114845nh;
import X.C116985rC;
import X.C118075sx;
import X.C118295tJ;
import X.C118445tY;
import X.C1229866p;
import X.C1238169w;
import X.C124166Bf;
import X.C15110qn;
import X.C156137g5;
import X.C162457s7;
import X.C182708or;
import X.C18290x4;
import X.C183538qC;
import X.C1896692e;
import X.C1896792f;
import X.C29431io;
import X.C30471mV;
import X.C54182oJ;
import X.C54292oU;
import X.C56612sH;
import X.C56972sr;
import X.C620733j;
import X.C627336j;
import X.C64333Db;
import X.C64773Ex;
import X.C66533Lu;
import X.C69263Wi;
import X.C71283br;
import X.C72023d3;
import X.C72173dI;
import X.C72343dZ;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import X.C86654Ky;
import X.C95814uZ;
import X.C97794zG;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import androidx.lifecycle.OnLifecycleEvent;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

public class SearchViewModel extends C05550Ty implements C182708or, C15110qn {
    public long A00;
    public SparseIntArray A01;
    public AnonymousClass08J A02;
    public AnonymousClass5ZL A03;
    public C108875dh A04;
    public UserJid A05;
    public C102955Kx A06;
    public C102845Km A07;
    public C105745Wf A08;
    public C113435lQ A09;
    public C118445tY A0A;
    public AnonymousClass5L5 A0B;
    public C97794zG A0C;
    public C108795dZ A0D;
    public AnonymousClass4UC A0E = AnonymousClass0x9.A0b();
    public Integer A0F;
    public Runnable A0G;
    public Runnable A0H;
    public String A0I;
    public List A0J;
    public List A0K;
    public List A0L;
    public List A0M;
    public List A0N;
    public List A0O;
    public boolean A0P;
    public final Handler A0Q;
    public final C06270Wx A0R;
    public final C06270Wx A0S;
    public final C06270Wx A0T;
    public final C06270Wx A0U;
    public final C06270Wx A0V;
    public final C06270Wx A0W;
    public final AnonymousClass08J A0X = AnonymousClass4L0.A0E();
    public final AnonymousClass08J A0Y;
    public final AnonymousClass08J A0Z;
    public final AnonymousClass08J A0a = AnonymousClass4L0.A0E();
    public final AnonymousClass08J A0b;
    public final AnonymousClass08J A0c;
    public final AnonymousClass08M A0d;
    public final AnonymousClass08M A0e;
    public final AnonymousClass08M A0f = AnonymousClass08M.A01();
    public final AnonymousClass0XV A0g;
    public final C116985rC A0h;
    public final C116985rC A0i;
    public final C116985rC A0j;
    public final C69263Wi A0k;
    public final AnonymousClass5A6 A0l;
    public final AnonymousClass5ZU A0m;
    public final C105365Uq A0n;
    public final AnonymousClass314 A0o;
    public final C56612sH A0p;
    public final C54292oU A0q;
    public final AnonymousClass33p A0r;
    public final C620733j A0s;
    public final C66533Lu A0t;
    public final AnonymousClass4FW A0u;
    public final C29431io A0v;
    public final AnonymousClass2R8 A0w;
    public final C104395Qu A0x;
    public final AnonymousClass1VX A0y;
    public final C106685Zz A0z;
    public final C105355Up A10;
    public final AnonymousClass5P7 A11;
    public final AnonymousClass5LN A12;
    public final AnonymousClass5RD A13;
    public final AnonymousClass7ES A14;
    public final C103815On A15;
    public final C104345Qp A16;
    public final C54182oJ A17;
    public final C72173dI A18;
    public final AnonymousClass4UC A19 = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A1A = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A1B = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A1C = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A1D = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A1E = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A1F = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A1G = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A1H = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A1I = AnonymousClass0x9.A0b();
    public final AnonymousClass4FS A1J;
    public final C183538qC A1K;
    public final AtomicBoolean A1L;
    public final AtomicBoolean A1M;

    public void A0O() {
        A0Y(0);
        A0b((UserJid) null);
        A0d((C108795dZ) null);
        A0g(false);
        A0h(false);
        A0e("");
        this.A0g.A06("user_grid_view_choice", (Object) null);
        this.A0E.A0H((Object) null);
        this.A0M = AnonymousClass001.A0s();
        this.A0K = AnonymousClass001.A0s();
        this.A0O = AnonymousClass001.A0s();
        this.A0L = AnonymousClass001.A0s();
        this.A08 = new C105745Wf();
        Runnable runnable = this.A0H;
        if (runnable != null) {
            runnable.run();
        }
        this.A0N = AnonymousClass001.A0s();
        this.A0A = new C118445tY();
        this.A13.A05.A0H(new C105745Wf());
        this.A12.A01.A0H(AnonymousClass001.A0s());
        this.A11.A02.A0H(AnonymousClass001.A0s());
        AnonymousClass5ZL r0 = this.A03;
        if (r0 != null) {
            r0.A07.A0H(C72023d3.A00);
        }
        AnonymousClass5L5 r02 = this.A0B;
        if (r02 != null) {
            r02.A04.A0H((Object) null);
        }
        A0T();
    }

    public void A0C() {
        this.A0n.A00();
        AnonymousClass5ZL r0 = this.A03;
        if (r0 != null) {
            AnonymousClass5P2 r3 = r0.A09;
            C112365jc r2 = r3.A04;
            AnonymousClass5U8 r02 = r2.A02;
            r02.A01.removeCallbacks(r02.A08);
            r2.A01.A00();
            r3.A02.A05();
        }
        C29431io r1 = this.A0v;
        r1.A07(this.A13.A00);
        r1.A07(this.A0u);
    }

    public int A0D() {
        Number number = (Number) this.A0g.A04("last_nav_type");
        if (number == null) {
            return 0;
        }
        return number.intValue();
    }

    public int A0E() {
        Number A0i2 = C86654Ky.A0i(this.A0g.A02(0, "search_type"));
        if (A0i2 != null) {
            return A0i2.intValue();
        }
        return 0;
    }

    public int A0H(C30471mV r6) {
        int i = -2;
        if (this.A08.A01.contains(r6)) {
            C118295tJ A0L2 = A0L();
            for (int i2 = 0; i2 < A0L2.size(); i2++) {
                int A002 = A0L2.A00(i2);
                if ((C156137g5.A01(A002) || A002 == 17 || A002 == 18 || A002 == 16 || A002 == 14) && AnonymousClass75J.A00(A0L2.A01(i2), r6)) {
                    i = i2;
                }
            }
        }
        return i;
    }

    public C108875dh A0I() {
        return (C108875dh) this.A0g.A02((Object) null, "remote_entity_filter").A07();
    }

    public UserJid A0J() {
        return (UserJid) this.A0g.A02((Object) null, "search_jid").A07();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0278, code lost:
        if (r3.A03.size() <= 0) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x029d, code lost:
        if (r3.A00.size() <= 0) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0186, code lost:
        if (A0i() == false) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0200, code lost:
        if (X.C86614Ku.A1W(r7, r2) != false) goto L_0x0202;
     */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0443  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0209  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C118295tJ A0K() {
        /*
            r22 = this;
            r6 = r22
            X.2oU r3 = r6.A0q
            X.5Zz r1 = r6.A0z
            X.33j r0 = r6.A0s
            X.5tJ r5 = new X.5tJ
            r5.<init>(r3, r0, r1)
            X.08J r4 = r6.A0c
            java.lang.Object r0 = r4.A07()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0126
            com.whatsapp.jid.UserJid r0 = r6.A0J()
            if (r0 != 0) goto L_0x0126
            int r0 = r6.A0E()
            if (r0 != 0) goto L_0x0126
            X.5dZ r0 = r6.A0M()
            if (r0 != 0) goto L_0x0126
            X.5dh r0 = r6.A0I()
            if (r0 != 0) goto L_0x0126
            monitor-enter(r6)
            X.1VX r4 = r6.A0y     // Catch:{ all -> 0x0123 }
            r0 = 1608(0x648, float:2.253E-42)
            boolean r0 = r4.A0X(r0)     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x0047
            android.util.SparseIntArray r2 = r6.A01     // Catch:{ all -> 0x0123 }
            r1 = 117(0x75, float:1.64E-43)
            r0 = 8
            r2.put(r1, r0)     // Catch:{ all -> 0x0123 }
        L_0x0047:
            r0 = 2662(0xa66, float:3.73E-42)
            boolean r0 = r4.A0X(r0)     // Catch:{ all -> 0x0123 }
            r7 = 1
            if (r0 == 0) goto L_0x0057
            android.util.SparseIntArray r1 = r6.A01     // Catch:{ all -> 0x0123 }
            r0 = 111(0x6f, float:1.56E-43)
            r1.put(r0, r7)     // Catch:{ all -> 0x0123 }
        L_0x0057:
            android.util.SparseIntArray r2 = r6.A01     // Catch:{ all -> 0x0123 }
            r1 = 105(0x69, float:1.47E-43)
            r0 = 7
            r2.put(r1, r0)     // Catch:{ all -> 0x0123 }
            r1 = 118(0x76, float:1.65E-43)
            r0 = 6
            r2.put(r1, r0)     // Catch:{ all -> 0x0123 }
            r1 = 108(0x6c, float:1.51E-43)
            r0 = 5
            r2.put(r1, r0)     // Catch:{ all -> 0x0123 }
            r1 = 103(0x67, float:1.44E-43)
            r0 = 4
            r2.put(r1, r0)     // Catch:{ all -> 0x0123 }
            r1 = 97
            r0 = 3
            r2.put(r1, r0)     // Catch:{ all -> 0x0123 }
            r1 = 100
            r0 = 2
            r2.put(r1, r0)     // Catch:{ all -> 0x0123 }
            r0 = 0
            r2.put(r0, r7)     // Catch:{ all -> 0x0123 }
            monitor-exit(r6)     // Catch:{ all -> 0x0123 }
            android.util.SparseIntArray r0 = r6.A01
            android.util.SparseIntArray r1 = r0.clone()
            r0 = 4
            X.C97784zF.A00(r1, r5, r0)
            r0 = 1287(0x507, float:1.803E-42)
            boolean r0 = r4.A0X(r0)
            if (r0 == 0) goto L_0x00b4
            X.5Qp r2 = r6.A16
            monitor-enter(r2)
            java.util.List r1 = r2.A07     // Catch:{ all -> 0x00a3 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x00a6
            r2.A01()     // Catch:{ all -> 0x00a3 }
            goto L_0x00a6
        L_0x00a3:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00a6:
            monitor-exit(r2)
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r1)
            java.util.ArrayList r1 = X.AnonymousClass002.A0J(r0)
            r0 = 22
            X.C97784zF.A00(r1, r5, r0)
        L_0x00b4:
            X.5XN r0 = X.AnonymousClass5ZL.A0L
            boolean r0 = r0.A00(r4)
            if (r0 == 0) goto L_0x00d1
            X.8qC r0 = r6.A1K
            java.lang.Object r0 = r0.get()
            X.5QC r0 = (X.AnonymousClass5QC) r0
            java.util.List r0 = r0.A00()
            java.util.ArrayList r1 = X.AnonymousClass002.A0J(r0)
            r0 = 100
            X.C97784zF.A00(r1, r5, r0)
        L_0x00d1:
            X.5Up r2 = r6.A10
            X.1VX r1 = r2.A03
            r0 = 1206(0x4b6, float:1.69E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x011d
            boolean r0 = r2.A04()
            if (r0 == 0) goto L_0x011d
            android.content.Context r3 = r3.A00
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            X.6xb r2 = X.C142686xb.A0Q
            java.lang.String r1 = r2.id
            r0 = 2131886660(0x7f120244, float:1.9407905E38)
            X.C108715dR.A00(r3, r2, r1, r4, r0)
            X.6xb r2 = X.C142686xb.A0C
            java.lang.String r1 = r2.id
            r0 = 2131886659(0x7f120243, float:1.9407903E38)
            X.C108715dR.A00(r3, r2, r1, r4, r0)
            X.6xb r2 = X.C142686xb.A03
            java.lang.String r1 = r2.id
            r0 = 2131886657(0x7f120241, float:1.94079E38)
            X.C108715dR.A00(r3, r2, r1, r4, r0)
            r0 = 2131896074(0x7f12270a, float:1.9426999E38)
            java.lang.String r3 = r3.getString(r0)
            r2 = 0
            r1 = 0
            X.5dR r0 = new X.5dR
            r0.<init>(r1, r3, r2)
            r4.add(r0)
            r0 = 23
            X.C97784zF.A00(r4, r5, r0)
        L_0x011d:
            X.08J r0 = r6.A0Z
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            goto L_0x044a
        L_0x0123:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0123 }
            throw r0
        L_0x0126:
            X.5Wf r0 = r6.A08
            X.5Wf r3 = r0.A00()
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            X.5P7 r0 = r6.A11
            X.08M r8 = r0.A04
            boolean r21 = X.C86614Ku.A1W(r8, r9)
            X.5LN r0 = r6.A12
            X.08M r7 = r0.A03
            boolean r20 = X.C86614Ku.A1W(r7, r9)
            if (r21 != 0) goto L_0x014e
            if (r20 != 0) goto L_0x014e
            X.5Km r0 = r6.A07
            if (r0 == 0) goto L_0x044e
            X.08M r0 = r0.A02
            boolean r0 = X.C86614Ku.A1W(r0, r9)
            if (r0 == 0) goto L_0x044e
        L_0x014e:
            r19 = 1
        L_0x0150:
            r18 = 1
        L_0x0152:
            boolean r17 = r6.A0k()
            boolean r11 = r6.A0j()
            java.util.List r1 = r3.A02
            int r2 = r1.size()
            r0 = 5
            boolean r16 = X.C86624Kv.A1W(r2, r0)
            if (r11 == 0) goto L_0x0177
            int r15 = r6.A0E()
            r14 = 118(0x76, float:1.65E-43)
            r13 = 105(0x69, float:1.47E-43)
            r12 = 103(0x67, float:1.44E-43)
            if (r15 == r12) goto L_0x03b5
            if (r15 == r13) goto L_0x03b5
            if (r15 == r14) goto L_0x03b5
        L_0x0177:
            X.08J r9 = r6.A0Z
            java.util.List r0 = r3.A01
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0188
            boolean r2 = r6.A0i()
            r0 = 1
            if (r2 != 0) goto L_0x0189
        L_0x0188:
            r0 = 0
        L_0x0189:
            X.C06270Wx.A05(r9, r0)
            X.08J r0 = r6.A0Y
            X.C06270Wx.A05(r0, r11)
            if (r21 != 0) goto L_0x044d
            X.4zG r0 = r6.A0C
            if (r0 == 0) goto L_0x019a
            r5.add(r0)
        L_0x019a:
            java.util.List r0 = r6.A0K
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01b2
            X.1VX r2 = r6.A0y
            r0 = 6740(0x1a54, float:9.445E-42)
            int r2 = r2.A0N(r0)
            r0 = 1
            if (r2 != r0) goto L_0x01b2
            X.4zF r0 = X.C118295tJ.A00
            r5.add(r0)
        L_0x01b2:
            java.util.List r0 = r6.A0K
            r5.addAll(r0)
            if (r20 != 0) goto L_0x044d
            java.util.List r0 = r6.A0M
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01d1
            X.1VX r2 = r6.A0y
            r0 = 6740(0x1a54, float:9.445E-42)
            int r2 = r2.A0N(r0)
            r0 = 1
            if (r2 != r0) goto L_0x01d1
            X.4zF r0 = X.C118295tJ.A09
            r5.add(r0)
        L_0x01d1:
            java.util.List r0 = r6.A0M
            r5.addAll(r0)
            if (r19 != 0) goto L_0x044d
            X.5Km r0 = r6.A07
            if (r0 == 0) goto L_0x01ee
            java.util.List r0 = r6.A0O
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01ee
            X.4zF r0 = X.C118295tJ.A04
            r5.add(r0)
            java.util.List r0 = r6.A0O
            r5.addAll(r0)
        L_0x01ee:
            X.5dh r0 = r6.A0I()
            if (r0 != 0) goto L_0x0202
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r0 = X.C86614Ku.A1W(r8, r2)
            if (r0 == 0) goto L_0x0207
            boolean r0 = X.C86614Ku.A1W(r7, r2)
            if (r0 == 0) goto L_0x0207
        L_0x0202:
            java.util.List r0 = r6.A0J
            r5.addAll(r0)
        L_0x0207:
            if (r18 != 0) goto L_0x044d
            java.util.List r0 = r6.A0N
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x021b
            X.4zF r0 = X.C118295tJ.A02
            r5.add(r0)
            java.util.List r0 = r6.A0N
            r5.addAll(r0)
        L_0x021b:
            X.3Lu r0 = r6.A0t
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x0246
            X.33p r0 = r6.A0r
            android.content.SharedPreferences r2 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "backup_restore_state"
            int r2 = X.C18280x3.A02(r2, r0)
            r0 = 512(0x200, float:7.175E-43)
            if (r2 != r0) goto L_0x0246
            int r0 = r5.size()
            if (r0 == 0) goto L_0x0465
            java.lang.Object r0 = r4.A07()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0465
            return r5
        L_0x0246:
            boolean r0 = r6.A0l()
            if (r0 == 0) goto L_0x026b
            X.1VX r2 = r6.A0y
            r0 = 6221(0x184d, float:8.717E-42)
            boolean r0 = r2.A0X(r0)
            if (r0 == 0) goto L_0x0261
            r0 = 2131890637(0x7f1211cd, float:1.9415971E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r0 = 1
            X.C97784zF.A00(r2, r5, r0)
        L_0x0261:
            android.util.SparseIntArray r0 = r6.A01
            android.util.SparseIntArray r2 = r0.clone()
            r0 = 4
            X.C97784zF.A00(r2, r5, r0)
        L_0x026b:
            int r0 = r6.A0E()
            if (r0 != 0) goto L_0x027a
            java.util.List r0 = r3.A03
            int r0 = r0.size()
            r7 = 1
            if (r0 > 0) goto L_0x027b
        L_0x027a:
            r7 = 0
        L_0x027b:
            java.util.List r0 = r6.A0K
            int r0 = r0.size()
            if (r0 > 0) goto L_0x0290
            java.util.List r0 = r6.A0M
            int r0 = r0.size()
            if (r0 > 0) goto L_0x0290
            if (r7 != 0) goto L_0x0290
            r6.A0l()
        L_0x0290:
            int r0 = r6.A0E()
            if (r0 != 0) goto L_0x029f
            java.util.List r0 = r3.A00
            int r0 = r0.size()
            r4 = 1
            if (r0 > 0) goto L_0x02a0
        L_0x029f:
            r4 = 0
        L_0x02a0:
            java.util.List r0 = r6.A0K
            int r0 = r0.size()
            if (r0 > 0) goto L_0x02d8
            java.util.List r0 = r6.A0M
            int r0 = r0.size()
            if (r0 > 0) goto L_0x02d8
            java.util.List r0 = r6.A0O
            int r0 = r0.size()
            if (r0 > 0) goto L_0x02d8
            if (r7 != 0) goto L_0x02bc
            if (r4 == 0) goto L_0x02c4
        L_0x02bc:
            java.util.List r0 = r3.A04
            int r0 = r0.size()
            if (r0 > 0) goto L_0x02d8
        L_0x02c4:
            boolean r0 = r6.A0l()
            if (r0 != 0) goto L_0x02d8
            X.5dh r0 = r6.A0I()
            if (r0 != 0) goto L_0x02fe
            java.util.List r0 = r6.A0J
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x02fe
        L_0x02d8:
            r9 = 1
        L_0x02d9:
            r2 = r9 ^ 1
            r2 = r2 & r16
            if (r9 == 0) goto L_0x0300
            boolean r0 = r6.A0l()
            if (r0 != 0) goto L_0x0300
            int r0 = r1.size()
            if (r0 != 0) goto L_0x0300
            if (r17 != 0) goto L_0x0300
            X.0Wx r0 = r6.A0V
            java.lang.Object r0 = r0.A07()
            if (r0 != 0) goto L_0x0300
            X.4zF r0 = X.C118295tJ.A06
            r5.add(r0)
            X.4zF r0 = X.C118295tJ.A07
            goto L_0x046c
        L_0x02fe:
            r9 = 0
            goto L_0x02d9
        L_0x0300:
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x0384
            if (r7 == 0) goto L_0x03b2
            X.4zF r0 = X.C118295tJ.A0A
            r5.add(r0)
            X.1VX r1 = r6.A0y
            java.util.List r0 = r3.A03
            r8 = 0
            r5.A02(r1, r0, r8)
        L_0x0315:
            if (r4 == 0) goto L_0x035f
            X.5Qu r4 = r6.A0x
            java.lang.Runnable r0 = r4.A01
            if (r0 == 0) goto L_0x0333
            android.os.Handler r1 = r4.A00
            if (r1 != 0) goto L_0x032e
            X.2X6 r0 = r4.A09
            android.os.Looper r0 = r0.A00()
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0)
            r4.A00 = r1
        L_0x032e:
            java.lang.Runnable r0 = r4.A01
            r1.removeCallbacks(r0)
        L_0x0333:
            r1 = 1
            X.3Zl r0 = new X.3Zl
            r0.<init>(r4, r1)
            r4.A01 = r0
            android.os.Handler r7 = r4.A00
            if (r7 != 0) goto L_0x034c
            X.2X6 r0 = r4.A09
            android.os.Looper r0 = r0.A00()
            android.os.Handler r7 = new android.os.Handler
            r7.<init>(r0)
            r4.A00 = r7
        L_0x034c:
            java.lang.Runnable r4 = r4.A01
            r0 = 450(0x1c2, double:2.223E-321)
            r7.postDelayed(r4, r0)
            X.4zF r0 = X.C118295tJ.A05
            r5.add(r0)
            X.1VX r1 = r6.A0y
            java.util.List r0 = r3.A00
            r5.A02(r1, r0, r8)
        L_0x035f:
            if (r9 == 0) goto L_0x0366
            X.4zF r0 = X.C118295tJ.A06
            r5.add(r0)
        L_0x0366:
            java.util.List r0 = r6.A0L
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x037d
            java.util.List r0 = r6.A0L
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r0)
            X.7EU r1 = new X.7EU
            r1.<init>(r0)
            r0 = 6
            X.C97784zF.A00(r1, r5, r0)
        L_0x037d:
            X.1VX r1 = r6.A0y
            java.util.List r0 = r3.A04
            r5.A02(r1, r0, r2)
        L_0x0384:
            if (r17 != 0) goto L_0x044d
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x039f
            int r1 = r5.size()
            r0 = 1
            if (r1 != r0) goto L_0x044d
            java.lang.Object r0 = X.AnonymousClass0x9.A0t(r5)
            X.7g5 r0 = (X.C156137g5) r0
            int r1 = r0.A00
            r0 = 39
            if (r1 != r0) goto L_0x044d
        L_0x039f:
            X.1VX r1 = r6.A0y
            r0 = 4911(0x132f, float:6.882E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0462
            X.4zF r0 = X.C118295tJ.A07
            r5.add(r0)
            X.4zF r0 = X.C118295tJ.A03
            goto L_0x046c
        L_0x03b2:
            r8 = 0
            goto L_0x0315
        L_0x03b5:
            java.util.List r10 = r3.A01
            int r0 = r10.size()
            if (r0 <= 0) goto L_0x043d
            java.util.List r0 = r6.A0L
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03d4
            java.util.List r0 = r6.A0L
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r0)
            X.7EU r2 = new X.7EU
            r2.<init>(r0)
            r0 = 6
            X.C97784zF.A00(r2, r5, r0)
        L_0x03d4:
            if (r15 == r12) goto L_0x041c
            if (r15 == r13) goto L_0x03fb
            if (r15 != r14) goto L_0x043d
            r10.size()
            java.util.Iterator r10 = r10.iterator()
        L_0x03e1:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x043d
            X.34x r2 = X.C18300x5.A0T(r10)
            if (r16 == 0) goto L_0x03f1
            r0 = 1
            r5.A03(r2, r0)
        L_0x03f1:
            boolean r0 = r2 instanceof X.C31971pB
            if (r0 == 0) goto L_0x03e1
            r0 = 10
            X.C97784zF.A00(r2, r5, r0)
            goto L_0x03e1
        L_0x03fb:
            r10.size()
            java.util.Iterator r10 = r10.iterator()
        L_0x0402:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x043d
            X.34x r2 = X.C18300x5.A0T(r10)
            boolean r0 = r2 instanceof X.AnonymousClass1n2
            if (r0 == 0) goto L_0x0402
            if (r16 == 0) goto L_0x0416
            r0 = 1
            r5.A03(r2, r0)
        L_0x0416:
            r0 = 9
            X.C97784zF.A00(r2, r5, r0)
            goto L_0x0402
        L_0x041c:
            r10.size()
            java.util.Iterator r10 = r10.iterator()
        L_0x0423:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x043d
            X.34x r2 = X.C18300x5.A0T(r10)
            boolean r0 = r2 instanceof X.C31961pA
            if (r0 == 0) goto L_0x0423
            if (r16 == 0) goto L_0x0437
            r0 = 1
            r5.A03(r2, r0)
        L_0x0437:
            r0 = 8
            X.C97784zF.A00(r2, r5, r0)
            goto L_0x0423
        L_0x043d:
            int r0 = r5.size()
            if (r0 == 0) goto L_0x0177
            X.08J r0 = r6.A0Z
            r0.A0G(r9)
            X.08J r0 = r6.A0Y
        L_0x044a:
            r0.A0G(r9)
        L_0x044d:
            return r5
        L_0x044e:
            r19 = 0
            X.5Kx r0 = r6.A06
            if (r0 == 0) goto L_0x045e
            X.08M r0 = r0.A03
            boolean r0 = X.C86614Ku.A1W(r0, r9)
            if (r0 == 0) goto L_0x045e
            goto L_0x0150
        L_0x045e:
            r18 = 0
            goto L_0x0152
        L_0x0462:
            X.4zF r0 = X.C118295tJ.A08
            goto L_0x046c
        L_0x0465:
            X.4zF r0 = X.C118295tJ.A06
            r5.add(r0)
            X.4zF r0 = X.C118295tJ.A01
        L_0x046c:
            r5.add(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.SearchViewModel.A0K():X.5tJ");
    }

    public final C118295tJ A0L() {
        AnonymousClass08J r1 = this.A02;
        if (r1.A07() == null) {
            return A0K();
        }
        return (C118295tJ) r1.A07();
    }

    public C108795dZ A0M() {
        return (C108795dZ) this.A0g.A02((Object) null, "smart_filter").A07();
    }

    public String A0N() {
        String str = (String) this.A0g.A02("", "query_text").A07();
        if (str != null) {
            return str;
        }
        return "";
    }

    public void A0P() {
        AnonymousClass5P7 r0 = this.A11;
        r0.A03.A0G(r0.A00);
        AnonymousClass5LN r02 = this.A12;
        r02.A02.A0G(r02.A00);
    }

    public void A0Q() {
        this.A15.A00(2, (Integer) null, 117);
        A0d(new C108795dZ(2, R.id.search_unread_filter, R.string.f11nameremoved, R.drawable.smart_filter_unread));
    }

    public final void A0R() {
        C116985rC r1 = this.A0i;
        boolean A072 = r1.A07();
        Integer A0b2 = C18290x4.A0b();
        Integer A0c2 = C18290x4.A0c();
        if (A072) {
            r1.A04();
            A0M();
            throw AnonymousClass001.A0g("logSmartFilterEvent");
        } else if (this.A03 != null) {
            AnonymousClass1VX r12 = this.A0y;
            C162457s7.A0J(r12, 0);
            if (r12.A0X(5957)) {
                this.A15.A00(A0c2, A0b2, A0E());
            }
        }
    }

    public final void A0S() {
        this.A1M.set(true);
        if (TextUtils.isEmpty(A0N()) && A0E() == 0 && A0J() == null && A0M() == null && A0I() == null) {
            this.A1L.set(true);
            this.A0P = true;
        } else if (this.A0P) {
            this.A00 = SystemClock.uptimeMillis();
            this.A0P = false;
        }
    }

    public final void A0T() {
        Log.d("SearchViewModel/postCombinedList");
        this.A0G = new C71283br((Object) this, 28);
        C72173dI r1 = this.A18;
        r1.A02();
        r1.execute(this.A0G);
    }

    public final void A0V() {
        int size;
        int A052;
        AbstractCollection abstractCollection = (AbstractCollection) this.A02.A07();
        boolean z = false;
        if (abstractCollection == null) {
            size = 0;
        } else {
            size = abstractCollection.size();
        }
        AnonymousClass08M r1 = this.A0e;
        if (r1.A07() == null) {
            A052 = 0;
        } else {
            A052 = C86604Kt.A05(r1);
        }
        if (A0k() && A052 > size - 3) {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        AnonymousClass08J r12 = this.A0b;
        if (!AnonymousClass75J.A00(valueOf, r12.A07())) {
            r12.A0H(valueOf);
        }
    }

    public void A0a(C95814uZ r7) {
        int A0E2;
        this.A0f.A0H(Boolean.FALSE);
        A0W(1);
        if (r7 != null) {
            int A0G2 = A0G(r7);
            AnonymousClass5ZL r0 = this.A03;
            if (r0 == null || !r0.A08(r7)) {
                C116985rC r1 = this.A0i;
                if (r1.A07()) {
                    r1.A04();
                    A0M();
                    throw AnonymousClass001.A0g("logSmartFilterEvent");
                }
                C108795dZ A0M2 = A0M();
                if (A0M2 == null || 2 != A0M2.A01) {
                    A0E2 = A0E();
                } else {
                    A0E2 = 117;
                }
                this.A15.A00(5, Integer.valueOf(A0G2), A0E2);
            }
            this.A19.A0H(r7);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (r1 == false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0c(X.C624134x r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0043
            r1 = 1
            int r0 = r6.A0j()
            if (r1 != r0) goto L_0x0043
            X.5Qu r4 = r5.A0x
            java.lang.Integer r1 = X.C18290x4.A0c()
            X.2z0 r0 = r6.A1J
            X.4uZ r3 = r0.A00
            X.1b6 r2 = new X.1b6
            r2.<init>()
            r2.A04 = r1
            if (r3 == 0) goto L_0x003e
            boolean r0 = X.C627336j.A0K(r3)
            if (r0 == 0) goto L_0x003e
            X.2sj r1 = r4.A05
            com.whatsapp.jid.GroupJid r3 = (com.whatsapp.jid.GroupJid) r3
            boolean r0 = r1.A0C(r3)
            boolean r1 = r1.A0D(r3)
            if (r0 == 0) goto L_0x0033
            r0 = 1
            if (r1 != 0) goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A02 = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.A01 = r0
        L_0x003e:
            X.4FV r0 = r4.A06
            r0.BhD(r2)
        L_0x0043:
            r0 = 0
            r5.A0h(r0)
            r0 = 2
            r5.A0W(r0)
            r5.A0R()
            X.4UC r0 = r5.A1I
            r0.A0H(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.SearchViewModel.A0c(X.34x):void");
    }

    public void A0g(boolean z) {
        if (AnonymousClass5ZL.A0L.A00(this.A0y)) {
            A0Z((C108875dh) null);
            if (z) {
                A0Y(0);
                AnonymousClass08J r1 = this.A0c;
                r1.A0H(r1.A07());
            }
        }
    }

    public final boolean A0j() {
        if (this.A08.A02.size() == 0) {
            return false;
        }
        Boolean bool = (Boolean) this.A0g.A04("user_grid_view_choice");
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!A0i() || !A0N().isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean A0k() {
        C102955Kx r0;
        Boolean bool = Boolean.TRUE;
        if (!C86614Ku.A1W(this.A11.A04, bool) && !C86614Ku.A1W(this.A12.A03, bool)) {
            AnonymousClass5RD r1 = this.A13;
            if (!C86614Ku.A1W(r1.A08, bool) && !C86614Ku.A1W(r1.A0B, bool) && !C86614Ku.A1W(r1.A0A, bool) && ((r0 = this.A06) == null || !C86614Ku.A1W(r0.A03, bool))) {
                return false;
            }
        }
        if (this.A03 == null || 98 != A0E()) {
            return true;
        }
        return false;
    }

    public final boolean A0l() {
        if ((!C86614Ku.A1W(this.A13.A0B, Boolean.TRUE) || this.A08.A02.size() > 0) && this.A01.size() > 0) {
            return true;
        }
        return false;
    }

    public C1229866p B0s(C30471mV r2) {
        return new C114845nh(this);
    }

    public int A0F(C95814uZ r6) {
        C118295tJ A0L2 = A0L();
        int i = -2;
        for (int i2 = 0; i2 < A0L2.size(); i2++) {
            if ((((C156137g5) A0L2.get(i2)).A00 == 3 || ((C156137g5) A0L2.get(i2)).A00 == 2) && AnonymousClass75J.A00(((AnonymousClass659) A0L2.get(i2)).B8o(), r6)) {
                i = i2;
            }
        }
        return i;
    }

    public int A0G(C95814uZ r3) {
        if (C627336j.A0K(r3)) {
            return 2;
        }
        if (r3 instanceof AnonymousClass1fI) {
            return 3;
        }
        if (this.A0o.A05().contains(r3)) {
            return 1;
        }
        AnonymousClass5ZL r0 = this.A03;
        if (r0 == null || !r0.A08(r3)) {
            return 0;
        }
        return 5;
    }

    public final void A0U() {
        int A052;
        Pair A0K2;
        int size = A0L().size();
        AnonymousClass08M r1 = this.A0e;
        if (r1.A07() == null) {
            A052 = 0;
        } else {
            A052 = C86604Kt.A05(r1);
        }
        if (size - A052 < 300) {
            AnonymousClass5RD r12 = this.A13;
            if (!r12.A01.get()) {
                AnonymousClass08J r4 = r12.A06;
                if (r4.A07() != null) {
                    Object obj = ((Pair) r4.A07()).first;
                    Number number = (Number) ((Pair) r4.A07()).second;
                    if (number != null) {
                        AnonymousClass08M r13 = r12.A09;
                        if (r13.A07() != null && C86604Kt.A05(r13) != -1) {
                            A0K2 = C18290x4.A0K(obj, number.intValue() + 1);
                        } else if (Boolean.TRUE.equals(obj)) {
                            A0K2 = C18290x4.A0K(Boolean.FALSE, 0);
                        } else {
                            return;
                        }
                        r4.A0H(A0K2);
                    }
                }
            }
        }
    }

    public void A0W(int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AnonymousClass0XV r2 = this.A0g;
        r2.A06("last_nav_time", Long.valueOf(elapsedRealtime));
        r2.A06("last_nav_type", Integer.valueOf(i));
    }

    public void A0X(int i) {
        Integer valueOf = Integer.valueOf(i);
        if (!AnonymousClass75J.A00(valueOf, this.A0R.A07())) {
            this.A0g.A06("current_screen", valueOf);
        }
    }

    public void A0Y(int i) {
        if (A0M() == null && i != A0E()) {
            this.A15.A00(2, (Integer) null, i);
            A0d((C108795dZ) null);
            A0g(false);
            C118445tY r4 = this.A0A;
            Integer valueOf = Integer.valueOf(i);
            r4.A00(new C106395Yu(A0J(), valueOf, A0N(), 2));
            this.A0g.A06("search_type", valueOf);
        }
    }

    public void A0Z(C108875dh r5) {
        if (!AnonymousClass75J.A00(r5, A0I())) {
            this.A0A.A00(new C106395Yu(r5, 98, A0N()));
            AnonymousClass0XV r1 = this.A0g;
            r1.A06("remote_entity_filter", r5);
            r1.A06("search_type", 98);
            synchronized (this) {
                this.A01 = new SparseIntArray();
            }
        }
    }

    public void A0b(UserJid userJid) {
        if (!AnonymousClass75J.A00(userJid, A0J())) {
            this.A0A.A00(new C106395Yu(userJid, Integer.valueOf(A0E()), A0N(), 3));
            this.A0g.A06("search_jid", userJid);
        }
    }

    public void A0d(C108795dZ r4) {
        if (A0E() == 0 && !AnonymousClass75J.A00(r4, A0M())) {
            this.A0A.A00(new C106395Yu(r4, A0N()));
            this.A0g.A06("smart_filter", r4);
        }
    }

    public void A0e(String str) {
        if (!AnonymousClass75J.A00(str, A0N())) {
            this.A0A.A00(new C106395Yu(A0J(), Integer.valueOf(A0E()), str, 1));
            this.A0g.A06("query_text", str);
        }
    }

    public void A0f(boolean z) {
        A0O();
        A0X(1);
        A0W(4);
        C06270Wx.A05(this.A0E, z);
    }

    public void A0h(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        AnonymousClass08M r1 = this.A0f;
        if (!C86614Ku.A1W(r1, valueOf)) {
            r1.A0H(valueOf);
        }
    }

    public boolean A0i() {
        if (A0E() == 103 || A0E() == 105 || A0E() == 118) {
            return true;
        }
        return false;
    }

    public final boolean A0m(long j) {
        long longValue;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Number number = (Number) this.A0g.A04("last_nav_time");
        if (number == null) {
            longValue = 0;
        } else {
            longValue = number.longValue();
        }
        return AnonymousClass001.A1W(((elapsedRealtime - longValue) > j ? 1 : ((elapsedRealtime - longValue) == j ? 0 : -1)));
    }

    @OnLifecycleEvent(AnonymousClass0GH.ON_PAUSE)
    public void onPause() {
        A0D();
        if (A0D() != 2 && A0D() != 1 && A0D() != 4) {
            if (A0D() != 0 || A0m(500)) {
                A0W(3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        if (A0m(300000) != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r1 != 3) goto L_0x0016;
     */
    @androidx.lifecycle.OnLifecycleEvent(X.AnonymousClass0GH.ON_RESUME)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r5 = this;
            r5.A0D()
            int r1 = r5.A0D()
            r2 = 0
            if (r1 == 0) goto L_0x0016
            r0 = 1
            if (r1 == r0) goto L_0x0023
            r0 = 2
            r3 = 300000(0x493e0, double:1.482197E-318)
            if (r1 == r0) goto L_0x001a
            r0 = 3
            if (r1 == r0) goto L_0x004e
        L_0x0016:
            r5.A0W(r2)
            return
        L_0x001a:
            r0 = 500(0x1f4, double:2.47E-321)
            boolean r0 = r5.A0m(r0)
            if (r0 != 0) goto L_0x004e
            return
        L_0x0023:
            X.1VX r1 = r5.A0y
            r0 = 1608(0x648, float:2.253E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x003c
            X.5dZ r0 = r5.A0M()
            if (r0 == 0) goto L_0x003c
            r1 = 2
            int r0 = r0.A01
            if (r1 != r0) goto L_0x003c
            r5.A0P()
            goto L_0x0016
        L_0x003c:
            X.5dh r0 = r5.A0I()
            if (r0 == 0) goto L_0x0054
            X.5ZL r0 = r5.A03
            if (r0 == 0) goto L_0x0016
            X.08J r1 = r0.A08
            X.2s8 r0 = r0.A0E
            r1.A0G(r0)
            goto L_0x0016
        L_0x004e:
            boolean r0 = r5.A0m(r3)
            if (r0 == 0) goto L_0x0016
        L_0x0054:
            r5.A0D()
            r5.A0f(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.SearchViewModel.onResume():void");
    }

    public SearchViewModel(AnonymousClass0XV r43, C116985rC r44, C116985rC r45, C116985rC r46, C100925Cu r47, C100945Cw r48, AnonymousClass5ET r49, C101355El r50, C101385Eo r51, C101425Es r52, C101475Ex r53, C69263Wi r54, AnonymousClass5A6 r55, AnonymousClass5ZU r56, C105365Uq r57, AnonymousClass314 r58, C56612sH r59, C54292oU r60, AnonymousClass33p r61, C620733j r62, C66533Lu r63, C29431io r64, AnonymousClass2R8 r65, C104395Qu r66, AnonymousClass1VX r67, AnonymousClass4FV r68, C106685Zz r69, C105355Up r70, C103815On r71, C104345Qp r72, C54182oJ r73, AnonymousClass4FS r74, C183538qC r75, C183538qC r76) {
        AnonymousClass08J A0E2 = AnonymousClass4L0.A0E();
        this.A0c = A0E2;
        this.A0d = AnonymousClass08M.A01();
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A0e = A012;
        this.A1M = new AtomicBoolean();
        this.A1L = new AtomicBoolean();
        this.A0Y = AnonymousClass4L0.A0E();
        this.A0Z = AnonymousClass4L0.A0E();
        this.A0K = AnonymousClass001.A0s();
        this.A0M = AnonymousClass001.A0s();
        this.A0O = AnonymousClass001.A0s();
        this.A0L = AnonymousClass001.A0s();
        this.A0N = AnonymousClass001.A0s();
        this.A0J = AnonymousClass001.A0s();
        this.A0C = null;
        this.A01 = new SparseIntArray();
        this.A08 = new C105745Wf();
        this.A0A = new C118445tY();
        this.A00 = 0;
        this.A0P = true;
        this.A02 = AnonymousClass4L0.A0E();
        AnonymousClass08J A0E3 = AnonymousClass4L0.A0E();
        this.A0b = A0E3;
        this.A0Q = new Handler(Looper.getMainLooper(), new C1238169w(this, 5));
        this.A0u = new C124166Bf(this, 19);
        this.A14 = new AnonymousClass7ES(this);
        this.A09 = new C113435lQ(this);
        this.A0q = r60;
        C56612sH r41 = r59;
        this.A0p = r41;
        AnonymousClass1VX r15 = r67;
        this.A0y = r15;
        this.A0k = r54;
        AnonymousClass4FS r4 = r74;
        this.A1J = r4;
        this.A0z = r69;
        this.A0m = r56;
        this.A0s = r62;
        this.A0t = r63;
        this.A0v = r64;
        AnonymousClass0XV r3 = r43;
        this.A0g = r3;
        this.A0j = r44;
        this.A17 = r73;
        this.A0w = r65;
        this.A0n = r57;
        this.A10 = r70;
        this.A0r = r61;
        this.A0o = r58;
        this.A0i = r45;
        this.A16 = r72;
        this.A15 = r71;
        this.A0x = r66;
        this.A1K = r76;
        this.A0h = r46;
        this.A0l = r55;
        this.A18 = new C72173dI(r4, true);
        this.A0R = r3.A03("current_screen");
        AnonymousClass08M A032 = r3.A03("query_text");
        Objects.requireNonNull(A0E2);
        A0E2.A0J(A032, AnonymousClass4L0.A0G(A0E2, 340));
        AnonymousClass08M A033 = r3.A03("search_type");
        this.A0U = A033;
        AnonymousClass08M A034 = r3.A03("search_jid");
        this.A0T = A034;
        AnonymousClass08M A035 = r3.A03("smart_filter");
        this.A0V = A035;
        this.A0S = r3.A03("remote_entity_filter");
        AnonymousClass08M A036 = r3.A03("user_grid_view_choice");
        this.A0W = A036;
        C118075sx r42 = r49.A00;
        C64333Db r1 = r42.A03;
        C56612sH A2p = C64333Db.A2p(r1);
        C56972sr A062 = C64333Db.A06(r1);
        AnonymousClass4FV A4H = C64333Db.A4H(r1);
        C64773Ex A26 = C64333Db.A26(r1);
        C107695bk r5 = r1.A00;
        C103315Mk A5c = C107695bk.A5c(r5);
        AnonymousClass5ZU A28 = C64333Db.A28(r1);
        C620733j A2t = C64333Db.A2t(r1);
        AnonymousClass08J r22 = A0E2;
        AnonymousClass08M r23 = A033;
        AnonymousClass08M r24 = A034;
        AnonymousClass08M r25 = A035;
        AnonymousClass5P7 r21 = new AnonymousClass5P7(r22, r23, r24, r25, A062, C86654Ky.A0V(r1), A26, A28, (AnonymousClass314) r1.A6v.get(), A2p, A2t, C86634Kw.A0f(r1), A4H, (AnonymousClass8JP) r1.A95.get(), (AnonymousClass65X) r42.A01.A2L.get(), (C104345Qp) r5.AAy.get(), (AnonymousClass2ML) r1.AIy.get(), A5c);
        this.A11 = r21;
        C64333Db r12 = r51.A00.A03;
        C56612sH A2p2 = C64333Db.A2p(r12);
        AnonymousClass1VX A4B = C64333Db.A4B(r12);
        AnonymousClass4FV A4H2 = C64333Db.A4H(r12);
        C107695bk r410 = r12.A00;
        C103315Mk A5c2 = C107695bk.A5c(r410);
        AnonymousClass5ZU A282 = C64333Db.A28(r12);
        C620733j A2t2 = C64333Db.A2t(r12);
        AnonymousClass5LN r212 = new AnonymousClass5LN(r22, r23, r24, r25, C86654Ky.A0V(r12), A282, (AnonymousClass314) r12.A6v.get(), A2p2, A2t2, C86634Kw.A0f(r12), A4B, A4H2, (AnonymousClass8JP) r12.A95.get(), (C104345Qp) r410.AAy.get(), (AnonymousClass2ML) r12.AIy.get(), A5c2);
        this.A12 = r212;
        C64333Db r13 = r47.A00.A03;
        AnonymousClass1VX A4B2 = C64333Db.A4B(r13);
        C56612sH A2p3 = C64333Db.A2p(r13);
        AnonymousClass4FV A4H3 = C64333Db.A4H(r13);
        C107695bk r510 = r13.A00;
        AnonymousClass5RD r213 = new AnonymousClass5RD(r22, r23, r24, r25, C64333Db.A26(r13), C64333Db.A28(r13), A2p3, C64333Db.A2t(r13), (C66533Lu) r13.AFp.get(), A4B2, A4H3, (AnonymousClass8JP) r13.A95.get(), (C104345Qp) r510.AAy.get(), C107695bk.A5c(r510));
        this.A13 = r213;
        if (AnonymousClass5ZL.A0L.A01(r15)) {
            C1896692e r11 = new C1896692e(this, 3);
            C1896692e r10 = new C1896692e(this, 4);
            C1896792f r9 = new C1896792f(this, 14);
            AnonymousClass08M r27 = r21.A04;
            AnonymousClass08M r28 = r212.A03;
            C118075sx r511 = r52.A00;
            C64333Db r6 = r511.A03;
            C56612sH A2p4 = C64333Db.A2p(r6);
            AnonymousClass1VX A4B3 = C64333Db.A4B(r6);
            AnonymousClass4FS A8y = C64333Db.A8y(r6);
            C620733j A2t3 = C64333Db.A2t(r6);
            C107695bk r610 = r6.A00;
            C103315Mk A5c3 = C107695bk.A5c(r610);
            this.A03 = new AnonymousClass5ZL(r22, r23, r24, r25, A012, r27, r28, (AnonymousClass5P2) r610.A1s.get(), (C111515iD) r610.A1k.get(), (AnonymousClass5QC) r610.AAB.get(), A2p4, A2t3, A4B3, A5c3, A8y, r511.A01.A3r, r9, r11, r10);
        }
        if (r15.A0X(1448)) {
            AnonymousClass08J r8 = r213.A02;
            AnonymousClass08J r7 = r212.A01;
            C118075sx r92 = r50.A00;
            C64333Db r611 = r92.A03;
            AnonymousClass4FV r282 = r68;
            AnonymousClass08M r222 = A033;
            AnonymousClass08M r232 = A035;
            AnonymousClass08J r242 = r8;
            AnonymousClass08J r252 = r7;
            C56612sH r26 = r41;
            this.A06 = new C102955Kx(r222, r232, r242, r252, r26, C64333Db.A4B(r611), r282, r92.A01.ACW(), (AnonymousClass8JP) r611.A95.get(), C107695bk.A5c(r611.A00));
        }
        if (this.A0y.A0N(6740) == 1) {
            C64333Db r612 = r48.A00.A03;
            C107695bk r512 = r612.A00;
            C103315Mk A5c4 = C107695bk.A5c(r512);
            C620733j A2t4 = C64333Db.A2t(r612);
            AnonymousClass08J r223 = A0E2;
            AnonymousClass08M r233 = A033;
            AnonymousClass08M r243 = A034;
            AnonymousClass08M r253 = A035;
            this.A07 = new C102845Km(r223, r233, r243, r253, C64333Db.A28(r612), C64333Db.A2p(r612), A2t4, (AnonymousClass5NT) r512.A8F.get(), C64333Db.A4H(r612), A5c4);
        }
        AnonymousClass6C0 r613 = new AnonymousClass6C0(this, 9);
        C64333Db r77 = r53.A00.A03;
        AnonymousClass08J r224 = A0E2;
        AnonymousClass08M r234 = A033;
        AnonymousClass08M r244 = A034;
        AnonymousClass08M r254 = A035;
        this.A0B = new AnonymousClass5L5(r224, r234, r244, r254, C64333Db.A2t(r77), C107695bk.A5c(r77.A00), C72343dZ.A00(r77.A4q), C72343dZ.A00(r77.A4r), r613);
        C29431io r614 = this.A0v;
        r614.A06(this.A13.A00);
        r614.A06(this.A0u);
        AnonymousClass6C6.A03(r21.A02, this.A02, this, 325);
        AnonymousClass6C6.A03(r212.A01, this.A02, this, 326);
        C102845Km r513 = this.A07;
        if (r513 != null) {
            AnonymousClass6C6.A03(r513.A00, this.A02, this, 327);
        }
        AnonymousClass5L5 r514 = this.A0B;
        if (r514 != null) {
            this.A02.A0J(r514.A04, new C100385As(r75, 26, this));
        }
        AnonymousClass5ZL r515 = this.A03;
        if (r515 != null) {
            C86604Kt.A1O(r515.A07, this.A02, this, 334);
        }
        AnonymousClass6C6.A03(r213.A05, this.A02, this, 321);
        AnonymousClass6C6.A03(r213.A02, this.A02, this, 322);
        AnonymousClass6C6.A03(r213.A03, this.A02, this, 323);
        C86604Kt.A1O(A036, this.A02, this, 335);
        C102955Kx r516 = this.A06;
        if (r516 != null) {
            AnonymousClass6C6.A03(r516.A01, this.A02, this, 324);
        }
        C86604Kt.A1O(r213.A08, A0E3, this, 336);
        C86604Kt.A1O(r213.A0A, A0E3, this, 336);
        C86604Kt.A1O(r213.A0B, A0E3, this, 336);
        C86604Kt.A1O(r21.A04, A0E3, this, 336);
        C86604Kt.A1O(r212.A03, A0E3, this, 336);
        C86604Kt.A1O(A012, A0E3, this, 337);
        C86604Kt.A1O(this.A02, A0E3, this, 339);
        C102955Kx r411 = this.A06;
        if (r411 != null) {
            C86604Kt.A1O(r411.A03, A0E3, this, 336);
        }
        A0E2.A0J(r213.A0C, new C100385As(r3, 27, this));
    }
}
