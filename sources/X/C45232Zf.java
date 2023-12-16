package X;

import android.graphics.BitmapFactory;

/* renamed from: X.2Zf  reason: invalid class name and case insensitive filesystem */
public class C45232Zf {
    public int A00 = 1;
    public BitmapFactory.Options A01;
    public boolean A02;

    public String toString() {
        String str;
        if (this.A00 == 0) {
            str = "Cancel";
        } else {
            str = "Allow";
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("thread state = ");
        A0o.append(str);
        A0o.append(", options = ");
        return AnonymousClass000.A0R(this.A01, A0o);
    }
}
