package X;

import android.content.res.Resources;
import com.whatsapp.R;
import com.whatsapp.gallery.GalleryRecentsFragment;
import com.whatsapp.gallery.GalleryTabHostFragment;
import java.util.Collection;

/* renamed from: X.4Tc  reason: invalid class name and case insensitive filesystem */
public final class C87484Tc extends AnonymousClass0AZ implements C185038sx {
    public final int A00;
    public final Resources A01;
    public final AnonymousClass5ZS A02;
    public final GalleryTabHostFragment A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Boolean A08;
    public final Boolean A09;
    public final Integer A0A;
    public final Integer A0B;
    public final Long A0C;
    public final Long A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final AnonymousClass66R A0I = C154517dI.A01(new C119715xQ(this));
    public final AnonymousClass66R A0J = C154517dI.A01(new C119725xR(this));
    public final boolean A0K;
    public final boolean A0L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87484Tc(Resources resources, C08270df r3, AnonymousClass5ZS r4, GalleryTabHostFragment galleryTabHostFragment, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Integer num, Integer num2, Long l, Long l2, String str, String str2, String str3, String str4, int i, boolean z, boolean z2) {
        super(r3, 0);
        C162457s7.A0J(resources, 2);
        this.A03 = galleryTabHostFragment;
        this.A01 = resources;
        this.A00 = i;
        this.A0H = str;
        this.A0L = z;
        this.A02 = r4;
        this.A0E = str2;
        this.A0K = z2;
        this.A0C = l;
        this.A0G = str3;
        this.A0A = num;
        this.A04 = bool;
        this.A0F = str4;
        this.A05 = bool2;
        this.A06 = bool3;
        this.A0D = l2;
        this.A08 = bool4;
        this.A07 = bool5;
        this.A09 = bool6;
        this.A0B = num2;
    }

    public CharSequence A04(int i) {
        Resources resources;
        int i2;
        if (i == 0) {
            resources = this.A01;
            i2 = R.string.f11nameremoved;
        } else if (i == 1) {
            resources = this.A01;
            i2 = R.string.f11nameremoved;
        } else {
            throw AnonymousClass000.A0G("Invalid item position: ", AnonymousClass001.A0o(), i);
        }
        return C86624Kv.A0a(resources, i2);
    }

    public int A0C() {
        return 2;
    }

    public C08310eF A0H(int i) {
        AnonymousClass66R r0;
        if (i == 0) {
            r0 = this.A0J;
        } else if (i == 1) {
            r0 = this.A0I;
        } else {
            throw AnonymousClass000.A0G("Invalid item position: ", AnonymousClass001.A0o(), i);
        }
        return (C08310eF) r0.getValue();
    }

    public void BCe(C106105Xq r2, Collection collection) {
        ((GalleryRecentsFragment) this.A0J.getValue()).BCe(r2, collection);
    }

    public void BiW() {
        ((GalleryRecentsFragment) this.A0J.getValue()).BiW();
    }

    public void BnK(C106105Xq r2, Collection collection, Collection collection2) {
        ((GalleryRecentsFragment) this.A0J.getValue()).BnK(r2, collection, collection2);
    }
}
