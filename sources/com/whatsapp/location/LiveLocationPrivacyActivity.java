package com.whatsapp.location;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass043;
import X.AnonymousClass0YY;
import X.AnonymousClass0x2;
import X.AnonymousClass1Ha;
import X.AnonymousClass2QE;
import X.AnonymousClass2z0;
import X.AnonymousClass4D8;
import X.AnonymousClass4OY;
import X.AnonymousClass4SG;
import X.AnonymousClass5V0;
import X.AnonymousClass5ZR;
import X.AnonymousClass5ZU;
import X.AnonymousClass696;
import X.AnonymousClass93S;
import X.C105365Uq;
import X.C107695bk;
import X.C114015mM;
import X.C159637mD;
import X.C18290x4;
import X.C19340zH;
import X.C55832qz;
import X.C620733j;
import X.C621233o;
import X.C626936e;
import X.C64333Db;
import X.C64773Ex;
import X.C86604Kt;
import X.C86614Ku;
import X.C86664Kz;
import X.C89644eZ;
import X.C95814uZ;
import X.C989653x;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LiveLocationPrivacyActivity extends C89644eZ {
    public View A00;
    public View A01;
    public Button A02;
    public ListView A03;
    public ScrollView A04;
    public TextView A05;
    public AnonymousClass5ZU A06;
    public C105365Uq A07;
    public C114015mM A08;
    public AnonymousClass5ZR A09;
    public AnonymousClass4OY A0A;
    public C621233o A0B;
    public C55832qz A0C;
    public boolean A0D;
    public final AnonymousClass4D8 A0E;
    public final List A0F;

    public void A5r() {
        if (!this.A0D) {
            this.A0D = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A08 = C64333Db.A29(A2Y);
            this.A06 = C64333Db.A28(A2Y);
            this.A0C = C64333Db.A8F(A2Y);
            this.A09 = C64333Db.A2r(A2Y);
            this.A0B = C86664Kz.A1D(A2Y);
        }
    }

    public final void A74() {
        ArrayList A0z;
        List list = this.A0F;
        list.clear();
        C621233o r8 = this.A0B;
        synchronized (r8.A0R) {
            Map A0C2 = r8.A0C();
            A0z = C18290x4.A0z(A0C2);
            long A0H = r8.A0D.A0H();
            Iterator A0v = AnonymousClass001.A0v(A0C2);
            while (A0v.hasNext()) {
                AnonymousClass2QE r5 = (AnonymousClass2QE) A0v.next();
                if (C621233o.A02(r5.A01, A0H)) {
                    C64773Ex r4 = r8.A0A;
                    AnonymousClass2z0 r3 = r5.A02;
                    C95814uZ r0 = r3.A00;
                    C626936e.A06(r0);
                    AnonymousClass0x2.A1F(r4.A07(r0), r3, A0z);
                }
            }
        }
        list.addAll(A0z);
        this.A0A.notifyDataSetChanged();
        boolean isEmpty = list.isEmpty();
        TextView textView = this.A05;
        if (isEmpty) {
            textView.setVisibility(8);
            this.A01.setVisibility(8);
            this.A03.setVisibility(8);
            this.A04.setVisibility(0);
            this.A02.setVisibility(8);
            return;
        }
        C620733j r52 = this.A00;
        long size = (long) list.size();
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass000.A1P(A0L, list.size(), 0);
        textView.setText(r52.A0L(A0L, R.plurals.f9nameremoved, size));
        this.A05.setVisibility(0);
        this.A01.setVisibility(0);
        this.A04.setVisibility(8);
        this.A03.setVisibility(0);
        this.A02.setVisibility(0);
    }

    public Dialog onCreateDialog(int i) {
        if (i != 0) {
            return super.onCreateDialog(i);
        }
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0T(R.string.f11nameremoved);
        A002.A0i(true);
        C19340zH.A05(A002);
        C86614Ku.A1O(A002, this, 39, R.string.f11nameremoved);
        AnonymousClass043 create = A002.create();
        create.A01().A0J(1);
        return create;
    }

    public LiveLocationPrivacyActivity(int i) {
        this.A0D = false;
        C86604Kt.A1K(this, 56);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RequestPermissionActivity.A0n(this, this.A09, R.string.f11nameremoved, R.string.f11nameremoved, 0);
        AnonymousClass1Ha.A1m(this, R.layout.f8nameremoved).A0B(R.string.f11nameremoved);
        this.A07 = this.A08.A06(this, "live-location-privacy-activity");
        this.A0A = new AnonymousClass4OY(this);
        this.A03 = (ListView) findViewById(R.id.list_view);
        View inflate = getLayoutInflater().inflate(R.layout.f8nameremoved, (ViewGroup) null, false);
        AnonymousClass0YY.A06(inflate, 2);
        this.A05 = C86614Ku.A0I(inflate);
        this.A04 = (ScrollView) findViewById(R.id.live_location_not_sharing);
        this.A00 = findViewById(R.id.bottom_button_container);
        this.A02 = (Button) findViewById(R.id.stop_sharing_btn);
        this.A03.addHeaderView(inflate);
        View inflate2 = getLayoutInflater().inflate(R.layout.f8nameremoved, (ViewGroup) null, false);
        this.A01 = inflate2;
        this.A03.addFooterView(inflate2);
        AnonymousClass696.A00(this.A03, this, 9);
        this.A03.setAdapter(this.A0A);
        this.A03.setOnScrollListener(new AnonymousClass93S(this, AnonymousClass1Ha.A1i(this)));
        C989653x.A00(this.A02, this, 5);
        A74();
        this.A0B.A0V(this.A0E);
    }

    public void onDestroy() {
        super.onDestroy();
        C621233o r0 = this.A0B;
        r0.A0V.remove(this.A0E);
        C105365Uq r02 = this.A07;
        if (r02 != null) {
            r02.A00();
        }
    }

    public void onResume() {
        super.onResume();
        LocationSharingService.A04(getApplicationContext(), this.A0B);
    }

    public LiveLocationPrivacyActivity() {
        this(0);
        this.A0F = AnonymousClass001.A0s();
        this.A0E = new C159637mD(this, 1);
    }
}
