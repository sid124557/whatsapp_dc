package X;

import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.9Z9  reason: invalid class name */
public class AnonymousClass9Z9 implements C202899mn {
    public final AnonymousClass9RR A00 = new AnonymousClass9RR();
    public final AnonymousClass9RR A01 = new AnonymousClass9RR();
    public final AnonymousClass9RR A02 = new AnonymousClass9RR();
    public volatile String A03 = null;
    public volatile boolean A04;

    public final C192939Mi A00() {
        C192939Mi r12 = new C192939Mi();
        String str = this.A03;
        r12.A00 = str;
        AnonymousClass9RR r1 = this.A02;
        double[] A012 = r1.A01.A01();
        double[] A013 = r1.A03.A01();
        long j = (long) A012[2];
        int i = ((int) A012[3]) + ((int) A013[3]);
        float f = (float) A012[0];
        float f2 = (float) A012[1];
        float f3 = (float) A013[0];
        float f4 = (float) A013[1];
        AnonymousClass9RR r13 = this.A01;
        double[] A014 = r13.A01.A01();
        double[] A015 = r13.A03.A01();
        long j2 = (long) A014[2];
        int i2 = ((int) A014[3]) + ((int) A015[3]);
        float f5 = (float) A014[0];
        float f6 = (float) A014[1];
        float f7 = (float) A015[0];
        float f8 = (float) A015[1];
        double[] A016 = this.A00.A02.A01();
        long j3 = (long) A016[2];
        float f9 = (float) A016[0];
        float f10 = (float) A016[1];
        Object[] objArr = new Object[17];
        AnonymousClass001.A1P(objArr, f, 0);
        AnonymousClass001.A1P(objArr, f2, 1);
        AnonymousClass001.A1P(objArr, f3, 2);
        AnonymousClass001.A1P(objArr, f4, 3);
        objArr[4] = Long.valueOf(j);
        objArr[5] = Integer.valueOf(i);
        objArr[6] = Float.valueOf(f5);
        objArr[7] = Float.valueOf(f6);
        objArr[8] = Float.valueOf(f7);
        objArr[9] = Float.valueOf(f8);
        objArr[10] = Long.valueOf(j2);
        objArr[11] = Integer.valueOf(i2);
        objArr[12] = Float.valueOf(f9);
        objArr[13] = Float.valueOf(f10);
        objArr[14] = Long.valueOf(j3);
        objArr[15] = str;
        objArr[16] = false;
        if (C162477s9.A01.BI0(4)) {
            C162477s9.A07("PerformanceLoggerManagerImpl", StringFormatUtil.formatStrLocaleSafe("AVG Render Time [ms]: %.2f +/- %.2f, AVG Gap Time [ms]: %.2f +/- %.2f, Frame count: %d, Out of Order %d [=0 is valid]\nGPU: AVG Render Time [ms]: %.2f +/- %.2f, AVG Gap Time [ms]: %.2f +/- %.2f, Frame count: %d, Out of Order %d [=0 is valid]\nDELAY: AVG Delay Render Time [ms]: %.2f +/- %.2f, Frame count: %d\nEffect Id: %s, Is Recording: %b", objArr));
        }
        return r12;
    }

    public C192939Mi B2I() {
        C192939Mi A002 = A00();
        this.A02.A00();
        this.A01.A00();
        this.A00.A00();
        this.A03 = null;
        return A002;
    }

    public C192939Mi B2J(String str) {
        C192939Mi A002 = A00();
        this.A02.A00();
        this.A01.A00();
        this.A00.A00();
        this.A03 = str;
        return A002;
    }
}
