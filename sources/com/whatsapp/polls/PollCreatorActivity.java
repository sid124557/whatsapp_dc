package com.whatsapp.polls;

import X.AnonymousClass001;
import X.AnonymousClass09T;
import X.AnonymousClass0R8;
import X.AnonymousClass0YZ;
import X.AnonymousClass0x9;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VX;
import X.AnonymousClass344;
import X.AnonymousClass490;
import X.AnonymousClass4L0;
import X.AnonymousClass4SG;
import X.AnonymousClass4Vy;
import X.AnonymousClass4W8;
import X.AnonymousClass5OS;
import X.AnonymousClass5U6;
import X.AnonymousClass5XO;
import X.AnonymousClass6C6;
import X.AnonymousClass6HH;
import X.AnonymousClass6Z3;
import X.C06560Yg;
import X.C1001459r;
import X.C101085Dk;
import X.C101095Dl;
import X.C106405Yw;
import X.C154437dA;
import X.C162457s7;
import X.C18270x1;
import X.C25251aD;
import X.C30451mT;
import X.C617532c;
import X.C621433s;
import X.C86604Kt;
import X.C86654Ky;
import X.C89504d5;
import X.C95814uZ;
import X.C97504yQ;
import X.C989653x;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.filter.SmoothScrollLinearLayoutManager;

public class PollCreatorActivity extends C89504d5 implements AnonymousClass490 {
    public long A00;
    public Vibrator A01;
    public InputMethodManager A02;
    public SwitchCompat A03;
    public NestedScrollView A04;
    public RecyclerView A05;
    public BottomSheetBehavior A06;
    public AnonymousClass6Z3 A07;
    public C101085Dk A08;
    public C101095Dl A09;
    public AnonymousClass5U6 A0A;
    public C95814uZ A0B;
    public AnonymousClass4W8 A0C;
    public PollCreatorViewModel A0D;
    public C617532c A0E;
    public AnonymousClass5XO A0F;
    public boolean A0G;

    public void BR5(DialogInterface dialogInterface, int i, int i2) {
        if (i2 != -3) {
            if (i2 == -2) {
                finish();
                return;
            } else if (i2 != -1) {
                return;
            }
        }
        dialogInterface.dismiss();
    }

    public void onBackPressed() {
        PollCreatorViewModel pollCreatorViewModel = this.A0D;
        if (pollCreatorViewModel.A08.A00.isEmpty()) {
            for (C97504yQ r0 : pollCreatorViewModel.A0E) {
                if (!r0.A00.isEmpty()) {
                }
            }
            super.onBackPressed();
            return;
        }
        A74();
    }

    public final void A74() {
        if (!C621433s.A03(this)) {
            AnonymousClass5OS A002 = C1001459r.A00(AnonymousClass4L0.A0U(), -1, R.string.f11nameremoved);
            A002.A04 = R.string.f11nameremoved;
            A002.A01 = R.string.f11nameremoved;
            A002.A03 = R.string.f11nameremoved;
            A002.A02 = R.color.f5nameremoved;
            AnonymousClass344.A00(A002.A00(), getSupportFragmentManager());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0G = C154437dA.A00(this.A0D);
        setTitle(R.string.f11nameremoved);
        boolean z = this.A0G;
        int i = R.layout.f8nameremoved;
        if (z) {
            i = R.layout.f8nameremoved;
        }
        setContentView(i);
        AnonymousClass0R8 A2S = AnonymousClass4SG.A2S(this, AnonymousClass1Hf.A28(this));
        A2S.A0N(true);
        A2S.A0B(R.string.f11nameremoved);
        this.A0B = C106405Yw.A00(this);
        this.A04 = (NestedScrollView) C06560Yg.A02(this.A00, R.id.poll_creator_container);
        this.A00 = getIntent().getLongExtra("quoted_message_row_id", 0);
        PollCreatorViewModel pollCreatorViewModel = (PollCreatorViewModel) AnonymousClass0x9.A0H(this).A01(PollCreatorViewModel.class);
        this.A0D = pollCreatorViewModel;
        C86604Kt.A1M(this, pollCreatorViewModel.A03, 315);
        C86604Kt.A1M(this, this.A0D.A0B, 316);
        C86604Kt.A1M(this, this.A0D.A0C, 317);
        AnonymousClass6C6.A01(this, this.A0D.A0A, 267);
        AnonymousClass6C6.A01(this, this.A0D.A02, 268);
        String stringExtra = getIntent().getStringExtra("entry_string_text");
        if (!TextUtils.isEmpty(stringExtra)) {
            this.A0D.A08.A00 = stringExtra;
            getIntent().removeExtra("entry_string_text");
        }
        SwitchCompat switchCompat = (SwitchCompat) C06560Yg.A02(this.A00, R.id.single_option_control_switch);
        this.A03 = switchCompat;
        switchCompat.setText(R.string.f11nameremoved);
        AnonymousClass1VX r1 = this.A0D;
        if (!r1.A0X(3050) && !r1.A0X(3433)) {
            this.A03.setVisibility(4);
        }
        RecyclerView A0P = C86654Ky.A0P(this.A00, R.id.poll_creator_options_recycler_view);
        this.A05 = A0P;
        AnonymousClass0YZ.A0G(A0P, false);
        this.A01 = (Vibrator) getSystemService("vibrator");
        this.A02 = (InputMethodManager) getSystemService("input_method");
        new AnonymousClass09T(new AnonymousClass4Vy(this)).A0C(this.A05);
        this.A05.setLayoutManager(new SmoothScrollLinearLayoutManager(1));
        AnonymousClass4W8 r12 = new AnonymousClass4W8(new AnonymousClass6HH(), this.A08, this.A09, this.A0D);
        this.A0C = r12;
        this.A05.setAdapter(r12);
        AnonymousClass6Z3 r3 = (AnonymousClass6Z3) C06560Yg.A02(this.A00, R.id.poll_create_button);
        this.A07 = r3;
        C18270x1.A0d(r3.getContext(), r3, this.A00, R.drawable.input_send);
        C989653x.A00(this.A07, this, 20);
        C617532c r32 = this.A0E;
        C95814uZ r2 = this.A0B;
        C162457s7.A0J(r2, 0);
        C25251aD r13 = new C25251aD();
        r13.A04 = AnonymousClass001.A0f();
        r32.A02(r13, r2);
        C617532c.A00(r13, r2, (C30451mT) null);
        r32.A01.BhD(r13);
        if (this.A0G) {
            View A022 = C06560Yg.A02(this.A00, R.id.main);
            BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
            this.A06 = bottomSheetBehavior;
            this.A0F.A02(A022, bottomSheetBehavior, this, this.A0B);
            AnonymousClass5XO.A00(this, A2S);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0A.A02(10);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        PollCreatorViewModel pollCreatorViewModel = this.A0D;
        if (pollCreatorViewModel.A08.A00.isEmpty()) {
            for (C97504yQ r0 : pollCreatorViewModel.A0E) {
                if (!r0.A00.isEmpty()) {
                }
            }
            finish();
            return true;
        }
        A74();
        return true;
    }

    public void onStart() {
        super.onStart();
        if (this.A0G) {
            this.A0F.A03(this.A06, this);
        }
    }
}
