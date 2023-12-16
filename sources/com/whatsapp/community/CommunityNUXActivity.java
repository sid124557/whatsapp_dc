package com.whatsapp.community;

import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VX;
import X.AnonymousClass33U;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.C005205m;
import X.C106715a2;
import X.C107695bk;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C46352bU;
import X.C53232ml;
import X.C53602nM;
import X.C58422vE;
import X.C620733j;
import X.C64333Db;
import X.C64653Ej;
import X.C66433Lk;
import X.C71553cI;
import X.C89644eZ;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

public class CommunityNUXActivity extends C89644eZ {
    public C64653Ej A00;
    public C46352bU A01;
    public AnonymousClass33U A02;
    public C53602nM A03;
    public C620733j A04;
    public C53232ml A05;
    public C66433Lk A06;
    public C106715a2 A07;
    public boolean A08;

    public static /* synthetic */ void A0C(CommunityNUXActivity communityNUXActivity) {
        String A002 = communityNUXActivity.A01.A00();
        Integer num = communityNUXActivity.A01.A02;
        AnonymousClass33U r0 = communityNUXActivity.A02;
        Integer A0a = C18290x4.A0a();
        r0.A08(A0a, A0a, num, (Long) null, A002);
        super.onBackPressed();
    }

    public void A5r() {
        if (!this.A08) {
            this.A08 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r1 = A002.A00;
            AnonymousClass1Ha.A23(A002, r1, r1, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A07 = C18280x3.A0Q(r1);
            this.A05 = (C53232ml) A002.AOY.get();
            this.A06 = C64333Db.A8X(A002);
            this.A04 = C64333Db.A2t(A002);
            this.A00 = (C64653Ej) A002.A5c.get();
            this.A02 = (AnonymousClass33U) A002.A5h.get();
            this.A01 = (C46352bU) A002.A5Y.get();
            this.A03 = C18280x3.A0L(r1);
        }
    }

    public void onBackPressed() {
        String A002 = this.A01.A00();
        this.A02.A08(C18310x6.A0e(), C18290x4.A0a(), this.A01.A02, (Long) null, A002);
        super.onBackPressed();
    }

    public CommunityNUXActivity(int i) {
        this.A08 = false;
        AnonymousClass4HY.A00(this, 34);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A05.A01("community", (Object) null);
        AnonymousClass1VX r1 = this.A0D;
        C58422vE r6 = C58422vE.A02;
        if (r1.A0Y(r6, 3246)) {
            setContentView((int) R.layout.f8nameremoved);
        } else {
            setContentView((int) R.layout.f8nameremoved);
            TextView A012 = C005205m.A01(this, R.id.cag_description);
            int A0O = this.A0D.A0O(r6, 2774);
            C620733j r7 = this.A04;
            long j = (long) A0O;
            A012.setText(r7.A0L(new Object[]{r7.A0M().format(j)}, R.plurals.f9nameremoved, j));
        }
        AnonymousClass0x2.A0z(C005205m.A00(this, R.id.community_nux_next_button), this, 25);
        AnonymousClass0x2.A0z(C005205m.A00(this, R.id.community_nux_close), this, 26);
        if (this.A0D.A0Y(r6, 2356)) {
            TextView A013 = C005205m.A01(this, R.id.community_nux_disclaimer_pp);
            String A0F = AnonymousClass002.A0F(this, "625069579217642", new Object[1], 0, R.string.f11nameremoved);
            A013.setText(this.A07.A06(A013.getContext(), new C71553cI((Object) this, 35), A0F, "625069579217642", AnonymousClass0x2.A05(A013)));
            AnonymousClass1Hf.A2C(A013, this, this.A0D);
            A013.setVisibility(0);
        }
        if (this.A0D.A0Y(r6, 3246)) {
            View A002 = C005205m.A00(this, R.id.see_example_communities);
            TextView A014 = C005205m.A01(this, R.id.see_example_communities_text);
            ImageView imageView = (ImageView) C005205m.A00(this, R.id.see_example_communities_arrow);
            String A0F2 = AnonymousClass002.A0F(this, "learn-more", AnonymousClass002.A0L(), 0, R.string.f11nameremoved);
            A014.setText(this.A07.A06(A014.getContext(), new C71553cI((Object) this, 34), A0F2, "learn-more", AnonymousClass0x2.A05(A014)));
            AnonymousClass1Hf.A2C(A014, this, this.A0D);
            C18270x1.A0d(this, imageView, this.A04, R.drawable.chevron_right);
            AnonymousClass0x2.A0z(imageView, this, 24);
            A002.setVisibility(0);
        }
    }

    public CommunityNUXActivity() {
        this(0);
    }
}
