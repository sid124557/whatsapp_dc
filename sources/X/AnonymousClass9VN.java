package X;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* renamed from: X.9VN  reason: invalid class name */
public class AnonymousClass9VN {
    public static final AnonymousClass9N1 A0K = new AnonymousClass9N1(6);
    public static final AnonymousClass9N1 A0L = new AnonymousClass9N1(5);
    public static final AnonymousClass9N1 A0M = new AnonymousClass9N1(4);
    public static final AnonymousClass9N1 A0N = new AnonymousClass9N1(3);
    public static final AnonymousClass9N2 A0O = new AnonymousClass9N2(9);
    public static final AnonymousClass9N2 A0P = new AnonymousClass9N2(10);
    public static final AnonymousClass9N2 A0Q = new AnonymousClass9N2(14);
    public static final AnonymousClass9N2 A0R = new AnonymousClass9N2(13);
    public static final AnonymousClass9N2 A0S = new AnonymousClass9N2(17);
    public static final AnonymousClass9N2 A0T = new AnonymousClass9N2(7);
    public static final AnonymousClass9N2 A0U = new AnonymousClass9N2(20);
    public static final AnonymousClass9N2 A0V = new AnonymousClass9N2(11);
    public static final AnonymousClass9N2 A0W = new AnonymousClass9N2(21);
    public static final AnonymousClass9N2 A0X = new AnonymousClass9N2(0);
    public static final AnonymousClass9N2 A0Y = new AnonymousClass9N2(1);
    public static final AnonymousClass9N2 A0Z = new AnonymousClass9N2(8);
    public static final AnonymousClass9N2 A0a = new AnonymousClass9N2(15);
    public static final AnonymousClass9N2 A0b = new AnonymousClass9N2(19);
    public static final AnonymousClass9N2 A0c = new AnonymousClass9N2(18);
    public static final AnonymousClass9N2 A0d = new AnonymousClass9N2(2);
    public static final AnonymousClass9N2 A0e = new AnonymousClass9N2(16);
    public final int A00;
    public final int A01;
    public final Bitmap A02;
    public final Rect A03;
    public final Rect A04;
    public final Rect A05;
    public final AnonymousClass9S8 A06;
    public final AnonymousClass9VN A07;
    public final Boolean A08;
    public final Float A09;
    public final Float A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final Integer A0G;
    public final Long A0H;
    public final byte[] A0I;
    public final byte[] A0J;

    public Object A00(AnonymousClass9N2 r4) {
        int i = r4.A00;
        switch (i) {
            case 0:
                return this.A0I;
            case 1:
                return this.A06;
            case 2:
                return this.A05;
            case 3:
                return this.A04;
            case 7:
                return this.A0H;
            case 8:
                return this.A0D;
            case 9:
                return this.A09;
            case 10:
                return this.A0B;
            case 11:
                return this.A0A;
            case 13:
                return null;
            case 14:
                return this.A07;
            case 15:
                return this.A0E;
            case 16:
                return this.A0G;
            case 17:
                return this.A08;
            case 18:
                return this.A0F;
            case 19:
                return this.A0J;
            case 20:
                return this.A0C;
            case 21:
                return this.A02;
            default:
                throw C1899593h.A0Y("Invalid photo capture result key: ", AnonymousClass001.A0o(), i);
        }
    }

    public AnonymousClass9VN(C194409St r2) {
        this.A03 = r2.A01;
        this.A04 = r2.A0J;
        this.A01 = r2.A0I;
        this.A00 = r2.A0H;
        this.A0I = r2.A0F;
        this.A0J = r2.A0G;
        this.A06 = r2.A03;
        this.A05 = r2.A02;
        this.A0H = r2.A0E;
        this.A0D = r2.A0A;
        this.A09 = r2.A06;
        this.A0B = r2.A08;
        this.A0A = r2.A07;
        this.A07 = r2.A04;
        this.A0E = r2.A0B;
        this.A0G = r2.A0D;
        this.A08 = r2.A05;
        this.A0F = r2.A0C;
        this.A0C = r2.A09;
        this.A02 = r2.A00;
    }
}
