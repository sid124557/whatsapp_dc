package X;

import android.os.Handler;
import java.util.Random;

/* renamed from: X.5On  reason: invalid class name and case insensitive filesystem */
public class C103815On {
    public int A00 = 0;
    public long A01;
    public Runnable A02;
    public final Handler A03 = AnonymousClass000.A0A();
    public final AnonymousClass1VX A04;
    public final AnonymousClass4FV A05;
    public final C183538qC A06;
    public final Random A07 = new Random();

    public void A00(Integer num, Integer num2, int i) {
        AnonymousClass1VX r3 = this.A04;
        if (r3.A0X(1608)) {
            C94924sJ r1 = new C94924sJ();
            r1.A00 = num;
            r1.A01 = C18290x4.A0Z();
            r1.A04 = Long.valueOf(this.A01);
            Integer num3 = num2;
            if (i != 0) {
                int i2 = 16;
                if (i != 100) {
                    i2 = 13;
                    if (i != 103) {
                        i2 = 12;
                        if (i != 105) {
                            i2 = 14;
                            if (i != 108) {
                                i2 = 17;
                                if (i != 97) {
                                    if (i != 98) {
                                        i2 = 2;
                                        if (i != 117) {
                                            if (i == 118) {
                                                i2 = 15;
                                            }
                                            this.A05.BhB(r1);
                                        }
                                    } else {
                                        r1.A01 = 20;
                                        if (num.intValue() == 5) {
                                            ((C111515iD) this.A06.get()).A03(Boolean.FALSE, num3, (String) null, (String) null, (String) null, 1, r1.A01.intValue());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                r1.A01 = Integer.valueOf(i2);
                this.A05.BhB(r1);
            }
            if (r3.A0X(5957)) {
                r1.A02 = num2;
                ((C111515iD) this.A06.get()).A01(r1);
            }
            this.A05.BhB(r1);
        }
    }

    public C103815On(AnonymousClass1VX r2, AnonymousClass4FV r3, C183538qC r4) {
        this.A05 = r3;
        this.A04 = r2;
        this.A06 = r4;
    }
}
