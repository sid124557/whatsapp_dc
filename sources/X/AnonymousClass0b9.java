package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import java.util.ArrayList;

/* renamed from: X.0b9  reason: invalid class name */
public class AnonymousClass0b9 implements C17050uU, AdapterView.OnItemClickListener {
    public Context A00;
    public LayoutInflater A01;
    public ExpandedMenuView A02;
    public AnonymousClass032 A03;
    public C07890cz A04;
    public C16470tS A05;

    public boolean B3N() {
        return false;
    }

    public void BG6(Context context, C07890cz r3) {
        if (this.A00 != null) {
            this.A00 = context;
            if (this.A01 == null) {
                this.A01 = LayoutInflater.from(context);
            }
        }
        this.A04 = r3;
        AnonymousClass032 r0 = this.A03;
        if (r0 != null) {
            r0.notifyDataSetChanged();
        }
    }

    public void BPH(C07890cz r2, boolean z) {
        C16470tS r0 = this.A05;
        if (r0 != null) {
            r0.BPH(r2, z);
        }
    }

    public void BaE(Parcelable parcelable) {
        SparseArray sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.A02.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public Parcelable Baj() {
        if (this.A02 == null) {
            return null;
        }
        Bundle A08 = AnonymousClass002.A08();
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.A02;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        A08.putSparseParcelableArray("android:menu:list", sparseArray);
        return A08;
    }

    public void Brl(boolean z) {
        AnonymousClass032 r0 = this.A03;
        if (r0 != null) {
            r0.notifyDataSetChanged();
        }
    }

    public int getId() {
        return 0;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C07890cz r3 = this.A04;
        AnonymousClass032 r2 = this.A03;
        C07890cz r0 = r2.A01.A04;
        r0.A06();
        ArrayList arrayList = r0.A08;
        int i2 = r2.A00;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        r3.A0L(AnonymousClass001.A0V(arrayList, i), this, 0);
    }

    public AnonymousClass0b9(Context context) {
        this.A00 = context;
        this.A01 = LayoutInflater.from(context);
    }

    public boolean Az7(C07890cz r2, C07910d1 r3) {
        return false;
    }

    public boolean B2v(C07890cz r2, C07910d1 r3) {
        return false;
    }

    public boolean Bcv(AnonymousClass04J r7) {
        if (!r7.hasVisibleItems()) {
            return false;
        }
        AnonymousClass0b7 r3 = new AnonymousClass0b7(r7);
        C07890cz r5 = r3.A02;
        Context context = r5.A0N;
        AnonymousClass0Uj r2 = new AnonymousClass0Uj(context);
        AnonymousClass0b9 r0 = new AnonymousClass0b9(r2.getContext());
        r3.A01 = r0;
        r0.A05 = r3;
        r5.A09(context, r0);
        AnonymousClass0b9 r1 = r3.A01;
        AnonymousClass032 r02 = r1.A03;
        if (r02 == null) {
            r02 = new AnonymousClass032(r1);
            r1.A03 = r02;
        }
        r2.A0E(r3, r02);
        View view = r5.A02;
        if (view != null) {
            r2.A0P(view);
        } else {
            r2.A0O(r5.A01);
            r2.setTitle(r5.A05);
        }
        r2.A0M(r3);
        AnonymousClass043 create = r2.create();
        r3.A00 = create;
        create.setOnDismissListener(r3);
        WindowManager.LayoutParams attributes = r3.A00.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= AnonymousClass35S.A0F;
        r3.A00.show();
        C16470tS r03 = this.A05;
        if (r03 == null) {
            return true;
        }
        r03.BXO(r7);
        return true;
    }

    public void Bls(C16470tS r1) {
        this.A05 = r1;
    }
}
