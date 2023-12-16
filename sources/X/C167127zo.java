package X;

import android.widget.CompoundButton;
import com.whatsapp.group.GroupPermissionsActivity;

/* renamed from: X.7zo  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C167127zo implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C179378j3 A01;

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C179378j3 r0 = this.A01;
        int i = this.A00;
        C1230566x r02 = ((GroupPermissionsActivity) r0).A0B;
        if (r02 == null) {
            throw C86604Kt.A0j();
        }
        r02.Brz(i, z);
    }

    public /* synthetic */ C167127zo(C179378j3 r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
