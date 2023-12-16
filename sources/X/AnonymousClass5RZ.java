package X;

import android.app.Activity;
import android.content.Intent;
import com.whatsapp.businessdirectory.view.activity.DirectoryBusinessChainingActivity;
import com.whatsapp.jid.Jid;

/* renamed from: X.5RZ  reason: invalid class name */
public class AnonymousClass5RZ {
    public final C56972sr A00;
    public final C105355Up A01;

    public void A00(Activity activity, AnonymousClass3ZH r6) {
        if (r6.A0H != null && A01(r6) && r6.A0L() != null) {
            C95814uZ r3 = r6.A0H;
            String A0L = r6.A0L();
            Intent A08 = AnonymousClass0x9.A08(activity, DirectoryBusinessChainingActivity.class);
            A08.putExtra("directory_biz_chaining_jid", r3);
            A08.putExtra("directory_biz_chaining_name", A0L);
            activity.startActivity(A08);
        }
    }

    public boolean A01(AnonymousClass3ZH r4) {
        Jid A03;
        C105355Up r2 = this.A01;
        AnonymousClass1VX r1 = r2.A03;
        if (!r1.A0X(1616) || !r2.A04() || !r4.A0R() || (((!r1.A0X(2192) || !r2.A04()) && ((!r1.A0X(1616) || !r2.A04() || !r1.A0X(1764)) && ((A03 = AnonymousClass3ZH.A03(r4)) == null || !A03.getRawString().startsWith("5511")))) || C86624Kv.A1X(r4, r2.A00))) {
            return false;
        }
        return true;
    }

    public AnonymousClass5RZ(C56972sr r1, C105355Up r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
