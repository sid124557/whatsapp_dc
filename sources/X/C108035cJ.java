package X;

import android.content.DialogInterface;
import android.os.SystemClock;
import android.widget.CheckBox;
import com.whatsapp.R;
import com.whatsapp.settings.SettingsChatHistoryFragment;

/* renamed from: X.5cJ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C108035cJ implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ CheckBox A01;
    public final /* synthetic */ CheckBox A02;
    public final /* synthetic */ AnonymousClass66L A03;
    public final /* synthetic */ C104355Qq A04;
    public final /* synthetic */ boolean A05;

    public final void onClick(DialogInterface dialogInterface, int i) {
        C104355Qq r5 = this.A04;
        CheckBox checkBox = this.A01;
        AnonymousClass66L r1 = this.A03;
        CheckBox checkBox2 = this.A02;
        int i2 = this.A00;
        boolean z = this.A05;
        boolean isChecked = checkBox.isChecked();
        boolean z2 = !checkBox2.isChecked();
        C1236369e r12 = (C1236369e) r1;
        switch (r12.A01) {
            case 0:
                C89864fP r13 = (C89864fP) r12.A00;
                C621433s.A00(r13.A03, 0);
                r13.A09.BpA(0, R.string.f11nameremoved);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                AnonymousClass6AB r6 = (AnonymousClass6AB) r13.A0Z;
                if (r6.A01 != 0) {
                    AnonymousClass4VQ r0 = ((C113245l7) r6.A00).A3B;
                    r0.A0K();
                    r0.A0J();
                }
                C33601tO r62 = r13.A00;
                if (r62 != null) {
                    r62.A01 = null;
                    r62.A00 = null;
                    r62.A0D(true);
                }
                C33601tO r63 = new C33601tO(r13.A0E, r13.A0o, r13.A01, r13.A02, elapsedRealtime, z2, isChecked);
                r13.A00 = r63;
                r13.A0x.BkL(r63, new Object[0]);
                break;
            case 1:
                SettingsChatHistoryFragment settingsChatHistoryFragment = (SettingsChatHistoryFragment) r12.A00;
                C89114bZ r14 = settingsChatHistoryFragment.A00;
                if (r14 != null) {
                    C621433s.A00(r14, 3);
                    C89114bZ r2 = settingsChatHistoryFragment.A00;
                    if (r2 != null) {
                        r2.BpA(R.string.f11nameremoved, R.string.f11nameremoved);
                        C18270x1.A0w(new C33521tG(settingsChatHistoryFragment.A00, settingsChatHistoryFragment.A03, z2, isChecked), settingsChatHistoryFragment.A0C);
                        break;
                    }
                }
                break;
            default:
                ((AnonymousClass66K) r12.A00).BYT(isChecked);
                break;
        }
        if (i2 == 2 && z != isChecked) {
            C18270x1.A0l(C18270x1.A03(r5.A02), "pref_media_delete_per_conversation", isChecked);
        }
    }

    public /* synthetic */ C108035cJ(CheckBox checkBox, CheckBox checkBox2, AnonymousClass66L r3, C104355Qq r4, int i, boolean z) {
        this.A04 = r4;
        this.A01 = checkBox;
        this.A03 = r3;
        this.A02 = checkBox2;
        this.A00 = i;
        this.A05 = z;
    }
}
