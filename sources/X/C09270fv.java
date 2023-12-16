package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0fv  reason: invalid class name and case insensitive filesystem */
public class C09270fv implements C17340vN, C16230sg, C16790ty, C17350vO {
    public Paint A00;
    public RectF A01;
    public AnonymousClass0QZ A02;
    public List A03;
    public final Matrix A04;
    public final Path A05;
    public final RectF A06;
    public final AnonymousClass01G A07;
    public final String A08;
    public final List A09;
    public final boolean A0A;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C09270fv(X.AnonymousClass01G r10, X.C09460gE r11, X.C09320g0 r12) {
        /*
            r9 = this;
            java.lang.String r6 = r11.A00
            boolean r8 = r11.A02
            java.util.List r2 = r11.A01
            java.util.ArrayList r7 = X.AnonymousClass000.A0p(r2)
            r1 = 0
        L_0x000b:
            int r0 = r2.size()
            r3 = r10
            r5 = r12
            if (r1 >= r0) goto L_0x0025
            java.lang.Object r0 = r2.get(r1)
            X.0sh r0 = (X.C16240sh) r0
            X.0tx r0 = r0.Bqm(r10, r12)
            if (r0 == 0) goto L_0x0022
            r7.add(r0)
        L_0x0022:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x0025:
            r1 = 0
        L_0x0026:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x0040
            java.lang.Object r4 = r2.get(r1)
            X.0sh r4 = (X.C16240sh) r4
            boolean r0 = r4 instanceof X.C09510gJ
            if (r0 == 0) goto L_0x003d
            X.0gJ r4 = (X.C09510gJ) r4
        L_0x0038:
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        L_0x003d:
            int r1 = r1 + 1
            goto L_0x0026
        L_0x0040:
            r4 = 0
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09270fv.<init>(X.01G, X.0gE, X.0g0):void");
    }

    public List A00() {
        if (this.A03 == null) {
            this.A03 = AnonymousClass001.A0s();
            int i = 0;
            while (true) {
                List list = this.A09;
                if (i >= list.size()) {
                    break;
                }
                Object obj = list.get(i);
                if (obj instanceof C17340vN) {
                    this.A03.add(obj);
                }
                i++;
            }
        }
        return this.A03;
    }

    public void Aws(C05560Tz r2, Object obj) {
        AnonymousClass0QZ r0 = this.A02;
        if (r0 != null) {
            r0.A04(r2, obj);
        }
    }

    public void B2C(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        int A032;
        if (!this.A0A) {
            Matrix matrix2 = this.A04;
            matrix2.set(matrix);
            AnonymousClass0QZ r1 = this.A02;
            if (r1 != null) {
                matrix2.preConcat(r1.A00());
                C04850Qx r0 = r1.A02;
                if (r0 == null) {
                    A032 = 100;
                } else {
                    A032 = C04850Qx.A03(r0);
                }
                i = (int) ((((((float) A032) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
            }
            if (this.A07.A0C) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    List list = this.A09;
                    if (i2 >= list.size()) {
                        break;
                    } else if (!(list.get(i2) instanceof C17350vO) || (i3 = i3 + 1) < 2) {
                        i2++;
                    } else if (i != 255) {
                        z = true;
                        RectF rectF = this.A01;
                        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                        B4p(matrix2, rectF, true);
                        Paint paint = this.A00;
                        paint.setAlpha(i);
                        AnonymousClass0Y0.A02(canvas, paint, rectF, 31);
                        i = 255;
                    }
                }
            }
            z = false;
            List list2 = this.A09;
            for (int A042 = AnonymousClass002.A04(list2, 1); A042 >= 0; A042--) {
                Object obj = list2.get(A042);
                if (obj instanceof C17350vO) {
                    ((C17350vO) obj).B2C(canvas, matrix2, i);
                }
            }
            if (z) {
                canvas.restore();
            }
        }
    }

    public void B4p(Matrix matrix, RectF rectF, boolean z) {
        Matrix matrix2 = this.A04;
        matrix2.set(matrix);
        AnonymousClass0QZ r0 = this.A02;
        if (r0 != null) {
            matrix2.preConcat(r0.A00());
        }
        RectF rectF2 = this.A06;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        List list = this.A09;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C16780tx r1 = (C16780tx) list.get(size);
                if (r1 instanceof C17350vO) {
                    ((C17350vO) r1).B4p(matrix2, rectF2, z);
                    rectF.union(rectF2);
                }
            } else {
                return;
            }
        }
    }

    public Path BAd() {
        Matrix matrix = this.A04;
        matrix.reset();
        AnonymousClass0QZ r0 = this.A02;
        if (r0 != null) {
            matrix.set(r0.A00());
        }
        Path path = this.A05;
        path.reset();
        if (!this.A0A) {
            List list = this.A09;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C16780tx r1 = (C16780tx) list.get(size);
                if (r1 instanceof C17340vN) {
                    path.addPath(((C17340vN) r1).BAd(), matrix);
                }
            }
        }
        return path;
    }

    public void BfC() {
        this.A07.invalidateSelf();
    }

    public void Bk4(AnonymousClass0WB r4, AnonymousClass0WB r5, List list, int i) {
        String str = this.A08;
        if (r4.A02(str, i) || "__container".equals(str)) {
            if (!"__container".equals(str)) {
                AnonymousClass0WB r1 = new AnonymousClass0WB(r5);
                r1.A01.add(str);
                r5 = r1;
                if (r4.A01(str, i)) {
                    AnonymousClass0WB r0 = new AnonymousClass0WB(r1);
                    r0.A00 = this;
                    list.add(r0);
                }
            }
            if (r4.A03(str, i)) {
                int A002 = i + r4.A00(str, i);
                int i2 = 0;
                while (true) {
                    List list2 = this.A09;
                    if (i2 < list2.size()) {
                        C16780tx r12 = (C16780tx) list2.get(i2);
                        if (r12 instanceof C16790ty) {
                            ((C16790ty) r12).Bk4(r4, r5, list, A002);
                        }
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public String getName() {
        return this.A08;
    }

    public void Bm3(List list, List list2) {
        int size = list.size();
        List list3 = this.A09;
        ArrayList A0I = AnonymousClass002.A0I(size + list3.size());
        A0I.addAll(list);
        int size2 = list3.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                C16780tx r1 = (C16780tx) list3.get(size2);
                r1.Bm3(A0I, list3.subList(0, size2));
                A0I.add(r1);
            } else {
                return;
            }
        }
    }

    public C09270fv(AnonymousClass01G r5, C09510gJ r6, C09320g0 r7, String str, List list, boolean z) {
        this.A00 = new AnonymousClass00u();
        this.A01 = AnonymousClass002.A07();
        this.A04 = AnonymousClass002.A05();
        this.A05 = AnonymousClass002.A06();
        this.A06 = AnonymousClass002.A07();
        this.A08 = str;
        this.A07 = r5;
        this.A0A = z;
        this.A09 = list;
        if (r6 != null) {
            AnonymousClass0QZ r0 = new AnonymousClass0QZ(r6);
            this.A02 = r0;
            r0.A03(r7);
            this.A02.A02(this);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            Object obj = list.get(size);
            if (obj instanceof C16220sf) {
                A0s.add(obj);
            }
        }
        int size2 = A0s.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                ((C16220sf) A0s.get(size2)).Aw0(list.listIterator(list.size()));
            } else {
                return;
            }
        }
    }
}
