package X;

import android.text.TextUtils;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.5ia  reason: invalid class name and case insensitive filesystem */
public class C111725ia implements C186038ue {
    public int A00;
    public int A01;
    public final C101655Fp A02;
    public final C166137yC A03;
    public final WeakReference A04 = AnonymousClass0x9.A14((Object) null);

    public C111725ia(C101655Fp r2, C166137yC r3, int i, int i2) {
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = i;
        this.A00 = i2;
    }

    public boolean B31() {
        return TextUtils.isEmpty(this.A03.A03);
    }

    public ImageView B8H() {
        return (ImageView) this.A04.get();
    }

    public int B9P() {
        return this.A00;
    }

    public int B9R() {
        return this.A01;
    }

    public String BE7() {
        String str = this.A03.A03;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getId() {
        return this.A03.A00;
    }

    public Integer BAD() {
        return C18290x4.A0c();
    }
}
