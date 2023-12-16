package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.gallerypicker.GalleryPickerFragment;
import com.whatsapp.storage.StorageUsageMediaPreviewView;

/* renamed from: X.68j  reason: invalid class name and case insensitive filesystem */
public class C1234268j implements AnonymousClass4EM {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C1234268j(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj4;
        this.A03 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }

    public void Axi() {
        ImageView imageView;
        int i;
        switch (this.A04) {
            case 0:
                imageView = (ImageView) this.A02;
                i = ((AnonymousClass4XI) this.A03).A02.A02;
                break;
            case 1:
                imageView = ((AnonymousClass4Z8) this.A02).A02;
                i = ((GalleryPickerFragment) this.A03).A01;
                break;
            default:
                imageView = (ImageView) this.A03;
                i = ((StorageUsageMediaPreviewView) this.A00).A08;
                break;
        }
        imageView.setBackgroundColor(i);
        imageView.setImageDrawable((Drawable) null);
    }

    public /* synthetic */ void BSk() {
    }

    public void Bd0(Bitmap bitmap, boolean z) {
        C95294tG r3;
        C95294tG r32;
        int i;
        C95294tG r33;
        Context context;
        boolean z2;
        C95294tG r34;
        String str;
        C95294tG r35;
        C186058ug r7;
        int i2;
        Drawable drawable;
        C95294tG r36;
        C30471mV r0;
        switch (this.A04) {
            case 0:
                C162457s7.A0J(bitmap, 0);
                MediaGalleryFragmentBase mediaGalleryFragmentBase = ((AnonymousClass4XI) this.A03).A02;
                if (mediaGalleryFragmentBase.A0Q() != null) {
                    C95294tG r37 = (C95294tG) this.A02;
                    if (r37.getTag() == this.A00) {
                        r7 = (C186058ug) this.A01;
                        if (bitmap.equals(C1457877h.A00)) {
                            bitmap = null;
                        }
                        i2 = mediaGalleryFragmentBase.A02;
                        drawable = mediaGalleryFragmentBase.A05;
                        r36 = r37;
                        if (drawable == null) {
                            throw C18270x1.A0S("placeholderDrawable");
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                break;
            case 1:
                z2 = false;
                C162457s7.A0J(bitmap, 0);
                ImageView imageView = ((AnonymousClass4Z8) this.A02).A02;
                if (imageView.getTag() == this.A00) {
                    GalleryPickerFragment galleryPickerFragment = (GalleryPickerFragment) this.A03;
                    if (galleryPickerFragment.A0Q() == null) {
                        return;
                    }
                    if (bitmap.equals(C1457877h.A00)) {
                        C86664Kz.A1R(imageView);
                        imageView.setBackgroundColor(galleryPickerFragment.A01);
                        C186058ug r2 = (C186058ug) this.A01;
                        if (r2 != null) {
                            int type = r2.getType();
                            if (Integer.valueOf(type) != null) {
                                if (type != 0) {
                                    if (type != 1 && type != 2) {
                                        if (type != 3) {
                                            if (type == 4) {
                                                imageView.setBackgroundColor(galleryPickerFragment.A01);
                                                context = galleryPickerFragment.A0R();
                                                str = r2.B9l();
                                                r34 = imageView;
                                                break;
                                            }
                                        } else {
                                            C86604Kt.A0z(galleryPickerFragment.A0G(), imageView, R.color.f5nameremoved);
                                            i = R.drawable.gallery_audio_item;
                                            r32 = imageView;
                                            break;
                                        }
                                    } else {
                                        imageView.setBackgroundColor(galleryPickerFragment.A01);
                                        r33 = imageView;
                                        break;
                                    }
                                } else {
                                    imageView.setBackgroundColor(galleryPickerFragment.A01);
                                    r35 = imageView;
                                    break;
                                }
                            }
                        }
                        imageView.setBackgroundColor(galleryPickerFragment.A01);
                        imageView.setImageResource(0);
                        return;
                    }
                    C86644Kx.A1A(imageView);
                    imageView.setBackgroundResource(0);
                    r3 = imageView;
                    if (!z) {
                        Drawable[] drawableArr = new Drawable[2];
                        drawableArr[0] = galleryPickerFragment.A05;
                        C86614Ku.A1L(imageView, new BitmapDrawable(C08310eF.A09(galleryPickerFragment), bitmap), drawableArr);
                        return;
                    }
                } else {
                    return;
                }
                break;
            default:
                C95294tG r38 = (C95294tG) this.A03;
                if (r38.getTag() == this.A01) {
                    r7 = (AnonymousClass8GZ) this.A02;
                    if (bitmap == StorageUsageMediaPreviewView.A0C) {
                        bitmap = null;
                    }
                    StorageUsageMediaPreviewView storageUsageMediaPreviewView = (StorageUsageMediaPreviewView) this.A00;
                    i2 = storageUsageMediaPreviewView.A08;
                    drawable = storageUsageMediaPreviewView.A0A;
                    r36 = r38;
                    break;
                } else {
                    return;
                }
        }
        boolean z3 = !z;
        context = r36.getContext();
        z2 = true;
        if (bitmap == null) {
            r36.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int type2 = r7.getType();
            if (type2 == 0) {
                r36.setBackgroundColor(i2);
                r35 = r36;
                i = R.drawable.ic_missing_thumbnail_picture;
                r32 = r35;
                r32.setImageResource(i);
            } else if (type2 == 1 || type2 == 2) {
                r36.setBackgroundColor(i2);
                r33 = r36;
                i = R.drawable.ic_missing_thumbnail_video;
                r32 = r33;
                r32.setImageResource(i);
            } else if (type2 == 3) {
                C186058ug r1 = r36.A0A;
                if (!(r1 instanceof AnonymousClass8GZ) || (r0 = ((AnonymousClass8GZ) r1).A03) == null || r0.A09 != 1) {
                    C86604Kt.A0z(context, r36, R.color.f5nameremoved);
                    i = R.drawable.icon_audio_large;
                    r32 = r36;
                } else {
                    C86604Kt.A0z(context, r36, AnonymousClass5Yj.A02(context, R.attr.f3nameremoved, R.color.f5nameremoved));
                    i = R.drawable.icon_ppt_large;
                    r32 = r36;
                }
                r32.setImageResource(i);
            } else if (type2 != 4) {
                r36.setBackgroundColor(i2);
                r36.setImageResource(0);
            } else {
                r36.setBackgroundColor(i2);
                str = r7.B9l();
                r34 = r36;
                r34.setImageDrawable(AnonymousClass5VP.A01(context, str, (String) null, z2));
            }
        } else {
            C86644Kx.A1A(r36);
            r36.setBackgroundColor(0);
            r36.A06 = bitmap;
            r3 = r36;
            if (z3) {
                Drawable[] drawableArr2 = new Drawable[2];
                drawableArr2[0] = drawable;
                C86614Ku.A1L(r36, C86654Ky.A0E(context, bitmap), drawableArr2);
                return;
            }
            r3.setImageBitmap(bitmap);
        }
    }
}
