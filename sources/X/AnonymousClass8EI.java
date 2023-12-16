package X;

import android.widget.ImageView;
import com.whatsapp.R;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.8EI  reason: invalid class name */
public final class AnonymousClass8EI implements C186038ue {
    public int A00;
    public int A01;
    public List A02;
    public boolean A03;
    public final int A04;
    public final C108815db A05;
    public final C181758nH A06;
    public final C181768nI A07;
    public final C181778nJ A08;
    public final WeakReference A09;

    public boolean B31() {
        return AnonymousClass001.A1T(this.A04);
    }

    public ImageView B8H() {
        return (ImageView) this.A09.get();
    }

    public int B9P() {
        return this.A00;
    }

    public int B9R() {
        return this.A01;
    }

    public String BE7() {
        String str;
        if (this.A04 != 2 || (str = this.A05.A01) == null) {
            return this.A05.A00;
        }
        return str;
    }

    public String getId() {
        String str = this.A05.A04;
        int i = this.A04;
        StringBuilder A0l = AnonymousClass000.A0l(str);
        A0l.append('_');
        if (i == 1) {
            i = 3;
        }
        return AnonymousClass000.A0h(A0l, i);
    }

    public AnonymousClass8EI(ImageView imageView, C108815db r3, C181758nH r4, C181768nI r5, C181778nJ r6, int i, int i2, int i3) {
        this.A05 = r3;
        this.A04 = i;
        this.A08 = r6;
        this.A06 = r4;
        this.A07 = r5;
        this.A01 = i2;
        this.A00 = i3;
        this.A09 = AnonymousClass0x9.A14(imageView);
    }

    public boolean A00() {
        ImageView B8H = B8H();
        if (B8H == null) {
            return !this.A03;
        }
        String str = (String) B8H.getTag(R.id.image_id);
        int A0K = AnonymousClass001.A0K(B8H.getTag(R.id.image_quality));
        if (this.A03 || !str.equals(this.A05.A04)) {
            return false;
        }
        if (A0K == this.A04 || A0K == 1) {
            return true;
        }
        return false;
    }

    public Integer BAD() {
        return C18290x4.A0c();
    }
}
