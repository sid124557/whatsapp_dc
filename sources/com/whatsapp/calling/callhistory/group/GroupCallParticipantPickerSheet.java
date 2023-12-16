package com.whatsapp.calling.callhistory.group;

import X.AnonymousClass001;
import X.AnonymousClass0RP;
import X.AnonymousClass0YY;
import X.AnonymousClass0x9;
import X.AnonymousClass4L0;
import X.AnonymousClass4M3;
import X.AnonymousClass4SG;
import X.AnonymousClass5CM;
import X.AnonymousClass5CS;
import X.AnonymousClass68W;
import X.AnonymousClass6BG;
import X.C002002f;
import X.C05630Ug;
import X.C107295b4;
import X.C107335b8;
import X.C107695bk;
import X.C109705f3;
import X.C1232167o;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C64333Db;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C88834as;
import X.C989453v;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

public class GroupCallParticipantPickerSheet extends GroupCallParticipantPicker {
    public float A00;
    public float A01;
    public ColorDrawable A02;
    public View A03;
    public View A04;
    public View A05;
    public SearchView A06;
    public BottomSheetBehavior A07;
    public boolean A08;
    public boolean A09;
    public final ViewTreeObserver.OnGlobalLayoutListener A0A;

    public void A5r() {
        if (!this.A08) {
            this.A08 = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            AnonymousClass4SG.A3T(r2, r1, this);
            AnonymousClass4SG.A3M(A2W, r2, this, r2.A6O.get());
            AnonymousClass4SG.A3R(r2, r1, this);
        }
    }

    public final void A7j() {
        this.A06.A0H("");
        C002002f A0W = AnonymousClass001.A0W(this.A03);
        A0W.A01(this.A07);
        A0W.height = (int) this.A00;
        this.A03.setLayoutParams(A0W);
        this.A05.setVisibility(0);
        this.A04.setVisibility(8);
    }

    public final void A7l() {
        C002002f A0W = AnonymousClass001.A0W(this.A03);
        A0W.A01((C05630Ug) null);
        A0W.height = -1;
        this.A03.setLayoutParams(A0W);
        this.A06.A09();
        this.A05.setVisibility(8);
        this.A04.setVisibility(0);
    }

    public void onBackPressed() {
        if (this.A04.getVisibility() == 0) {
            A7j();
        } else {
            this.A07.A0S(5);
        }
    }

    public GroupCallParticipantPickerSheet(int i) {
        this.A08 = false;
        AnonymousClass68W.A00(this, 17);
    }

    public final void A7k() {
        int size;
        Point A072 = AnonymousClass4L0.A07();
        C86604Kt.A0x(this, A072);
        Rect A0N = AnonymousClass001.A0N();
        AnonymousClass001.A0Q(this).getWindowVisibleDisplayFrame(A0N);
        float f = (float) (A072.y - A0N.top);
        this.A01 = f;
        this.A00 = (float) ((int) (f * 0.75f));
        if (!C107295b4.A09(this.A08)) {
            int i = (int) (this.A01 * 0.55f);
            int A022 = C86654Ky.A02(getResources(), R.dimen.f6nameremoved, C18320x8.A00(this, R.dimen.f6nameremoved));
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            int i2 = i + ((dimensionPixelSize / 2) - ((i - A022) % dimensionPixelSize));
            ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("jids");
            if (stringArrayListExtra != null && (size = stringArrayListExtra.size()) > 0) {
                i2 = Math.min(i2, A022 + this.A0H.getSelectedContactsLayoutHeight() + (dimensionPixelSize * size));
            }
            this.A07.A0U(i2, false);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A7k();
        if (this.A04.getVisibility() != 0) {
            ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(this.A03);
            A0T.height = (int) this.A00;
            this.A03.setLayoutParams(A0T);
        }
        this.A09 = true;
        this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A0A);
        this.A03.requestLayout();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int A042 = C86644Kx.A04(this, R.id.action_bar);
        AnonymousClass4SG.A37(this);
        View findViewById = findViewById(R.id.bottom_sheet);
        this.A03 = findViewById;
        this.A07 = BottomSheetBehavior.A01(findViewById);
        this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A0A);
        this.A07.A0d(true);
        this.A07.A0S(5);
        A7k();
        ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(this.A03);
        A0T.height = (int) this.A00;
        this.A03.setLayoutParams(A0T);
        getListView().setNestedScrollingEnabled(true);
        View findViewById2 = findViewById(R.id.background);
        AnonymousClass0YY.A06(findViewById2, 2);
        PointF pointF = new PointF();
        C109705f3.A00(findViewById2, this, pointF, 44);
        AnonymousClass5CS.A00(findViewById2, pointF, 1);
        ColorDrawable colorDrawable = new ColorDrawable();
        this.A02 = colorDrawable;
        AnonymousClass0YY.A04(colorDrawable, findViewById2);
        AlphaAnimation A0H = C86604Kt.A0H();
        A0H.setDuration((long) getResources().getInteger(17694720));
        findViewById2.startAnimation(A0H);
        C1232167o.A00(this.A07, this, 2);
        this.A05 = findViewById(R.id.title_holder);
        View findViewById3 = findViewById(R.id.search_holder_sheet);
        this.A04 = findViewById3;
        findViewById3.setBackgroundResource(R.drawable.search_background);
        this.A04.setVisibility(A042);
        SearchView searchView = (SearchView) this.A04.findViewById(R.id.search_view);
        this.A06 = searchView;
        searchView.setIconifiedByDefault(false);
        this.A06.setQueryHint(getString(R.string.f11nameremoved));
        AnonymousClass0x9.A0F(this.A06, R.id.search_mag_icon).setImageDrawable(new AnonymousClass4M3(AnonymousClass0RP.A00(this, R.drawable.ic_back), this));
        this.A06.A0B = new AnonymousClass5CM(this, 4);
        ImageView A0F = AnonymousClass0x9.A0F(this.A04, R.id.search_back);
        C86614Ku.A1B(C107335b8.A09(getResources(), getResources().getDrawable(R.drawable.ic_back), R.color.f5nameremoved), A0F, this.A0N);
        C989453v.A00(A0F, this, 48);
        C18300x5.A18(findViewById(R.id.search_btn), this, 32);
        List A12 = C86634Kw.A12(getIntent(), UserJid.class, "jids");
        TextView A0L = C18310x6.A0L(this, R.id.sheet_title);
        int size = A12.size();
        int i = R.string.f11nameremoved;
        if (size == 1) {
            i = R.string.f11nameremoved;
        }
        A0L.setText(i);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle.getBoolean("search")) {
            A7l();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("search", C86604Kt.A1Y(this.A04));
    }

    public GroupCallParticipantPickerSheet() {
        this(0);
        this.A0A = new AnonymousClass6BG((Object) this, 5);
    }
}
