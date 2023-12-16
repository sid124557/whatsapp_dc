package X;

import com.facebook.quicklog.EventBuilder;
import java.util.AbstractCollection;
import java.util.ArrayList;

/* renamed from: X.846  reason: invalid class name */
public class AnonymousClass846 implements EventBuilder {
    public final AnonymousClass84A A00;
    public final ArrayList A01 = AnonymousClass001.A0s();

    public static void A00(Object obj, AbstractCollection abstractCollection) {
        abstractCollection.add(new C146437Ag(obj));
    }

    public boolean isSampled() {
        return true;
    }

    public void report() {
        AnonymousClass84A.A00(this.A00, this, (Object) null);
    }

    public EventBuilder setActionId(short s) {
        A00(Short.valueOf(s), this.A01);
        return this;
    }

    public EventBuilder setLevel(int i) {
        A00(Integer.valueOf(i), this.A01);
        return this;
    }

    public AnonymousClass846(AnonymousClass84A r2) {
        this.A00 = r2;
    }

    public EventBuilder annotate(String str, double d) {
        A00(Double.valueOf(d), this.A01);
        return this;
    }

    public EventBuilder annotate(String str, int i) {
        A00(Integer.valueOf(i), this.A01);
        return this;
    }

    public EventBuilder annotate(String str, long j) {
        A00(Long.valueOf(j), this.A01);
        return this;
    }

    public EventBuilder annotate(String str, String str2) {
        A00(str2, this.A01);
        return this;
    }

    public EventBuilder annotate(String str, boolean z) {
        A00(Boolean.valueOf(z), this.A01);
        return this;
    }

    public EventBuilder annotate(String str, double[] dArr) {
        A00(dArr, this.A01);
        return this;
    }

    public EventBuilder annotate(String str, int[] iArr) {
        A00(iArr, this.A01);
        return this;
    }

    public EventBuilder annotate(String str, long[] jArr) {
        A00(jArr, this.A01);
        return this;
    }

    public EventBuilder annotate(String str, String[] strArr) {
        A00(strArr, this.A01);
        return this;
    }

    public EventBuilder annotate(String str, boolean[] zArr) {
        A00(zArr, this.A01);
        return this;
    }
}
