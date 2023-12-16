package X;

import android.graphics.Point;
import com.whatsapp.R;
import com.whatsapp.gallery.MediaGalleryFragmentBase;

/* renamed from: X.54r  reason: invalid class name and case insensitive filesystem */
public class C991654r extends AnonymousClass5ZM {
    public final AnonymousClass1VX A00;
    public final C147347Dt A01;
    public final C182468oS A02;
    public final boolean A03;

    public C991654r(C15910sA r2, AnonymousClass1VX r3, C147347Dt r4, C182468oS r5, boolean z) {
        super(r2, true);
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r5;
        this.A03 = z;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C186308v5 B0p = this.A02.B0p(!this.A03);
        B0p.getCount();
        return B0p;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C186308v5 r14 = (C186308v5) obj;
        C147347Dt r0 = this.A01;
        boolean z = this.A03;
        MediaGalleryFragmentBase mediaGalleryFragmentBase = r0.A00;
        C162457s7.A0J(r14, 1);
        C003203q A0Q = mediaGalleryFragmentBase.A0Q();
        if (A0Q != null) {
            mediaGalleryFragmentBase.A0L = r14;
            r14.registerContentObserver(mediaGalleryFragmentBase.A0a);
            mediaGalleryFragmentBase.A1Q();
            AnonymousClass5Q0 r1 = mediaGalleryFragmentBase.A0O;
            if (r1 != null) {
                r1.A01(new AnonymousClass8WK(mediaGalleryFragmentBase));
                Point A07 = AnonymousClass4L0.A07();
                C86604Kt.A0x(A0Q, A07);
                int i = mediaGalleryFragmentBase.A03;
                if (i == 0 || i == 1) {
                    int i2 = A07.y;
                    int i3 = A07.x;
                    int dimensionPixelSize = C08310eF.A09(mediaGalleryFragmentBase).getDimensionPixelSize(R.dimen.f6nameremoved);
                    int i4 = ((i2 * i3) / (dimensionPixelSize * dimensionPixelSize)) + 1;
                    C182468oS A1M = mediaGalleryFragmentBase.A1M();
                    if (A1M != null) {
                        C69263Wi A1J = mediaGalleryFragmentBase.A1J();
                        C147357Du r7 = mediaGalleryFragmentBase.A0c;
                        AnonymousClass4C1 r02 = mediaGalleryFragmentBase.A0W;
                        if (r02 != null) {
                            Object obj2 = r02.get();
                            C162457s7.A0H(obj2);
                            AnonymousClass55F r4 = new AnonymousClass55F(mediaGalleryFragmentBase, A1J, r7, A1M, (AnonymousClass7U5) obj2, mediaGalleryFragmentBase.A0d, i4, z);
                            mediaGalleryFragmentBase.A0N = r4;
                            AnonymousClass4FS r03 = mediaGalleryFragmentBase.A0V;
                            if (r03 != null) {
                                AnonymousClass0x7.A1B(r4, r03);
                            } else {
                                throw C18270x1.A0S("waWorkers");
                            }
                        } else {
                            throw C18270x1.A0S("timeBucketsProvider");
                        }
                    }
                } else {
                    mediaGalleryFragmentBase.A01 = r14.getCount();
                    mediaGalleryFragmentBase.A1P();
                    mediaGalleryFragmentBase.A1U(false);
                }
                mediaGalleryFragmentBase.A1O();
                return;
            }
            throw C18270x1.A0S("galleryPartialPermissionProvider");
        }
    }
}
