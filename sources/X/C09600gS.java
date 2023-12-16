package X;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0gS  reason: invalid class name and case insensitive filesystem */
public class C09600gS implements C16250si {
    public static final C09600gS A00 = new C09600gS();
    public static final AnonymousClass0T2 A01 = AnonymousClass0T2.A00("c", "v", "i", "o");

    public static PointF A00(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public /* bridge */ /* synthetic */ Object BgT(C10470hz r15, float f) {
        if (r15.A0C() == AnonymousClass0G4.BEGIN_ARRAY) {
            r15.A0G();
        }
        r15.A0H();
        List list = null;
        List list2 = null;
        List list3 = null;
        boolean z = false;
        while (r15.A0N()) {
            int A0A = r15.A0A(A01);
            if (A0A != 0) {
                float f2 = f;
                if (A0A == 1) {
                    list = AnonymousClass0X5.A03(r15, f2);
                } else if (A0A == 2) {
                    list2 = AnonymousClass0X5.A03(r15, f2);
                } else if (A0A != 3) {
                    r15.A0K();
                    r15.A0L();
                } else {
                    list3 = AnonymousClass0X5.A03(r15, f2);
                }
            } else {
                z = r15.A0O();
            }
        }
        r15.A0J();
        if (r15.A0C() == AnonymousClass0G4.END_ARRAY) {
            r15.A0I();
        }
        if (list == null || list2 == null || list3 == null) {
            throw AnonymousClass001.A0c("Shape data was missing information.");
        } else if (list.isEmpty()) {
            return new C05370Tb(new PointF(), Collections.emptyList(), false);
        } else {
            int size = list.size();
            PointF pointF = (PointF) list.get(0);
            ArrayList A0I = AnonymousClass002.A0I(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = (PointF) list.get(i);
                int i2 = i - 1;
                A0I.add(new AnonymousClass0T8(A00((PointF) list.get(i2), (PointF) list3.get(i2)), A00(pointF2, (PointF) list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = (PointF) list.get(0);
                int i3 = size - 1;
                A0I.add(new AnonymousClass0T8(A00((PointF) list.get(i3), (PointF) list3.get(i3)), A00(pointF3, (PointF) list2.get(0)), pointF3));
            }
            return new C05370Tb(pointF, A0I, z);
        }
    }
}
