package X;

import android.graphics.Bitmap;
import com.whatsapp.gallerypicker.GalleryPickerFragment;

/* renamed from: X.8Gg  reason: invalid class name and case insensitive filesystem */
public final class C171228Gg implements C84584Cx {
    public final /* synthetic */ C186058ug A00;
    public final /* synthetic */ C104245Qf A01;
    public final /* synthetic */ AnonymousClass4Z8 A02;
    public final /* synthetic */ GalleryPickerFragment A03;

    public C171228Gg(C186058ug r1, C104245Qf r2, AnonymousClass4Z8 r3, GalleryPickerFragment galleryPickerFragment) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = galleryPickerFragment;
        this.A01 = r2;
    }

    public String BDW() {
        return this.A01.A00();
    }

    public Bitmap BJk() {
        Bitmap Bqg;
        if (this.A02.A02.getTag() != this) {
            return null;
        }
        C186058ug r1 = this.A00;
        if (r1 == null || (Bqg = r1.Bqg(this.A03.A02)) == null) {
            return C1457877h.A00;
        }
        return Bqg;
    }
}
