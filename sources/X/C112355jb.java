package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.material.chip.Chip;

/* renamed from: X.5jb  reason: invalid class name and case insensitive filesystem */
public final class C112355jb implements C184228rS {
    public final /* synthetic */ C152297Yi A00;
    public final /* synthetic */ C125546Il A01;

    public void BNh(Bitmap bitmap) {
        C162457s7.A0J(bitmap, 0);
        C125546Il r0 = this.A01;
        Chip chip = r0.A02;
        chip.setChipIcon(C107335b8.A09(r0.A01, new BitmapDrawable(bitmap), C86614Ku.A04(C18290x4.A0F(chip), this.A00.A02 ? 1 : 0)));
    }

    public C112355jb(C152297Yi r1, C125546Il r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BNg() {
        C125546Il r2 = this.A01;
        Chip chip = r2.A02;
        C152297Yi r4 = this.A00;
        String str = r4.A01.A00;
        C162457s7.A0C(str);
        chip.setChipIconResource(C154257cs.A01(str));
        Drawable chipIcon = chip.getChipIcon();
        if (chipIcon != null) {
            C107335b8.A0B(chipIcon, r2.A01.getColor(C86614Ku.A04(C18290x4.A0F(chip), r4.A02 ? 1 : 0)));
        }
    }
}
