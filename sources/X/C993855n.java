package X;

import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.dialogs.ProgressDialogFragment;
import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: X.55n  reason: invalid class name and case insensitive filesystem */
public class C993855n extends AnonymousClass5ZM {
    public AnonymousClass3ZH A00;
    public ProgressDialogFragment A01;
    public Set A02;
    public final DialogFragment A03;
    public final C55562qY A04;
    public final WeakReference A05;
    public final boolean A06;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int A012;
        AnonymousClass3ZH r0 = this.A00;
        C55562qY r1 = this.A04;
        if (r0 != null) {
            A012 = r1.A00(AnonymousClass3ZH.A01(r0));
        } else {
            A012 = r1.A01(this.A02);
        }
        return Integer.valueOf(A012);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        DialogFragment dialogFragment;
        Number number = (Number) obj;
        C08270df r4 = (C08270df) this.A05.get();
        if (r4 != null && !r4.A0K) {
            this.A01.A1V();
            AnonymousClass3ZH r0 = this.A00;
            if (r0 != null) {
                dialogFragment = this.A03;
                C106565Zm.A01(dialogFragment, r0);
            } else {
                Set set = this.A02;
                dialogFragment = this.A03;
                Bundle A08 = AnonymousClass002.A08();
                C86644Kx.A0r(A08, "selection_jids", set);
                dialogFragment.A0u(A08);
            }
            Bundle bundle = dialogFragment.A06;
            bundle.putInt("unsent_count", number.intValue());
            bundle.putBoolean("chatContainsStarredMessages", this.A06);
            C626936e.A06(r4);
            C08240dc r1 = new C08240dc(r4);
            r1.A0C(dialogFragment, (String) null);
            r1.A02();
        }
    }

    public C993855n(DialogFragment dialogFragment, C08270df r3, C55562qY r4, AnonymousClass3ZH r5, boolean z) {
        this.A05 = AnonymousClass0x9.A14(r3);
        this.A04 = r4;
        this.A03 = dialogFragment;
        this.A00 = r5;
        this.A06 = z;
    }

    public C993855n(DialogFragment dialogFragment, C08270df r3, C55562qY r4, Set set, boolean z) {
        this.A05 = AnonymousClass0x9.A14(r3);
        this.A04 = r4;
        this.A03 = dialogFragment;
        this.A02 = set;
        this.A06 = z;
    }
}
