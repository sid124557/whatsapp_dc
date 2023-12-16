package X;

import android.content.Context;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.group.GroupMembershipApprovalRequestsFragment;
import com.whatsapp.group.GroupPendingInvitesFragment;
import com.whatsapp.group.NonAdminGJRFragment;

/* renamed from: X.0zx  reason: invalid class name and case insensitive filesystem */
public class C19410zx extends AnonymousClass0AZ {
    public final int A00;
    public final Context A01;
    public final String A02;
    public final boolean A03;

    public C19410zx(Context context, C08270df r3, String str, boolean z, boolean z2) {
        super(r3, 0);
        this.A01 = context;
        this.A02 = str;
        this.A03 = z2;
        this.A00 = C18280x3.A00(z ? 1 : 0);
    }

    public CharSequence A04(int i) {
        Context context;
        int i2;
        if (i == 0) {
            context = this.A01;
            i2 = R.string.f11nameremoved;
        } else if (i == 1) {
            context = this.A01;
            i2 = R.string.f11nameremoved;
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("The item ");
            A0o.append(i);
            A0o.append(" should be less than: ");
            throw AnonymousClass001.A0c(AnonymousClass000.A0h(A0o, this.A00));
        }
        return C18290x4.A0l(context, i2);
    }

    public C08310eF A0H(int i) {
        Bundle A08;
        C08310eF nonAdminGJRFragment;
        if (i == 0) {
            boolean z = this.A03;
            String str = this.A02;
            A08 = AnonymousClass002.A08();
            if (z) {
                A08.putString("gid", str);
                nonAdminGJRFragment = new GroupMembershipApprovalRequestsFragment();
            } else {
                A08.putString("gid", str);
                nonAdminGJRFragment = new NonAdminGJRFragment();
            }
        } else if (i == 1) {
            String str2 = this.A02;
            A08 = AnonymousClass002.A08();
            A08.putString("gid", str2);
            nonAdminGJRFragment = new GroupPendingInvitesFragment();
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("The item position should be less than: ");
            throw AnonymousClass001.A0c(AnonymousClass000.A0h(A0o, this.A00));
        }
        nonAdminGJRFragment.A0u(A08);
        return nonAdminGJRFragment;
    }

    public int A0C() {
        return this.A00;
    }
}
