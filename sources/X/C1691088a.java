package X;

import android.os.SystemClock;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.88a  reason: invalid class name and case insensitive filesystem */
public abstract class C1691088a implements C187668xc {
    public int A00;
    public C157677ih A01;
    public final ArrayList A02 = AnonymousClass002.A0I(1);
    public final boolean A03;

    public final void A01() {
        for (int i = 0; i < this.A00; i++) {
            this.A02.get(i);
        }
    }

    public final void A00() {
        C148707Jk r12;
        float f;
        C157677ih r11 = this.A01;
        for (int i = 0; i < this.A00; i++) {
            boolean z = this.A03;
            AnonymousClass88U r14 = (AnonymousClass88U) ((C178288hI) this.A02.get(i));
            synchronized (r14) {
                if (z) {
                    if ((r11.A00 & 8) != 8) {
                        C161487pm.A04(AnonymousClass001.A1W(r14.A01));
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i2 = (int) (elapsedRealtime - r14.A05);
                        r14.A07 += (long) i2;
                        long j = r14.A06;
                        long j2 = r14.A04;
                        r14.A06 = j + j2;
                        if (i2 > 0) {
                            float f2 = (((float) j2) * 8000.0f) / ((float) i2);
                            C156887hN r2 = r14.A0B;
                            int sqrt = (int) Math.sqrt((double) j2);
                            if (r2.A00 != 1) {
                                Collections.sort(r2.A04, C156887hN.A06);
                                r2.A00 = 1;
                            }
                            int i3 = r2.A02;
                            if (i3 > 0) {
                                C148707Jk[] r0 = r2.A05;
                                i3--;
                                r2.A02 = i3;
                                r12 = r0[i3];
                            } else {
                                r12 = new C148707Jk();
                            }
                            int i4 = r2.A01;
                            r2.A01 = i4 + 1;
                            r12.A01 = i4;
                            r12.A02 = sqrt;
                            r12.A00 = f2;
                            ArrayList arrayList = r2.A04;
                            arrayList.add(r12);
                            int i5 = r2.A03 + sqrt;
                            while (true) {
                                r2.A03 = i5;
                                while (i5 > 2000) {
                                    int i6 = i5 - 2000;
                                    C148707Jk r8 = (C148707Jk) arrayList.get(0);
                                    int i7 = r8.A02;
                                    if (i7 <= i6) {
                                        i5 -= i7;
                                        r2.A03 = i5;
                                        arrayList.remove(0);
                                        int i8 = i3;
                                        if (i3 < 5) {
                                            C148707Jk[] r02 = r2.A05;
                                            i3++;
                                            r2.A02 = i3;
                                            r02[i8] = r8;
                                        }
                                    } else {
                                        r8.A02 = i7 - i6;
                                        i5 -= i6;
                                    }
                                }
                                break;
                            }
                            if (r14.A07 >= 2000 || r14.A06 >= 524288) {
                                if (r2.A00 != 0) {
                                    Collections.sort(arrayList, C156887hN.A07);
                                    r2.A00 = 0;
                                }
                                float f3 = 0.5f * ((float) r2.A03);
                                int i9 = 0;
                                int i10 = 0;
                                while (true) {
                                    if (i9 < arrayList.size()) {
                                        C148707Jk r1 = (C148707Jk) arrayList.get(i9);
                                        i10 += r1.A02;
                                        if (((float) i10) >= f3) {
                                            f = r1.A00;
                                            break;
                                        }
                                        i9++;
                                    } else if (arrayList.isEmpty()) {
                                        f = Float.NaN;
                                    } else {
                                        f = ((C148707Jk) arrayList.get(C86664Kz.A0M(arrayList))).A00;
                                    }
                                }
                                r14.A02 = (long) f;
                            }
                            r14.A06(i2, r14.A04, r14.A02);
                            r14.A05 = elapsedRealtime;
                            r14.A04 = 0;
                        }
                        r14.A01--;
                    }
                }
            }
        }
        this.A01 = null;
    }

    public final void A02(int i) {
        C157677ih r6 = this.A01;
        for (int i2 = 0; i2 < this.A00; i2++) {
            boolean z = this.A03;
            AnonymousClass88U r4 = (AnonymousClass88U) ((C178288hI) this.A02.get(i2));
            synchronized (r4) {
                if (z) {
                    if ((r6.A00 & 8) != 8) {
                        r4.A04 += (long) i;
                    }
                }
            }
        }
    }

    public final void A03(C157677ih r6) {
        this.A01 = r6;
        for (int i = 0; i < this.A00; i++) {
            boolean z = this.A03;
            AnonymousClass88U r3 = (AnonymousClass88U) ((C178288hI) this.A02.get(i));
            synchronized (r3) {
                if (z) {
                    if ((r6.A00 & 8) != 8) {
                        int i2 = r3.A01;
                        if (i2 == 0) {
                            r3.A05 = SystemClock.elapsedRealtime();
                        }
                        r3.A01 = i2 + 1;
                    }
                }
            }
        }
    }

    public /* synthetic */ Map BCF() {
        HttpURLConnection httpURLConnection;
        if (!(this instanceof C126876Pr) || (httpURLConnection = ((C126876Pr) this).A07) == null) {
            return Collections.emptyMap();
        }
        return httpURLConnection.getHeaderFields();
    }

    public C1691088a(boolean z) {
        this.A03 = z;
    }

    public final void Awr(C178288hI r3) {
        r3.getClass();
        ArrayList arrayList = this.A02;
        if (!arrayList.contains(r3)) {
            arrayList.add(r3);
            this.A00++;
        }
    }
}
