package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.5UX  reason: invalid class name */
public class AnonymousClass5UX {
    public final C33081sP A00;
    public final AnonymousClass7DV A01 = new AnonymousClass7DV(this);
    public final C54292oU A02;
    public final C56982ss A03;
    public final AnonymousClass1VX A04;

    public Bitmap A04(AnonymousClass3ZH r3, float f, int i) {
        Bitmap A022;
        if (f >= 0.0f || f == -2.14748365E9f) {
            A022 = A02(this.A02.A00, f, A00(r3), i);
        } else {
            A022 = A03(this.A02.A00, A00(r3));
        }
        if (i != 0) {
            return Bitmap.createScaledBitmap(A022, i, i, true);
        }
        return A022;
    }

    public final int A01(C95814uZ r7, boolean z) {
        if (r7 instanceof C135216kJ) {
            return R.drawable.avatar_server_psa;
        }
        if (r7 instanceof C135166kE) {
            return R.drawable.avatar_status;
        }
        if (r7 instanceof AnonymousClass1fS) {
            return R.drawable.avatar_broadcast;
        }
        if (C627336j.A0K(r7)) {
            AnonymousClass1VX r5 = this.A04;
            boolean z2 = false;
            if (r5.A0X(982) && this.A03.A06(AnonymousClass34R.A01(r7)) == 1) {
                return R.drawable.vec_ic_avatar_community;
            }
            if (r5.A0X(982) && this.A03.A06(AnonymousClass34R.A01(r7)) == 3) {
                z2 = true;
            }
            boolean A0R = this.A03.A0R(r7);
            if (z2) {
                if (C1001059l.A03) {
                    return R.drawable.avatar_announcement_experimental;
                }
                return R.drawable.avatar_announcement;
            } else if (A0R) {
                return R.drawable.avatar_linked_general_group;
            } else {
                if (z) {
                    return R.drawable.avatar_group_large_v2;
                }
                return R.drawable.avatar_group;
            }
        } else if (r7 instanceof C95804uY) {
            return R.drawable.avatar_newsletter;
        } else {
            if (z) {
                return R.drawable.avatar_contact_large_v2;
            }
            return R.drawable.avatar_contact;
        }
    }

    public final Bitmap A02(Context context, float f, int i, int i2) {
        Drawable A012;
        if (f == -2.14748365E9f) {
            A012 = C59862xc.A00(context.getTheme(), context.getResources(), new AnonymousClass922(1), this.A04, i);
        } else {
            A012 = AnonymousClass0VX.A01(context, i);
        }
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        if (A012 != null) {
            Canvas A06 = AnonymousClass4L0.A06(createBitmap);
            A012.setBounds(0, 0, i2, i2);
            if (A012 instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) A012;
                Paint A0Z = C86664Kz.A0Z();
                float f2 = (float) i2;
                RectF rectF = new RectF(0.0f, 0.0f, f2, f2);
                A0Z.setAntiAlias(true);
                A0Z.setDither(true);
                A0Z.setFilterBitmap(true);
                A06.drawARGB(0, 0, 0, 0);
                A0Z.setColor(C18300x5.A03(context, R.attr.f3nameremoved, R.color.f5nameremoved));
                if (f >= 0.0f) {
                    A06.drawRoundRect(rectF, f, f, A0Z);
                } else {
                    A06.drawArc(rectF, 0.0f, 360.0f, true, A0Z);
                }
                C86634Kw.A18(A0Z, PorterDuff.Mode.SRC_ATOP);
                A06.drawBitmap(bitmapDrawable.getBitmap(), (Rect) null, rectF, A0Z);
            } else {
                A012.draw(A06);
                return createBitmap;
            }
        }
        return createBitmap;
    }

    public Bitmap A03(Context context, int i) {
        Bitmap bitmap;
        C33081sP r4 = this.A00;
        AnonymousClass7DV r2 = this.A01;
        synchronized (r4) {
            if (C107405bG.A0D(context) != r4.A00) {
                r4.A01.clear();
                r4.A00 = AnonymousClass000.A1T(r4.A00 ? 1 : 0);
            }
            SparseArray sparseArray = r4.A01;
            bitmap = (Bitmap) sparseArray.get(i);
            if (bitmap == null) {
                bitmap = r2.A00.A02(context, C18310x6.A01(context), i, C86634Kw.A04(context));
                sparseArray.put(i, bitmap);
            }
        }
        return bitmap;
    }

    public void A05(ImageView imageView, float f, int i, int i2) {
        if (f == -2.14748365E9f && (imageView instanceof WDSProfilePhoto)) {
            ((WDSProfilePhoto) imageView).setProfilePhotoShape(C142746xh.SQUIRCLE);
        }
        imageView.setImageBitmap(A02(imageView.getContext(), f, i, i2));
    }

    public AnonymousClass5UX(C33081sP r2, C54292oU r3, C56982ss r4, AnonymousClass1VX r5) {
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r2;
    }

    public int A00(AnonymousClass3ZH r3) {
        return A01(AnonymousClass3ZH.A01(r3), false);
    }

    public void A06(ImageView imageView, int i) {
        imageView.setImageBitmap(A03(imageView.getContext(), i));
    }

    public void A07(ImageView imageView, AnonymousClass3ZH r4) {
        A06(imageView, A01(AnonymousClass3ZH.A01(r4), false));
    }
}
