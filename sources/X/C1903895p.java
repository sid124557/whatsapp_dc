package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.95p  reason: invalid class name and case insensitive filesystem */
public class C1903895p extends AnonymousClass9Yx implements C203659o6, C180428l3 {
    public static final LinkedHashMap A0D = new LinkedHashMap();
    public int A00;
    public int A01;
    public final Handler A02;
    public final AnonymousClass9T0 A03;
    public final AnonymousClass9MO A04;
    public final C157207hv A05;
    public final C203689o9 A06;
    public final C194849Us A07;
    public final AnonymousClass9XQ A08;
    public final AnonymousClass9XP A09;
    public final AnonymousClass75B A0A;
    public volatile AnonymousClass9KU A0B;
    public volatile CountDownLatch A0C;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1903895p(X.C203449ni r22) {
        /*
            r21 = this;
            r13 = r21
            r2 = r22
            r13.<init>(r2)
            X.9T0 r12 = new X.9T0
            r12.<init>(r13)
            r13.A03 = r12
            X.9MO r11 = new X.9MO
            r11.<init>(r13)
            r13.A04 = r11
            X.9LH r1 = X.C203689o9.A00
            X.9ni r10 = r13.A00
            boolean r0 = r10.BHH(r1)
            if (r0 == 0) goto L_0x01c3
            X.9lp r0 = r10.B5k(r1)
            X.9o9 r0 = (X.C203689o9) r0
        L_0x0025:
            r13.A06 = r0
            X.9LE r0 = X.C203579ny.A0A
            java.lang.Object r0 = r10.B5l(r0)
            X.75B r0 = (X.AnonymousClass75B) r0
            r13.A0A = r0
            X.9LE r0 = X.C203579ny.A04
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r1 = r3
            java.lang.Object r0 = r10.B5l(r0)
            if (r0 == 0) goto L_0x003d
            r1 = r0
        L_0x003d:
            boolean r16 = X.AnonymousClass001.A1Z(r1)
            X.9Mj r6 = new X.9Mj
            r6.<init>()
            X.9LF r14 = X.C194729Ug.A02
            X.9LE r0 = X.C203579ny.A02
            java.lang.Object r1 = X.C194849Us.A05
            r9 = r1
            java.lang.Object r0 = r10.B5l(r0)
            if (r0 == 0) goto L_0x0054
            r1 = r0
        L_0x0054:
            java.util.Map r4 = r6.A00
            r4.put(r14, r1)
            X.9LF r8 = X.C194729Ug.A06
            X.9LE r0 = X.C203579ny.A0B
            java.lang.Integer r1 = X.C18290x4.A0a()
            java.lang.Object r0 = r10.B5l(r0)
            if (r0 == 0) goto L_0x0068
            r1 = r0
        L_0x0068:
            r4.put(r8, r1)
            X.9LF r5 = X.C194729Ug.A01
            X.9LE r0 = X.C203579ny.A01
            r1 = r3
            java.lang.Object r0 = r10.B5l(r0)
            if (r0 == 0) goto L_0x0077
            r1 = r0
        L_0x0077:
            r4.put(r5, r1)
            X.9LF r7 = X.C194729Ug.A03
            X.9LE r0 = X.C203579ny.A05
            java.lang.Object r0 = r10.B5l(r0)
            if (r0 == 0) goto L_0x0085
            r3 = r0
        L_0x0085:
            r4.put(r7, r3)
            X.9LF r0 = X.C194729Ug.A0A
            X.9LE r1 = X.C203579ny.A03
            java.lang.Object r1 = r10.B5l(r1)
            r4.put(r0, r1)
            X.9LF r15 = X.C194729Ug.A04
            X.9LE r1 = X.C203579ny.A08
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r3 = r5
            java.lang.Object r1 = r10.B5l(r1)
            if (r1 == 0) goto L_0x00a1
            r3 = r1
        L_0x00a1:
            r4.put(r15, r3)
            X.9LF r3 = X.C194729Ug.A08
            X.9LE r1 = X.C203579ny.A0C
            java.lang.Object r1 = r10.B5l(r1)
            if (r1 == 0) goto L_0x00af
            r5 = r1
        L_0x00af:
            r4.put(r3, r5)
            X.9LF r3 = X.C194729Ug.A0C
            r5 = 0
            if (r16 != 0) goto L_0x01c0
            r13.A02()
            r1 = 0
        L_0x00bb:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4.put(r3, r1)
            X.9LF r3 = X.C194729Ug.A0B
            if (r16 != 0) goto L_0x01bd
            r13.A02()
            r1 = 0
        L_0x00ca:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4.put(r3, r1)
            X.9LF r3 = X.C194729Ug.A0D
            if (r16 != 0) goto L_0x01ba
            r13.A02()
        L_0x00d8:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            r4.put(r3, r1)
            X.9LF r3 = X.C194729Ug.A07
            boolean r1 = r13.A02()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4.put(r3, r1)
            X.9LF r3 = X.C194729Ug.A05
            boolean r1 = r13.A02()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4.put(r3, r1)
            r13.A02()
            android.content.Context r5 = r10.getContext()
            X.9Ug r4 = new X.9Ug
            r4.<init>(r6)
            X.9LE r1 = X.C203579ny.A06
            X.9LG r3 = new X.9LG
            r3.<init>()
            java.lang.Object r1 = r10.B5l(r1)
            if (r1 == 0) goto L_0x0113
            r3 = r1
        L_0x0113:
            X.9LG r3 = (X.AnonymousClass9LG) r3
            X.9MN r1 = new X.9MN
            r1.<init>(r13)
            X.9Us r6 = new X.9Us
            r6.<init>(r5, r1, r4, r3)
            r13.A07 = r6
            X.9LE r1 = X.C203579ny.A00
            X.7hv r5 = new X.7hv
            r5.<init>()
            java.lang.Object r1 = r10.B5l(r1)
            if (r1 == 0) goto L_0x012f
            r5 = r1
        L_0x012f:
            X.7hv r5 = (X.C157207hv) r5
            r13.A05 = r5
            android.os.Handler r1 = X.C192599Ku.A00(r2)
            r13.A02 = r1
            android.os.Looper r16 = r1.getLooper()
            android.content.Context r15 = r6.A01
            X.9Ug r4 = r6.A03
            X.9LG r3 = r6.A04
            X.9MN r2 = r6.A02
            java.util.Map r1 = r4.A00
            java.lang.Object r0 = r1.get(r0)
            X.7l3 r0 = (X.C159067l3) r0
            if (r0 != 0) goto L_0x015d
            java.lang.Object r0 = r1.get(r7)
            r0.getClass()
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            if (r0 != 0) goto L_0x0197
            r0 = 0
        L_0x015d:
            X.9ZJ r14 = new X.9ZJ
            r19 = r4
            r20 = r3
            r17 = r2
            r18 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20)
            X.8qc r0 = r14.A07
            X.9ZK r0 = (X.AnonymousClass9ZK) r0
            r0.A00 = r11
            X.9XQ r4 = new X.9XQ
            r4.<init>(r12, r5, r14)
            r13.A08 = r4
            X.7hv r3 = r13.A05
            X.9ZJ r2 = r4.A05
            X.9o9 r0 = r13.A06
            X.9ZO r1 = new X.9ZO
            r1.<init>(r3, r0, r2)
            X.9XP r0 = new X.9XP
            r0.<init>(r1, r4)
            r13.A09 = r0
            X.9LE r0 = X.C203579ny.A09
            java.lang.Object r0 = r10.B5l(r0)
            X.9ZG r0 = (X.AnonymousClass9ZG) r0
            if (r0 == 0) goto L_0x0196
            r13.A01(r0)
        L_0x0196:
            return
        L_0x0197:
            X.7l3 r0 = r6.A00
            if (r0 != 0) goto L_0x01b7
            java.lang.Object r0 = r1.get(r14)
            if (r0 == 0) goto L_0x01a2
            r9 = r0
        L_0x01a2:
            java.lang.Object r0 = r1.get(r8)
            r0.getClass()
            int r0 = X.AnonymousClass001.A0K(r0)
            X.7l3 r1 = X.C161027oq.A01(r9, r0)
            r6.A00 = r1
            r0 = 1
            r1.A03(r0)
        L_0x01b7:
            X.7l3 r0 = r6.A00
            goto L_0x015d
        L_0x01ba:
            r5 = 1
            goto L_0x00d8
        L_0x01bd:
            r1 = 1
            goto L_0x00ca
        L_0x01c0:
            r1 = 1
            goto L_0x00bb
        L_0x01c3:
            r0 = 0
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1903895p.<init>(X.9ni):void");
    }

    public final void A00(AnonymousClass96d r12) {
        String str;
        C203689o9 r2 = this.A06;
        if (r2 != null) {
            AnonymousClass96d r3 = r12;
            Throwable cause = r12.getCause();
            if ((cause instanceof Error) || (cause instanceof RuntimeException)) {
                str = "high";
            } else {
                str = "medium";
            }
            r2.BKI(r3, "media_pipeline_error", "MediaGraphControllerImpl", str, "MediaGraphControllerImpl", (Map) null, (long) hashCode());
        }
    }

    public final void A01(AnonymousClass9ZG r5) {
        AnonymousClass9XQ r3 = this.A08;
        Handler handler = r3.A01;
        if (handler.getLooper() != Looper.myLooper()) {
            handler.sendMessage(Message.obtain(r3.A05.A00, 4, r5));
        } else {
            r3.A00(r5);
        }
        AnonymousClass9XP r1 = this.A09;
        Objects.requireNonNull(r1);
        C185298tP r2 = new AnonymousClass9MM(r1).A00.A02;
        r2.Awk(new C204839q0(r5, 0), 0);
        r2.Awk(new C204839q0(r5, 1), 1);
    }

    public final boolean A02() {
        AnonymousClass9LH r2 = C203669o7.A00;
        C203449ni r1 = this.A00;
        if (!r1.BHH(r2)) {
            return false;
        }
        r1.B5k(r2);
        return false;
    }

    public C185298tP B9U() {
        return this.A09.A02;
    }

    public void BjT(Long l) {
        AnonymousClass9XP r1 = this.A09;
        if (r1.A03.A03.A01.A06 != null) {
            System.nanoTime();
        }
        Handler handler = r1.A01;
        Message obtain = Message.obtain(handler, 1);
        obtain.getClass();
        handler.sendMessage(obtain);
    }

    public void Brt(int i, int i2, int i3, int i4, int i5, boolean z) {
        AnonymousClass9XQ r2 = this.A09.A03;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        int i9 = i5;
        boolean z2 = z;
        r2.A02.put(0, new AnonymousClass9PX(i6, i7, i8, i9, z2));
        AnonymousClass9ZG r3 = r2.A00;
        if (r3 != null) {
            try {
                r3.A01(0, i6, i7, i8, i9, z2);
            } catch (Exception e) {
                r2.A03.A00(e);
            }
        }
    }

    public String B7H() {
        return "MediaGraphControllerImpl";
    }
}
