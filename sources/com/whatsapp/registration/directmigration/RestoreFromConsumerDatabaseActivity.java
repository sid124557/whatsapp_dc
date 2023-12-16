package com.whatsapp.registration.directmigration;

import X.AnonymousClass0N6;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass10z;
import X.AnonymousClass1R1;
import X.AnonymousClass2QW;
import X.AnonymousClass317;
import X.AnonymousClass4L0;
import X.AnonymousClass4SG;
import X.AnonymousClass68W;
import X.AnonymousClass6C6;
import X.C107695bk;
import X.C1230967c;
import X.C23021Qz;
import X.C29191iQ;
import X.C50602iS;
import X.C53282mq;
import X.C619632y;
import X.C623834u;
import X.C625835r;
import X.C64333Db;
import X.C66423Lj;
import X.C66523Lt;
import X.C72303dV;
import X.C86614Ku;
import X.C86634Kw;
import X.C89644eZ;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.backup.google.GoogleDriveRestoreAnimationView;
import com.whatsapp.components.RoundCornerProgressBar;
import com.whatsapp.wds.components.button.WDSButton;

public class RestoreFromConsumerDatabaseActivity extends C89644eZ {
    public WaTextView A00;
    public WaTextView A01;
    public WaTextView A02;
    public WaTextView A03;
    public AnonymousClass0N6 A04;
    public GoogleDriveRestoreAnimationView A05;
    public RoundCornerProgressBar A06;
    public C625835r A07;
    public C72303dV A08;
    public C66523Lt A09;
    public C66423Lj A0A;
    public C50602iS A0B;
    public AnonymousClass317 A0C;
    public AnonymousClass2QW A0D;
    public AnonymousClass10z A0E;
    public C53282mq A0F;
    public C29191iQ A0G;
    public C619632y A0H;
    public AnonymousClass1R1 A0I;
    public C623834u A0J;
    public C23021Qz A0K;
    public WDSButton A0L;
    public boolean A0M;

    public void A5r() {
        if (!this.A0M) {
            this.A0M = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r2 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r2, this, AnonymousClass4SG.A2t(A2Y, r2, this));
            this.A04 = (AnonymousClass0N6) A2Y.A1u.get();
            this.A09 = AnonymousClass4SG.A2n(A2Y);
            this.A0K = (C23021Qz) A2Y.AWx.get();
            this.A0J = (C623834u) r2.AC9.get();
            this.A0I = C86634Kw.A0p(A2Y);
            this.A07 = (C625835r) A2Y.AM8.get();
            this.A0A = (C66423Lj) A2Y.AUX.get();
            this.A08 = C86614Ku.A0a(A2Y);
            this.A0C = C86614Ku.A0i(A2Y);
            this.A0D = (AnonymousClass2QW) A2Y.A8H.get();
            this.A0H = (C619632y) A2Y.AMu.get();
            this.A0F = (C53282mq) A2Y.AI9.get();
            this.A0G = (C29191iQ) A2Y.AJw.get();
            this.A0B = (C50602iS) A2Y.AR1.get();
        }
    }

    public final void A74() {
        GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView = this.A05;
        if (googleDriveRestoreAnimationView.A01 != 1) {
            googleDriveRestoreAnimationView.A05();
        }
        this.A00.setVisibility(0);
        this.A0L.setVisibility(8);
        this.A03.setText(R.string.f11nameremoved);
        this.A02.setText(R.string.f11nameremoved);
        this.A00.setText(R.string.f11nameremoved);
    }

    public void onBackPressed() {
    }

    public RestoreFromConsumerDatabaseActivity(int i) {
        this.A0M = false;
        AnonymousClass68W.A00(this, 88);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        this.A03 = (WaTextView) findViewById(R.id.restore_from_consumer_title);
        this.A02 = (WaTextView) findViewById(R.id.restore_from_consumer_sub_title);
        this.A00 = (WaTextView) findViewById(R.id.restore_from_consumer_bottom_info);
        this.A0L = (WDSButton) findViewById(R.id.restore_from_consumer_action_btn);
        this.A01 = (WaTextView) findViewById(R.id.restore_from_consumer_progress_description);
        this.A06 = (RoundCornerProgressBar) findViewById(R.id.restore_from_consumer_progress_bar);
        this.A05 = (GoogleDriveRestoreAnimationView) findViewById(R.id.restore_from_consumer_animation_view);
        findViewById(R.id.restore_from_consumer_background_image).setBackgroundDrawable(AnonymousClass0x7.A0J(this, this.A00, R.drawable.graphic_migration));
        AnonymousClass0x2.A10(this.A0L, this, 13);
        A74();
        AnonymousClass10z r0 = (AnonymousClass10z) AnonymousClass4L0.A0F(new C1230967c(this, 1), this).A01(AnonymousClass10z.class);
        this.A0E = r0;
        AnonymousClass6C6.A01(this, r0.A02, 287);
        AnonymousClass6C6.A01(this, this.A0E.A04, 288);
    }

    public RestoreFromConsumerDatabaseActivity() {
        this(0);
    }
}
