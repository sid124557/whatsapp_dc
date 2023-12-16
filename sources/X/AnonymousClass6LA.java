package X;

import com.facebook.drawee.drawable.ScalingUtils;

/* renamed from: X.6LA  reason: invalid class name */
public final class AnonymousClass6LA extends AnonymousClass7R8 {
    public static AnonymousClass6LA A04;
    public final ScalingUtils.ScaleType A00;
    public final ScalingUtils.ScaleType A01;
    public final ScalingUtils.ScaleType A02;
    public final ScalingUtils.ScaleType A03;

    static {
        AnonymousClass6L9 r1 = new AnonymousClass6L9();
        r1.A05(ScalingUtils.ScaleType.CENTER_INSIDE);
        r1.A06(ScalingUtils.ScaleType.CENTER_INSIDE);
        r1.A04(ScalingUtils.ScaleType.CENTER_INSIDE);
        r1.A00 = C141666vw.HIGH;
        A04 = new AnonymousClass6LA(r1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AnonymousClass001.A1a(obj, AnonymousClass6LA.class)) {
            AnonymousClass6LA r4 = (AnonymousClass6LA) obj;
            if (!AnonymousClass71A.A00(this.A02, r4.A02) || !AnonymousClass71A.A00(this.A01, r4.A01) || this.A03 != r4.A03 || !AnonymousClass71A.A00(this.A00, r4.A00) || !AnonymousClass71A.A00(this.A00, r4.A00)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass6LA(AnonymousClass6L9 r2) {
        super(r2);
        this.A00 = r2.A00();
        this.A02 = r2.A02();
        this.A03 = r2.A03();
        this.A01 = r2.A01();
    }

    public int hashCode() {
        return ((AnonymousClass6CA.A01(AnonymousClass6CA.A01(AnonymousClass6CA.A01(AnonymousClass000.A08(this.A00, super.hashCode() * 31 * 31 * 31 * 31 * 31 * 31 * 31) * 31 * 31 * 31 * 31 * 31 * 31 * 31 * 31, C18280x3.A04(this.A02)) * 31 * 31, C18280x3.A04(this.A01)) * 31 * 31 * 31 * 31, C18280x3.A04(this.A03)) * 31 * 31) + 1) * 31 * 31 * 31;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ImageOptions{");
        AnonymousClass7W7 r3 = new AnonymousClass7W7(C18310x6.A0n(this));
        r3.A00(this.A00, "priority");
        r3.A00((Object) null, "cacheChoice");
        r3.A00((Object) null, "resizeOptions");
        r3.A00((Object) null, "rotationOptions");
        r3.A00((Object) null, "postprocessor");
        r3.A00((Object) null, "imageDecodeOptions");
        r3.A00((Object) null, "roundingOptions");
        r3.A00((Object) null, "borderOptions");
        r3.A00(this.A00, "actualImageScaleType");
        r3.A00((Object) null, "actualImageFocusPoint");
        String valueOf = String.valueOf(false);
        r3.A00(valueOf, "localThumbnailPreviewsEnabled");
        r3.A00(valueOf, "loadThumbnailOnly");
        r3.A00((Object) null, "bitmapConfig");
        r3.A00((Object) null, "progressiveRenderingEnabled");
        r3.A00((Object) null, "placeholderColor");
        String valueOf2 = String.valueOf(0);
        r3.A00(valueOf2, "placeholderRes");
        r3.A00((Object) null, "placeholderDrawable");
        r3.A00(this.A02, "placeholderScaleType");
        r3.A00((Object) null, "placeholderFocusPoint");
        r3.A00(valueOf, "placeholderApplyRoundingOptions");
        r3.A00(valueOf2, "progressRes");
        r3.A00((Object) null, "progressDrawable");
        r3.A00(this.A03, "progressScaleType");
        r3.A00((Object) null, "errorColor");
        r3.A00(valueOf2, "errorRes");
        r3.A00(this.A01, "errorScaleType");
        r3.A00((Object) null, "errorFocusPoint");
        r3.A00((Object) null, "errorDrawable");
        r3.A00(valueOf, "errorApplyRoundingOptions");
        r3.A00((Object) null, "actualImageColorFilter");
        r3.A00(valueOf2, "overlayRes");
        r3.A00((Object) null, "overlayDrawable");
        r3.A00(valueOf, "resizeToViewport");
        r3.A00(valueOf, "autoPlay");
        r3.A00(String.valueOf(true), "autoStop");
        r3.A00(valueOf, "mPerfMediaRemountInstrumentationFix");
        r3.A00(valueOf2, "fadeDurationMs");
        r3.A00((Object) null, "customDrawableFactory");
        return AnonymousClass000.A0Q(r3, A0o);
    }
}
