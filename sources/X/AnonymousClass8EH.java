package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.8EH  reason: invalid class name */
public class AnonymousClass8EH implements C186038ue {
    public final int A00;
    public final int A01;
    public final Drawable A02;
    public final Drawable A03;
    public final C185158tB A04;
    public final String A05;
    public final String A06;
    public final WeakReference A07;

    public boolean B31() {
        return false;
    }

    public ImageView B8H() {
        WeakReference weakReference = this.A07;
        if (weakReference != null) {
            return (ImageView) weakReference.get();
        }
        return null;
    }

    public int B9P() {
        return this.A00;
    }

    public int B9R() {
        return this.A01;
    }

    public Integer BAD() {
        return null;
    }

    public String BE7() {
        return this.A06;
    }

    public String getId() {
        return this.A05;
    }

    public AnonymousClass8EH(Drawable drawable, Drawable drawable2, ImageView imageView, C185158tB r5, String str, String str2, int i, int i2) {
        WeakReference weakReference;
        if (imageView != null) {
            weakReference = AnonymousClass0x9.A14(imageView);
        } else {
            weakReference = null;
        }
        this.A07 = weakReference;
        this.A06 = str;
        this.A05 = str2;
        this.A03 = drawable;
        this.A02 = drawable2;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = r5;
    }
}
