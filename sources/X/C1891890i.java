package X;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import com.whatsapp.settings.SettingsChat;

/* renamed from: X.90i  reason: invalid class name and case insensitive filesystem */
public class C1891890i implements CompoundButton.OnCheckedChangeListener {
    public Object A00;
    public final int A01;

    public C1891890i(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        boolean A03;
        switch (this.A01) {
            case 0:
                Chip chip = (Chip) this.A00;
                C178848iC r0 = chip.A07;
                if (r0 != null) {
                    C152997aV r1 = ((C170048Bq) r0).A00;
                    if (z) {
                        A03 = r1.A02(chip);
                    } else {
                        A03 = r1.A03(chip, r1.A01);
                    }
                    if (A03) {
                        r1.A01();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.A05;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                    return;
                }
                return;
            case 1:
                ((SettingsChat) this.A00).A05.A03(!z);
                return;
            case 2:
                AnonymousClass50A r02 = (AnonymousClass50A) this.A00;
                r02.A00 = z;
                r02.A05();
                return;
            default:
                return;
        }
    }
}
