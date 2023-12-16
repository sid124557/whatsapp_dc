package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;
import java.util.Map;

/* renamed from: X.4W6  reason: invalid class name */
public final class AnonymousClass4W6 extends AnonymousClass09G {
    public long A00 = 1;
    public final AnonymousClass5EH A01;
    public final Map A02 = AnonymousClass001.A0t();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4W6(AnonymousClass5EH r4) {
        super(C86624Kv.A0E(1));
        C162457s7.A0J(r4, 1);
        this.A01 = r4;
        A0E(true);
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        AnonymousClass5EH r5 = this.A01;
        Resources A0G = C18290x4.A0G(viewGroup);
        Chip A0Q = C86654Ky.A0Q(viewGroup);
        int dimensionPixelSize = A0G.getDimensionPixelSize(R.dimen.f6nameremoved);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.leftMargin = dimensionPixelSize;
        marginLayoutParams.rightMargin = dimensionPixelSize;
        A0Q.setTextSize(2, 14.0f);
        A0Q.setLayoutParams(marginLayoutParams);
        A0Q.setChipEndPadding(A0G.getDimension(R.dimen.f6nameremoved));
        A0Q.setChipStartPadding(A0G.getDimension(R.dimen.f6nameremoved));
        return new C125546Il(A0Q, r5.A00.A01.ABf());
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r7, int i) {
        C125546Il r72 = (C125546Il) r7;
        C162457s7.A0J(r72, 0);
        Object A0K = A0K(i);
        C162457s7.A0D(A0K);
        C152297Yi r5 = (C152297Yi) A0K;
        C162457s7.A0J(r5, 0);
        Chip chip = r72.A02;
        C91824lC r1 = r5.A01;
        String str = r1.A01;
        C162457s7.A0C(str);
        chip.setText(str);
        C151167Tr r3 = r72.A03;
        String str2 = r1.A03;
        C162457s7.A0C(str2);
        r3.A00(new C112355jb(r5, r72), str2, (int) r72.A00);
        Context A0F = C18290x4.A0F(chip);
        boolean z = r5.A02;
        AnonymousClass0x2.A0q(A0F, chip, C86614Ku.A04(A0F, z ? 1 : 0));
        Context A0F2 = C18290x4.A0F(chip);
        int i2 = R.attr.f3nameremoved;
        int i3 = R.color.f5nameremoved;
        if (z) {
            i2 = R.attr.f3nameremoved;
            i3 = R.color.f5nameremoved;
        }
        chip.setChipBackgroundColorResource(AnonymousClass5Yj.A02(A0F2, i2, i3));
        C18300x5.A18(chip, r5, 6);
    }

    public long A0B(int i) {
        Map map = this.A02;
        String str = ((C152297Yi) A0K(i)).A01.A00;
        C162457s7.A0C(str);
        Number A0q = AnonymousClass0x9.A0q(str, map);
        if (A0q == null) {
            long j = this.A00;
            this.A00 = 1 + j;
            A0q = Long.valueOf(j);
            map.put(str, A0q);
        }
        return A0q.longValue();
    }
}
