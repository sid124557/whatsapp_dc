package X;

import android.database.SQLException;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.2b8  reason: invalid class name and case insensitive filesystem */
public class C46132b8 {
    public final C56972sr A00;
    public final C621033m A01;
    public final C65203Gp A02;
    public final AnonymousClass5GE A03;

    public void A00(String str) {
        Set A002;
        C85284Fq A04;
        C65203Gp r3 = this.A02;
        C22441Ob r0 = (C22441Ob) r3.A0c.A00("setting_pushName");
        String str2 = str;
        if (r0 == null) {
            A002 = Collections.emptySet();
        } else {
            A002 = C65203Gp.A00(r3, new AnonymousClass1SG((AnonymousClass33J) null, (String) null, str2, r0.A01.A0H()));
        }
        this.A00.A0W(str);
        try {
            A04 = this.A03.A00.A04();
            C622033z.A03(((AnonymousClass3H0) A04).A03, "user_push_name", str, AnonymousClass5GE.class.getName());
            A04.close();
        } catch (SQLException e) {
            Log.e("UserSettingsStore/updatePushName/Error updating push name", e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        r3.A0O(A002);
        this.A01.A1Q.A0J(C18290x4.A0J(3, str));
        return;
        throw th;
    }

    public C46132b8(C56972sr r1, C621033m r2, C65203Gp r3, AnonymousClass5GE r4) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }
}
