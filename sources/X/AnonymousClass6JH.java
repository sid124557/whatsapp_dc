package X;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.util.Log;

/* renamed from: X.6JH  reason: invalid class name */
public class AnonymousClass6JH extends AnonymousClass0R4 {
    public final AnonymousClass0R4 A00;

    public float A01(int i) {
        return this.A00.A01(i);
    }

    public int A02(Object obj) {
        return this.A00.A02(obj);
    }

    public Parcelable A03() {
        return this.A00.A03();
    }

    public CharSequence A04(int i) {
        AnonymousClass0R4 r1 = this.A00;
        if (r1.A0C() > 0) {
            return r1.A04(i % r1.A0C());
        }
        Log.i("infinitepageadapter/getpagetitle/count is zero");
        return null;
    }

    public void A05() {
        this.A00.A05();
    }

    public void A06(DataSetObserver dataSetObserver) {
        this.A00.A06(dataSetObserver);
    }

    public void A07(DataSetObserver dataSetObserver) {
        this.A00.A07(dataSetObserver);
    }

    public void A08(Parcelable parcelable, ClassLoader classLoader) {
        this.A00.A08(parcelable, classLoader);
    }

    public void A09(ViewGroup viewGroup) {
        this.A00.A09(viewGroup);
    }

    public void A0A(ViewGroup viewGroup) {
        this.A00.A0A(viewGroup);
    }

    public void A0B(ViewGroup viewGroup, Object obj, int i) {
        this.A00.A0B(viewGroup, obj, i);
    }

    public int A0C() {
        AnonymousClass0R4 r0 = this.A00;
        int A0C = r0.A0C();
        int A0C2 = r0.A0C();
        if (A0C < 214748364) {
            return A0C2 * 10;
        }
        return A0C2;
    }

    public Object A0D(ViewGroup viewGroup, int i) {
        AnonymousClass0R4 r1 = this.A00;
        if (r1.A0C() > 0) {
            return r1.A0D(viewGroup, i % r1.A0C());
        }
        Log.i("infinitepageadapter/instantiateitem/count is zero");
        return null;
    }

    public void A0E(ViewGroup viewGroup, Object obj, int i) {
        AnonymousClass0R4 r1 = this.A00;
        if (r1.A0C() <= 0) {
            Log.i("infinitepageadapter/destroyitem/count is zero");
        } else {
            r1.A0E(viewGroup, obj, i % r1.A0C());
        }
    }

    public boolean A0F(View view, Object obj) {
        return this.A00.A0F(view, obj);
    }

    public AnonymousClass6JH(AnonymousClass0R4 r1) {
        this.A00 = r1;
    }
}
