package com.whatsapp.stickers.stickerpack;

import X.AnonymousClass1VX;
import X.AnonymousClass2MF;
import X.AnonymousClass2P2;
import X.AnonymousClass2TT;
import X.AnonymousClass4BN;
import X.AnonymousClass4FS;
import X.AnonymousClass5ZM;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C186568vZ;
import X.C29361ih;
import X.C33111sS;
import X.C34011u5;
import X.C39762Df;
import X.C45552aC;
import X.C46802cE;
import X.C48282ee;
import X.C50612iT;
import X.C51092jG;
import X.C53062mU;
import X.C54132oE;
import X.C54972pa;
import X.C55862r2;
import X.C56352rq;
import X.C56872sh;
import X.C59762xR;
import X.C61102zi;
import X.C64333Db;
import X.C73853gB;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;

public final class StickerPackDownloader {
    public final C39762Df A00;
    public final C56352rq A01;
    public final AnonymousClass1VX A02;
    public final C59762xR A03;
    public final C186568vZ A04;
    public final C29361ih A05;
    public final AnonymousClass2MF A06;
    public final C54132oE A07;
    public final C53062mU A08;
    public final AnonymousClass2P2 A09;
    public final AnonymousClass2TT A0A;
    public final C48282ee A0B;
    public final C45552aC A0C;
    public final C46802cE A0D;
    public final C33111sS A0E;
    public final C54972pa A0F;
    public final C51092jG A0G;
    public final AnonymousClass4FS A0H;
    public final C73853gB A0I;

    public final void A01(C50612iT r20, AnonymousClass4BN r21, Integer num, Integer num2, int i, boolean z) {
        Log.d("StickerPackDownloader/downloadStickersOfAStickerPackAsync/begin");
        C50612iT r11 = r20;
        String str = r11.A0G;
        C162457s7.A0D(str);
        AnonymousClass2MF r5 = this.A06;
        Map map = r5.A01;
        if (map.containsKey(str)) {
            Log.e("StickerPackDownloader/downloadStickersOfAStickerPackAsync attempting to download same pack twice");
            return;
        }
        C64333Db r6 = this.A00.A00.A01;
        AnonymousClass2MF r13 = (AnonymousClass2MF) r6.AX4.get();
        C34011u5 r62 = new C34011u5(C64333Db.A4B(r6), C64333Db.A4H(r6), (C55862r2) r6.A1T.get(), (C29361ih) r6.AX3.get(), r11, r21, r13, (StickerPackDownloader) r6.AX5.get(), num, num2, i, z);
        C18280x3.A1D(str, map, 0);
        r5.A00.put(str, r62);
        Iterator A032 = C61102zi.A03(this.A05);
        while (A032.hasNext()) {
            ((C56872sh) A032.next()).A09(r11);
        }
        this.A0H.BkL(r62, r20);
    }

    public final void A03(String str) {
        C162457s7.A0J(str, 0);
        AnonymousClass2MF r1 = this.A06;
        if (r1.A01.containsKey(str)) {
            C18290x4.A1L((AnonymousClass5ZM) r1.A00.get(str));
        }
    }

    public StickerPackDownloader(C39762Df r17, C56352rq r18, AnonymousClass1VX r19, C59762xR r20, C186568vZ r21, C29361ih r22, AnonymousClass2MF r23, C54132oE r24, C53062mU r25, AnonymousClass2P2 r26, AnonymousClass2TT r27, C48282ee r28, C45552aC r29, C46802cE r30, C33111sS r31, C54972pa r32, C51092jG r33, AnonymousClass4FS r34, C73853gB r35) {
        C54972pa r3 = r32;
        AnonymousClass4FS r1 = r34;
        C45552aC r5 = r29;
        C29361ih r11 = r22;
        AnonymousClass1VX r13 = r19;
        C18260x0.A0f(r13, r1, r11, r3, r5);
        C48282ee r6 = r28;
        AnonymousClass2TT r7 = r27;
        C186568vZ r12 = r21;
        C18260x0.A0W(r6, r7, r12);
        C51092jG r2 = r33;
        C162457s7.A0J(r2, 9);
        AnonymousClass2MF r10 = r23;
        C54132oE r9 = r24;
        C18270x1.A13(r9, r10);
        C56352rq r14 = r18;
        C162457s7.A0J(r14, 14);
        C46802cE r4 = r30;
        C162457s7.A0J(r4, 15);
        C53062mU r8 = r25;
        C162457s7.A0J(r8, 17);
        C39762Df r15 = r17;
        C162457s7.A0J(r15, 19);
        this.A02 = r13;
        this.A0H = r1;
        this.A05 = r11;
        this.A0F = r3;
        this.A0C = r5;
        this.A0B = r6;
        this.A0A = r7;
        this.A04 = r12;
        this.A0G = r2;
        this.A03 = r20;
        this.A07 = r9;
        this.A06 = r10;
        this.A0E = r31;
        this.A01 = r14;
        this.A0D = r4;
        this.A09 = r26;
        this.A08 = r8;
        this.A0I = r35;
        this.A00 = r15;
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076 A[Catch:{ all -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0077 A[Catch:{ all -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0092 A[Catch:{ all -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b1 A[Catch:{ all -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C50612iT r15, X.AnonymousClass48X r16, X.C84814Du r17, X.AnonymousClass4GP r18, X.AnonymousClass4C6 r19) {
        /*
            r14 = this;
            r3 = r17
            boolean r0 = r3 instanceof X.C73993gP
            r10 = r14
            if (r0 == 0) goto L_0x0021
            r6 = r3
            X.3gP r6 = (X.C73993gP) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0021
            int r2 = r2 - r1
            r6.label = r2
        L_0x0015:
            java.lang.Object r3 = r6.result
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r6.label
            r2 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 != r2) goto L_0x0027
            goto L_0x0067
        L_0x0021:
            X.3gP r6 = new X.3gP
            r6.<init>(r14, r3)
            goto L_0x0015
        L_0x0027:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x002c:
            X.C57682u2.A01(r3)
            java.util.List r0 = r15.A05
            X.C162457s7.A0D(r0)
            java.util.ArrayList r4 = X.C73783g4.A0d(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x003c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x005e
            X.39M r8 = X.AnonymousClass0x7.A0b(r3)
            r11 = 0
            com.whatsapp.stickers.stickerpack.StickerPackDownloader$executeStickerDownloadInParallel$deferredDownloads$1$1 r7 = new com.whatsapp.stickers.stickerpack.StickerPackDownloader$executeStickerDownloadInParallel$deferredDownloads$1$1
            r9 = r16
            r12 = r18
            r13 = r19
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.3du r1 = X.C72553du.A00
            X.20D r0 = X.AnonymousClass20D.DEFAULT
            X.4Gi r0 = X.C616131n.A01(r1, r7, r13, r0)
            r4.add(r0)
            goto L_0x003c
        L_0x005e:
            r6.label = r2     // Catch:{ all -> 0x00e5 }
            java.lang.Object r3 = X.AnonymousClass2AD.A00(r4, r6)     // Catch:{ all -> 0x00e5 }
            if (r3 != r5) goto L_0x006a
            return r5
        L_0x0067:
            X.C57682u2.A01(r3)     // Catch:{ all -> 0x00e5 }
        L_0x006a:
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x00e5 }
            boolean r0 = r3 instanceof java.util.Collection     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x0077
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x0077
            goto L_0x0090
        L_0x0077:
            java.util.Iterator r1 = r3.iterator()     // Catch:{ all -> 0x00e5 }
        L_0x007b:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x0090
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00e5 }
            X.3Z9 r0 = (X.AnonymousClass3Z9) r0     // Catch:{ all -> 0x00e5 }
            java.lang.Object r0 = r0.value     // Catch:{ all -> 0x00e5 }
            boolean r0 = r0 instanceof X.AnonymousClass3Z0     // Catch:{ all -> 0x00e5 }
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x007b
            r2 = 0
        L_0x0090:
            if (r2 == 0) goto L_0x00b1
            java.util.ArrayList r2 = X.C73783g4.A0d(r3)     // Catch:{ all -> 0x00e5 }
            java.util.Iterator r1 = r3.iterator()     // Catch:{ all -> 0x00e5 }
        L_0x009a:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x00d7
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00e5 }
            X.3Z9 r0 = (X.AnonymousClass3Z9) r0     // Catch:{ all -> 0x00e5 }
            java.lang.Object r0 = r0.value     // Catch:{ all -> 0x00e5 }
            X.C57682u2.A01(r0)     // Catch:{ all -> 0x00e5 }
            X.39M r0 = (X.AnonymousClass39M) r0     // Catch:{ all -> 0x00e5 }
            r2.add(r0)     // Catch:{ all -> 0x00e5 }
            goto L_0x009a
        L_0x00b1:
            java.util.Iterator r2 = r3.iterator()     // Catch:{ all -> 0x00e5 }
        L_0x00b5:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x00e5 }
            X.3Z9 r0 = (X.AnonymousClass3Z9) r0     // Catch:{ all -> 0x00e5 }
            java.lang.Object r1 = r0.value     // Catch:{ all -> 0x00e5 }
            boolean r0 = r1 instanceof X.AnonymousClass3Z0     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x00b5
            java.lang.Throwable r0 = X.AnonymousClass3Z9.A00(r1)     // Catch:{ all -> 0x00e5 }
            if (r0 != 0) goto L_0x00d3
            java.lang.String r0 = "Unknown error"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x00e5 }
        L_0x00d3:
            X.3Z0 r2 = X.AnonymousClass3Z0.A01(r0)     // Catch:{ all -> 0x00e5 }
        L_0x00d7:
            X.3Z9 r1 = new X.3Z9     // Catch:{ all -> 0x00e5 }
            r1.<init>(r2)     // Catch:{ all -> 0x00e5 }
            goto L_0x00ea
        L_0x00dd:
            java.lang.String r1 = "Collection contains no element matching the predicate."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x00e5 }
            r0.<init>(r1)     // Catch:{ all -> 0x00e5 }
            throw r0     // Catch:{ all -> 0x00e5 }
        L_0x00e5:
            r0 = move-exception
            X.3Z0 r1 = X.AnonymousClass3Z0.A01(r0)
        L_0x00ea:
            java.lang.Throwable r0 = X.AnonymousClass3Z9.A00(r1)
            if (r0 == 0) goto L_0x00f9
            X.3Z0 r0 = X.AnonymousClass3Z0.A01(r0)
            X.3Z9 r1 = new X.3Z9
            r1.<init>(r0)
        L_0x00f9:
            X.3Z9 r1 = (X.AnonymousClass3Z9) r1
            java.lang.Object r0 = r1.value
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.stickerpack.StickerPackDownloader.A00(X.2iT, X.48X, X.4Du, X.4GP, X.4C6):java.lang.Object");
    }

    public final void A02(Integer num, Integer num2, String str) {
        if (num != null && num2 != null) {
            this.A04.markerPoint(num.intValue(), num2.intValue(), str);
        }
    }
}
