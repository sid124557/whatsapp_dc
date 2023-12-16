package X;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.stickers.stickerpack.StickerPackDownloader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6oS  reason: invalid class name and case insensitive filesystem */
public class C137296oS extends C153137aj implements C185748uB {
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public View A04;
    public C131676dy A05;
    public C115975pX A06;
    public AnonymousClass4BP A07;
    public C137876pP A08;
    public C137886pQ A09;
    public C137886pQ A0A;
    public C137886pQ A0B;
    public C137886pQ A0C;
    public C137916pT A0D;
    public C137896pR A0E;
    public AnonymousClass8J3 A0F;
    public String A0G;
    public HashMap A0H;
    public List A0I;
    public List A0J;
    public boolean A0K = false;
    public boolean A0L = false;
    public final int A0M;
    public final int A0N;
    public final LayoutInflater A0O;
    public final ViewTreeObserver.OnGlobalLayoutListener A0P = new AnonymousClass92I(this, 15);
    public final C55682qk A0Q;
    public final C56972sr A0R;
    public final AnonymousClass33p A0S;
    public final AnonymousClass1VX A0T;
    public final AnonymousClass4FV A0U;
    public final C45112Ys A0V;
    public final AnonymousClass33O A0W;
    public final C29361ih A0X;
    public final C59212wX A0Y;
    public final C56932sn A0Z;
    public final AnonymousClass4BP A0a = new AnonymousClass93W(this, 0);
    public final C49252gE A0b;
    public final AnonymousClass10k A0c;
    public final AnonymousClass8J5 A0d;
    public final C162157rM A0e;
    public final StickerPackDownloader A0f;
    public final C183538qC A0g;

    public static C137886pQ A00(C137296oS r8, int i) {
        return new C137886pQ(r8.A05, r8.A0O, r8.A0T, r8.A0W, r8.A0a, i, r8.A0N, r8.A0M);
    }

    public void A06() {
        if (this.A04.getVisibility() == 0) {
            AnonymousClass33p r8 = this.A0S;
            long A0B2 = AnonymousClass0x2.A0B(AnonymousClass0x2.A0F(r8), "sticker_store_update_hidden_time");
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - A0B2 >= 604800000) {
                C18270x1.A0i(C18270x1.A03(r8), "sticker_store_update_hidden_time", currentTimeMillis);
            }
        }
        for (C56872sh A022 : this.A0X.A05()) {
            A022.A02();
        }
        Context context = this.A05;
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.stickers.store.StickerStoreActivity");
        context.startActivity(intent);
        this.A0U.BhD(new C23981Vq());
    }

    public final void A07() {
        AnonymousClass8J3[] r2 = (AnonymousClass8J3[]) this.A0J.toArray(new AnonymousClass8J3[0]);
        this.A0d.A00(r2);
        C131676dy r1 = this.A05;
        if (r1 != null) {
            C162457s7.A0J(r2, 0);
            r1.A0M(r2);
            r1.A05();
            this.A05.A05();
        }
    }

    public void A08(String str) {
        this.A0G = str;
        AnonymousClass8J3 A012 = A01(str, this.A0J);
        if (A012 != null) {
            A04(this.A0J.indexOf(A012), true);
            this.A0G = null;
        }
    }

    public final boolean A09() {
        AnonymousClass10k r0;
        C49252gE r02 = this.A0b;
        if (!(r02 == null || !r02.A01() || (r0 = this.A0c) == null)) {
            AnonymousClass08M r1 = r0.A03;
            if (r1.A07() == null || ((List) r1.A07()).isEmpty()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void BSx(boolean z, boolean z2) {
        C137896pR r0 = this.A0E;
        if (r0 != null) {
            r0.A01();
            if (this.A0L && z && !z2) {
                A08("starred");
            }
        }
    }

    public void BZb() {
        C137916pT r0 = this.A0D;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void Bce(String str, HashMap hashMap, HashMap hashMap2, HashSet hashSet, List list, int i) {
        if (!this.A0H.containsKey(str)) {
            BnR((String) null, hashMap, hashMap2, hashSet, list);
            return;
        }
        C137906pS r0 = (C137906pS) this.A0H.get(str);
        r0.A00 = i;
        r0.A05();
    }

    public void Bch(C50612iT r3) {
        C137906pS r0 = (C137906pS) this.A0H.get(r3.A0G);
        if (r0 != null) {
            r0.A06(r3);
            r0.A01();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: type inference failed for: r8v12 */
    /* JADX WARNING: type inference failed for: r8v13 */
    /* JADX WARNING: type inference failed for: r18v6, types: [X.6pS] */
    /* JADX WARNING: type inference failed for: r18v7, types: [X.6pO] */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0426, code lost:
        if (r7 == false) goto L_0x0428;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x04a6, code lost:
        if (r32 != null) goto L_0x04a8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x045e A[LOOP:10: B:166:0x0458->B:168:0x045e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x04bc  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x04ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BnR(java.lang.String r32, java.util.HashMap r33, java.util.HashMap r34, java.util.HashSet r35, java.util.List r36) {
        /*
            r31 = this;
            r13 = r31
            java.util.List r0 = r13.A0I
            boolean r17 = X.AnonymousClass000.A1W(r0)
            r29 = r36
            r0 = r29
            r13.A0I = r0
            java.util.Iterator r2 = r29.iterator()
        L_0x0012:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x009d
            java.lang.Object r1 = r2.next()
            X.2iT r1 = (X.C50612iT) r1
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x0012
            boolean r0 = r1.A0S
            if (r0 != 0) goto L_0x0012
            r0 = 1
        L_0x0029:
            r5 = 8
            if (r0 == 0) goto L_0x009a
            X.33p r0 = r13.A0S
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "sticker_store_update_hidden_time"
            long r0 = X.AnonymousClass0x2.A0B(r1, r0)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r1 = X.AnonymousClass001.A1U(r0)
            android.view.View r0 = r13.A04
            if (r1 == 0) goto L_0x004c
            r5 = 0
        L_0x004c:
            r0.setVisibility(r5)
            int r15 = r29.size()
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r4 = r29.iterator()
        L_0x006b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x009f
            java.lang.Object r1 = r4.next()
            X.2iT r1 = (X.C50612iT) r1
            boolean r0 = r1.A0S
            if (r0 != 0) goto L_0x006b
            java.util.List r0 = r1.A05
            java.util.Iterator r2 = r0.iterator()
        L_0x0081:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x006b
            X.39M r1 = X.AnonymousClass0x7.A0b(r2)
            X.330 r0 = r1.A04
            if (r0 == 0) goto L_0x0081
            X.5Zv[] r0 = r0.A0B
            if (r0 == 0) goto L_0x0081
            int r0 = r0.length
            if (r0 <= 0) goto L_0x0081
            r3.add(r1)
            goto L_0x0081
        L_0x009a:
            android.view.View r0 = r13.A04
            goto L_0x004c
        L_0x009d:
            r0 = 0
            goto L_0x0029
        L_0x009f:
            int r0 = r3.size()
            r16 = 1
            if (r0 <= 0) goto L_0x0103
            r16 = 0
            java.util.Iterator r14 = r3.iterator()
        L_0x00ad:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00f5
            X.39M r4 = X.AnonymousClass0x7.A0b(r14)
            X.2wX r12 = r13.A0Y
            X.330 r0 = r4.A04
            r7 = 0
            if (r0 == 0) goto L_0x00ad
            X.5Zv[] r6 = r0.A0B
            if (r6 == 0) goto L_0x00ad
            int r5 = r6.length
            r3 = 0
        L_0x00c4:
            if (r7 >= r5) goto L_0x00d8
            r2 = r6[r7]
            java.util.HashMap r1 = r12.A00
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x00d5
            int r0 = X.AnonymousClass6C8.A0D(r2, r1)
            r3 = r3 | r0
        L_0x00d5:
            int r7 = r7 + 1
            goto L_0x00c4
        L_0x00d8:
            r0 = r3 & 1
            if (r0 == 0) goto L_0x00df
            r11.add(r4)
        L_0x00df:
            r0 = r3 & 8
            if (r0 == 0) goto L_0x00e6
            r10.add(r4)
        L_0x00e6:
            r0 = r3 & 4
            if (r0 == 0) goto L_0x00ed
            r8.add(r4)
        L_0x00ed:
            r0 = r3 & 2
            if (r0 == 0) goto L_0x00ad
            r9.add(r4)
            goto L_0x00ad
        L_0x00f5:
            r0 = 54
            X.C86614Ku.A1U(r11, r0)
            X.C86614Ku.A1U(r10, r0)
            X.C86614Ku.A1U(r8, r0)
            X.C86614Ku.A1U(r9, r0)
        L_0x0103:
            java.util.ArrayList r12 = X.AnonymousClass002.A0I(r15)
            boolean r0 = r13.A09()
            if (r0 == 0) goto L_0x0146
            X.6pP r7 = r13.A08
            if (r7 != 0) goto L_0x013a
            X.1VX r14 = r13.A0T
            android.content.Context r6 = r13.A05
            android.view.LayoutInflater r5 = r13.A0O
            X.33O r4 = r13.A0W
            X.4BP r3 = r13.A0a
            X.10k r2 = r13.A0c
            int r1 = r13.A0N
            int r0 = r13.A0M
            X.6pP r7 = new X.6pP
            r18 = r7
            r19 = r6
            r20 = r5
            r21 = r14
            r22 = r4
            r23 = r3
            r24 = r2
            r25 = r1
            r26 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r13.A08 = r7
        L_0x013a:
            androidx.recyclerview.widget.RecyclerView r0 = r7.A04
            if (r0 == 0) goto L_0x0141
            r7.A01()
        L_0x0141:
            X.6pP r0 = r13.A08
            r12.add(r0)
        L_0x0146:
            X.6pT r14 = r13.A0D
            if (r14 != 0) goto L_0x017f
            X.1VX r15 = r13.A0T
            android.content.Context r7 = r13.A05
            X.2sr r6 = r13.A0R
            android.view.LayoutInflater r5 = r13.A0O
            X.8qC r0 = r13.A0g
            java.lang.Object r4 = r0.get()
            X.1el r4 = (X.C27841el) r4
            X.33O r3 = r13.A0W
            X.4BP r2 = r13.A0a
            int r1 = r13.A0N
            int r0 = r13.A0M
            X.6pT r14 = new X.6pT
            r18 = r14
            r19 = r7
            r20 = r5
            r21 = r6
            r22 = r15
            r23 = r13
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r28 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r13.A0D = r14
        L_0x017f:
            int r0 = r29.size()
            boolean r0 = X.AnonymousClass001.A1W(r0)
            r14.A07 = r0
            X.6pT r0 = r13.A0D
            r12.add(r0)
            X.6pR r7 = r13.A0E
            if (r7 != 0) goto L_0x01bd
            X.1VX r14 = r13.A0T
            android.content.Context r6 = r13.A05
            X.2sn r5 = r13.A0Z
            android.view.LayoutInflater r4 = r13.A0O
            X.33O r3 = r13.A0W
            X.4BP r2 = r13.A0a
            int r1 = r13.A0N
            r27 = 0
            int r0 = r13.A0M
            X.6pR r7 = new X.6pR
            r18 = r7
            r19 = r6
            r20 = r4
            r21 = r14
            r22 = r3
            r23 = r5
            r24 = r2
            r25 = r1
            r26 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r13.A0E = r7
        L_0x01bd:
            r12.add(r7)
            if (r16 != 0) goto L_0x0227
            X.6pQ r0 = r13.A09
            if (r0 != 0) goto L_0x01cd
            r0 = 1
            X.6pQ r0 = A00(r13, r0)
            r13.A09 = r0
        L_0x01cd:
            r0.A01 = r11
            X.6Hh r0 = r0.A00()
            r0.A0K(r11)
            X.6pQ r0 = r13.A09
            r12.add(r0)
            X.6pQ r0 = r13.A0A
            if (r0 != 0) goto L_0x01e6
            r0 = 2
            X.6pQ r0 = A00(r13, r0)
            r13.A0A = r0
        L_0x01e6:
            r0.A01 = r9
            X.6Hh r0 = r0.A00()
            r0.A0K(r9)
            X.6pQ r0 = r13.A0A
            r12.add(r0)
            X.6pQ r0 = r13.A0B
            if (r0 != 0) goto L_0x01ff
            r0 = 4
            X.6pQ r0 = A00(r13, r0)
            r13.A0B = r0
        L_0x01ff:
            r0.A01 = r8
            X.6Hh r0 = r0.A00()
            r0.A0K(r8)
            X.6pQ r0 = r13.A0B
            r12.add(r0)
            X.6pQ r0 = r13.A0C
            if (r0 != 0) goto L_0x0219
            r0 = 8
            X.6pQ r0 = A00(r13, r0)
            r13.A0C = r0
        L_0x0219:
            r0.A01 = r10
            X.6Hh r0 = r0.A00()
            r0.A0K(r10)
            X.6pQ r0 = r13.A0C
            r12.add(r0)
        L_0x0227:
            int r0 = r29.size()
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>(r0)
            java.util.Iterator r1 = r29.iterator()
        L_0x0234:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0246
            java.lang.Object r0 = r1.next()
            X.2iT r0 = (X.C50612iT) r0
            java.lang.String r0 = r0.A0G
            r14.add(r0)
            goto L_0x0234
        L_0x0246:
            java.util.HashMap r11 = X.AnonymousClass001.A0t()
            r10 = 0
        L_0x024b:
            int r0 = r29.size()
            if (r10 >= r0) goto L_0x02f3
            r0 = r29
            java.lang.Object r9 = r0.get(r10)
            X.2iT r9 = (X.C50612iT) r9
            java.util.HashMap r1 = r13.A0H
            java.lang.String r0 = r9.A0G
            java.lang.Object r8 = r1.get(r0)
            X.6pS r8 = (X.C137906pS) r8
            boolean r0 = r9.A0S
            if (r0 != 0) goto L_0x02ab
            r7 = r35
            if (r8 != 0) goto L_0x02dc
            boolean r0 = r9.A0T
            if (r0 == 0) goto L_0x02ae
            X.1VX r0 = r13.A0T
            r16 = r0
            android.content.Context r15 = r13.A05
            android.view.LayoutInflater r6 = r13.A0O
            X.2sn r5 = r13.A0Z
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r4 = r13.A0f
            X.33O r3 = r13.A0W
            X.4BP r2 = r13.A0a
            int r1 = r13.A0N
            int r0 = r13.A0M
            X.6pO r8 = new X.6pO
            r27 = r1
            r28 = r0
            r26 = r4
            r18 = r8
            r19 = r15
            r20 = r6
            r21 = r16
            r22 = r3
            r23 = r9
            r24 = r5
            r25 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.String r0 = r9.A0G
            boolean r0 = r7.contains(r0)
            r8.A02 = r0
        L_0x02a6:
            java.lang.String r0 = r9.A0G
            r11.put(r0, r8)
        L_0x02ab:
            int r10 = r10 + 1
            goto L_0x024b
        L_0x02ae:
            X.1VX r15 = r13.A0T
            android.content.Context r7 = r13.A05
            android.view.LayoutInflater r6 = r13.A0O
            X.2sn r5 = r13.A0Z
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r4 = r13.A0f
            X.33O r3 = r13.A0W
            X.4BP r2 = r13.A0a
            int r1 = r13.A0N
            int r0 = r13.A0M
            X.6pS r8 = new X.6pS
            r27 = r1
            r28 = r0
            r26 = r4
            r18 = r8
            r19 = r7
            r20 = r6
            r21 = r15
            r22 = r3
            r23 = r9
            r24 = r5
            r25 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x02a6
        L_0x02dc:
            r8.A06(r9)
            boolean r0 = r9.A0T
            if (r0 == 0) goto L_0x02a6
            boolean r0 = r8 instanceof X.C137866pO
            if (r0 == 0) goto L_0x02a6
            r1 = r8
            X.6pO r1 = (X.C137866pO) r1
            java.lang.String r0 = r9.A0G
            boolean r0 = r7.contains(r0)
            r1.A02 = r0
            goto L_0x02a6
        L_0x02f3:
            r30 = r34
            java.util.Iterator r16 = X.C18290x4.A11(r30)
        L_0x02f9:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x037c
            java.lang.String r10 = X.AnonymousClass001.A0m(r16)
            r0 = r33
            java.lang.Object r9 = r0.get(r10)
            X.2iT r9 = (X.C50612iT) r9
            if (r9 != 0) goto L_0x0330
            X.2db r1 = new X.2db
            r1.<init>()
            r1.A0E = r10
            java.lang.String r0 = ""
            r1.A0G = r0
            r1.A0I = r0
            java.util.LinkedList r0 = X.AnonymousClass0x9.A18()
            r1.A0N = r0
            java.util.LinkedList r0 = X.AnonymousClass0x9.A18()
            r1.A0M = r0
            r0 = 1
            r1.A0V = r0
            r1.A0T = r0
            X.2iT r9 = new X.2iT
            r9.<init>(r1)
        L_0x0330:
            boolean r0 = r11.containsKey(r10)
            if (r0 == 0) goto L_0x034b
            java.lang.Object r8 = r11.get(r10)
            X.6pS r8 = (X.C137906pS) r8
            r8.A06(r9)
        L_0x033f:
            r0 = r30
            int r0 = X.AnonymousClass6C8.A0D(r10, r0)
            r8.A00 = r0
            r8.A05()
            goto L_0x02f9
        L_0x034b:
            X.1VX r15 = r13.A0T
            android.content.Context r7 = r13.A05
            android.view.LayoutInflater r6 = r13.A0O
            X.2sn r5 = r13.A0Z
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r4 = r13.A0f
            X.33O r3 = r13.A0W
            X.4BP r2 = r13.A0a
            int r1 = r13.A0N
            int r0 = r13.A0M
            X.6pS r8 = new X.6pS
            r26 = r4
            r27 = r1
            r28 = r0
            r24 = r5
            r25 = r2
            r18 = r8
            r19 = r7
            r20 = r6
            r21 = r15
            r22 = r3
            r23 = r9
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r11.put(r10, r8)
            goto L_0x033f
        L_0x037c:
            java.util.Iterator r2 = X.C18290x4.A11(r30)
        L_0x0380:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0398
            java.lang.Object r1 = r2.next()
            boolean r0 = r14.contains(r1)
            if (r0 != 0) goto L_0x0380
            java.lang.Object r0 = r11.get(r1)
            r12.add(r0)
            goto L_0x0380
        L_0x0398:
            java.util.Iterator r3 = r29.iterator()
        L_0x039c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03bd
            java.lang.Object r2 = r3.next()
            X.2iT r2 = (X.C50612iT) r2
            java.lang.String r0 = r2.A0G
            java.lang.Object r1 = r11.get(r0)
            X.8J3 r1 = (X.AnonymousClass8J3) r1
            if (r1 == 0) goto L_0x039c
            boolean r0 = r2.A0S
            if (r0 != 0) goto L_0x039c
            r1.A01()
            r12.add(r1)
            goto L_0x039c
        L_0x03bd:
            r13.A0H = r11
            int r1 = r13.A02()
            if (r1 >= 0) goto L_0x04af
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()
            java.util.List r0 = r13.A0J
            int r0 = r0.size()
            boolean r5 = X.C18300x5.A1Y(r1, r0)
            java.lang.String r0 = "StickerPicker/setStickerPacks/getCurrentPageIndex < 0, stickerPages.size(): %d"
            X.C18320x8.A1J(r0, r2, r1)
            r1 = 0
        L_0x03db:
            java.lang.String r9 = r13.A0G
            r4 = 0
            if (r9 != 0) goto L_0x0437
            java.util.List r0 = r13.A0J
            int r0 = r0.size()
            if (r0 > 0) goto L_0x03ea
            if (r32 != 0) goto L_0x04a8
        L_0x03ea:
            java.util.List r0 = r13.A0J
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x047e
            java.util.List r0 = r13.A0J
            java.lang.Object r0 = r0.get(r1)
        L_0x03f8:
            X.8J3 r0 = (X.AnonymousClass8J3) r0
            java.lang.String r3 = r0.getId()
            X.6pT r0 = r13.A0D
            r8 = 1
            if (r0 == 0) goto L_0x0479
            X.1el r0 = r0.A0B
            int r0 = r0.A01()
        L_0x0409:
            boolean r7 = X.AnonymousClass000.A1T(r0)
            X.6pR r0 = r13.A0E
            if (r0 == 0) goto L_0x0474
            X.6Hh r0 = r0.A00()
            int r0 = r0.A0G()
        L_0x0419:
            boolean r6 = X.AnonymousClass000.A1T(r0)
            java.lang.String r2 = "recents"
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x0428
            r1 = 1
            if (r7 != 0) goto L_0x0429
        L_0x0428:
            r1 = 0
        L_0x0429:
            java.lang.String r9 = "starred"
            boolean r0 = r9.equals(r3)
            if (r0 == 0) goto L_0x0472
            if (r6 == 0) goto L_0x0472
        L_0x0433:
            if (r1 == 0) goto L_0x046c
            if (r6 != 0) goto L_0x046c
        L_0x0437:
            X.8J3 r0 = A01(r9, r12)
            if (r0 == 0) goto L_0x04ad
            int r6 = r12.indexOf(r0)
            r13.A0G = r4
        L_0x0443:
            r13.A0J = r12
            X.8J3[] r0 = new X.AnonymousClass8J3[r5]
            java.lang.Object[] r4 = r12.toArray(r0)
            X.8J3[] r4 = (X.AnonymousClass8J3[]) r4
            X.8J5 r0 = r13.A0d
            r0.A00(r4)
            java.util.List r0 = r13.A0J
            java.util.Iterator r3 = r0.iterator()
        L_0x0458:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x04b2
            java.lang.Object r2 = r3.next()
            X.8J3 r2 = (X.AnonymousClass8J3) r2
            int r1 = r13.A01
            int r0 = r13.A00
            r2.A02(r1, r0)
            goto L_0x0458
        L_0x046c:
            if (r8 == 0) goto L_0x0484
            if (r7 != 0) goto L_0x0484
            r9 = r2
            goto L_0x0437
        L_0x0472:
            r8 = 0
            goto L_0x0433
        L_0x0474:
            X.7rM r0 = r13.A0e
            boolean r0 = r0.A06
            goto L_0x0419
        L_0x0479:
            X.7rM r0 = r13.A0e
            boolean r0 = r0.A05
            goto L_0x0409
        L_0x047e:
            java.lang.Object r0 = r12.get(r5)
            goto L_0x03f8
        L_0x0484:
            if (r1 != 0) goto L_0x0488
            if (r8 == 0) goto L_0x04ab
        L_0x0488:
            int r0 = r29.size()
            if (r0 <= 0) goto L_0x04ab
            java.util.Iterator r2 = r29.iterator()
        L_0x0492:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x04ab
            java.lang.Object r1 = r2.next()
            X.2iT r1 = (X.C50612iT) r1
            boolean r0 = r1.A0S
            if (r0 != 0) goto L_0x0492
            java.lang.String r9 = r1.A0G
        L_0x04a4:
            if (r9 != 0) goto L_0x0437
            if (r32 == 0) goto L_0x04ad
        L_0x04a8:
            r9 = r32
            goto L_0x0437
        L_0x04ab:
            r9 = r3
            goto L_0x04a4
        L_0x04ad:
            r6 = 0
            goto L_0x0443
        L_0x04af:
            r5 = 0
            goto L_0x03db
        L_0x04b2:
            r1 = r4[r6]
            r0 = 1
            r1.A04(r0)
            X.6dy r0 = r13.A05
            if (r0 != 0) goto L_0x04ce
            X.33j r1 = r13.A0B
            X.6dy r0 = new X.6dy
            r0.<init>(r1, r4)
            r13.A05 = r0
            r13.A05(r0)
        L_0x04c8:
            r0 = r17
            r13.A04(r6, r0)
            return
        L_0x04ce:
            r0.A0M(r4)
            r0.A05()
            goto L_0x04c8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137296oS.BnR(java.lang.String, java.util.HashMap, java.util.HashMap, java.util.HashSet, java.util.List):void");
    }

    public static final AnonymousClass8J3 A01(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass8J3 r1 = (AnonymousClass8J3) it.next();
            if (str.equals(r1.getId())) {
                return r1;
            }
        }
        return null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C137296oS(android.app.Activity r17, android.view.ViewGroup r18, X.AnonymousClass0O5 r19, X.C55682qk r20, X.C56972sr r21, X.AnonymousClass33p r22, X.C620733j r23, X.AnonymousClass1VX r24, X.AnonymousClass4FV r25, X.C115975pX r26, X.C45112Ys r27, X.AnonymousClass33O r28, X.C29361ih r29, X.C56932sn r30, X.C49252gE r31, X.AnonymousClass10k r32, X.C162157rM r33, com.whatsapp.stickers.stickerpack.StickerPackDownloader r34, X.AnonymousClass4FS r35, X.C183538qC r36, boolean r37) {
        /*
            r16 = this;
            r3 = r33
            r11 = r17
            r1 = 0
            r15 = 2131433975(0x7f0b19f7, float:1.848975E38)
            r10 = r16
            r14 = r23
            r13 = r19
            r12 = r18
            r10.<init>(r11, r12, r13, r14, r15)
            r10.A0L = r1
            r10.A0K = r1
            X.93W r0 = new X.93W
            r0.<init>(r10, r1)
            r10.A0a = r0
            r2 = 15
            X.92I r0 = new X.92I
            r0.<init>(r10, r2)
            r10.A0P = r0
            r0 = r24
            r10.A0T = r0
            r0 = r20
            r10.A0Q = r0
            r0 = r21
            r10.A0R = r0
            r0 = r25
            r10.A0U = r0
            r5 = r29
            r10.A0X = r5
            r6 = r30
            r10.A0Z = r6
            r4 = r22
            r10.A0S = r4
            r0 = r34
            r10.A0f = r0
            r0 = r27
            r10.A0V = r0
            r0 = r28
            r10.A0W = r0
            r0 = r26
            r10.A06 = r0
            r9 = r36
            r10.A0g = r9
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r11)
            r10.A0O = r0
            r0 = r37
            r10.A0K = r0
            r2 = 2130969255(0x7f0402a7, float:1.7547187E38)
            r0 = 2131100342(0x7f0602b6, float:1.7813063E38)
            int r0 = X.AnonymousClass5Yj.A02(r11, r2, r0)
            int r0 = X.AnonymousClass0Y8.A04(r11, r0)
            r10.A0M = r0
            androidx.viewpager.widget.ViewPager r0 = r10.A0A
            android.content.res.Resources r2 = X.C18290x4.A0G(r0)
            r0 = 2131168371(0x7f070c73, float:1.7951042E38)
            int r0 = r2.getDimensionPixelSize(r0)
            r10.A0N = r0
            X.2wX r0 = new X.2wX
            r0.<init>()
            r10.A0Y = r0
            r7 = r31
            r10.A0b = r7
            if (r33 != 0) goto L_0x0094
            X.7rM r3 = new X.7rM
            r8 = r35
            r3.<init>(r4, r5, r6, r7, r8, r9)
        L_0x0094:
            r10.A0e = r3
            r4 = r32
            r10.A0c = r4
            X.2sr r0 = r10.A0R
            boolean r0 = r0.A0Y()
            if (r0 != 0) goto L_0x0132
            X.1VX r2 = r10.A0T
            r0 = 1396(0x574, float:1.956E-42)
            boolean r0 = r2.A0X(r0)
            if (r0 == 0) goto L_0x0132
            r0 = 2131434044(0x7f0b1a3c, float:1.848989E38)
            android.view.View r2 = r12.findViewById(r0)
            r0 = 8
            r2.setVisibility(r0)
            r0 = 2131434043(0x7f0b1a3b, float:1.8489889E38)
            android.view.View r0 = r12.findViewById(r0)
            r0.setVisibility(r1)
            r0 = 2131434042(0x7f0b1a3a, float:1.8489887E38)
            android.view.View r0 = r12.findViewById(r0)
            r10.A03 = r0
            r0 = 2131434041(0x7f0b1a39, float:1.8489885E38)
        L_0x00ce:
            android.view.View r0 = r12.findViewById(r0)
            r10.A04 = r0
            android.content.res.Resources r2 = r11.getResources()
            r0 = 2131168368(0x7f070c70, float:1.7951036E38)
            int r2 = r2.getDimensionPixelSize(r0)
            int r0 = r12.getWidth()
            r10.A01 = r0
            int r0 = r12.getHeight()
            int r0 = r0 - r2
            r10.A00 = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r10.A0J = r0
            java.util.HashMap r0 = X.AnonymousClass001.A0t()
            r10.A0H = r0
            X.8J3[] r1 = new X.AnonymousClass8J3[r1]
            X.6dy r0 = new X.6dy
            r0.<init>(r14, r1)
            r10.A05 = r0
            r10.A05(r0)
            android.content.Context r0 = r10.A05
            X.8J5 r3 = new X.8J5
            r3.<init>(r0, r12, r14)
            r10.A0d = r3
            if (r32 == 0) goto L_0x0118
            X.08M r1 = r4.A03
            X.0sA r11 = (X.C15910sA) r11
            r0 = 352(0x160, float:4.93E-43)
            X.C86604Kt.A1N(r11, r1, r10, r0)
        L_0x0118:
            android.view.View r2 = r10.A03
            r1 = 31
            X.53y r0 = new X.53y
            r0.<init>(r10, r1)
            r2.setOnClickListener(r0)
            X.8t6 r1 = r10.A04
            if (r1 == 0) goto L_0x012c
            r0 = 0
            r1.Bm2(r0)
        L_0x012c:
            r10.A04 = r3
            r3.Bm2(r10)
            return
        L_0x0132:
            r0 = 2131434043(0x7f0b1a3b, float:1.8489889E38)
            android.view.View r2 = r12.findViewById(r0)
            r0 = 8
            r2.setVisibility(r0)
            r0 = 2131434044(0x7f0b1a3c, float:1.848989E38)
            android.view.View r0 = r12.findViewById(r0)
            r0.setVisibility(r1)
            r0 = 2131433990(0x7f0b1a06, float:1.8489781E38)
            android.view.View r0 = r12.findViewById(r0)
            r10.A03 = r0
            r0 = 2131433989(0x7f0b1a05, float:1.848978E38)
            goto L_0x00ce
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137296oS.<init>(android.app.Activity, android.view.ViewGroup, X.0O5, X.2qk, X.2sr, X.33p, X.33j, X.1VX, X.4FV, X.5pX, X.2Ys, X.33O, X.1ih, X.2sn, X.2gE, X.10k, X.7rM, com.whatsapp.stickers.stickerpack.StickerPackDownloader, X.4FS, X.8qC, boolean):void");
    }
}
