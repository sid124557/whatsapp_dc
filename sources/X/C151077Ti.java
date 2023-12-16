package X;

import android.graphics.Bitmap;

/* renamed from: X.7Ti  reason: invalid class name and case insensitive filesystem */
public class C151077Ti {
    public C158637kJ A00;
    public C152947aQ A01;
    public final C186188ut A02;
    public final C180398ky A03;
    public final boolean A04;

    public boolean A00(Bitmap bitmap, int i) {
        try {
            this.A01.A00(i, bitmap);
            return true;
        } catch (IllegalStateException e) {
            Class<C151077Ti> cls = C151077Ti.class;
            Object[] objArr = new Object[1];
            boolean A1Y = C18300x5.A1Y(objArr, i);
            C186438vJ r2 = C161577py.A00;
            if (r2.BI0(6)) {
                r2.B2G(cls.getSimpleName(), AnonymousClass6CA.A0T("Rendering of frame unsuccessful. Frame number: %d", objArr), e);
            }
            return A1Y;
        }
    }

    public C151077Ti(C186188ut r3, C158637kJ r4, boolean z) {
        AnonymousClass91O r1 = new AnonymousClass91O(this, 0);
        this.A03 = r1;
        this.A02 = r3;
        this.A00 = r4;
        this.A04 = z;
        this.A01 = new C152947aQ(r4, r1, z);
    }
}
