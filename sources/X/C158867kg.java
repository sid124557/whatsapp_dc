package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7kg  reason: invalid class name and case insensitive filesystem */
public final class C158867kg {
    public int A00 = -1;
    public List A01 = C72023d3.A00;
    public Map A02 = C73813g7.A0A();
    public Set A03 = C72063d7.A00;
    public final int A04;
    public final C184798sX A05;
    public final AnonymousClass7R7 A06;
    public final AnonymousClass7AL A07 = new AnonymousClass7AL(this.A05.getFrameCount());
    public final C151077Ti A08;
    public final C157827iw A09;
    public final ConcurrentHashMap A0A = AnonymousClass0x9.A1D();
    public final AtomicBoolean A0B = C18280x3.A0l();

    public static final int A00(C184798sX r6) {
        long millis = TimeUnit.SECONDS.toMillis(1) / ((long) (((C1677482j) r6).A00.A01 / r6.getFrameCount()));
        if (millis < 1) {
            millis = 1;
        }
        return (int) millis;
    }

    public final AnonymousClass8KM A02(int i) {
        int i2 = this.A07.A00;
        Iterator it = new C175698Zj(0, i2).iterator();
        while (it.hasNext()) {
            int A002 = (i - ((C72013d2) it).A00()) % i2;
            if (A002 < 0) {
                A002 += i2;
            }
            C172258Kh r1 = (C172258Kh) C18290x4.A0j(this.A0A, A002);
            if (r1 != null && r1.A04()) {
                return new AnonymousClass8KM(r1, A002);
            }
        }
        return null;
    }

    public void A03(int i) {
        C184798sX r4 = this.A05;
        int i2 = ((C1677482j) r4).A00.A01;
        int loopCount = r4.getLoopCount();
        if (loopCount < 1) {
            loopCount = 1;
        }
        int i3 = i2 * loopCount;
        AnonymousClass7R7 r2 = this.A06;
        int frameCount = r4.getFrameCount();
        int A002 = A00(r4);
        if (i > A002) {
            i = A002;
        }
        Map A003 = r2.A00(i3, frameCount, i);
        this.A02 = A003;
        this.A03 = C73723fy.A0P(A003.values());
    }

    public final void A04(int i, int i2) {
        if (!this.A0B.getAndSet(true)) {
            C155277eb.A01.execute(new AnonymousClass82t(this, i, i2));
        }
    }

    public C158867kg(C184798sX r3, AnonymousClass7R7 r4, C151077Ti r5, C157827iw r6) {
        this.A09 = r6;
        this.A08 = r5;
        this.A06 = r4;
        this.A05 = r3;
        this.A04 = A00(r3);
        A03(A00(this.A05));
    }

    public final C172258Kh A01(C172258Kh r8, int i, int i2, int i3) {
        C172258Kh A012;
        int i4;
        Bitmap A002;
        C172258Kh A022;
        AnonymousClass8KM A023 = A02(i);
        if (A023 == null || (A022 = A023.A01.A02()) == null) {
            A012 = this.A09.A01(Bitmap.Config.ARGB_8888, i2, i3);
            i4 = 0;
            this.A08.A00(C172258Kh.A00(A012), 0);
            A002 = C172258Kh.A00(A012);
        } else {
            if (r8 == null || (A012 = r8.A02()) == null) {
                A012 = this.A09.A02(C172258Kh.A00(A022));
            } else {
                Bitmap A003 = C172258Kh.A00(A022);
                if (A012.A04()) {
                    Canvas canvas = new Canvas(C172258Kh.A00(A012));
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    canvas.drawBitmap(A003, 0.0f, 0.0f, (Paint) null);
                }
            }
            A022.close();
            A002 = C172258Kh.A00(A012);
            i4 = A023.A00;
        }
        if (i4 > i) {
            new Canvas(A002).drawColor(0, PorterDuff.Mode.CLEAR);
            Iterator it = new C175698Zj(0, i).iterator();
            while (it.hasNext()) {
                this.A08.A00(A002, ((C72013d2) it).A00());
            }
        } else if (i4 < i) {
            Iterator it2 = new C175698Zj(i4 + 1, i).iterator();
            while (it2.hasNext()) {
                this.A08.A00(A002, ((C72013d2) it2).A00());
            }
        }
        return A012;
    }
}
