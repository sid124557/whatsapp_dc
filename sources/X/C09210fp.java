package X;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.List;

/* renamed from: X.0fp  reason: invalid class name and case insensitive filesystem */
public class C09210fp implements C17340vN, C16220sf {
    public final Path A00 = AnonymousClass002.A06();
    public final Path A01 = AnonymousClass002.A06();
    public final Path A02 = AnonymousClass002.A06();
    public final C09450gD A03;
    public final String A04;
    public final List A05 = AnonymousClass001.A0s();

    public void Bm3(List list, List list2) {
        int i = 0;
        while (true) {
            List list3 = this.A05;
            if (i < list3.size()) {
                ((C16780tx) list3.get(i)).Bm3(list, list2);
                i++;
            } else {
                return;
            }
        }
    }

    public Path BAd() {
        Path.Op op;
        Matrix matrix;
        Matrix matrix2;
        Path path = this.A01;
        path.reset();
        C09450gD r1 = this.A03;
        if (!r1.A02) {
            int ordinal = r1.A00.ordinal();
            if (ordinal == 0) {
                int i = 0;
                while (true) {
                    List list = this.A05;
                    if (i >= list.size()) {
                        break;
                    }
                    path.addPath(((C17340vN) list.get(i)).BAd());
                    i++;
                }
            } else {
                if (ordinal == 1) {
                    op = Path.Op.UNION;
                } else if (ordinal == 2) {
                    op = Path.Op.REVERSE_DIFFERENCE;
                } else if (ordinal == 3) {
                    op = Path.Op.INTERSECT;
                } else if (ordinal == 4) {
                    op = Path.Op.XOR;
                }
                Path path2 = this.A02;
                path2.reset();
                Path path3 = this.A00;
                path3.reset();
                List list2 = this.A05;
                for (int size = list2.size() - 1; size >= 1; size--) {
                    C17340vN r11 = (C17340vN) list2.get(size);
                    if (r11 instanceof C09270fv) {
                        C09270fv r112 = (C09270fv) r11;
                        List A002 = r112.A00();
                        for (int A042 = AnonymousClass002.A04(A002, 1); A042 >= 0; A042--) {
                            Path BAd = ((C17340vN) A002.get(A042)).BAd();
                            AnonymousClass0QZ r0 = r112.A02;
                            if (r0 != null) {
                                matrix2 = r0.A00();
                            } else {
                                matrix2 = r112.A04;
                                matrix2.reset();
                            }
                            BAd.transform(matrix2);
                            path2.addPath(BAd);
                        }
                    } else {
                        path2.addPath(r11.BAd());
                    }
                }
                C17340vN r3 = (C17340vN) list2.get(0);
                if (r3 instanceof C09270fv) {
                    C09270fv r32 = (C09270fv) r3;
                    List A003 = r32.A00();
                    for (int i2 = 0; i2 < A003.size(); i2++) {
                        Path BAd2 = ((C17340vN) A003.get(i2)).BAd();
                        AnonymousClass0QZ r02 = r32.A02;
                        if (r02 != null) {
                            matrix = r02.A00();
                        } else {
                            matrix = r32.A04;
                            matrix.reset();
                        }
                        BAd2.transform(matrix);
                        path3.addPath(BAd2);
                    }
                } else {
                    path3.set(r3.BAd());
                }
                path.op(path3, path2, op);
                return path;
            }
        }
        return path;
    }

    public String getName() {
        return this.A04;
    }

    public C09210fp(C09450gD r2) {
        this.A04 = r2.A01;
        this.A03 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Aw0(java.util.ListIterator r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x000d
            java.lang.Object r0 = r3.previous()
            if (r0 == r2) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = r3.previous()
            boolean r0 = r1 instanceof X.C17340vN
            if (r0 == 0) goto L_0x000d
            java.util.List r0 = r2.A05
            r0.add(r1)
            r3.remove()
            goto L_0x000d
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09210fp.Aw0(java.util.ListIterator):void");
    }
}
