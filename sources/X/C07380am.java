package X;

import android.view.View;
import android.widget.CompoundButton;

/* renamed from: X.0am  reason: invalid class name and case insensitive filesystem */
public class C07380am implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C01970Cy A01;
    public final /* synthetic */ C153427bI A02;
    public final /* synthetic */ AnonymousClass84O A03;
    public final /* synthetic */ C835248t A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public C07380am(View view, C01970Cy r2, C153427bI r3, AnonymousClass84O r4, C835248t r5, boolean z, boolean z2) {
        this.A01 = r2;
        this.A06 = z;
        this.A00 = view;
        this.A05 = z2;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.A06) {
            C17030uR r1 = (C17030uR) this.A00;
            r1.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            r1.setChecked(this.A05);
            r1.setOnCheckedChangeListener(this);
        }
        C835248t r4 = this.A04;
        if (r4 != null) {
            AnonymousClass84O r3 = this.A03;
            C152057Xj r2 = new C152057Xj();
            r2.A05(r3, 0);
            r2.A05(Boolean.valueOf(z), 1);
            C153427bI r12 = this.A02;
            r2.A05(r12, 2);
            C159377lj.A01(r12, r3, r2.A03(), r4);
        }
    }
}
