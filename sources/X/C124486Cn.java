package X;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.6Cn  reason: invalid class name and case insensitive filesystem */
public class C124486Cn extends DataSetObserver {
    public final /* synthetic */ TabLayout A00;

    public C124486Cn(TabLayout tabLayout) {
        this.A00 = tabLayout;
    }

    public void onChanged() {
        this.A00.A06();
    }

    public void onInvalidated() {
        this.A00.A06();
    }
}
