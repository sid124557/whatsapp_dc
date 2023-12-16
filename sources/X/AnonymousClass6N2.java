package X;

import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.PointEditor;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6N2  reason: invalid class name */
public class AnonymousClass6N2 extends MarkerEditor implements PointEditor {
    public int A00 = 7;
    public long A01;
    public String A02;
    public String A03;
    public final int A04;
    public final AnonymousClass4FX A05;
    public final C186548vX A06;
    public final Integer A07;

    public MarkerEditor point(String str, String str2, long j) {
        String str3 = str;
        if (str != null) {
            Integer num = this.A07;
            long j2 = j;
            int i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
            String str4 = str2;
            if (num == null) {
                if (i == 0) {
                    this.A06.markerPoint(this.A04, str, str2);
                } else {
                    this.A06.markerPoint(this.A04, str3, str4, j2, TimeUnit.MILLISECONDS);
                    return this;
                }
            } else if (i == 0) {
                this.A06.markerPoint(this.A04, num.intValue(), str, str2);
                return this;
            } else {
                this.A06.markerPoint(this.A04, num.intValue(), str3, str4, j2, TimeUnit.MILLISECONDS);
                return this;
            }
        }
        return this;
    }

    public final void A00(String str) {
        String str2 = this.A02;
        if (str2 != null) {
            CharSequence[] charSequenceArr = new CharSequence[2];
            AnonymousClass000.A16(str2, str, charSequenceArr);
            str = C107575bX.A09(" ; ", charSequenceArr);
        }
        this.A02 = str;
    }

    public void markerEditingCompleted() {
        if (this.A03 != null) {
            pointEditingCompleted();
        }
    }

    public PointEditor pointCustomTimestamp(long j) {
        this.A01 = j;
        return this;
    }

    public MarkerEditor pointEditingCompleted() {
        String str = this.A03;
        if (str == null) {
            this.A05.BLa(this.A04);
        } else {
            point(str, this.A02, this.A01);
        }
        this.A03 = null;
        this.A02 = null;
        this.A01 = -1;
        return this;
    }

    public PointEditor pointEditor(String str) {
        this.A03 = str;
        this.A01 = -1;
        return this;
    }

    public PointEditor pointShouldIncludeMetadata(boolean z) {
        return this;
    }

    public MarkerEditor withLevel(int i) {
        this.A00 = i;
        return this;
    }

    public AnonymousClass6N2(AnonymousClass4FX r2, C186548vX r3, Integer num, int i) {
        this.A06 = r3;
        this.A05 = r2;
        this.A04 = i;
        this.A07 = num;
    }

    public MarkerEditor pointWithMetadata(String str, String str2, long j) {
        point(str, str2, j);
        return this;
    }

    public PointEditor addPointData(String str, double d) {
        Locale locale = Locale.US;
        Object[] A1a = C18310x6.A1a(str);
        A1a[1] = Double.valueOf(d);
        A00(String.format(locale, "%s:%10.5f", A1a));
        return this;
    }

    public PointEditor addPointData(String str, float f) {
        Locale locale = Locale.US;
        Object[] A1a = C18310x6.A1a(str);
        AnonymousClass001.A1P(A1a, f, 1);
        A00(String.format(locale, "%s:%10.5f", A1a));
        return this;
    }

    public PointEditor addPointData(String str, int i) {
        Locale locale = Locale.US;
        Object[] A1a = C18310x6.A1a(str);
        AnonymousClass000.A1P(A1a, i, 1);
        A00(String.format(locale, "%s:%d", A1a));
        return this;
    }

    public PointEditor addPointData(String str, long j) {
        Locale locale = Locale.US;
        Object[] A1a = C18310x6.A1a(str);
        AnonymousClass000.A1Q(A1a, 1, j);
        A00(String.format(locale, "%s:%d", A1a));
        return this;
    }

    public PointEditor addPointData(String str, String str2) {
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A16(str, str2, A0M);
        A00(String.format("%s:%s", A0M));
        return this;
    }

    public PointEditor addPointData(String str, boolean z) {
        Locale locale = Locale.US;
        Object[] A1a = C18310x6.A1a(str);
        AnonymousClass6C7.A1V(A1a, 1, z);
        A00(String.format(locale, "%s:%s", A1a));
        return this;
    }

    public PointEditor addPointData(String str, double[] dArr) {
        Object[] A1a = C18310x6.A1a(str);
        A1a[1] = Arrays.toString(dArr);
        A00(String.format("%s:%s", A1a));
        return this;
    }

    public PointEditor addPointData(String str, float[] fArr) {
        Object[] A1a = C18310x6.A1a(str);
        A1a[1] = Arrays.toString(fArr);
        A00(String.format("%s:%s", A1a));
        return this;
    }

    public PointEditor addPointData(String str, int[] iArr) {
        Locale locale = Locale.US;
        Object[] A1a = C18310x6.A1a(str);
        A1a[1] = Arrays.toString(iArr);
        A00(String.format(locale, "%s:%s", A1a));
        return this;
    }

    public PointEditor addPointData(String str, long[] jArr) {
        Locale locale = Locale.US;
        Object[] A1a = C18310x6.A1a(str);
        A1a[1] = Arrays.toString(jArr);
        A00(String.format(locale, "%s:%s", A1a));
        return this;
    }

    public PointEditor addPointData(String str, String[] strArr) {
        Object[] A1a = C18310x6.A1a(str);
        A1a[1] = Arrays.toString(strArr);
        A00(String.format("%s:%s", A1a));
        return this;
    }

    public PointEditor addPointData(String str, boolean[] zArr) {
        Object[] A1a = C18310x6.A1a(str);
        A1a[1] = Arrays.toString(zArr);
        A00(String.format("%s:%s", A1a));
        return this;
    }

    public MarkerEditor annotate(String str, double d) {
        String str2 = str;
        if (str != null && AnonymousClass757.A00(this.A00)) {
            Integer num = this.A07;
            C186548vX r1 = this.A06;
            double d2 = d;
            if (num == null) {
                r1.markerAnnotate(this.A04, str, d);
            } else {
                r1.markerAnnotate(this.A04, num.intValue(), str2, d2);
                return this;
            }
        }
        return this;
    }

    public MarkerEditor annotate(String str, int i) {
        if (str != null && AnonymousClass757.A00(this.A00)) {
            Integer num = this.A07;
            if (num == null) {
                this.A06.markerAnnotate(this.A04, str, i);
            } else {
                this.A06.markerAnnotate(this.A04, num.intValue(), str, i);
                return this;
            }
        }
        return this;
    }

    public MarkerEditor annotate(String str, long j) {
        String str2 = str;
        if (str != null && AnonymousClass757.A00(this.A00)) {
            Integer num = this.A07;
            C186548vX r1 = this.A06;
            long j2 = j;
            if (num == null) {
                r1.markerAnnotate(this.A04, str, j);
            } else {
                r1.markerAnnotate(this.A04, num.intValue(), str2, j2);
                return this;
            }
        }
        return this;
    }

    public MarkerEditor annotate(String str, String str2) {
        if (!(str == null || str2 == null || !AnonymousClass757.A00(this.A00))) {
            Integer num = this.A07;
            if (num == null) {
                this.A06.markerAnnotate(this.A04, str, str2);
            } else {
                this.A06.markerAnnotate(this.A04, num.intValue(), str, str2);
                return this;
            }
        }
        return this;
    }

    public MarkerEditor annotate(String str, boolean z) {
        if (str != null && AnonymousClass757.A00(this.A00)) {
            Integer num = this.A07;
            if (num == null) {
                this.A06.markerAnnotate(this.A04, str, z);
            } else {
                this.A06.markerAnnotate(this.A04, num.intValue(), str, z);
                return this;
            }
        }
        return this;
    }

    public MarkerEditor annotate(String str, double[] dArr) {
        if (!(str == null || dArr == null || !AnonymousClass757.A00(this.A00))) {
            Integer num = this.A07;
            if (num == null) {
                this.A06.markerAnnotate(this.A04, str, dArr);
            } else {
                this.A06.markerAnnotate(this.A04, num.intValue(), str, dArr);
                return this;
            }
        }
        return this;
    }

    public MarkerEditor annotate(String str, int[] iArr) {
        if (!(str == null || iArr == null || !AnonymousClass757.A00(this.A00))) {
            Integer num = this.A07;
            if (num == null) {
                this.A06.markerAnnotate(this.A04, str, iArr);
            } else {
                this.A06.markerAnnotate(this.A04, num.intValue(), str, iArr);
                return this;
            }
        }
        return this;
    }

    public MarkerEditor annotate(String str, long[] jArr) {
        if (!(str == null || jArr == null || !AnonymousClass757.A00(this.A00))) {
            Integer num = this.A07;
            if (num == null) {
                this.A06.markerAnnotate(this.A04, str, jArr);
            } else {
                this.A06.markerAnnotate(this.A04, num.intValue(), str, jArr);
                return this;
            }
        }
        return this;
    }

    public MarkerEditor annotate(String str, String[] strArr) {
        if (!(str == null || strArr == null || !AnonymousClass757.A00(this.A00))) {
            Integer num = this.A07;
            if (num == null) {
                this.A06.markerAnnotate(this.A04, str, strArr);
            } else {
                this.A06.markerAnnotate(this.A04, num.intValue(), str, strArr);
                return this;
            }
        }
        return this;
    }

    public MarkerEditor annotate(String str, boolean[] zArr) {
        if (!(str == null || zArr == null || !AnonymousClass757.A00(this.A00))) {
            Integer num = this.A07;
            if (num == null) {
                this.A06.markerAnnotate(this.A04, str, zArr);
            } else {
                this.A06.markerAnnotate(this.A04, num.intValue(), str, zArr);
                return this;
            }
        }
        return this;
    }
}
