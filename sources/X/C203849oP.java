package X;

import android.graphics.Point;
import java.util.List;

/* renamed from: X.9oP  reason: invalid class name and case insensitive filesystem */
public class C203849oP extends AnonymousClass9SG {
    public Object A00;
    public final int A01;

    public C203849oP(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00(Exception exc) {
        switch (this.A01) {
            case 0:
                C195579Yl r4 = (C195579Yl) this.A00;
                synchronized (r4.A0X) {
                    if (r4.A0b) {
                        r4.A0b = false;
                        AnonymousClass9N8 r1 = r4.A0a;
                        r4.A0a = null;
                        if (r1 != null) {
                            Object[] A0M = AnonymousClass002.A0M();
                            C18280x3.A19(r1, exc, A0M);
                            AnonymousClass6C7.A10(r4.A0J, A0M, 10);
                        }
                    }
                }
                return;
            case 1:
                ((C195579Yl) this.A00).A0C = null;
                return;
            case 2:
                return;
            case 5:
                C194349Sn r3 = ((AnonymousClass9ZR) this.A00).A0K;
                r3.A00((Point) null, C192379Jm.EXCEPTION, r3.A02);
                return;
            case 6:
                AnonymousClass9WT.A00();
                return;
            case 7:
                ((AnonymousClass9ZS) this.A00).A0X.A03(C192379Jm.EXCEPTION, (float[]) null);
                return;
            default:
                C195579Yl r32 = (C195579Yl) this.A00;
                if (!r32.A0H) {
                    Object[] A0M2 = AnonymousClass002.A0M();
                    AnonymousClass000.A16(r32.A0W.A00, exc, A0M2);
                    AnonymousClass6C7.A10(r32.A0J, A0M2, 3);
                    return;
                }
                return;
        }
    }

    public /* bridge */ /* synthetic */ void A01(Object obj) {
        C195579Yl r3;
        List list;
        int i;
        AnonymousClass9N8 r0;
        switch (this.A01) {
            case 0:
                C195579Yl r4 = (C195579Yl) this.A00;
                synchronized (r4.A0X) {
                    if (r4.A0b && (r0 = r4.A0a) != null) {
                        Object[] A0M = AnonymousClass002.A0M();
                        AnonymousClass000.A16(r0, obj, A0M);
                        AnonymousClass6C7.A10(r4.A0J, A0M, 8);
                    }
                }
                return;
            case 1:
                ((C195579Yl) this.A00).A0C = null;
                return;
            case 2:
                Object[] objArr = new Object[4];
                C195579Yl r2 = (C195579Yl) this.A00;
                objArr[0] = r2;
                objArr[1] = r2.A0C;
                AnonymousClass000.A1N(objArr, r2.A08);
                objArr[3] = Integer.valueOf(r2.A06);
                AnonymousClass6C7.A10(r2.A0J, objArr, 15);
                return;
            case 3:
                C193479Ou r6 = (C193479Ou) obj;
                r3 = (C195579Yl) this.A00;
                r3.A0C = r6;
                if (!r3.A0H) {
                    C195579Yl.A00(r3, r6);
                    r3.A03(r6);
                    C203539nu r1 = r3.A0Q;
                    r1.Bmj(r3.A0N);
                    if (r3.A0A != null) {
                        r1.Awe(r3.A0S);
                    }
                    list = r3.A0W.A00;
                    i = 1;
                    break;
                } else {
                    return;
                }
            case 4:
                C193479Ou r62 = (C193479Ou) obj;
                r3 = (C195579Yl) this.A00;
                r3.A0C = r62;
                if (!r3.A0H) {
                    C195579Yl.A00(r3, r62);
                    C203539nu r12 = r3.A0Q;
                    if (r12 != null && r12.isConnected()) {
                        int B5C = r12.B5C();
                        int i2 = 0;
                        if (B5C != 0) {
                            i2 = 1;
                            if (1 != B5C) {
                                throw C1899593h.A0Y("Could not convert camera facing from optic: ", AnonymousClass001.A0o(), B5C);
                            }
                        }
                        r3.A00 = i2;
                        r3.A03(r62);
                        list = r3.A0W.A00;
                        i = 2;
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                break;
            default:
                return;
        }
        AnonymousClass6C7.A10(r3.A0J, list, i);
    }
}
