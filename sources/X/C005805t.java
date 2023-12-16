package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* renamed from: X.05t  reason: invalid class name and case insensitive filesystem */
public class C005805t extends AnonymousClass0Q5 {
    public Typeface A01(Context context, Resources resources, AnonymousClass0KK r11, int i) {
        try {
            FontFamily.Builder builder = null;
            for (C03920Mb r6 : r11.A00) {
                try {
                    Font build = new Font.Builder(resources, r6.A00).setWeight(r6.A02).setSlant(AnonymousClass000.A1S(r6.A05 ? 1 : 0) ? 1 : 0).setTtcIndex(r6.A01).setFontVariationSettings(r6.A04).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(A00(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    public Typeface A03(Context context, CancellationSignal cancellationSignal, AnonymousClass0MK[] r12, int i) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (AnonymousClass0MK r8 : r12) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(r8.A03, "r", (CancellationSignal) null);
                    if (openFileDescriptor != null) {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(r8.A02).setSlant(AnonymousClass000.A1S(r8.A04 ? 1 : 0) ? 1 : 0).setTtcIndex(r8.A01).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                        openFileDescriptor.close();
                    } else {
                        continue;
                    }
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(A00(build2, i).getStyle()).build();
            throw th;
        } catch (Exception unused2) {
            return null;
        }
    }

    public static final Font A00(FontFamily fontFamily, int i) {
        int i2 = 400;
        if ((i & 1) != 0) {
            i2 = 700;
        }
        FontStyle fontStyle = new FontStyle(i2, AnonymousClass000.A1S(i & 2) ? 1 : 0);
        Font font = fontFamily.getFont(0);
        FontStyle style = font.getStyle();
        int A0A = AnonymousClass001.A0A(fontStyle.getWeight(), style.getWeight()) / 100;
        int i3 = 2;
        if (fontStyle.getSlant() == style.getSlant()) {
            i3 = 0;
        }
        int i4 = A0A + i3;
        for (int i5 = 1; i5 < fontFamily.getSize(); i5++) {
            Font font2 = fontFamily.getFont(i5);
            FontStyle style2 = font2.getStyle();
            int A0A2 = AnonymousClass001.A0A(fontStyle.getWeight(), style2.getWeight()) / 100;
            int i6 = 2;
            if (fontStyle.getSlant() == style2.getSlant()) {
                i6 = 0;
            }
            int i7 = A0A2 + i6;
            if (i7 < i4) {
                font = font2;
                i4 = i7;
            }
        }
        return font;
    }

    public Typeface A02(Context context, Resources resources, String str, int i, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    public AnonymousClass0MK A04(AnonymousClass0MK[] r2, int i) {
        throw AnonymousClass002.A0E("Do not use this function in API 29 or later.");
    }
}
