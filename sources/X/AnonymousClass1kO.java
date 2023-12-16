package X;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment;
import com.whatsapp.privacy.checkup.PrivacyCheckupHomeFragment;

/* renamed from: X.1kO  reason: invalid class name */
public abstract class AnonymousClass1kO extends AnonymousClass1Fo {
    public C55912r7 A00;
    public C55602qc A01;

    public PrivacyCheckupBaseFragment A74() {
        int intExtra = getIntent().getIntExtra("ENTRY_POINT", -1);
        PrivacyCheckupHomeFragment privacyCheckupHomeFragment = new PrivacyCheckupHomeFragment();
        Bundle A08 = AnonymousClass002.A08();
        A08.putInt("extra_entry_point", intExtra);
        privacyCheckupHomeFragment.A0u(A08);
        return privacyCheckupHomeFragment;
    }

    public String A75() {
        return "PrivacyCheckupHomeFragment";
    }

    public final void A76(String str, int i) {
        String A02 = AnonymousClass35B.A02(str);
        int max = Math.max(0, i);
        C55602qc r1 = this.A01;
        if (r1 != null) {
            r1.A04(true);
            C55912r7 r12 = this.A00;
            if (r12 != null) {
                r12.A05(A02, AnonymousClass35B.A03(A02, max));
                return;
            }
            throw C18270x1.A0S("privacySettingManager");
        }
        throw C18270x1.A0S("myPresenceManager");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int A012;
        String str;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && intent != null) {
            if (i == 1) {
                A012 = C18320x8.A01(intent, "groupadd");
                if (A012 != 3) {
                    str = "privacy_groupadd";
                } else {
                    return;
                }
            } else if (i == 3) {
                if (intent.hasExtra("online")) {
                    A76("privacy_online", intent.getIntExtra("online", 0));
                }
                A012 = intent.getIntExtra("last_seen", 0);
                if (A012 != 3) {
                    str = "privacy_last_seen";
                } else {
                    return;
                }
            } else if (i == 4 && (A012 = C18320x8.A01(intent, "profile_photo")) != 3) {
                str = "privacy_profile_photo";
            } else {
                return;
            }
            A76(str, A012);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        PrivacyCheckupBaseFragment A74 = A74();
        if (A74 == null) {
            finish();
            return;
        }
        Toolbar A28 = AnonymousClass1Hf.A28(this);
        if (A28 != null) {
            A28.setTitle((CharSequence) getString(R.string.f11nameremoved));
            A28.setNavigationIcon((Drawable) AnonymousClass0x7.A0J(getApplicationContext(), this.A00, R.drawable.ic_back));
            setSupportActionBar(A28);
        }
        C08240dc A0J = AnonymousClass0x2.A0J(this);
        A0J.A0E(A74, A75(), R.id.privacy_checkup_fragment_container);
        A0J.A01();
    }
}
