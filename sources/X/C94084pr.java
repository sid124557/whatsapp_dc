package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.conversation.selection.MessageSelectionDropDownRecyclerView;
import com.whatsapp.conversation.selection.SelectedImageAlbumViewModel;
import com.whatsapp.conversation.selection.SelectedImageAndVideoAlbumActivity;
import com.whatsapp.conversation.selection.SingleSelectedMessageActivity;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4pr  reason: invalid class name and case insensitive filesystem */
public abstract class C94084pr extends AnonymousClass1Fn {
    public Configuration A00;
    public FrameLayout A01;
    public C103175Lv A02;
    public KeyboardPopupLayout A03;
    public C93314oJ A04;
    public AnonymousClass5R7 A05;
    public MessageSelectionDropDownRecyclerView A06;
    public final AnonymousClass66R A07 = C154517dI.A01(new C77743tt(this));
    public final AnonymousClass66R A08 = C382226f.A00(this, "EXTRA_CUSTOMIZER_ID", 0);
    public final AnonymousClass66R A09 = C382226f.A00(this, "EXTRA_INITIAL_TOP_MARGIN", 0);
    public final AnonymousClass66R A0A = C154517dI.A01(new C77753tu(this));
    public final AnonymousClass66R A0B = C382226f.A00(this, "EXTRA_MSG_PADDING_BOTTOM", 0);
    public final AnonymousClass66R A0C = C382226f.A00(this, "EXTRA_MSG_PADDING_END", 0);
    public final AnonymousClass66R A0D = C382226f.A00(this, "EXTRA_MSG_PADDING_START", 0);
    public final AnonymousClass66R A0E = C382226f.A00(this, "EXTRA_MSG_PADDING_TOP", 0);
    public final AnonymousClass66R A0F = C382226f.A00(this, "EXTRA_PROFILE_PICTURE_WIDTH", 0);
    public final AnonymousClass66R A0G = C154517dI.A00(AnonymousClass58H.NONE, new C80563yR(this));
    public final AnonymousClass66R A0H = C154517dI.A01(new C119505x5(this));
    public final AnonymousClass66R A0I = C154517dI.A01(new C119515x6(this));
    public final AnonymousClass66R A0J = C382226f.A00(this, "EXTRA_START_MARGIN", 0);

    public static final void A0L(View view) {
        C162457s7.A0J(view, 0);
        view.setEnabled(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            C162457s7.A0J(viewGroup, 0);
            Iterator A11 = C86634Kw.A11(viewGroup);
            while (A11.hasNext()) {
                A0L(C86654Ky.A0H(A11));
            }
        }
    }

    public final void A78() {
        C87664Uf r9;
        C1233768e r8;
        C93314oJ r82;
        AnonymousClass5RO r3;
        boolean z = this instanceof SingleSelectedMessageActivity;
        if (z) {
            SingleSelectedMessageActivity singleSelectedMessageActivity = (SingleSelectedMessageActivity) this;
            C87654Ud r0 = singleSelectedMessageActivity.A07;
            r9 = null;
            if (r0 == null) {
                throw C18270x1.A0S("singleSelectedMessageViewModel");
            }
            C624134x A1H = C86664Kz.A1H(r0.A00);
            if (A1H != null) {
                C116985rC r1 = singleSelectedMessageActivity.A00;
                if (r1 != null) {
                    if (!r1.A07() || !C116985rC.A03(r1).BH2(A1H.A1J.A00)) {
                        r3 = new AnonymousClass5RO();
                    } else {
                        C116985rC r02 = singleSelectedMessageActivity.A00;
                        if (r02 != null) {
                            r3 = (AnonymousClass5RO) ((C112185jK) C116985rC.A03(r02)).A0H.getValue();
                        } else {
                            throw C18270x1.A0S("bonsaiUiUtilOptional");
                        }
                    }
                    r9 = (C87664Uf) AnonymousClass0x9.A0H(singleSelectedMessageActivity).A01(C87664Uf.class);
                    List A12 = C18290x4.A12(A1H);
                    C93714pB r03 = singleSelectedMessageActivity.A06;
                    if (r03 != null) {
                        r9.A0D(r3, r03, A12);
                    } else {
                        throw C18270x1.A0S("dropDownMessageSelectionActionRepository");
                    }
                } else {
                    throw C18270x1.A0S("bonsaiUiUtilOptional");
                }
            }
        } else {
            SelectedImageAndVideoAlbumActivity selectedImageAndVideoAlbumActivity = (SelectedImageAndVideoAlbumActivity) this;
            SelectedImageAlbumViewModel selectedImageAlbumViewModel = selectedImageAndVideoAlbumActivity.A03;
            r9 = null;
            if (selectedImageAlbumViewModel == null) {
                throw C18270x1.A0S("selectedImageAlbumViewModel");
            }
            Collection A1P = C86664Kz.A1P(selectedImageAlbumViewModel.A00);
            if (A1P != null) {
                r9 = (C87664Uf) AnonymousClass0x9.A0H(selectedImageAndVideoAlbumActivity).A01(C87664Uf.class);
                AnonymousClass5RO r12 = new AnonymousClass5RO();
                C93714pB r04 = selectedImageAndVideoAlbumActivity.A02;
                if (r04 != null) {
                    r9.A0D(r12, r04, A1P);
                } else {
                    throw C18270x1.A0S("dropDownMessageSelectionActionRepository");
                }
            }
        }
        if (r9 == null) {
            setResult(0, (Intent) null);
            finish();
        } else {
            AnonymousClass6C6.A02(this, r9.A03, C1001359q.A00(this, 22), 224);
            View inflate = getLayoutInflater().inflate(R.layout.f8nameremoved, A74(), false);
            C162457s7.A0K(inflate, "null cannot be cast to non-null type com.whatsapp.conversation.selection.MessageSelectionDropDownRecyclerView");
            MessageSelectionDropDownRecyclerView messageSelectionDropDownRecyclerView = (MessageSelectionDropDownRecyclerView) inflate;
            C162457s7.A0J(messageSelectionDropDownRecyclerView, 0);
            this.A06 = messageSelectionDropDownRecyclerView;
            MessageSelectionDropDownRecyclerView A75 = A75();
            C620733j r10 = this.A00;
            C162457s7.A0C(r10);
            if (z) {
                r8 = new C1233768e((SingleSelectedMessageActivity) this);
            } else {
                r8 = new C1233768e((SelectedImageAndVideoAlbumActivity) this);
            }
            A75.A01 = r9;
            C87924Wq r5 = new C87924Wq(C18290x4.A0F(A75), this, r8, r9, r10);
            A75.A00 = r5;
            A75.setAdapter(r5);
            A75.getContext();
            C18270x1.A0u(A75);
        }
        C103175Lv r32 = this.A02;
        if (r32 != null) {
            C105165Tv A002 = r32.A00(getSupportFragmentManager(), C95894up.A00(this.A04));
            AnonymousClass677 r52 = (AnonymousClass677) this.A07.getValue();
            if (z) {
                SingleSelectedMessageActivity singleSelectedMessageActivity2 = (SingleSelectedMessageActivity) this;
                C162457s7.A0J(r52, 1);
                C87654Ud r05 = singleSelectedMessageActivity2.A07;
                if (r05 == null) {
                    throw C18270x1.A0S("singleSelectedMessageViewModel");
                }
                C624134x A1H2 = C86664Kz.A1H(r05.A00);
                if (A1H2 != null) {
                    r82 = A002.A03(singleSelectedMessageActivity2, r52, A1H2);
                }
                setResult(0, (Intent) null);
                finish();
                return;
            }
            SelectedImageAndVideoAlbumActivity selectedImageAndVideoAlbumActivity2 = (SelectedImageAndVideoAlbumActivity) this;
            boolean A1W = C18290x4.A1W(r52);
            C30471mV A7A = selectedImageAndVideoAlbumActivity2.A7A();
            if (A7A != null) {
                r82 = A002.A02(selectedImageAndVideoAlbumActivity2, AnonymousClass58K.TOP, r52, A7A);
                if (r82 instanceof AnonymousClass4o1) {
                    C133486hS r13 = (C133486hS) r82;
                    SelectedImageAlbumViewModel selectedImageAlbumViewModel2 = selectedImageAndVideoAlbumActivity2.A03;
                    if (selectedImageAlbumViewModel2 == null) {
                        throw C18270x1.A0S("selectedImageAlbumViewModel");
                    }
                    r13.A24(C86644Kx.A0h(selectedImageAlbumViewModel2.A00), A1W);
                }
            }
            setResult(0, (Intent) null);
            finish();
            return;
            BaseBundle baseBundle = (BaseBundle) this.A0G.getValue();
            r82.A1O(baseBundle.getInt("EXTRA_SELECTION_SAVE_STATE_COLLAPSE_TYPE", -1));
            AnonymousClass677 r4 = r82.A0m;
            if (r4 != null) {
                r4.Bmp(r82.getFMessage(), baseBundle.getInt("EXTRA_SELECTION_SAVE_STATE_PAGE_LIMIT", 1));
            }
            r82.A1H();
            C107555bV.A07(r82, this.A00, AnonymousClass0x2.A09(this.A0D), AnonymousClass0x2.A09(this.A0E), AnonymousClass0x2.A09(this.A0C), AnonymousClass0x2.A09(this.A0B));
            A0L(r82);
            if (r82 instanceof C93304oI) {
                C93314oJ.A0r(((C93304oI) r82).A05);
            } else if (r82 instanceof C93214o9) {
                C93314oJ.A0r(((C93214o9) r82).A0F);
            } else if (r82 instanceof AnonymousClass4o3) {
                C93314oJ.A0r(((AnonymousClass4o3) r82).A07);
            } else if (r82 instanceof C93114nv) {
                C93314oJ.A0r(((C93114nv) r82).A0F);
            }
            r82.setEnabled(true);
            r82.A2Q = false;
            C18290x4.A1G(r82, this, 15);
            A74().addView(r82);
            ViewGroup.LayoutParams layoutParams = r82.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.width = AnonymousClass0x2.A09(this.A0I);
                marginLayoutParams.height = AnonymousClass0x2.A09(this.A0H);
                marginLayoutParams.topMargin = AnonymousClass0x2.A09(this.A09);
                r82.setLayoutParams(marginLayoutParams);
                this.A04 = r82;
                A77();
                return;
            }
            throw AnonymousClass001.A0g("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        throw C18270x1.A0S("conversationRowInflaterFactory");
    }

    public void onConfigurationChanged(Configuration configuration) {
        C162457s7.A0J(configuration, 0);
        super.onConfigurationChanged(configuration);
        Configuration configuration2 = this.A00;
        if (!(configuration2 != null && configuration.screenWidthDp == configuration2.screenWidthDp && configuration.screenHeightDp == configuration2.screenHeightDp)) {
            setResult(0, (Intent) null);
            finish();
        }
        this.A00 = configuration;
    }

    public final FrameLayout A74() {
        FrameLayout frameLayout = this.A01;
        if (frameLayout != null) {
            return frameLayout;
        }
        throw C18270x1.A0S("selectedMessageContainer");
    }

    public final MessageSelectionDropDownRecyclerView A75() {
        MessageSelectionDropDownRecyclerView messageSelectionDropDownRecyclerView = this.A06;
        if (messageSelectionDropDownRecyclerView != null) {
            return messageSelectionDropDownRecyclerView;
        }
        throw C18270x1.A0S("messageSelectionDropDownRecyclerView");
    }

    public void A76() {
        float measuredHeight;
        int x;
        C93314oJ r4 = this.A04;
        if (r4 != null) {
            C86614Ku.A1F(A75(), A74().getWidth() - AnonymousClass0x2.A09(this.A0F), Integer.MIN_VALUE);
            MessageSelectionDropDownRecyclerView A75 = A75();
            float y = r4.getY();
            C93314oJ r2 = this.A04;
            if (r2 == null) {
                measuredHeight = 0.0f;
            } else {
                measuredHeight = ((float) r2.getMeasuredHeight()) * r2.getScaleY();
            }
            A75.setY(y + measuredHeight + ((float) AnonymousClass0x2.A09(this.A0A)));
            int i = 8388613;
            if (C620733j.A04(this.A00)) {
                i = 8388611;
            }
            C86654Ky.A17(A75(), A74(), -2, i);
            if (A79()) {
                View view = r4.A0l;
                x = (((int) view.getX()) + view.getWidth()) - A75().getMeasuredWidth();
            } else {
                x = (int) r4.A0l.getX();
            }
            MessageSelectionDropDownRecyclerView A752 = A75();
            ViewGroup.LayoutParams layoutParams = A752.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = x;
                A752.setLayoutParams(marginLayoutParams);
                return;
            }
            throw AnonymousClass001.A0g("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public boolean A79() {
        if (this instanceof SingleSelectedMessageActivity) {
            SingleSelectedMessageActivity singleSelectedMessageActivity = (SingleSelectedMessageActivity) this;
            C87654Ud r0 = singleSelectedMessageActivity.A07;
            if (r0 == null) {
                throw C18270x1.A0S("singleSelectedMessageViewModel");
            }
            C624134x A1H = C86664Kz.A1H(r0.A00);
            if (A1H == null || A1H.A1J.A02 != C620733j.A04(singleSelectedMessageActivity.A00)) {
                return false;
            }
        } else {
            SelectedImageAndVideoAlbumActivity selectedImageAndVideoAlbumActivity = (SelectedImageAndVideoAlbumActivity) this;
            C30471mV A7A = selectedImageAndVideoAlbumActivity.A7A();
            if (A7A == null || A7A.A1J.A02 != C620733j.A04(selectedImageAndVideoAlbumActivity.A00)) {
                return false;
            }
        }
        return true;
    }

    public void A77() {
        A74().post(C117625sE.A00(this, 9));
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.f0nameremoved);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(R.anim.f0nameremoved, 0);
        if (getIntent() == null) {
            setResult(0, (Intent) null);
            finish();
            return;
        }
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass001.A0Q(this).setBackgroundColor(C06400Xn.A00(getTheme(), getResources(), R.color.f5nameremoved));
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) C18290x4.A0L(this, R.id.selected_message_keyboard_popup_layout);
        C162457s7.A0J(keyboardPopupLayout, 0);
        this.A03 = keyboardPopupLayout;
        FrameLayout frameLayout = (FrameLayout) C18290x4.A0L(this, R.id.selected_message_container);
        C162457s7.A0J(frameLayout, 0);
        this.A01 = frameLayout;
        C18290x4.A1G(A74(), this, 16);
        C107555bV.A03(A74(), AnonymousClass0x2.A09(this.A0J), 0);
    }

    public void onResume() {
        super.onResume();
        this.A00 = AnonymousClass001.A0M(this);
    }
}
