package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;

/* renamed from: X.5UF  reason: invalid class name */
public class AnonymousClass5UF {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Context A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public int[] A09;
    public int[] A0A;
    public int[] A0B;
    public String[] A0C;
    public String[] A0D;

    public static Intent A00(AnonymousClass5UF r0, boolean z) {
        r0.A07 = z;
        return r0.A02();
    }

    public static AnonymousClass5UF A01(Context context) {
        AnonymousClass5UF r1 = new AnonymousClass5UF(context);
        r1.A01 = R.drawable.permission_location;
        r1.A0D = C622534h.A09;
        r1.A0C = new String[]{"android.permission.ACCESS_COARSE_LOCATION"};
        r1.A03 = R.string.f11nameremoved;
        return r1;
    }

    public AnonymousClass5UF(Context context) {
        this.A05 = context;
    }

    public Intent A02() {
        Intent A072 = C18320x8.A07();
        A072.setClassName(this.A05.getPackageName(), "com.whatsapp.RequestPermissionActivity");
        A072.putExtra("drawable_id", this.A01);
        A072.putExtra("drawable_ids", this.A0A);
        A072.putExtra("message_id", this.A02);
        A072.putExtra("message_params_id", this.A0B);
        A072.putExtra("formatted_message_html", this.A06);
        A072.putExtra("cancel_button_message_id", this.A00);
        A072.putExtra("perm_denial_message_id", this.A03);
        A072.putExtra("perm_denial_message_params_id", this.A09);
        A072.putExtra("permissions", this.A0D);
        A072.putExtra("force_ui", this.A07);
        A072.putExtra("minimal_partial_permissions", this.A0C);
        A072.putExtra("title_id", this.A04);
        A072.putExtra("hide_permissions_rationale", this.A08);
        return A072;
    }

    public void A03() {
        this.A01 = R.drawable.permission_contacts_small;
    }

    public void A04() {
        this.A02 = R.string.f11nameremoved;
    }

    public void A05() {
        this.A03 = R.string.f11nameremoved;
    }

    public void A06(String[] strArr) {
        this.A0D = strArr;
    }
}
