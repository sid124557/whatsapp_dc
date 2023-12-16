package X;

import android.graphics.drawable.Drawable;
import com.whatsapp.community.CommunityFragment;

/* renamed from: X.8zw  reason: invalid class name and case insensitive filesystem */
public class C189068zw extends AnonymousClass4XW {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C189068zw(Drawable drawable, CommunityFragment communityFragment, int i) {
        super(drawable);
        this.A01 = i;
        this.A00 = communityFragment;
    }

    public boolean A04(int i, int i2) {
        int i3;
        if (this.A01 == 0) {
            i3 = 8;
            if (i2 == -1) {
                if (i == 10) {
                    return false;
                }
                return true;
            }
        } else if (i != 8) {
            return false;
        } else {
            i3 = 13;
            if (i2 == 4) {
                return true;
            }
        }
        if (i2 == i3) {
            return true;
        }
        return false;
    }
}
