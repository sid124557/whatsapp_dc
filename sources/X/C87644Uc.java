package X;

import android.content.res.Configuration;

/* renamed from: X.4Uc  reason: invalid class name and case insensitive filesystem */
public class C87644Uc extends C05550Ty {
    public int A00;
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();

    public void A0D(Configuration configuration) {
        int i;
        int i2 = C06280Wy.A00;
        Integer A0Z = C18290x4.A0Z();
        if ((i2 != 3 && i2 != -1) || this.A00 == (i = configuration.uiMode & 48)) {
            this.A01.A0H(A0Z);
        } else if (i == 16 || i == 32) {
            C06270Wx.A03(this.A01, 1);
        }
    }
}
