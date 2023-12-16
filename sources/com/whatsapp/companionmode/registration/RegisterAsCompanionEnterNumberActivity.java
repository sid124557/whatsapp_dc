package com.whatsapp.companionmode.registration;

import X.AnonymousClass0O1;
import X.AnonymousClass0Y8;
import X.AnonymousClass1Ha;
import X.AnonymousClass4KP;
import X.AnonymousClass4SG;
import X.AnonymousClass5UY;
import X.AnonymousClass5Yj;
import X.C003403v;
import X.C06560Yg;
import X.C102735Kb;
import X.C106175Xx;
import X.C106675Zy;
import X.C107595bZ;
import X.C107695bk;
import X.C18270x1;
import X.C18310x6;
import X.C18320x8;
import X.C47872dy;
import X.C54292oU;
import X.C57612tv;
import X.C64333Db;
import X.C66433Lk;
import X.C86604Kt;
import X.C86624Kv;
import X.C89644eZ;
import X.C91784l5;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.components.PhoneNumberEntry;

public final class RegisterAsCompanionEnterNumberActivity extends C89644eZ {
    public C106175Xx A00;
    public C47872dy A01;
    public C54292oU A02;
    public C102735Kb A03;
    public C66433Lk A04;
    public C106675Zy A05;
    public boolean A06;
    public final AnonymousClass0O1 A07;
    public final AnonymousClass0O1 A08;

    public void A5r() {
        if (!this.A06) {
            this.A06 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A02 = C64333Db.A2q(A2Y);
            this.A05 = C86624Kv.A0W(A2Y);
            this.A04 = C86604Kt.A0e(A2Y);
            this.A00 = C86604Kt.A0N(A2Y);
            this.A01 = (C47872dy) A2Y.A5w.get();
        }
    }

    public RegisterAsCompanionEnterNumberActivity(int i) {
        this.A06 = false;
        C86604Kt.A1K(this, 32);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        PhoneNumberEntry phoneNumberEntry = (PhoneNumberEntry) findViewById(R.id.phone_number_entry);
        C102735Kb r1 = new C102735Kb();
        this.A03 = r1;
        r1.A05 = phoneNumberEntry;
        r1.A02 = phoneNumberEntry.A02;
        r1.A03 = phoneNumberEntry.A03;
        r1.A04 = C18310x6.A0L(this, R.id.registration_country);
        C102735Kb r0 = this.A03;
        if (r0 == null) {
            throw C18270x1.A0S("phoneNumberEntryViewHolder");
        }
        r0.A03.setTextDirection(3);
        AnonymousClass5UY A1p = AnonymousClass1Ha.A1p(this, R.id.phone_number_entry_error);
        phoneNumberEntry.A04 = new C91784l5(this, A1p);
        C102735Kb r12 = this.A03;
        if (r12 == null) {
            throw C18270x1.A0S("phoneNumberEntryViewHolder");
        }
        r12.A01 = C57612tv.A00(r12.A03);
        C102735Kb r13 = this.A03;
        if (r13 == null) {
            throw C18270x1.A0S("phoneNumberEntryViewHolder");
        }
        r13.A00 = C57612tv.A00(r13.A02);
        C102735Kb r02 = this.A03;
        if (r02 == null) {
            throw C18270x1.A0S("phoneNumberEntryViewHolder");
        }
        C18320x8.A13(r02.A04, this, 45);
        C102735Kb r03 = this.A03;
        if (r03 == null) {
            throw C18270x1.A0S("phoneNumberEntryViewHolder");
        }
        C06560Yg.A0C(AnonymousClass0Y8.A07(this, AnonymousClass5Yj.A00(this)), r03.A04);
        phoneNumberEntry.A02.setGravity(3);
        phoneNumberEntry.A03.setHint(R.string.f11nameremoved);
        C18320x8.A16(findViewById(R.id.next_btn), this, A1p, 38);
        C18320x8.A13(findViewById(R.id.help_btn), this, 46);
    }

    public void onDestroy() {
        super.onDestroy();
        C47872dy r0 = this.A01;
        if (r0 != null) {
            r0.A00().A0B();
            return;
        }
        throw C18270x1.A0S("companionRegistrationManager");
    }

    public RegisterAsCompanionEnterNumberActivity() {
        this(0);
        this.A07 = Bid(new C107595bZ(this, 4), new C003403v());
        this.A08 = Bid(new AnonymousClass4KP(this, 0), new C003403v());
    }
}
