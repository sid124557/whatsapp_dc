package com.whatsapp.invites;

import X.AnonymousClass002;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.C107695bk;
import X.C18310x6;
import X.C64333Db;
import X.C89644eZ;
import android.os.Bundle;
import com.whatsapp.R;

public final class SMSPreviewInviteGroupParticipantsActivity extends C89644eZ {
    public boolean A00;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
        }
    }

    public SMSPreviewInviteGroupParticipantsActivity(int i) {
        this.A00 = false;
        AnonymousClass4HY.A00(this, 75);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("invite_trigger_source", 0);
        if (intExtra == 1 || intExtra == 2 || intExtra == 4) {
            setTitle(R.string.f11nameremoved);
            AnonymousClass1Ha.A1t(this);
            Bundle A08 = AnonymousClass002.A08();
            A08.putStringArrayList("sms_invites_jids", getIntent().getStringArrayListExtra("sms_invites_jids"));
            C18310x6.A0z(getIntent(), A08, "group_jid");
            SMSPreviewInviteBottomSheetFragment sMSPreviewInviteBottomSheetFragment = new SMSPreviewInviteBottomSheetFragment();
            Bundle A082 = AnonymousClass002.A08();
            A082.putStringArrayList("sms_invites_jids", getIntent().getStringArrayListExtra("sms_invites_jids"));
            C18310x6.A0z(getIntent(), A082, "group_jid");
            A082.putBoolean("all_participants_non_wa_in_request", getIntent().getBooleanExtra("all_participants_non_wa_in_request", true));
            A082.putInt("invite_trigger_source", intExtra);
            sMSPreviewInviteBottomSheetFragment.A0u(A082);
            sMSPreviewInviteBottomSheetFragment.A1O(getSupportFragmentManager(), "SMSPreviewInviteGroupParticipantsActivity");
            return;
        }
        finish();
    }

    public SMSPreviewInviteGroupParticipantsActivity() {
        this(0);
    }
}
