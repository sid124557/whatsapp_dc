package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.0zT  reason: invalid class name and case insensitive filesystem */
public final class C19390zT extends ConstraintLayout implements AnonymousClass4GJ {
    public LinearLayout A00;
    public C05430Th A01;
    public TextEmojiLabel A02;
    public TextEmojiLabel A03;
    public WaImageView A04;
    public AnonymousClass5ZU A05;
    public C114015mM A06;
    public C620633i A07;
    public C620733j A08;
    public C59862xc A09;
    public AnonymousClass1VX A0A;
    public C60152y5 A0B;
    public AnonymousClass5UY A0C;
    public AnonymousClass5UY A0D;
    public AnonymousClass5UY A0E;
    public AnonymousClass5UY A0F;
    public AnonymousClass5UY A0G;
    public WDSButton A0H;
    public WDSButton A0I;
    public C116855qy A0J;
    public boolean A0K;
    public final AnonymousClass66R A0L;

    public C19390zT(Context context) {
        super(context, (AttributeSet) null, 0, 0);
        if (!this.A0K) {
            this.A0K = true;
            C64333Db r1 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            this.A0A = C64333Db.A4B(r1);
            this.A06 = C64333Db.A29(r1);
            this.A09 = (C59862xc) r1.APF.get();
            this.A05 = C64333Db.A28(r1);
            this.A08 = C64333Db.A2t(r1);
            this.A07 = C64333Db.A2o(r1);
            this.A0B = C64333Db.A74(r1);
        }
        this.A0L = C154517dI.A01(new C77473tS(context));
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A03 = (TextEmojiLabel) findViewById(R.id.title);
        this.A04 = (WaImageView) findViewById(R.id.avatar);
        this.A02 = (TextEmojiLabel) findViewById(R.id.subtitle);
        this.A00 = (LinearLayout) findViewById(R.id.title_subtitle_container);
        this.A0G = C18290x4.A0X(this, R.id.trust_signals);
        this.A0H = (WDSButton) findViewById(R.id.approve_button);
        this.A0I = (WDSButton) findViewById(R.id.reject_button);
        this.A0E = C18290x4.A0X(this, R.id.progress_spinner);
        this.A0D = C18290x4.A0X(this, R.id.failure);
        this.A0F = C18290x4.A0X(this, R.id.request_status);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    public static final void setupButtons$lambda$7(C53402n2 r1, View view) {
        C162457s7.A0J(r1, 0);
        r1.A05.invoke(r1.A02, C370320r.APPROVE);
    }

    public static final void setupButtons$lambda$8(C53402n2 r1, View view) {
        C162457s7.A0J(r1, 0);
        r1.A05.invoke(r1.A02, C370320r.REJECT);
    }

    public static final void setupButtons$lambda$9(C53402n2 r1, View view) {
        C162457s7.A0J(r1, 0);
        r1.A05.invoke(r1.A02, C370320r.CANCEL);
    }

    public final void setAbProps(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 0);
        this.A0A = r2;
    }

    public final void setContactPhotos(C114015mM r2) {
        C162457s7.A0J(r2, 0);
        this.A06 = r2;
    }

    public final void setPathDrawableHelper(C59862xc r2) {
        C162457s7.A0J(r2, 0);
        this.A09 = r2;
    }

    public final void setSharedPreferencesFactory(C60152y5 r2) {
        C162457s7.A0J(r2, 0);
        this.A0B = r2;
    }

    public final void setSystemServices(C620633i r2) {
        C162457s7.A0J(r2, 0);
        this.A07 = r2;
    }

    public final void setWaContactNames(AnonymousClass5ZU r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
    }

    public final void setWhatsAppLocale(C620733j r2) {
        C162457s7.A0J(r2, 0);
        this.A08 = r2;
    }

    private final void setCompletedUi(int i) {
        int i2;
        int i3;
        int A022;
        TextView textView;
        int A052 = C18290x4.A05(this.A0H);
        WDSButton wDSButton = this.A0I;
        if (wDSButton != null) {
            wDSButton.setVisibility(A052);
        }
        AnonymousClass5UY r0 = this.A0E;
        if (r0 != null) {
            r0.A06(A052);
        }
        AnonymousClass5UY r5 = this.A0F;
        if (r5 != null) {
            r5.A06(0);
        }
        if (i != 2) {
            if (i == 3) {
                i2 = R.drawable.group_info_label_gray;
                i3 = R.string.f11nameremoved;
            } else if (i == 4) {
                i2 = R.drawable.group_info_label_gray;
                i3 = R.string.f11nameremoved;
            } else {
                return;
            }
            A022 = R.color.f5nameremoved;
        } else {
            i2 = R.drawable.group_info_label_green;
            i3 = R.string.f11nameremoved;
            A022 = AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
        }
        if (r5 != null && (textView = (TextView) r5.A04()) != null) {
            textView.setText(textView.getResources().getText(i3));
            textView.setBackground(C18310x6.A0G(textView.getContext(), i2));
            AnonymousClass0x2.A0q(textView.getContext(), textView, A022);
        }
    }

    private final void setupButtons(C53402n2 r5) {
        WDSButton wDSButton;
        int i;
        AnonymousClass5UY r0 = this.A0E;
        if (r0 != null) {
            r0.A06(8);
        }
        AnonymousClass5UY r02 = this.A0F;
        if (r02 != null) {
            r02.A06(8);
        }
        AnonymousClass5UY r03 = this.A0D;
        if (r03 != null) {
            r03.A06(8);
        }
        int ordinal = r5.A01.ordinal();
        if (ordinal == 0) {
            WDSButton wDSButton2 = this.A0H;
            if (wDSButton2 != null) {
                wDSButton2.setVisibility(0);
            }
            wDSButton = this.A0I;
            if (wDSButton != null) {
                wDSButton.setVisibility(0);
            }
            if (wDSButton2 != null) {
                C18300x5.A13(getContext(), wDSButton2, R.string.f11nameremoved);
            }
            if (wDSButton != null) {
                C18300x5.A13(getContext(), wDSButton, R.string.f11nameremoved);
            }
            if (wDSButton2 != null) {
                AnonymousClass0x2.A0z(wDSButton2, r5, 41);
            }
            if (wDSButton != null) {
                i = 42;
            } else {
                return;
            }
        } else if (ordinal == 1) {
            WDSButton wDSButton3 = this.A0H;
            if (wDSButton3 != null) {
                wDSButton3.setVisibility(8);
            }
            wDSButton = this.A0I;
            if (wDSButton != null) {
                wDSButton.setVisibility(0);
                C18300x5.A13(getContext(), wDSButton, R.string.f11nameremoved);
                i = 43;
            } else {
                return;
            }
        } else {
            return;
        }
        AnonymousClass0x2.A0z(wDSButton, r5, i);
    }

    private final void setupDescription(C53402n2 r11) {
        View A042;
        TextEmojiLabel textEmojiLabel;
        String str = r11.A02.A05;
        if (str == null || str.length() == 0) {
            C18300x5.A1H(this.A0C);
            return;
        }
        AnonymousClass5UY r0 = this.A0G;
        r0.A06(0);
        AnonymousClass5UY A0X = C18290x4.A0X(r0.A04(), R.id.description);
        this.A0C = A0X;
        A0X.A06(0);
        AnonymousClass5UY r02 = this.A0C;
        if (r02 != null && (A042 = r02.A04()) != null && (textEmojiLabel = (TextEmojiLabel) A042.findViewById(R.id.member_suggested_groups_management_description)) != null) {
            C620633i systemServices = getSystemServices();
            C60152y5 sharedPreferencesFactory = getSharedPreferencesFactory();
            int A043 = AnonymousClass0Y8.A04(getContext(), AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
            float dimension = getResources().getDimension(R.dimen.f6nameremoved);
            int A012 = AnonymousClass34G.A01(systemServices, sharedPreferencesFactory);
            int i = EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            if (A012 < 2011) {
                i = 512;
            }
            textEmojiLabel.A0I(C18330xA.A00(C107635bd.A0A(str, dimension, A043, i, false)));
        }
    }

    private final void setupParticipantCount(C53402n2 r9) {
        long j = r9.A02.A01;
        if (j > 0 && r9.A01 != AnonymousClass20T.MEMBER) {
            AnonymousClass5UY r0 = this.A0G;
            r0.A06(0);
            AnonymousClass5UY r6 = new AnonymousClass5UY(C18290x4.A0X(r0.A04(), R.id.member_suggested_groups_management_participant_count).A04());
            r6.A06(0);
            TextView A092 = AnonymousClass002.A09(this, R.id.member_suggested_groups_management_participant_count_text);
            C620733j whatsAppLocale = getWhatsAppLocale();
            Object[] A0L2 = AnonymousClass002.A0L();
            AnonymousClass000.A1Q(A0L2, 0, j);
            A092.setText(whatsAppLocale.A0L(A0L2, R.plurals.f9nameremoved, j));
            AnonymousClass5UY r02 = this.A0C;
            if (r02 != null && r02.A03() == 0) {
                ViewGroup.LayoutParams A052 = r6.A05();
                C162457s7.A0K(A052, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) A052;
                marginLayoutParams.topMargin = C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved);
                r6.A08(marginLayoutParams);
            }
        }
    }

    private final void setupProfilePic(C53402n2 r7) {
        WaImageView waImageView = this.A04;
        if (waImageView != null) {
            getContactPhotosLoader().A02(waImageView, new C626035t(this, 1), r7.A04, getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        }
    }

    private final void setupSubTitle(C53402n2 r11) {
        String A0H2;
        Resources resources;
        int i;
        Object[] objArr;
        TextEmojiLabel textEmojiLabel = this.A02;
        if (textEmojiLabel != null) {
            int ordinal = r11.A01.ordinal();
            if (ordinal == 0) {
                A0H2 = getWaContactNames().A0H(r11.A03);
                resources = getResources();
                i = R.string.f11nameremoved;
                objArr = new Object[1];
            } else if (ordinal == 1) {
                resources = getResources();
                i = R.string.f11nameremoved;
                objArr = new Object[1];
                A0H2 = C107505bQ.A02(getWhatsAppLocale(), r11.A02.A00 * 1000);
            } else {
                throw C73153f1.A00();
            }
            textEmojiLabel.A0I(C18320x8.A0b(resources, A0H2, objArr, 0, i));
        }
    }

    private final void setupTitle(C53402n2 r3) {
        TextEmojiLabel textEmojiLabel = this.A03;
        if (textEmojiLabel != null) {
            textEmojiLabel.A0I(r3.A02.A06);
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0J;
        if (r0 == null) {
            r0 = new C116855qy(this);
            this.A0J = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1VX getAbProps() {
        AnonymousClass1VX r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0R();
    }

    public final C89654ea getActivity() {
        return (C89654ea) this.A0L.getValue();
    }

    public final C114015mM getContactPhotos() {
        C114015mM r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("contactPhotos");
    }

    public final C59862xc getPathDrawableHelper() {
        C59862xc r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("pathDrawableHelper");
    }

    public final C60152y5 getSharedPreferencesFactory() {
        C60152y5 r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("sharedPreferencesFactory");
    }

    public final C620633i getSystemServices() {
        C620633i r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("systemServices");
    }

    public final AnonymousClass5ZU getWaContactNames() {
        AnonymousClass5ZU r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waContactNames");
    }

    public final C620733j getWhatsAppLocale() {
        C620733j r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    private final void setupPopupMenu(C53402n2 r12) {
        C05430Th r5;
        String A0H2 = getWaContactNames().A0H(r12.A03);
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null) {
            r5 = new C05430Th(linearLayout.getContext(), linearLayout, 8388611, 0, R.style.f12nameremoved);
        } else {
            r5 = null;
        }
        this.A01 = r5;
        if (r5 != null) {
            r5.A04.add((CharSequence) getActivity().getResources().getString(R.string.f11nameremoved, AnonymousClass000.A1b(A0H2)));
        }
        C05430Th r2 = this.A01;
        if (r2 != null) {
            r2.A01 = new C85784Hp(r12, 1, this);
        }
        if (linearLayout != null) {
            C18290x4.A1I(linearLayout, this, r12, 20);
        }
    }

    public static final void setupPopupMenu$lambda$2(C19390zT r2, C53402n2 r3, View view) {
        C05430Th r0;
        C18260x0.A0O(r2, r3);
        if (r3.A01 == AnonymousClass20T.ADMIN && (r0 = r2.A01) != null) {
            r0.A00();
        }
    }

    public final void A05(C53402n2 r4) {
        AnonymousClass5UY r1;
        if (getAbProps().A0Y(C58422vE.A02, 5078)) {
            setupPopupMenu(r4);
        }
        setupProfilePic(r4);
        setupTitle(r4);
        setupSubTitle(r4);
        setupDescription(r4);
        setupParticipantCount(r4);
        int i = r4.A00;
        if (i != 0) {
            if (i == 1) {
                int A052 = C18290x4.A05(this.A0H);
                WDSButton wDSButton = this.A0I;
                if (wDSButton != null) {
                    wDSButton.setVisibility(A052);
                }
                AnonymousClass5UY r0 = this.A0F;
                if (r0 != null) {
                    r0.A06(A052);
                }
                r1 = this.A0E;
            } else if (i == 2 || i == 3 || i == 4) {
                setCompletedUi(i);
                return;
            } else if (i == 5) {
                int A053 = C18290x4.A05(this.A0H);
                WDSButton wDSButton2 = this.A0I;
                if (wDSButton2 != null) {
                    wDSButton2.setVisibility(A053);
                }
                AnonymousClass5UY r02 = this.A0E;
                if (r02 != null) {
                    r02.A06(A053);
                }
                AnonymousClass5UY r03 = this.A0F;
                if (r03 != null) {
                    r03.A06(A053);
                }
                r1 = this.A0D;
            } else {
                return;
            }
            if (r1 != null) {
                r1.A06(0);
                return;
            }
            return;
        }
        setupButtons(r4);
    }

    public final C105365Uq getContactPhotosLoader() {
        C105365Uq A062;
        Activity A002 = C621633u.A00(getContext());
        if (A002 instanceof C835648x) {
            A062 = ((C835648x) A002).getContactPhotosLoader();
        } else {
            A062 = getContactPhotos().A06(getContext(), "rich-message-welcome-card");
        }
        C162457s7.A0H(A062);
        return A062;
    }
}
