package X;

import android.os.Bundle;
import java.util.List;

/* renamed from: X.11M  reason: invalid class name */
public final class AnonymousClass11M extends C05550Ty implements C1230566x {
    public final Bundle A00;
    public final C06270Wx A01;
    public final C06270Wx A02;
    public final C06270Wx A03 = C18330xA.A01(AnonymousClass001.A0s());
    public final AnonymousClass08M A04;
    public final AnonymousClass08M A05;
    public final AnonymousClass08M A06;
    public final AnonymousClass08M A07;

    public void Brz(int i, boolean z) {
        Bundle bundle;
        String str;
        if (i == 1) {
            bundle = this.A00;
            str = "edit_group_info";
        } else if (i == 2) {
            bundle = this.A00;
            str = "send_messages";
        } else if (i == 3) {
            bundle = this.A00;
            str = "require_membership_approval";
        } else if (i == 4) {
            bundle = this.A00;
            str = "add_other_participants";
        } else {
            return;
        }
        bundle.putBoolean(str, z);
    }

    public void Ba2(boolean z) {
    }

    public AnonymousClass11M(Bundle bundle) {
        this.A00 = bundle;
        Boolean bool = Boolean.FALSE;
        this.A05 = C18330xA.A01(bool);
        this.A06 = C18330xA.A01(bool);
        Boolean bool2 = Boolean.TRUE;
        this.A07 = C18330xA.A01(bool2);
        this.A04 = C18330xA.A01(bool2);
        this.A01 = C18330xA.A01(bool);
        this.A02 = C18330xA.A01(bool2);
        AnonymousClass08M r1 = this.A05;
        Bundle bundle2 = this.A00;
        C06270Wx.A05(r1, bundle2.getBoolean("require_membership_approval", false));
        C06270Wx.A05(this.A06, bundle2.getBoolean("add_other_participants", false));
        C06270Wx.A05(this.A07, bundle2.getBoolean("send_messages", true));
        C06270Wx.A05(this.A04, bundle2.getBoolean("edit_group_info", true));
    }

    public List B4H() {
        return AnonymousClass001.A0s();
    }

    public C06270Wx B4I() {
        return this.A03;
    }

    public C06270Wx B8U() {
        return this.A01;
    }

    public C06270Wx B8V() {
        return this.A04;
    }

    public C06270Wx B8W() {
        return this.A02;
    }

    public C06270Wx B8X() {
        return this.A01;
    }

    public C06270Wx B8Y() {
        return this.A01;
    }

    public C06270Wx B8Z() {
        return this.A02;
    }

    public C06270Wx B8a() {
        return this.A05;
    }

    public C06270Wx B8b() {
        return this.A06;
    }

    public C06270Wx B8d() {
        return this.A01;
    }

    public C06270Wx B8e() {
        return this.A02;
    }

    public C06270Wx B8f() {
        return this.A07;
    }

    public C06270Wx B8g() {
        return this.A02;
    }

    public C06270Wx BC9() {
        return this.A01;
    }

    public AnonymousClass4UC BCz() {
        return AnonymousClass0x9.A0b();
    }

    public C06270Wx BD0() {
        return this.A01;
    }

    public AnonymousClass4UC BD1() {
        return AnonymousClass0x9.A0b();
    }

    public void BPd() {
    }

    public void BPg() {
    }

    public void BZi() {
    }

    public void BZk() {
    }

    public void B2H(C89654ea r1, List list) {
    }
}
