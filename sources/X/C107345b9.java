package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.widget.EditText;
import com.whatsapp.R;
import com.whatsapp.emoji.EmojiDescriptor;

/* renamed from: X.5b9  reason: invalid class name and case insensitive filesystem */
public abstract class C107345b9 {
    public static boolean A00;

    public static CharSequence A02(Context context, Paint paint, C184368rg r9, AnonymousClass5Y0 r10, CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        SpannableStringBuilder A002 = A00(context, paint, r9, r10, charSequence2, 1.0f);
        int B97 = r9.B97();
        if (B97 != 0) {
            if (A002 == null) {
                A002 = C18330xA.A00(charSequence);
            }
            SpannableStringBuilder delete = A002.delete(B97 + (Character.charCount(Character.codePointAt(charSequence, B97 - 1)) - 1), A002.length());
            delete.append("…");
            return delete;
        } else if (A002 != null) {
            return A002;
        } else {
            return charSequence2;
        }
    }

    public static CharSequence A03(Context context, Paint paint, AnonymousClass5Y0 r8, CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder A002 = A00(context, paint, (C184368rg) null, r8, charSequence2, 1.0f);
        if (A002 != null) {
            return A002;
        }
        return charSequence2;
    }

    public static CharSequence A04(Context context, Paint paint, AnonymousClass5Y0 r7, CharSequence charSequence, float f) {
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder A002 = A00(context, paint, (C184368rg) null, r7, charSequence2, f);
        if (A002 != null) {
            return A002;
        }
        return charSequence2;
    }

    public static String A06(int[] iArr) {
        StringBuilder sb = new StringBuilder(r3);
        for (int chars : iArr) {
            sb.append(Character.toChars(chars));
        }
        return sb.toString();
    }

    public static SpannableStringBuilder A00(Context context, Paint paint, C184368rg r5, AnonymousClass5Y0 r6, CharSequence charSequence, float f) {
        C148137Hb r0;
        if (paint == null) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            Paint A0Z = C86664Kz.A0Z();
            A0Z.setTextSize((float) dimensionPixelSize);
            r0 = new C148137Hb(A0Z, 1.0f);
        } else {
            r0 = new C148137Hb(paint, f);
        }
        return A01(context, r5, r0, r6, charSequence);
    }

    public static SpannableStringBuilder A01(Context context, C184368rg r18, C148137Hb r19, AnonymousClass5Y0 r20, CharSequence charSequence) {
        boolean z;
        float f;
        Object imageSpan;
        CharSequence charSequence2 = charSequence;
        C94284qs r9 = new C94284qs(charSequence2);
        int length = charSequence2.length();
        Paint A0Z = C86664Kz.A0Z();
        SpannableStringBuilder spannableStringBuilder = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i < length) {
                r9.A00 = i;
                long A0N = C86664Kz.A0N(r9);
                int A02 = r9.A02(i, A0N);
                C184368rg r2 = r18;
                if (A0N != -1) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = SpannableStringBuilder.valueOf(charSequence2);
                    }
                    Context context2 = context;
                    Drawable A05 = r20.A05(context2.getResources(), r9, A0N);
                    if (A05 != null) {
                        int i3 = i2 + A02;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i2, i3);
                        C148137Hb r1 = r19;
                        Paint paint = r1.A01;
                        Paint.FontMetricsInt A002 = C106285Yi.A00(paint);
                        if (A002 != null) {
                            int A06 = AnonymousClass001.A06(r1.A00 * paint.getTextSize(), 1.1f);
                            A05.setBounds(0, 0, A06, A06);
                            imageSpan = new AnonymousClass54J(context2, A002, A05, subSequence);
                        } else {
                            if (paint.getFontMetrics() != null) {
                                f = (r1.A00 * paint.getTextSize() * 1.1f) + 0.5f;
                            } else {
                                f = AnonymousClass000.A0B(context2).scaledDensity * 22.0f;
                            }
                            int i4 = (int) f;
                            A05.setBounds(0, 0, i4, i4);
                            imageSpan = new ImageSpan(A05, 0);
                        }
                        spannableStringBuilder.setSpan(imageSpan, i2, i3, 33);
                        if (r18 != null) {
                            z = true;
                        } else {
                            continue;
                        }
                    } else if (!AnonymousClass0S9.A00(A0Z, charSequence2.subSequence(i, i + A02).toString())) {
                        spannableStringBuilder.setSpan(new C87074Mz(), i2, i2 + A02, 33);
                    }
                    i2 += A02;
                    i += A02;
                } else if (r18 != null) {
                    z = false;
                } else {
                    continue;
                    i2 += A02;
                    i += A02;
                }
                if (!r2.Bdn(i, z)) {
                    break;
                }
                i2 += A02;
                i += A02;
            } else if (charSequence2 instanceof SpannableStringBuilder) {
                return (SpannableStringBuilder) charSequence2;
            }
        }
        return spannableStringBuilder;
    }

    public static CharSequence A05(Context context, AnonymousClass5Y0 r4, CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        Paint A0Z = C86664Kz.A0Z();
        A0Z.setTextSize((float) dimensionPixelSize);
        SpannableStringBuilder A01 = A01(context, (C184368rg) null, new C148137Hb(A0Z, 1.0f), r4, charSequence);
        if (A01 != null) {
            return A01;
        }
        return charSequence;
    }

    public static void A08(Context context, Paint paint, Editable editable, AnonymousClass5Y0 r14, float f) {
        Drawable A05;
        Object imageSpan;
        Paint.FontMetricsInt A002;
        if (!A00) {
            A00 = true;
            String obj = editable.toString();
            int length = obj.length();
            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, length, ImageSpan.class)) {
                if (!(imageSpan2.getDrawable() instanceof C88654aX)) {
                    editable.removeSpan(imageSpan2);
                }
            }
            C94284qs r3 = new C94284qs(obj);
            int i = 0;
            while (i < length) {
                r3.A00 = i;
                long A003 = EmojiDescriptor.A00(r3, false);
                int A02 = r3.A02(i, A003);
                if (!(A003 == -1 || (A05 = r14.A05(context.getResources(), r3, A003)) == null)) {
                    if (paint == null || (A002 = C106285Yi.A00(paint)) == null) {
                        A05.setBounds(0, 0, (int) (AnonymousClass000.A0B(context).scaledDensity * 22.0f), (int) (AnonymousClass000.A0B(context).scaledDensity * 22.0f));
                        imageSpan = new ImageSpan(A05, 0);
                    } else {
                        int A06 = AnonymousClass001.A06(paint.getTextSize(), f);
                        A05.setBounds(0, 0, A06, A06);
                        imageSpan = new AnonymousClass54J(context, A002, A05, obj.substring(i, i + A02));
                    }
                    editable.setSpan(imageSpan, i, i + A02, 33);
                }
                i += A02;
            }
            A00 = false;
        }
    }

    public static void A07(Context context, Paint paint, Editable editable, AnonymousClass5Y0 r4) {
        A08(context, paint, editable, r4, 1.3f);
    }

    public static void A09(EditText editText, int[] iArr, int i) {
        int max = Math.max(0, editText.getSelectionStart());
        int max2 = Math.max(0, editText.getSelectionEnd());
        if (max > max2) {
            int i2 = max2;
            max2 = max;
            max = i2;
        }
        if (i > 0) {
            StringBuilder A0A = C18330xA.A0A(C18290x4.A0m(editText));
            A0A.replace(max, max2, A06(iArr));
            if (AnonymousClass5VB.A00(A0A) > i) {
                return;
            }
        }
        editText.getText().replace(max, max2, A06(iArr));
        int i3 = 0;
        for (int charCount : iArr) {
            i3 += Character.charCount(charCount);
        }
        if (max <= editText.length() - i3) {
            editText.setSelection(max + i3);
        }
    }
}
