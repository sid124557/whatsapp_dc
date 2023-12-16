package X;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0R4  reason: invalid class name */
public abstract class AnonymousClass0R4 {
    public DataSetObserver A00;
    public final DataSetObservable A01 = new DataSetObservable();

    public void A05() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.A00;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.A01.notifyChanged();
    }

    public abstract int A0C();

    public abstract Object A0D(ViewGroup viewGroup, int i);

    public abstract void A0E(ViewGroup viewGroup, Object obj, int i);

    public abstract boolean A0F(View view, Object obj);

    public Parcelable A03() {
        return null;
    }

    public void A06(DataSetObserver dataSetObserver) {
        this.A01.registerObserver(dataSetObserver);
    }

    public void A07(DataSetObserver dataSetObserver) {
        this.A01.unregisterObserver(dataSetObserver);
    }

    public void A08(Parcelable parcelable, ClassLoader classLoader) {
    }

    public float A01(int i) {
        return 1.0f;
    }

    public int A02(Object obj) {
        return -1;
    }

    public CharSequence A04(int i) {
        return null;
    }

    public void A09(ViewGroup viewGroup) {
    }

    public void A0A(ViewGroup viewGroup) {
    }

    public void A0B(ViewGroup viewGroup, Object obj, int i) {
    }
}
