package X;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;

/* renamed from: X.8LO  reason: invalid class name */
public class AnonymousClass8LO implements Cloneable {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public float A02 = Float.MAX_VALUE;
    public float A03 = 1.0f;
    public float A04 = 0.0f;
    public float A05 = 0.0f;
    public float A06 = 0.0f;
    public float A07 = 0.0f;
    public int A08 = -1;
    public int A09 = 0;
    public int A0A = 0;
    public int A0B = 0;
    public int A0C = 0;
    public int A0D = -16776961;
    public int A0E = Integer.MIN_VALUE;
    public int A0F = Integer.MIN_VALUE;
    public int A0G = -1;
    public int A0H = Integer.MAX_VALUE;
    public int A0I = Integer.MAX_VALUE;
    public int A0J = -1;
    public int A0K = Integer.MIN_VALUE;
    public int A0L = 0;
    public int A0M = -7829368;
    public int A0N = -16777216;
    public int A0O = -1;
    public int A0P = Typeface.DEFAULT.getStyle();
    public ColorStateList A0Q;
    public Typeface A0R;
    public TextUtils.TruncateAt A0S;
    public C15770ru A0T;
    public C142116wf A0U = C142116wf.TEXT_START;
    public AnonymousClass7JH A0V = null;
    public C141396vV A0W = C141396vV.TOP;
    public CharSequence A0X;
    public String A0Y;
    public boolean A0Z = true;
    public boolean A0a = false;
    public boolean A0b;
    public boolean A0c = false;

    public static void A00(AnonymousClass8LO r2, Integer num) {
        C142116wf r0;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 1) {
                r0 = C142116wf.CENTER;
            } else if (intValue == 8388611 || intValue != 8388613) {
                r0 = C142116wf.TEXT_START;
            } else {
                r0 = C142116wf.TEXT_END;
            }
            r2.A0U = r0;
        }
    }

    public AnonymousClass8LO A01() {
        try {
            return (AnonymousClass8LO) super.clone();
        } catch (CloneNotSupportedException e) {
            throw C18330xA.A09(e);
        }
    }
}
