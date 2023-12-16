package X;

import android.app.Activity;
import android.content.Intent;
import com.whatsapp.RequestPermissionActivity;
import java.util.List;

/* renamed from: X.5Tp  reason: invalid class name and case insensitive filesystem */
public class C105105Tp {
    public final C69263Wi A00;
    public final AnonymousClass5ZR A01;
    public final AnonymousClass33p A02;
    public final C115845pK A03;
    public final C115855pL A04;
    public final AnonymousClass4UC A05 = AnonymousClass0x9.A0b();
    public final AnonymousClass4FS A06;
    public final C183538qC A07;

    public final boolean A03(Activity activity, C08310eF r10, AnonymousClass4BK r11, String str, List list) {
        boolean A0m;
        AnonymousClass5ZR r1 = this.A01;
        Activity activity2 = activity;
        if (!r1.A0E()) {
            if (r10 != null) {
                A0m = RequestPermissionActivity.A0s(r10, r1);
            } else {
                A0m = RequestPermissionActivity.A0m(activity, r1);
            }
            if (!A0m) {
                return false;
            }
        }
        this.A06.BkM(new C71613cO(this, r11, list, activity2, str, 10));
        return true;
    }

    public void A00(Intent intent) {
        if (intent != null) {
            AnonymousClass33p r3 = this.A02;
            boolean A1W = C18280x3.A1W(AnonymousClass0x2.A0F(r3), "is_status_sharing_with_fb_disabled");
            boolean booleanExtra = intent.getBooleanExtra("feature_disabled", A1W);
            if (booleanExtra != A1W) {
                C18270x1.A0v(r3, "is_status_sharing_with_fb_disabled", booleanExtra);
            }
        }
    }

    public boolean A01() {
        this.A07.get();
        return AnonymousClass000.A1S(A02() ? 1 : 0);
    }

    public boolean A02() {
        this.A07.get();
        C115845pK r3 = this.A03;
        int i = 0;
        while (true) {
            AnonymousClass66F[] r1 = r3.A00;
            if (i >= r1.length) {
                break;
            } else if (!r1[i].BJI()) {
                i++;
            } else if (C18280x3.A1W(AnonymousClass0x2.A0F(this.A02), "is_status_sharing_with_fb_disabled")) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public C105105Tp(C64393Dh r3, C69263Wi r4, C54292oU r5, AnonymousClass5ZR r6, AnonymousClass33p r7, AnonymousClass5PU r8, AnonymousClass4FS r9, C183538qC r10) {
        AnonymousClass3LZ r1 = new AnonymousClass3LZ(r3, r5);
        this.A00 = r4;
        this.A06 = r9;
        this.A01 = r6;
        this.A03 = new C115845pK(r4, r5, r8, r1);
        this.A04 = new C115855pL(r4, r5, r8, r1);
        this.A02 = r7;
        this.A07 = r10;
    }
}
