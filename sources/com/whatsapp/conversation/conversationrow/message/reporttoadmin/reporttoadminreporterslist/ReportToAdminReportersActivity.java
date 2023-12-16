package com.whatsapp.conversation.conversationrow.message.reporttoadmin.reporttoadminreporterslist;

import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass2CQ;
import X.AnonymousClass4HY;
import X.AnonymousClass4WV;
import X.AnonymousClass64J;
import X.C105365Uq;
import X.C107695bk;
import X.C114015mM;
import X.C18270x1;
import X.C18280x3;
import X.C64333Db;
import X.C72023d3;
import X.C88834as;
import X.C89644eZ;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.List;

public final class ReportToAdminReportersActivity extends C89644eZ {
    public AnonymousClass2CQ A00;
    public C114015mM A01;
    public boolean A02;

    public void A5r() {
        if (!this.A02) {
            this.A02 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r1 = A0I.A4Z;
            AnonymousClass1Hf.A2G(r1, this);
            C107695bk r0 = r1.A00;
            AnonymousClass1Ha.A23(r1, r0, r0, this);
            AnonymousClass1Ha.A24(r1, this);
            this.A01 = C64333Db.A29(r1);
            this.A00 = (AnonymousClass2CQ) A0I.A0r.get();
        }
    }

    public ReportToAdminReportersActivity(int i) {
        this.A02 = false;
        AnonymousClass4HY.A00(this, 51);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass1Hf.A2E(this);
        setContentView((int) R.layout.f8nameremoved);
        setTitle(R.string.f11nameremoved);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.report_to_admin_reporters_recyclerView);
        List parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("reporters_user_jid");
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = C72023d3.A00;
        }
        C18270x1.A0u(recyclerView);
        AnonymousClass2CQ r2 = this.A00;
        if (r2 != null) {
            C114015mM r1 = this.A01;
            if (r1 != null) {
                C105365Uq A06 = r1.A06(this, "report-to-admin");
                C64333Db r0 = r2.A00.A03;
                recyclerView.setAdapter(new AnonymousClass4WV((AnonymousClass64J) r0.AEN.get(), C64333Db.A26(r0), A06, parcelableArrayListExtra));
                return;
            }
            throw C18270x1.A0S("contactPhotos");
        }
        throw C18270x1.A0S("adapterFactory");
    }

    public ReportToAdminReportersActivity() {
        this(0);
    }
}
