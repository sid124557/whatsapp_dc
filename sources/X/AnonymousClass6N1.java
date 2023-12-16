package X;

import android.os.SystemClock;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.PointEditor;
import java.util.AbstractCollection;
import java.util.ArrayList;

/* renamed from: X.6N1  reason: invalid class name */
public class AnonymousClass6N1 extends MarkerEditor implements PointEditor {
    public final AnonymousClass84A A00;
    public final ArrayList A01 = AnonymousClass001.A0s();

    public static void A00(AnonymousClass6N1 r1, Object obj) {
        r1.A01.add(new C155707fN(obj));
    }

    public static void A01(Object obj, AbstractCollection abstractCollection) {
        abstractCollection.add(new C155707fN(obj));
    }

    public void markerEditingCompleted() {
        AnonymousClass84A.A00(this.A00, this, (Object) null);
    }

    public PointEditor pointCustomTimestamp(long j) {
        A01((Object) null, this.A01);
        return this;
    }

    public MarkerEditor pointEditingCompleted() {
        A01((Object) null, this.A01);
        return this;
    }

    public PointEditor pointEditor(String str) {
        ArrayList arrayList = this.A01;
        SystemClock.uptimeMillis();
        A01((Object) null, arrayList);
        return this;
    }

    public PointEditor pointShouldIncludeMetadata(boolean z) {
        A01(Boolean.valueOf(z), this.A01);
        return this;
    }

    public MarkerEditor withLevel(int i) {
        A01(Integer.valueOf(i), this.A01);
        return this;
    }

    public AnonymousClass6N1(AnonymousClass84A r2) {
        this.A00 = r2;
    }

    public MarkerEditor point(String str, String str2, long j) {
        A00(this, str2);
        return this;
    }

    public MarkerEditor pointWithMetadata(String str, String str2, long j) {
        A00(this, str2);
        return this;
    }

    public PointEditor addPointData(String str, double d) {
        A01(Double.valueOf(d), this.A01);
        return this;
    }

    public PointEditor addPointData(String str, float f) {
        A01(Float.valueOf(f), this.A01);
        return this;
    }

    public PointEditor addPointData(String str, int i) {
        A01(Integer.valueOf(i), this.A01);
        return this;
    }

    public PointEditor addPointData(String str, long j) {
        A01(Long.valueOf(j), this.A01);
        return this;
    }

    public PointEditor addPointData(String str, String str2) {
        A00(this, str2);
        return this;
    }

    public PointEditor addPointData(String str, boolean z) {
        A01(Boolean.valueOf(z), this.A01);
        return this;
    }

    public PointEditor addPointData(String str, double[] dArr) {
        A00(this, dArr);
        return this;
    }

    public PointEditor addPointData(String str, float[] fArr) {
        A00(this, fArr);
        return this;
    }

    public PointEditor addPointData(String str, int[] iArr) {
        A00(this, iArr);
        return this;
    }

    public PointEditor addPointData(String str, long[] jArr) {
        A00(this, jArr);
        return this;
    }

    public PointEditor addPointData(String str, String[] strArr) {
        A00(this, strArr);
        return this;
    }

    public PointEditor addPointData(String str, boolean[] zArr) {
        A00(this, zArr);
        return this;
    }

    public MarkerEditor annotate(String str, double d) {
        A01(Double.valueOf(d), this.A01);
        return this;
    }

    public MarkerEditor annotate(String str, int i) {
        A01(Integer.valueOf(i), this.A01);
        return this;
    }

    public MarkerEditor annotate(String str, long j) {
        A01(Long.valueOf(j), this.A01);
        return this;
    }

    public MarkerEditor annotate(String str, String str2) {
        A00(this, str2);
        return this;
    }

    public MarkerEditor annotate(String str, boolean z) {
        A01(Boolean.valueOf(z), this.A01);
        return this;
    }

    public MarkerEditor annotate(String str, double[] dArr) {
        A00(this, dArr);
        return this;
    }

    public MarkerEditor annotate(String str, int[] iArr) {
        A00(this, iArr);
        return this;
    }

    public MarkerEditor annotate(String str, long[] jArr) {
        A00(this, jArr);
        return this;
    }

    public MarkerEditor annotate(String str, String[] strArr) {
        A00(this, strArr);
        return this;
    }

    public MarkerEditor annotate(String str, boolean[] zArr) {
        A00(this, zArr);
        return this;
    }
}
