package X;

import android.view.LayoutInflater;
import android.view.ViewTreeObserver;
import com.whatsapp.stickers.stickerpack.StickerPackDownloader;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6oT  reason: invalid class name and case insensitive filesystem */
public class C137306oT extends C153137aj implements C185748uB {
    public static final String[] A0P = {"recents", "starred", "id_all", "id_love", "id_haha", "id_sad", "id_angry", "id_reaction", "id_lifestyle"};
    public int A00;
    public int A01;
    public C131676dy A02;
    public AnonymousClass4BP A03;
    public List A04 = AnonymousClass001.A0s();
    public boolean A05 = false;
    public boolean A06 = false;
    public final int A07;
    public final int A08;
    public final int A09;
    public final LayoutInflater A0A;
    public final ViewTreeObserver.OnGlobalLayoutListener A0B;
    public final C69263Wi A0C;
    public final AnonymousClass1VX A0D;
    public final C59372wo A0E;
    public final C105555Vl A0F;
    public final AnonymousClass33O A0G;
    public final C56932sn A0H;
    public final AnonymousClass4BP A0I;
    public final C162157rM A0J;
    public final AnonymousClass8J4 A0K;
    public final C137916pT A0L;
    public final C137896pR A0M;
    public final StickerPackDownloader A0N;
    public final AnonymousClass4FS A0O;

    public void Bce(String str, HashMap hashMap, HashMap hashMap2, HashSet hashSet, List list, int i) {
    }

    public static final C50612iT A00(C50612iT r2, String str, String str2, List list) {
        C47652db r1 = new C47652db();
        r1.A0N = list;
        r1.A0E = str;
        r1.A0G = str2;
        r1.A0I = r2.A0K;
        r1.A0M = AnonymousClass0x9.A18();
        r1.A0P = r2.A0P;
        r1.A0V = r2.A0T;
        r1.A0T = r2.A06;
        return new C50612iT(r1);
    }

    public static void A01(String str, String str2, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new C137826pK(i, str, str2));
    }

    public final C50612iT A06(String str) {
        C47652db r5 = new C47652db();
        r5.A0E = str;
        r5.A0G = "";
        r5.A0I = "";
        ArrayList A0s = AnonymousClass001.A0s();
        int i = 0;
        do {
            AnonymousClass39M r1 = new AnonymousClass39M();
            r1.A0D = "loading-hash";
            A0s.add(r1);
            i++;
        } while (i < 16);
        r5.A0N = A0s;
        r5.A0M = AnonymousClass0x9.A18();
        r5.A0V = false;
        r5.A0R = true;
        r5.A0T = false;
        return new C50612iT(r5);
    }

    public void A09(String str) {
        List<AnonymousClass8s6> list = this.A04;
        for (AnonymousClass8s6 r2 : list) {
            if (str.equals(r2.getId())) {
                A04(list.indexOf(r2), true);
                try {
                    ((AnonymousClass8J3) r2).A04(true);
                    return;
                } catch (Exception e) {
                    Log.e("AvatarStickerPicker/selectPageById/Error setting current displayed tab", e);
                    return;
                }
            }
        }
    }

    public void BSx(boolean z, boolean z2) {
        this.A0M.A01();
        if (this.A06 && z && !z2) {
            A09("starred");
        }
    }

    public void BZb() {
        this.A0L.A01();
    }

    public void Bch(C50612iT r2) {
        if (r2.A0S) {
            A08(r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        if (r6.A0L.A0B.A01() != 0) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07() {
        /*
            r6 = this;
            int r2 = r6.A02()
            java.lang.String r4 = "recents"
            if (r2 < 0) goto L_0x006a
            java.util.List r1 = r6.A04
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x006a
            java.lang.Object r0 = r1.get(r2)
            X.8s6 r0 = (X.AnonymousClass8s6) r0
            java.lang.String r3 = r0.getId()
            boolean r0 = r4.equals(r3)
            r5 = 1
            if (r0 == 0) goto L_0x002c
            X.6pT r0 = r6.A0L
            X.1el r0 = r0.A0B
            int r0 = r0.A01()
            r2 = 1
            if (r0 == 0) goto L_0x002d
        L_0x002c:
            r2 = 0
        L_0x002d:
            java.lang.String r1 = "starred"
            boolean r0 = r1.equals(r3)
            if (r0 == 0) goto L_0x0068
            X.6pR r0 = r6.A0M
            X.6Hh r0 = r0.A00()
            int r0 = r0.A0G()
            if (r0 != 0) goto L_0x0068
        L_0x0041:
            if (r2 == 0) goto L_0x0054
            X.6pR r0 = r6.A0M
            X.6Hh r0 = r0.A00()
            int r0 = r0.A0G()
            if (r0 == 0) goto L_0x0054
            r4 = r1
        L_0x0050:
            r6.A09(r4)
            return
        L_0x0054:
            if (r5 == 0) goto L_0x0060
            X.6pT r0 = r6.A0L
            X.1el r0 = r0.A0B
            int r0 = r0.A01()
            if (r0 != 0) goto L_0x0050
        L_0x0060:
            if (r2 != 0) goto L_0x0064
            if (r5 == 0) goto L_0x0066
        L_0x0064:
            java.lang.String r3 = "id_all"
        L_0x0066:
            r4 = r3
            goto L_0x0050
        L_0x0068:
            r5 = 0
            goto L_0x0041
        L_0x006a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AvatarStickerPicker/getDesiredPageId/pagePos out of bounds, pages.size()="
            r1.append(r0)
            java.util.List r0 = r6.A04
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = ", index="
            X.C18260x0.A0x(r0, r1, r2)
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137306oT.A07():void");
    }

    public final void A08(C50612iT r4) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("displayStickerPack(stickerpack=");
        A0o.append(r4.A0G);
        C18260x0.A1J(A0o, ")");
        this.A0O.BkP(new C71573cK(this, 23, r4));
    }

    public void BnR(String str, HashMap hashMap, HashMap hashMap2, HashSet hashSet, List list) {
        String A0X;
        if (list.size() == 0) {
            A0X = "AvatarStickerPicker/setStickerPacks Avatar sticker pack is empty";
        } else {
            Iterator A10 = C18290x4.A10(hashMap);
            while (A10.hasNext()) {
                if (((C50612iT) A10.next()).A0S) {
                    this.A05 = true;
                    for (int i = 2; i < this.A07; i++) {
                        C137906pS r1 = (C137906pS) this.A04.get(i);
                        r1.A06(A06(A0P[i]));
                        r1.A01();
                    }
                    C137916pT r6 = this.A0L;
                    r6.A05((AnonymousClass39M) null);
                    C137896pR r5 = this.A0M;
                    r5.A05((AnonymousClass39M) null);
                    List list2 = r6.A06;
                    if (list2 != null && list2.size() > 0) {
                        int size = list2.size();
                        ArrayList A0s = AnonymousClass001.A0s();
                        for (int i2 = 0; i2 < size; i2++) {
                            AnonymousClass39M r12 = new AnonymousClass39M();
                            r12.A0D = "loading-hash";
                            A0s.add(r12);
                        }
                        r6.A06(A0s);
                    }
                    List list3 = r5.A03;
                    if (list3 != null && list3.size() > 0) {
                        int size2 = list3.size();
                        ArrayList A0s2 = AnonymousClass001.A0s();
                        for (int i3 = 0; i3 < size2; i3++) {
                            AnonymousClass39M r13 = new AnonymousClass39M();
                            r13.A0D = "loading-hash";
                            A0s2.add(r13);
                        }
                        r5.A06(A0s2);
                    }
                    A07();
                    return;
                }
            }
            if (this.A05) {
                this.A05 = false;
                C137916pT r14 = this.A0L;
                List list4 = r14.A06;
                if (list4 == null ? r14.A0B.A01() != 0 : !list4.isEmpty()) {
                    r14.A06 = null;
                    r14.A01();
                }
                C137896pR r15 = this.A0M;
                List list5 = r15.A03;
                if (list5 == null ? r15.A00().A0G() != 0 : !list5.isEmpty()) {
                    r15.A03 = null;
                    r15.A01();
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C50612iT r16 = (C50612iT) it.next();
                if (r16.A0S) {
                    if (str != null) {
                        A07();
                    }
                    A08(r16);
                    return;
                }
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass000.A1H("AvatarStickerPicker/setStickerPacks got ", A0o, list);
            A0X = AnonymousClass000.A0X(" sticker packs, but no Avatar sticker pack", A0o);
        }
        Log.e(A0X);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C137306oT(android.app.Activity r29, android.view.ViewGroup r30, X.AnonymousClass0O5 r31, X.C69263Wi r32, X.C56972sr r33, X.C620733j r34, X.AnonymousClass1VX r35, X.AnonymousClass5ZD r36, X.C55862r2 r37, X.C105555Vl r38, X.C27841el r39, X.AnonymousClass33O r40, X.C56932sn r41, X.C162157rM r42, com.whatsapp.stickers.stickerpack.StickerPackDownloader r43, X.AnonymousClass4FS r44) {
        /*
            r28 = this;
            r9 = 0
            r15 = 2131427850(0x7f0b020a, float:1.8477328E38)
            r4 = r28
            r13 = r31
            r6 = r30
            r2 = r29
            r27 = r34
            r10 = r4
            r11 = r2
            r12 = r6
            r14 = r27
            r10.<init>(r11, r12, r13, r14, r15)
            java.lang.String[] r11 = A0P
            int r0 = r11.length
            r4.A07 = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r4.A04 = r0
            r4.A06 = r9
            r4.A05 = r9
            r7 = 1
            X.93W r13 = new X.93W
            r13.<init>(r4, r7)
            r4.A0I = r13
            r1 = 16
            X.92I r0 = new X.92I
            r0.<init>(r4, r1)
            r4.A0B = r0
            r20 = r35
            r0 = r20
            r4.A0D = r0
            r0 = r32
            r4.A0C = r0
            r0 = r44
            r4.A0O = r0
            r3 = r42
            r4.A0J = r3
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r2)
            r4.A0A = r10
            r14 = r41
            r4.A0H = r14
            r0 = r38
            r4.A0F = r0
            r0 = r43
            r4.A0N = r0
            r15 = r40
            r4.A0G = r15
            r1 = 2130969255(0x7f0402a7, float:1.7547187E38)
            r0 = 2131100342(0x7f0602b6, float:1.7813063E38)
            int r0 = X.AnonymousClass5Yj.A02(r2, r1, r0)
            int r0 = X.AnonymousClass0Y8.A04(r2, r0)
            r4.A08 = r0
            androidx.viewpager.widget.ViewPager r0 = r4.A0A
            android.content.res.Resources r1 = X.C18290x4.A0G(r0)
            r0 = 2131168371(0x7f070c73, float:1.7951042E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r4.A09 = r0
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131168368(0x7f070c70, float:1.7951036E38)
            int r1 = r1.getDimensionPixelSize(r0)
            X.2wo r0 = new X.2wo
            r0.<init>()
            r4.A0E = r0
            int r0 = r6.getWidth()
            r4.A01 = r0
            int r0 = r6.getHeight()
            int r0 = r0 - r1
            r4.A00 = r0
            android.content.Context r12 = r4.A05
            int r5 = r4.A09
            int r1 = r4.A08
            r8 = 0
            X.6pT r0 = new X.6pT
            r22 = r39
            r19 = r33
            r25 = r5
            r26 = r1
            r21 = r4
            r23 = r15
            r24 = r13
            r16 = r0
            r17 = r12
            r18 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4.A0L = r0
            int r5 = r4.A09
            int r1 = r4.A08
            X.6pR r0 = new X.6pR
            r16 = r0
            r19 = r20
            r20 = r15
            r21 = r14
            r22 = r13
            r23 = r5
            r24 = r1
            r25 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r4.A0M = r0
            X.8s6[] r5 = new X.AnonymousClass8s6[r9]
            X.6dy r1 = new X.6dy
            r0 = r27
            r1.<init>(r0, r5)
            r4.A02 = r1
            r4.A05(r1)
            X.8J4 r5 = new X.8J4
            r5.<init>(r6)
            r4.A0K = r5
            X.8t6 r1 = r4.A04
            if (r1 == 0) goto L_0x00f6
            r0 = 0
            r1.Bm2(r0)
        L_0x00f6:
            r4.A04 = r5
            r5.Bm2(r4)
            r0 = 2131427813(0x7f0b01e5, float:1.8477253E38)
            android.view.View r1 = X.C06560Yg.A02(r6, r0)
            r5 = 4
            X.549 r0 = new X.549
            r16 = r36
            r15 = r37
            r13 = r0
            r14 = r4
            r17 = r2
            r18 = r5
            r13.<init>(r14, r15, r16, r17, r18)
            r1.setOnClickListener(r0)
            r0 = 2131886546(0x7f1201d2, float:1.9407674E38)
            X.C18300x5.A13(r2, r1, r0)
            X.1ih r1 = r3.A0B
            X.2sh r0 = r3.A09
            r1.A06(r0)
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            r6 = 2131231453(0x7f0802dd, float:1.8078987E38)
            r0 = 2131886548(0x7f1201d4, float:1.9407678E38)
            java.lang.String r2 = r12.getString(r0)
            java.lang.String r1 = "1"
            X.6pL r0 = new X.6pL
            r0.<init>(r9, r6, r1, r2)
            r3.add(r0)
            r6 = 2131233691(0x7f080b9b, float:1.8083527E38)
            r0 = 2131886547(0x7f1201d3, float:1.9407676E38)
            java.lang.String r2 = r12.getString(r0)
            java.lang.String r1 = "2"
            X.6pL r0 = new X.6pL
            r0.<init>(r7, r6, r1, r2)
            r3.add(r0)
            r0 = 2131886549(0x7f1201d5, float:1.940768E38)
            java.lang.String r2 = r12.getString(r0)
            r1 = 2
            java.lang.String r0 = "3"
            A01(r0, r2, r3, r1)
            r0 = 2131886553(0x7f1201d9, float:1.9407688E38)
            java.lang.String r2 = r12.getString(r0)
            r1 = 3
            java.lang.String r0 = "4"
            A01(r0, r2, r3, r1)
            r0 = 2131886551(0x7f1201d7, float:1.9407684E38)
            java.lang.String r1 = r12.getString(r0)
            java.lang.String r0 = "5"
            A01(r0, r1, r3, r5)
            r0 = 2131886555(0x7f1201db, float:1.9407692E38)
            java.lang.String r2 = r12.getString(r0)
            r1 = 5
            java.lang.String r0 = "6"
            A01(r0, r2, r3, r1)
            r0 = 2131886550(0x7f1201d6, float:1.9407682E38)
            java.lang.String r2 = r12.getString(r0)
            r1 = 6
            java.lang.String r0 = "7"
            A01(r0, r2, r3, r1)
            r0 = 2131886554(0x7f1201da, float:1.940769E38)
            java.lang.String r2 = r12.getString(r0)
            r1 = 7
            java.lang.String r0 = "8"
            A01(r0, r2, r3, r1)
            X.1VX r1 = r4.A0D
            r0 = 4821(0x12d5, float:6.756E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x01b3
            r0 = 2131886552(0x7f1201d8, float:1.9407686E38)
            java.lang.String r2 = r12.getString(r0)
            r1 = 8
            java.lang.String r0 = "9"
            A01(r0, r2, r3, r1)
        L_0x01b3:
            X.8J4 r1 = r4.A0K
            java.util.ArrayList r0 = r1.A05
            r0.clear()
            r0.addAll(r3)
            X.6Hc r2 = r1.A04
            java.util.List r1 = r2.A00
            X.6HD r0 = new X.6HD
            r0.<init>(r1, r3)
            X.C18280x3.A0s(r0, r2, r3, r1)
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()
            X.6pT r0 = r4.A0L
            r10.add(r0)
            X.6pR r0 = r4.A0M
            r10.add(r0)
            r13 = 2
        L_0x01d8:
            int r0 = r4.A07
            if (r13 >= r0) goto L_0x020e
            r0 = r11[r13]
            X.1VX r9 = r4.A0D
            android.view.LayoutInflater r7 = r4.A0A
            X.2sn r6 = r4.A0H
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r5 = r4.A0N
            X.33O r3 = r4.A0G
            X.4BP r2 = r4.A0I
            int r1 = r4.A09
            X.2iT r19 = r4.A06(r0)
            int r0 = r4.A08
            X.6pS r14 = new X.6pS
            r15 = r12
            r16 = r7
            r17 = r9
            r18 = r3
            r20 = r6
            r21 = r2
            r22 = r5
            r23 = r1
            r24 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r10.add(r14)
            int r13 = r13 + 1
            goto L_0x01d8
        L_0x020e:
            r4.A04 = r10
            int r0 = r10.size()
            X.8s6[] r0 = new X.AnonymousClass8s6[r0]
            java.lang.Object[] r2 = r10.toArray(r0)
            X.8s6[] r2 = (X.AnonymousClass8s6[]) r2
            X.6dy r0 = r4.A02
            if (r0 != 0) goto L_0x022d
            X.33j r1 = r4.A0B
            X.6dy r0 = new X.6dy
            r0.<init>(r1, r2)
            r4.A02 = r0
            r4.A05(r0)
            return
        L_0x022d:
            X.C162457s7.A0J(r2, r8)
            r0.A0M(r2)
            r0.A05()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137306oT.<init>(android.app.Activity, android.view.ViewGroup, X.0O5, X.3Wi, X.2sr, X.33j, X.1VX, X.5ZD, X.2r2, X.5Vl, X.1el, X.33O, X.2sn, X.7rM, com.whatsapp.stickers.stickerpack.StickerPackDownloader, X.4FS):void");
    }
}
