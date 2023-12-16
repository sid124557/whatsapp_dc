package X;

import com.whatsapp.data.ProfilePhotoChange;

/* renamed from: X.1o7  reason: invalid class name and case insensitive filesystem */
public class C31331o7 extends C30341mI {
    public ProfilePhotoChange A00;
    public String A01;

    public C31331o7(AnonymousClass2z0 r2, long j) {
        super(r2, 6, j);
    }

    public String A1w() {
        String str;
        synchronized (this.A1K) {
            str = this.A01;
        }
        return str;
    }

    public void A1x(String str) {
        synchronized (this.A1K) {
            this.A01 = str;
        }
    }

    public void A1Z(String str) {
        A1x(str);
    }
}
