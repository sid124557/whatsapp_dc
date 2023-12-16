package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.4zm  reason: invalid class name and case insensitive filesystem */
public class C98074zm extends C98084zn {
    public C97964zb A00;
    public boolean A01;
    public final C114635nM A02;
    public final C106685Zz A03;

    /* renamed from: A09 */
    public void A07(C30481mW r7, List list) {
        super.A07(r7, list);
        Context context = getContext();
        C106685Zz r2 = this.A03;
        if (AnonymousClass5WD.A00(context, this.A02, r2, r7, 0, false).A00.A01 != null) {
            this.A00.setVisibility(0);
            this.A00.setMessage(r7, list);
            return;
        }
        this.A00.setVisibility(8);
    }

    public C98074zm(Context context, C103445Mz r2, C114635nM r3, C106685Zz r4) {
        super(context, r2);
        A02();
        this.A03 = r4;
        this.A02 = r3;
    }
}
