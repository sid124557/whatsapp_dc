package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass3CY;
import X.AnonymousClass4BP;
import X.AnonymousClass4CE;
import X.AnonymousClass4FS;
import X.AnonymousClass4FV;
import X.AnonymousClass4L0;
import X.AnonymousClass4SG;
import X.AnonymousClass4UF;
import X.AnonymousClass4WW;
import X.AnonymousClass55S;
import X.AnonymousClass5PB;
import X.AnonymousClass5RE;
import X.AnonymousClass5Y0;
import X.AnonymousClass6B0;
import X.AnonymousClass6BG;
import X.AnonymousClass6C6;
import X.AnonymousClass8s7;
import X.C005205m;
import X.C100385As;
import X.C103095Ln;
import X.C107335b8;
import X.C107695bk;
import X.C110015fY;
import X.C114085mT;
import X.C115955pV;
import X.C115965pW;
import X.C115975pX;
import X.C118345tO;
import X.C1232167o;
import X.C124086Ax;
import X.C131666dx;
import X.C162157rM;
import X.C18270x1;
import X.C18300x5;
import X.C18320x8;
import X.C183538qC;
import X.C27821ej;
import X.C29361ih;
import X.C49252gE;
import X.C55922r8;
import X.C56932sn;
import X.C59862xc;
import X.C64333Db;
import X.C72343dZ;
import X.C86604Kt;
import X.C86624Kv;
import X.C86664Kz;
import X.C87624Ua;
import X.C89644eZ;
import X.C94264qq;
import X.C94294qu;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView;
import com.whatsapp.gifsearch.GifSearchContainer;
import com.whatsapp.picker.search.PickerSearchDialogFragment;
import java.util.Map;

public class GroupProfileEmojiEditor extends C89644eZ implements AnonymousClass8s7 {
    public static final Map A0N = new C118345tO();
    public Bitmap A00;
    public View A01;
    public View A02;
    public ImageView A03;
    public ImageView A04;
    public RecyclerView A05;
    public BottomSheetBehavior A06;
    public KeyboardPopupLayout A07;
    public AnonymousClass5RE A08;
    public C59862xc A09;
    public EmojiSearchKeyboardContainer A0A;
    public EmojiSearchProvider A0B;
    public ExpressionsBottomSheetView A0C;
    public AnonymousClass4UF A0D;
    public C103095Ln A0E;
    public C114085mT A0F;
    public C115975pX A0G;
    public C29361ih A0H;
    public C56932sn A0I;
    public C49252gE A0J;
    public C183538qC A0K;
    public boolean A0L;
    public final int[] A0M;

    public final void A74() {
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.f6nameremoved);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.f6nameremoved);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(R.dimen.f6nameremoved);
        this.A05.measure(0, 0);
        int measuredHeight = this.A05.getMeasuredHeight();
        View view = this.A02;
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new C110015fY(this, dimensionPixelOffset, measuredHeight, dimensionPixelOffset2, dimensionPixelOffset3));
        }
    }

    public void A5r() {
        if (!this.A0L) {
            this.A0L = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A0K = C72343dZ.A00(A2Y.ASJ);
            this.A0H = (C29361ih) A2Y.AX3.get();
            this.A0I = (C56932sn) A2Y.AXB.get();
            this.A08 = (AnonymousClass5RE) r1.A3H.get();
            this.A09 = (C59862xc) A2Y.APF.get();
            this.A0B = C107695bk.A1n(r1);
            this.A0E = (C103095Ln) r1.A5n.get();
            this.A0F = (C114085mT) r1.A5o.get();
            this.A0J = (C49252gE) r1.ABM.get();
        }
    }

    public final void A75(int i) {
        View view;
        View view2 = this.A01;
        if (view2 != null) {
            C86624Kv.A0w(view2, i);
            this.A01.requestLayout();
            BottomSheetBehavior bottomSheetBehavior = this.A06;
            if (bottomSheetBehavior != null && bottomSheetBehavior.A0O != 5 && this.A07 != null && (view = this.A02) != null) {
                float height = (float) (view.getHeight() - i);
                this.A07.getLayoutParams().height = (int) height;
                this.A07.requestLayout();
            }
        }
    }

    public void BY7(PickerSearchDialogFragment pickerSearchDialogFragment) {
        this.A0G.A02(pickerSearchDialogFragment);
    }

    public void onBackPressed() {
        C114085mT r0 = this.A0F;
        if (r0 != null) {
            C94294qu r02 = r0.A06;
            if (r02 == null || !r02.A03()) {
                super.onBackPressed();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        BottomSheetBehavior bottomSheetBehavior;
        EmojiSearchKeyboardContainer emojiSearchKeyboardContainer;
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        int[] intArray = getResources().getIntArray(R.array.f2nameremoved);
        int[] intArray2 = getResources().getIntArray(R.array.f2nameremoved);
        Object A0i = AnonymousClass001.A0i(A0N, getIntent().getIntExtra("emojiEditorProfileTarget", 1));
        if (A0i == null) {
            A0i = new AnonymousClass6B0(1);
        }
        this.A0D = (AnonymousClass4UF) AnonymousClass4L0.A0F(new C124086Ax(intArray, 9, this), this).A01(AnonymousClass4UF.class);
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) findViewById(R.id.popup_keyboard_root);
        this.A07 = keyboardPopupLayout;
        keyboardPopupLayout.setKeyboardPopupBackgroundColor(C18300x5.A03(this, R.attr.f3nameremoved, R.color.f5nameremoved));
        Toolbar A2T = AnonymousClass4SG.A2T(this);
        C107335b8.A0D(this, A2T, this.A00, R.color.f5nameremoved);
        AnonymousClass4SG.A2S(this, A2T).A0B(R.string.f11nameremoved);
        getSupportActionBar().A0Q(true);
        getSupportActionBar().A0N(true);
        RecyclerView recyclerView = (RecyclerView) C005205m.A00(this, R.id.colors_recycler);
        this.A05 = recyclerView;
        recyclerView.setAdapter(new AnonymousClass4WW(this, this.A0D, intArray, intArray2, this.A0M));
        C18320x8.A19(this.A05, 0);
        this.A02 = C005205m.A00(this, R.id.coordinator);
        this.A04 = C86664Kz.A0u(this, R.id.picturePreview);
        C100385As.A00(this, this.A0D.A00, A0i, 16);
        C87624Ua r2 = (C87624Ua) AnonymousClass0x9.A0H(this).A01(C87624Ua.class);
        if (AnonymousClass4SG.A41(this)) {
            ExpressionsBottomSheetView expressionsBottomSheetView = (ExpressionsBottomSheetView) C005205m.A00(this, R.id.keyboard_bottom_sheet);
            this.A0C = expressionsBottomSheetView;
            expressionsBottomSheetView.setExpressionsTabs(2);
            this.A01 = C005205m.A00(this, R.id.expressions_view_root);
            this.A0A = (EmojiSearchKeyboardContainer) C005205m.A00(this, R.id.expressions_emoji_search_container);
            this.A0C.setVisibility(0);
            BottomSheetBehavior A012 = BottomSheetBehavior.A01(this.A0C);
            this.A06 = A012;
            A012.A0d(false);
            this.A0B.A01((Integer) null);
            this.A06.A0Z(new C1232167o(this, 7));
            A74();
            this.A06.A0S(4);
            this.A0C.A08();
            this.A0C.A0B();
            ExpressionsBottomSheetView expressionsBottomSheetView2 = this.A0C;
            if (!(expressionsBottomSheetView2 == null || (bottomSheetBehavior = this.A06) == null || (emojiSearchKeyboardContainer = this.A0A) == null)) {
                C114085mT r4 = this.A0F;
                r4.A07 = this;
                r4.A08 = r2;
                r4.A04 = expressionsBottomSheetView2;
                r4.A00 = bottomSheetBehavior;
                r4.A03 = emojiSearchKeyboardContainer;
                Resources resources = getResources();
                expressionsBottomSheetView2.setExpressionsSearchListener(r4.A0I);
                AnonymousClass3CY r0 = new AnonymousClass3CY(resources, r4);
                r4.A01 = r0;
                expressionsBottomSheetView2.A03 = r0;
                expressionsBottomSheetView2.A0I = new C115955pV(resources, this, r4);
            }
        } else {
            C56932sn r14 = this.A0I;
            AnonymousClass4FS r1 = this.A04;
            C183538qC r02 = this.A0K;
            C162157rM r11 = new C162157rM(this.A09, this.A0H, r14, this.A0J, r1, r02);
            C115975pX r5 = new C115975pX(r11);
            this.A0G = r5;
            C114085mT r42 = this.A0F;
            KeyboardPopupLayout keyboardPopupLayout2 = this.A07;
            AnonymousClass5RE r03 = this.A08;
            r42.A07 = this;
            r42.A08 = r2;
            r42.A0A = r11;
            r42.A09 = r5;
            r42.A02 = r03;
            AnonymousClass5PB r7 = r42.A0K;
            r7.A00 = this;
            AnonymousClass5RE r6 = r42.A02;
            r7.A07 = r6.A01(r42.A0P, r42.A0A);
            r7.A05 = r6.A00();
            r7.A02 = keyboardPopupLayout2;
            r7.A01 = null;
            r7.A03 = (WaEditText) C005205m.A00(this, R.id.keyboardInput);
            r7.A08 = true;
            r42.A05 = r7.A01();
            Resources resources2 = getResources();
            AnonymousClass3CY r04 = new AnonymousClass3CY(resources2, r42);
            r42.A01 = r04;
            C94264qq r12 = r42.A05;
            r12.A0C(r04);
            C115965pW r05 = new C115965pW(resources2, this, r42, r5);
            r12.A0J(r05);
            r5.A04 = r05;
            AnonymousClass4FV r15 = r42.A0J;
            C55922r8 r72 = r42.A0M;
            C94264qq r13 = r42.A05;
            AnonymousClass5Y0 r132 = r42.A0F;
            C27821ej r122 = r42.A0E;
            C94294qu r9 = new C94294qu(this, r42.A0D, r122, r132, (EmojiSearchContainer) keyboardPopupLayout2.findViewById(R.id.emoji_search_container), r15, r13, (GifSearchContainer) keyboardPopupLayout2.findViewById(R.id.gif_search_container), r72, r42.A0N);
            r42.A06 = r9;
            r9.A00 = r42;
            r5.A01(r42.A05, this);
            C162157rM r06 = r42.A0A;
            r06.A0B.A06(r06.A09);
            AnonymousClass6BG.A00(this.A07.getViewTreeObserver(), this, 22);
        }
        AnonymousClass6C6.A01(this, r2.A00, 251);
        this.A03 = (ImageView) LayoutInflater.from(this).inflate(R.layout.f8nameremoved, (ViewGroup) this.A00, false);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.done, 0, R.string.f11nameremoved).setIcon(new C131666dx(C107335b8.A04(this, R.drawable.action_profile_photo_editor_done, R.color.f5nameremoved), this.A00)).setShowAsAction(2);
        return true;
    }

    public GroupProfileEmojiEditor(int i) {
        this.A0L = false;
        C86604Kt.A1K(this, 46);
    }

    public void Bom(DialogFragment dialogFragment) {
        Boo(dialogFragment);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (AnonymousClass4SG.A41(this)) {
            A74();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C114085mT r3 = this.A0F;
        C94264qq r0 = r3.A05;
        if (r0 != null) {
            r0.A0C((AnonymousClass4CE) null);
            r0.A0J((AnonymousClass4BP) null);
            r0.dismiss();
            r3.A05.A0F();
        }
        C115975pX r02 = r3.A09;
        if (r02 != null) {
            r02.A04 = null;
            r02.A00();
        }
        C94294qu r03 = r3.A06;
        if (r03 != null) {
            r03.A00 = null;
        }
        C162157rM r04 = r3.A0A;
        if (r04 != null) {
            r04.A0B.A07(r04.A09);
        }
        EmojiSearchKeyboardContainer emojiSearchKeyboardContainer = r3.A03;
        if (emojiSearchKeyboardContainer != null) {
            emojiSearchKeyboardContainer.A02();
        }
        ExpressionsBottomSheetView expressionsBottomSheetView = r3.A04;
        if (expressionsBottomSheetView != null) {
            expressionsBottomSheetView.A09();
            r3.A04 = null;
        }
        r3.A0A = null;
        r3.A09 = null;
        r3.A06 = null;
        r3.A01 = null;
        r3.A02 = null;
        r3.A05 = null;
        r3.A08 = null;
        EmojiSearchKeyboardContainer emojiSearchKeyboardContainer2 = this.A0A;
        if (emojiSearchKeyboardContainer2 != null) {
            emojiSearchKeyboardContainer2.A02();
        }
        ExpressionsBottomSheetView expressionsBottomSheetView2 = this.A0C;
        if (expressionsBottomSheetView2 != null) {
            expressionsBottomSheetView2.A09();
            this.A0C = null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.done) {
            C18270x1.A0w(new AnonymousClass55S(this, this.A0E), this.A04);
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return true;
        } else {
            finish();
            return true;
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(R.id.done).setVisible(AnonymousClass000.A1W(this.A00));
        return true;
    }

    public GroupProfileEmojiEditor() {
        this(0);
        this.A0M = new int[]{R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved};
    }
}
