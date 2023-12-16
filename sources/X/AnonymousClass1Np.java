package X;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.community.EditCommunityActivity;
import com.whatsapp.community.NewCommunityActivity;

/* renamed from: X.1Np  reason: invalid class name */
public abstract class AnonymousClass1Np extends AnonymousClass1Fk {
    public int A00 = 1;
    public View.OnClickListener A01;
    public View A02;
    public ImageView A03;
    public ScrollView A04;
    public AnonymousClass6Z3 A05;
    public TextInputLayout A06;
    public WaEditText A07;
    public WaEditText A08;
    public C46352bU A09;
    public AnonymousClass33U A0A;
    public C56332ro A0B;
    public C613330g A0C;
    public C59862xc A0D;
    public C60152y5 A0E;
    public C30191m3 A0F;
    public final View.OnFocusChangeListener A0G = new C635739t(this);
    public final ViewTreeObserver.OnGlobalLayoutListener A0H = new AnonymousClass4JP(this, 0);

    public AnonymousClass3ZH A74() {
        if (this instanceof NewCommunityActivity) {
            return ((NewCommunityActivity) this).A03;
        }
        return ((EditCommunityActivity) this).A06;
    }

    public void onCreate(Bundle bundle) {
        int i;
        TextWatcher r10;
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        this.A02 = findViewById(R.id.new_or_edit_community);
        this.A03 = (ImageView) C005205m.A00(this, R.id.icon);
        this.A08 = (WaEditText) C005205m.A00(this, R.id.group_name);
        this.A07 = (WaEditText) C005205m.A00(this, R.id.community_description);
        this.A05 = (AnonymousClass6Z3) C005205m.A00(this, R.id.new_community_next_button);
        setSupportActionBar(AnonymousClass1Hf.A28(this));
        boolean z = this instanceof NewCommunityActivity;
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        C626936e.A06(supportActionBar);
        supportActionBar.A0Q(true);
        if (z) {
            supportActionBar.A0N(true);
            i = R.string.f11nameremoved;
        } else {
            supportActionBar.A0N(true);
            i = R.string.f11nameremoved;
        }
        supportActionBar.A0B(i);
        ImageView imageView = this.A03;
        C59862xc r1 = this.A0D;
        imageView.setImageDrawable(C59862xc.A00(getTheme(), getResources(), new AnonymousClass922(1), r1.A00, R.drawable.vec_ic_avatar_community));
        C109325eR r3 = new C109325eR(this, 36);
        this.A01 = r3;
        this.A03.setOnClickListener(r3);
        int max = Math.max(0, this.A06.A03(C66663Mh.A1v));
        TextInputLayout textInputLayout = (TextInputLayout) C005205m.A00(this, R.id.name_text_container);
        this.A06 = textInputLayout;
        textInputLayout.setCounterEnabled(true);
        this.A06.setCounterMaxLength(max);
        this.A06.A0l = new AnonymousClass3B3();
        this.A08.addTextChangedListener(new AnonymousClass4HQ(this, 1));
        this.A08.setFilters(new InputFilter[]{new C109095e4(max)});
        ((TextInputLayout) C005205m.A00(this, R.id.name_text_container)).setHint((CharSequence) getString(R.string.f11nameremoved));
        this.A07 = (WaEditText) C005205m.A00(this, R.id.community_description);
        this.A04 = (ScrollView) C005205m.A00(this, R.id.new_community_scrollView);
        int max2 = Math.max(0, this.A06.A03(C66663Mh.A1A));
        TextView A0L = C18310x6.A0L(this, R.id.description_counter);
        TextView A0L2 = C18310x6.A0L(this, R.id.description_hint);
        AnonymousClass1VX r32 = this.A0D;
        C58422vE r4 = C58422vE.A02;
        if (r32.A0Y(r4, 3154)) {
            A0L2.setVisibility(8);
            this.A07.setHint(R.string.f11nameremoved);
        }
        AnonymousClass5Y0 r6 = this.A0C;
        C620633i r13 = this.A08;
        C620733j r14 = this.A00;
        C60152y5 r33 = this.A0E;
        AnonymousClass5B5.A00(this, this.A04, A0L, A0L2, this.A07, r13, r14, this.A0B, r6, r33, max2);
        boolean A0Y = this.A0D.A0Y(r4, 3154);
        AnonymousClass5Y0 r42 = this.A0C;
        C620633i r132 = this.A08;
        C620733j r142 = this.A00;
        C60152y5 r34 = this.A0E;
        AnonymousClass487 r15 = this.A0B;
        WaEditText waEditText = this.A07;
        if (A0Y) {
            r10 = new AnonymousClass52M(waEditText, (TextView) null, r132, r142, r15, r42, r34, max2, 0, true);
        } else {
            r10 = new AnonymousClass52T(waEditText, (TextView) null, r132, r142, r15, r42, r34, max2, 0, true);
        }
        this.A07.addTextChangedListener(r10);
        if (z) {
            C18270x1.A0d(this, this.A05, this.A00, R.drawable.ic_fab_next);
            this.A05.setOnClickListener(new AnonymousClass54D(this, 40));
        } else {
            C18290x4.A1A(this, this.A05, R.drawable.ic_fab_check);
            C18320x8.A13(this.A05, this, 31);
        }
        this.A02.getViewTreeObserver().addOnGlobalLayoutListener(this.A0H);
        WaEditText waEditText2 = this.A07;
        View.OnFocusChangeListener onFocusChangeListener = this.A0G;
        waEditText2.setOnFocusChangeListener(onFocusChangeListener);
        this.A08.setOnFocusChangeListener(onFocusChangeListener);
    }

    public void A75(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A06.setError((CharSequence) null);
            return;
        }
        this.A06.setError(str);
        this.A06.requestFocus();
        this.A04.smoothScrollTo(0, this.A06.getTop());
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
