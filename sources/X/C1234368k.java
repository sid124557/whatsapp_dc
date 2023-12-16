package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.WaMediaThumbnailView;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.util.Log;

/* renamed from: X.68k  reason: invalid class name and case insensitive filesystem */
public class C1234368k implements AnonymousClass4EM {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C1234368k(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A02 = obj;
        this.A01 = obj3;
    }

    public static void A00(Bitmap bitmap, C1234368k r10, boolean z) {
        TransitionDrawable transitionDrawable;
        int i;
        AnonymousClass4ZA r8 = (AnonymousClass4ZA) r10.A00;
        C134366iu r3 = r8.A04;
        if (r3.getTag() == r10.A01) {
            if (bitmap == C1457877h.A00) {
                C86664Kz.A1R(r3);
                C186058ug r5 = (C186058ug) r10.A02;
                int type = r5.getType();
                if (type == 0) {
                    r3.setBackgroundColor(r8.A00);
                    i = R.drawable.ic_missing_thumbnail_picture;
                } else if (type == 1 || type == 2) {
                    r3.setBackgroundColor(r8.A00);
                    i = R.drawable.ic_missing_thumbnail_video;
                } else if (type != 3) {
                    r3.setBackgroundColor(r8.A00);
                    if (type != 4) {
                        r3.setImageResource(0);
                        return;
                    }
                    transitionDrawable = AnonymousClass5VP.A01(r3.getContext(), r5.B9l(), (String) null, false);
                } else {
                    C86604Kt.A0z(r3.getContext(), r3, R.color.f5nameremoved);
                    i = R.drawable.gallery_audio_item;
                }
                r3.setImageResource(i);
                return;
            }
            C86644Kx.A1A(r3);
            r3.setBackgroundResource(0);
            r3.A06 = bitmap;
            if (!z) {
                TransitionDrawable transitionDrawable2 = new TransitionDrawable(new Drawable[]{r8.A01, new BitmapDrawable(r3.getResources(), bitmap)});
                transitionDrawable2.setCrossFadeEnabled(true);
                transitionDrawable2.startTransition(150);
                transitionDrawable = transitionDrawable2;
            } else {
                r3.setImageBitmap(bitmap);
                return;
            }
            r3.setImageDrawable(transitionDrawable);
        }
    }

    public static void A01(C1234368k r1) {
        AnonymousClass4ZA r0 = (AnonymousClass4ZA) r1.A00;
        C134366iu r12 = r0.A04;
        r12.setBackgroundColor(r0.A00);
        r12.setImageDrawable((Drawable) null);
    }

    public void Axi() {
        switch (this.A03) {
            case 0:
                A01(this);
                return;
            case 1:
                AnonymousClass4YX r0 = (AnonymousClass4YX) this.A02;
                WaMediaThumbnailView waMediaThumbnailView = r0.A03;
                waMediaThumbnailView.setBackgroundColor(r0.A01);
                waMediaThumbnailView.setImageDrawable((Drawable) null);
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BSk() {
        C003203q A0Q;
        if (2 - this.A03 == 0 && (A0Q = ((C08310eF) this.A00).A0Q()) != null) {
            A0Q.A5V();
        }
    }

    public void Bd0(Bitmap bitmap, boolean z) {
        int i;
        Uri uri;
        String str;
        C114825nf r1;
        switch (this.A03) {
            case 0:
                A00(bitmap, this, z);
                return;
            case 1:
                C162457s7.A0J(bitmap, 0);
                AnonymousClass4YX r5 = (AnonymousClass4YX) this.A02;
                WaMediaThumbnailView waMediaThumbnailView = r5.A03;
                if (waMediaThumbnailView.getTag() != this.A00) {
                    return;
                }
                if (bitmap.equals(C1457877h.A00)) {
                    C86664Kz.A1R(waMediaThumbnailView);
                    int type = ((C186058ug) this.A01).getType();
                    if (type == 1 || type == 2) {
                        waMediaThumbnailView.setBackgroundColor(r5.A01);
                        i = R.drawable.ic_missing_thumbnail_video;
                    } else {
                        waMediaThumbnailView.setBackgroundColor(r5.A01);
                        i = R.drawable.ic_missing_thumbnail_picture;
                    }
                    waMediaThumbnailView.setImageResource(i);
                    return;
                }
                C86644Kx.A1A(waMediaThumbnailView);
                waMediaThumbnailView.setBackgroundResource(0);
                waMediaThumbnailView.setThumbnail(bitmap);
                if (!z) {
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(waMediaThumbnailView.getResources(), bitmap);
                    Drawable[] drawableArr = new Drawable[2];
                    drawableArr[0] = r5.A02;
                    C86614Ku.A1L(waMediaThumbnailView, bitmapDrawable, drawableArr);
                    return;
                }
                return;
            default:
                ImageComposerFragment imageComposerFragment = (ImageComposerFragment) this.A00;
                Context A1D = imageComposerFragment.A1D();
                if (A1D != null && imageComposerFragment.A00 != null && imageComposerFragment.A08.getTag() == (uri = imageComposerFragment.A00)) {
                    if (this.A02 == null) {
                        C186068uh r12 = (C186068uh) this.A01;
                        String A0A = AnonymousClass4SG.A2l(uri, (MediaComposerActivity) r12).A0A();
                        AnonymousClass5YF A2l = AnonymousClass4SG.A2l(imageComposerFragment.A00, (MediaComposerActivity) r12);
                        synchronized (A2l) {
                            str = A2l.A0B;
                        }
                        if (A0A == null) {
                            C114825nf r0 = imageComposerFragment.A0E;
                            if (r0 != null && !(!r0.A0T.A04.isEmpty())) {
                                RectF A0b = C86664Kz.A0b((float) bitmap.getWidth(), (float) bitmap.getHeight());
                                C114825nf r2 = imageComposerFragment.A0E;
                                r2.A0N.A06 = A0b;
                                r2.A0M.A00 = 0.0f;
                                r2.A07(A0b);
                            }
                        } else {
                            C106985aV A032 = C106985aV.A03(A1D, imageComposerFragment.A08, imageComposerFragment.A09, imageComposerFragment.A0J, A0A);
                            if (!(A032 == null || (r1 = imageComposerFragment.A0E) == null)) {
                                r1.A0M.setDoodle(A032);
                                r1.A0T.A05(str);
                            }
                        }
                    }
                    if (!z) {
                        imageComposerFragment.A08.A06(imageComposerFragment.A07.A03);
                        C003203q A0Q = imageComposerFragment.A0Q();
                        if (A0Q != null) {
                            A0Q.A5V();
                        }
                    } else {
                        AnonymousClass5Y7 r13 = imageComposerFragment.A07;
                        if (bitmap == null) {
                            Log.d("FilterSelectorController/setMediaBitmap/mediaBitmap is null");
                        } else {
                            r13.A04 = bitmap;
                            r13.A09 = false;
                        }
                        AnonymousClass5Y7 r4 = imageComposerFragment.A07;
                        r4.A05((Runnable) null, new C70013Zn(r4, 8), r4.A01);
                    }
                    AnonymousClass5Y7 r02 = imageComposerFragment.A07;
                    r02.A04();
                    C87964Wu r03 = r02.A08;
                    if (r03 != null) {
                        r03.A05();
                    }
                    if (imageComposerFragment.A0T) {
                        imageComposerFragment.A1O();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
