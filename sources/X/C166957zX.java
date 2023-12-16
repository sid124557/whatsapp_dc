package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

/* renamed from: X.7zX  reason: invalid class name and case insensitive filesystem */
public class C166957zX implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener A00;
    public final /* synthetic */ ChipGroup A01;

    public C166957zX(ChipGroup chipGroup) {
        this.A01 = chipGroup;
    }

    public void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.A01;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                view2.setId(AnonymousClass0YH.A00());
            }
            C152997aV r3 = chipGroup.A05;
            Chip chip = (Chip) view2;
            AnonymousClass6C9.A12(chip, r3.A03, chip.getId());
            if (chip.isChecked()) {
                r3.A02(chip);
            }
            chip.A07 = new C170048Bq(r3);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.A00;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    public void onChildViewRemoved(View view, View view2) {
        ChipGroup chipGroup = this.A01;
        if (view == chipGroup && (view2 instanceof Chip)) {
            C152997aV r3 = chipGroup.A05;
            Chip chip = (Chip) view2;
            chip.A07 = null;
            r3.A03.remove(Integer.valueOf(chip.getId()));
            r3.A04.remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.A00;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
