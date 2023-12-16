package X;

import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2ny  reason: invalid class name and case insensitive filesystem */
public class C53972ny {
    public final C56612sH A00;
    public final AnonymousClass33p A01;
    public final C50632iV A02;
    public final C48992fo A03;
    public final AnonymousClass1VX A04;
    public final C55972rD A05;
    public final C50572iO A06;
    public final C55832qz A07;
    public final AnonymousClass4FS A08;
    public final AtomicBoolean A09 = C18280x3.A0l();

    public final boolean A01(C624134x r5) {
        if (r5.A0l == null) {
            return false;
        }
        AnonymousClass1VX r2 = this.A04;
        if ((!r2.A0Y(C58422vE.A02, 250) || !(r5 instanceof AnonymousClass1nF)) && !C383327d.A00(this.A00, this.A01, r2, r5) && !(r5 instanceof C30481mW) && !AnonymousClass36V.A06(r5)) {
            return false;
        }
        return true;
    }

    public C53972ny(C56612sH r2, AnonymousClass33p r3, C50632iV r4, C48992fo r5, AnonymousClass1VX r6, C55972rD r7, C50572iO r8, C55832qz r9, AnonymousClass4FS r10) {
        this.A00 = r2;
        this.A04 = r6;
        this.A08 = r10;
        this.A05 = r7;
        this.A07 = r9;
        this.A02 = r4;
        this.A01 = r3;
        this.A06 = r8;
        this.A03 = r5;
    }

    public final void A00(LinkedList linkedList, Random random) {
        int size;
        String str;
        AnonymousClass5LM A022;
        C18260x0.A1B("ThumbnailAutoDownload/enqueueThumbnailAutodownloadsToRetry num remaining:", AnonymousClass001.A0o(), linkedList);
        int i = 0;
        while (!linkedList.isEmpty()) {
            C50572iO r4 = this.A06;
            C28091fg r1 = r4.A0B;
            synchronized (r1) {
                size = r1.A01.size();
            }
            if (i >= 20 || size - i > 5) {
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A19("ThumbnailAutoDownload/enqueueThumbnailAutodownloadsToRetry num messages remaining=", A0o, linkedList);
                A0o.append(" downloadTasksRemaining=");
                A0o.append(size);
                C18260x0.A0w(" thumbnailsInBatchRetries=", A0o, i);
                int nextInt = random.nextInt(5000) + 5000;
                C18260x0.A0w("ThumbnailAutoDownload/scheduleNextBatch after ", AnonymousClass001.A0o(), nextInt);
                this.A08.Bkn(new C70343aL(this, linkedList, random, 46), "ThumbnailAutoDownload/enqueue", (long) nextInt);
                return;
            }
            C624134x A002 = C55122pp.A00(this.A07, C18310x6.A0B(linkedList.pop()));
            if (A002 != null && !A002.A1J.A02 && A01(A002)) {
                if (!(!(A002 instanceof C30471mV) || (str = C30471mV.A00((C30471mV) A002).A0I) == null || (A022 = this.A05.A0J.A02(str, 3)) == null)) {
                    long A0H = this.A00.A0H();
                    long j = A022.A06;
                    long j2 = A0H - j;
                    if (j2 < 86400000 && j2 < (j - A022.A0C) * 2) {
                    }
                }
                r4.A01(A002, 1);
                i++;
            }
        }
        this.A09.set(false);
    }
}
