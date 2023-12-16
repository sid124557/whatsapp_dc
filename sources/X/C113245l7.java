package X;

import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.TextKeyListener;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.msys.mci.DefaultCrypto;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.Conversation;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageButton;
import com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel;
import com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel;
import com.whatsapp.community.ConversationCommunityViewModel;
import com.whatsapp.conversation.ConversationListView;
import com.whatsapp.conversation.ConversationSearchFragment;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.conversation.selectlist.SelectListBottomSheet;
import com.whatsapp.conversation.viewmodel.ConversationSearchViewModel;
import com.whatsapp.countrygating.viewmodel.CountryGatingViewModel;
import com.whatsapp.ctwa.icebreaker.ui.IcebreakerBubbleView;
import com.whatsapp.dialogs.CreateOrAddToContactsDialog;
import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.expressions.BaseExpressionsBottomSheet;
import com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.newsletter.viewmodel.NewsletterViewModel;
import com.whatsapp.payments.ui.PaymentMerchantUpsellEducationBottomSheet;
import com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel;
import com.whatsapp.pininchat.banner.PinInChatBannerViewModel;
import com.whatsapp.pnh.RequestPhoneNumberViewModel;
import com.whatsapp.tosgating.viewmodel.ToSGatingViewModel;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import com.whatsapp.wds.components.search.WDSConversationSearchView;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/* renamed from: X.5l7  reason: invalid class name and case insensitive filesystem */
public class C113245l7 implements AnonymousClass654 {
    public static final C148127Ha A7R = new C148127Ha(true, true);
    public static final HashMap A7S = AnonymousClass001.A0t();
    public static final HashMap A7T = AnonymousClass001.A0t();
    public int A00 = 8;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public int A05;
    public long A06 = 0;
    public long A07 = -1;
    public ObjectAnimator A08 = null;
    public BroadcastReceiver A09;
    public Handler A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public View A0F;
    public View A0G;
    public View A0H;
    public View A0I;
    public View A0J;
    public View A0K;
    public View A0L;
    public View A0M;
    public View A0N;
    public View A0O;
    public View A0P;
    public View A0Q;
    public View A0R;
    public View A0S;
    public ViewGroup A0T;
    public ViewGroup A0U;
    public ViewGroup A0V;
    public ViewGroup A0W;
    public ViewGroup A0X;
    public ViewGroup A0Y;
    public ViewGroup A0Z;
    public ViewGroup A0a;
    public FrameLayout.LayoutParams A0b;
    public FrameLayout A0c;
    public FrameLayout A0d;
    public ImageButton A0e;
    public ImageButton A0f;
    public ImageButton A0g;
    public ImageButton A0h;
    public ImageView A0i;
    public ImageView A0j;
    public LinearLayout A0k;
    public TextView A0l;
    public TextView A0m;
    public AnonymousClass0O1 A0n = null;
    public AnonymousClass043 A0o;
    public C16910uE A0p;
    public AnonymousClass0R2 A0q;
    public Toolbar A0r;
    public AnonymousClass0N1 A0s = null;
    public BottomSheetBehavior A0t;
    public C116985rC A0u;
    public C116985rC A0v;
    public C116985rC A0w;
    public C116985rC A0x;
    public C116985rC A0y;
    public C116985rC A0z;
    public C57012sv A10;
    public C107895c5 A11;
    public C111095hX A12;
    public C53582nK A13;
    public C106175Xx A14;
    public C55682qk A15;
    public AnonymousClass2CO A16;
    public AnonymousClass5D4 A17;
    public AnonymousClass5D5 A18;
    public AnonymousClass5D6 A19;
    public C103195Lx A1A;
    public AnonymousClass5D8 A1B;
    public AnonymousClass5DC A1C;
    public AnonymousClass2CR A1D;
    public C44112Us A1E;
    public AnonymousClass5DD A1F;
    public AnonymousClass2CS A1G;
    public AnonymousClass5DE A1H;
    public AnonymousClass5DF A1I;
    public AnonymousClass5DG A1J;
    public AnonymousClass5DH A1K;
    public AnonymousClass5DI A1L;
    public AnonymousClass5DJ A1M;
    public AnonymousClass5DK A1N;
    public AnonymousClass5M1 A1O;
    public AnonymousClass5DL A1P;
    public AnonymousClass5DM A1Q;
    public AnonymousClass5DN A1R;
    public AnonymousClass5DO A1S;
    public AnonymousClass5DP A1T;
    public AnonymousClass5M4 A1U;
    public C44162Ux A1V;
    public AnonymousClass5MA A1W;
    public C101445Eu A1X;
    public C101455Ev A1Y;
    public C69263Wi A1Z;
    public KeyboardPopupLayout A1a;
    public C56972sr A1b;
    public AnonymousClass36E A1c;
    public AnonymousClass5XU A1d;
    public AnonymousClass5WY A1e;
    public AnonymousClass5Ul A1f;
    public AnonymousClass5Z4 A1g;
    public C56492s4 A1h;
    public TextEmojiLabel A1i;
    public TextEmojiLabel A1j;
    public AnonymousClass64J A1k;
    public C621033m A1l;
    public WaEditText A1m;
    public C47812dr A1n;
    public C614930z A1o;
    public C105135Ts A1p;
    public C87574Tl A1q;
    public C105035Th A1r;
    public C29291ia A1s;
    public AnonymousClass5T7 A1t;
    public AnonymousClass2UT A1u = null;
    public C181728nE A1v;
    public C87604Ty A1w;
    public C29211iS A1x;
    public AnonymousClass5XF A1y;
    public C105405Uu A1z;
    public C105145Tt A20;
    public AnonymousClass5Y9 A21;
    public C50482iF A22;
    public C151257Ua A23;
    public C152967aS A24;
    public C181798nL A25;
    public AnonymousClass2PX A26;
    public C56962sq A27;
    public AnonymousClass64Q A28;
    public BotEmbodimentViewModel A29;
    public AnonymousClass4Qj A2A;
    public BonsaiPromptsViewModel A2B;
    public C1230066r A2C;
    public C112515jr A2D;
    public AnonymousClass5TW A2E;
    public C29301ib A2F;
    public C106995aW A2G;
    public C184278rX A2H;
    public AnonymousClass49S A2I;
    public C56942so A2J;
    public AnonymousClass4VM A2K;
    public ConversationCommunityViewModel A2L;
    public C113935mE A2M;
    public AnonymousClass67D A2N;
    public AnonymousClass67C A2O;
    public C108985dt A2P = null;
    public AnonymousClass5UX A2Q;
    public C29421in A2R;
    public C56422rx A2S;
    public C48952fk A2T;
    public C105365Uq A2U;
    public C613330g A2V;
    public C53592nL A2W;
    public C64223Cq A2X;
    public C53602nM A2Y;
    public C89884fR A2Z;
    public C89894fS A2a;
    public AnonymousClass5PZ A2b;
    public AnonymousClass5KV A2c;
    public AnonymousClass5ST A2d;
    public AnonymousClass5OU A2e;
    public ConversationListView A2f;
    public AnonymousClass5W1 A2g;
    public AnonymousClass5G5 A2h;
    public C33891tr A2i;
    public C54122oD A2j;
    public AnonymousClass5TN A2k;
    public AnonymousClass5MS A2l;
    public C113905mB A2m;
    public C100305Ak A2n;
    public C100315Al A2o;
    public AnonymousClass5KX A2p;
    public MessageSelectionViewModel A2q;
    public C97114xe A2r;
    public C114005mL A2s;
    public AnonymousClass30C A2t;
    public AnonymousClass5HY A2u;
    public AnonymousClass5JC A2v;
    public AnonymousClass5IT A2w;
    public C102795Kh A2x;
    public AnonymousClass5JE A2y;
    public AnonymousClass676 A2z;
    public C43562Sp A30;
    public AnonymousClass5RI A31;
    public C102905Ks A32;
    public AnonymousClass5OW A33;
    public C93724pC A34;
    public C44382Vv A35;
    public AnonymousClass5G9 A36;
    public AnonymousClass4VF A37;
    public AnonymousClass4VH A38;
    public ConversationSearchViewModel A39;
    public C47892e0 A3A;
    public AnonymousClass4VQ A3B;
    public C87684Uw A3C;
    public AnonymousClass4UA A3D;
    public C89874fQ A3E;
    public C56512s6 A3F;
    public C620633i A3G;
    public C47912e2 A3H;
    public C56612sH A3I;
    public AnonymousClass33T A3J;
    public AnonymousClass33p A3K;
    public C620733j A3L;
    public CountryGatingViewModel A3M;
    public C106965aS A3N;
    public C47922e3 A3O;
    public AnonymousClass5IV A3P;
    public C53412n3 A3Q;
    public C22951Qs A3R;
    public C105845Wq A3S;
    public AnonymousClass5RH A3T;
    public C49452gY A3U;
    public C44902Xx A3V;
    public C50002hT A3W;
    public AnonymousClass5RE A3X;
    public C49792h6 A3Y;
    public C56542sA A3Z;
    public C28871hu A3a;
    public AnonymousClass4FD A3b;
    public AnonymousClass2Y0 A3c;
    public C56982ss A3d;
    public C66473Lo A3e;
    public C46962cU A3f;
    public C66543Lv A3g;
    public C49482gb A3h;
    public C66533Lu A3i;
    public C56152rV A3j;
    public C72303dV A3k;
    public C56362rr A3l;
    public C55562qY A3m;
    public AnonymousClass3ZH A3n;
    public C56662sM A3o;
    public C29041iB A3p;
    public C54032o4 A3q;
    public AnonymousClass36Y A3r;
    public C89864fP A3s;
    public C27821ej A3t;
    public AnonymousClass5Y0 A3u;
    public EmojiSearchKeyboardContainer A3v;
    public EmojiSearchProvider A3w;
    public AnonymousClass2WF A3x;
    public BaseExpressionsBottomSheet A3y;
    public AnonymousClass2WI A3z;
    public ExpressionsBottomSheetView A40;
    public AnonymousClass1VX A41;
    public AnonymousClass3LP A42;
    public AnonymousClass5MZ A43;
    public AnonymousClass5PB A44;
    public C94264qq A45;
    public C94294qu A46;
    public C106095Xp A47;
    public C166177yG A48;
    public C55922r8 A49;
    public C55702qm A4A;
    public C29241iV A4B;
    public AnonymousClass5GK A4C;
    public AnonymousClass4TE A4D = null;
    public C97154xi A4E;
    public C53202mi A4F;
    public C45302Zm A4G;
    public C61132zl A4H;
    public AnonymousClass1kA A4I;
    public C95814uZ A4J;
    public C106685Zz A4K;
    public C28071fd A4L;
    public C55972rD A4M;
    public C620033c A4N;
    public C48682fI A4O;
    public MentionableEntry A4P;
    public C52552lf A4Q;
    public C66523Lt A4R;
    public WhatsAppLibLoader A4S;
    public NewsletterViewModel A4T;
    public C619933b A4U;
    public AnonymousClass3XI A4V;
    public C66553Lw A4W;
    public AnonymousClass5TT A4X;
    public AnonymousClass3LQ A4Y;
    public C103115Lp A4Z;
    public C29251iW A4a;
    public C620933l A4b;
    public C153087ae A4c;
    public C1907099n A4d;
    public C29341if A4e;
    public C196419ao A4f;
    public AnonymousClass9Tp A4g;
    public C1901794j A4h;
    public PaymentMerchantAccountViewModel A4i;
    public C194079Rm A4j;
    public C195219Wq A4k;
    public C49632gq A4l;
    public C44562Wn A4m;
    public C105115Tq A4n;
    public C115975pX A4o;
    public C53712nX A4p;
    public RequestPhoneNumberViewModel A4q;
    public C60152y5 A4r;
    public AnonymousClass3S3 A4s;
    public AnonymousClass7SU A4t;
    public AnonymousClass7SV A4u;
    public C61242zw A4v;
    public C624134x A4w;
    public AnonymousClass35J A4x;
    public C56832sd A4y;
    public C50222hp A4z;
    public C45042Yl A50;
    public C106735a4 A51;
    public C151907Wt A52;
    public C28861ht A53;
    public C54822pL A54;
    public C56532s8 A55;
    public AnonymousClass1R1 A56;
    public C623834u A57;
    public AnonymousClass5TZ A58;
    public C29361ih A59;
    public C56932sn A5A;
    public C49252gE A5B;
    public AnonymousClass10k A5C;
    public C53072mV A5D;
    public C103645Nu A5E;
    public AnonymousClass2QZ A5F;
    public C97144xh A5G;
    public C162157rM A5H;
    public C55832qz A5I;
    public C66433Lk A5J;
    public C56572sD A5K;
    public AnonymousClass52O A5L;
    public C87694Uy A5M;
    public AnonymousClass30V A5N;
    public C50162hj A5O;
    public ToSGatingViewModel A5P;
    public C54182oJ A5Q;
    public C106165Xw A5R;
    public C60312yL A5S;
    public C45592aG A5T;
    public C50282hv A5U;
    public AnonymousClass5XO A5V;
    public C989053r A5W;
    public C33141sV A5X;
    public AnonymousClass33M A5Y = null;
    public AnonymousClass33M A5Z;
    public C187958y5 A5a;
    public C60482yd A5b;
    public AnonymousClass5UY A5c;
    public AnonymousClass5UY A5d;
    public AnonymousClass5UY A5e;
    public AnonymousClass5UY A5f;
    public AnonymousClass5UY A5g;
    public AnonymousClass5UY A5h;
    public AnonymousClass4FS A5i;
    public AnonymousClass560 A5j;
    public AnonymousClass5RW A5k;
    public AnonymousClass66v A5l;
    public C992054v A5m;
    public C97054xY A5n;
    public C105215Ua A5o;
    public C97124xf A5p;
    public AnonymousClass5ZT A5q;
    public AnonymousClass5QR A5r;
    public C97094xc A5s;
    public AnonymousClass2Z2 A5t;
    public C45682aP A5u;
    public WDSButton A5v;
    public C183538qC A5w;
    public C183538qC A5x;
    public C183538qC A5y;
    public C183538qC A5z;
    public C183538qC A60;
    public C183538qC A61;
    public C183538qC A62;
    public C183538qC A63;
    public C183538qC A64;
    public C183538qC A65;
    public C183538qC A66;
    public C183538qC A67;
    public C183538qC A68;
    public Boolean A69;
    public Integer A6A = null;
    public Runnable A6B;
    public Runnable A6C;
    public String A6D;
    public String A6E;
    public String A6F;
    public boolean A6G;
    public boolean A6H;
    public boolean A6I = false;
    public boolean A6J;
    public boolean A6K = false;
    public boolean A6L;
    public boolean A6M = false;
    public boolean A6N = false;
    public boolean A6O;
    public boolean A6P;
    public boolean A6Q;
    public boolean A6R;
    public boolean A6S = false;
    public boolean A6T = false;
    public boolean A6U = false;
    public boolean A6V;
    public boolean A6W;
    public boolean A6X = false;
    public boolean A6Y;
    public boolean A6Z;
    public boolean A6a = true;
    public boolean A6b;
    public boolean A6c;
    public boolean A6d = true;
    public boolean A6e;
    public boolean A6f = false;
    public boolean A6g;
    public boolean A6h = false;
    public boolean A6i = false;
    public boolean A6j = false;
    public boolean A6k;
    public boolean A6l = false;
    public boolean A6m;
    public final DatePickerDialog.OnDateSetListener A6n = new C106885aK(this, 1);
    public final DataSetObserver A6o = new C86704Ld(this);
    public final Handler A6p = AnonymousClass000.A0A();
    public final Handler A6q = AnonymousClass000.A0A();
    public final TextWatcher A6r = new AnonymousClass68H(this, 4);
    public final TextWatcher A6s = new AnonymousClass90B(this, 0);
    public final TextWatcher A6t = new AnonymousClass68H(this, 5);
    public final View.OnClickListener A6u = new C989553w(this, 4);
    public final View.OnClickListener A6v = new C109355eU(this, 1);
    public final ViewTreeObserver.OnPreDrawListener A6w = new AnonymousClass91Y(this, 1);
    public final AbsListView.OnScrollListener A6x = new C110225ft(this);
    public final TextView.OnEditorActionListener A6y = new C110305g1(this);
    public final C15790rw A6z = new AnonymousClass6A8(this, 4);
    public final AnonymousClass4CE A70 = new AnonymousClass694(this, 3);
    public final AnonymousClass4CK A71 = new C107645be(this, 2);
    public final AnonymousClass657 A72 = new C107525bS(this, 2);
    public final C147287Dn A73 = new C147287Dn(this);
    public final C155817fY A74 = new C155817fY(this);
    public final C58222uu A75 = new C58222uu(this);
    public final C40302Fh A76 = new C40302Fh(this);
    public final AnonymousClass5G7 A77 = new AnonymousClass5G7(this);
    public final C1228766e A78 = new AnonymousClass6AB(this, 1);
    public final AnonymousClass487 A79 = new C114055mQ();
    public final C84534Cs A7A = new C106765a8(this, 0);
    public final AnonymousClass5UN A7B = new C95694uG(this);
    public final C627736r A7C = C86664Kz.A1B();
    public final C43942Ub A7D = new C29461ir(this);
    public final C202669mO A7E = new C115135oB(this);
    public final C56872sh A7F = new AnonymousClass524(this);
    public final AnonymousClass4BP A7G = new C107015aY(this, 0);
    public final AnonymousClass5UH A7H = new AnonymousClass56C(this);
    public final C185958uW A7I = new C1237769s(this, 4);
    public final Runnable A7J = C117615sD.A00(this, 48);
    public final Set A7K = AnonymousClass002.A0K();
    public final Set A7L = AnonymousClass002.A0K();
    public final Set A7M = AnonymousClass002.A0K();
    public final Set A7N = AnonymousClass002.A0K();
    public final Stack A7O = new Stack();
    public final int[] A7P = new int[2];
    public volatile Boolean A7Q = null;

    public final void A0y() {
        ExpressionsBottomSheetView expressionsBottomSheetView;
        this.A6j = false;
        if (!this.A6M && (expressionsBottomSheetView = this.A40) != null) {
            A1f(expressionsBottomSheetView);
            this.A40.A0C(4);
            this.A40.A08();
            this.A40.A0B();
            A0c();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: X.5de} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: X.5de} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: X.5de} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: X.5de} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: X.5de} */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02fc, code lost:
        r0.A2z.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0301, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0106, code lost:
        if (X.C86614Ku.A1Y(r0.A41) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0108, code lost:
        r0.A2a.A0F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0169, code lost:
        if (r10.A0F != null) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x016b, code lost:
        r8 = r1.getIntExtra("provider", 0);
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0172, code lost:
        if (r8 == 1) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0174, code lost:
        r7 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0175, code lost:
        if (r8 == 2) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0177, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0178, code lost:
        r10.A05 = r7;
        r8 = r0.A4M.A00(r9, r10, r11, r0.A3B.A0G, r1.getStringExtra("caption"), r14, X.C624435a.A03(r1.getStringExtra("mentions")), (java.util.List) null, (byte) 13, 0, 0, r0.A6P);
        r8.A00 = 1;
        A08(r0).A08(r8, r6, r5, r4);
        r0.A2f.A0P = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01b1, code lost:
        if (A2X() != false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b3, code lost:
        r3 = r0.A46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b5, code lost:
        if (r3 == null) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b7, code lost:
        r3.A01(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ba, code lost:
        r0.A4o.A04(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c5, code lost:
        if (r1.getBooleanExtra("clear_message_after_send", false) == false) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01c7, code lost:
        A10();
        A0t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ee, code lost:
        r3 = r0.A3v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01f0, code lost:
        if (r3 == null) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01f2, code lost:
        r3.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0221, code lost:
        if (r9 == null) goto L_0x0167;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1Y(int r24, int r25, android.content.Intent r26) {
        /*
            r23 = this;
            r2 = 0
            r0 = r23
            r6 = r25
            r1 = r26
            if (r25 != 0) goto L_0x005c
            if (r26 == 0) goto L_0x005c
            java.lang.String r3 = "oom"
            boolean r3 = r1.getBooleanExtra(r3, r2)
            if (r3 == 0) goto L_0x0026
            java.lang.String r3 = "conversation/activityres/oom-error"
            com.whatsapp.util.Log.e((java.lang.String) r3)
            X.3Wi r5 = A07(r0)
            X.4eZ r4 = A09(r0)
            r3 = 2131889108(0x7f120bd4, float:1.941287E38)
            r5.A0N(r4, r3)
        L_0x0026:
            java.lang.String r3 = "no-space"
            boolean r3 = r1.getBooleanExtra(r3, r2)
            if (r3 == 0) goto L_0x0041
            java.lang.String r3 = "conversation/activityres/no-space"
            com.whatsapp.util.Log.e((java.lang.String) r3)
            X.3Wi r5 = A07(r0)
            X.4eZ r4 = A09(r0)
            r3 = 2131889102(0x7f120bce, float:1.9412858E38)
            r5.A0N(r4, r3)
        L_0x0041:
            java.lang.String r3 = "io-error"
            boolean r3 = r1.getBooleanExtra(r3, r2)
            if (r3 == 0) goto L_0x005c
            java.lang.String r3 = "conversation/activityres/fail/load-image"
            com.whatsapp.util.Log.e((java.lang.String) r3)
            X.3Wi r5 = A07(r0)
            X.4eZ r4 = A09(r0)
            r3 = 2131889090(0x7f120bc2, float:1.9412834E38)
            r5.A0N(r4, r3)
        L_0x005c:
            java.util.Set r3 = r0.A7K
            java.util.Iterator r5 = r3.iterator()
        L_0x0062:
            boolean r3 = r5.hasNext()
            r4 = r24
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r5.next()
            X.64L r3 = (X.AnonymousClass64L) r3
            boolean r3 = r3.BM3(r1, r4, r6)
            if (r3 == 0) goto L_0x0062
        L_0x0076:
            return
        L_0x0077:
            java.lang.String r5 = "jids"
            r12 = 0
            r3 = 1
            r7 = -1
            switch(r24) {
                case 2: goto L_0x00c1;
                case 8: goto L_0x00e7;
                case 9: goto L_0x00ee;
                case 11: goto L_0x0354;
                case 13: goto L_0x0354;
                case 22: goto L_0x00f8;
                case 25: goto L_0x010e;
                case 27: goto L_0x022a;
                case 42: goto L_0x0237;
                case 51: goto L_0x0076;
                case 52: goto L_0x0076;
                case 53: goto L_0x0266;
                case 120: goto L_0x027c;
                case 475: goto L_0x0294;
                case 555: goto L_0x02b3;
                case 802: goto L_0x00ee;
                case 806: goto L_0x00f8;
                case 811: goto L_0x0358;
                case 813: goto L_0x0076;
                case 858: goto L_0x00ee;
                case 902: goto L_0x02fa;
                case 905: goto L_0x0364;
                case 906: goto L_0x0302;
                default: goto L_0x007f;
            }
        L_0x007f:
            X.676 r2 = r0.A2z     // Catch:{ NullPointerException -> 0x0085 }
            r2.getActivity()     // Catch:{ NullPointerException -> 0x0085 }
            goto L_0x008a
        L_0x0085:
            java.lang.String r2 = "ConversationDelegate/onActivityResult/default/hostActivityIsNull"
            com.whatsapp.util.Log.e((java.lang.String) r2)
        L_0x008a:
            X.30C r5 = r0.A2t
            X.2Vs r0 = r5.A02
            X.8qC r0 = r0.A00
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            java.util.Iterator r2 = X.AnonymousClass001.A0v(r0)
        L_0x009a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r7 = r2.next()
            X.2sP r7 = (X.C56692sP) r7
            java.lang.Integer r0 = r7.A04()
            if (r0 == 0) goto L_0x009a
            int r0 = r0.intValue()
            if (r0 != r4) goto L_0x009a
            X.4FS r3 = r5.A0C
            X.3Lv r2 = r5.A05
            X.2qz r0 = r5.A0B
            r8 = r1
            r9 = r2
            r10 = r0
            r11 = r3
            r12 = r6
            r7.A09(r8, r9, r10, r11, r12)
            return
        L_0x00c1:
            if (r6 != r7) goto L_0x0076
            java.lang.String r4 = "ad_creation_tapped"
            boolean r4 = r1.getBooleanExtra(r4, r2)
            if (r4 == 0) goto L_0x03bb
            X.5rC r2 = r0.A0u
            boolean r1 = r2.A07()
            if (r1 == 0) goto L_0x047a
            r2.A04()
            X.676 r1 = r0.A2z
            r1.getActivity()
            X.676 r0 = r0.A2z
            r0.getForwardMessages()
            java.lang.String r0 = "handleAdvertiseForwardClick"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x00e7:
            if (r6 != r7) goto L_0x0076
            com.whatsapp.conversation.ConversationListView r0 = r0.A2f
            r0.A0P = r3
            return
        L_0x00ee:
            if (r6 != r7) goto L_0x0076
            com.whatsapp.mentions.MentionableEntry r2 = r0.A4P
            java.lang.String r1 = ""
            r2.setText(r1)
            goto L_0x0100
        L_0x00f8:
            if (r6 != r7) goto L_0x0076
            r0.A10()
            r0.A0t()
        L_0x0100:
            X.1VX r1 = r0.A41
            boolean r1 = X.C86614Ku.A1Y(r1)
            if (r1 == 0) goto L_0x0076
            X.4fS r0 = r0.A2a
            r0.A0F()
            return
        L_0x010e:
            if (r6 != r7) goto L_0x0076
            java.lang.String r4 = "file_path"
            java.lang.String r9 = r1.getStringExtra(r4)
            java.lang.String r4 = "media_url"
            java.lang.String r8 = r1.getStringExtra(r4)
            java.lang.Class<X.4uZ> r4 = X.C95814uZ.class
            java.util.List r14 = X.C86634Kw.A12(r1, r4, r5)
            X.4uZ r4 = X.C627336j.A03(r14)
            boolean r4 = X.AnonymousClass000.A1W(r4)
            if (r4 == 0) goto L_0x0225
            X.C626936e.A06(r1)
            android.os.Bundle r5 = r1.getExtras()
            X.5TZ r4 = r0.A58
            X.5de r11 = r4.A00(r5)
            java.lang.String r4 = "audience_clicked"
            boolean r5 = r1.getBooleanExtra(r4, r2)
            java.lang.String r4 = "audience_updated"
            boolean r4 = r1.getBooleanExtra(r4, r2)
        L_0x0145:
            boolean r6 = android.text.TextUtils.isEmpty(r9)
            if (r6 == 0) goto L_0x0151
            boolean r6 = android.text.TextUtils.isEmpty(r8)
            if (r6 != 0) goto L_0x01cd
        L_0x0151:
            X.33C r10 = new X.33C
            r10.<init>()
            boolean r6 = android.text.TextUtils.isEmpty(r9)
            if (r6 != 0) goto L_0x01f6
            java.io.File r6 = X.AnonymousClass002.A0B(r9)
            r10.A0F = r6
            byte[] r6 = X.C107085af.A04(r6)
            r9 = r12
        L_0x0167:
            java.io.File r7 = r10.A0F
            if (r7 == 0) goto L_0x01cd
        L_0x016b:
            java.lang.String r7 = "provider"
            int r8 = r1.getIntExtra(r7, r2)
            r7 = 1
            if (r8 == r3) goto L_0x0178
            r7 = 2
            if (r8 == r7) goto L_0x0178
            r7 = 0
        L_0x0178:
            r10.A05 = r7
            X.2rD r8 = r0.A4M
            r17 = 13
            java.lang.String r7 = "caption"
            java.lang.String r13 = r1.getStringExtra(r7)
            X.4VQ r7 = r0.A3B
            X.34x r12 = r7.A0G
            java.lang.String r7 = "mentions"
            java.lang.String r7 = r1.getStringExtra(r7)
            java.util.List r15 = X.C624435a.A03(r7)
            boolean r7 = r0.A6P
            r16 = 0
            r18 = r2
            r19 = r2
            r20 = r7
            X.30M r8 = r8.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r8.A00 = r3
            X.33m r7 = A08(r0)
            r7.A08(r8, r6, r5, r4)
            com.whatsapp.conversation.ConversationListView r4 = r0.A2f
            r4.A0P = r3
            boolean r3 = r0.A2X()
            if (r3 != 0) goto L_0x01ee
            X.4qu r3 = r0.A46
            if (r3 == 0) goto L_0x01ee
            r3.A01(r2)
        L_0x01ba:
            X.5pX r3 = r0.A4o
            r3.A04(r2)
            java.lang.String r3 = "clear_message_after_send"
            boolean r1 = r1.getBooleanExtra(r3, r2)
            if (r1 == 0) goto L_0x01cd
            r0.A10()
            r0.A0t()
        L_0x01cd:
            boolean r1 = r0.A2X()
            if (r1 != 0) goto L_0x01d6
            r0.A2T()
        L_0x01d6:
            r0.A0u()
            boolean r1 = r0.A2X()
            if (r1 == 0) goto L_0x0076
            X.676 r1 = r0.A2z
            X.0O9 r2 = r1.getLifecycle()
            com.whatsapp.conversation.delegate.ConversationDelegate$52 r1 = new com.whatsapp.conversation.delegate.ConversationDelegate$52
            r1.<init>(r0)
            r2.A00(r1)
            return
        L_0x01ee:
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r3 = r0.A3v
            if (r3 == 0) goto L_0x01ba
            r3.A00()
            goto L_0x01ba
        L_0x01f6:
            android.net.Uri r9 = android.net.Uri.parse(r8)
            java.lang.String r6 = "media_width"
            int r6 = r1.getIntExtra(r6, r7)
            r10.A08 = r6
            java.lang.String r6 = "media_height"
            int r6 = r1.getIntExtra(r6, r7)
            r10.A06 = r6
            java.lang.String r6 = "preview_media_url"
            java.lang.String r7 = r1.getStringExtra(r6)
            if (r7 == 0) goto L_0x0220
            X.5Xp r6 = r0.A47
            X.8rj r6 = X.C106095Xp.A00(r6)
            X.2OC r6 = r6.B3u(r7)
            if (r6 == 0) goto L_0x0220
            byte[] r12 = r6.A02
        L_0x0220:
            r6 = r12
            if (r9 != 0) goto L_0x016b
            goto L_0x0167
        L_0x0225:
            r11 = r12
            r4 = 0
            r5 = 0
            goto L_0x0145
        L_0x022a:
            if (r6 != r7) goto L_0x0076
            com.whatsapp.conversation.ConversationListView r1 = r0.A2f
            r1.A0P = r3
            r0.A10()
            r0.A0t()
            return
        L_0x0237:
            if (r6 != r7) goto L_0x0076
            if (r26 == 0) goto L_0x0076
            java.lang.String r3 = "contact"
            java.lang.String r1 = r1.getStringExtra(r3)
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass32Y.A08(r1)
            if (r4 == 0) goto L_0x0076
            X.4eZ r1 = A09(r0)
            android.content.Intent r3 = X.C627736r.A08(r1, r2)
            java.lang.String r1 = "jid"
            X.AnonymousClass0x2.A0u(r3, r4, r1)
            X.4uZ r1 = r0.A4J
            java.lang.String r2 = X.C627336j.A07(r1)
            java.lang.String r1 = "group_reply_jid"
            r3.putExtra(r1, r2)
            X.676 r1 = r0.A2z
            r1.startActivity(r3)
            goto L_0x02fc
        L_0x0266:
            if (r25 != 0) goto L_0x0076
            X.4eZ r3 = A09(r0)
            X.676 r0 = r0.A2z
            android.view.View r2 = r0.getContentView()
            r0 = 53
            X.4ab r0 = X.AnonymousClass5VE.A00(r3, r1, r2, r0)
            r0.A05()
            return
        L_0x027c:
            X.4FS r4 = r0.A5i
            r1 = 25
            X.5sD r1 = X.C117615sD.A00(r0, r1)
            r4.BkM(r1)
            r0.A1O()
            X.3ZH r1 = r0.A3n
            int r1 = r1.A00
            if (r1 != r3) goto L_0x0076
            r0.A2J(r2)
            return
        L_0x0294:
            if (r26 == 0) goto L_0x0076
            java.lang.String r2 = "error_code"
            int r2 = r1.getIntExtra(r2, r7)
            r1 = 475(0x1db, float:6.66E-43)
            if (r2 != r1) goto L_0x0076
            X.2yd r1 = r0.A5b
            X.4eZ r0 = A09(r0)
            X.2or r1 = r1.A01(r0)
            X.8Jo r0 = new X.8Jo
            r0.<init>()
            r1.A01(r0)
            return
        L_0x02b3:
            if (r6 != r7) goto L_0x0076
            X.676 r1 = r0.A2z
            android.view.View r4 = r1.getContentView()
            X.676 r3 = r0.A2z
            r1 = 2131895475(0x7f1224b3, float:1.9425784E38)
            java.lang.String r3 = r3.getString(r1)
            java.util.List r8 = java.util.Collections.emptyList()
            X.33i r7 = r0.A3G
            X.4eZ r5 = A09(r0)
            r1 = 2000(0x7d0, float:2.803E-42)
            X.4ab r6 = X.C88694ab.A02(r4, r3, r1)
            X.5fd r4 = new X.5fd
            r9 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            r3 = 2131894586(0x7f12213a, float:1.942398E38)
            X.5eU r1 = new X.5eU
            r1.<init>(r0, r2)
            r4.A04(r1, r3)
            X.4eZ r2 = A09(r0)
            r1 = 2130970663(0x7f040827, float:1.7550042E38)
            r0 = 2131102476(0x7f060b0c, float:1.781739E38)
            int r0 = X.AnonymousClass5Yj.A02(r2, r1, r0)
            r4.A02(r0)
            r4.A01()
            return
        L_0x02fa:
            if (r6 != r7) goto L_0x0076
        L_0x02fc:
            X.676 r0 = r0.A2z
            r0.finish()
            return
        L_0x0302:
            com.whatsapp.conversation.conversationrow.MessageSelectionViewModel r2 = r0.A2q
            X.08M r2 = r2.A00
            java.lang.Object r4 = r2.A07()
            X.5QO r4 = (X.AnonymousClass5QO) r4
            if (r4 == 0) goto L_0x0322
            java.util.HashMap r2 = r4.A04
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0322
            r2 = 2
            if (r6 != r2) goto L_0x0328
            X.4eZ r2 = A09(r0)
            r1 = 106(0x6a, float:1.49E-43)
            X.C621433s.A01(r2, r1)
        L_0x0322:
            com.whatsapp.conversation.conversationrow.MessageSelectionViewModel r0 = r0.A2q
            r0.A0D()
            return
        L_0x0328:
            r2 = 3
            if (r6 != r2) goto L_0x0322
            if (r26 == 0) goto L_0x0322
            java.lang.String r2 = "RESULT_EXTRA_ACTION_ID"
            int r3 = r1.getIntExtra(r2, r7)
            if (r3 == r7) goto L_0x0322
            X.5M4 r1 = r0.A1U
            X.4ox r2 = r1.A00(r0)
            java.util.Collection r1 = r4.A00()
            boolean r1 = r2.B2s(r0, r1, r3)
            if (r1 == 0) goto L_0x0322
            X.4pC r1 = r0.A34
            X.66j r1 = r1.A00(r3)
            if (r1 == 0) goto L_0x0322
            boolean r1 = r1.B7f()
            if (r1 == 0) goto L_0x0076
            goto L_0x0322
        L_0x0354:
            r0.A12()
            return
        L_0x0358:
            if (r6 != r7) goto L_0x0361
            X.7yG r1 = r0.A48
            if (r1 == 0) goto L_0x0361
            r0.A1v(r1)
        L_0x0361:
            r0.A48 = r12
            return
        L_0x0364:
            if (r6 != r7) goto L_0x03af
            X.4uZ r1 = r0.A4J
            boolean r4 = r1 instanceof X.C95804uY
            X.33p r1 = r0.A3K
            android.content.SharedPreferences r5 = X.AnonymousClass0x2.A0F(r1)
            if (r4 == 0) goto L_0x03b8
            java.lang.String r1 = "first_channel_message_edit_modal_shown"
        L_0x0374:
            boolean r1 = r5.getBoolean(r1, r2)
            if (r1 != 0) goto L_0x03af
            X.33p r1 = r0.A3K
            android.content.SharedPreferences$Editor r2 = X.C18270x1.A03(r1)
            if (r4 == 0) goto L_0x03b5
            java.lang.String r1 = "first_channel_message_edit_modal_shown"
        L_0x0384:
            X.C18270x1.A0l(r2, r1, r3)
            X.4eZ r1 = A09(r0)
            X.0zH r3 = X.AnonymousClass5V0.A00(r1)
            r1 = 2131889381(0x7f120ce5, float:1.9413424E38)
            if (r4 == 0) goto L_0x0397
            r1 = 2131889380(0x7f120ce4, float:1.9413422E38)
        L_0x0397:
            r3.A0T(r1)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r3.A0Y(r12, r1)
            r2 = 2131895973(0x7f1226a5, float:1.9426794E38)
            r1 = 39
            if (r4 != 0) goto L_0x03a9
            r1 = 38
        L_0x03a9:
            X.C1235268t.A04(r3, r0, r1, r2)
            r3.A0S()
        L_0x03af:
            com.whatsapp.mentions.MentionableEntry r0 = r0.A4P
            r0.requestFocus()
            return
        L_0x03b5:
            java.lang.String r1 = "first_message_edit_modal_shown"
            goto L_0x0384
        L_0x03b8:
            java.lang.String r1 = "first_message_edit_modal_shown"
            goto L_0x0374
        L_0x03bb:
            X.676 r4 = r0.A2z
            java.util.Collection r6 = r4.getForwardMessages()
            boolean r4 = r6.isEmpty()
            if (r4 != 0) goto L_0x0486
            java.lang.Class<X.4uZ> r4 = X.C95814uZ.class
            java.util.List r4 = X.C86634Kw.A12(r1, r4, r5)
            java.lang.String r5 = "include_captions"
            boolean r16 = r1.getBooleanExtra(r5, r2)
            java.lang.String r5 = "appended_message"
            java.lang.String r13 = r1.getStringExtra(r5)
            X.4uZ r5 = X.C627336j.A03(r4)
            boolean r5 = X.AnonymousClass000.A1W(r5)
            if (r5 == 0) goto L_0x03f0
            X.C626936e.A06(r1)
            android.os.Bundle r5 = r1.getExtras()
            X.5TZ r1 = r0.A58
            X.5de r12 = r1.A00(r5)
        L_0x03f0:
            java.util.LinkedList r15 = new java.util.LinkedList
            r15.<init>(r4)
            X.4uZ r1 = r0.A4J
            boolean r1 = r1 instanceof X.C95804uY
            if (r1 == 0) goto L_0x042c
            X.4uZ r7 = X.C627336j.A03(r4)
            if (r7 == 0) goto L_0x042c
            X.5LO r1 = A0C(r0)
            X.8qC r1 = r1.A0B
            java.lang.Object r1 = r1.get()
            X.4rH r1 = (X.AnonymousClass4rH) r1
            boolean r1 = r1.A08(r6)
            if (r1 == 0) goto L_0x042c
            X.4FS r5 = r0.A5i
            r22 = 39
            X.3cM r1 = new X.3cM
            r18 = r0
            r19 = r6
            r20 = r7
            r21 = r12
            r17 = r1
            r17.<init>((java.lang.Object) r18, (java.lang.Object) r19, (java.lang.Object) r20, (java.lang.Object) r21, (int) r22)
            r5.BkM(r1)
            r15.remove(r7)
        L_0x042c:
            X.33m r10 = A08(r0)
            X.5Ul r11 = r0.A1f
            java.util.ArrayList r14 = X.AnonymousClass002.A0J(r6)
            r1 = 8
            X.AnonymousClass6A6.A00(r14, r1)
            r10.A09(r11, r12, r13, r14, r15, r16)
            int r1 = r4.size()
            if (r1 != r3) goto L_0x0480
            java.lang.Object r1 = r4.get(r2)
            boolean r1 = r1 instanceof X.C135166kE
            if (r1 != 0) goto L_0x0480
            X.4uZ r3 = r0.A4J
            X.C626936e.A06(r3)
            java.lang.Object r1 = r4.get(r2)
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x047a
            X.676 r1 = r0.A2z
            X.5hX r6 = r1.getActivityUtils()
            X.4eZ r5 = A09(r0)
            X.36r r3 = r0.A7C
            X.4eZ r2 = A09(r0)
            X.676 r1 = r0.A2z
            X.3Ex r1 = r1.getContactManager()
            android.content.Intent r2 = X.C86604Kt.A08(r2, r1, r3, r4)
            java.lang.String r1 = "Conversation:forwardMessage"
            r6.A0C(r5, r2, r1)
        L_0x047a:
            X.676 r0 = r0.A2z
            r0.B3M()
            return
        L_0x0480:
            X.676 r1 = r0.A2z
            r1.Bqv(r4)
            goto L_0x047a
        L_0x0486:
            java.lang.String r1 = "conversation/forward/failed"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            X.3Wi r3 = A07(r0)
            r1 = 2131890741(0x7f121235, float:1.9416182E38)
            r3.A0H(r1, r2)
            goto L_0x047a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113245l7.A1Y(int, int, android.content.Intent):void");
    }

    public final void A1g(View view, ViewGroup viewGroup) {
        AnonymousClass5KX r2;
        A1Q(A0V(1));
        boolean z = false;
        ConversationListView conversationListView = this.A2f;
        if (conversationListView != null) {
            z = conversationListView.A0B(0);
        }
        this.A05 = -1;
        this.A1a.setClipChildren(false);
        int transcriptMode = this.A2f.getTranscriptMode();
        ViewGroup viewGroup2 = viewGroup;
        int height = viewGroup.getHeight();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) height);
        translateAnimation.setDuration(250);
        View view2 = view;
        view.startAnimation(translateAnimation);
        if (viewGroup == this.A0a && this.A0W.getVisibility() == 0) {
            this.A0W.startAnimation(translateAnimation);
        }
        if (viewGroup == this.A0a && (r2 = this.A2p) != null) {
            WebPagePreviewView webPagePreviewView = r2.A05;
            if (webPagePreviewView.A0U.A0Y(C58422vE.A01, 3254)) {
                webPagePreviewView.A07.setLayoutTransition((LayoutTransition) null);
            }
        }
        if (this.A4P.A0L) {
            this.A0c.startAnimation(translateAnimation);
        }
        if (z) {
            this.A2f.setTranscriptMode(2);
            this.A2f.startAnimation(translateAnimation);
        }
        View view3 = this.A2c.A02;
        Drawable background = view3.getBackground();
        if (!(background instanceof AnonymousClass4M8)) {
            background = new AnonymousClass4M8(view3.getBackground());
            view3.setBackground(background);
        }
        AnonymousClass4M8 r3 = (AnonymousClass4M8) background;
        r3.A00 = height;
        r3.invalidateSelf();
        AnonymousClass4OB r22 = new AnonymousClass4OB(this, r3, height);
        r22.setDuration(250);
        this.A2c.A02.startAnimation(r22);
        r22.setAnimationListener(new C88784an(view2, viewGroup2, this, transcriptMode, z));
    }

    public final void A1h(View view, ViewGroup viewGroup) {
        boolean z = false;
        ConversationListView conversationListView = this.A2f;
        if (conversationListView != null) {
            z = conversationListView.A0B(0);
        }
        this.A05 = 1;
        this.A1a.setClipChildren(false);
        int transcriptMode = this.A2f.getTranscriptMode();
        ConversationListView conversationListView2 = this.A2f;
        if (z) {
            conversationListView2.setTranscriptMode(2);
        } else {
            conversationListView2.setTranscriptMode(0);
        }
        A1Q(A0V(0));
        viewGroup.setVisibility(0);
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new C110005fX(view, viewGroup, this, transcriptMode, z));
    }

    public void A1i(ViewGroup viewGroup, C624134x r9) {
        C624134x fMessage = ((C182158nx) viewGroup).getFMessage();
        Stack stack = this.A7O;
        if (!stack.isEmpty() && ((C148947Ki) stack.peek()).A01.A1L != fMessage.A1L) {
            stack.clear();
        }
        stack.push(new C148947Ki(r9, fMessage, viewGroup.getTop()));
        if (fMessage != null) {
            A22(r9, fMessage, A0S());
        } else {
            A20(r9);
        }
        if ((r9 instanceof AnonymousClass1nE) && AnonymousClass320.A00) {
            C93314oJ A002 = this.A2f.A00(r9.A1J);
            if (A002 instanceof C183138pY) {
                ((C183138pY) A002).BpZ();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r1 == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1k(com.whatsapp.TextEmojiLabel r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            r2 = 0
            X.4eZ r6 = A09(r7)
            X.3LP r1 = r7.A42
            X.4uZ r0 = r7.A4J
            boolean r0 = X.C57362tW.A00(r1, r0)
            if (r0 == 0) goto L_0x0033
            X.4uZ r1 = r7.A4J
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0020
            X.2sq r0 = r7.A27
            boolean r1 = X.C86614Ku.A1X(r0, r1)
            r0 = 2131895452(0x7f12249c, float:1.9425737E38)
            if (r1 != 0) goto L_0x0023
        L_0x0020:
            r0 = 2131895454(0x7f12249e, float:1.9425741E38)
        L_0x0023:
            java.lang.String r0 = X.AnonymousClass1RT.A00(r6, r0)
            r8.setText(r0)
            X.4T8 r0 = new X.4T8
            r0.<init>()
            X.C06560Yg.A0O(r8, r0)
            return
        L_0x0033:
            X.1VX r1 = r7.A41
            X.4uZ r0 = r7.A4J
            boolean r1 = X.C616831v.A00(r1, r0)
            r5 = 0
            r0 = 1
            if (r1 == 0) goto L_0x0052
            X.4eZ r3 = A09(r7)
            r2 = 2131894171(0x7f121f9b, float:1.942314E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "WhatsApp Surveys"
            java.lang.String r0 = X.AnonymousClass002.A0F(r3, r0, r1, r5, r2)
        L_0x004e:
            r8.setText(r0)
            return
        L_0x0052:
            if (r10 == 0) goto L_0x005c
            r0 = 2131888449(0x7f120941, float:1.9411534E38)
            java.lang.String r0 = r6.getString(r0)
            goto L_0x004e
        L_0x005c:
            if (r9 == 0) goto L_0x0062
            r7.A1j(r8, r2)
            return
        L_0x0062:
            r4 = 2131889779(0x7f120e73, float:1.9414231E38)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            X.4eZ r2 = A09(r7)
            r1 = 2130968582(0x7f040006, float:1.7545822E38)
            r0 = 2131099679(0x7f06001f, float:1.7811718E38)
            int r0 = X.AnonymousClass5Yj.A02(r2, r1, r0)
            java.lang.String r0 = X.C107575bX.A04(r6, r0)
            r3[r5] = r0
            android.text.Spanned r0 = X.C107575bX.A00(r6, r3, r4)
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113245l7.A1k(com.whatsapp.TextEmojiLabel, boolean, boolean):void");
    }

    public final void A2K(boolean z) {
        AnonymousClass6BY r9 = new AnonymousClass6BY(this, 1);
        AnonymousClass5KX r6 = new AnonymousClass5KX(A09(this), this.A2z.getFMessageIO(), r9, this.A3D, A0G(this), this.A2z.getGroupChatManager().A1B.A01(), z);
        this.A2p = r6;
        AnonymousClass5MV r5 = new AnonymousClass5MV(this);
        AnonymousClass5RH r2 = this.A3T;
        C95814uZ r4 = this.A4J;
        ConversationListView conversationListView = this.A2f;
        MentionableEntry mentionableEntry = this.A4P;
        ViewGroup viewGroup = this.A0a;
        KeyboardPopupLayout keyboardPopupLayout = this.A1a;
        if (r2.A0U && !r2.A0E) {
            r2.A0A = r4;
            r2.A07 = r5;
            r2.A02 = conversationListView;
            r2.A03 = mentionableEntry;
            r2.A01 = viewGroup;
            r2.A06 = r6;
            Activity activity = r2.A0I;
            boolean A1U2 = AnonymousClass000.A1U(C86604Kt.A02(activity), 2);
            if (r2.A0H != 2) {
                r2.A08 = (IcebreakerBubbleView) C005205m.A00(activity, r2.A0G);
            } else if (!A1U2) {
                View inflate = LayoutInflater.from(activity).inflate(R.layout.f8nameremoved, viewGroup, false);
                r2.A00 = inflate;
                C626936e.A04(inflate);
                r2.A05 = (ShimmerFrameLayout) C06560Yg.A02(inflate, R.id.shimmer);
                r2.A00.setVisibility(8);
                viewGroup.addView(r2.A00);
                AnonymousClass4ZC r62 = new AnonymousClass4ZC(activity, keyboardPopupLayout, viewGroup, mentionableEntry, new AnonymousClass7HZ(r6, r2), r2.A0B);
                r2.A09 = r62;
                r62.setVisibility(8);
                r2.A0F = false;
                viewGroup.addView(r2.A09);
                mentionableEntry.addTextChangedListener(r2.A0J);
            }
            r2.A0E = true;
        }
        C149747Ns r22 = (C149747Ns) A7S.get(A0F(this));
        if (r22 != null && (r22.A03 || r22.A04)) {
            AnonymousClass5RH r3 = this.A3T;
            if (r3.A0E) {
                if (r3.A0H == 2) {
                    r3.A06.A05.setVisibility(8);
                    View view = r3.A00;
                    C626936e.A04(view);
                    view.setVisibility(0);
                    ShimmerFrameLayout shimmerFrameLayout = r3.A05;
                    C626936e.A04(shimmerFrameLayout);
                    shimmerFrameLayout.A02();
                } else {
                    IcebreakerBubbleView icebreakerBubbleView = r3.A08;
                    C626936e.A04(icebreakerBubbleView);
                    icebreakerBubbleView.removeAllViews();
                    ((ShimmerFrameLayout) C06560Yg.A02(C18280x3.A0D(icebreakerBubbleView).inflate(R.layout.f8nameremoved, icebreakerBubbleView, true), R.id.shimmer)).A02();
                    icebreakerBubbleView.setVisibility(0);
                }
            }
        }
        this.A0a.addView(this.A2p.A05);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0067, code lost:
        if (X.AnonymousClass5BT.A00(A0E(r12), r7, r13, r15) == false) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A2f(X.C30721mu r13, int r14, boolean r15, boolean r16) {
        /*
            r12 = this;
            r5 = r12
            X.1VX r0 = A0E(r12)
            boolean r11 = X.AnonymousClass5ZQ.A01(r0)
            X.4On r0 = A0A(r12)
            r8 = r13
            X.34x r7 = X.C100355Ap.A00(r0, r13)
            r2 = 0
            r3 = 1
            if (r7 == 0) goto L_0x0069
            X.1VX r0 = A0E(r12)
            boolean r0 = X.AnonymousClass5BT.A00(r0, r7, r13, r15)
            if (r0 == 0) goto L_0x005f
            r12.A6J = r3
            r6 = r7
            X.1mu r6 = (X.C30721mu) r6
            X.676 r0 = r12.A2z
            X.5RC r1 = r0.getMessageAudioPlayerFactory()
            X.4eZ r0 = r0.getActivity()
            r4 = r16
            X.5pj r9 = r1.A01(r0, r4, r3)
            r9.A0N = r6
            r9.A0A = r3
            int r1 = r6.A0D
            r0 = 9
            if (r1 == r0) goto L_0x0043
            r0 = 10
            if (r1 != r0) goto L_0x0044
        L_0x0043:
            r2 = 1
        L_0x0044:
            r9.A0U = r2
            X.69Z r0 = new X.69Z
            r0.<init>(r12, r9, r6, r3)
            r9.A0I = r0
            X.4eZ r1 = A09(r12)
            X.3Wi r0 = A07(r12)
            r10 = 3
            X.3b2 r4 = new X.3b2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            X.AnonymousClass5VJ.A01(r1, r0, r4, r14)
            return r3
        L_0x005f:
            X.1VX r0 = A0E(r12)
            boolean r0 = X.AnonymousClass5BT.A00(r0, r7, r13, r15)
            if (r0 != 0) goto L_0x007b
        L_0x0069:
            if (r11 == 0) goto L_0x007b
            X.676 r0 = r12.A2z
            X.3Mh r1 = r0.getServerProps()
            X.1Ek r0 = X.C66663Mh.A1p
            int r0 = r1.A03(r0)
            long r0 = (long) r0
            r12.A2A(r13, r0, r3)
        L_0x007b:
            X.4eZ r0 = A09(r12)
            X.AnonymousClass5VJ.A00(r0, r14)
            r12.A6O = r2
            r0 = 0
            r12.A4w = r0
            r12.A6J = r2
            X.1VX r1 = r12.A41
            r0 = 6129(0x17f1, float:8.589E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x009a
            X.7l9 r0 = X.C159117l9.A0Y
            if (r0 == 0) goto L_0x009a
            r0.A02()
        L_0x009a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113245l7.A2f(X.1mu, int, boolean, boolean):boolean");
    }

    public static int A00(C113245l7 r0) {
        return r0.A2z.getResources().getConfiguration().orientation;
    }

    public static Intent A01(C113245l7 r0) {
        return r0.A2z.getIntent();
    }

    public static Resources A02(C113245l7 r0) {
        return r0.A2z.getActivity().getResources();
    }

    public static Window A03(C113245l7 r0) {
        return r0.A2z.getWindow();
    }

    public static C08270df A04(C113245l7 r0) {
        return r0.A2z.getSupportFragmentManager();
    }

    public static C15910sA A05(C113245l7 r0) {
        return r0.A2z.getLifecycleOwner();
    }

    public static AnonymousClass0XL A06(C113245l7 r1) {
        return new AnonymousClass0XL(r1.A2z.getViewModelStoreOwner());
    }

    public static C69263Wi A07(C113245l7 r0) {
        return r0.A2z.getGlobalUI();
    }

    public static C621033m A08(C113245l7 r0) {
        return r0.A2z.getUserActions();
    }

    public static C89644eZ A09(C113245l7 r0) {
        return r0.A2z.getActivity();
    }

    public static C87234On A0A(C113245l7 r0) {
        return r0.A2f.getConversationCursorAdapter();
    }

    public static AnonymousClass5KY A0B(C113245l7 r0) {
        return (AnonymousClass5KY) r0.A5x.get();
    }

    public static AnonymousClass5LO A0C(C113245l7 r0) {
        return (AnonymousClass5LO) r0.A61.get();
    }

    public static AnonymousClass33p A0D(C113245l7 r0) {
        return r0.A2z.getWaSharedPreferences();
    }

    public static AnonymousClass1VX A0E(C113245l7 r0) {
        return r0.A2z.getAbProps();
    }

    public static Jid A0F(C113245l7 r1) {
        return r1.A3n.A0I(C95814uZ.class);
    }

    public static AnonymousClass4FS A0G(C113245l7 r0) {
        return r0.A2z.getWaWorkers();
    }

    public static List A0H(C113245l7 r3, AnonymousClass3ZH r4) {
        AnonymousClass676 r0 = r3.A2z;
        return AnonymousClass36T.A03(r0.getMeManager(), r3.A2z.getContactManager(), r0.getGroupParticipantsManager(), r4);
    }

    public static void A0J(C113245l7 r1) {
        AnonymousClass66v r12 = r1.A5l;
        if (r12 != null && r12.B8N()) {
            r12.BgY();
        }
    }

    public static /* synthetic */ void A0L(C113245l7 r3) {
        ExpressionsBottomSheetView expressionsBottomSheetView;
        if (r3.A3v != null && (expressionsBottomSheetView = r3.A40) != null && r3.A0t != null) {
            r3.A1a.A07 = true;
            expressionsBottomSheetView.setVisibility(8);
            r3.A40.post(C117615sD.A00(r3, 11));
        }
    }

    public static /* synthetic */ void A0O(C113245l7 r4, String str, boolean z) {
        ExpressionsBottomSheetView expressionsBottomSheetView = r4.A40;
        if (expressionsBottomSheetView != null) {
            expressionsBottomSheetView.setExpressionsTabs(r4.A0T());
            EmojiSearchKeyboardContainer emojiSearchKeyboardContainer = r4.A3v;
            if (emojiSearchKeyboardContainer != null && emojiSearchKeyboardContainer.getVisibility() == 0) {
                r4.A3v.A00();
            }
        }
        r4.A1G();
        r4.A1a.postDelayed(new C70303aH(r4, str, 2, z), 200);
    }

    public static /* synthetic */ void A0P(C113245l7 r2, boolean z) {
        View A042;
        View A043;
        View findViewById = r2.A2z.findViewById(16908298);
        if (findViewById != null) {
            int i = 4;
            if (z) {
                i = 1;
            }
            findViewById.setImportantForAccessibility(i);
        }
        AnonymousClass5UY r1 = r2.A5g;
        if (!(r1.A01 == null || (A043 = r1.A04()) == null)) {
            int i2 = 4;
            if (z) {
                i2 = 1;
            }
            A043.setImportantForAccessibility(i2);
        }
        AnonymousClass5UY r12 = r2.A5h;
        if (r12.A01 != null && (A042 = r12.A04()) != null) {
            int i3 = 4;
            if (z) {
                i3 = 1;
            }
            A042.setImportantForAccessibility(i3);
        }
    }

    public static boolean A0Q(C113245l7 r0) {
        return r0.A3n.A0H instanceof C95804uY;
    }

    public int A0V(int i) {
        if (i != 0) {
            if (i != 1) {
                if (this.A0W.getVisibility() == 0) {
                    return R.drawable.ib_new_expanded;
                }
            } else if (this.A4P.A0L) {
                return R.drawable.ib_new_expanded_bottom;
            } else {
                if (this.A0W.getVisibility() != 0) {
                    return R.drawable.ib_new_round;
                }
            }
            if (this.A0a.getVisibility() == 0) {
                return R.drawable.ib_new_expanded;
            }
            return R.drawable.ib_new_round;
        } else if (!this.A4P.A0L) {
            return R.drawable.ib_new_expanded;
        } else {
            return R.drawable.ib_new_expanded_bottom;
        }
    }

    public Dialog A0W(int i) {
        AnonymousClass5ZT r0 = this.A5q;
        if (r0 != null && r0.A0U()) {
            AnonymousClass5ZT r1 = this.A5q;
            if (!r1.A12.A08) {
                r1.A01 = i;
                return null;
            }
        }
        Dialog A002 = this.A3s.A00(this.A3n, i);
        if (A002 == null) {
            return this.A2z.BdX(i);
        }
        return A002;
    }

    public C152967aS A0X() {
        C152967aS r2 = this.A24;
        if (r2 != null) {
            return r2;
        }
        C152967aS r22 = new C152967aS(this.A23, this.A4u);
        this.A24 = r22;
        return r22;
    }

    public final AnonymousClass5TN A0Y() {
        AnonymousClass57x r0;
        AnonymousClass5TN r02 = this.A2k;
        if (r02 != null) {
            return r02;
        }
        AnonymousClass1VX r2 = this.A41;
        if (this.A37.A0F() || !this.A4F.A01(this.A4J) || (A0Q(this) && !A0E(this).A0X(5875))) {
            r0 = AnonymousClass57x.NONE;
        } else if (!this.A5a.BFD() || !this.A56.A0f() || A0Q(this)) {
            r0 = AnonymousClass57x.VOICE_ONLY;
        } else {
            r0 = AnonymousClass57x.VOICE_AND_VIDEO;
        }
        AnonymousClass5TN A002 = AnonymousClass5V9.A00(r0, r2);
        this.A2k = A002;
        return A002;
    }

    public AnonymousClass679 A0Z() {
        AnonymousClass5R7 conversationRowCustomizers = this.A2z.getConversationRowCustomizers();
        if (this.A3d.A0N(this.A4J)) {
            return conversationRowCustomizers.A04;
        }
        AnonymousClass1VX r1 = this.A41;
        if (C627336j.A0K(this.A4J) && r1.A0X(1825)) {
            return conversationRowCustomizers.A09;
        }
        if (A0Q(this)) {
            return conversationRowCustomizers.A0C;
        }
        if (AnonymousClass5KY.A00(this).BH2(this.A4J)) {
            return conversationRowCustomizers.A02;
        }
        return conversationRowCustomizers.A08;
    }

    public final C632338l A0a() {
        String A0H2 = this.A2z.getWAContactNames().A0H(this.A3n);
        if (A0H2 == null) {
            return null;
        }
        return new C632338l(Boolean.valueOf(this.A3n.A0U()), A0H2, C627336j.A07(this.A4J));
    }

    public void A0b() {
        boolean A0X2 = this.A41.A0X(5868);
        AnonymousClass3ZH r1 = this.A3n;
        if (A0X2) {
            A1Z(r1.A0F(), true, C56972sr.A08(this.A1b, r1));
        } else {
            CreateOrAddToContactsDialog.A00(r1, C56972sr.A08(this.A1b, r1)).A1O(A04(this), (String) null);
        }
    }

    public void A0c() {
        KeyboardPopupLayout keyboardPopupLayout = this.A1a;
        keyboardPopupLayout.A07 = false;
        keyboardPopupLayout.requestLayout();
    }

    public void A0e() {
        BottomSheetBehavior bottomSheetBehavior;
        SharedPreferences.Editor A032;
        String str;
        if (this.A4P == null) {
            return;
        }
        if (A2X()) {
            int A0U2 = A0U();
            MentionableEntry mentionableEntry = this.A4P;
            if (mentionableEntry != null) {
                mentionableEntry.A05();
            }
            if (A0U2 > 0 && (bottomSheetBehavior = this.A0t) != null) {
                int i = bottomSheetBehavior.A0F;
                if (i <= 0 || i > A0U2) {
                    int A002 = A00(this);
                    SharedPreferences A0F2 = AnonymousClass0x2.A0F(this.A3K);
                    if (A002 == 1) {
                        if (C18280x3.A02(A0F2, "expressions_tray_peek_height_portrait") != A0U2) {
                            A032 = C18270x1.A03(this.A3K);
                            str = "expressions_tray_peek_height_portrait";
                        } else {
                            return;
                        }
                    } else if (C18280x3.A02(A0F2, "expressions_tray_peek_height_landscape") != A0U2) {
                        A032 = C18270x1.A03(this.A3K);
                        str = "expressions_tray_peek_height_landscape";
                    } else {
                        return;
                    }
                    C18270x1.A0h(A032, str, A0U2);
                    BottomSheetBehavior bottomSheetBehavior2 = this.A0t;
                    if (bottomSheetBehavior2 != null) {
                        bottomSheetBehavior2.A0U(A0U2, false);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        this.A4P.A05();
    }

    public void A0f() {
        int i;
        if (this.A3T.A01()) {
            C117615sD A002 = C117615sD.A00(this, 16);
            C117615sD A003 = C117615sD.A00(this, 17);
            AnonymousClass5RH r4 = this.A3T;
            if (r4.A0E && !r4.A0C && r4.A0H == 2) {
                r4.A0C = true;
                C71733ca r1 = r4.A04;
                if (r1 != null) {
                    r4.A0K.A0R(r1);
                }
                AnonymousClass4ZC r5 = r4.A09;
                C626936e.A04(r5);
                int i2 = r4.A01.getLayoutParams().height;
                AnonymousClass4OA r2 = new AnonymousClass4OA(r4, r4.A01.getHeight());
                r2.setDuration(400);
                r2.setAnimationListener(new C88824ar(r4, r5, A002, A003, i2));
                r4.A01.startAnimation(r2);
            }
        } else if (this.A0a.getVisibility() == 0 && (i = this.A05) >= 0) {
            C18260x0.A0y("conversation/hidelinkpreview/start ", AnonymousClass001.A0o(), i);
            AnonymousClass5KX r0 = this.A2p;
            if (r0 != null) {
                A1g(r0.A05, this.A0a);
            }
            A2M(false);
        }
    }

    public void A0h() {
        Cursor A0E2;
        Log.d("Conversation/onActivityCreateAsync");
        this.A1p.A02(A05(this), new AnonymousClass6C3(this, 1));
        AnonymousClass4VQ r5 = this.A3B;
        if (r5.A0z.A01()) {
            Map A002 = r5.A0u.A00(r5.A0x);
            if (!A002.isEmpty()) {
                r5.A0R.post(new C117155rT(r5, 10, A002));
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 || (i == 21 && "samsung".equalsIgnoreCase(Build.MANUFACTURER))) {
            KeyguardManager A092 = this.A2z.getSystemServices().A09();
            C626936e.A06(A092);
            if (A092.isKeyguardLocked()) {
                Log.i("conversation/locked");
                AnonymousClass67N r3 = new AnonymousClass67N(this, 1);
                this.A09 = r3;
                this.A2z.Bih(r3, new IntentFilter("android.intent.action.USER_PRESENT"), true);
            }
        }
        this.A3H.A01();
        if (A01(this).getBooleanExtra("fromNotification", false) && A01(this).getBooleanExtra("last_notification_keep_in_chat", false)) {
            this.A3x.A00("kic_notification_taps");
            if (this.A6V) {
                this.A3x.A00("kic_group_notification_taps");
            }
        }
        if (A01(this).getBooleanExtra("fromMessageReminderNotification", false) && this.A41.A0X(5544)) {
            this.A2m.A06(this.A4J, 10);
        }
        AnonymousClass4FS A0G2 = A0G(this);
        UserJid A032 = AnonymousClass32Y.A03(this.A4J);
        if (A032 != null) {
            C71333bw.A00(A0G2, this, A032, 49);
        }
        C50182hl r6 = (C50182hl) A0B(this).A04.get();
        C95814uZ r32 = this.A4J;
        C162457s7.A0J(r32, 0);
        if (C155477ey.A00(r32) && r6.A02.A00() && r6.A05.A0C(r32) == null) {
            C66543Lv r52 = r6.A06;
            boolean z = false;
            ArrayList A0I2 = AnonymousClass002.A0I(2);
            A0I2.add(String.valueOf(r52.A0W.A07(r32)));
            A0I2.add(String.valueOf(new byte[]{87}[0]));
            AnonymousClass4GK A033 = r52.A18.get();
            try {
                C56862sg r8 = ((AnonymousClass3H0) A033).A03;
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("SELECT  1  FROM available_message_view WHERE chat_row_id = ? AND ");
                A0o2.append("message_type IN ");
                A0o2.append(C57212tH.A00(1));
                A0E2 = r8.A0E(AnonymousClass000.A0X(" LIMIT 1", A0o2), "CHECK_MSG_EXISTENCE_BY_JID_IN_CHAT", C18300x5.A1b(A0I2));
                if (A0E2.getCount() > 0) {
                    z = true;
                }
                A0E2.close();
                A033.close();
                C18260x0.A1D("BonsaiWelcomeMessageHelperImpl onChatOpen hasRequested=", AnonymousClass001.A0o(), z);
                if (!z) {
                    C18260x0.A1P(AnonymousClass001.A0o(), "BonsaiWelcomeMessageHelperImpl/sendRequestWelcomeMessage jid=", r32);
                    C56612sH r1 = r6.A04;
                    C30241m8 r2 = new C30241m8(AnonymousClass35J.A00(r6.A01, r1, r32, true), r1.A0H());
                    byte[] bArr = new byte[32];
                    AnonymousClass29O.A00().nextBytes(bArr);
                    r2.A1a = bArr;
                    r2.A1D = true;
                    r52.A0V(r2);
                }
            } catch (Throwable th) {
                try {
                    A033.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        if (this.A3n.A0T()) {
            A1O();
            C56402rv r22 = A0B(this).A03;
            C95814uZ r12 = this.A4J;
            C162457s7.A0J(r12, 0);
            AnonymousClass3ZH A072 = ((C64773Ex) r22.A05.get()).A07(r12);
            if (A072 != null && r22.A04(A072)) {
                A1l(this.A2P);
            }
        }
        C95814uZ r23 = this.A4J;
        if (r23 != null) {
            if (this.A41.A0X(5869)) {
                this.A4v.A02(r23);
            }
            this.A3q.A00(r23, this.A3n.A0R());
        }
        this.A1Z.A0S(C117615sD.A00(this, 15));
        if (this.A7Q == null) {
            C95814uZ r4 = this.A4J;
            AnonymousClass3LP r33 = this.A42;
            this.A7Q = Boolean.valueOf(C57642ty.A00(this.A2z.getContactManager(), this.A3o, this.A41, r33, r4));
            return;
        }
        return;
        throw th;
    }

    public void A0j() {
        AnonymousClass4VQ r4 = this.A3B;
        C42242Ni A0B2 = r4.A0m.A0B(r4.A0x, r4.A0E(), r4.A0A, r4.A0P, true);
        r4.A0M(A0B2.A01);
        r4.A0N(A0B2.A02);
        r4.A0Q(A0B2);
        AnonymousClass5OX r0 = new AnonymousClass5OX();
        r0.A01 = A0B2;
        AnonymousClass000.A0A().post(new C117155rT(r4, 13, r0.A00()));
    }

    public void A0k() {
        AnonymousClass4QF r0;
        C89894fS r02;
        AnonymousClass0R2 selectionActionMode = this.A2z.getSelectionActionMode();
        if (selectionActionMode != null) {
            selectionActionMode.A05();
        }
        AnonymousClass0R2 r03 = this.A0q;
        if (r03 != null) {
            r03.A05();
        }
        ObjectAnimator objectAnimator = this.A08;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.A08 = null;
        C94264qq r04 = this.A45;
        if (r04 != null) {
            r04.A0F();
        }
        if (C86614Ku.A1Y(this.A41) && (r02 = this.A2a) != null) {
            r02.A0F();
        }
        AnonymousClass5ZT r05 = this.A5q;
        if (r05 != null) {
            r05.A04();
        }
        A1A();
        C48962fl A002 = this.A35.A00();
        C626936e.A06(A002);
        if (A002.A00 == this.A2z) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("conversation/clearsession/jid ");
            C18260x0.A0m(this.A4J, A0o2);
            AnonymousClass0IR.A00(A002, new C48962fl((AnonymousClass4FC) null, this.A2z.getScreenLockStateProvider(), false), this.A35.A00);
        }
        AnonymousClass4VQ r1 = this.A3B;
        if (r1 != null) {
            r1.A0N = A09(this).isChangingConfigurations();
            if (this.A2z.isFinishing()) {
                AnonymousClass4VQ r4 = this.A3B;
                r4.A0o.A03(r4.A0x, A09(this).getLocalClassName());
            }
        }
        boolean A1a2 = C86644Kx.A1a(this.A2i);
        C55702qm r12 = this.A4A;
        if (r12 != null) {
            this.A4B.A07(r12);
        }
        this.A5s.A07(this.A7I);
        this.A5p.A07(this.A7H);
        this.A2r.A07(this.A74);
        this.A5n.A07(this.A77);
        this.A4a.A07(this.A7D);
        this.A1s.A07(this.A71);
        this.A59.A07(this.A7F);
        if (this.A1u != null) {
            ((C61102zi) this.A5y.get()).A07(this.A1u);
        }
        C162157rM r06 = this.A5H;
        if (r06 != null) {
            r06.A0B.A07(r06.A09);
        }
        this.A5G.A07(this.A76);
        this.A4e.A07(this.A75);
        C992054v r07 = this.A5m;
        if (r07 != null) {
            r07.A0D(A1a2);
            this.A5m = null;
        }
        MentionableEntry mentionableEntry = this.A4P;
        if (mentionableEntry != null) {
            mentionableEntry.removeTextChangedListener(this.A6t);
            this.A4P.removeTextChangedListener(this.A6r);
            AnonymousClass52O r13 = this.A5L;
            if (r13 != null) {
                this.A4P.removeTextChangedListener(r13);
            }
            this.A4P.setFilters(new InputFilter[0]);
            this.A4P.A0C();
            this.A4P = null;
        }
        C115975pX r08 = this.A4o;
        if (r08 != null) {
            r08.A00();
        }
        WaEditText waEditText = this.A1m;
        if (waEditText != null) {
            waEditText.removeTextChangedListener(this.A6s);
        }
        BroadcastReceiver broadcastReceiver = this.A09;
        if (broadcastReceiver != null) {
            this.A2z.unregisterReceiver(broadcastReceiver);
            this.A09 = null;
        }
        AnonymousClass676 r09 = this.A2z;
        C107465bM.A08(r09.getMessageAudioPlayerProvider(), r09.getWaSharedPreferences(), this.A4J);
        C107465bM.A02(this.A0F, this.A2z.getMessageAudioPlayerProvider());
        C105365Uq r010 = this.A2U;
        if (r010 != null) {
            r010.A00();
            this.A2U = null;
        }
        if (this.A6J) {
            this.A4X.A00();
            this.A6J = false;
        }
        AnonymousClass66v r14 = this.A5l;
        if (r14 != null && r14.B8N()) {
            r14.Az5();
        }
        if (this.A5j != null) {
            ((ViewGroup) A03(this).getDecorView()).removeView(this.A5j);
            ConversationListView conversationListView = this.A2f;
            C184278rX r42 = this.A2H;
            Set set = conversationListView.A05.A00;
            synchronized (set) {
                set.remove(r42);
            }
            this.A5j = null;
        }
        C152967aS r011 = this.A24;
        if (r011 != null) {
            r011.A00();
        }
        Set set2 = this.A7L;
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            C86664Kz.A0R(it).onActivityDestroyed(A09(this));
        }
        set2.clear();
        this.A7M.clear();
        this.A7K.clear();
        this.A7N.clear();
        this.A2Z = null;
        ((C185738uA) this.A64.get()).Bm7();
        ConversationListView conversationListView2 = this.A2f;
        if (conversationListView2 != null) {
            DataSetObserver dataSetObserver = this.A6o;
            conversationListView2.removeCallbacks(conversationListView2.A0J);
            C87234On conversationCursorAdapter = conversationListView2.getConversationCursorAdapter();
            if (conversationCursorAdapter != null) {
                conversationCursorAdapter.unregisterDataSetObserver(dataSetObserver);
                Cursor cursor = conversationCursorAdapter.getCursor();
                if (cursor != null) {
                    cursor.close();
                }
            }
            conversationListView2.A0B.A00();
        }
        if (this.A3P.A00.A01.BI5(1029386189)) {
            this.A3P.A00.A02((String) null, 4);
        }
        if (C57362tW.A00(this.A42, this.A4J)) {
            C18270x1.A0l(C18270x1.A03(A0D(this)), "wac_consent_shown", A1a2);
        }
        EmojiSearchKeyboardContainer emojiSearchKeyboardContainer = this.A3v;
        if (emojiSearchKeyboardContainer != null) {
            emojiSearchKeyboardContainer.A02();
        }
        ExpressionsBottomSheetView expressionsBottomSheetView = this.A40;
        if (expressionsBottomSheetView != null) {
            expressionsBottomSheetView.A09();
            this.A40 = null;
            this.A0t = null;
        }
        BaseExpressionsBottomSheet baseExpressionsBottomSheet = this.A3y;
        if (baseExpressionsBottomSheet != null) {
            ((ExpressionsKeyboardSearchBottomSheet) baseExpressionsBottomSheet).A0C = null;
            this.A3y = null;
        }
        AnonymousClass5HY r3 = this.A2u;
        AnonymousClass08M r15 = r3.A01;
        if (r15.A07() != null) {
            r3.A00 = null;
            r15.A0H((Object) null);
        }
        if (this.A0U != null) {
            if (A09(this) != null && (A09(this) instanceof Conversation)) {
                View A003 = C005205m.A00(A09(this), R.id.root);
                C05820Vc.A01(A003, (AnonymousClass0QA) null);
                AnonymousClass0YZ.A0E(A003, (C15830s0) null);
            }
            C05820Vc.A01(this.A1a, (AnonymousClass0QA) null);
        }
        this.A4D = null;
        AnonymousClass5PZ r012 = this.A2b;
        if (r012 != null) {
            C117035rH A004 = r012.A00();
            if (A004 instanceof C92234mJ) {
                PinInChatBannerViewModel pinInChatBannerViewModel = ((C92234mJ) A004).A07;
                Runnable runnable = pinInChatBannerViewModel.A00;
                if (runnable != null) {
                    pinInChatBannerViewModel.A02.A0R(runnable);
                }
                pinInChatBannerViewModel.A00 = null;
            }
        }
        if (AnonymousClass5KY.A00(this).BH2(this.A4J)) {
            A0B(this).A05.get();
            Window A032 = A03(this);
            C162457s7.A0J(A032, 0);
            View A0N2 = C86634Kw.A0N(A032);
            if (!(A0N2 == null || (r0 = (AnonymousClass4QF) A0N2.findViewById(R.id.bot_embodiment_view)) == null)) {
                r0.A01();
            }
        }
        if (this.A3D != null && this.A41.A0X(6886)) {
            AnonymousClass4UA r013 = this.A3D;
            r013.A0D();
            r013.A02 = null;
        }
    }

    public void A0l() {
        long j;
        C372821q r4;
        C28011fL r2;
        if (!this.A6G) {
            this.A2z.BZs();
            if (A01(this).hasExtra("start_t")) {
                this.A2z.getTime();
                long uptimeMillis = SystemClock.uptimeMillis() - A01(this).getLongExtra("start_t", 0);
                this.A4m.A00.markerEnd(703934026, 2);
                C95814uZ r5 = this.A4J;
                if (r5 instanceof C28011fL) {
                    A0G(this).BkM(new C70283aF(this, r5, 4, uptimeMillis));
                } else {
                    this.A5Q.A01(r5, 3, 0, 0, uptimeMillis);
                }
                C95814uZ r6 = this.A4J;
                if (r6 instanceof UserJid) {
                    C53592nL r52 = this.A2W;
                    AnonymousClass1VX r22 = r52.A04;
                    if ((r22.A0N(1144) != -1 && !r52.A01.A0Y()) || r22.A0X(1665)) {
                        r52.A06.BkN(new C70203a7(r52, 42, r6), AnonymousClass000.A0P(r6, "LogOutContactChatOpen", AnonymousClass001.A0o()));
                    }
                }
                A01(this).removeExtra("start_t");
                int A0N2 = A0E(this).A0N(1550);
                C54182oJ r7 = this.A5Q;
                long j2 = (long) A0N2;
                if (j2 > 0 && uptimeMillis >= j2) {
                    AnonymousClass1Y1 r1 = new AnonymousClass1Y1();
                    r1.A02 = "chat_open";
                    r1.A00 = Long.valueOf(uptimeMillis);
                    r1.A01 = Long.valueOf(j2);
                    r7.A0D.BhA(r1);
                }
            }
            C50162hj r42 = this.A5O;
            r42.A06.execute(new C71573cK(r42, 42, this.A4J));
            C102905Ks r3 = this.A32;
            boolean z = this.A3n.A0H instanceof AnonymousClass1fS;
            C95814uZ r23 = this.A4J;
            if (r3.A00.A07() && z && (r23 instanceof C28011fL) && (r2 = (C28011fL) r23) != null) {
                C117155rT.A00(r3.A07, r3, r2, 6);
            }
            if (A0Q(this)) {
                AnonymousClass59F A002 = C106855aH.A00(A01(this));
                NewsletterViewModel newsletterViewModel = this.A4T;
                if (newsletterViewModel != null) {
                    j = (long) C104595Rp.A00(newsletterViewModel).A08;
                } else {
                    j = 0;
                }
                AnonymousClass5YD r62 = (AnonymousClass5YD) A0C(this).A09.get();
                C95814uZ r72 = this.A4J;
                AnonymousClass4VF r0 = this.A37;
                AnonymousClass1RL r02 = (AnonymousClass1RL) C56982ss.A00(r0.A0E, r0.A01);
                if (r02 != null) {
                    r4 = r02.A07;
                } else {
                    r4 = null;
                }
                C18260x0.A0O(r72, A002);
                AnonymousClass5YD.A01(AnonymousClass000.A0P(A002, " opened, source: ", C18290x4.A0v(r72)));
                AnonymousClass4s3 r53 = new AnonymousClass4s3();
                r53.A05 = r72.user;
                r53.A00 = Integer.valueOf(C154387d5.A00(A002));
                r53.A01 = C154387d5.A01(A002);
                if (r4 != null) {
                    int ordinal = r4.ordinal();
                    int i = 4;
                    if (ordinal != 0) {
                        i = 2;
                        if (ordinal == 1) {
                            i = 3;
                        } else if (ordinal != 2) {
                            if (ordinal == 3) {
                                i = 1;
                            } else {
                                throw C73153f1.A00();
                            }
                        }
                    }
                    r53.A02 = Integer.valueOf(i);
                }
                r53.A04 = Long.valueOf(j);
                if (A002 == AnonymousClass59F.NEWSLETTER_DIRECTORY || A002 == AnonymousClass59F.NEWSLETTER_DIRECTORY_SEARCH) {
                    r53.A03 = Long.valueOf(r62.A02());
                }
                r62.A03.BhD(r53);
            }
        }
    }

    public void A0n() {
        C95814uZ r1 = this.A4J;
        if (r1 != null && this.A2G.A03.A0P(r1)) {
            if (C18280x3.A1W(C18310x6.A0F(this.A2G.A0I), "userFailedAppSwitchAuth")) {
                A09(this).finish();
            } else if (this.A11.A02) {
                Intent A012 = A01(this);
                int i = 8;
                if (A012 != null) {
                    i = A012.getIntExtra("chatlockEntryPoint", 8);
                }
                AnonymousClass0O1 r2 = this.A0n;
                if (r2 == null) {
                    C106995aW r22 = this.A2G;
                    C15540rX A0D2 = A09(this).getSupportFragmentManager().A0D("com.whatsapp.HomeActivity.ConversationFragment");
                    if (A0D2 == null) {
                        A0D2 = A09(this);
                    }
                    r2 = r22.A04(A0D2, A09(this), i);
                    this.A0n = r2;
                }
                this.A2G.A07(r2, this.A4J, i);
            }
        }
        this.A2z.getStartupTracker().A04(this.A2f, C117615sD.A00(this, 32), "Conversation", 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:164:0x041e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x041f, code lost:
        A2F("on_resume_end");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0422, code lost:
        throw r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x036f A[Catch:{ IllegalStateException -> 0x0168 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0378 A[Catch:{ IllegalStateException -> 0x0168 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0380 A[Catch:{ IllegalStateException -> 0x0168 }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0389 A[Catch:{ IllegalStateException -> 0x0168 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0o() {
        /*
            r25 = this;
            java.lang.String r1 = "on_resume_end"
            r0 = r25
            java.lang.String r2 = "on_resume_start"
            r0.A2F(r2)     // Catch:{ all -> 0x041c }
            r8 = 0
            r0.A6m = r8     // Catch:{ all -> 0x041c }
            java.lang.String r3 = "conversation/resume"
            X.33M r2 = new X.33M     // Catch:{ all -> 0x041c }
            r2.<init>((java.lang.String) r3)     // Catch:{ all -> 0x041c }
            X.2ss r5 = r0.A3d     // Catch:{ all -> 0x041c }
            X.676 r3 = r0.A2z     // Catch:{ all -> 0x041c }
            X.3Ex r4 = r3.getContactManager()     // Catch:{ all -> 0x041c }
            X.4uZ r3 = r0.A4J     // Catch:{ all -> 0x041c }
            int r7 = X.AnonymousClass352.A00(r4, r5, r3)     // Catch:{ all -> 0x041c }
            X.3LQ r3 = r0.A4Y     // Catch:{ all -> 0x041c }
            java.lang.String r4 = "ephemeral"
            r5 = 0
            X.2ml r3 = r3.A00     // Catch:{ all -> 0x041c }
            boolean r3 = r3.A02(r5, r4)     // Catch:{ all -> 0x041c }
            r6 = 1
            r3 = r3 ^ 1
            if (r7 <= 0) goto L_0x0041
            if (r3 == 0) goto L_0x0041
            X.33p r9 = A0D(r0)     // Catch:{ all -> 0x041c }
            X.0df r7 = A04(r0)     // Catch:{ all -> 0x041c }
            X.4uZ r4 = r0.A4J     // Catch:{ all -> 0x041c }
            r3 = 5
            com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog.A00(r7, r9, r5, r4, r3)     // Catch:{ all -> 0x041c }
        L_0x0041:
            X.5TW r3 = r0.A2E     // Catch:{ all -> 0x041c }
            boolean r3 = r3.A01()     // Catch:{ all -> 0x041c }
            if (r3 != 0) goto L_0x0051
            X.5TW r3 = r0.A2E     // Catch:{ all -> 0x041c }
            boolean r3 = r3.A02()     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x0058
        L_0x0051:
            X.5jr r4 = r0.A2D     // Catch:{ all -> 0x041c }
            java.lang.String r3 = "show_voip_activity"
            X.C106645Zu.A00(r4, r3)     // Catch:{ all -> 0x041c }
        L_0x0058:
            X.676 r3 = r0.A2z     // Catch:{ all -> 0x041c }
            r3.Bde()     // Catch:{ all -> 0x041c }
            X.3ZH r3 = r0.A3n     // Catch:{ all -> 0x041c }
            if (r3 != 0) goto L_0x0070
            X.676 r3 = r0.A2z     // Catch:{ all -> 0x041c }
            r3.finish()     // Catch:{ all -> 0x041c }
            r2.A07()     // Catch:{ all -> 0x041c }
            java.lang.String r2 = "conversation/resume/no contact"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x041c }
            goto L_0x0418
        L_0x0070:
            X.1VX r4 = r0.A41     // Catch:{ all -> 0x041c }
            r3 = 5386(0x150a, float:7.547E-42)
            int r7 = r4.A0N(r3)     // Catch:{ all -> 0x041c }
            if (r7 < 0) goto L_0x008b
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x041c }
            long r3 = r0.A06     // Catch:{ all -> 0x041c }
            long r9 = r9 - r3
            long r3 = (long) r7     // Catch:{ all -> 0x041c }
            int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x008b
            X.4VH r3 = r0.A38     // Catch:{ all -> 0x041c }
            r3.A0E(r8)     // Catch:{ all -> 0x041c }
        L_0x008b:
            r0.A19()     // Catch:{ all -> 0x041c }
            X.3Lw r3 = r0.A4W     // Catch:{ all -> 0x041c }
            java.util.HashMap r3 = r3.A0S     // Catch:{ all -> 0x041c }
            r3.clear()     // Catch:{ all -> 0x041c }
            X.3Lo r4 = r0.A3e     // Catch:{ all -> 0x041c }
            X.3ZH r3 = r0.A3n     // Catch:{ all -> 0x041c }
            java.lang.Class<X.4uZ> r7 = X.C95814uZ.class
            com.whatsapp.jid.Jid r3 = r3.A0I(r7)     // Catch:{ all -> 0x041c }
            X.4uZ r3 = (X.C95814uZ) r3     // Catch:{ all -> 0x041c }
            X.3ZH r3 = r4.A01(r3)     // Catch:{ all -> 0x041c }
            r0.A3n = r3     // Catch:{ all -> 0x041c }
            X.676 r3 = r0.A2z     // Catch:{ all -> 0x041c }
            boolean r3 = r3.hasWindowFocus()     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x00bc
            X.2oD r4 = r0.A2j     // Catch:{ all -> 0x041c }
            X.3ZH r3 = r0.A3n     // Catch:{ all -> 0x041c }
            com.whatsapp.jid.Jid r3 = r3.A0I(r7)     // Catch:{ all -> 0x041c }
            X.4uZ r3 = (X.C95814uZ) r3     // Catch:{ all -> 0x041c }
            r4.A00(r3, r6, r6, r6)     // Catch:{ all -> 0x041c }
        L_0x00bc:
            X.4VF r3 = r0.A37     // Catch:{ all -> 0x041c }
            r3.A0D()     // Catch:{ all -> 0x041c }
            X.3ZH r3 = r0.A3n     // Catch:{ all -> 0x041c }
            boolean r3 = r3.A0U()     // Catch:{ all -> 0x041c }
            if (r3 != 0) goto L_0x00df
            X.3ZH r9 = r0.A3n     // Catch:{ all -> 0x041c }
            X.4uZ r3 = r9.A0H     // Catch:{ all -> 0x041c }
            boolean r3 = r3 instanceof X.C95804uY     // Catch:{ all -> 0x041c }
            if (r3 != 0) goto L_0x00df
            X.3S3 r4 = r0.A4s     // Catch:{ all -> 0x041c }
            com.whatsapp.jid.Jid r3 = r9.A0I(r7)     // Catch:{ all -> 0x041c }
            X.4uZ r3 = (X.C95814uZ) r3     // Catch:{ all -> 0x041c }
            X.C626936e.A06(r3)     // Catch:{ all -> 0x041c }
            r4.A06(r3)     // Catch:{ all -> 0x041c }
        L_0x00df:
            X.4uZ r3 = r0.A4J     // Catch:{ all -> 0x041c }
            boolean r3 = r3 instanceof X.C95804uY     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x00f8
            X.5LO r3 = A0C(r0)     // Catch:{ all -> 0x041c }
            X.8qC r3 = r3.A0A     // Catch:{ all -> 0x041c }
            java.lang.Object r4 = r3.get()     // Catch:{ all -> 0x041c }
            X.2se r4 = (X.C56842se) r4     // Catch:{ all -> 0x041c }
            X.4uZ r3 = r0.A4J     // Catch:{ all -> 0x041c }
            X.4uY r3 = (X.C95804uY) r3     // Catch:{ all -> 0x041c }
            r4.A06(r3)     // Catch:{ all -> 0x041c }
        L_0x00f8:
            X.5RI r4 = r0.A31     // Catch:{ all -> 0x041c }
            X.4PV r3 = r4.A02     // Catch:{ all -> 0x041c }
            if (r3 != 0) goto L_0x0108
            X.8u6 r3 = r4.A04     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x010b
            boolean r3 = r3.isVisible()     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x010b
        L_0x0108:
            r0.A1K()     // Catch:{ all -> 0x041c }
        L_0x010b:
            boolean r3 = X.AnonymousClass2C1.A00     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x013e
            boolean r3 = r0.A6Y     // Catch:{ all -> 0x041c }
            if (r3 != 0) goto L_0x013e
            boolean r3 = r0.A6k     // Catch:{ all -> 0x041c }
            if (r3 != 0) goto L_0x013e
            android.content.Intent r4 = A01(r0)     // Catch:{ all -> 0x041c }
            java.lang.String r3 = "fromNotification"
            boolean r3 = r4.getBooleanExtra(r3, r8)     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x015c
            X.33b r4 = r0.A4U     // Catch:{ all -> 0x041c }
            X.4uZ r3 = r0.A4J     // Catch:{ all -> 0x041c }
            r4.A08(r3)     // Catch:{ all -> 0x041c }
            r0.A6e = r6     // Catch:{ all -> 0x041c }
            X.5mB r4 = r0.A2m     // Catch:{ all -> 0x041c }
            X.4uZ r3 = r0.A4J     // Catch:{ all -> 0x041c }
            r4.A06(r3, r6)     // Catch:{ all -> 0x041c }
        L_0x0133:
            X.33p r3 = r0.A3K     // Catch:{ all -> 0x041c }
            android.content.SharedPreferences$Editor r4 = X.C18270x1.A03(r3)     // Catch:{ all -> 0x041c }
            java.lang.String r3 = "newsletter_message_received"
            X.C18270x1.A0l(r4, r3, r8)     // Catch:{ all -> 0x041c }
        L_0x013e:
            X.AnonymousClass2C1.A00 = r8     // Catch:{ all -> 0x041c }
            java.util.ArrayList r4 = X.AnonymousClass2C1.A01     // Catch:{ all -> 0x041c }
            X.3ZH r3 = r0.A3n     // Catch:{ all -> 0x041c }
            com.whatsapp.jid.Jid r3 = r3.A0I(r7)     // Catch:{ all -> 0x041c }
            boolean r3 = r4.remove(r3)     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x0162
            java.lang.String r3 = "conversation/dialog_ask_gps"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x041c }
            X.4eZ r4 = A09(r0)     // Catch:{ all -> 0x041c }
            r3 = 2
            X.C621433s.A01(r4, r3)     // Catch:{ all -> 0x041c }
            goto L_0x0162
        L_0x015c:
            X.33b r3 = r0.A4U     // Catch:{ all -> 0x041c }
            r3.A0D(r6)     // Catch:{ all -> 0x041c }
            goto L_0x0133
        L_0x0162:
            X.2yL r3 = r0.A5S     // Catch:{ IllegalStateException -> 0x0168 }
            r3.A00()     // Catch:{ IllegalStateException -> 0x0168 }
            goto L_0x016e
        L_0x0168:
            r4 = move-exception
            java.lang.String r3 = "conversation/ap/stateerror"
            com.whatsapp.util.Log.e(r3, r4)     // Catch:{ all -> 0x041c }
        L_0x016e:
            boolean r3 = r0.A6Y     // Catch:{ all -> 0x041c }
            if (r3 != 0) goto L_0x018f
            boolean r3 = X.AnonymousClass320.A00     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x018f
            com.whatsapp.conversation.ConversationListView r9 = r0.A2f     // Catch:{ all -> 0x041c }
            r7 = 0
        L_0x0179:
            int r3 = r9.getChildCount()     // Catch:{ all -> 0x041c }
            if (r7 >= r3) goto L_0x018f
            android.view.View r4 = r9.getChildAt(r7)     // Catch:{ all -> 0x041c }
            boolean r3 = r4 instanceof X.C183138pY     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x018c
            X.8pY r4 = (X.C183138pY) r4     // Catch:{ all -> 0x041c }
            r4.BpZ()     // Catch:{ all -> 0x041c }
        L_0x018c:
            int r7 = r7 + 1
            goto L_0x0179
        L_0x018f:
            boolean r3 = r0.A6Y     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x01b0
            r0.A6Y = r8     // Catch:{ all -> 0x041c }
        L_0x0195:
            X.5Z4 r3 = r0.A1g     // Catch:{ all -> 0x041c }
            int r3 = r3.A01()     // Catch:{ all -> 0x041c }
            if (r3 <= 0) goto L_0x01ab
            java.lang.String r3 = "conversation/dialog_software_expire_warning"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x041c }
            X.4eZ r4 = A09(r0)     // Catch:{ all -> 0x041c }
            r3 = 115(0x73, float:1.61E-43)
            X.C621433s.A01(r4, r3)     // Catch:{ all -> 0x041c }
        L_0x01ab:
            X.1ht r3 = r0.A53     // Catch:{ all -> 0x041c }
            boolean r3 = r3.A00     // Catch:{ all -> 0x041c }
            goto L_0x01c6
        L_0x01b0:
            boolean r3 = r0.A6k     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x0195
            java.lang.String r3 = "conversation/resume/refreshstatusdelayed"
            com.whatsapp.util.Log.d((java.lang.String) r3)     // Catch:{ all -> 0x041c }
            X.4MN r7 = new X.4MN     // Catch:{ all -> 0x041c }
            r7.<init>(r0)     // Catch:{ all -> 0x041c }
            r0.A0A = r7     // Catch:{ all -> 0x041c }
            r3 = 3000(0xbb8, double:1.482E-320)
            r7.sendEmptyMessageDelayed(r8, r3)     // Catch:{ all -> 0x041c }
            goto L_0x0195
        L_0x01c6:
            if (r3 == 0) goto L_0x01e2
            java.lang.String r3 = "conversation/dialog_login_failed"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x041c }
            X.33T r7 = r0.A3J     // Catch:{ all -> 0x041c }
            java.lang.String r4 = "ConvPreReg"
            r3 = 20
            r7.A05(r3, r4)     // Catch:{ all -> 0x041c }
            X.4eZ r7 = A09(r0)     // Catch:{ all -> 0x041c }
            X.1VX r4 = r0.A41     // Catch:{ all -> 0x041c }
            X.30z r3 = r0.A1o     // Catch:{ all -> 0x041c }
            X.C621533t.A01(r7, r3, r4)     // Catch:{ all -> 0x041c }
            goto L_0x0214
        L_0x01e2:
            X.2dr r3 = r0.A1n     // Catch:{ all -> 0x041c }
            X.2fb r3 = r3.A00()     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x022e
            X.1VX r4 = r0.A41     // Catch:{ all -> 0x041c }
            r3 = 2466(0x9a2, float:3.456E-42)
            boolean r3 = r4.A0X(r3)     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x022e
            java.lang.String r3 = "home/show-account-logout-request"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x041c }
            X.2dr r3 = r0.A1n     // Catch:{ all -> 0x041c }
            X.2fb r8 = r3.A00()     // Catch:{ all -> 0x041c }
            X.2dr r3 = r0.A1n     // Catch:{ all -> 0x041c }
            r3.A01(r5)     // Catch:{ all -> 0x041c }
            X.33T r7 = r0.A3J     // Catch:{ all -> 0x041c }
            java.lang.String r4 = "HomeActivityShowingDialog"
            r3 = 52
            r7.A05(r3, r4)     // Catch:{ all -> 0x041c }
            X.4eZ r3 = A09(r0)     // Catch:{ all -> 0x041c }
            X.C621533t.A00(r3, r8)     // Catch:{ all -> 0x041c }
        L_0x0214:
            X.5rC r4 = r0.A0w     // Catch:{ all -> 0x041c }
            boolean r3 = r4.A07()     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x0251
            X.5rC r3 = r0.A0x     // Catch:{ all -> 0x041c }
            boolean r3 = r3.A07()     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x0251
            r4.A04()     // Catch:{ all -> 0x041c }
            java.lang.String r2 = "getHasReceivedCertRelatedNack"
            java.lang.NullPointerException r2 = X.AnonymousClass001.A0g(r2)     // Catch:{ all -> 0x041c }
            throw r2     // Catch:{ all -> 0x041c }
        L_0x022e:
            X.2sH r4 = r0.A3I     // Catch:{ all -> 0x041c }
            X.33p r3 = r0.A3K     // Catch:{ all -> 0x041c }
            boolean r3 = X.C386228k.A00(r4, r3)     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x0214
            X.676 r7 = r0.A2z     // Catch:{ all -> 0x041c }
            X.33p r3 = r0.A3K     // Catch:{ all -> 0x041c }
            android.content.SharedPreferences r4 = X.AnonymousClass0x2.A0F(r3)     // Catch:{ all -> 0x041c }
            java.lang.String r3 = "device_switching_code"
            java.lang.String r3 = r4.getString(r3, r5)     // Catch:{ all -> 0x041c }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x041c }
            com.whatsapp.registration.VerificationCodeBottomSheet r3 = com.whatsapp.registration.VerificationCodeBottomSheet.A00(r3)     // Catch:{ all -> 0x041c }
            r7.Boo(r3)     // Catch:{ all -> 0x041c }
            goto L_0x0214
        L_0x0251:
            X.1VX r4 = r0.A41     // Catch:{ all -> 0x041c }
            r3 = 3181(0xc6d, float:4.458E-42)
            boolean r3 = r4.A0X(r3)     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x0293
            boolean r3 = r0.A6V     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x0293
            X.2ss r4 = r0.A3d     // Catch:{ all -> 0x041c }
            X.3ZH r3 = r0.A3n     // Catch:{ all -> 0x041c }
            X.4uZ r3 = r3.A0H     // Catch:{ all -> 0x041c }
            X.31A r9 = X.C56982ss.A00(r4, r3)     // Catch:{ all -> 0x041c }
            if (r9 == 0) goto L_0x0293
            X.33p r4 = A0D(r0)     // Catch:{ all -> 0x041c }
            X.4uZ r3 = r9.A05()     // Catch:{ all -> 0x041c }
            long r10 = r4.A0O(r3)     // Catch:{ all -> 0x041c }
            r7 = 0
            int r3 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x0293
            long r7 = X.C18280x3.A07()     // Catch:{ all -> 0x041c }
            int r3 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x0293
            X.3Wi r7 = A07(r0)     // Catch:{ all -> 0x041c }
            r4 = 48
            X.3bw r3 = new X.3bw     // Catch:{ all -> 0x041c }
            r3.<init>(r0, r4, r9)     // Catch:{ all -> 0x041c }
            r7.A0S(r3)     // Catch:{ all -> 0x041c }
        L_0x0293:
            X.676 r3 = r0.A2z     // Catch:{ all -> 0x041c }
            X.5mA r3 = r3.getMessageAudioPlayerProvider()     // Catch:{ all -> 0x041c }
            boolean r3 = r3.A0B()     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x02a8
            X.676 r3 = r0.A2z     // Catch:{ all -> 0x041c }
            X.5mA r3 = r3.getMessageAudioPlayerProvider()     // Catch:{ all -> 0x041c }
            r3.A05()     // Catch:{ all -> 0x041c }
        L_0x02a8:
            boolean r3 = r0.A6O     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x02b3
            X.34x r3 = r0.A4w     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x02b3
            r0.A21(r3)     // Catch:{ all -> 0x041c }
        L_0x02b3:
            r0.A0r()     // Catch:{ all -> 0x041c }
            java.util.Set r3 = r0.A7L     // Catch:{ all -> 0x041c }
            java.util.Iterator r7 = r3.iterator()     // Catch:{ all -> 0x041c }
        L_0x02bc:
            boolean r3 = r7.hasNext()     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x02ce
            android.app.Application$ActivityLifecycleCallbacks r4 = X.C86664Kz.A0R(r7)     // Catch:{ all -> 0x041c }
            X.4eZ r3 = A09(r0)     // Catch:{ all -> 0x041c }
            r4.onActivityResumed(r3)     // Catch:{ all -> 0x041c }
            goto L_0x02bc
        L_0x02ce:
            X.5Tq r4 = r0.A4n     // Catch:{ all -> 0x041c }
            X.4eZ r3 = A09(r0)     // Catch:{ all -> 0x041c }
            r4.A02(r3)     // Catch:{ all -> 0x041c }
            X.8qC r3 = r0.A62     // Catch:{ all -> 0x041c }
            X.5Xj r3 = X.C86664Kz.A1G(r3)     // Catch:{ all -> 0x041c }
            X.1mu r4 = r3.A00     // Catch:{ all -> 0x041c }
            if (r4 == 0) goto L_0x02f8
            r0.A4w = r4     // Catch:{ all -> 0x041c }
            r0.A6O = r6     // Catch:{ all -> 0x041c }
            X.4On r3 = A0A(r0)     // Catch:{ all -> 0x041c }
            X.2z0 r4 = r4.A1J     // Catch:{ all -> 0x041c }
            java.util.Set r3 = r3.A0b     // Catch:{ all -> 0x041c }
            r3.add(r4)     // Catch:{ all -> 0x041c }
            X.8qC r3 = r0.A62     // Catch:{ all -> 0x041c }
            X.5Xj r3 = X.C86664Kz.A1G(r3)     // Catch:{ all -> 0x041c }
            r3.A00 = r5     // Catch:{ all -> 0x041c }
        L_0x02f8:
            X.676 r3 = r0.A2z     // Catch:{ all -> 0x041c }
            X.5mA r3 = r3.getMessageAudioPlayerProvider()     // Catch:{ all -> 0x041c }
            X.5pj r5 = r3.A00()     // Catch:{ all -> 0x041c }
            X.676 r3 = r0.A2z     // Catch:{ all -> 0x041c }
            X.5mA r3 = r3.getMessageAudioPlayerProvider()     // Catch:{ all -> 0x041c }
            X.1mu r4 = r3.A01()     // Catch:{ all -> 0x041c }
            X.8qC r3 = r0.A62     // Catch:{ all -> 0x041c }
            X.5Xj r3 = X.C86664Kz.A1G(r3)     // Catch:{ all -> 0x041c }
            boolean r3 = r3.A02     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x0323
            if (r5 == 0) goto L_0x0323
            if (r4 == 0) goto L_0x0323
            r0.A6J = r6     // Catch:{ all -> 0x041c }
            X.69Z r3 = new X.69Z     // Catch:{ all -> 0x041c }
            r3.<init>(r0, r5, r4, r6)     // Catch:{ all -> 0x041c }
            r5.A0I = r3     // Catch:{ all -> 0x041c }
        L_0x0323:
            X.8qC r3 = r0.A62     // Catch:{ all -> 0x041c }
            X.5Xj r3 = X.C86664Kz.A1G(r3)     // Catch:{ all -> 0x041c }
            boolean r3 = r3.A04     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x034b
            X.8qC r3 = r0.A62     // Catch:{ all -> 0x041c }
            X.5Xj r3 = X.C86664Kz.A1G(r3)     // Catch:{ all -> 0x041c }
            X.4uZ r4 = r0.A4J     // Catch:{ all -> 0x041c }
            X.5mA r3 = r3.A07     // Catch:{ all -> 0x041c }
            X.1mu r3 = r3.A01()     // Catch:{ all -> 0x041c }
            if (r4 == 0) goto L_0x03a6
            if (r3 == 0) goto L_0x03a6
            X.2z0 r3 = r3.A1J     // Catch:{ all -> 0x041c }
            X.4uZ r3 = r3.A00     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x03a6
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x03a6
        L_0x034b:
            X.676 r3 = r0.A2z     // Catch:{ all -> 0x041c }
            android.view.View r3 = r3.getContentView()     // Catch:{ all -> 0x041c }
            boolean r3 = X.C106035Xj.A01(r3)     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x0391
            X.676 r3 = r0.A2z     // Catch:{ all -> 0x041c }
            X.5mA r5 = r3.getMessageAudioPlayerProvider()     // Catch:{ all -> 0x041c }
            X.8qC r4 = r0.A62     // Catch:{ all -> 0x041c }
            android.view.View r3 = r3.getContentView()     // Catch:{ all -> 0x041c }
            X.C107465bM.A04(r3, r5, r4)     // Catch:{ all -> 0x041c }
        L_0x0366:
            X.8qC r3 = r0.A62     // Catch:{ all -> 0x041c }
            X.C106035Xj.A00(r3)     // Catch:{ all -> 0x041c }
            X.5a4 r3 = r0.A51     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x0372
            r3.A07()     // Catch:{ all -> 0x041c }
        L_0x0372:
            com.whatsapp.conversation.ConversationListView r4 = r0.A2f     // Catch:{ all -> 0x041c }
            boolean r3 = r4.A0O     // Catch:{ all -> 0x041c }
            if (r3 != 0) goto L_0x037c
            r3 = 0
            r4.setTranscriptMode(r3)     // Catch:{ all -> 0x041c }
        L_0x037c:
            X.4Tl r3 = r0.A1q     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x0385
            X.5Qn r3 = r3.A00     // Catch:{ all -> 0x041c }
            r3.A00()     // Catch:{ all -> 0x041c }
        L_0x0385:
            X.4Ty r3 = r0.A1w     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x038c
            r3.A0E()     // Catch:{ all -> 0x041c }
        L_0x038c:
            r2.A07()     // Catch:{ all -> 0x041c }
            goto L_0x0418
        L_0x0391:
            X.8qC r3 = r0.A62     // Catch:{ all -> 0x041c }
            X.5Xj r5 = X.C86664Kz.A1G(r3)     // Catch:{ all -> 0x041c }
            boolean r3 = r5.A01     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x0366
            X.1iO r4 = r5.A06     // Catch:{ all -> 0x041c }
            X.8Dw r3 = r5.A08     // Catch:{ all -> 0x041c }
            r4.A07(r3)     // Catch:{ all -> 0x041c }
            r3 = 0
            r5.A01 = r3     // Catch:{ all -> 0x041c }
            goto L_0x0366
        L_0x03a6:
            X.8qC r3 = r0.A62     // Catch:{ all -> 0x041c }
            X.5Xj r3 = X.C86664Kz.A1G(r3)     // Catch:{ all -> 0x041c }
            X.4uZ r4 = r0.A4J     // Catch:{ all -> 0x041c }
            X.5mA r3 = r3.A07     // Catch:{ all -> 0x041c }
            X.1mu r3 = r3.A01()     // Catch:{ all -> 0x041c }
            if (r4 == 0) goto L_0x034b
            if (r3 == 0) goto L_0x034b
            X.2z0 r3 = r3.A1J     // Catch:{ all -> 0x041c }
            X.4uZ r3 = r3.A00     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x034b
            X.676 r3 = r0.A2z     // Catch:{ all -> 0x041c }
            android.view.View r8 = r3.getContentView()     // Catch:{ all -> 0x041c }
            X.1VX r20 = A0E(r0)     // Catch:{ all -> 0x041c }
            X.4eZ r7 = A09(r0)     // Catch:{ all -> 0x041c }
            X.3Wi r10 = A07(r0)     // Catch:{ all -> 0x041c }
            X.676 r3 = r0.A2z     // Catch:{ all -> 0x041c }
            X.2sr r11 = r3.getMeManager()     // Catch:{ all -> 0x041c }
            X.4FS r21 = A0G(r0)     // Catch:{ all -> 0x041c }
            X.676 r3 = r0.A2z     // Catch:{ all -> 0x041c }
            X.5mM r15 = r3.getContactPhotos()     // Catch:{ all -> 0x041c }
            X.3Ex r12 = r3.getContactManager()     // Catch:{ all -> 0x041c }
            X.5ZU r13 = r3.getWAContactNames()     // Catch:{ all -> 0x041c }
            X.33j r6 = r0.A3L     // Catch:{ all -> 0x041c }
            X.5RC r16 = r3.getMessageAudioPlayerFactory()     // Catch:{ all -> 0x041c }
            X.5mA r17 = r3.getMessageAudioPlayerProvider()     // Catch:{ all -> 0x041c }
            X.8qC r5 = r0.A62     // Catch:{ all -> 0x041c }
            X.8qC r4 = r0.A67     // Catch:{ all -> 0x041c }
            android.view.View r9 = r0.A0F     // Catch:{ all -> 0x041c }
            X.5Uq r14 = r0.A2U     // Catch:{ all -> 0x041c }
            X.33p r18 = r3.getWaSharedPreferences()     // Catch:{ all -> 0x041c }
            java.lang.String r24 = "conversation-activity"
            r19 = r6
            r22 = r5
            r23 = r4
            android.util.Pair r4 = X.C107465bM.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x041c }
            java.lang.Object r3 = r4.first     // Catch:{ all -> 0x041c }
            android.view.View r3 = (android.view.View) r3     // Catch:{ all -> 0x041c }
            r0.A0F = r3     // Catch:{ all -> 0x041c }
            java.lang.Object r3 = r4.second     // Catch:{ all -> 0x041c }
            X.5Uq r3 = (X.C105365Uq) r3     // Catch:{ all -> 0x041c }
            r0.A2U = r3     // Catch:{ all -> 0x041c }
            goto L_0x0366
        L_0x0418:
            r0.A2F(r1)
            return
        L_0x041c:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x041e }
        L_0x041e:
            r2 = move-exception
            r0.A2F(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113245l7.A0o():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: X.2z0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: X.1mj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v149, resolved type: X.1mj} */
    /* JADX WARNING: type inference failed for: r19v3 */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0340  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0371  */
    public void A0p() {
        /*
            r45 = this;
            java.lang.String r27 = "on_start_end"
            r5 = r45
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04bd }
            java.lang.String r0 = "conversation/start "
            r1.append(r0)     // Catch:{ all -> 0x04bd }
            X.4uZ r0 = r5.A4J     // Catch:{ all -> 0x04bd }
            X.C18260x0.A0m(r0, r1)     // Catch:{ all -> 0x04bd }
            java.lang.String r0 = "on_start_start"
            r5.A2F(r0)     // Catch:{ all -> 0x04bd }
            java.lang.String r1 = "conversation/start"
            X.33M r0 = new X.33M     // Catch:{ all -> 0x04bd }
            r0.<init>((java.lang.String) r1)     // Catch:{ all -> 0x04bd }
            r5.A5Y = r0     // Catch:{ all -> 0x04bd }
            X.4FD r0 = r5.A3b     // Catch:{ all -> 0x04bd }
            if (r0 != 0) goto L_0x0036
            X.4uZ r0 = r5.A4J     // Catch:{ all -> 0x04bd }
            boolean r0 = r0 instanceof X.C95804uY     // Catch:{ all -> 0x04bd }
            if (r0 != 0) goto L_0x005f
            X.66o r1 = X.AnonymousClass5KY.A00(r5)     // Catch:{ all -> 0x04bd }
            X.4uZ r0 = r5.A4J     // Catch:{ all -> 0x04bd }
            boolean r0 = r1.BH2(r0)     // Catch:{ all -> 0x04bd }
            if (r0 != 0) goto L_0x005f
        L_0x0036:
            X.1iS r1 = r5.A1x     // Catch:{ all -> 0x04bd }
            X.676 r0 = r5.A2z     // Catch:{ all -> 0x04bd }
            r1.A06(r0)     // Catch:{ all -> 0x04bd }
            X.676 r0 = r5.A2z     // Catch:{ all -> 0x04bd }
            r0.Bdf()     // Catch:{ all -> 0x04bd }
            X.676 r0 = r5.A2z     // Catch:{ all -> 0x04bd }
            boolean r0 = r0.isFinishing()     // Catch:{ all -> 0x04bd }
            if (r0 != 0) goto L_0x04b7
            X.4uZ r0 = r5.A4J     // Catch:{ all -> 0x04bd }
            if (r0 != 0) goto L_0x006d
            X.676 r0 = r5.A2z     // Catch:{ all -> 0x04bd }
            r0.finish()     // Catch:{ all -> 0x04bd }
            X.33M r0 = r5.A5Y     // Catch:{ all -> 0x04bd }
            r0.A07()     // Catch:{ all -> 0x04bd }
            java.lang.String r0 = "conversation/start/no jid"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x04bd }
            goto L_0x04b7
        L_0x005f:
            r0 = 1
            X.6Bw r1 = new X.6Bw     // Catch:{ all -> 0x04bd }
            r1.<init>(r5, r0)     // Catch:{ all -> 0x04bd }
            r5.A3b = r1     // Catch:{ all -> 0x04bd }
            X.1hu r0 = r5.A3a     // Catch:{ all -> 0x04bd }
            r0.A06(r1)     // Catch:{ all -> 0x04bd }
            goto L_0x0036
        L_0x006d:
            X.5ST r3 = r5.A2d     // Catch:{ all -> 0x04bd }
            X.33p r0 = A0D(r5)     // Catch:{ all -> 0x04bd }
            android.content.SharedPreferences r2 = X.AnonymousClass0x2.A0F(r0)     // Catch:{ all -> 0x04bd }
            java.lang.String r1 = "interface_font_size"
            java.lang.String r0 = "0"
            java.lang.String r0 = r2.getString(r1, r0)     // Catch:{ all -> 0x04bd }
            r2 = 0
            int r0 = X.C615531h.A01(r0, r2)     // Catch:{ all -> 0x04bd }
            r3.A02 = r0     // Catch:{ all -> 0x04bd }
            r5.A19()     // Catch:{ all -> 0x04bd }
            X.676 r0 = r5.A2z     // Catch:{ all -> 0x04bd }
            r0.BNY()     // Catch:{ all -> 0x04bd }
            X.5RI r0 = r5.A31     // Catch:{ all -> 0x04bd }
            android.view.View r1 = r0.A00     // Catch:{ all -> 0x04bd }
            r0 = 8
            r1.setVisibility(r0)     // Catch:{ all -> 0x04bd }
            android.content.Intent r1 = A01(r5)     // Catch:{ all -> 0x04b3 }
            java.lang.String r0 = "open_comment_thread"
            boolean r28 = r1.getBooleanExtra(r0, r2)     // Catch:{ all -> 0x04b3 }
            android.content.Intent r0 = A01(r5)     // Catch:{ all -> 0x04b3 }
            java.lang.String r11 = "row_id"
            r6 = 0
            long r16 = r0.getLongExtra(r11, r6)     // Catch:{ all -> 0x04b3 }
            X.4VQ r4 = r5.A3B     // Catch:{ all -> 0x04b3 }
            X.5OW r12 = r5.A33     // Catch:{ all -> 0x04b3 }
            X.2ss r0 = r4.A0l     // Catch:{ all -> 0x04b3 }
            r37 = r0
            X.4uZ r3 = r4.A0x     // Catch:{ all -> 0x04b3 }
            X.2Pr r1 = r0.A0B(r3)     // Catch:{ all -> 0x04b3 }
            int r8 = r1.A00     // Catch:{ all -> 0x04b3 }
            r4.A05 = r8     // Catch:{ all -> 0x04b3 }
            int r2 = r1.A01     // Catch:{ all -> 0x04b3 }
            r4.A06 = r2     // Catch:{ all -> 0x04b3 }
            if (r8 > 0) goto L_0x00c9
            if (r2 > 0) goto L_0x00c9
            r9 = 0
            goto L_0x00d2
        L_0x00c9:
            int r9 = r1.A02     // Catch:{ all -> 0x04b3 }
            r4.A07 = r9     // Catch:{ all -> 0x04b3 }
            boolean r0 = r3 instanceof X.C95804uY     // Catch:{ all -> 0x04b3 }
            if (r0 == 0) goto L_0x00d4
            r9 = r8
        L_0x00d2:
            r4.A07 = r9     // Catch:{ all -> 0x04b3 }
        L_0x00d4:
            long r0 = r1.A03     // Catch:{ all -> 0x04b3 }
            r4.A09 = r0     // Catch:{ all -> 0x04b3 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04b3 }
            java.lang.String r0 = "messagesViewModel/start/unseen "
            r1.append(r0)     // Catch:{ all -> 0x04b3 }
            r1.append(r9)     // Catch:{ all -> 0x04b3 }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ all -> 0x04b3 }
            r1.append(r8)     // Catch:{ all -> 0x04b3 }
            X.C18260x0.A0y(r0, r1, r2)     // Catch:{ all -> 0x04b3 }
            r4.A0J()     // Catch:{ all -> 0x04b3 }
            int r0 = r4.A07     // Catch:{ all -> 0x04b3 }
            boolean r42 = X.AnonymousClass001.A1W(r0)
            X.5OX r26 = new X.5OX     // Catch:{ all -> 0x04b3 }
            r26.<init>()     // Catch:{ all -> 0x04b3 }
            X.4UC r0 = r4.A14     // Catch:{ all -> 0x04b3 }
            r44 = r0
            java.lang.Object r2 = r44.A07()     // Catch:{ all -> 0x04b3 }
            X.5Qd r2 = (X.C104225Qd) r2     // Catch:{ all -> 0x04b3 }
            if (r2 == 0) goto L_0x0119
            boolean r1 = r2.A05     // Catch:{ all -> 0x04b3 }
            if (r1 == 0) goto L_0x0111
            r0 = r26
            r0.A05 = r1     // Catch:{ all -> 0x04b3 }
        L_0x0111:
            java.util.Collection r1 = r2.A04     // Catch:{ all -> 0x04b3 }
            if (r1 == 0) goto L_0x0119
            r0 = r26
            r0.A04 = r1     // Catch:{ all -> 0x04b3 }
        L_0x0119:
            android.content.Intent r2 = r4.A0Q     // Catch:{ all -> 0x04b3 }
            long r24 = r2.getLongExtra(r11, r6)     // Catch:{ all -> 0x04b3 }
            java.lang.String r15 = "sort_id"
            r8 = -9223372036854775808
            long r22 = r2.getLongExtra(r15, r8)     // Catch:{ all -> 0x04b3 }
            java.lang.String r13 = "carousel_card_idx"
            int r10 = X.C86664Kz.A07(r2, r13)     // Catch:{ all -> 0x04b3 }
            int r18 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r18 <= 0) goto L_0x015f
            java.lang.String r0 = "conversation-qpl-annotations/logIsStarred"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x04b3 }
            X.5ND r0 = r12.A05     // Catch:{ all -> 0x04b3 }
            r19 = r0
            X.5od r14 = new X.5od     // Catch:{ all -> 0x04b3 }
            r0 = r24
            r14.<init>(r12, r0)     // Catch:{ all -> 0x04b3 }
            r0 = r19
            X.316 r0 = r0.A01     // Catch:{ all -> 0x04b3 }
            X.8JP r1 = r0.A0C     // Catch:{ all -> 0x04b3 }
            X.2ck r0 = r0.A0A     // Catch:{ all -> 0x04b3 }
            int r0 = r0.A07     // Catch:{ all -> 0x04b3 }
            r1.BKd(r14, r0)     // Catch:{ all -> 0x04b3 }
        L_0x014e:
            int r14 = r4.A0E()     // Catch:{ all -> 0x04b3 }
            X.2Ni r0 = r4.A0C     // Catch:{ all -> 0x04b3 }
            r12 = 1
            if (r0 == 0) goto L_0x016f
            r12 = 0
            boolean r0 = r4.A0N     // Catch:{ all -> 0x04b3 }
            r41 = 0
            if (r0 == 0) goto L_0x0171
            goto L_0x016f
        L_0x015f:
            java.lang.String r0 = "conversation-qpl-annotations/is_starred"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x04b3 }
            X.5ND r0 = r12.A05     // Catch:{ all -> 0x04b3 }
            java.lang.String r12 = "is_starred"
            r1 = 0
            X.316 r0 = r0.A01     // Catch:{ all -> 0x04b3 }
            r0.A0D(r12, r1, r1)     // Catch:{ all -> 0x04b3 }
            goto L_0x014e
        L_0x016f:
            r41 = 1
        L_0x0171:
            r21 = 0
            if (r18 <= 0) goto L_0x022d
            r2.putExtra(r11, r6)     // Catch:{ all -> 0x04b3 }
            r2.putExtra(r15, r8)     // Catch:{ all -> 0x04b3 }
            r0 = -1
            r2.putExtra(r13, r0)     // Catch:{ all -> 0x04b3 }
            X.2z0 r1 = X.C107395bF.A02(r2)     // Catch:{ all -> 0x04b3 }
            if (r10 < 0) goto L_0x01b7
            X.5MU r20 = new X.5MU     // Catch:{ all -> 0x04b3 }
            r20.<init>()     // Catch:{ all -> 0x04b3 }
            r0 = 0
            X.C162457s7.A0J(r1, r0)     // Catch:{ all -> 0x04b3 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04b3 }
            r0 = r20
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00     // Catch:{ all -> 0x04b3 }
            r0.put(r1, r11)     // Catch:{ all -> 0x04b3 }
            X.1mj r19 = new X.1mj     // Catch:{ all -> 0x04b3 }
            r0 = r19
            r0.<init>(r1, r10)     // Catch:{ all -> 0x04b3 }
        L_0x01a0:
            java.lang.String r0 = "query"
            java.lang.String r1 = r2.getStringExtra(r0)     // Catch:{ all -> 0x04b3 }
            r4.A0I = r1     // Catch:{ all -> 0x04b3 }
            X.33j r0 = r4.A0j     // Catch:{ all -> 0x04b3 }
            java.util.ArrayList r0 = X.C107155an.A03(r0, r1)     // Catch:{ all -> 0x04b3 }
            r4.A0K = r0     // Catch:{ all -> 0x04b3 }
            java.lang.String r0 = r4.A0I     // Catch:{ all -> 0x04b3 }
            r4.A0J = r0     // Catch:{ all -> 0x04b3 }
            long r0 = r4.A0P     // Catch:{ all -> 0x04b3 }
            goto L_0x01bc
        L_0x01b7:
            r19 = r1
            r20 = r21
            goto L_0x01a0
        L_0x01bc:
            X.3Lv r10 = r4.A0m     // Catch:{ all -> 0x0421 }
            r11 = 51
            X.2rt r12 = r10.A1P     // Catch:{ all -> 0x0421 }
            r29 = r12
            r30 = r3
            r31 = r11
            r32 = r24
            r34 = r0
            long r32 = r29.A04(r30, r31, r32, r34)     // Catch:{ all -> 0x0421 }
            r36 = 1
            r29 = r10
            X.2Ni r10 = r29.A0B(r30, r31, r32, r34, r36)     // Catch:{ all -> 0x0421 }
            long r0 = r4.A0B     // Catch:{ all -> 0x0421 }
            java.lang.Long r13 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0421 }
            boolean r0 = r3 instanceof X.C95804uY     // Catch:{ all -> 0x0421 }
            if (r0 == 0) goto L_0x01ec
            X.2rc r12 = r4.A0y     // Catch:{ all -> 0x0421 }
            r1 = r3
            X.4uY r1 = (X.C95804uY) r1     // Catch:{ all -> 0x0421 }
            r0 = r21
            r12.A04(r1, r0, r13, r11)     // Catch:{ all -> 0x0421 }
        L_0x01ec:
            android.database.Cursor r0 = r10.A00     // Catch:{ all -> 0x0421 }
            r0.getCount()     // Catch:{ all -> 0x0421 }
            java.lang.String r0 = "messagesViewModel/start/count"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04b3 }
            long r0 = r10.A02     // Catch:{ all -> 0x04b3 }
            int r11 = (r22 > r8 ? 1 : (r22 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x01fe
            r24 = r22
        L_0x01fe:
            X.2rr r8 = r4.A0s     // Catch:{ all -> 0x0421 }
            r29 = r8
            r31 = r0
            r33 = r24
            int r8 = r29.A03(r30, r31, r33)     // Catch:{ all -> 0x0421 }
            r0 = r37
            X.31A r0 = X.C56982ss.A01(r0, r3)     // Catch:{ all -> 0x04b3 }
            if (r0 != 0) goto L_0x0213
            goto L_0x0216
        L_0x0213:
            long r0 = r0.A0Q     // Catch:{ all -> 0x04b3 }
            goto L_0x0218
        L_0x0216:
            r0 = 1
        L_0x0218:
            int r9 = (r22 > r0 ? 1 : (r22 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x021e
            int r8 = r8 + 1
        L_0x021e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04b3 }
            java.lang.String r0 = "messagesViewModel/start/count/result "
            X.C18260x0.A0y(r0, r1, r8)     // Catch:{ all -> 0x04b3 }
            r18 = r21
            r12 = 1
            r41 = 1
            goto L_0x02a2
        L_0x022d:
            X.2Fd r0 = r4.A0f     // Catch:{ all -> 0x04b3 }
            X.C626936e.A06(r3)     // Catch:{ all -> 0x04b3 }
            java.util.HashMap r0 = r0.A00     // Catch:{ all -> 0x04b3 }
            java.lang.Object r1 = r0.get(r3)     // Catch:{ all -> 0x04b3 }
            X.7HV r1 = (X.AnonymousClass7HV) r1     // Catch:{ all -> 0x04b3 }
            boolean r0 = r4.A0N     // Catch:{ all -> 0x04b3 }
            if (r0 == 0) goto L_0x0284
            if (r42 != 0) goto L_0x0284
            if (r1 == 0) goto L_0x0284
            int r8 = r1.A01     // Catch:{ all -> 0x04b3 }
            if (r8 >= 0) goto L_0x0250
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x04b3 }
            r0 = r26
            r0.A03 = r1     // Catch:{ all -> 0x04b3 }
            r18 = r21
            r8 = -1
            goto L_0x0256
        L_0x0250:
            int r0 = r1.A00     // Catch:{ all -> 0x04b3 }
            java.lang.Integer r18 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x04b3 }
        L_0x0256:
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04b3 }
            java.lang.String r0 = "messagesViewModel/start/scroll-state pos:"
            r9.append(r0)     // Catch:{ all -> 0x04b3 }
            r9.append(r8)     // Catch:{ all -> 0x04b3 }
            java.lang.String r0 = " offset:"
            r9.append(r0)     // Catch:{ all -> 0x04b3 }
            r0 = r18
            r9.append(r0)     // Catch:{ all -> 0x04b3 }
            java.lang.String r0 = " startRef:"
            r9.append(r0)     // Catch:{ all -> 0x04b3 }
            long r0 = r4.A0A     // Catch:{ all -> 0x04b3 }
            r9.append(r0)     // Catch:{ all -> 0x04b3 }
            java.lang.String r0 = " startSortRef:"
            r9.append(r0)     // Catch:{ all -> 0x04b3 }
            long r0 = r4.A0B     // Catch:{ all -> 0x04b3 }
            r9.append(r0)     // Catch:{ all -> 0x04b3 }
            X.AnonymousClass0x2.A18(r9)     // Catch:{ all -> 0x04b3 }
            goto L_0x0287
        L_0x0284:
            r18 = r21
            r8 = -1
        L_0x0287:
            if (r41 == 0) goto L_0x0298
            int r1 = r4.A07     // Catch:{ all -> 0x04b3 }
            r0 = 90
            if (r1 <= r0) goto L_0x0298
            int r9 = r1 + 10
            long r0 = r4.A0P     // Catch:{ all -> 0x04b3 }
            X.2Ni r10 = r4.A0F(r9, r0)     // Catch:{ all -> 0x04b3 }
            goto L_0x029e
        L_0x0298:
            long r0 = r4.A0P     // Catch:{ all -> 0x04b3 }
            X.2Ni r10 = r4.A0F(r14, r0)     // Catch:{ all -> 0x04b3 }
        L_0x029e:
            r19 = r21
            r20 = r21
        L_0x02a2:
            android.database.Cursor r13 = r10.A00     // Catch:{ all -> 0x04b3 }
            if (r13 == 0) goto L_0x0426
            boolean r0 = r13.isClosed()     // Catch:{ all -> 0x04b3 }
            if (r0 != 0) goto L_0x0426
            if (r12 == 0) goto L_0x02b1
            if (r42 == 0) goto L_0x02f7
            goto L_0x02b4
        L_0x02b1:
            if (r42 == 0) goto L_0x02f7
            goto L_0x02da
        L_0x02b4:
            r0 = r37
            X.31A r0 = X.C56982ss.A01(r0, r3)     // Catch:{ all -> 0x04b3 }
            if (r0 == 0) goto L_0x02da
            long r0 = r0.A0L     // Catch:{ all -> 0x04b3 }
            r11 = 1
            int r9 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x02da
            X.4FS r11 = r4.A1E     // Catch:{ all -> 0x04b3 }
            X.08M r0 = r4.A0V     // Catch:{ all -> 0x04b3 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x04b3 }
            X.7Dq r9 = new X.7Dq     // Catch:{ all -> 0x04b3 }
            r9.<init>(r0)     // Catch:{ all -> 0x04b3 }
            r1 = 14
            X.5rT r0 = new X.5rT     // Catch:{ all -> 0x04b3 }
            r0.<init>(r9, r1, r4)     // Catch:{ all -> 0x04b3 }
            r11.BkP(r0)     // Catch:{ all -> 0x04b3 }
        L_0x02da:
            int r1 = r4.A07     // Catch:{ all -> 0x04b3 }
            int r0 = r13.getCount()     // Catch:{ all -> 0x04b3 }
            if (r1 <= r0) goto L_0x02f7
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04b3 }
            java.lang.String r0 = "messagesViewModel/start/unseen greater than cursor count "
            r1.append(r0)     // Catch:{ all -> 0x04b3 }
            int r0 = r13.getCount()     // Catch:{ all -> 0x04b3 }
            X.C18260x0.A1G(r1, r0)     // Catch:{ all -> 0x04b3 }
            r4.A0K()     // Catch:{ all -> 0x04b3 }
            r42 = 0
        L_0x02f7:
            long r0 = r10.A01     // Catch:{ all -> 0x04b3 }
            r4.A0M(r0)     // Catch:{ all -> 0x04b3 }
            long r0 = r10.A02     // Catch:{ all -> 0x04b3 }
            r4.A0N(r0)     // Catch:{ all -> 0x04b3 }
            if (r42 == 0) goto L_0x030d
            int r11 = r4.A07     // Catch:{ all -> 0x04b3 }
            int r9 = r13.getCount()     // Catch:{ all -> 0x04b3 }
            r43 = 1
            if (r11 == r9) goto L_0x030f
        L_0x030d:
            r43 = 0
        L_0x030f:
            int r11 = r13.getCount()     // Catch:{ all -> 0x04b3 }
            boolean r12 = X.C18280x3.A1U(r11, r14)
            r4.A0O = r12     // Catch:{ all -> 0x04b3 }
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04b3 }
            java.lang.String r9 = "messagesViewModel/start/has-earlier "
            X.C18260x0.A1D(r9, r11, r12)     // Catch:{ all -> 0x04b3 }
            r9 = r37
            X.31A r9 = X.C56982ss.A01(r9, r3)     // Catch:{ all -> 0x04b3 }
            if (r9 != 0) goto L_0x032c
            r9 = 0
            goto L_0x032e
        L_0x032c:
            int r9 = r9.A03     // Catch:{ all -> 0x04b3 }
        L_0x032e:
            r4.A01 = r9     // Catch:{ all -> 0x04b3 }
            boolean r9 = r4.A0O     // Catch:{ all -> 0x04b3 }
            int r40 = X.AnonymousClass001.A08(r9)
            r9 = r37
            X.31A r9 = X.C56982ss.A01(r9, r3)     // Catch:{ all -> 0x04b3 }
            if (r9 != 0) goto L_0x0340
            r14 = 0
            goto L_0x0342
        L_0x0340:
            int r14 = r9.A03     // Catch:{ all -> 0x04b3 }
        L_0x0342:
            r4.A0Q(r10)     // Catch:{ all -> 0x04b3 }
            r4.A0O(r0)     // Catch:{ all -> 0x04b3 }
            java.lang.String r0 = "com.whatsapp.intent.action.PLAY"
            boolean r0 = X.C18280x3.A1V(r2, r0)     // Catch:{ all -> 0x04b3 }
            if (r0 == 0) goto L_0x0371
            int r0 = r13.getCount()     // Catch:{ all -> 0x04b3 }
            if (r0 <= 0) goto L_0x0371
            X.2z0 r1 = X.C107395bF.A02(r2)     // Catch:{ all -> 0x04b3 }
            if (r1 == 0) goto L_0x0371
            X.2qz r0 = r4.A11     // Catch:{ all -> 0x04b3 }
            X.34x r34 = r0.A05(r1)     // Catch:{ all -> 0x04b3 }
        L_0x0362:
            X.4UC r12 = r4.A15     // Catch:{ all -> 0x04b3 }
            int r2 = r4.A05     // Catch:{ all -> 0x04b3 }
            int r1 = r4.A06     // Catch:{ all -> 0x04b3 }
            int r0 = r4.A07     // Catch:{ all -> 0x04b3 }
            X.5Px r11 = new X.5Px     // Catch:{ all -> 0x04b3 }
            r11.<init>(r2, r1, r0)     // Catch:{ all -> 0x04b3 }
            monitor-enter(r4)     // Catch:{ all -> 0x04b3 }
            goto L_0x0374
        L_0x0371:
            r34 = 0
            goto L_0x0362
        L_0x0374:
            X.34x r15 = r4.A0F     // Catch:{ all -> 0x0423 }
            monitor-exit(r4)     // Catch:{ all -> 0x04b3 }
            X.4UC r9 = r4.A17     // Catch:{ all -> 0x04b3 }
            java.util.concurrent.atomic.AtomicBoolean r2 = r9.A00     // Catch:{ all -> 0x04b3 }
            r1 = 1
            r0 = 0
            boolean r0 = r2.compareAndSet(r1, r0)     // Catch:{ all -> 0x04b3 }
            if (r0 == 0) goto L_0x03c6
            java.lang.Object r1 = r9.A07()     // Catch:{ all -> 0x04b3 }
        L_0x0387:
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x04b3 }
            X.5R2 r0 = new X.5R2     // Catch:{ all -> 0x04b3 }
            r29 = r0
            r30 = r20
            r31 = r11
            r32 = r10
            r33 = r15
            r35 = r19
            r36 = r18
            r37 = r1
            r38 = r14
            r39 = r8
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x04b3 }
            r12.A0H(r0)     // Catch:{ all -> 0x04b3 }
            int r1 = r4.A07     // Catch:{ all -> 0x04b3 }
            if (r1 <= 0) goto L_0x03b7
            int r0 = r13.getCount()     // Catch:{ all -> 0x04b3 }
            if (r1 != r0) goto L_0x03b7
            java.lang.String r0 = "messagesViewModel/start/scrolltotop/true"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x04b3 }
            r4.A0K()     // Catch:{ all -> 0x04b3 }
        L_0x03b7:
            int r0 = r4.A07     // Catch:{ all -> 0x04b3 }
            if (r0 <= 0) goto L_0x03d3
            boolean r0 = r4.A1M     // Catch:{ all -> 0x04b3 }
            if (r0 == 0) goto L_0x03d3
            boolean r0 = r13.moveToFirst()     // Catch:{ all -> 0x04b3 }
            if (r0 == 0) goto L_0x040f
            goto L_0x0418
        L_0x03c6:
            r1 = 0
            goto L_0x0387
        L_0x03c8:
            X.2z0 r1 = r0.A1J     // Catch:{ all -> 0x04b3 }
            boolean r1 = r1.A02     // Catch:{ all -> 0x04b3 }
            if (r1 == 0) goto L_0x03d3
            int r1 = r0.A0D     // Catch:{ all -> 0x04b3 }
            r0 = 6
            if (r1 == r0) goto L_0x0409
        L_0x03d3:
            java.util.List r0 = r4.A1I     // Catch:{ all -> 0x04b3 }
            r0.clear()     // Catch:{ all -> 0x04b3 }
            X.6aY r1 = X.C129586aY.copyOf((java.util.Collection) r0)     // Catch:{ all -> 0x04b3 }
            r0 = r26
            r0.A00 = r1     // Catch:{ all -> 0x04b3 }
            r1 = 1
            r0.A06 = r1     // Catch:{ all -> 0x04b3 }
            X.4UC r1 = r4.A13     // Catch:{ all -> 0x04b3 }
            r0 = r21
            r1.A0H(r0)     // Catch:{ all -> 0x04b3 }
            X.4UC r1 = r4.A16     // Catch:{ all -> 0x04b3 }
            r1.A0H(r0)     // Catch:{ all -> 0x04b3 }
            r9.A0H(r0)     // Catch:{ all -> 0x04b3 }
            r4.A0L()     // Catch:{ all -> 0x04b3 }
            X.5Qd r1 = r26.A00()     // Catch:{ all -> 0x04b3 }
            r0 = r44
            r0.A0H(r1)     // Catch:{ all -> 0x04b3 }
            X.34x r0 = r4.A0G()     // Catch:{ all -> 0x04b3 }
            r4.A0U(r0)     // Catch:{ all -> 0x04b3 }
            X.AnonymousClass4VQ.A02(r4)     // Catch:{ all -> 0x04b3 }
            goto L_0x042b
        L_0x0409:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x04b3 }
            if (r0 != 0) goto L_0x0418
        L_0x040f:
            java.lang.String r0 = "messagesViewModel/start/reset-unseen"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x04b3 }
            r4.A0K()     // Catch:{ all -> 0x04b3 }
            goto L_0x03d3
        L_0x0418:
            X.2qz r0 = r4.A11     // Catch:{ all -> 0x0421 }
            X.34x r0 = r0.A04(r13, r3)     // Catch:{ all -> 0x0421 }
            if (r0 == 0) goto L_0x0409
            goto L_0x03c8
        L_0x0421:
            r0 = move-exception
            goto L_0x0425
        L_0x0423:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x04b3 }
        L_0x0425:
            throw r0     // Catch:{ all -> 0x04b3 }
        L_0x0426:
            java.lang.String r0 = "messagesViewModel/start/cursor is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x04b3 }
        L_0x042b:
            if (r28 == 0) goto L_0x043f
            int r0 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x043f
            X.4FS r4 = r5.A5i     // Catch:{ all -> 0x04b3 }
            r3 = 8
            X.3Zv r2 = new X.3Zv     // Catch:{ all -> 0x04b3 }
            r0 = r16
            r2.<init>(r5, r0, r3)     // Catch:{ all -> 0x04b3 }
            r4.BkM(r2)     // Catch:{ all -> 0x04b3 }
        L_0x043f:
            X.4xi r2 = r5.A4E     // Catch:{ all -> 0x04bd }
            X.4eZ r1 = A09(r5)     // Catch:{ all -> 0x04bd }
            X.0rw r0 = r5.A6z     // Catch:{ all -> 0x04bd }
            r2.A0B(r1, r0)     // Catch:{ all -> 0x04bd }
            X.4xi r0 = r5.A4E     // Catch:{ all -> 0x04bd }
            boolean r0 = r0.A0I()     // Catch:{ all -> 0x04bd }
            if (r0 == 0) goto L_0x0459
            X.4xi r1 = r5.A4E     // Catch:{ all -> 0x04bd }
            X.5UN r0 = r5.A7B     // Catch:{ all -> 0x04bd }
            r1.A06(r0)     // Catch:{ all -> 0x04bd }
        L_0x0459:
            X.4uZ r0 = r5.A4J     // Catch:{ all -> 0x04bd }
            boolean r0 = r0 instanceof X.C95804uY     // Catch:{ all -> 0x04bd }
            if (r0 == 0) goto L_0x04b7
            X.5LO r0 = A0C(r5)     // Catch:{ all -> 0x04bd }
            X.8qC r0 = r0.A08     // Catch:{ all -> 0x04bd }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x04bd }
            X.5Os r4 = (X.C103865Os) r4     // Catch:{ all -> 0x04bd }
            X.4uZ r2 = r5.A4J     // Catch:{ all -> 0x04bd }
            boolean r0 = r2 instanceof X.C95804uY     // Catch:{ all -> 0x04bd }
            if (r0 == 0) goto L_0x0475
            X.4uY r2 = (X.C95804uY) r2     // Catch:{ all -> 0x04bd }
        L_0x0473:
            monitor-enter(r4)     // Catch:{ all -> 0x04bd }
            goto L_0x0477
        L_0x0475:
            r2 = 0
            goto L_0x0473
        L_0x0477:
            r0 = 0
            X.C162457s7.A0J(r2, r0)     // Catch:{ all -> 0x04b0 }
            X.1VX r1 = r4.A02     // Catch:{ all -> 0x04b0 }
            r0 = 4306(0x10d2, float:6.034E-42)
            boolean r0 = r1.A0X(r0)     // Catch:{ all -> 0x04b0 }
            if (r0 == 0) goto L_0x04ae
            X.2ss r0 = r4.A00     // Catch:{ all -> 0x04b0 }
            X.5UP r1 = r4.A04     // Catch:{ all -> 0x04b0 }
            boolean r0 = X.C106855aH.A04(r0, r2, r1)     // Catch:{ all -> 0x04b0 }
            if (r0 == 0) goto L_0x04ae
            X.4uY r0 = r4.A07     // Catch:{ all -> 0x04b0 }
            if (r0 == 0) goto L_0x0496
            r4.A00()     // Catch:{ all -> 0x04b0 }
        L_0x0496:
            r4.A07 = r2     // Catch:{ all -> 0x04b0 }
            boolean r0 = X.C18300x5.A1S(r1)     // Catch:{ all -> 0x04b0 }
            if (r0 == 0) goto L_0x04ae
            X.4uY r3 = r4.A07     // Catch:{ all -> 0x04b0 }
            if (r3 == 0) goto L_0x04ae
            X.4FS r2 = r4.A06     // Catch:{ all -> 0x04b0 }
            r1 = 39
            X.3Zy r0 = new X.3Zy     // Catch:{ all -> 0x04b0 }
            r0.<init>(r4, r1, r3)     // Catch:{ all -> 0x04b0 }
            r2.BkM(r0)     // Catch:{ all -> 0x04b0 }
        L_0x04ae:
            monitor-exit(r4)     // Catch:{ all -> 0x04bd }
            goto L_0x04b7
        L_0x04b0:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x04bd }
            throw r0     // Catch:{ all -> 0x04bd }
        L_0x04b3:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x04b5 }
        L_0x04b5:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x04bd }
        L_0x04b7:
            r0 = r27
            r5.A2F(r0)
            return
        L_0x04bd:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x04bf }
        L_0x04bf:
            r1 = move-exception
            r0 = r27
            r5.A2F(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113245l7.A0p():void");
    }

    public void A0q() {
        View view;
        AnonymousClass4FD r1;
        this.A4E.A0C(this.A6z);
        if (this.A4E.A0I()) {
            this.A4E.A07(this.A7B);
        }
        this.A1x.A07(this.A2z);
        if (A09(this).isFinishing() && (r1 = this.A3b) != null) {
            this.A3a.A07(r1);
            this.A3b = null;
        }
        if (this.A0D != null) {
            this.A69 = Boolean.valueOf(C105895Wv.A01(this));
        }
        A0K(this);
        A1A();
        A0J(this);
        this.A4f.A03(this.A7E);
        A0e();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("conversation/stop/release ");
        A0o2.append(SQLiteDatabase.releaseMemory());
        A0o2.append(" jid=");
        C18260x0.A0o(this.A4J, A0o2);
        AnonymousClass4VQ r0 = this.A3B;
        if (r0 != null) {
            ConversationListView conversationListView = this.A2f;
            C95814uZ r11 = this.A4J;
            long j = r0.A0A;
            long j2 = r0.A0B;
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.A6w;
            if (conversationListView.getHeight() != 0) {
                if (conversationListView.A0B(0)) {
                    conversationListView.A0O = true;
                    Log.d("conversation/dbgscroll/resumescrolltobottom/true");
                    C40262Fd r02 = conversationListView.A06;
                    C626936e.A06(r11);
                    r02.A00.remove(r11);
                } else {
                    int firstVisiblePosition = conversationListView.getFirstVisiblePosition();
                    conversationListView.A01 = firstVisiblePosition;
                    C18260x0.A0w("conversation/dbgscroll/resumescrolltopos/", AnonymousClass001.A0o(), firstVisiblePosition);
                    View childAt = conversationListView.getChildAt(0);
                    conversationListView.A02 = 0;
                    if (childAt != null) {
                        conversationListView.A02 = childAt.getTop();
                    }
                    C40262Fd r10 = conversationListView.A06;
                    C626936e.A06(r11);
                    r10.A00.put(r11, new AnonymousClass7HV(conversationListView.A01 - conversationListView.getHeaderViewsCount(), conversationListView.A02));
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    A0o3.append("conversation/dbgscroll/scroll-state pos:");
                    A0o3.append(conversationListView.A01);
                    A0o3.append(" offset:");
                    A0o3.append(conversationListView.A02);
                    A0o3.append(" startRef:");
                    A0o3.append(j);
                    A0o3.append(" startSortRef:");
                    A0o3.append(j2);
                    A0o3.append(" headerCount:");
                    C18260x0.A1F(A0o3, conversationListView.getHeaderViewsCount());
                    conversationListView.A0O = false;
                    Log.d("conversation/dbgscroll/resumescrolltobottom/false");
                }
            }
            Cursor cursor = conversationListView.getConversationCursorAdapter().getCursor();
            if (cursor != null) {
                cursor.close();
            }
            AnonymousClass0x7.A16(conversationListView, onPreDrawListener);
        }
        C94264qq r12 = this.A45;
        if (!(r12 == null || (view = r12.A0G) == null)) {
            C86604Kt.A1G(view, r12);
        }
        if (this.A4J instanceof C95804uY) {
            ((C103865Os) A0C(this).A08.get()).A00();
        }
        Iterator it = this.A7L.iterator();
        while (it.hasNext()) {
            C86664Kz.A0R(it).onActivityStopped(A09(this));
        }
    }

    public final void A0s() {
        C992054v r1 = this.A5m;
        if (r1 != null) {
            r1.A0D(true);
            this.A5m = null;
        }
        C124296Bs r4 = new C124296Bs(this, 0);
        C55832qz fMessageDatabase = this.A2z.getFMessageDatabase();
        C105215Ua r2 = this.A5o;
        C95814uZ r12 = this.A4J;
        C626936e.A06(r12);
        this.A5m = new C992054v(r12, fMessageDatabase, r4, r2);
        AnonymousClass0x7.A1B(this.A5m, A0G(this));
    }

    public final void A0t() {
        MentionableEntry mentionableEntry = this.A4P;
        TextWatcher textWatcher = this.A6r;
        mentionableEntry.removeTextChangedListener(textWatcher);
        this.A6R = false;
        try {
            this.A4P.setText("");
            A0r();
            TextKeyListener.clear(this.A4P.getText());
            A0s();
            A16();
        } finally {
            if (!A0Q(this)) {
                this.A4P.addTextChangedListener(textWatcher);
            }
        }
    }

    public final void A0v() {
        ViewGroup viewGroup = (ViewGroup) this.A2z.findViewById(R.id.push_to_video_stub);
        if (this.A2z.findViewById(R.id.push_to_video_root_view) == null) {
            this.A2z.getLayoutInflater().inflate(R.layout.f8nameremoved, viewGroup, true);
        }
    }

    public final void A0w() {
        int i;
        if (this.A5q == null) {
            A2F("voice_recording_ui_start");
            this.A2z.getLayoutInflater().inflate(R.layout.f8nameremoved, (ViewGroup) this.A2z.findViewById(R.id.voice_note_stub), true);
            this.A0S = this.A2z.findViewById(R.id.voice_note_layout);
            if (this.A6Q) {
                i = A02(this).getDimensionPixelOffset(R.dimen.f6nameremoved);
            } else {
                i = 0;
            }
            A1X(i);
            AnonymousClass6BV r11 = new AnonymousClass6BV(this, 0);
            AnonymousClass5QR r3 = this.A5r;
            C89644eZ A092 = A09(this);
            KeyboardPopupLayout keyboardPopupLayout = this.A1a;
            C627736r r1 = this.A7C;
            C89644eZ r7 = A092;
            AnonymousClass5ZT A002 = r3.A01.A00(keyboardPopupLayout, A092, r7, this.A38, r3.A00.A01(A092, keyboardPopupLayout), r3.A02.A00(A092, r1), r11, (AnonymousClass5H0) null, true, true);
            this.A5q = A002;
            C95814uZ r32 = this.A4J;
            C626936e.A0F(!AnonymousClass000.A1W(A002.A0L), "Do not update the ptt receiver once the recording has started");
            A002.A0E = r32;
            if (A002.A0v.A0X(2832) && !(A002.A0E instanceof C95804uY)) {
                ImageButton imageButton = A002.A1D.A0E;
                imageButton.setVisibility(0);
                C109395eY.A00(imageButton, A002, 48);
            }
            this.A5q.A0G = this.A3B.A0G;
            A1L();
            A2F("voice_recording_ui_end");
        }
    }

    public final void A0x() {
        this.A1i.setVisibility(8);
        AnonymousClass043 r0 = this.A0o;
        if (r0 != null) {
            r0.dismiss();
            this.A0o = null;
        }
    }

    public final void A0z() {
        if (this.A3T.A01()) {
            A1Q(A0V(1));
        }
        this.A3T.A00();
    }

    public final void A10() {
        C149747Ns r0 = (C149747Ns) A7S.get(A0F(this));
        if (r0 != null) {
            AnonymousClass5RH r1 = this.A3T;
            boolean z = r0.A03;
            C95814uZ r02 = r1.A0A;
            if (r02 != null) {
                r1.A0P.A00(1, r02.getRawString(), z);
            }
        }
    }

    public final void A11() {
        if (this.A0J == null && this.A0k != null) {
            AnonymousClass67C r4 = this.A2O;
            AnonymousClass1VX r3 = this.A41;
            View B0k = r4.B0k(A09(this), this.A1b, r3, this.A4J);
            this.A0J = B0k;
            int i = 1;
            if (this.A0Q == null) {
                i = 0;
            }
            this.A0k.addView(B0k, i);
        }
    }

    public final void A12() {
        UserJid A072;
        if (this.A7Q != null && this.A7Q.booleanValue()) {
            ConversationListView conversationListView = this.A2f;
            int firstVisiblePosition = conversationListView.getFirstVisiblePosition();
            while (true) {
                if (firstVisiblePosition > conversationListView.getLastVisiblePosition()) {
                    break;
                }
                View childAt = conversationListView.getChildAt(firstVisiblePosition);
                if (childAt instanceof C93124nw) {
                    C93124nw r1 = (C93124nw) childAt;
                    if (r1 != null) {
                        r1.A07 = true;
                    }
                } else {
                    firstVisiblePosition++;
                }
            }
        }
        this.A2X.A08();
        if (this.A3n.A0R() && (A072 = AnonymousClass3ZH.A07(this.A3n)) != null) {
            AnonymousClass676 r2 = this.A2z;
            r2.getBusinessProfileManager().A08(r2, A072, (String) null);
        }
        this.A2z.getAddContactLogUtil().A00();
    }

    public final void A15() {
        this.A2z.getMessageAudioPlayerProvider().A04();
        this.A2z.invalidateOptionsMenu();
        AnonymousClass66v r1 = this.A5l;
        if (r1 != null && r1.B8N()) {
            r1.BgY();
        }
        AnonymousClass676 r0 = this.A2z;
        C107465bM.A03(r0.getContentView(), r0.getMessageAudioPlayerProvider());
    }

    public final void A16() {
        View view;
        AnonymousClass5RH r2 = this.A3T;
        if (r2.A0E) {
            if (r2.A0H == 2) {
                view = r2.A09;
            } else {
                view = r2.A08;
            }
            C626936e.A04(view);
            if (view.getVisibility() == 0) {
                A2M(true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r4.A2z.BIc() != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A17() {
        /*
            r4 = this;
            android.view.View r3 = r4.A0D
            X.0R2 r0 = r4.A0q
            r2 = 8
            if (r0 != 0) goto L_0x0011
            X.676 r0 = r4.A2z
            boolean r1 = r0.BIc()
            r0 = 0
            if (r1 == 0) goto L_0x0013
        L_0x0011:
            r0 = 8
        L_0x0013:
            r3.setVisibility(r0)
            r4.A0x()
            com.whatsapp.TextEmojiLabel r0 = r4.A1j
            r0.setVisibility(r2)
            X.5IT r0 = r4.A2w
            X.5UY r0 = r0.A00
            if (r0 == 0) goto L_0x0027
            r0.A06(r2)
        L_0x0027:
            android.view.View r0 = r4.A0I
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113245l7.A17():void");
    }

    public final void A18() {
        C624134x r2;
        C93314oJ A002;
        if (this.A2z.getSelectedMessages() == null || this.A2z.getSelectedMessages().A04.isEmpty()) {
            r2 = null;
        } else {
            r2 = (C624134x) C57272tN.A00(this.A2z.getSelectedMessages().A00());
        }
        AnonymousClass676 r1 = this.A2z;
        if (r1.getSelectionActionMode() != null && r1.getSelectedMessages() != null && this.A3B.A0G == null && r2 != null && this.A54.A02(r2) && (A002 = this.A2f.A00(r2.A1J)) != null) {
            if (A002.A13() && A002.A06 == 0) {
                View view = A002.A0l;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", new float[]{(float) (A002.getWidth() / 6)});
                ofFloat.setDuration(600).setInterpolator(new AnonymousClass089());
                C86614Ku.A0z(ofFloat, A002, 18);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationX", new float[]{0.0f});
                C86614Ku.A0y(ofFloat2.setDuration(200));
                C86614Ku.A0z(ofFloat2, A002, 19);
                AnimatorSet A0O2 = C86664Kz.A0O();
                A0O2.play(ofFloat);
                A0O2.play(ofFloat2).after(900);
                A0O2.start();
                A002.A06 = 2;
                A002.invalidate();
            }
            A07(this).A0H(R.string.f11nameremoved, 1);
            this.A2z.B3M();
        }
    }

    public final void A1A() {
        C48962fl A002 = this.A35.A00();
        C626936e.A06(A002);
        if (A002.A00 == this.A2z) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("conversation/session/inactive/jid ");
            C18260x0.A0m(this.A4J, A0o2);
            C44382Vv r4 = this.A35;
            AnonymousClass676 r3 = this.A2z;
            AnonymousClass0IR.A00(A002, new C48962fl(r3, r3.getScreenLockStateProvider(), false), r4.A00);
        }
    }

    public final void A1B() {
        if (this.A0V != null) {
            this.A40 = new ExpressionsBottomSheetView(this.A1a.getContext());
            C002002f r3 = new C002002f(-1, -1);
            BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
            bottomSheetBehavior.A0d(true);
            bottomSheetBehavior.A0S(4);
            bottomSheetBehavior.A0U(this.A2z.getResources().getDimensionPixelOffset(R.dimen.f6nameremoved), false);
            r3.A01(bottomSheetBehavior);
            this.A40.setLayoutParams(r3);
            this.A0V.addView(this.A40);
        }
        this.A0E = this.A2z.findViewById(R.id.expressions_view_root);
        this.A3v = (EmojiSearchKeyboardContainer) this.A2z.findViewById(R.id.emoji_search_keyboard_container);
        this.A3w.A01((Integer) null);
        ExpressionsBottomSheetView expressionsBottomSheetView = this.A40;
        if (expressionsBottomSheetView != null) {
            expressionsBottomSheetView.A0I = this.A7G;
            expressionsBottomSheetView.A0H = new AnonymousClass93Z(this, 0);
            expressionsBottomSheetView.A03 = this.A70;
            expressionsBottomSheetView.setExpressionsSearchListener(this.A7A);
            this.A40.setAdapterFunStickerData(A0a());
            this.A40.setVisibility(8);
            ExpressionsBottomSheetView expressionsBottomSheetView2 = this.A40;
            expressionsBottomSheetView2.A0C = new AnonymousClass3MA(this);
            BottomSheetBehavior A012 = BottomSheetBehavior.A01(expressionsBottomSheetView2);
            this.A0t = A012;
            A012.A0Z(new C1232167o(this, 4));
            ViewGroup viewGroup = this.A0V;
            if (viewGroup != null) {
                viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass6BP(0, this, false));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        if (r5.A41.A0Y(X.C58422vE.A01, 4245) == false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1C() {
        /*
            r5 = this;
            android.view.ViewGroup r0 = r5.A0U
            if (r0 == 0) goto L_0x006c
            X.4eZ r2 = A09(r5)
            if (r2 == 0) goto L_0x006c
            boolean r1 = r2 instanceof com.whatsapp.Conversation
            r0 = 2131429121(0x7f0b0701, float:1.8479906E38)
            if (r1 == 0) goto L_0x0014
            r0 = 2131433177(0x7f0b16d9, float:1.8488132E38)
        L_0x0014:
            android.view.View r4 = r2.findViewById(r0)
            if (r4 == 0) goto L_0x006c
            com.whatsapp.conversation.ConversationListView r0 = r5.A2f
            android.view.View r0 = r0.getLastRow()
            r3 = 0
            if (r0 != 0) goto L_0x006d
            r1 = 0
        L_0x0024:
            com.whatsapp.conversation.ConversationListView r0 = r5.A2f
            int r0 = r0.getBottom()
            if (r1 < r0) goto L_0x0047
            X.4xi r0 = r5.A4E
            boolean r0 = r0.A0E()
            if (r0 != 0) goto L_0x0047
            boolean r0 = r5.A2X()
            if (r0 == 0) goto L_0x0047
            X.1VX r2 = r5.A41
            X.2vE r1 = X.C58422vE.A01
            r0 = 4245(0x1095, float:5.949E-42)
            boolean r0 = r2.A0Y(r1, r0)
            r2 = 1
            if (r0 != 0) goto L_0x0048
        L_0x0047:
            r2 = 0
        L_0x0048:
            X.4TF r0 = new X.4TF
            r0.<init>()
            X.C05820Vc.A01(r4, r0)
            X.AnonymousClass0YZ.A0E(r4, r0)
            X.4eZ r0 = A09(r5)
            android.view.Window r0 = r0.getWindow()
            X.AnonymousClass0ID.A00(r0, r3)
            com.whatsapp.KeyboardPopupLayout r0 = r5.A1a
            X.4TE r1 = new X.4TE
            r1.<init>(r0, r3, r2)
            r5.A4D = r1
            com.whatsapp.KeyboardPopupLayout r0 = r5.A1a
            X.C05820Vc.A01(r0, r1)
        L_0x006c:
            return
        L_0x006d:
            int r1 = r0.getBottom()
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113245l7.A1C():void");
    }

    public final void A1D() {
        this.A0D.setVisibility(8);
        this.A0I.setVisibility(0);
        AnonymousClass5IT r6 = this.A2w;
        AnonymousClass3ZH r5 = this.A3n;
        View view = this.A0I;
        C147267Dl r3 = new C147267Dl(this);
        C18270x1.A14(r5, view);
        AnonymousClass5UY r1 = r6.A00;
        if (r1 == null) {
            r1 = C18290x4.A0X(view, R.id.blocked_chat_delete_unblock_footer_stub);
            r6.A00 = r1;
        }
        r1.A09(new C116415qF(r6, r3, r5));
        AnonymousClass5UY r0 = r6.A00;
        if (r0 != null) {
            r0.A06(0);
        }
    }

    public final void A1E() {
        C66513Ls r4;
        Log.i("conversation/showLinkPreviewShell");
        if (this.A2p == null) {
            A2K(false);
        }
        if (this.A0a.getVisibility() != 0 || this.A05 < 0) {
            Log.i("conversation/showLinkPreviewShell/start");
            AnonymousClass5KX r0 = this.A2p;
            if (r0 != null) {
                A1h(r0.A05, this.A0a);
            }
        }
        C66513Ls r1 = this.A3D.A01;
        if (r1 instanceof AnonymousClass1Hk) {
            AnonymousClass2U8 r3 = ((AnonymousClass1Hk) r1).A00;
            C50202hn r2 = this.A3P.A02;
            UserJid A032 = AnonymousClass32Y.A03(this.A4J);
            int i = 4;
            if (r3 != null) {
                i = 17;
            }
            r2.A01(A032, i);
        }
        AnonymousClass5KX r12 = this.A2p;
        if (r12 != null && (r4 = this.A3D.A01) != null) {
            r12.A05.A0F(r4, (List) null, false, r12.A00);
        }
    }

    public final void A1F() {
        if (!this.A1a.A07) {
            ExpressionsBottomSheetView expressionsBottomSheetView = this.A40;
            if (expressionsBottomSheetView == null || expressionsBottomSheetView.getVisibility() != 8) {
                A1H();
                return;
            }
            String string = this.A2z.getString(R.string.f11nameremoved);
            this.A0f.setImageResource(R.drawable.ib_keyboard);
            this.A0f.setContentDescription(string);
            ExpressionsBottomSheetView expressionsBottomSheetView2 = this.A40;
            if (expressionsBottomSheetView2 != null) {
                expressionsBottomSheetView2.setExpressionsTabs(A0T());
                EmojiSearchKeyboardContainer emojiSearchKeyboardContainer = this.A3v;
                if (emojiSearchKeyboardContainer != null && emojiSearchKeyboardContainer.getVisibility() == 0) {
                    this.A3v.A00();
                }
            }
            A1G();
            C45592aG r2 = this.A5T;
            r2.A00(5);
            if (r2.A02) {
                r2.A00.BhD(new C23861Ve());
            }
        }
    }

    public final void A1H() {
        ExpressionsBottomSheetView expressionsBottomSheetView = this.A40;
        if (expressionsBottomSheetView != null) {
            expressionsBottomSheetView.A0A();
        }
        BottomSheetBehavior bottomSheetBehavior = this.A0t;
        if (bottomSheetBehavior == null || bottomSheetBehavior.A0O != 3) {
            ExpressionsBottomSheetView expressionsBottomSheetView2 = this.A40;
            if (expressionsBottomSheetView2 == null || expressionsBottomSheetView2.getVisibility() != 8) {
                this.A1a.A07 = true;
                ExpressionsBottomSheetView expressionsBottomSheetView3 = this.A40;
                if (expressionsBottomSheetView3 != null) {
                    expressionsBottomSheetView3.setVisibility(8);
                    this.A40.post(C117615sD.A00(this, 22));
                    return;
                }
                return;
            }
            C86644Kx.A1J(this.A4P);
            return;
        }
        this.A6i = true;
        bottomSheetBehavior.A0S(4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0299, code lost:
        if (r1.A09(X.C56972sr.A04(r1.A02)) != null) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03e9, code lost:
        if (r1 == false) goto L_0x03eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0414, code lost:
        if (r12 != false) goto L_0x0416;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0476, code lost:
        if (r1 == false) goto L_0x03eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0484, code lost:
        if (r6 == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        if (r1 == false) goto L_0x007b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03f7  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0134  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1K() {
        /*
            r18 = this;
            r2 = r18
            X.5RI r4 = r2.A31
            X.3ZH r8 = r2.A3n
            boolean r5 = r2.A6H
            boolean r6 = r2.A6g
            java.lang.Boolean r10 = r2.A7Q
            X.2k5 r0 = r8.A0F
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r7 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0023
            X.3ZH r0 = r8.A0G
            if (r0 != 0) goto L_0x0023
            boolean r0 = r8.A0t
            if (r0 == 0) goto L_0x0553
            int r1 = r8.A07
            r0 = 2
            if (r1 == r0) goto L_0x0553
        L_0x0023:
            r12 = 1
        L_0x0024:
            boolean r0 = r8.A0U()
            if (r0 == 0) goto L_0x016d
            java.lang.Class<X.1fJ> r6 = X.C27991fJ.class
            com.whatsapp.jid.Jid r5 = X.AnonymousClass3ZH.A05(r8, r6)
            X.1fJ r5 = (X.C27991fJ) r5
            X.2sD r1 = r4.A0T
            X.3Lq r0 = r4.A0Q
            X.2sj r0 = r0.A0b
            boolean r0 = r0.A0G(r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r1.A08(r5, r0)
            if (r0 == 0) goto L_0x016a
            r4.A00(r8, r3)
        L_0x0049:
            X.8u6 r0 = r4.A04
            if (r0 == 0) goto L_0x0058
            int r5 = r0.getType()
            X.5UU r9 = r4.A0L
            if (r7 != 0) goto L_0x00ef
            r0.BFg()
        L_0x0058:
            r6 = r7
        L_0x0059:
            r4.A09 = r3
            boolean r0 = r4.A08
            if (r6 == r0) goto L_0x00ed
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "conversation/spam/"
            X.C18260x0.A1E(r0, r1, r6)
            r4.A08 = r6
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
        L_0x006e:
            X.5RI r0 = r2.A31
            X.8u6 r0 = r0.A04
            if (r0 == 0) goto L_0x007b
            boolean r1 = r0.isVisible()
            r0 = 1
            if (r1 != 0) goto L_0x007c
        L_0x007b:
            r0 = 0
        L_0x007c:
            X.2Sp r5 = r2.A30
            if (r0 == 0) goto L_0x00b6
            X.1VX r1 = r5.A03
            r0 = 2481(0x9b1, float:3.477E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x009c
            X.4PG r1 = r5.A00
            if (r1 == 0) goto L_0x009c
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x009c
            r0 = 8
            r1.setVisibility(r0)
            r0 = 0
            r5.A01 = r0
        L_0x009c:
            if (r3 == 0) goto L_0x00b5
            boolean r0 = r3.booleanValue()
            if (r0 != 0) goto L_0x00b5
            X.2sD r3 = r2.A5K
            X.3ZH r0 = r2.A3n
            X.4uZ r1 = X.C86604Kt.A0a(r0)
            r0 = 1
            r3.A07(r1, r0)
            com.whatsapp.conversation.ConversationListView r0 = r2.A2f
            X.C87234On.A00(r0, r2)
        L_0x00b5:
            return
        L_0x00b6:
            X.4uZ r6 = r2.A4J
            X.676 r1 = r2.A2z
            r0 = 2131427800(0x7f0b01d8, float:1.8477226E38)
            android.view.View r8 = r1.findViewById(r0)
            X.4eZ r7 = A09(r2)
            r0 = 2
            X.C162457s7.A0J(r7, r0)
            if (r8 == 0) goto L_0x009c
            boolean r0 = r6 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x009c
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x009c
            X.1VX r1 = r5.A03
            r0 = 2481(0x9b1, float:3.477E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x009c
            r0 = 1
            r5.A01 = r0
            X.4FS r0 = r5.A06
            r9 = 41
            X.3cM r4 = new X.3cM
            r4.<init>((java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (int) r9)
            r0.BkM(r4)
            goto L_0x009c
        L_0x00ed:
            r3 = 0
            goto L_0x006e
        L_0x00ef:
            X.3ZH r0 = r9.A00
            if (r0 != 0) goto L_0x015b
            java.lang.String r0 = "Contact is unexpected null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00f8:
            r11 = 0
        L_0x00f9:
            java.lang.String r0 = r9.A01(r5)
            boolean r1 = X.AnonymousClass000.A1W(r0)
            r0 = 1
            r10 = 2131889772(0x7f120e6c, float:1.9414217E38)
            r8 = 2131890008(0x7f120f58, float:1.9414696E38)
            if (r5 != r0) goto L_0x0110
            r10 = 2131889773(0x7f120e6d, float:1.941422E38)
            r8 = 2131890009(0x7f120f59, float:1.9414698E38)
        L_0x0110:
            X.5P4 r6 = new X.5P4
            r6.<init>()
            r5 = 8
            int r0 = X.C86614Ku.A09(r1)
            r6.A0B = r0
            r0 = 0
            r6.A0A = r3
            if (r11 != 0) goto L_0x0124
            r0 = 8
        L_0x0124:
            r6.A04 = r0
            X.33p r0 = r9.A0A
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "privacy_groupadd"
            int r0 = r1.getInt(r0, r3)
            if (r0 != 0) goto L_0x0135
            r5 = 0
        L_0x0135:
            r6.A06 = r5
            r6.A07 = r10
            X.2so r5 = r9.A08
            X.3ZH r0 = r9.A00
            com.whatsapp.jid.GroupJid r1 = X.C86664Kz.A1C(r0)
            X.2ss r0 = r5.A06
            int r1 = r0.A06(r1)
            r0 = 3
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            r6.A0D = r0
            r6.A05 = r8
            X.7QG r1 = r6.A00()
            X.8u6 r0 = r4.A04
            r0.BjX(r1)
            goto L_0x0058
        L_0x015b:
            com.whatsapp.jid.Jid r1 = r0.A0I(r6)
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            if (r1 == 0) goto L_0x00f8
            X.2sj r0 = r9.A0C
            boolean r11 = r0.A0C(r1)
            goto L_0x00f9
        L_0x016a:
            r7 = 0
            goto L_0x0049
        L_0x016d:
            X.3LP r0 = r4.A0P
            X.4uZ r9 = r4.A0S
            boolean r0 = X.C57362tW.A00(r0, r9)
            if (r0 != 0) goto L_0x01a1
            X.1VX r1 = r4.A0O
            boolean r0 = X.C616831v.A00(r1, r9)
            if (r0 != 0) goto L_0x01a1
            X.5rC r11 = r4.A0E
            boolean r0 = r11.A07()
            if (r0 == 0) goto L_0x0191
            X.66o r0 = X.C116985rC.A03(r11)
            boolean r0 = r0.BH2(r9)
            if (r0 != 0) goto L_0x01a1
        L_0x0191:
            X.2Jm r11 = r4.A0I
            boolean r0 = r8.A0T()
            if (r0 == 0) goto L_0x0200
            X.1VX r0 = r11.A01
            boolean r0 = X.AnonymousClass75P.A00(r0)
            if (r0 == 0) goto L_0x0200
        L_0x01a1:
            r4.A00(r8, r3)
            X.8u6 r0 = r4.A04
            if (r0 == 0) goto L_0x01f5
            X.5UU r5 = r4.A0L
            X.3LP r0 = r5.A0G
            boolean r0 = X.C86624Kv.A1X(r8, r0)
            if (r0 == 0) goto L_0x01f8
            X.33p r0 = r5.A0A
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "wac_consent_shown"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 != 0) goto L_0x01f8
            X.2sq r0 = r5.A06
            boolean r0 = X.C86604Kt.A1a(r0, r8)
            r5 = 2131886799(0x7f1202cf, float:1.9408187E38)
            if (r0 == 0) goto L_0x01ce
            r5 = 2131894564(0x7f122124, float:1.9423936E38)
        L_0x01ce:
            X.5P4 r1 = new X.5P4
            r1.<init>()
            r1.A02 = r3
            r0 = 8
            r1.A00 = r0
            r0 = 2131895445(0x7f122495, float:1.9425723E38)
            r1.A07 = r0
            r1.A01 = r5
            r1.A0A = r3
            r0 = 2131887053(0x7f1203cd, float:1.9408702E38)
            r1.A09 = r0
            r0 = 2131887054(0x7f1203ce, float:1.9408704E38)
            r1.A08 = r0
            X.7QG r1 = r1.A00()
        L_0x01f0:
            X.8u6 r0 = r4.A04
            r0.BjX(r1)
        L_0x01f5:
            r6 = 0
            goto L_0x0059
        L_0x01f8:
            X.8u6 r0 = r4.A04
            if (r0 == 0) goto L_0x01f5
            r0.BFg()
            goto L_0x01f5
        L_0x0200:
            X.4uZ r0 = r8.A0H
            boolean r0 = r0 instanceof X.AnonymousClass1fS
            if (r0 != 0) goto L_0x032e
            X.2mi r0 = r4.A0R
            boolean r0 = r0.A02(r9)
            if (r0 != 0) goto L_0x032e
            if (r5 != 0) goto L_0x02f5
            if (r12 == 0) goto L_0x021a
            X.2sD r0 = r4.A0T
            boolean r0 = r0.A06(r9)
            if (r0 == 0) goto L_0x032e
        L_0x021a:
            java.util.ArrayList r0 = r4.A07
            if (r0 != 0) goto L_0x022a
            X.2bE r5 = r4.A0V     // Catch:{ all -> 0x0556 }
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3ZH.A07(r8)     // Catch:{ all -> 0x0556 }
            java.util.ArrayList r0 = r5.A00(r0)     // Catch:{ all -> 0x0556 }
            r4.A07 = r0     // Catch:{ all -> 0x0556 }
        L_0x022a:
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x02b4
            X.30v r5 = r4.A0N
            X.2ss r0 = r5.A07
            X.31A r0 = r0.A0A(r9, r3)
            if (r0 == 0) goto L_0x027f
            int r0 = r0.A0B
            if (r0 != r7) goto L_0x027f
            r7 = 0
        L_0x023f:
            X.4pk r6 = r4.A06
            if (r6 == 0) goto L_0x01f5
            X.07r r5 = r4.A0D
            java.util.ArrayList r10 = r4.A07
            android.view.ViewGroup r1 = r6.A02
            int r0 = X.C86614Ku.A09(r7)
            r1.setVisibility(r0)
            if (r7 == 0) goto L_0x01f5
            android.view.View r1 = r6.A00
            r0 = 2
            X.AnonymousClass54E.A00(r1, r9, r6, r0)
            android.view.View r1 = r6.A01
            r0 = 17
            X.AnonymousClass547.A00(r1, r9, r6, r5, r0)
            android.widget.TextView r9 = r6.A03
            X.33j r8 = r6.A00
            r7 = 2131755160(0x7f100098, float:1.9141191E38)
            int r0 = r10.size()
            long r5 = (long) r0
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()
            int r0 = r10.size()
            X.AnonymousClass000.A1P(r1, r0, r3)
            java.lang.String r0 = r8.A0L(r1, r7, r5)
            r9.setText(r0)
            goto L_0x01f5
        L_0x027f:
            X.2sr r0 = r4.A0G
            boolean r0 = X.C56972sr.A08(r0, r8)
            if (r0 == 0) goto L_0x029c
            boolean r0 = X.C86644Kx.A1Z(r1)
            if (r0 == 0) goto L_0x029c
            X.3Ex r1 = r4.A0J
            X.2sr r0 = r1.A02
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r0)
            X.3ZH r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x029c
            goto L_0x023f
        L_0x029c:
            X.4pk r0 = r4.A06
            if (r0 != 0) goto L_0x023f
            X.07r r0 = r4.A0D
            X.4pk r1 = new X.4pk
            r1.<init>(r0)
            r4.A06 = r1
            X.2bE r0 = r4.A0V
            r1.setup(r5, r0)
            android.widget.ListView r0 = r4.A0C
            r0.addFooterView(r1)
            goto L_0x023f
        L_0x02b4:
            if (r6 == 0) goto L_0x0354
            r4.A00(r8, r3)
            X.8u6 r0 = r4.A04
            if (r0 == 0) goto L_0x01f5
            X.5UU r1 = r4.A0L
            X.4uZ r0 = r8.A0H
            if (r0 == 0) goto L_0x01f5
            X.4uZ r0 = X.AnonymousClass3ZH.A01(r8)
            if (r0 == 0) goto L_0x01f5
            java.lang.String r8 = X.AnonymousClass36P.A06(r0)
            if (r8 == 0) goto L_0x01f5
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x01f5
            X.5P4 r6 = new X.5P4
            r6.<init>()
            r6.A03 = r3
            r6.A00 = r3
            X.07r r0 = r1.A02
            android.content.res.Resources r5 = r0.getResources()
            r1 = 2131894919(0x7f122287, float:1.9424656E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r0 = X.C18320x8.A0b(r5, r8, r0, r3, r1)
            r6.A0C = r0
            X.7QG r1 = r6.A00()
            goto L_0x01f0
        L_0x02f5:
            X.4pl r0 = r4.A05
            if (r0 != 0) goto L_0x0307
            X.07r r0 = r4.A0D
            X.4pl r1 = new X.4pl
            r1.<init>(r0)
            r4.A05 = r1
            android.widget.ListView r0 = r4.A0C
            r0.addFooterView(r1)
        L_0x0307:
            X.4pl r6 = r4.A05
            X.C626936e.A04(r6)
            X.7Dm r1 = r4.A0K
            java.util.Objects.requireNonNull(r1)
            r0 = 8
            X.5sE r5 = X.C117625sE.A00(r1, r0)
            android.view.View r1 = r6.A00
            r0 = 6
            X.C18310x6.A18(r1, r6, r0)
            android.view.View r1 = r6.A01
            r0 = 16
            X.AnonymousClass547.A00(r1, r5, r6, r9, r0)
            android.widget.TextView r1 = r6.A03
            r0 = 2131888198(0x7f120846, float:1.9411025E38)
            r1.setText(r0)
            goto L_0x01f5
        L_0x032e:
            X.4PV r0 = r4.A02
            r1 = 8
            if (r0 == 0) goto L_0x0339
            android.view.View r0 = r0.A00
            r0.setVisibility(r1)
        L_0x0339:
            X.8u6 r0 = r4.A04
            if (r0 == 0) goto L_0x0340
            r0.BFg()
        L_0x0340:
            X.4pk r0 = r4.A06
            if (r0 == 0) goto L_0x0349
            android.view.ViewGroup r0 = r0.A02
            r0.setVisibility(r1)
        L_0x0349:
            X.4pl r0 = r4.A05
            if (r0 == 0) goto L_0x01f5
            android.view.ViewGroup r0 = r0.A02
            r0.setVisibility(r1)
            goto L_0x01f5
        L_0x0354:
            X.2sD r5 = r4.A0T
            X.4uZ r0 = X.C86604Kt.A0a(r8)
            int r6 = r5.A00(r0)
            r0 = -1
            if (r6 != r0) goto L_0x0496
            r4.A00(r8, r3)
            r6 = 1
        L_0x0365:
            r7 = 0
        L_0x0366:
            X.4PV r11 = r4.A02
            if (r11 == 0) goto L_0x03ae
            X.2sr r0 = r4.A0G
            boolean r14 = r0.A0Y()
            android.view.View r12 = r11.A00
            r13 = 0
            r10 = 8
            int r0 = X.C86614Ku.A09(r7)
            r12.setVisibility(r0)
            if (r7 == 0) goto L_0x03ae
            X.2sq r0 = r11.A04
            boolean r7 = X.C86614Ku.A1X(r0, r9)
            r0 = 2131886799(0x7f1202cf, float:1.9408187E38)
            if (r7 == 0) goto L_0x038c
            r0 = 2131894564(0x7f122124, float:1.9423936E38)
        L_0x038c:
            android.widget.TextView r1 = r11.A03
            r1.setText(r0)
            if (r7 != 0) goto L_0x03a0
            X.2ss r0 = r11.A05
            java.lang.String r0 = r0.A0D(r9)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x03a0
            r13 = 1
        L_0x03a0:
            if (r14 == 0) goto L_0x0487
            if (r13 != 0) goto L_0x03ab
            android.widget.TextView r0 = r11.A02
            r0.setVisibility(r10)
        L_0x03a9:
            android.view.View r12 = r11.A01
        L_0x03ab:
            r12.setVisibility(r10)
        L_0x03ae:
            X.8u6 r0 = r4.A04
            if (r0 == 0) goto L_0x0484
            int r16 = r0.getType()
            X.5UU r12 = r4.A0L
            X.4uZ r0 = r8.A0H
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A03(r0)
            if (r1 == 0) goto L_0x047a
            boolean r0 = r8.A0R()
            if (r0 == 0) goto L_0x047a
            X.2rx r0 = r12.A09
            boolean r15 = r0.A03(r1)
        L_0x03cc:
            boolean r14 = X.C86654Ky.A1Y(r8)
            X.2sq r0 = r12.A06
            boolean r1 = X.C86604Kt.A1a(r0, r8)
            X.1VX r13 = r12.A0F
            r0 = 6187(0x182b, float:8.67E-42)
            boolean r0 = r13.A0X(r0)
            r11 = 1
            r10 = 0
            if (r6 == 0) goto L_0x047d
            if (r15 != 0) goto L_0x0476
            if (r0 != 0) goto L_0x0476
            r7 = 2131894564(0x7f122124, float:1.9423936E38)
            if (r1 != 0) goto L_0x044b
        L_0x03eb:
            r7 = 2131886799(0x7f1202cf, float:1.9408187E38)
            if (r15 == 0) goto L_0x044b
            r8 = 2131887160(0x7f120438, float:1.940892E38)
        L_0x03f3:
            boolean r0 = r12.A01
            if (r0 == 0) goto L_0x03fa
            r8 = 2131894488(0x7f1220d8, float:1.9423782E38)
        L_0x03fa:
            if (r16 == 0) goto L_0x03fd
            r11 = 0
        L_0x03fd:
            X.2sr r0 = r12.A05
            boolean r12 = r0.A0Y()
            X.5P4 r1 = new X.5P4
            r1.<init>()
            int r0 = X.C86614Ku.A09(r11)
            r1.A0B = r0
            if (r15 != 0) goto L_0x0416
            if (r14 != 0) goto L_0x0416
            r0 = 8
            if (r12 == 0) goto L_0x0417
        L_0x0416:
            r0 = 0
        L_0x0417:
            r1.A0A = r0
            r1.A02 = r10
            if (r15 != 0) goto L_0x0448
            if (r14 != 0) goto L_0x0448
            if (r12 != 0) goto L_0x0448
        L_0x0421:
            r1.A00 = r10
            r1.A07 = r8
            r1.A01 = r7
            r0 = 2131887053(0x7f1203cd, float:1.9408702E38)
            r1.A09 = r0
            r0 = 2131891266(0x7f121442, float:1.9417247E38)
            r1.A08 = r0
            X.7QG r1 = r1.A00()
            X.8u6 r0 = r4.A04
            r0.BjX(r1)
        L_0x043a:
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x0059
            X.2l2 r14 = r5.A01
            X.2sH r0 = r5.A03
            long r0 = r0.A0H()
            goto L_0x04fd
        L_0x0448:
            r10 = 8
            goto L_0x0421
        L_0x044b:
            int r8 = r8.A08
            r1 = 5263(0x148f, float:7.375E-42)
            if (r8 == r11) goto L_0x0468
            r0 = 2
            if (r8 == r0) goto L_0x0468
            r0 = 3
            if (r8 == r0) goto L_0x0464
            boolean r0 = r13.A0X(r1)
            r8 = 2131893536(0x7f121d20, float:1.9421851E38)
            if (r0 == 0) goto L_0x03f3
            r8 = 2131889392(0x7f120cf0, float:1.9413446E38)
            goto L_0x03f3
        L_0x0464:
            r8 = 2131893537(0x7f121d21, float:1.9421853E38)
            goto L_0x03f3
        L_0x0468:
            boolean r0 = r13.A0X(r1)
            r8 = 2131893538(0x7f121d22, float:1.9421855E38)
            if (r0 == 0) goto L_0x03f3
            r8 = 2131889393(0x7f120cf1, float:1.9413448E38)
            goto L_0x03f3
        L_0x0476:
            if (r1 != 0) goto L_0x047d
            goto L_0x03eb
        L_0x047a:
            r15 = 0
            goto L_0x03cc
        L_0x047d:
            X.8u6 r0 = r4.A04
            if (r0 == 0) goto L_0x0484
            r0.BFg()
        L_0x0484:
            if (r6 == 0) goto L_0x0059
            goto L_0x043a
        L_0x0487:
            if (r13 == 0) goto L_0x03ae
            r1.setVisibility(r10)
            android.widget.TextView r1 = r11.A02
            r0 = 2131886335(0x7f1200ff, float:1.9407246E38)
            r1.setText(r0)
            goto L_0x03a9
        L_0x0496:
            boolean r0 = r5.A06(r9)
            if (r0 == 0) goto L_0x04a3
            r4.A00(r8, r7)
            r6 = 1
            r3 = 1
            goto L_0x0365
        L_0x04a3:
            r6 = 0
            boolean r0 = r8.A0V()
            if (r0 != 0) goto L_0x0365
            X.4uZ r0 = r8.A0H
            boolean r0 = r0 instanceof X.C95804uY
            if (r0 != 0) goto L_0x0365
            if (r10 == 0) goto L_0x04b8
            boolean r0 = r10.booleanValue()
            if (r0 != 0) goto L_0x0365
        L_0x04b8:
            X.2sr r0 = r4.A0G
            boolean r0 = X.C56972sr.A08(r0, r8)
            if (r0 == 0) goto L_0x04c8
            boolean r0 = X.C86644Kx.A1Z(r1)
            if (r0 == 0) goto L_0x04c8
            goto L_0x0366
        L_0x04c8:
            boolean r0 = r9 instanceof X.C27981fH
            if (r0 != 0) goto L_0x0366
            X.4PV r0 = r4.A02
            if (r0 != 0) goto L_0x0366
            X.07r r11 = r4.A0D
            X.4PV r10 = new X.4PV
            r10.<init>(r11)
            r4.A02 = r10
            X.2ss r12 = r4.A0M
            X.4FU r13 = r4.A0F
            X.7Dm r1 = r4.A0K
            java.util.Objects.requireNonNull(r1)
            r0 = 38
            X.5sD r14 = new X.5sD
            r14.<init>((java.lang.Object) r1, (int) r0)
            X.2sq r15 = r4.A0H
            X.64Q r0 = r4.A01
            r16 = r0
            r17 = r8
            r10.setup(r11, r12, r13, r14, r15, r16, r17)
            android.view.ViewGroup r1 = r4.A0A
            X.4PV r0 = r4.A02
            r1.addView(r0, r3)
            goto L_0x0366
        L_0x04fd:
            org.json.JSONObject r8 = r14.A01(r9)     // Catch:{ JSONException -> 0x052f }
            if (r8 == 0) goto L_0x0528
            java.lang.String r11 = "tb_last_shown_ts"
            boolean r7 = r8.has(r11)     // Catch:{ JSONException -> 0x052f }
            if (r7 == 0) goto L_0x051f
            java.lang.String r10 = "tb_last_action_ts"
            boolean r7 = r8.has(r10)     // Catch:{ JSONException -> 0x052f }
            if (r7 == 0) goto L_0x052d
            long r12 = r8.getLong(r11)     // Catch:{ JSONException -> 0x052f }
            long r10 = r8.getLong(r10)     // Catch:{ JSONException -> 0x052f }
            int r7 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x052d
        L_0x051f:
            java.lang.String r7 = "tb_last_shown_ts"
            r8.put(r7, r0)     // Catch:{ JSONException -> 0x052f }
            r14.A02(r9, r8)     // Catch:{ JSONException -> 0x052f }
            goto L_0x0531
        L_0x0528:
            org.json.JSONObject r8 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x052f }
            goto L_0x051f
        L_0x052d:
            r0 = 0
            goto L_0x0532
        L_0x052f:
            r0 = 0
            goto L_0x0532
        L_0x0531:
            r0 = 1
        L_0x0532:
            if (r3 == 0) goto L_0x0059
            if (r0 == 0) goto L_0x0059
            java.lang.Integer r0 = X.AnonymousClass001.A0f()
            X.1Yc r1 = new X.1Yc
            r1.<init>()
            r1.A00 = r0
            r1.A01 = r0
            java.lang.String r0 = r9.getRawString()
            r1.A02 = r0
            X.4FV r0 = r5.A09
            r0.BhD(r1)
            r0.BKX()
            goto L_0x0059
        L_0x0553:
            r12 = 0
            goto L_0x0024
        L_0x0556:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113245l7.A1K():void");
    }

    public final void A1L() {
        AnonymousClass5ZT r2 = this.A5q;
        if (r2 != null) {
            C66513Ls r1 = this.A3D.A01;
            if (r1 instanceof AnonymousClass1Hk) {
                C105845Wq r0 = this.A3S;
                r2.A0C = (AnonymousClass1Hk) r1;
                r2.A0D = r0;
            }
        }
    }

    public final void A1M() {
        C117035rH A002 = this.A2b.A00.A00(C92114m7.class);
        C626936e.A06(A002);
        C92114m7 r2 = (C92114m7) A002;
        r2.A00 = this.A3n;
        boolean A062 = r2.A06();
        boolean A072 = r2.A07();
        if (A062) {
            if (A072) {
                r2.A0A();
            } else {
                r2.A03();
            }
        } else if (A072) {
            r2.A05(false);
        }
    }

    public final void A1N() {
        C92224mI r5 = (C92224mI) this.A2b.A00.A00(C92224mI.class);
        if (r5 != null) {
            AnonymousClass3ZH r7 = this.A3n;
            r5.A01 = r7;
            C49792h6 r6 = r5.A08;
            AnonymousClass31A A0A2 = r6.A02.A0A(AnonymousClass3ZH.A02(r7, UserJid.class), false);
            if (A0A2 != null && A0A2.A0C != -1) {
                AnonymousClass0x7.A1B(new C990654h(r5, r6, r7), r5.A0A);
            } else if (r5.A07()) {
                r5.A05(true);
            }
        }
    }

    public final void A1O() {
        if (this.A3n.A0T() && this.A41.A0X(5587)) {
            this.A1Z.A0S(C117615sD.A00(this, 14));
        }
    }

    public void A1P(int i) {
        C626936e.A06(this.A2z.getReactionsTrayViewModel());
        if (i == 2) {
            if (A2X()) {
                if (this.A40 == null) {
                    A1B();
                }
                this.A1a.post(C117615sD.A00(this, 27));
                return;
            }
            C94264qq r0 = this.A45;
            if (r0 != null) {
                r0.A0H(0);
                this.A0D.setVisibility(8);
                this.A1Z.A0S(C117615sD.A00(this, 28));
            }
        } else if (i == 0 && !this.A37.A0F()) {
            if (A2X()) {
                EmojiSearchKeyboardContainer emojiSearchKeyboardContainer = this.A3v;
                if (emojiSearchKeyboardContainer != null) {
                    emojiSearchKeyboardContainer.A00();
                }
            } else {
                C94294qu r02 = this.A46;
                if (r02 != null && r02.A02()) {
                    this.A46.A01(false);
                }
            }
            this.A0D.setVisibility(0);
        }
    }

    public void A1Q(int i) {
        AnonymousClass5KV r0 = this.A2c;
        C620733j r2 = r0.A05;
        View view = r0.A02;
        AnonymousClass4M8.A00(AnonymousClass0x7.A0J(view.getContext(), r2, i), view);
    }

    public final void A1R(int i) {
        int height;
        BottomSheetBehavior bottomSheetBehavior = this.A0t;
        if (bottomSheetBehavior != null && bottomSheetBehavior.A0O != 5 && this.A1a != null && this.A0V != null) {
            ExpressionsBottomSheetView expressionsBottomSheetView = this.A40;
            if ((expressionsBottomSheetView == null || expressionsBottomSheetView.getVisibility() != 8) && (height = this.A0V.getHeight()) > 0) {
                ViewGroup.LayoutParams layoutParams = this.A1a.getLayoutParams();
                layoutParams.height = (int) ((float) (height - i));
                this.A1a.requestLayout();
            }
        }
    }

    public final void A1S(int i) {
        List singletonList;
        A0v();
        C106735a4 r1 = this.A51;
        int i2 = i;
        if (r1 != null && i2 == r1.A0I) {
            return;
        }
        if (!C107535bT.A03() || !this.A2E.A04()) {
            this.A5k.A01();
            C112545ju r9 = new C112545ju(this);
            C95814uZ r12 = this.A4J;
            if (r12 == null) {
                singletonList = Collections.emptyList();
            } else {
                singletonList = Collections.singletonList(r12);
            }
            AnonymousClass5D8 r3 = this.A1B;
            C89644eZ A092 = A09(this);
            ViewGroup A0I2 = C86644Kx.A0I(this.A1a, R.id.push_to_video_root_view);
            View A022 = C06560Yg.A02(this.A1a, R.id.buttons);
            View A023 = C06560Yg.A02(this.A1a, R.id.entry);
            View A024 = C06560Yg.A02(this.A1a, R.id.input_layout_content);
            C624134x r10 = this.A3B.A0G;
            C118075sx r32 = r3.A00;
            C64333Db r13 = r32.A03;
            C54292oU A2q2 = C64333Db.A2q(r13);
            C56612sH A2p2 = C64333Db.A2p(r13);
            AnonymousClass1VX A4B2 = C64333Db.A4B(r13);
            C69263Wi A042 = C64333Db.A04(r13);
            C55682qk A012 = C64333Db.A01(r13);
            AnonymousClass5Ul A0L2 = C86644Kx.A0L(r13);
            AnonymousClass4FS A8y = C64333Db.A8y(r13);
            AnonymousClass4FV A4H2 = C64333Db.A4H(r13);
            C107695bk r2 = r13.A00;
            C620633i A2o2 = C64333Db.A2o(r13);
            C620733j A2t2 = C64333Db.A2t(r13);
            C56512s6 A182 = C86664Kz.A18(r13);
            AnonymousClass33p A2s2 = C64333Db.A2s(r13);
            AnonymousClass5ZR A2r2 = C64333Db.A2r(r13);
            C60152y5 A742 = C64333Db.A74(r13);
            C88834as r14 = r32.A01;
            this.A51 = new C106735a4(A022, A023, A024, A0I2, A012, (AnonymousClass5D9) r14.A0y.get(), (AnonymousClass5DA) r14.A0z.get(), A092, (C64393Dh) r13.AS1.get(), A042, A0L2, (AnonymousClass5TW) r13.ASQ.get(), r9, A182, A2o2, A2p2, A2q2, A2r2, A2s2, A2t2, (C61072zf) r13.AXI.get(), (C106965aS) r2.ABl.get(), A4B2, A4H2, A742, r10, A8y, (C97094xc) r2.A29.get(), singletonList, i2);
            return;
        }
        this.A1Z.A0H(R.string.f11nameremoved, 1);
    }

    public final void A1V(int i) {
        int A002;
        View view;
        if (i == 0) {
            A002 = this.A2O.getBackgroundColorRes();
        } else if (C107385bE.A02() || !C1001059l.A03) {
            ViewGroup viewGroup = this.A0Y;
            if (viewGroup == null || viewGroup.getVisibility() != 0) {
                A002 = AnonymousClass34K.A00(A09(this));
            } else {
                A002 = R.color.f5nameremoved;
            }
        } else {
            A002 = R.color.f5nameremoved;
        }
        int A042 = AnonymousClass0Y8.A04(A09(this), A002);
        if (!this.A4E.A0E() || (view = this.A0Q) == null) {
            AnonymousClass5CQ.A00(A03(this), A042, true);
        } else {
            view.setBackgroundColor(A042);
        }
    }

    public final void A1X(int i) {
        View view = this.A0S;
        if (view != null) {
            C107555bV.A07(view, this.A3L, view.getPaddingLeft(), this.A0S.getPaddingTop(), this.A0S.getPaddingRight(), i);
        }
    }

    public final void A1Z(long j, boolean z, boolean z2) {
        AnonymousClass3ZH A042;
        AnonymousClass676 r0 = this.A2z;
        if (z2) {
            A042 = C56972sr.A01(r0.getMeManager());
        } else {
            A042 = r0.getContactManager().A04(j);
        }
        if (A042 != null) {
            A1s(A042, C86604Kt.A0a(A042), z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f A[SYNTHETIC, Splitter:B:14:0x002f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1a(android.app.assist.AssistContent r5) {
        /*
            r4 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x002e
            X.4uZ r3 = r4.A4J
            boolean r0 = X.C18280x3.A1U(r1, r0)
            X.C626936e.A0B(r0)
            java.lang.String r1 = "Invalid"
            if (r3 == 0) goto L_0x0049
            boolean r0 = X.C627336j.A0K(r3)
            if (r0 != 0) goto L_0x0046
            boolean r0 = r3 instanceof X.AnonymousClass1fS
            if (r0 != 0) goto L_0x0046
            boolean r0 = r3 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0049
            java.lang.String r2 = "Individual"
        L_0x0023:
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = "conversation/provide-assist-content/invalid-conversation-id"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x002e:
            return
        L_0x002f:
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x0053 }
            java.lang.String r0 = "conversation_type"
            org.json.JSONObject r2 = r1.put(r0, r2)     // Catch:{ JSONException -> 0x0053 }
            java.lang.String r1 = "conversation_id"
            java.lang.String r0 = X.C18300x5.A0i(r3)     // Catch:{ JSONException -> 0x0053 }
            org.json.JSONObject r0 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x0053 }
            if (r0 == 0) goto L_0x002e
            goto L_0x004b
        L_0x0046:
            java.lang.String r2 = "Group"
            goto L_0x0023
        L_0x0049:
            r2 = r1
            goto L_0x0023
        L_0x004b:
            java.lang.String r0 = r0.toString()
            r5.setStructuredData(r0)
            return
        L_0x0053:
            r1 = move-exception
            java.lang.String r0 = "assistant-utils/get-conversation-structured-data/exception"
            com.whatsapp.util.Log.i(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113245l7.A1a(android.app.assist.AssistContent):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        r1 = r5.A2a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1b(android.content.res.Configuration r6) {
        /*
            r5 = this;
            com.whatsapp.conversation.ConversationListView r1 = r5.A2f
            if (r1 == 0) goto L_0x0016
            boolean r0 = r1.A0K
            if (r0 == 0) goto L_0x01a4
            r0 = 2
            r1.setTranscriptMode(r0)
            android.os.Handler r3 = r1.A0S
            if (r3 == 0) goto L_0x0016
            r2 = 0
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.sendEmptyMessageDelayed(r2, r0)
        L_0x0016:
            X.66v r2 = r5.A5l
            if (r2 == 0) goto L_0x0028
            int r1 = r6.orientation
            r2.Bm5(r1)
            boolean r0 = r2.B8M()
            if (r0 != 0) goto L_0x0028
            r2.Bmk(r1)
        L_0x0028:
            X.4fS r0 = r5.A2a
            if (r0 == 0) goto L_0x004b
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x004b
            X.676 r0 = r5.A2z
            boolean r0 = r0.isInMultiWindowMode()
            if (r0 == 0) goto L_0x004b
            X.4fS r1 = r5.A2a
            X.4Rp r0 = r1.A01
            if (r0 == 0) goto L_0x004b
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x004b
            X.4Rp r0 = r1.A01
            r0.A03()
        L_0x004b:
            X.5ZT r1 = r5.A5q
            if (r1 == 0) goto L_0x0061
            X.5qb r4 = r1.A1D
            java.util.List r0 = r4.A0L
            r0.clear()
            java.io.File r3 = r1.A0N
            if (r3 == 0) goto L_0x0061
            X.5ZQ r2 = r1.A0K
            r1 = 0
            r0 = 1
            r4.A02(r2, r3, r1, r0)
        L_0x0061:
            com.whatsapp.mentions.MentionableEntry r4 = r5.A4P
            r3 = 1
            if (r4 == 0) goto L_0x0084
            int r0 = r6.orientation
            if (r0 != r3) goto L_0x0175
            android.content.Context r0 = r4.getContext()
            float r2 = X.C86604Kt.A00(r0)
            r0 = 1069547520(0x3fc00000, float:1.5)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r1 = 6
            if (r0 >= 0) goto L_0x0081
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r1 = 4
            if (r0 < 0) goto L_0x0081
            r1 = 5
        L_0x0081:
            r4.setMaxLines(r1)
        L_0x0084:
            X.5RH r4 = r5.A3T
            if (r4 == 0) goto L_0x009e
            boolean r0 = r4.A0E
            if (r0 == 0) goto L_0x009e
            int r0 = r6.orientation
            r2 = 2
            boolean r1 = X.AnonymousClass000.A1U(r0, r2)
            r4.A0D = r1
            int r0 = r4.A0H
            if (r0 != r2) goto L_0x009e
            if (r1 == 0) goto L_0x009e
            r4.A00()
        L_0x009e:
            X.4VQ r4 = r5.A3B
            if (r4 == 0) goto L_0x00bf
            android.graphics.Point r1 = X.AnonymousClass4L0.A07()
            X.4eZ r0 = A09(r5)
            X.C86604Kt.A0x(r0, r1)
            int r0 = r1.y
            int r2 = r0 * 2
            android.content.res.Resources r1 = A02(r5)
            r0 = 2131166063(0x7f07036f, float:1.794636E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r2 = r2 / r0
            r4.A00 = r2
        L_0x00bf:
            X.4xi r1 = r5.A4E
            X.4eZ r0 = A09(r5)
            r1.A0A(r0)
            X.4xi r0 = r5.A4E
            boolean r2 = r0.A0F()
            int r1 = r6.screenWidthDp
            int r0 = r5.A01
            if (r1 == r0) goto L_0x0117
            r5.A01 = r1
            boolean r0 = r5.A6K
            if (r2 == r0) goto L_0x0117
            r5.A6K = r2
            if (r2 == 0) goto L_0x0117
            android.content.Intent r1 = A01(r5)
            X.4eZ r0 = A09(r5)
            X.C86624Kv.A1O(r0, r3, r1)
            android.content.Intent r2 = X.C627736r.A02(r0)
            android.net.Uri r0 = r1.getData()
            r2.setData(r0)
            r2.putExtras(r1)
            java.lang.String r1 = "primary_container_class"
            java.lang.String r0 = "com.whatsapp.HomeActivity"
            r2.putExtra(r1, r0)
            java.lang.String r1 = "secondary_container_class"
            java.lang.String r0 = "com.whatsapp.Conversation"
            r2.putExtra(r1, r0)
            android.view.Window r1 = A03(r5)
            r0 = 0
            X.C86644Kx.A17(r1, r0)
            X.676 r0 = r5.A2z
            r0.startActivity(r2)
            X.676 r0 = r5.A2z
            r0.finish()
        L_0x0117:
            android.widget.LinearLayout r2 = r5.A0k
            if (r2 == 0) goto L_0x0128
            boolean r0 = r5.A6K
            if (r0 == 0) goto L_0x0128
            r1 = 3
            X.691 r0 = new X.691
            r0.<init>((X.C113245l7) r5, (int) r1)
            r2.addOnLayoutChangeListener(r0)
        L_0x0128:
            boolean r0 = r5.A2X()
            if (r0 == 0) goto L_0x013f
            android.view.ViewGroup r0 = r5.A0V
            if (r0 == 0) goto L_0x013f
            android.view.ViewTreeObserver r2 = r0.getViewTreeObserver()
            r1 = 0
            X.6BP r0 = new X.6BP
            r0.<init>(r1, r5, r3)
            r2.addOnGlobalLayoutListener(r0)
        L_0x013f:
            X.4fR r3 = r5.A2Z
            if (r3 == 0) goto L_0x0159
            boolean r0 = r3 instanceof X.C92134m9
            if (r0 == 0) goto L_0x0157
            int r1 = r6.orientation
            r0 = 2
            if (r1 != r0) goto L_0x0157
            android.view.ViewGroup r2 = r3.A06
            r1 = 5
            X.5rQ r0 = new X.5rQ
            r0.<init>(r3, r1)
            r2.post(r0)
        L_0x0157:
            r3.A00 = r6
        L_0x0159:
            X.66o r1 = X.AnonymousClass5KY.A00(r5)
            X.4uZ r0 = r5.A4J
            boolean r0 = r1.BH4(r0)
            if (r0 == 0) goto L_0x0174
            X.66o r3 = X.AnonymousClass5KY.A00(r5)
            com.whatsapp.conversation.ConversationListView r2 = r5.A2f
            X.3ZH r1 = r5.A3n
            android.view.Window r0 = A03(r5)
            r3.BhO(r6, r0, r2, r1)
        L_0x0174:
            return
        L_0x0175:
            r0 = 2
            r4.setMaxLines(r0)
            X.66v r1 = r5.A5l
            if (r1 == 0) goto L_0x0191
            boolean r0 = r1.B8N()
            if (r0 == 0) goto L_0x0191
            boolean r0 = r1.B8M()
            if (r0 != 0) goto L_0x0191
            r1.B2a()
            X.66v r0 = r5.A5l
            r0.Bmk(r3)
        L_0x0191:
            X.5ZT r0 = r5.A5q
            if (r0 == 0) goto L_0x0084
            X.5qb r0 = r0.A1D
            android.view.ViewGroup r0 = r0.A0B
            boolean r0 = X.C86604Kt.A1Y(r0)
            if (r0 == 0) goto L_0x0084
            r5.A0e()
            goto L_0x0084
        L_0x01a4:
            int r0 = r1.A00
            r1.setSelection(r0)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113245l7.A1b(android.content.res.Configuration):void");
    }

    public final void A1f(View view) {
        int height;
        ViewGroup viewGroup = this.A0V;
        if (viewGroup != null && (height = viewGroup.getHeight()) > 0) {
            A1R((int) (((float) height) - view.getY()));
        }
    }

    public final void A1l(C108985dt r8) {
        String str;
        UserJid A072;
        if (r8 != null || ((A072 = AnonymousClass3ZH.A07(this.A3n)) != null && (r8 = this.A2z.getBusinessProfileManager().A02(A072)) != null)) {
            AnonymousClass2Z2 r3 = this.A5t;
            int i = r8.A00;
            r3.A00(r3.A00, 5, i);
            this.A5x.get();
            C89644eZ A092 = A09(this);
            C162457s7.A0J(A092, 0);
            if (i == 1) {
                str = "com.bloks.www.whatsapp.ai.biz.consent";
            } else {
                str = "com.bloks.www.whatsapp.ai.biz.third_party_consent";
            }
            Intent A073 = C18320x8.A07();
            A073.setClassName(A092, "com.whatsapp.wabloks.ui.WaBloksBottomSheetActivity");
            A073.putExtra("screen_name", str);
            A073.putExtra("screen_params", (String) null);
            A073.putExtra("is_async_component", false);
            A073.putExtra("restore_saved_instance", true);
            A09(this).BpY(A073, 120);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0030, code lost:
        if (r13.A07 == null) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1n(X.AnonymousClass5R9 r13) {
        /*
            r12 = this;
            X.3ZH r8 = r13.A05
            r12.A3n = r8
            X.5dt r0 = r13.A04
            r12.A2P = r0
            r12.A1K()
            com.whatsapp.TextEmojiLabel r0 = r12.A1j
            r2 = 17
            r0.setGravity(r2)
            android.widget.ImageView r0 = r12.A0i
            r5 = 8
            r0.setVisibility(r5)
            android.widget.ImageView r0 = r12.A0j
            r0.setVisibility(r5)
            com.whatsapp.wds.components.button.WDSButton r0 = r12.A5v
            r0.setVisibility(r5)
            boolean r0 = r13.A0G
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0032
            X.3ZH r0 = r13.A06
            if (r0 == 0) goto L_0x0032
            X.1fJ r0 = r13.A07
            r9 = 1
            if (r0 != 0) goto L_0x0033
        L_0x0032:
            r9 = 0
        L_0x0033:
            X.1fJ r7 = r13.A07
            if (r7 == 0) goto L_0x003f
            com.whatsapp.community.ConversationCommunityViewModel r6 = r12.A2L
            X.4FS r1 = r6.A07
            r0 = 3
            X.C70193a6.A01(r1, r6, r7, r0)
        L_0x003f:
            boolean r0 = r13.A09
            java.lang.String r7 = "learn-more"
            if (r0 == 0) goto L_0x00f8
            android.view.View r0 = r12.A0D
            r0.setVisibility(r5)
            r12.A0x()
            com.whatsapp.TextEmojiLabel r0 = r12.A1j
            r0.setVisibility(r4)
            android.view.View r0 = r12.A0I
            r0.setVisibility(r4)
            X.3ZH r0 = r12.A3n
            boolean r0 = r0.A0j
            if (r0 == 0) goto L_0x00ab
            com.whatsapp.TextEmojiLabel r2 = r12.A1j
            r1 = 2131887445(0x7f120555, float:1.9409497E38)
        L_0x0062:
            r2.setText(r1)
        L_0x0065:
            com.whatsapp.TextEmojiLabel r0 = r12.A1j
            r0.setClickable(r4)
        L_0x006a:
            android.view.View r0 = r12.A0I
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0093
            X.5RI r1 = r12.A31
            X.8u6 r0 = r1.A04
            boolean r0 = r0 instanceof X.C94074po
            if (r0 == 0) goto L_0x0093
            android.view.ViewGroup r3 = r1.A0B
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x0093
            android.widget.FrameLayout$LayoutParams r2 = X.C86664Kz.A0r(r3)
            X.07r r1 = r1.A0D
            r0 = 1082130432(0x40800000, float:4.0)
            int r0 = X.AnonymousClass5YI.A04(r1, r0)
            r2.bottomMargin = r0
            r3.setLayoutParams(r2)
        L_0x0093:
            android.view.View r0 = r12.A0D
            int r0 = r0.getVisibility()
            if (r0 != r5) goto L_0x03f3
            X.676 r0 = r12.A2z
            boolean r0 = r0.BIc()
            if (r0 != 0) goto L_0x03f3
            r12.A0e()
            r12.A2T()
            goto L_0x03f3
        L_0x00ab:
            boolean r0 = r13.A0F
            if (r0 == 0) goto L_0x00b5
            com.whatsapp.TextEmojiLabel r0 = r12.A1j
            r12.A1j(r0, r3)
            goto L_0x0065
        L_0x00b5:
            boolean r0 = r13.A0B
            if (r0 == 0) goto L_0x00ea
            X.676 r0 = r12.A2z
            X.5a2 r8 = r0.getLinkifier()
            com.whatsapp.TextEmojiLabel r0 = r12.A1j
            android.content.Context r6 = r0.getContext()
            X.676 r2 = r12.A2z
            r1 = 2131894178(0x7f121fa2, float:1.9423153E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r7
            java.lang.String r1 = r2.getString(r1, r0)
            r0 = 30
            X.5sD r0 = X.C117615sD.A00(r12, r0)
            android.text.SpannableStringBuilder r1 = r8.A05(r6, r0, r1, r7)
            com.whatsapp.TextEmojiLabel r0 = r12.A1j
            r0.setText(r1)
            com.whatsapp.TextEmojiLabel r1 = r12.A1j
            X.1VX r0 = r12.A41
            X.C18270x1.A0q(r1, r0)
            goto L_0x0065
        L_0x00ea:
            int r0 = r13.A00
            com.whatsapp.TextEmojiLabel r2 = r12.A1j
            r1 = 2131887447(0x7f120557, float:1.9409501E38)
            if (r0 != r3) goto L_0x0062
            r1 = 2131888449(0x7f120941, float:1.9411534E38)
            goto L_0x0062
        L_0x00f8:
            boolean r0 = r13.A0H
            if (r0 == 0) goto L_0x0146
            android.view.View r0 = r12.A0D
            r0.setVisibility(r5)
            com.whatsapp.TextEmojiLabel r0 = r12.A1j
            r0.setVisibility(r5)
            android.view.View r0 = r12.A0I
            r0.setVisibility(r5)
            com.whatsapp.TextEmojiLabel r0 = r12.A1i
            r0.setVisibility(r4)
            boolean r0 = r12.A2Q()
            if (r0 == 0) goto L_0x011e
            X.5ZT r0 = r12.A5q
            X.C626936e.A06(r0)
            r0.A0S(r4, r4)
        L_0x011e:
            com.whatsapp.TextEmojiLabel r1 = r12.A1i
            r0 = 2131888334(0x7f1208ce, float:1.94113E38)
            r1.setText(r0)
            com.whatsapp.countrygating.viewmodel.CountryGatingViewModel r0 = r12.A3M
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x006a
            X.4eZ r0 = A09(r12)
            X.0zH r1 = X.AnonymousClass5V0.A00(r0)
            r0 = 2131888335(0x7f1208cf, float:1.9411302E38)
            r1.A0T(r0)
            X.C19340zH.A06(r1)
            X.C18280x3.A0q(r1)
            com.whatsapp.countrygating.viewmodel.CountryGatingViewModel r0 = r12.A3M
            r0.A00 = r3
            goto L_0x006a
        L_0x0146:
            boolean r0 = r13.A0I
            if (r0 == 0) goto L_0x01bd
            android.view.View r0 = r12.A0D
            r0.setVisibility(r5)
            com.whatsapp.TextEmojiLabel r0 = r12.A1j
            r0.setVisibility(r5)
            android.view.View r0 = r12.A0I
            r0.setVisibility(r5)
            com.whatsapp.TextEmojiLabel r1 = r12.A1i
            X.1VX r0 = r12.A41
            X.AnonymousClass0x2.A14(r0, r1)
            com.whatsapp.TextEmojiLabel r0 = r12.A1i
            r0.setVisibility(r4)
            boolean r0 = r12.A2Q()
            if (r0 == 0) goto L_0x0173
            X.5ZT r0 = r12.A5q
            X.C626936e.A06(r0)
            r0.A0S(r4, r4)
        L_0x0173:
            X.676 r1 = r12.A2z
            r0 = 2131894366(0x7f12205e, float:1.9423535E38)
            java.lang.String r0 = r1.getString(r0)
            android.text.SpannableStringBuilder r7 = X.C18330xA.A00(r0)
            X.4eZ r1 = A09(r12)
            r0 = 3
            X.67t r2 = new X.67t
            r2.<init>(r1, r12, r0)
            int r1 = r7.length()
            r0 = 33
            r7.setSpan(r2, r4, r1, r0)
            X.676 r0 = r12.A2z
            X.2sr r0 = r0.getMeManager()
            boolean r6 = r0.A0Y()
            com.whatsapp.TextEmojiLabel r2 = r12.A1i
            X.676 r1 = r12.A2z
            r0 = 2131894357(0x7f122055, float:1.9423516E38)
            if (r6 == 0) goto L_0x01a9
            r0 = 2131894358(0x7f122056, float:1.9423519E38)
        L_0x01a9:
            java.lang.String r1 = r1.getString(r0)
            android.text.Spannable[] r0 = new android.text.Spannable[r3]
            r0[r4] = r7
            android.text.SpannableStringBuilder r0 = X.C107635bd.A03(r1, r0)
            r2.setText(r0)
            r12.A2P(r4)
            goto L_0x006a
        L_0x01bd:
            boolean r0 = r13.A0E
            if (r0 == 0) goto L_0x039d
            r6 = 3
            if (r9 == 0) goto L_0x01d2
            int r0 = r13.A01
            if (r0 != r6) goto L_0x0230
            com.whatsapp.TextEmojiLabel r0 = r12.A1j
            r0.setGravity(r2)
        L_0x01cd:
            android.view.View r0 = r12.A0I
            X.AnonymousClass54E.A00(r0, r13, r12, r4)
        L_0x01d2:
            android.view.View r0 = r12.A0D
            r0.setVisibility(r5)
            r12.A0x()
            boolean r0 = r12.A2Q()
            if (r0 == 0) goto L_0x01e8
            X.5ZT r0 = r12.A5q
            X.C626936e.A06(r0)
            r0.A0S(r4, r4)
        L_0x01e8:
            android.view.View r0 = r12.A0I
            r0.setVisibility(r4)
            com.whatsapp.TextEmojiLabel r0 = r12.A1j
            r0.setVisibility(r4)
            if (r9 == 0) goto L_0x0259
            int r0 = r13.A01
            if (r0 != r6) goto L_0x0259
            X.676 r0 = r12.A2z
            X.5a2 r8 = r0.getLinkifier()
            com.whatsapp.TextEmojiLabel r0 = r12.A1j
            android.content.Context r6 = r0.getContext()
            X.676 r2 = r12.A2z
            r1 = 2131889780(0x7f120e74, float:1.9414233E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r7
            java.lang.String r1 = r2.getString(r1, r0)
            r0 = 31
            X.5sD r0 = X.C117615sD.A00(r12, r0)
            android.text.SpannableStringBuilder r1 = r8.A05(r6, r0, r1, r7)
            com.whatsapp.TextEmojiLabel r0 = r12.A1j
            r0.setText(r1)
            com.whatsapp.TextEmojiLabel r1 = r12.A1j
            X.1VX r0 = r12.A41
            X.C18270x1.A0q(r1, r0)
            com.whatsapp.TextEmojiLabel r1 = r12.A1j
            X.33i r0 = r12.A3G
            X.AnonymousClass0x2.A12(r1, r0)
            goto L_0x006a
        L_0x0230:
            com.whatsapp.TextEmojiLabel r1 = r12.A1j
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r1.setGravity(r0)
            X.3ZH r2 = r13.A06
            android.widget.ImageView r0 = r12.A0j
            r0.setVisibility(r4)
            android.widget.ImageView r0 = r12.A0i
            r0.setVisibility(r4)
            X.676 r0 = r12.A2z
            X.5Tv r1 = r0.getConversationRowInflater()
            X.4eZ r0 = r0.getActivity()
            X.5Uq r1 = r1.A01(r0)
            android.widget.ImageView r0 = r12.A0j
            r1.A08(r0, r2)
            goto L_0x01cd
        L_0x0259:
            X.3ZH r1 = r12.A3n
            X.4uZ r0 = r1.A0H
            boolean r0 = r0 instanceof X.C95804uY
            if (r0 == 0) goto L_0x030a
            boolean r0 = r13.A0D
            if (r0 == 0) goto L_0x0269
            boolean r0 = r13.A0C
            if (r0 != 0) goto L_0x030a
        L_0x0269:
            com.whatsapp.TextEmojiLabel r0 = r12.A1j
            r0.setVisibility(r5)
            X.5JE r7 = r12.A2y
            X.3ZH r1 = r12.A3n
            java.lang.Class<X.4uY> r0 = X.C95804uY.class
            X.4uZ r10 = X.AnonymousClass3ZH.A02(r1, r0)
            android.view.View r6 = r12.A0I
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            X.C162457s7.A0J(r10, r4)
            X.C162457s7.A0J(r6, r3)
            boolean r0 = r7.A00
            if (r0 != 0) goto L_0x029a
            X.5m4 r2 = r7.A01
            X.5Rp r0 = r2.A01(r10)
            if (r0 == 0) goto L_0x02a1
            X.1RL r0 = r0.A00
            X.21q r1 = r0.A07
            X.21q r0 = X.C372821q.GUEST
            boolean r0 = X.AnonymousClass000.A1Y(r1, r0)
            if (r0 != 0) goto L_0x02a1
        L_0x029a:
            r6.setVisibility(r5)
            r7.A00 = r3
            goto L_0x006a
        L_0x02a1:
            java.lang.ref.WeakReference r0 = r7.A03
            java.lang.Object r9 = r0.get()
            X.00M r9 = (X.AnonymousClass00M) r9
            if (r9 == 0) goto L_0x006a
            X.08M r2 = r2.A00
            r1 = 2
            X.921 r0 = new X.921
            r0.<init>(r10, r1)
            X.0Wx r2 = X.C05110Rz.A00(r0, r2)
            X.62x r1 = new X.62x
            r1.<init>(r6, r7)
            r0 = 221(0xdd, float:3.1E-43)
            X.C86604Kt.A1N(r9, r2, r1, r0)
            r6.setVisibility(r4)
            r0 = 2131431775(0x7f0b115f, float:1.8485289E38)
            android.view.ViewStub r0 = X.C86664Kz.A0n(r6, r0)
            if (r0 == 0) goto L_0x02d0
            r0.inflate()
        L_0x02d0:
            r0 = 2131432622(0x7f0b14ae, float:1.8487007E38)
            android.widget.TextView r8 = X.AnonymousClass002.A09(r6, r0)
            if (r8 == 0) goto L_0x02fa
            r0 = 2131891104(0x7f1213a0, float:1.9416919E38)
            java.lang.String r2 = X.C18290x4.A0l(r9, r0)
            r0 = 2131100319(0x7f06029f, float:1.7813016E38)
            java.lang.String r1 = X.C107575bX.A04(r9, r0)
            X.C162457s7.A0D(r1)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r1
            android.text.Spanned r0 = X.C107575bX.A02(r2, r0)
            r8.setText(r0)
            r0 = 41
            X.C109725f5.A00(r8, r9, r7, r10, r0)
        L_0x02fa:
            r0 = 2131428799(0x7f0b05bf, float:1.8479253E38)
            android.view.View r1 = r6.findViewById(r0)
            if (r1 == 0) goto L_0x006a
            r0 = 36
            X.C109475eg.A00(r1, r7, r6, r0)
            goto L_0x006a
        L_0x030a:
            boolean r0 = r1.A0T()
            if (r0 == 0) goto L_0x036e
            X.1VX r0 = r12.A41
            boolean r0 = X.AnonymousClass75P.A00(r0)
            if (r0 != 0) goto L_0x036e
            X.5Kh r8 = r12.A2x
            X.4eZ r11 = A09(r12)
            com.whatsapp.TextEmojiLabel r7 = r12.A1j
            X.C162457s7.A0J(r11, r4)
            X.C162457s7.A0J(r7, r3)
            X.1VX r6 = r8.A06
            r0 = 5985(0x1761, float:8.387E-42)
            int r1 = r6.A0N(r0)
            X.591 r0 = X.AnonymousClass591.COUNTRY_DISABLED
            int r0 = r0.value
            if (r1 != r0) goto L_0x033c
            r0 = 2131886975(0x7f12037f, float:1.9408544E38)
            r7.setText(r0)
            goto L_0x006a
        L_0x033c:
            r10 = 2131886974(0x7f12037e, float:1.9408542E38)
            java.lang.Object[] r9 = new java.lang.Object[r3]
            X.2i5 r0 = r8.A01
            android.net.Uri r2 = r0.A00()
            r1 = 2131886976(0x7f120380, float:1.9408546E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            X.AnonymousClass0x7.A1E(r2, r0, r4)
            java.lang.String r0 = r11.getString(r1, r0)
            java.lang.String r2 = X.C18300x5.A0e(r11, r0, r9, r4, r10)
            X.5a2 r1 = r8.A07
            android.content.Context r0 = r7.getContext()
            android.text.SpannableString r0 = r1.A03(r0, r2)
            r7.setText(r0)
            X.C18270x1.A0q(r7, r6)
            X.33i r0 = r8.A05
            X.AnonymousClass0x2.A12(r7, r0)
            goto L_0x006a
        L_0x036e:
            X.1VX r1 = r12.A41
            r0 = 6187(0x182b, float:8.67E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0387
            X.2sq r1 = r12.A27
            X.3ZH r0 = r12.A3n
            boolean r0 = X.C86604Kt.A1a(r1, r0)
            if (r0 == 0) goto L_0x0387
            r12.A1D()
            goto L_0x006a
        L_0x0387:
            com.whatsapp.TextEmojiLabel r6 = r12.A1j
            boolean r2 = r13.A0F
            int r1 = r13.A00
            boolean r0 = X.AnonymousClass000.A1U(r1, r3)
            r12.A1k(r6, r2, r0)
            if (r1 == r3) goto L_0x006a
            com.whatsapp.TextEmojiLabel r0 = r12.A1j
            X.AnonymousClass54E.A00(r0, r13, r12, r3)
            goto L_0x006a
        L_0x039d:
            com.whatsapp.jid.UserJid r0 = r13.A08
            if (r0 == 0) goto L_0x03e3
            X.676 r0 = r12.A2z
            X.5a2 r7 = r0.getLinkifier()
            com.whatsapp.TextEmojiLabel r0 = r12.A1j
            android.content.Context r6 = r0.getContext()
            X.676 r2 = r12.A2z
            r1 = 2131892653(0x7f1219ad, float:1.942006E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r3 = "redirect-chat"
            r0[r4] = r3
            java.lang.String r2 = r2.getString(r1, r0)
            r1 = 2
            X.5rT r0 = new X.5rT
            r0.<init>(r12, r1, r13)
            android.text.SpannableStringBuilder r1 = r7.A05(r6, r0, r2, r3)
            com.whatsapp.TextEmojiLabel r0 = r12.A1j
            r0.setText(r1)
            com.whatsapp.TextEmojiLabel r1 = r12.A1j
            X.1VX r0 = r12.A41
            X.C18270x1.A0q(r1, r0)
            android.view.View r0 = r12.A0D
            r0.setVisibility(r5)
            android.view.View r0 = r12.A0I
            r0.setVisibility(r4)
            com.whatsapp.TextEmojiLabel r0 = r12.A1j
            r0.setVisibility(r4)
            goto L_0x006a
        L_0x03e3:
            boolean r0 = r8.A0T()
            if (r0 == 0) goto L_0x03ee
            r12.A1O()
            goto L_0x006a
        L_0x03ee:
            r12.A17()
            goto L_0x006a
        L_0x03f3:
            r12.A1M()     // Catch:{ all -> 0x05d2 }
            int r3 = r13.A03
            X.5PZ r0 = r12.A2b
            java.lang.Class<X.4mH> r1 = X.C92214mH.class
            X.5WZ r0 = r0.A00
            X.5rH r2 = r0.A00(r1)
            X.4mH r2 = (X.C92214mH) r2
            if (r2 == 0) goto L_0x042b
            X.3ZH r1 = r12.A3n
            r2.A00 = r3
            boolean r0 = r1.A0U()
            if (r0 == 0) goto L_0x05cf
            com.whatsapp.jid.Jid r0 = X.AnonymousClass3ZH.A04(r1)
            X.1fJ r0 = (X.C27991fJ) r0
        L_0x0416:
            r2.A02 = r0
            boolean r0 = r1.A0v
            r2.A03 = r0
            boolean r1 = r2.A06()
            boolean r0 = r2.A07()
            if (r1 == 0) goto L_0x05c8
            if (r0 == 0) goto L_0x05c3
            r2.A08()
        L_0x042b:
            int r3 = r13.A02
            X.5PZ r0 = r12.A2b
            java.lang.Class<X.4mE> r1 = X.C92184mE.class
            X.5WZ r0 = r0.A00
            X.5rH r2 = r0.A00(r1)
            X.4mE r2 = (X.C92184mE) r2
            if (r2 == 0) goto L_0x045e
            X.4uZ r1 = r12.A4J
            boolean r0 = r1 instanceof X.C27991fJ
            if (r0 == 0) goto L_0x045e
            X.2so r0 = r12.A2J
            X.1fJ r1 = (X.C27991fJ) r1
            X.1fJ r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x045e
            r2.A00 = r3
            r2.A02 = r0
            boolean r1 = r2.A06()
            boolean r0 = r2.A07()
            if (r1 == 0) goto L_0x05bc
            if (r0 == 0) goto L_0x05b7
            r2.A08()
        L_0x045e:
            X.5PZ r0 = r12.A2b
            java.lang.Class<X.4mF> r1 = X.C92194mF.class
            X.5WZ r0 = r0.A00
            X.5rH r1 = r0.A00(r1)
            X.4mF r1 = (X.C92194mF) r1
            if (r1 == 0) goto L_0x047b
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x05b2
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x05ad
            r1.A08()
        L_0x047b:
            X.1VX r1 = r12.A41
            r0 = 5002(0x138a, float:7.009E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x04b9
            X.5PZ r0 = r12.A2b
            java.lang.Class<X.4mG> r1 = X.C92204mG.class
            X.5WZ r0 = r0.A00
            X.5rH r3 = r0.A00(r1)
            X.4mG r3 = (X.C92204mG) r3
            if (r3 == 0) goto L_0x04b9
            boolean r0 = r3.A06()
            if (r0 == 0) goto L_0x05a8
            boolean r0 = r3.A07()
            if (r0 == 0) goto L_0x05a3
            android.view.View r2 = r3.A00
            if (r2 == 0) goto L_0x04b9
            r0 = 2131429057(0x7f0b06c1, float:1.8479776E38)
            android.view.View r1 = X.C18280x3.A0E(r2, r0)
            r0 = 3
            X.C109345eT.A00(r1, r3, r0)
            r0 = 2131428791(0x7f0b05b7, float:1.8479236E38)
            android.view.View r1 = X.C18280x3.A0E(r2, r0)
            r0 = 4
            X.C109345eT.A00(r1, r3, r0)
        L_0x04b9:
            com.whatsapp.TextEmojiLabel r3 = r12.A1j
            boolean r6 = r13.A0C
            boolean r2 = r13.A0D
            boolean r0 = A0Q(r12)
            if (r0 == 0) goto L_0x051b
            X.4On r1 = A0A(r12)
            boolean r0 = r1.A0H
            if (r0 == r2) goto L_0x04e6
            X.4uZ r0 = r12.A4J
            X.4uY r0 = (X.C95804uY) r0
            r12.A1x(r0, r2)
            r1.A0H = r2
            int r0 = r1.A02
            int r0 = r0 + 1
            r1.A02 = r0
            com.whatsapp.conversation.ConversationListView r0 = r12.A2f
            r0.A03()
            X.676 r0 = r12.A2z
            r0.invalidateOptionsMenu()
        L_0x04e6:
            if (r2 == 0) goto L_0x051b
            if (r6 == 0) goto L_0x051b
            android.view.View r1 = r12.A0I
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0 = 1
            r1.setOrientation(r0)
            r3.setVisibility(r5)
            com.whatsapp.wds.components.button.WDSButton r0 = r12.A5v
            r0.setVisibility(r4)
            com.whatsapp.wds.components.button.WDSButton r1 = r12.A5v
            r0 = 2131891163(0x7f1213db, float:1.9417038E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r12.A5v
            X.6wT r0 = X.C141996wT.DESTRUCTIVE
            r1.setAction(r0)
            android.widget.LinearLayout$LayoutParams r1 = X.C86624Kv.A0C()
            r0 = 17
            r1.gravity = r0
            com.whatsapp.wds.components.button.WDSButton r0 = r12.A5v
            r0.setLayoutParams(r1)
            com.whatsapp.wds.components.button.WDSButton r0 = r12.A5v
            X.C18290x4.A1G(r0, r12, r5)
        L_0x051b:
            com.whatsapp.mentions.MentionableEntry r2 = r12.A4P
            if (r2 == 0) goto L_0x053d
            X.66o r0 = X.AnonymousClass5KY.A00(r12)
            X.4uZ r1 = r12.A4J
            X.5jK r0 = (X.C112185jK) r0
            X.5TH r0 = r0.A02
            boolean r5 = r0.A01(r1)
            com.whatsapp.mentions.MentionPickerView r3 = r2.A0D
            if (r3 == 0) goto L_0x053d
            X.4FS r2 = r3.A0N
            r1 = 44
            X.3cX r0 = new X.3cX
            r0.<init>((int) r1, (java.lang.Object) r3, (boolean) r5)
            r2.BkP(r0)
        L_0x053d:
            X.5dt r0 = r12.A2P
            if (r0 == 0) goto L_0x057b
            X.1VX r1 = r12.A41
            r0 = 5747(0x1673, float:8.053E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x057b
            X.5KY r0 = A0B(r12)
            X.2rv r7 = r0.A03
            X.3ZH r3 = r12.A3n
            X.7Dk r2 = new X.7Dk
            r2.<init>(r12)
            X.C162457s7.A0J(r3, r4)
            boolean r0 = r3.A0R()
            if (r0 == 0) goto L_0x057b
            int r0 = r3.A00
            if (r0 == 0) goto L_0x057b
            X.2aJ r0 = r7.A01
            java.lang.String r1 = r0.A00()
            java.lang.String r0 = "unset"
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 != 0) goto L_0x057c
            boolean r1 = r7.A04(r3)
            X.5l7 r0 = r2.A00
            r0.A6f = r1
        L_0x057b:
            return
        L_0x057c:
            X.2Sa r6 = r7.A00
            X.5qf r5 = new X.5qf
            r5.<init>(r2, r3, r7)
            X.5rC r1 = r6.A02
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x057b
            java.lang.Object r3 = r1.A04()
            X.2Xb r3 = (X.C44682Xb) r3
            r0 = 1
            long[] r2 = new long[r0]
            r0 = 20231027(0x134b373, double:9.9954554E-317)
            r2[r4] = r0
            r1 = 1
            X.4JA r0 = new X.4JA
            r0.<init>(r6, r1, r5)
            r3.A00(r0, r2)
            return
        L_0x05a3:
            r3.A03()
            goto L_0x04b9
        L_0x05a8:
            r3.A05(r4)
            goto L_0x04b9
        L_0x05ad:
            r1.A03()
            goto L_0x047b
        L_0x05b2:
            r1.A05(r4)
            goto L_0x047b
        L_0x05b7:
            r2.A03()
            goto L_0x045e
        L_0x05bc:
            if (r0 == 0) goto L_0x045e
            r2.A05(r4)
            goto L_0x045e
        L_0x05c3:
            r2.A03()
            goto L_0x042b
        L_0x05c8:
            if (r0 == 0) goto L_0x042b
            r2.A05(r4)
            goto L_0x042b
        L_0x05cf:
            r0 = 0
            goto L_0x0416
        L_0x05d2:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113245l7.A1n(X.5R9):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1o(X.C105845Wq r5) {
        /*
            r4 = this;
            java.lang.String r2 = r5.A07
            java.lang.String r1 = r5.A06
            boolean r0 = X.C107575bX.A0F(r1)
            if (r0 == 0) goto L_0x0011
            boolean r0 = X.C107575bX.A0F(r2)
            if (r0 == 0) goto L_0x0011
        L_0x0010:
            return
        L_0x0011:
            boolean r0 = X.C107575bX.A0F(r1)
            if (r0 != 0) goto L_0x0024
            X.1VX r1 = A0E(r4)
            r0 = 3994(0xf9a, float:5.597E-42)
        L_0x001d:
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x0031
            return
        L_0x0024:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0031
            X.1VX r1 = A0E(r4)
            r0 = 2255(0x8cf, float:3.16E-42)
            goto L_0x001d
        L_0x0031:
            X.3ZH r0 = r4.A3n
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass3ZH.A07(r0)
            if (r1 == 0) goto L_0x0010
            r0 = 36
            X.5sN r3 = new X.5sN
            r3.<init>(r4, r1, r2, r0)
            X.5T7 r0 = r4.A1t
            X.3XA r2 = r0.A02(r1)
            r1 = 2
            X.92X r0 = new X.92X
            r0.<init>(r3, r1)
            r2.A03(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113245l7.A1o(X.5Wq):void");
    }

    public void A1p(C42242Ni r5, C624134x r6, int i) {
        Cursor cursor;
        if (!C386628q.A00(this.A3i)) {
            this.A2z.BjL();
        } else if (!this.A4E.A0F()) {
            A04(this).A0D("search_fragment_conversation");
        } else {
            View view = this.A0N;
            if (!(view == null || this.A0L == null || this.A0O == null || this.A0M == null)) {
                view.setEnabled(true);
                this.A0L.setEnabled(true);
                this.A0O.setVisibility(8);
                this.A0M.setVisibility(8);
            }
        }
        if (r6 != null) {
            C87234On A0A2 = A0A(this);
            A0A2.A0b.add(r6.A1J);
            if (r5 == null || (cursor = r5.A00) == null) {
                this.A2f.A03();
            } else {
                this.A3B.A0M(r5.A01);
                this.A3B.A0N(r5.A02);
                this.A3B.A0Q(r5);
                this.A2f.A06(cursor);
            }
            ConversationListView conversationListView = this.A2f;
            C86654Ky.A1B(conversationListView, i + conversationListView.getHeaderViewsCount(), A0S());
            this.A5Z.A07();
        } else {
            A14();
        }
        this.A2i = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r1 == com.whatsapp.voipcalling.CallState.RECEIVED_CALL) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1q(X.C50392i6 r7) {
        /*
            r6 = this;
            X.5PZ r0 = r6.A2b
            java.lang.Class<X.4mK> r1 = X.C92244mK.class
            X.5WZ r0 = r0.A00
            X.5rH r5 = r0.A00(r1)
            X.4mK r5 = (X.C92244mK) r5
            if (r5 == 0) goto L_0x003a
            com.whatsapp.voipcalling.CallInfo r4 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r3 = 0
            if (r4 == 0) goto L_0x0042
            com.whatsapp.jid.GroupJid r1 = r4.groupJid
        L_0x0017:
            X.3ZH r2 = r5.A0I
            X.4uZ r0 = r2.A0H
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0029
            if (r4 == 0) goto L_0x0040
            com.whatsapp.voipcalling.CallState r1 = r4.callState
        L_0x0025:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x003d
        L_0x0029:
            X.4uZ r1 = r2.A0H
            if (r7 == 0) goto L_0x003b
            X.4uZ r0 = r7.A04
        L_0x002f:
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x003d
            r5.A07 = r7
        L_0x0037:
            r5.A0A()
        L_0x003a:
            return
        L_0x003b:
            r0 = r3
            goto L_0x002f
        L_0x003d:
            r5.A07 = r3
            goto L_0x0037
        L_0x0040:
            r1 = r3
            goto L_0x0025
        L_0x0042:
            r1 = r3
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113245l7.A1q(X.2i6):void");
    }

    public void A1r(AnonymousClass3ZH r6) {
        C53712nX r1 = this.A4p;
        if (r1.A02(r6.A0H)) {
            C1230066r r3 = this.A2C;
            List A0H2 = A0H(this, r6);
            r3.BKz(A09(this), (GroupJid) AnonymousClass3ZH.A05(r6, C27991fJ.class), A0H2, 25);
            return;
        }
        r1.A01(C18290x4.A0a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004e A[Catch:{ ActivityNotFoundException -> 0x0062 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1s(X.AnonymousClass3ZH r6, X.C95814uZ r7, boolean r8) {
        /*
            r5 = this;
            if (r8 == 0) goto L_0x002f
            X.5Xw r0 = r5.A5R     // Catch:{ ActivityNotFoundException -> 0x0062 }
            boolean r0 = X.C106165Xw.A01(r0)     // Catch:{ ActivityNotFoundException -> 0x0062 }
            if (r0 == 0) goto L_0x002f
            X.4eZ r4 = A09(r5)     // Catch:{ ActivityNotFoundException -> 0x0062 }
            if (r4 == 0) goto L_0x006b
            boolean r0 = r4.isFinishing()     // Catch:{ ActivityNotFoundException -> 0x0062 }
            if (r0 != 0) goto L_0x006b
            X.5Xw r1 = r5.A5R     // Catch:{ ActivityNotFoundException -> 0x0062 }
            X.0df r0 = r4.getSupportFragmentManager()     // Catch:{ ActivityNotFoundException -> 0x0062 }
            r1.A06(r0, r6, r7)     // Catch:{ ActivityNotFoundException -> 0x0062 }
            X.0df r3 = r4.getSupportFragmentManager()     // Catch:{ ActivityNotFoundException -> 0x0062 }
            java.lang.String r2 = "request_bottom_sheet_fragment"
            r1 = 7
            X.5bK r0 = new X.5bK     // Catch:{ ActivityNotFoundException -> 0x0062 }
            r0.<init>(r5, r1)     // Catch:{ ActivityNotFoundException -> 0x0062 }
            r3.A0j(r0, r4, r2)     // Catch:{ ActivityNotFoundException -> 0x0062 }
            goto L_0x003c
        L_0x002f:
            X.5Xw r0 = r5.A5R     // Catch:{ ActivityNotFoundException -> 0x0062 }
            android.content.Intent r2 = r0.A02(r6, r7, r8)     // Catch:{ ActivityNotFoundException -> 0x0062 }
            X.676 r1 = r5.A2z     // Catch:{ ActivityNotFoundException -> 0x0062 }
            r0 = 13
            r1.startActivityForResult(r2, r0)     // Catch:{ ActivityNotFoundException -> 0x0062 }
        L_0x003c:
            X.5IV r0 = r5.A3P     // Catch:{ ActivityNotFoundException -> 0x0062 }
            X.2hn r3 = r0.A02     // Catch:{ ActivityNotFoundException -> 0x0062 }
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass32Y.A03(r7)     // Catch:{ ActivityNotFoundException -> 0x0062 }
            X.1VX r1 = r3.A03     // Catch:{ ActivityNotFoundException -> 0x0062 }
            r0 = 2805(0xaf5, float:3.93E-42)
            boolean r0 = r1.A0X(r0)     // Catch:{ ActivityNotFoundException -> 0x0062 }
            if (r0 == 0) goto L_0x0057
            r0 = 22
            if (r8 == 0) goto L_0x0054
            r0 = 21
        L_0x0054:
            r3.A01(r2, r0)     // Catch:{ ActivityNotFoundException -> 0x0062 }
        L_0x0057:
            X.676 r0 = r5.A2z     // Catch:{ ActivityNotFoundException -> 0x0062 }
            X.5Tk r1 = r0.getAddContactLogUtil()     // Catch:{ ActivityNotFoundException -> 0x0062 }
            r0 = 5
            r1.A03(r8, r0)     // Catch:{ ActivityNotFoundException -> 0x0062 }
            return
        L_0x0062:
            X.4eZ r1 = A09(r5)
            r0 = 12
            X.C621433s.A01(r1, r0)
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113245l7.A1s(X.3ZH, X.4uZ, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0079, code lost:
        if (r2.getIntExtra("calling-tooltip-scenario", 0) != 1) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1t(X.AnonymousClass3ZH r14, boolean r15, boolean r16) {
        /*
            r13 = this;
            X.2nX r1 = r13.A4p
            X.4uZ r0 = r14.A0H
            boolean r0 = r1.A02(r0)
            r6 = r15
            if (r0 == 0) goto L_0x008e
            if (r16 != 0) goto L_0x0051
            X.1VX r1 = r13.A41
            r0 = 927(0x39f, float:1.299E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0036
            boolean r0 = r14.A0U()
            if (r0 == 0) goto L_0x0036
            java.lang.Class<X.1fJ> r0 = X.C27991fJ.class
            com.whatsapp.jid.Jid r2 = X.AnonymousClass3ZH.A05(r14, r0)
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            X.66r r0 = r13.A2C
            java.util.List r4 = A0H(r13, r14)
            X.4eZ r1 = A09(r13)
            r3 = 0
            r5 = 9
            r0.Bps(r1, r2, r3, r4, r5, r6)
            return
        L_0x0036:
            X.33p r3 = A0D(r13)
            X.4eZ r2 = A09(r13)
            boolean r1 = r13.A6V
            r0 = 8
            if (r1 == 0) goto L_0x0046
            r0 = 25
        L_0x0046:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = com.whatsapp.calling.fragment.CallConfirmationFragment.A02(r2, r3, r14, r0, r15)
            if (r0 == 0) goto L_0x0051
            return
        L_0x0051:
            boolean r0 = r14.A0U()
            if (r0 == 0) goto L_0x0082
            java.lang.Class<X.1fJ> r0 = X.C27991fJ.class
            com.whatsapp.jid.Jid r9 = X.AnonymousClass3ZH.A05(r14, r0)
            com.whatsapp.jid.GroupJid r9 = (com.whatsapp.jid.GroupJid) r9
            X.66r r7 = r13.A2C
            java.util.List r10 = A0H(r13, r14)
            X.4eZ r8 = A09(r13)
            android.content.Intent r2 = A01(r13)
            r1 = 0
            if (r2 == 0) goto L_0x007b
            java.lang.String r0 = "calling-tooltip-scenario"
            int r1 = r2.getIntExtra(r0, r1)
            r0 = 1
            r11 = 48
            if (r1 == r0) goto L_0x007d
        L_0x007b:
            r11 = 25
        L_0x007d:
            r12 = r15
            r7.Bpm(r8, r9, r10, r11, r12)
            return
        L_0x0082:
            X.66r r2 = r13.A2C
            X.4eZ r1 = A09(r13)
            r0 = 8
            r2.Bpk(r1, r14, r0, r15)
            return
        L_0x008e:
            r0 = 3
            if (r15 == 0) goto L_0x0092
            r0 = 4
        L_0x0092:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113245l7.A1t(X.3ZH, boolean, boolean):void");
    }

    public void A1u(C166177yG r4) {
        if (!this.A2z.getWaPermissionsHelper().A0C()) {
            this.A48 = r4;
            RequestPermissionActivity.A0i(A09(this), this.A41, 811);
            return;
        }
        A1v(r4);
    }

    public final void A1v(C166177yG r18) {
        if (C86604Kt.A1a(this.A27, this.A3n)) {
            C621433s.A01(A09(this), 106);
            return;
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        A0s2.add(this.A4J);
        C166177yG r6 = r18;
        C166097y8 r7 = r6.A01;
        int i = r7.A01;
        if (i <= 0) {
            i = r6.A02.A01;
        }
        int i2 = r7.A00;
        if (i2 <= 0) {
            i2 = r6.A02.A00;
        }
        String stringText = this.A4P.getStringText();
        this.A2z.startActivityForResult(C627736r.A16(A09(this), r6.A02.A02, r7.A02, r6.A03.A02, A0s2, r6.A00, 22, this.A6P, false).putExtra("media_width", i).putExtra("media_height", i2).putExtra("jid", C627336j.A07(this.A4J)).putExtra("caption", stringText).putExtra("mentions", AnonymousClass4SQ.A00(this.A4P)).putExtra("clear_message_after_send", C18320x8.A1U(stringText)).putExtra("usage_quote", AnonymousClass000.A1W(this.A3B.A0G)), 25);
    }

    public void A1w(C95814uZ r4) {
        if (this.A2z.getScreenLockStateProvider().A09()) {
            C18260x0.A1P(AnonymousClass001.A0o(), "conversation/statusbarwhenscreenwasoff ", r4);
            this.A6k = true;
            if (!r4.equals(this.A4J)) {
                this.A6d = false;
                C18260x0.A1D("conversation/statusbarwhenscreenwasoff/shouldcancelnotification ", AnonymousClass001.A0o(), false);
            }
        }
    }

    public final void A1x(C95804uY r8, boolean z) {
        C372321l r3;
        String string;
        TextView textView = (TextView) this.A2z.findViewById(R.id.suspended_newsletter_view_text);
        if (textView != null) {
            if (z) {
                this.A2f.setEmptyView(textView);
                AnonymousClass1RL r0 = (AnonymousClass1RL) C56982ss.A00(((C103985Pe) A0C(this).A0D.get()).A00, r8);
                if (r0 != null) {
                    r3 = r0.A0B;
                } else {
                    r3 = null;
                }
                if (r3 == C372321l.NOT_ENFORCED || r3 == null) {
                    this.A3O.A01(AnonymousClass22M.A0C, r3.toString());
                } else {
                    if (r3.ordinal() != 2) {
                        textView.setText(C107575bX.A00(A09(this), new Object[0], R.string.f11nameremoved));
                    } else {
                        String A012 = A0C(this).A06.A01(A0C(this).A06.A00());
                        if (A012 == null) {
                            string = this.A2z.getString(R.string.f11nameremoved);
                        } else {
                            string = this.A2z.getString(R.string.f11nameremoved, A012);
                        }
                        textView.setText(string);
                        C109345eT.A00(textView, this, 49);
                    }
                    textView.setTextSize(this.A2d.A01(this.A2z.getResources()));
                    textView.setBackgroundResource(R.drawable.date_balloon);
                    AnonymousClass0x2.A0q(A09(this), textView, R.color.f5nameremoved);
                    return;
                }
            }
            textView.setVisibility(8);
        }
    }

    public void A1y(UserJid userJid) {
        AnonymousClass4UA r2 = this.A3D;
        C152967aS A0X2 = A0X();
        C108815db A092 = r2.A0N.A09(userJid);
        if (A092 != null) {
            A0X2.A02((ImageView) null, A092, (C181758nH) null, new C111875ip(r2, userJid), 2);
        } else {
            C117155rT.A00(r2.A0d, r2, userJid, 15);
        }
    }

    public void A1z(C624134x r11) {
        MentionableEntry mentionableEntry;
        if (!this.A37.A0F() && this.A4P != null) {
            AnonymousClass5ZT r0 = this.A5q;
            C624134x r6 = r11;
            if (r0 != null) {
                r0.A0G = r11;
            }
            if (r11 == null) {
                this.A0W.setVisibility(8);
                this.A0X.setVisibility(8);
                A1Q(R.drawable.ib_new_round);
                return;
            }
            AnonymousClass0R2 r02 = this.A0q;
            if (r02 != null) {
                r02.A05();
            }
            if (this.A0H == null) {
                View A0g2 = C86664Kz.A0g(this.A2z.getLayoutInflater(), R.layout.f8nameremoved);
                this.A0H = A0g2;
                C86664Kz.A0s(A0g2, R.id.quoted_message_frame).setForeground(C107335b8.A04(A09(this), R.drawable.balloon_incoming_frame, R.color.f5nameremoved));
                this.A0W.addView(this.A0H);
                C107555bV.A05(this.A0H.findViewById(R.id.quoted_title_frame), this.A3L, 0, this.A2z.getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
                C86604Kt.A1F(this.A0H, R.id.cancel, 0);
                C18310x6.A18(this.A0H.findViewById(R.id.cancel), this, 5);
                TextView A092 = AnonymousClass002.A09(this.A0H, R.id.quoted_title);
                A092.setTextSize(this.A2d.A02(this.A2z.getResources()));
                C106905aM.A04(A092);
            }
            A0B(this).A06.get();
            if (C57322tS.A01(r11) && A0B(this).A00.A00()) {
                MentionableEntry mentionableEntry2 = this.A4P;
                C89654ea A4J2 = C89654ea.A4J(mentionableEntry2.getContext());
                AnonymousClass5TH r3 = (AnonymousClass5TH) mentionableEntry2.A07.A05();
                if (A4J2 != null && r3 != null && r3.A00() && r3.A03.A02()) {
                    if (r3.A01.A00(mentionableEntry2.getMentions()) == null) {
                        ((AnonymousClass33R) r3.A08.get()).A04(A4J2, new C175248Xq(new C124366Bz(mentionableEntry2, 6)), false);
                    }
                }
                A28(r11, AnonymousClass000.A1W(this.A4P.getBotMention()));
            } else if (C155477ey.A00(r11.A1J.A00) && !C627336j.A0K(r11.A0n()) && C155477ey.A00(r11.A0o()) && A0B(this).A00.A00()) {
                A28(r11, true);
            }
            if (this.A54.A03(r11)) {
                this.A54.A00(this.A0H, r11);
            } else {
                C114005mL r2 = this.A2s;
                View view = this.A0H;
                C95814uZ r5 = this.A4J;
                AnonymousClass33O stickerImageFileLoader = this.A2z.getStickerImageFileLoader();
                AnonymousClass676 r03 = this.A2z;
                r2.A0H(view, r03.getConversationRowInflater().A01(r03.getActivity()), r5, r6, stickerImageFileLoader, false, false);
            }
            int visibility = this.A0H.findViewById(R.id.quoted_thumb).getVisibility();
            View findViewById = this.A0H.findViewById(R.id.cancel_image);
            if (visibility == 0) {
                findViewById.setBackgroundResource(R.drawable.semi_white_circle);
            } else {
                findViewById.setBackgroundColor(0);
            }
            if (this.A0W.getVisibility() != 0 || this.A05 < 0) {
                Log.i("conversation/replypreview/start");
                A1h(this.A0H, this.A0W);
            }
            if (A2X()) {
                ExpressionsBottomSheetView expressionsBottomSheetView = this.A40;
                if (expressionsBottomSheetView != null && expressionsBottomSheetView.getVisibility() == 0) {
                    return;
                }
            } else {
                C94264qq r04 = this.A45;
                if (r04 != null && r04.isShowing()) {
                    return;
                }
            }
            AnonymousClass5ZT r05 = this.A5q;
            if ((r05 == null || !C86604Kt.A1Y(r05.A1D.A0B)) && (mentionableEntry = this.A4P) != null) {
                mentionableEntry.A07(false);
            }
        }
    }

    public final void A21(C624134x r7) {
        int i;
        int A042;
        ConversationListView conversationListView = this.A2f;
        int firstVisiblePosition = conversationListView.getFirstVisiblePosition();
        int lastVisiblePosition = conversationListView.getLastVisiblePosition();
        int A032 = conversationListView.getConversationCursorAdapter().A03(r7);
        if (A032 >= 0 && (i = A032 + 1) >= firstVisiblePosition) {
            if (i <= lastVisiblePosition) {
                View childAt = conversationListView.getChildAt(i - firstVisiblePosition);
                if (childAt == null || childAt.getTop() <= (A042 = C86654Ky.A04(conversationListView) - C86654Ky.A04(childAt))) {
                    return;
                }
            } else {
                A042 = C86654Ky.A04(conversationListView);
            }
            conversationListView.smoothScrollToPositionFromTop(i, A042);
            if (!conversationListView.A0K) {
                conversationListView.setTranscriptMode(0);
                conversationListView.setVisibility(0);
                this.A5g.A06(0);
                this.A3B.A03 = 0;
                A2N(false);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A22(X.C624134x r15, X.C624134x r16, int r17) {
        /*
            r14 = this;
            r3 = r16
            X.4On r1 = A0A(r14)
            X.4VQ r5 = r14.A3B
            int r10 = r1.A01()
            com.whatsapp.conversation.ConversationListView r0 = r14.A2f
            int r11 = r0.getFirstVisiblePosition()
            int r12 = r1.getCount()
            r7 = r15
            if (r16 == 0) goto L_0x006f
            boolean r0 = r3 instanceof X.C31921p4
            if (r0 == 0) goto L_0x006f
            X.34x r0 = r3.A0w()
            if (r0 == 0) goto L_0x006f
            X.2z0 r1 = r0.A1J
            X.2z0 r0 = new X.2z0
            r0.<init>(r1)
            X.2z0 r2 = r15.A1J
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x006f
            boolean r0 = X.AnonymousClass36V.A07(r15)
            if (r0 == 0) goto L_0x006f
            X.1p4 r3 = (X.C31921p4) r3
            java.lang.Integer r4 = r3.A01
            if (r4 == 0) goto L_0x0070
            int r0 = r4.intValue()
            X.1mj r3 = new X.1mj
            r3.<init>(r2, r0)
        L_0x0047:
            r0 = 1
            X.2z0[] r0 = new X.AnonymousClass2z0[r0]
            r1 = 0
            java.util.List r8 = X.AnonymousClass0x9.A1A(r3, r0, r1)
            r13 = 1
            if (r4 != 0) goto L_0x0059
            r6 = 0
        L_0x0053:
            r9 = r17
            r5.A0P(r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x0059:
            X.5MU r6 = new X.5MU
            r6.<init>()
            int r0 = r4.intValue()
            X.C162457s7.A0J(r2, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.util.concurrent.ConcurrentHashMap r0 = r6.A00
            r0.put(r2, r1)
            goto L_0x0053
        L_0x006f:
            r4 = 0
        L_0x0070:
            X.2z0 r3 = r15.A1J
            r2 = r3
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113245l7.A22(X.34x, X.34x, int):void");
    }

    public void A27(C624134x r7, String str, String str2) {
        C621033m A082 = A08(this);
        C95814uZ A0a2 = C86604Kt.A0a(this.A3n);
        Log.d("UserActions/userActionNFMSendListResponseMessage");
        C31901p2 r3 = new C31901p2(AnonymousClass35J.A01(A0a2, A082.A1X), A082.A0V.A0H());
        A082.A1a.A00(r3, r7);
        r3.A00 = new AnonymousClass39N((AnonymousClass22W) null, new AnonymousClass397("menu_options", str2), str);
        A082.A0O(r3);
        A082.A0l.A0V(r3);
    }

    public void A28(C624134x r9, boolean z) {
        Log.d("ConversationDelegate/maybeAppendImagineCommand");
        if (z && (r9 instanceof AnonymousClass1n2) && this.A5M != null) {
            this.A4P.getText().append("/");
            new C112195jL(C86664Kz.A0m(A09(this), R.id.mention_attach), A05(this), this.A2m, this.A4P, this.A5M).A00(A09(this), "imagine");
        }
    }

    public void A29(C624134x r19, boolean z) {
        MentionableEntry mentionableEntry = this.A4P;
        AnonymousClass0R2 r1 = this.A0q;
        KeyboardPopupLayout keyboardPopupLayout = this.A1a;
        ConversationListView conversationListView = this.A2f;
        ViewGroup viewGroup = this.A0Z;
        ViewGroup viewGroup2 = this.A0W;
        ViewGroup viewGroup3 = this.A0X;
        C114005mL r10 = this.A2s;
        AnonymousClass33O stickerImageFileLoader = this.A2z.getStickerImageFileLoader();
        C624134x r14 = r19;
        if (r19 != null && !this.A37.A0F() && mentionableEntry != null) {
            if (r1 != null) {
                r1.A05();
            }
            this.A3B.A0S(r14);
            View view = this.A0R;
            if (view == null) {
                view = new C97594yo(A09(this), new C71723cZ(this, viewGroup3, keyboardPopupLayout, conversationListView, viewGroup, viewGroup2, 6));
                this.A0R = view;
                viewGroup3.addView(view);
            }
            if (this.A54.A03(r14)) {
                this.A54.A00(this.A0H, r14);
            } else {
                C95814uZ r13 = this.A4J;
                AnonymousClass676 r0 = this.A2z;
                r10.A0H(view, r0.getConversationRowInflater().A01(r0.getActivity()), r13, r14, stickerImageFileLoader, false, false);
            }
            boolean z2 = false;
            ConversationListView conversationListView2 = this.A2f;
            if (conversationListView2 != null) {
                z2 = conversationListView2.A0B(0);
            }
            if (!z) {
                viewGroup3.setVisibility(0);
                return;
            }
            keyboardPopupLayout.setClipChildren(false);
            int transcriptMode = conversationListView.getTranscriptMode();
            if (z2) {
                conversationListView.setTranscriptMode(2);
            } else {
                conversationListView.setTranscriptMode(0);
            }
            viewGroup3.setVisibility(0);
            viewGroup3.getViewTreeObserver().addOnGlobalLayoutListener(new C110035fa(view, viewGroup3, viewGroup, conversationListView, keyboardPopupLayout, transcriptMode, z2));
        }
    }

    public void A2A(C30721mu r4, long j, boolean z) {
        if (z) {
            this.A07 = r4.A1L;
        }
        if (j == 0) {
            this.A2f.removeCallbacks(this.A6B);
        }
        C117155rT r1 = new C117155rT(this, 3, r4);
        this.A6B = r1;
        this.A2f.postDelayed(r1, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (X.C627436k.A0J(r2) != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2B(X.AnonymousClass3ZF r7) {
        /*
            r6 = this;
            r5 = 9
            X.66r r4 = r6.A2C
            X.4eZ r3 = A09(r6)
            X.1VX r2 = r6.A41
            int r1 = r7.A0H
            r0 = 2
            if (r1 != r0) goto L_0x0016
            boolean r1 = X.C627436k.A0J(r2)
            r0 = 1
            if (r1 == 0) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            r4.BJS(r3, r7, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113245l7.A2B(X.3ZF):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r1 == com.whatsapp.voipcalling.CallState.RECEIVED_CALL) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (X.C627436k.A0A(r6.A0D, r6.A0J) != false) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2C(X.AnonymousClass3ZF r11) {
        /*
            r10 = this;
            X.5PZ r0 = r10.A2b
            java.lang.Class<X.4mK> r1 = X.C92244mK.class
            X.5WZ r0 = r0.A00
            X.5rH r6 = r0.A00(r1)
            X.4mK r6 = (X.C92244mK) r6
            if (r6 == 0) goto L_0x007d
            com.whatsapp.voipcalling.CallInfo r5 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r4 = 0
            if (r5 == 0) goto L_0x009d
            com.whatsapp.jid.GroupJid r1 = r5.groupJid
        L_0x0017:
            X.3ZH r3 = r6.A0I
            X.4uZ r0 = r3.A0H
            boolean r0 = X.C162457s7.A0P(r1, r0)
            r9 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002c
            if (r5 == 0) goto L_0x009b
            com.whatsapp.voipcalling.CallState r1 = r5.callState
        L_0x0027:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            r8 = 0
            if (r1 != r0) goto L_0x002d
        L_0x002c:
            r8 = 1
        L_0x002d:
            if (r11 == 0) goto L_0x0099
            com.whatsapp.jid.GroupJid r1 = r11.A05
            if (r1 == 0) goto L_0x0099
            X.4uZ r0 = r3.A0H
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0099
            int r1 = r11.A0H
            r0 = 2
            if (r1 == r0) goto L_0x004a
            X.1VX r1 = r6.A0J
            X.2sr r0 = r6.A0D
            boolean r0 = X.C627436k.A0A(r0, r1)
            if (r0 == 0) goto L_0x0099
        L_0x004a:
            r7 = 1
        L_0x004b:
            com.whatsapp.voipcalling.CallState r1 = r6.A09
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 != r0) goto L_0x0057
            if (r5 == 0) goto L_0x0097
            com.whatsapp.voipcalling.CallState r0 = r5.callState
            if (r0 == 0) goto L_0x0097
        L_0x0057:
            r3 = 1
        L_0x0058:
            if (r11 == 0) goto L_0x006a
            java.util.List r1 = r11.A08()
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0081
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0081
        L_0x0068:
            r9 = 0
        L_0x0069:
            r2 = r9
        L_0x006a:
            if (r8 == 0) goto L_0x007e
            if (r7 == 0) goto L_0x007e
            if (r3 == 0) goto L_0x007e
            if (r2 == 0) goto L_0x007e
            r6.A08 = r11
        L_0x0074:
            r6.A0A()
            if (r5 == 0) goto L_0x007b
            com.whatsapp.voipcalling.CallState r4 = r5.callState
        L_0x007b:
            r6.A09 = r4
        L_0x007d:
            return
        L_0x007e:
            r6.A08 = r4
            goto L_0x0074
        L_0x0081:
            java.util.Iterator r2 = r1.iterator()
        L_0x0085:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0068
            java.lang.Object r0 = r2.next()
            X.3ZE r0 = (X.AnonymousClass3ZE) r0
            int r1 = r0.A00
            r0 = 5
            if (r1 != r0) goto L_0x0085
            goto L_0x0069
        L_0x0097:
            r3 = 0
            goto L_0x0058
        L_0x0099:
            r7 = 0
            goto L_0x004b
        L_0x009b:
            r1 = r4
            goto L_0x0027
        L_0x009d:
            r1 = r4
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113245l7.A2C(X.3ZF):void");
    }

    public final void A2D(Boolean bool, List list) {
        String A0X2;
        if (list == null || list.isEmpty() || !Boolean.TRUE.equals(bool)) {
            this.A0B.setVisibility(8);
            return;
        }
        TextView A012 = C005205m.A01(A09(this), R.id.active_cart_badge);
        this.A0B.setOnClickListener(this.A6u);
        this.A0B.setVisibility(0);
        C620733j r6 = this.A3L;
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = (int) (((long) i) + AnonymousClass4L0.A0J(it).A00);
        }
        if (i == 0) {
            A0X2 = "";
        } else if (i <= 99) {
            A0X2 = r6.A0M().format((long) i);
        } else {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append(r6.A0M().format(99));
            A0X2 = AnonymousClass000.A0X("+", A0o2);
        }
        A012.setText(A0X2);
    }

    public final void A2E(String str) {
        if (str == null || str.length() <= 0 || this.A3i.A0N() || AnonymousClass0x2.A0F(this.A3K).getInt("backup_restore_state", 0) != 512) {
            AnonymousClass5UY r1 = this.A5d;
            if (r1 == null) {
                r1 = new AnonymousClass5UY(this.A2z.findViewById(R.id.conversation_fts_not_ready_view_stub));
                this.A5d = r1;
            }
            r1.A06(8);
            AnonymousClass4VQ r12 = this.A3B;
            r12.A0I = str;
            r12.A0K = C107155an.A03(this.A3L, str);
            AnonymousClass4VQ r13 = this.A3B;
            r13.A0J = r13.A0I;
            C87234On.A00(this.A2f, this);
            return;
        }
        AnonymousClass5UY r14 = this.A5d;
        if (r14 == null) {
            r14 = new AnonymousClass5UY(this.A2z.findViewById(R.id.conversation_fts_not_ready_view_stub));
            this.A5d = r14;
        }
        r14.A06(0);
    }

    public final void A2F(String str) {
        this.A2z.BKj(str);
        if (this.A6c) {
            C18260x0.A0q("Add QPL point: ", str, AnonymousClass001.A0o());
        }
    }

    public void A2G(boolean z) {
        C95814uZ r2;
        ViewGroup viewGroup;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View.OnClickListener onClickListener;
        this.A6Q = z;
        C89884fR r4 = this.A2Z;
        if (r4 != null) {
            boolean z2 = !z;
            if (r4 instanceof C92154mB) {
                C92154mB r42 = (C92154mB) r4;
                View findViewById = r42.A05.findViewById(R.id.back);
                int i7 = 0;
                if (r42.A0D.A0J(r42.A0P, r42.A00)) {
                    if (!z2) {
                        i7 = 8;
                    }
                    findViewById.setVisibility(i7);
                } else {
                    findViewById.setClickable(z2);
                    View findViewById2 = r42.A05.findViewById(R.id.whatsapp_toolbar_home);
                    if (findViewById2 != null) {
                        if (!z2) {
                            i7 = 8;
                        }
                        findViewById2.setVisibility(i7);
                    }
                }
            } else if (r4.A01 != null) {
                C06560Yg.A02(r4.A05, R.id.whatsapp_toolbar_home).setVisibility(AnonymousClass001.A08(z2 ? 1 : 0));
                View view = r4.A01;
                if (z2) {
                    onClickListener = r4.A0T;
                } else {
                    onClickListener = null;
                }
                view.setOnClickListener(onClickListener);
                r4.A01.setClickable(z2);
            }
        }
        if (z) {
            r2 = this.A4J;
        } else {
            r2 = null;
        }
        C97154xi r1 = this.A4E;
        if (r1.A0I()) {
            String A0n2 = C18290x4.A0n(r2);
            Iterator A032 = C61102zi.A03(r1);
            while (A032.hasNext()) {
                ((AnonymousClass5UN) A032.next()).A03(A0n2);
            }
        }
        View findViewById3 = this.A2z.findViewById(R.id.split_view_divider);
        if (findViewById3 != null) {
            findViewById3.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
        }
        if (this.A2c != null) {
            if (this.A6Q) {
                i = A02(this).getDimensionPixelOffset(R.dimen.f6nameremoved);
                i2 = A02(this).getDimensionPixelOffset(R.dimen.f6nameremoved);
                i3 = A02(this).getDimensionPixelOffset(R.dimen.f6nameremoved);
                i4 = A02(this).getDimensionPixelOffset(R.dimen.f6nameremoved);
                i5 = A02(this).getDimensionPixelOffset(R.dimen.f6nameremoved);
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
            }
            AnonymousClass5KV r0 = this.A2c;
            C620733j r43 = r0.A05;
            View view2 = r0.A02;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                i6 = 0;
            } else {
                i6 = marginLayoutParams.topMargin;
            }
            C107555bV.A06(view2, r43, i2, i6, i3, i);
            C620733j r5 = this.A3L;
            ViewGroup viewGroup2 = this.A0Z;
            C107555bV.A07(viewGroup2, r5, viewGroup2.getPaddingLeft(), this.A0Z.getPaddingTop(), this.A0Z.getPaddingRight(), i4);
            A1X(i5);
            Resources A022 = A02(this);
            boolean z3 = this.A6Q;
            int i8 = R.dimen.f6nameremoved;
            if (z3) {
                i8 = R.dimen.f6nameremoved;
            }
            int dimensionPixelOffset = A022.getDimensionPixelOffset(i8);
            FrameLayout frameLayout = this.A2c.A03;
            ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.bottomMargin = dimensionPixelOffset;
                frameLayout.setLayoutParams(marginLayoutParams2);
            } else {
                throw AnonymousClass001.A0g("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        C185668u3 r02 = ((C112715kB) this.A2O).A00;
        if (r02 != null) {
            r02.setShouldShowGenericContactOrGroupName(z);
        }
        if (A2X() && (viewGroup = this.A0V) != null) {
            viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass6BP(0, this, true));
        }
    }

    public void A2H(boolean z) {
        View view;
        View view2;
        this.A5Z = new AnonymousClass33M("conversation/search/searchTask");
        if (!C386628q.A00(this.A3i)) {
            this.A2z.Bp9(R.string.f11nameremoved);
        } else if (!this.A4E.A0F()) {
            A04(this).A0D("search_fragment_conversation");
        } else if (this.A0N != null && this.A0L != null && (view = this.A0O) != null && (view2 = this.A0M) != null) {
            if (z) {
                view.setVisibility(0);
            } else {
                view2.setVisibility(0);
            }
            this.A0N.setEnabled(false);
            this.A0L.setEnabled(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0194, code lost:
        if (A00(r0) == 2) goto L_0x0196;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2J(boolean r25) {
        /*
            r24 = this;
            r0 = r24
            com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel r3 = r0.A29
            if (r3 == 0) goto L_0x0012
            X.3Wi r2 = r3.A04
            java.lang.Runnable r1 = r3.A0B
            r2.A0R(r1)
            java.lang.Runnable r1 = r3.A0A
            r2.A0R(r1)
        L_0x0012:
            X.2sq r2 = r0.A27
            X.3ZH r1 = r0.A3n
            boolean r1 = X.C86604Kt.A1a(r2, r1)
            if (r1 == 0) goto L_0x0026
            X.4eZ r1 = A09(r0)
            r0 = 106(0x6a, float:1.49E-43)
        L_0x0022:
            X.C621433s.A01(r1, r0)
        L_0x0025:
            return
        L_0x0026:
            X.5ZT r2 = r0.A5q
            r5 = 8
            r7 = 1
            if (r2 == 0) goto L_0x005b
            X.5TQ r1 = r2.A0L
            if (r1 == 0) goto L_0x0040
            boolean r1 = r0.A6P
            r2.A0S(r7, r1)
            X.0R2 r1 = r0.A0q
            if (r1 == 0) goto L_0x0025
            android.view.View r0 = r0.A0D
            r0.setVisibility(r5)
            return
        L_0x0040:
            X.5qb r1 = r2.A1D
            android.view.ViewGroup r1 = r1.A0B
            boolean r1 = X.C86604Kt.A1Y(r1)
            if (r1 == 0) goto L_0x005b
            X.5ZT r2 = r0.A5q
            java.io.File r1 = r2.A0M
            if (r1 == 0) goto L_0x005b
            boolean r1 = r0.A6P
            r2.A0P(r1)
            X.5ZT r0 = r0.A5q
            r0.A0N(r7)
            return
        L_0x005b:
            com.whatsapp.mentions.MentionableEntry r1 = r0.A4P
            java.lang.String r2 = r1.getStringText()
            boolean r1 = r0.A6R
            java.lang.String r1 = X.C107635bd.A0B(r2, r1)
            X.676 r2 = r0.A2z
            X.33i r3 = r2.getSystemServices()
            X.2y5 r2 = r0.A4r
            boolean r2 = X.C107635bd.A0P(r3, r2, r1)
            if (r2 != 0) goto L_0x0080
            X.3Wi r1 = A07(r0)
            r0 = 2131887446(0x7f120556, float:1.94095E38)
            r1.A0H(r0, r7)
            return
        L_0x0080:
            r4 = 65536(0x10000, float:9.18355E-41)
            r2 = 0
            if (r25 == 0) goto L_0x00c0
            java.lang.String r1 = X.C107575bX.A0C(r1, r4)
        L_0x0089:
            X.4UA r3 = r0.A3D
            r11 = 0
            r3.A0O(r11)
            android.view.ViewGroup r3 = r0.A0a
            r3.setVisibility(r5)
            android.view.ViewGroup r3 = r0.A0W
            r3.setVisibility(r5)
            r3 = 2131231693(0x7f0803cd, float:1.8079474E38)
            r0.A1Q(r3)
            android.view.ViewGroup r3 = r0.A0X
            r3.setVisibility(r5)
            int r8 = r1.length()
            if (r8 <= 0) goto L_0x015f
            X.3ZH r6 = r0.A3n
            if (r6 == 0) goto L_0x00d2
            X.5dt r4 = r0.A2P
            if (r4 == 0) goto L_0x00d2
            boolean r3 = r0.A6I
            if (r3 != 0) goto L_0x00d2
            boolean r3 = r0.A6f
            if (r3 == 0) goto L_0x00d2
            r0.A1l(r4)
            r0.A6I = r7
            return
        L_0x00c0:
            int r3 = r1.length()
            int r3 = r1.codePointCount(r2, r3)
            if (r3 <= r4) goto L_0x0089
            X.4eZ r1 = A09(r0)
            r0 = 17
            goto L_0x0022
        L_0x00d2:
            java.util.HashMap r4 = A7S
            java.lang.Class<X.4uZ> r5 = X.C95814uZ.class
            com.whatsapp.jid.Jid r3 = r6.A0I(r5)
            boolean r3 = r4.containsKey(r3)
            if (r3 == 0) goto L_0x0203
            r0.A10()
            X.4UA r3 = r0.A3D
            X.3Ls r6 = r3.A01
            boolean r3 = r6 instanceof X.AnonymousClass1Hk
            if (r3 == 0) goto L_0x0200
            X.2e0 r4 = r0.A3A
            X.1Hk r6 = (X.AnonymousClass1Hk) r6
            X.5Wq r3 = r0.A3S
            X.2U8 r13 = r4.A00(r6, r3)
            X.4UA r3 = r0.A3D
            r3.A0N(r11)
            r0.A2M(r7)
        L_0x00fd:
            X.4VQ r3 = r0.A3B
            X.34x r7 = r3.A0G
            boolean r3 = r7 instanceof X.C30771mz
            if (r3 == 0) goto L_0x012b
            X.5Tt r6 = r0.A20
            boolean r3 = r6.A03
            if (r3 == 0) goto L_0x012b
            X.1mz r7 = (X.C30771mz) r7
            X.5P6 r4 = X.AnonymousClass5P6.A00(r6)
            X.5Tt r3 = r0.A20
            X.AnonymousClass5P6.A04(r4, r3)
            r3 = 36
            X.AnonymousClass5P6.A02(r4, r3)
            r3 = 48
            X.AnonymousClass5P6.A03(r4, r3)
            java.lang.String r3 = r7.A06
            r4.A0G = r3
            com.whatsapp.jid.UserJid r3 = r7.A01
            r4.A00 = r3
            r6.A03(r4)
        L_0x012b:
            X.4UA r3 = r0.A3D
            X.3Ls r10 = r3.A01
            boolean r3 = r10 instanceof X.C131946eR
            if (r3 == 0) goto L_0x01cc
            X.6eR r10 = (X.C131946eR) r10
            X.5dg r4 = r10.A00
            if (r4 == 0) goto L_0x0159
            X.33m r9 = A08(r0)
            X.3ZH r3 = r0.A3n
            com.whatsapp.jid.Jid r3 = r3.A0I(r5)
            java.util.List r15 = java.util.Collections.singletonList(r3)
            java.lang.String r11 = r4.A00
            java.lang.String r12 = r4.A04
            java.lang.String r13 = r4.A02
            byte[] r16 = r4.A01()
            X.4VQ r3 = r0.A3B
            X.34x r10 = r3.A0G
            r14 = r1
            r9.A0U(r10, r11, r12, r13, r14, r15, r16)
        L_0x0159:
            r0.A0t()
            r0.A0z()
        L_0x015f:
            X.676 r1 = r0.A2z
            X.33i r1 = r1.getSystemServices()
            android.view.inputmethod.InputMethodManager r1 = r1.A0Q()
            X.C626936e.A06(r1)
            boolean r1 = r1.isFullscreenMode()
            r5 = 4
            if (r1 != 0) goto L_0x0196
            com.whatsapp.mentions.MentionableEntry r1 = r0.A4P
            int r3 = r1.getHeight()
            com.whatsapp.conversation.ConversationListView r1 = r0.A2f
            int r1 = X.C86664Kz.A0C(r1, r3)
            int r3 = r1 * 4
            android.view.Window r1 = A03(r0)
            android.view.View r1 = r1.getDecorView()
            int r1 = r1.getHeight()
            if (r3 >= r1) goto L_0x019c
            int r3 = A00(r0)
            r1 = 2
            if (r3 != r1) goto L_0x019c
        L_0x0196:
            r0.A0e()
            r0.A2T()
        L_0x019c:
            boolean r1 = r0.A2X()
            if (r1 == 0) goto L_0x01ae
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = r0.A0t
            if (r4 == 0) goto L_0x01ae
            int r3 = r4.A0O
            r1 = 3
            if (r3 != r1) goto L_0x01ae
            r4.A0S(r5)
        L_0x01ae:
            if (r8 <= 0) goto L_0x0025
            android.content.Intent r3 = A01(r0)
            java.lang.String r1 = "fb_share_wa_redirect"
            boolean r1 = r3.getBooleanExtra(r1, r2)
            if (r1 == 0) goto L_0x0025
            X.4eZ r1 = A09(r0)
            r1.finishAffinity()
            X.676 r1 = r0.A2z
            r0 = 17432577(0x10a0001, float:2.53466E-38)
            r1.overridePendingTransition(r2, r0)
            return
        L_0x01cc:
            X.33m r9 = A08(r0)
            X.3ZH r3 = r0.A3n
            com.whatsapp.jid.Jid r3 = r3.A0I(r5)
            java.util.List r19 = java.util.Collections.singletonList(r3)
            X.4UA r3 = r0.A3D
            X.4Ey r5 = r3.A0c
            X.2qb r15 = r3.A05
            X.4VQ r3 = r0.A3B
            X.34x r14 = r3.A0G
            com.whatsapp.mentions.MentionableEntry r3 = r0.A4P
            java.util.List r20 = r3.getMentions()
            boolean r4 = r0.A6P
            boolean r3 = r0.A6R
            r17 = r11
            r12 = r11
            r18 = r1
            r21 = r4
            r22 = r3
            r23 = r2
            r16 = r5
            r9.A03(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0159
        L_0x0200:
            r0.A16()
        L_0x0203:
            r13 = r11
            goto L_0x00fd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113245l7.A2J(boolean):void");
    }

    public final void A2L(boolean z) {
        boolean isEmpty = TextUtils.isEmpty(this.A3B.A0I);
        AnonymousClass4VQ r1 = this.A3B;
        if (isEmpty) {
            r1.A0I = null;
            r1.A0K = null;
            return;
        }
        r1.A0J = r1.A0I;
        A0e();
        int firstPosition = this.A2f.getFirstPosition();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("conversation/search/ first-visible:");
        A0o2.append(this.A2f.getFirstVisiblePosition());
        A0o2.append(" header-count:");
        A0o2.append(this.A2f.getHeaderViewsCount());
        A0o2.append(" first-pos:");
        A0o2.append(firstPosition);
        boolean z2 = z;
        C18260x0.A1E(" up:", A0o2, z);
        if (firstPosition < 0) {
            A14();
            return;
        }
        C87234On A0A2 = A0A(this);
        C624134x A052 = A0A2.getItem(firstPosition);
        if (A052 != null) {
            if (A052.A1J.A00 == null) {
                Log.i("conversation/search/divider-at-search-position");
                A052 = A0A2.getItem(firstPosition + 1);
                if (A052 == null) {
                    Log.w("conversation/search/first-message-is-null");
                    return;
                }
            }
            C33891tr r0 = this.A2i;
            if (r0 != null) {
                r0.A0D(true);
            }
            C56532s8 r2 = this.A55;
            if (r2 == null) {
                r2 = this.A3i.A09(this.A4J);
                this.A55 = r2;
            }
            AnonymousClass4VQ r12 = this.A3B;
            r2.A05(r12.A0I);
            r2.A06(r12.A0K);
            C56612sH time = this.A2z.getTime();
            C56362rr r5 = this.A3l;
            C66533Lu r4 = this.A3i;
            AnonymousClass676 r13 = this.A2z;
            this.A2i = new C33891tr(r13, time, r13.getCoreMessageStore(), r4, r5, A052, this.A55, r13.getFMessageDatabase(), z2);
            C86614Ku.A1R(this.A2i, A0G(this));
        }
    }

    public final void A2N(boolean z) {
        if (this.A0B != null) {
            int dimensionPixelSize = this.A2z.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            int dimensionPixelSize2 = this.A2z.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            View view = this.A0B;
            int i = 0;
            if (!z) {
                i = dimensionPixelSize2;
                dimensionPixelSize2 = 0;
            }
            view.setPadding(dimensionPixelSize, i, dimensionPixelSize, dimensionPixelSize2);
        }
    }

    public final void A2O(boolean z) {
        ExpressionsBottomSheetView expressionsBottomSheetView = this.A40;
        if (expressionsBottomSheetView != null) {
            expressionsBottomSheetView.setVisibility(0);
            this.A40.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass6BP(1, this, z));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r0.A1J.A02 != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A2P(boolean r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0009
            com.whatsapp.tosgating.viewmodel.ToSGatingViewModel r0 = r5.A5P
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            X.043 r0 = r5.A0o
            if (r0 == 0) goto L_0x0010
            r0.dismiss()
        L_0x0010:
            com.whatsapp.tosgating.viewmodel.ToSGatingViewModel r2 = r5.A5P
            X.4uZ r0 = r5.A4J
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A03(r0)
            X.2rV r0 = r2.A04
            X.34x r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x0027
            X.2z0 r0 = r0.A1J
            boolean r0 = r0.A02
            r4 = 1
            if (r0 == 0) goto L_0x0028
        L_0x0027:
            r4 = 0
        L_0x0028:
            X.676 r0 = r5.A2z
            android.view.LayoutInflater r1 = r0.getLayoutInflater()
            r0 = 2131624718(0x7f0e030e, float:1.8876624E38)
            r2 = 0
            android.view.View r1 = r1.inflate(r0, r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131894363(0x7f12205b, float:1.9423529E38)
            r1.setText(r0)
            X.4eZ r0 = A09(r5)
            X.0zH r3 = X.AnonymousClass5V0.A00(r0)
            r3.A0Z(r1)
            com.whatsapp.tosgating.viewmodel.ToSGatingViewModel r0 = r5.A5P
            X.2sr r0 = r0.A03
            boolean r0 = r0.A0Y()
            if (r0 == 0) goto L_0x0095
            r0 = 2131894362(0x7f12205a, float:1.9423527E38)
            if (r4 == 0) goto L_0x005b
            r0 = 2131894356(0x7f122054, float:1.9423514E38)
        L_0x005b:
            r3.A0T(r0)
            X.676 r0 = r5.A2z
            X.2sr r0 = r0.getMeManager()
            boolean r0 = r0.A0Y()
            if (r0 == 0) goto L_0x007f
            r0 = 2131891393(0x7f1214c1, float:1.9417505E38)
            r3.setPositiveButton(r0, r2)
        L_0x0070:
            X.043 r0 = r3.create()
            r5.A0o = r0
            r0.show()
            com.whatsapp.tosgating.viewmodel.ToSGatingViewModel r1 = r5.A5P
            r0 = 1
            r1.A00 = r0
            return
        L_0x007f:
            r1 = 2131894360(0x7f122058, float:1.9423523E38)
            r0 = 40
            X.C1235268t.A02(r3, r5, r0, r1)
            r2 = 2131894359(0x7f122057, float:1.942352E38)
            r1 = 30
            X.90b r0 = new X.90b
            r0.<init>(r5, r1)
            r3.setNegativeButton(r2, r0)
            goto L_0x0070
        L_0x0095:
            r0 = 2131894361(0x7f122059, float:1.9423525E38)
            if (r4 == 0) goto L_0x005b
            r0 = 2131894355(0x7f122053, float:1.9423512E38)
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113245l7.A2P(boolean):void");
    }

    public boolean A2Q() {
        AnonymousClass5ZT r0 = this.A5q;
        if (r0 == null || r0.A0L == null) {
            return false;
        }
        return true;
    }

    public boolean A2R() {
        if (this.A0q == null) {
            this.A2z.B3M();
            this.A55 = this.A3i.A09(this.A4J);
            A0G(this).BkP(C117615sD.A00(this, 18));
            if (!this.A4E.A0F()) {
                if (this.A39 == null) {
                    ConversationSearchViewModel conversationSearchViewModel = (ConversationSearchViewModel) A06(this).A01(ConversationSearchViewModel.class);
                    this.A39 = conversationSearchViewModel;
                    C15910sA A052 = A05(this);
                    C1897492m A0G2 = AnonymousClass4L0.A0G(this, 211);
                    C162457s7.A0J(A052, 0);
                    conversationSearchViewModel.A00.A0B(A052, A0G2);
                    ConversationSearchViewModel conversationSearchViewModel2 = this.A39;
                    C15910sA A053 = A05(this);
                    C1897492m A0G3 = AnonymousClass4L0.A0G(this, 212);
                    C162457s7.A0J(A053, 0);
                    conversationSearchViewModel2.A01.A0B(A053, A0G3);
                    ConversationSearchViewModel conversationSearchViewModel3 = this.A39;
                    C15910sA A054 = A05(this);
                    C1897492m A0G4 = AnonymousClass4L0.A0G(this, 213);
                    C162457s7.A0J(A054, 0);
                    conversationSearchViewModel3.A02.A0B(A054, A0G4);
                    ConversationSearchViewModel conversationSearchViewModel4 = this.A39;
                    C15910sA A055 = A05(this);
                    C1897492m A0G5 = AnonymousClass4L0.A0G(this, 214);
                    C162457s7.A0J(A055, 0);
                    conversationSearchViewModel4.A04.A0B(A055, A0G5);
                    ConversationSearchViewModel conversationSearchViewModel5 = this.A39;
                    C15910sA A056 = A05(this);
                    AnonymousClass6C6 A002 = AnonymousClass6C6.A00(this, 197);
                    C162457s7.A0J(A056, 0);
                    conversationSearchViewModel5.A03.A0B(A056, A002);
                }
                C08270df A042 = A04(this);
                C08310eF A0D2 = A042.A0D("search_fragment_conversation");
                ViewGroup viewGroup = this.A0Y;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                if (A0D2 == null && !A09(this).isFinishing() && !A09(this).isDestroyed()) {
                    A0D2 = new ConversationSearchFragment();
                    C86614Ku.A1M(A0D2, A042, "search_fragment_conversation");
                }
                ConversationSearchFragment conversationSearchFragment = (ConversationSearchFragment) A0D2;
                ConversationSearchViewModel conversationSearchViewModel6 = this.A39;
                C162457s7.A0J(conversationSearchViewModel6, 0);
                conversationSearchFragment.A02 = conversationSearchViewModel6;
                WDSConversationSearchView wDSConversationSearchView = conversationSearchFragment.A05;
                if (wDSConversationSearchView != null) {
                    wDSConversationSearchView.A00();
                }
                String str = this.A3B.A0J;
                WDSConversationSearchView wDSConversationSearchView2 = conversationSearchFragment.A05;
                if (wDSConversationSearchView2 != null) {
                    wDSConversationSearchView2.setText((CharSequence) str);
                }
                DatePickerDialog.OnDateSetListener onDateSetListener = this.A6n;
                C162457s7.A0J(onDateSetListener, 0);
                conversationSearchFragment.A00 = onDateSetListener;
                A1V(this.A00);
            } else {
                C16910uE r1 = this.A0p;
                if (r1 == null) {
                    r1 = new C1238369y(this, 3);
                    this.A0p = r1;
                }
                this.A0q = this.A2z.Bpz(r1);
            }
            AnonymousClass5ZT r12 = this.A5q;
            if (r12 == null || (r12.A0L == null && !C86604Kt.A1Y(r12.A1D.A0B))) {
                this.A0D.setVisibility(8);
                A2T();
            }
            if (!C105895Wv.A01(this)) {
                InputMethodManager A0Q2 = this.A2z.getSystemServices().A0Q();
                C626936e.A06(A0Q2);
                A0Q2.toggleSoftInput(0, 0);
            }
            C89214c6 r0 = this.A2a.A02;
            if (r0 != null && r0.isShowing()) {
                this.A2a.A0F();
            }
        }
        return false;
    }

    public final boolean A2T() {
        this.A4o.A04(false);
        C94264qq r0 = this.A45;
        if (r0 != null && r0.isShowing()) {
            this.A45.dismiss();
            return true;
        } else if (!A2X()) {
            return false;
        } else {
            A0d();
            return true;
        }
    }

    public final boolean A2U() {
        if (!this.A6V || 3 != this.A3d.A06(AnonymousClass34R.A01(this.A4J))) {
            return false;
        }
        return true;
    }

    public final boolean A2W() {
        if (this.A4E.A0E() || !A2X() || !this.A41.A0Q(6409).contains(C999358t.USE_KEYBOARD_LISTENER.value)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        if (r3 == false) goto L_0x0068;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:29:0x0062=Splitter:B:29:0x0062, B:25:0x0059=Splitter:B:25:0x0059} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A2Y() {
        /*
            r9 = this;
            X.5dt r1 = r9.A2P
            r4 = 1
            r8 = 0
            if (r1 == 0) goto L_0x000f
            boolean r0 = r1.A0d
            if (r0 != 0) goto L_0x000e
            int r0 = r1.A00
        L_0x000c:
            if (r0 != r4) goto L_0x007b
        L_0x000e:
            return r4
        L_0x000f:
            X.4uZ r0 = r9.A4J
            com.whatsapp.jid.UserJid r7 = X.AnonymousClass32Y.A03(r0)
            if (r7 == 0) goto L_0x0093
            X.3ZH r0 = r9.A3n
            if (r0 == 0) goto L_0x0093
            boolean r0 = r0.A0R()
            if (r0 == 0) goto L_0x0093
            X.676 r0 = r9.A2z
            X.33g r0 = r0.getBusinessProfileManager()
            X.56I r0 = r0.A0A
            java.lang.String r6 = r7.getRawString()
            X.1RI r0 = r0.A00
            X.4GK r5 = r0.get()
            java.lang.String r2 = "SELECT welcome_message_protocol_mode FROM wa_biz_profiles WHERE jid = ?"
            r3 = 1
            java.lang.String[] r1 = new java.lang.String[r4]     // Catch:{ all -> 0x0089 }
            r1[r8] = r6     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = "GET_BUSINESS_WELCOME_MESSAGE_PROTOCOL_MODE"
            android.database.Cursor r2 = X.AnonymousClass361.A0A(r5, r2, r0, r1)     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = "welcome_message_protocol_mode"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x007d }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0062
            boolean r0 = r2.isNull(r1)     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x0062
            int r0 = r2.getInt(r1)     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x0059
            r3 = 0
        L_0x0059:
            r2.close()     // Catch:{ all -> 0x0089 }
            r5.close()
            if (r3 != 0) goto L_0x000e
            goto L_0x0068
        L_0x0062:
            r2.close()     // Catch:{ all -> 0x0089 }
            r5.close()
        L_0x0068:
            X.676 r0 = r9.A2z
            X.33g r0 = r0.getBusinessProfileManager()
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A05(r7)
            if (r1 == 0) goto L_0x007b
            X.56I r0 = r0.A0A
            int r0 = r0.A00(r1)
            goto L_0x000c
        L_0x007b:
            r4 = 0
            return r4
        L_0x007d:
            r1 = move-exception
            if (r2 == 0) goto L_0x0088
            r2.close()     // Catch:{ all -> 0x0084 }
            goto L_0x0088
        L_0x0084:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0089 }
        L_0x0088:
            throw r1     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x008e }
            throw r1
        L_0x008e:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0093:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113245l7.A2Y():boolean");
    }

    public boolean A2a(int i, KeyEvent keyEvent) {
        AnonymousClass5ZT r0;
        Iterator it = this.A7N.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (!keyEvent.isPrintingKey() || !this.A4P.isShown() || this.A4P.hasFocus() || ((r0 = this.A5q) != null && r0.A0L != null)) {
            return this.A2z.Bda(i, keyEvent);
        }
        this.A4P.requestFocus();
        this.A4P.dispatchKeyEvent(keyEvent);
        return true;
    }

    public boolean A2b(int i, KeyEvent keyEvent) {
        ExpressionsBottomSheetView expressionsBottomSheetView;
        BottomSheetBehavior bottomSheetBehavior;
        if (i == 82 || i == 4) {
            if (A2X() && (expressionsBottomSheetView = this.A40) != null && expressionsBottomSheetView.getVisibility() != 8 && (bottomSheetBehavior = this.A0t) != null) {
                bottomSheetBehavior.A0S(5);
                return false;
            } else if (!A2X() && A2T()) {
                return false;
            } else {
                if (C86614Ku.A1Y(this.A41) && this.A2a.A0F()) {
                    return false;
                }
            }
        }
        if (this.A6U) {
            if (i == 23) {
                if (keyEvent.getAction() == 1 && A2Q()) {
                    AnonymousClass5ZT r1 = this.A5q;
                    if (!r1.A12.A08) {
                        r1.A0S(true, this.A6P);
                        return true;
                    }
                }
            } else if (A2Q()) {
                AnonymousClass5ZT r12 = this.A5q;
                if (!r12.A12.A08) {
                    if (i == 19) {
                        r12.A0O(this.A6P);
                        return true;
                    } else if (i == 21) {
                        r12.A0S(false, this.A6P);
                        return true;
                    }
                }
            }
        }
        return this.A2z.Bdb(i, keyEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0118, code lost:
        if (r10.A0t.A0O != 2) goto L_0x0100;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A2c(android.view.MotionEvent r11) {
        /*
            r10 = this;
            java.lang.String r3 = "conversation/dispatch-touch-event "
            X.4On r0 = A0A(r10)
            boolean r0 = r0.A0F
            r2 = 0
            if (r0 == 0) goto L_0x0019
            X.676 r0 = r10.A2z
            X.5mA r0 = r0.getMessageAudioPlayerProvider()
            X.5pj r0 = r0.A00
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.A0S
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            return r2
        L_0x001a:
            X.0N1 r0 = r10.A0s
            r1 = 1
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.A00(r11)
            if (r0 == 0) goto L_0x0026
            return r1
        L_0x0026:
            int r0 = r11.getAction()
            if (r0 != 0) goto L_0x002e
            r10.A6O = r2
        L_0x002e:
            boolean r0 = r10.A2X()
            if (r0 != 0) goto L_0x0071
            X.4qu r0 = r10.A46
            if (r0 == 0) goto L_0x0071
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0071
            android.view.View r0 = r10.A0D
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L_0x0071
            android.view.View r0 = r10.A0D
            int[] r6 = r10.A7P
            r0.getLocationOnScreen(r6)
            float r4 = r11.getRawY()
            r0 = r6[r1]
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0071
            float r5 = r11.getRawY()
            r4 = r6[r1]
            android.view.View r0 = r10.A0D
            int r0 = X.C86664Kz.A0C(r0, r4)
            float r0 = (float) r0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0071
            int r0 = r11.getAction()
            if (r0 != 0) goto L_0x011b
            r10.A6l = r1
        L_0x0071:
            int r0 = r11.getActionMasked()
            r4 = 2
            if (r0 == r4) goto L_0x0133
            int r0 = r11.getActionMasked()
            if (r0 == r1) goto L_0x0133
            boolean r0 = r10.A2X()
            if (r0 == 0) goto L_0x0133
            float r9 = r11.getX()
            float r8 = r11.getY()
            com.whatsapp.mentions.MentionableEntry r0 = r10.A4P
            if (r0 == 0) goto L_0x0133
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L_0x0133
            int[] r1 = new int[r4]
            com.whatsapp.mentions.MentionableEntry r0 = r10.A4P
            r0.getLocationInWindow(r1)
            r6 = r1[r2]
            r7 = 1
            r1 = r1[r7]
            boolean r0 = r10.A6Q
            if (r0 == 0) goto L_0x00bc
            X.676 r5 = r10.A2z
            r0 = 2131433839(0x7f0b196f, float:1.8489475E38)
            android.view.View r0 = r5.findViewById(r0)
            if (r0 == 0) goto L_0x00bc
            int[] r5 = new int[r4]
            r0.getLocationInWindow(r5)
            r0 = r5[r2]
            int r6 = r6 - r0
            r0 = r5[r7]
            int r1 = r1 - r0
        L_0x00bc:
            float r0 = (float) r6
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0133
            com.whatsapp.mentions.MentionableEntry r0 = r10.A4P
            int r0 = r0.getWidth()
            int r6 = r6 + r0
            float r0 = (float) r6
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0133
            float r0 = (float) r1
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0133
            com.whatsapp.mentions.MentionableEntry r0 = r10.A4P
            int r0 = X.C86664Kz.A0C(r0, r1)
            float r0 = (float) r0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0133
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r10.A0t
            if (r0 == 0) goto L_0x0133
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r10.A40
            if (r0 == 0) goto L_0x0133
            com.whatsapp.KeyboardPopupLayout r0 = r10.A1a
            boolean r0 = r0.A07
            if (r0 != 0) goto L_0x0019
            boolean r0 = r10.A2X()
            if (r0 == 0) goto L_0x0104
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = r10.A3v
            if (r0 == 0) goto L_0x0104
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0104
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = r10.A3v
            r0.A00()
        L_0x0100:
            r10.A1H()
            goto L_0x0133
        L_0x0104:
            boolean r0 = r10.A2X()
            if (r0 == 0) goto L_0x0133
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r10.A40
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0133
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r10.A0t
            int r0 = r0.A0O
            if (r0 == r4) goto L_0x0133
            goto L_0x0100
        L_0x011b:
            int r0 = r11.getAction()
            if (r0 != r1) goto L_0x0071
            boolean r0 = r10.A6l
            if (r0 == 0) goto L_0x012f
            X.4qu r0 = r10.A46
            r0.A01(r1)
            android.view.View r0 = r10.A0D
            r0.requestFocus()
        L_0x012f:
            r10.A6l = r2
            goto L_0x0071
        L_0x0133:
            X.676 r0 = r10.A2z     // Catch:{ ActivityNotFoundException -> 0x013f, ArrayIndexOutOfBoundsException | IllegalArgumentException -> 0x013a }
            boolean r0 = r0.BqJ(r11)     // Catch:{ ActivityNotFoundException -> 0x013f, ArrayIndexOutOfBoundsException | IllegalArgumentException -> 0x013a }
            return r0
        L_0x013a:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            return r2
        L_0x013f:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            X.3Wi r1 = A07(r10)
            r0 = 2131886316(0x7f1200ec, float:1.9407207E38)
            r1.A0H(r0, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113245l7.A2c(android.view.MotionEvent):boolean");
    }

    public boolean A2e(C624134x r4) {
        if (this.A2z.getSeenMessages().contains(r4.A1J)) {
            return false;
        }
        C87234On A0A2 = A0A(this);
        if (A0A2.A03(r4) > A0A2.A01()) {
            return true;
        }
        return A0A2.A08.contains(r4);
    }

    public static void A0I(View view, C113245l7 r3) {
        String string = view.getResources().getString(R.string.f11nameremoved);
        r3.A0f.setImageResource(R.drawable.ib_emoji);
        r3.A0f.setContentDescription(string);
        r3.A1a.getLayoutParams().height = -1;
        r3.A1a.requestLayout();
    }

    public static void A0K(C113245l7 r2) {
        if (r2.A2Q()) {
            AnonymousClass5ZT r22 = r2.A5q;
            C626936e.A06(r22);
            Log.i("VoiceNoteRecordingUI/onPauseActivity/");
            if (r22.A0v.A0X(4166)) {
                r22.A0Q(r22.A0U());
            } else {
                r22.A05();
            }
        }
    }

    public static /* synthetic */ void A0M(C113245l7 r3, int i) {
        Drawable drawable;
        ImageView A0u2 = C86664Kz.A0u(A09(r3), R.id.payment_button);
        Context context = A0u2.getContext();
        int A002 = C195219Wq.A00(r3.A4c.A02());
        if (A002 != 0) {
            drawable = AnonymousClass0RP.A00(context, A002);
        } else {
            drawable = null;
        }
        A0u2.setImageDrawable(drawable);
        C109695f2.A00(A0u2, r3, i, 7);
        r3.A0G = C005205m.A00(A09(r3), R.id.payment_button_nux);
    }

    public static /* synthetic */ void A0N(C113245l7 r1, Boolean bool) {
        if (bool.booleanValue()) {
            PaymentMerchantUpsellEducationBottomSheet paymentMerchantUpsellEducationBottomSheet = new PaymentMerchantUpsellEducationBottomSheet();
            paymentMerchantUpsellEducationBottomSheet.A1P(false);
            AnonymousClass344.A02(paymentMerchantUpsellEducationBottomSheet, A04(r1), "PaymentMerchantUpsellEducationBottomSheet");
        }
    }

    public final float A0R() {
        return Settings.Global.getFloat(A09(this).getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public final int A0S() {
        int i = R.dimen.f6nameremoved;
        if (((AnonymousClass5JD) this.A63.get()).A03.A01()) {
            i = R.dimen.f6nameremoved;
        }
        return this.A2z.getResources().getDimensionPixelSize(i);
    }

    public final int A0T() {
        if (AnonymousClass5KY.A00(this).BH2(this.A4J)) {
            return 6;
        }
        if (A0Q(this)) {
            return 5;
        }
        return 0;
    }

    public final int A0U() {
        AnonymousClass0XY A062;
        int i = 0;
        if (!C105895Wv.A01(this)) {
            return 0;
        }
        Activity activity = (Activity) C116885r1.A00(this.A0C.getContext());
        if (!(activity == null || (A062 = C06560Yg.A06(AnonymousClass001.A0Q(activity))) == null)) {
            C05640Uh r2 = A062.A00;
            i = r2.A0C(8).A00 - r2.A0C(2).A00;
        }
        int height = this.A0C.getRootView().getHeight();
        if (i <= 0) {
            Rect A0N2 = AnonymousClass001.A0N();
            this.A0C.getWindowVisibleDisplayFrame(A0N2);
            i = height - A0N2.bottom;
            if (i <= 0) {
                return this.A0C.getResources().getDimensionPixelOffset(R.dimen.f6nameremoved);
            }
        }
        return Math.max(i, (int) (((float) height) * 0.3f));
    }

    public void A0d() {
        ExpressionsBottomSheetView expressionsBottomSheetView;
        BottomSheetBehavior bottomSheetBehavior;
        if (A2X() && (expressionsBottomSheetView = this.A40) != null && expressionsBottomSheetView.getVisibility() != 8 && (bottomSheetBehavior = this.A0t) != null) {
            bottomSheetBehavior.A0S(5);
        }
    }

    public void A0g() {
        KeyEvent.Callback callback;
        Intent A012 = A01(this);
        if (A012 != null && A012.getIntExtra("calling-tooltip-scenario", 0) == 1) {
            AnonymousClass5G9 r0 = this.A36;
            AnonymousClass676 r6 = this.A2z;
            ViewGroup viewGroup = this.A0U;
            Toolbar toolbar = this.A0r;
            int i = this.A04;
            C162457s7.A0J(r6, 0);
            AnonymousClass5JF r7 = r0.A00;
            AnonymousClass59J r8 = AnonymousClass59J.A02;
            TextView textView = r7.A01;
            if (textView == null) {
                ViewStub viewStub = (ViewStub) r6.findViewById(R.id.tooltip_view_stub);
                textView = null;
                if (viewStub != null) {
                    callback = viewStub.inflate();
                } else {
                    callback = null;
                }
                if (callback instanceof TextView) {
                    textView = (TextView) callback;
                }
                r7.A01 = textView;
                if (textView == null) {
                    return;
                }
            }
            if (viewGroup != null) {
                View childAt = viewGroup.getChildAt(0);
                childAt.getViewTreeObserver().addOnGlobalLayoutListener(new C110045fb(childAt, viewGroup, textView, toolbar, r6, r7, r8, i));
            }
        }
    }

    public void A0i() {
        C94294qu r0;
        ExpressionsBottomSheetView expressionsBottomSheetView;
        BottomSheetBehavior bottomSheetBehavior;
        C08310eF A0D2;
        C08270df A042 = A04(this);
        if (A042.A07() == 1 && (A0D2 = A042.A0D("search_fragment_conversation")) != null && A0D2.A19()) {
            A13();
        } else if (A2X() && (expressionsBottomSheetView = this.A40) != null && expressionsBottomSheetView.getVisibility() != 8 && (bottomSheetBehavior = this.A0t) != null) {
            bottomSheetBehavior.A0S(5);
        } else if (A2X() || (r0 = this.A46) == null || !r0.A03()) {
            AnonymousClass66v r1 = this.A5l;
            if (r1 == null || !r1.B8N() || !r1.B8M()) {
                C106735a4 r12 = this.A51;
                if (r12 != null) {
                    r12.A0B(false, false);
                }
                Class<C95814uZ> cls = C95814uZ.class;
                if (!(A7S.get(this.A3n.A0I(cls)) == null && this.A6D == null)) {
                    this.A3P.A02.A01(AnonymousClass32Y.A03(this.A4J), 7);
                }
                boolean booleanExtra = A01(this).getBooleanExtra("fb_share_wa_redirect", false);
                if ((this.A2z.isTaskRoot() || A01(this).getBooleanExtra("fb_share_wa_redirect", false)) && !A09(this).getComponentName().getClassName().equals("com.whatsapp.HomeActivity")) {
                    Intent A022 = C627736r.A02(A09(this));
                    if (booleanExtra) {
                        A022.putExtra("fb_share_wa_redirect", true);
                    }
                    this.A2z.finishAndRemoveTask();
                    this.A2z.startActivity(A022);
                    return;
                }
                AnonymousClass31A A012 = C56982ss.A01(this.A3d, this.A3n.A0I(cls));
                if (A012 != null && A012.A0p) {
                    this.A3Z.A03(AnonymousClass3ZH.A02(this.A3n, cls));
                }
                this.A62.get();
                this.A2z.BdV();
                return;
            }
            r1.B2u(false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0m() {
        /*
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r5.A06 = r0
            r0 = 1
            r5.A6m = r0
            r5.A1A()
            X.676 r0 = r5.A2z
            X.5mA r0 = r0.getMessageAudioPlayerProvider()
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x0021
            X.676 r0 = r5.A2z
            X.5mA r0 = r0.getMessageAudioPlayerProvider()
            r0.A03()
        L_0x0021:
            X.676 r0 = r5.A2z
            X.5mA r0 = r0.getMessageAudioPlayerProvider()
            X.C107465bM.A07(r0)
            X.8qC r0 = r5.A62
            X.5Xj r4 = X.C86664Kz.A1G(r0)
            X.676 r0 = r5.A2z
            android.view.View r0 = r0.getContentView()
            boolean r2 = X.C106035Xj.A01(r0)
            X.5mA r0 = r4.A07
            boolean r1 = r0.A0B()
            r3 = 0
            r0 = 1
            if (r2 != 0) goto L_0x00db
            if (r1 == 0) goto L_0x00d3
            r4.A05 = r0
            r4.A04 = r3
        L_0x004a:
            r4.A03 = r0
        L_0x004c:
            X.3ZH r1 = r5.A3n
            if (r1 == 0) goto L_0x0076
            com.whatsapp.mentions.MentionableEntry r0 = r5.A4P
            if (r0 == 0) goto L_0x0076
            java.util.HashMap r2 = X.AnonymousClass2C1.A02
            java.lang.Class<X.4uZ> r4 = X.C95814uZ.class
            com.whatsapp.jid.Jid r1 = r1.A0I(r4)
            com.whatsapp.mentions.MentionableEntry r0 = r5.A4P
            java.lang.String r0 = r0.getStringText()
            r2.put(r1, r0)
            java.util.HashMap r2 = A7T
            X.3ZH r0 = r5.A3n
            com.whatsapp.jid.Jid r1 = r0.A0I(r4)
            com.whatsapp.mentions.MentionableEntry r0 = r5.A4P
            java.lang.String r0 = X.AnonymousClass4SQ.A00(r0)
            r2.put(r1, r0)
        L_0x0076:
            com.whatsapp.conversation.ConversationListView r0 = r5.A2f
            if (r0 == 0) goto L_0x0090
            X.4On r2 = r0.getConversationCursorAdapter()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "conversation/pause/appended/count "
            r1.append(r0)
            X.6aY r0 = r2.A08
            int r0 = r0.size()
            X.C18260x0.A1F(r1, r0)
        L_0x0090:
            android.os.Handler r0 = r5.A0A
            if (r0 == 0) goto L_0x00b0
            boolean r0 = r0.hasMessages(r3)
            if (r0 == 0) goto L_0x00b0
            android.os.Handler r0 = r5.A0A
            r0.removeMessages(r3)
            X.676 r0 = r5.A2z
            X.33i r0 = r0.getSystemServices()
            android.os.PowerManager r0 = r0.A0J()
            if (r0 != 0) goto L_0x00c7
            java.lang.String r0 = "conversation/pause pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00b0:
            X.5rC r1 = r5.A0w
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x00e1
            r1.A04()
            X.676 r0 = r5.A2z
            r0.getActivity()
            java.lang.String r0 = "unregisterActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x00c7:
            boolean r0 = r0.isScreenOn()
            if (r0 == 0) goto L_0x00b0
            android.os.Handler r0 = r5.A0A
            r0.sendEmptyMessage(r3)
            goto L_0x00b0
        L_0x00d3:
            r4.A05 = r3
            r4.A04 = r3
            r4.A03 = r3
            goto L_0x004c
        L_0x00db:
            r4.A05 = r0
            r4.A04 = r0
            goto L_0x004a
        L_0x00e1:
            X.5a4 r2 = r5.A51
            if (r2 == 0) goto L_0x00fa
            boolean r0 = r2.A0H
            if (r0 == 0) goto L_0x013b
            X.4xc r1 = r2.A0x
            X.8uW r0 = r2.A0w
            r1.A07(r0)
            r1 = 27
            X.3bq r0 = new X.3bq
            r0.<init>((java.lang.Object) r2, (int) r1)
            r2.A0A(r0)
        L_0x00fa:
            A0J(r5)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x010b
            X.676 r0 = r5.A2z
            boolean r0 = r0.isInMultiWindowMode()
            if (r0 != 0) goto L_0x010e
        L_0x010b:
            A0K(r5)
        L_0x010e:
            X.4uZ r0 = r5.A4J
            boolean r0 = r0 instanceof X.C95804uY
            if (r0 == 0) goto L_0x013a
            X.5LO r0 = A0C(r5)
            X.8qC r0 = r0.A0E
            java.lang.Object r3 = r0.get()
            X.2qQ r3 = (X.C55482qQ) r3
            X.4uZ r1 = r5.A4J
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            X.4uY r0 = r3.A00
            boolean r0 = X.C162457s7.A0P(r0, r1)
            if (r0 == 0) goto L_0x013a
            X.4FS r2 = r3.A06
            r1 = 35
            X.3Zo r0 = new X.3Zo
            r0.<init>(r3, r1)
            r2.BkM(r0)
        L_0x013a:
            return
        L_0x013b:
            r2.A0B(r3, r3)
            goto L_0x00fa
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113245l7.A0m():void");
    }

    public void A0r() {
        boolean A0Q2 = A0Q(this);
        int i = R.string.f11nameremoved;
        if (A0Q2) {
            i = R.string.f11nameremoved;
        }
        this.A4P.setHint(this.A2z.getString(i));
    }

    public final void A0u() {
        ExpressionsBottomSheetView expressionsBottomSheetView;
        BottomSheetBehavior bottomSheetBehavior;
        if (A2X() && (expressionsBottomSheetView = this.A40) != null && expressionsBottomSheetView.getVisibility() != 8 && (bottomSheetBehavior = this.A0t) != null && bottomSheetBehavior.A0O == 3) {
            bottomSheetBehavior.A0S(4);
        }
    }

    public final void A13() {
        C08310eF A0D2;
        Window window;
        C08270df A042 = A04(this);
        if (A042.A07() == 1 && (A0D2 = A042.A0D("search_fragment_conversation")) != null && A0D2.A19()) {
            ConversationSearchFragment conversationSearchFragment = (ConversationSearchFragment) A04(this).A0D("search_fragment_conversation");
            if (conversationSearchFragment != null) {
                C003203q A0Q2 = conversationSearchFragment.A0Q();
                if (!(A0Q2 == null || (window = A0Q2.getWindow()) == null)) {
                    C107405bG.A0C(window, false);
                }
                ConversationSearchViewModel conversationSearchViewModel = conversationSearchFragment.A02;
                if (conversationSearchViewModel != null) {
                    conversationSearchViewModel.A00.A0H("");
                }
                WDSConversationSearchView wDSConversationSearchView = conversationSearchFragment.A05;
                if (wDSConversationSearchView != null) {
                    EditText editText = wDSConversationSearchView.A02;
                    InputMethodManager A0Q3 = wDSConversationSearchView.getSystemServices().A0Q();
                    if (A0Q3 != null) {
                        C86644Kx.A14(editText, A0Q3);
                    }
                }
                WDSConversationSearchView wDSConversationSearchView2 = conversationSearchFragment.A05;
                if (wDSConversationSearchView2 != null) {
                    AnonymousClass68Q r1 = conversationSearchFragment.A07;
                    C162457s7.A0J(r1, 0);
                    wDSConversationSearchView2.A02.removeTextChangedListener(r1);
                }
            }
            A04(this).A0m("search_fragment_conversation", 1);
            C86604Kt.A1A(this.A0Y);
            A1V(this.A00);
            A1V(this.A00);
        }
        if (this.A4E.A0F() && (A09(this) instanceof C89154bn)) {
            ((C89154bn) A09(this)).A7B(0);
        }
        AnonymousClass4VQ r12 = this.A3B;
        r12.A0I = null;
        r12.A0K = null;
        this.A55 = null;
        C86644Kx.A1P(this.A5d);
        if (this.A37.A0F()) {
            this.A4P.A05();
        } else {
            this.A0D.setVisibility(0);
            this.A4P.requestFocus();
        }
        C87234On.A00(this.A2f, this);
    }

    public final void A14() {
        EditText editText;
        EditText editText2;
        A07(this).A0H(R.string.f11nameremoved, 0);
        if (!this.A4E.A0F()) {
            ConversationSearchFragment conversationSearchFragment = (ConversationSearchFragment) A04(this).A0D("search_fragment_conversation");
            if (conversationSearchFragment != null) {
                WDSConversationSearchView wDSConversationSearchView = conversationSearchFragment.A05;
                if (!(wDSConversationSearchView == null || (editText2 = wDSConversationSearchView.A02) == null)) {
                    editText2.sendAccessibilityEvent(8);
                }
                WDSConversationSearchView wDSConversationSearchView2 = conversationSearchFragment.A05;
                if (!(wDSConversationSearchView2 == null || (editText = wDSConversationSearchView2.A02) == null)) {
                    editText.requestFocus();
                }
                WDSConversationSearchView wDSConversationSearchView3 = conversationSearchFragment.A05;
                if (wDSConversationSearchView3 != null) {
                    wDSConversationSearchView3.A00();
                    return;
                }
                return;
            }
            return;
        }
        this.A1m.sendAccessibilityEvent(8);
        this.A1m.requestFocus();
        this.A1m.A07(false);
    }

    public final void A19() {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("conversation/session/active/jid ");
        C18260x0.A0m(this.A4J, A0o2);
        C44382Vv r4 = this.A35;
        AnonymousClass676 r3 = this.A2z;
        r4.A00.set(new C48962fl(r3, r3.getScreenLockStateProvider(), true));
    }

    public final void A1G() {
        C89214c6 r0;
        AnonymousClass4TE r2;
        if (C105895Wv.A01(this)) {
            this.A1a.A07 = true;
            this.A6M = true;
            this.A6j = true;
            if (!A2W() || (r2 = this.A4D) == null) {
                A0e();
                this.A1a.postDelayed(C117615sD.A00(this, 42), (long) ((int) (A0R() * 50.0f)));
                this.A1a.postDelayed(C117615sD.A00(this, 43), (long) ((int) (A0R() * 300.0f)));
                return;
            }
            r2.A01 = new C1896792f(this, 11);
            r2.A00 = new C1896792f(this, 12);
            A0e();
            return;
        }
        if (C86614Ku.A1Y(this.A41) && (r0 = this.A2a.A02) != null && r0.isShowing()) {
            this.A1a.A07 = true;
            this.A2a.A0F();
        }
        A2O(true);
    }

    public final void A1I() {
        A0c();
        MentionableEntry mentionableEntry = this.A4P;
        if (mentionableEntry != null) {
            mentionableEntry.requestFocus();
        }
        A0I(this.A1a, this);
    }

    public final void A1J() {
        boolean A2V2 = A2V();
        C89644eZ A092 = A09(this);
        AnonymousClass1VX r0 = this.A41;
        C620733j r3 = this.A3L;
        if (A2V2) {
            WaImageButton A012 = AnonymousClass5V8.A01(A092, r0);
            if (A012.getVisibility() != 8) {
                A012.setVisibility(8);
                if (A012.getId() == R.id.input_attach_button_left) {
                    View A002 = C005205m.A00(A092, R.id.entry);
                    C107555bV.A05(A002, r3, A092.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), A002.getPaddingEnd());
                    return;
                }
                return;
            }
            return;
        }
        WaImageButton A013 = AnonymousClass5V8.A01(A092, r0);
        if (A013.getVisibility() != 0) {
            A013.setVisibility(0);
            if (A013.getId() == R.id.input_attach_button_left) {
                View A003 = C005205m.A00(A092, R.id.entry);
                C107555bV.A05(A003, r3, 0, A003.getPaddingEnd());
            }
        }
    }

    public final void A1T(int i) {
        View view;
        if (A0E(this).A0X(834) && A2Z(i) && (view = this.A0G) != null && view.getVisibility() != 8) {
            AnonymousClass33p A0D2 = A0D(this);
            C18270x1.A0j(C18270x1.A03(A0D2), "payment_chat_composer_entry_nux_shown", A0D(this).A0b());
            ObjectAnimator objectAnimator = this.A08;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            this.A0G.setVisibility(8);
        }
    }

    public final void A1U(int i) {
        if (A0E(this).A0X(834) && A2Z(i)) {
            if (!A0D(this).A0b().equals(AnonymousClass0x9.A0v(AnonymousClass0x2.A0F(A0D(this)), "payment_chat_composer_entry_nux_shown"))) {
                View view = this.A0G;
                if (view != null) {
                    view.setVisibility(0);
                }
                ObjectAnimator objectAnimator = this.A08;
                if (objectAnimator == null) {
                    View view2 = this.A0G;
                    PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[3];
                    C86614Ku.A1V(new float[1], propertyValuesHolderArr, 1.4f);
                    propertyValuesHolderArr[2] = PropertyValuesHolder.ofFloat("alpha", new float[]{0.4f, 0.0f});
                    objectAnimator = ObjectAnimator.ofPropertyValuesHolder(view2, propertyValuesHolderArr);
                    this.A08 = objectAnimator;
                }
                objectAnimator.setDuration(1500);
                this.A08.setRepeatCount(-1);
                this.A08.setRepeatMode(1);
                this.A08.start();
                return;
            }
            A1T(i);
        }
    }

    public final void A1W(int i) {
        if (AnonymousClass5KY.A00(this).BH2(this.A4J)) {
            this.A0e.setVisibility(8);
        } else {
            this.A0e.setVisibility(i);
        }
    }

    public void A1c(Drawable drawable, View view) {
        ImageView imageView = new ImageView(A09(this));
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(4);
        imageView.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass6BJ(view, imageView, this, 1));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        this.A1a.addView(imageView, layoutParams);
    }

    public void A1e(Bundle bundle) {
        this.A69 = Boolean.valueOf(C105895Wv.A01(this));
        bundle.putBoolean("added_by_qr_code", this.A6H);
        bundle.putBoolean("has_number_from_url", this.A6P);
        bundle.putBoolean("has_text_from_url", this.A6R);
        bundle.putBoolean("keyboard_visible", this.A69.booleanValue());
        bundle.putBoolean("added_by_number_search", this.A3B.A0M);
        bundle.putLong("ephemeral_session_start", this.A3B.A0n.A00);
    }

    public final void A1j(TextEmojiLabel textEmojiLabel, boolean z) {
        CharSequence A002;
        C89644eZ A092 = A09(this);
        if (C18280x3.A00(this.A4C.A00.A0X(3180) ? 1 : 0) == 2) {
            ((LinearLayout) this.A0I).setOrientation(1);
            LinearLayout.LayoutParams A0C2 = C86624Kv.A0C();
            A0C2.gravity = 1;
            this.A1j.setLayoutParams(A0C2);
            this.A5v.setVisibility(0);
            this.A5v.setText(R.string.f11nameremoved);
            A002 = A092.getString(R.string.f11nameremoved);
            this.A5v.setOnClickListener(new C634239e(3, this, z));
        } else if (z) {
            A002 = A092.getString(R.string.f11nameremoved);
        } else {
            A002 = C107575bX.A00(A092, new Object[]{C107575bX.A04(A092, AnonymousClass5Yj.A02(A09(this), R.attr.f3nameremoved, R.color.f5nameremoved))}, R.string.f11nameremoved);
        }
        textEmojiLabel.setText(A002);
    }

    public void A1m(C182328oE r4, AnonymousClass39W r5) {
        Bundle A082 = AnonymousClass002.A08();
        A082.putParcelable("arg_select_list_content", r5);
        SelectListBottomSheet selectListBottomSheet = new SelectListBottomSheet();
        selectListBottomSheet.A0u(A082);
        selectListBottomSheet.A00 = r4;
        C89644eZ A092 = A09(this);
        if (A092 != null && (A092 instanceof AnonymousClass67A)) {
            C86644Kx.A1C(selectListBottomSheet, A092);
        }
    }

    public void A20(C624134x r3) {
        A22(r3, (C624134x) null, A0S());
    }

    public void A23(C624134x r13, AnonymousClass2z0 r14, AnonymousClass5NI r15, String str, String str2, Bitmap[] bitmapArr, int i) {
        Object[] A1X2 = AnonymousClass0x9.A1X();
        AnonymousClass2z0 r6 = r14;
        String str3 = str;
        String str4 = str2;
        C18260x0.A0i(r14, str3, str4, A1X2);
        String.format("conversation/initInlineVideoPlayback rowKey:%s fullUrl:%s canonicalUrl:%s", A1X2);
        if (A2Q()) {
            AnonymousClass5ZT r0 = this.A5q;
            C626936e.A06(r0);
            r0.A05();
        }
        AnonymousClass66v r3 = this.A5l;
        C624134x r5 = r13;
        AnonymousClass5NI r7 = r15;
        Bitmap[] bitmapArr2 = bitmapArr;
        int i2 = i;
        if (r3 == null || this.A5j == null) {
            AnonymousClass560 r2 = new AnonymousClass560(A09(this), this.A2f);
            this.A5j = r2;
            r2.A01 = this.A2z.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            C171028Fl r1 = new C171028Fl(this);
            this.A2H = r1;
            this.A2f.A05.A02(r1);
            this.A5j.getViewTreeObserver().addOnGlobalLayoutListener(new C110055fc(new C147247Dj(this), this, r5, r6, r7, str3, str4, bitmapArr2, i2));
            ((ViewGroup) A03(this).getDecorView()).addView(this.A5j, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        r3.B36(new C66513Ls(this.A1h, this.A4K, str3), r5, r6, r7, str3, str4, bitmapArr2, i2);
    }

    public void A24(C624134x r10, C46532bn r11) {
        C621033m A082 = A08(this);
        C95814uZ A0a2 = C86604Kt.A0a(this.A3n);
        Log.d("UserActions/userActionSendButtonsResponseMessage");
        C86654Ky.A1K(A082, new C31911p3(AnonymousClass35J.A01(A0a2, A082.A1X), r11.A03, r11.A04, A082.A0V.A0H()), r10);
    }

    public void A25(C624134x r10, C108785dY r11) {
        C621033m A082 = A08(this);
        C95814uZ A0a2 = C86604Kt.A0a(this.A3n);
        Log.d("UserActions/userActionSendListResponseMessage");
        AnonymousClass2z0 A012 = AnonymousClass35J.A01(A0a2, A082.A1X);
        long A0H2 = A082.A0V.A0H();
        AnonymousClass39N r3 = new AnonymousClass39N(r11.A03, r11.A00, r11.A02, 1);
        C31901p2 r0 = new C31901p2(A012, A0H2);
        r0.A00 = r3;
        C86654Ky.A1K(A082, r0, r10);
    }

    public void A26(C624134x r10, C58932w3 r11) {
        C621033m A082 = A08(this);
        C95814uZ A0a2 = C86604Kt.A0a(this.A3n);
        String str = r11.A08;
        String str2 = r11.A01;
        int i = r11.A05;
        Integer num = r11.A07;
        Log.d("UserActions/userActionSendTemplateButtonReplyMessage");
        C31921p4 r0 = new C31921p4(AnonymousClass35J.A01(A0a2, A082.A1X), A082.A0V.A0H());
        r0.A1Z(str);
        r0.A02 = str2;
        r0.A00 = i;
        r0.A01 = num;
        C86654Ky.A1K(A082, r0, r10);
    }

    public void A2I(boolean z) {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("conversation/window-focus-changed ");
        A0o2.append(this.A3n.A0H);
        C18260x0.A1E(" ", A0o2, z);
        if (z) {
            A09(this).getWindow().clearFlags(DefaultCrypto.BUFFER_SIZE);
            this.A2j.A00(AnonymousClass3ZH.A01(this.A3n), 1, true, true);
            if (this.A6e) {
                this.A4U.A07();
                this.A6e = false;
                return;
            }
            return;
        }
        C106995aW r2 = this.A2G;
        C95814uZ r1 = this.A4J;
        C162457s7.A0J(r1, 0);
        if (r2.A03.A0P(r1)) {
            A09(this).getWindow().setFlags(DefaultCrypto.BUFFER_SIZE, DefaultCrypto.BUFFER_SIZE);
        }
    }

    public final void A2M(boolean z) {
        Jid A0F2 = A0F(this);
        A7S.remove(A0F2);
        C50202hn r0 = this.A3P.A02;
        UserJid A032 = AnonymousClass32Y.A03(A0F2);
        if (A032 != null) {
            r0.A00(A032).A01 = false;
        }
        AnonymousClass5ZT r1 = this.A5q;
        if (r1 != null) {
            r1.A0C = null;
            r1.A0D = null;
        }
        C50202hn r02 = this.A3P.A02;
        if (A032 != null) {
            r02.A00(A032).A02 = false;
        }
        if (z) {
            AnonymousClass5RH r03 = this.A3T;
            C95814uZ r12 = r03.A0A;
            if (r12 != null) {
                C104175Py r04 = r03.A0P;
                r04.A02.remove(r12.getRawString());
            }
            A0z();
        }
    }

    public final boolean A2S() {
        if (A01(this) == null || A01(this).getBundleExtra("new_group_result_bundle") == null || !A01(this).getBundleExtra("new_group_result_bundle").containsKey("invite_intent")) {
            return false;
        }
        return true;
    }

    public final boolean A2V() {
        if (AnonymousClass5KY.A00(this).BH2(this.A4J)) {
            return true;
        }
        if (this.A4P == null || ((C56722sS) A0B(this).A06.get()).A00(this.A4P.getMentions()) == null) {
            return false;
        }
        return true;
    }

    public final boolean A2X() {
        return A0E(this).A0X(3792);
    }

    public final boolean A2Z(int i) {
        if (!A0E(this).A0X(743) || !this.A4k.A0o(A09(this), AnonymousClass3ZH.A07(this.A3n), i)) {
            return false;
        }
        if (i == 2 || i == 4) {
            return true;
        }
        return false;
    }

    public boolean A2d(C95814uZ r7, int i) {
        String str;
        boolean z = false;
        if (i != R.id.menuitem_add_to_contacts && i != R.id.menuitem_add_to_existing_contact) {
            if (i == R.id.menuitem_view_business_profile) {
                if (r7 != null) {
                    AnonymousClass3ZH A0A2 = this.A2z.getContactManager().A0A(r7);
                    C107275b2.A05(A09(this), this.A2z.findViewById(R.id.transition_start), AnonymousClass5MG.A01(A09(this)));
                    C86664Kz.A1B().A1M(A09(this), A0A2, C18290x4.A0a());
                } else {
                    str = "conversation/view-business-profile/error no-resource";
                    Log.e(str);
                    return true;
                }
            } else if (i != R.id.menuitem_message_contact) {
                if (i == R.id.menuitem_voice_call_contact) {
                    if (r7 != null) {
                        this.A2C.Bpk(A09(this), this.A2z.getContactManager().A0A(r7), 8, false);
                        return true;
                    }
                } else if (i != R.id.menuitem_video_call_contact) {
                    return false;
                } else {
                    if (r7 != null) {
                        this.A2C.Bpk(A09(this), this.A2z.getContactManager().A0A(r7), 8, true);
                        return true;
                    }
                }
                Log.e("conversation/call-contact/error no-resource");
                return true;
            } else if (r7 != null) {
                this.A2z.getActivityUtils().A0C(A09(this), this.A7C.A1L(A09(this), this.A2z.getContactManager().A0A(r7)), "Conversation:messageContact");
            } else {
                str = "conversation/message-contact/error no-resource";
                Log.e(str);
                return true;
            }
            this.A2z.finish();
            return true;
        } else if (r7 != null) {
            AnonymousClass3ZH A072 = this.A2z.getContactManager().A07(r7);
            if (i == R.id.menuitem_add_to_contacts) {
                z = true;
            }
            A1s(A072, r7, z);
            return true;
        } else {
            Log.w("conversation/add-contact-failed");
            A07(this).A0H(R.string.f11nameremoved, 0);
            return true;
        }
    }

    public void BM6() {
        A12();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.5l7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: X.5l7} */
    /* JADX WARNING: type inference failed for: r22v3 */
    /* JADX WARNING: type inference failed for: r22v8 */
    /* JADX WARNING: type inference failed for: r10v30, types: [com.whatsapp.jid.UserJid] */
    /* JADX WARNING: type inference failed for: r22v10 */
    /* JADX WARNING: type inference failed for: r32v31, types: [X.4mO] */
    /* JADX WARNING: type inference failed for: r32v32, types: [X.4mL] */
    /* JADX WARNING: type inference failed for: r44v12, types: [X.4mN] */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x075b, code lost:
        if (((X.C103985Pe) A0C(r1).A0D.get()).A01((X.C95804uY) r1.A4J) == false) goto L_0x075d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x08db, code lost:
        if (r5.A02.A00.A0X(976) != false) goto L_0x08dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0c52, code lost:
        if (r10 == null) goto L_0x0c54;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0cc5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:?, code lost:
        X.AnonymousClass2A8.A00(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0cc9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0ccc, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:?, code lost:
        X.AnonymousClass2A8.A00(r7, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x115a, code lost:
        if (A7S.get(A0F(r1)) != null) goto L_0x115c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:725:0x280e, code lost:
        if (r0 == false) goto L_0x28fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:754:0x2906, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:755:0x2907, code lost:
        A2F("on_create_end");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:756:0x290c, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x05e0, code lost:
        if (r5.A0T() == false) goto L_0x05e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x05f4, code lost:
        if (r13.A02.BH2(r4) == false) goto L_0x05f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0606, code lost:
        if (((X.C112185jK) r13.A02).A02.A01(r4) != false) goto L_0x0608;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x127d A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x1318 A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x132c A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x1375 A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x13a5 A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x13c9 A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x13ca A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x1400 A[SYNTHETIC, Splitter:B:395:0x1400] */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x1560 A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:452:0x15da A[SYNTHETIC, Splitter:B:452:0x15da] */
    /* JADX WARNING: Removed duplicated region for block: B:456:0x15ec A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:460:0x15f9 A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:463:0x160c A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:481:0x16be A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:491:0x195d A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:515:0x1e00 A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:518:0x1e2c A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:527:0x1e53 A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:535:0x1e85 A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:549:0x208d A[Catch:{ 6zK -> 0x1528 }, LOOP:1: B:547:0x2087->B:549:0x208d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:556:0x20f1 A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:563:0x21f3 A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:566:0x220b A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:569:0x2249 A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:572:0x2262 A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:580:0x22b7 A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:588:0x23c1 A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:598:0x243c A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:601:0x2461 A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:602:0x2484 A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:611:0x24ce A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:632:0x250d A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:635:0x2548 A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:660:0x2601 A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:666:0x2640 A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:671:0x2689 A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:679:0x26be A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:687:0x26f0 A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:689:0x2712 A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:690:0x2715 A[ADDED_TO_REGION, Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:698:0x274f A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:707:0x2779 A[Catch:{ 6zK -> 0x1528 }] */
    /* JADX WARNING: Removed duplicated region for block: B:708:0x2781 A[Catch:{ 6zK -> 0x1528 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1d(android.os.Bundle r109) {
        /*
            r108 = this;
            java.lang.String r29 = "messages_to_forward_bundle"
            java.lang.String r28 = "error_message"
            java.lang.String r16 = "Conversation"
            java.lang.String r27 = "sms_invite_intent"
            java.lang.String r31 = "on_create_end"
            r1 = r108
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.2sF r2 = r0.getStartupTracker()     // Catch:{ all -> 0x2904 }
            r0 = r16
            r2.A08(r0)     // Catch:{ all -> 0x2904 }
            X.4xi r2 = r1.A4E     // Catch:{ all -> 0x2904 }
            X.4eZ r0 = A09(r1)     // Catch:{ all -> 0x2904 }
            r2.A0A(r0)     // Catch:{ all -> 0x2904 }
            X.4xi r0 = r1.A4E     // Catch:{ all -> 0x2904 }
            boolean r0 = r0.A0F()     // Catch:{ all -> 0x2904 }
            r1.A6K = r0     // Catch:{ all -> 0x2904 }
            X.4xi r0 = r1.A4E     // Catch:{ all -> 0x2904 }
            boolean r0 = r0.A0I()     // Catch:{ all -> 0x2904 }
            r30 = r109
            if (r0 == 0) goto L_0x0061
            android.content.Intent r4 = A01(r1)     // Catch:{ all -> 0x2904 }
            X.4xi r2 = r1.A4E     // Catch:{ all -> 0x2904 }
            X.4eZ r0 = A09(r1)     // Catch:{ all -> 0x2904 }
            android.content.Intent r3 = r2.A08(r0, r4)     // Catch:{ all -> 0x2904 }
            boolean r0 = r3.equals(r4)     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x0061
            android.view.Window r2 = A03(r1)     // Catch:{ all -> 0x2904 }
            r0 = 0
            X.C86644Kx.A17(r2, r0)     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = r30
            r2.BdW(r0)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0.startActivity(r3)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0.finish()     // Catch:{ all -> 0x2904 }
            goto L_0x28fe
        L_0x0061:
            java.lang.String r2 = "conversation/create"
            X.33M r26 = new X.33M     // Catch:{ all -> 0x2904 }
            r0 = r26
            r0.<init>((java.lang.String) r2)     // Catch:{ all -> 0x2904 }
            X.4xi r0 = r1.A4E     // Catch:{ all -> 0x2904 }
            boolean r0 = r0.A0F()     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x0091
            android.view.Window r2 = A03(r1)     // Catch:{ all -> 0x2904 }
            boolean r0 = X.C107275b2.A00     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x0091
            X.4eZ r0 = A09(r1)     // Catch:{ all -> 0x2904 }
            boolean r0 = r0.A0C     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x0091
            r0 = 13
            r2.requestFeature(r0)     // Catch:{ all -> 0x2904 }
            r0 = 12
            r2.requestFeature(r0)     // Catch:{ all -> 0x2904 }
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.addFlags(r0)     // Catch:{ all -> 0x2904 }
        L_0x0091:
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = r30
            r2.BdW(r0)     // Catch:{ all -> 0x2904 }
            X.1VX r2 = A0E(r1)     // Catch:{ all -> 0x2904 }
            r0 = 6128(0x17f0, float:8.587E-42)
            boolean r0 = r2.A0X(r0)     // Catch:{ all -> 0x2904 }
            r1.A6c = r0     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "on_create_start"
            r1.A2F(r0)     // Catch:{ all -> 0x2904 }
            X.5Lx r2 = r1.A1A     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.5ND r0 = r0.getInteractionPerfTracker()     // Catch:{ all -> 0x2904 }
            X.5OW r0 = r2.A00(r0)     // Catch:{ all -> 0x2904 }
            r1.A33 = r0     // Catch:{ all -> 0x2904 }
            X.4FS r2 = A0G(r1)     // Catch:{ all -> 0x2904 }
            X.2e2 r0 = r1.A3H     // Catch:{ all -> 0x2904 }
            X.C117615sD.A01(r2, r0)     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "viewModels"
            r1.A2F(r0)     // Catch:{ all -> 0x2904 }
            X.0XL r2 = A06(r1)     // Catch:{ all -> 0x2904 }
            java.lang.Class<com.whatsapp.tosgating.viewmodel.ToSGatingViewModel> r0 = com.whatsapp.tosgating.viewmodel.ToSGatingViewModel.class
            X.0Ty r0 = r2.A01(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.tosgating.viewmodel.ToSGatingViewModel r0 = (com.whatsapp.tosgating.viewmodel.ToSGatingViewModel) r0     // Catch:{ all -> 0x2904 }
            r1.A5P = r0     // Catch:{ all -> 0x2904 }
            X.0XL r2 = A06(r1)     // Catch:{ all -> 0x2904 }
            java.lang.Class<com.whatsapp.countrygating.viewmodel.CountryGatingViewModel> r0 = com.whatsapp.countrygating.viewmodel.CountryGatingViewModel.class
            X.0Ty r0 = r2.A01(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.countrygating.viewmodel.CountryGatingViewModel r0 = (com.whatsapp.countrygating.viewmodel.CountryGatingViewModel) r0     // Catch:{ all -> 0x2904 }
            r1.A3M = r0     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.0sD r6 = r0.getViewModelStoreOwner()     // Catch:{ all -> 0x2904 }
            X.2CO r5 = r1.A16     // Catch:{ all -> 0x2904 }
            android.os.Handler r4 = r1.A6q     // Catch:{ all -> 0x2904 }
            X.676 r3 = r1.A2z     // Catch:{ all -> 0x2904 }
            r2 = 2
            X.4Ix r0 = new X.4Ix     // Catch:{ all -> 0x2904 }
            r0.<init>(r4, r5, r3, r2)     // Catch:{ all -> 0x2904 }
            X.0XL r2 = X.AnonymousClass4L0.A0F(r0, r6)     // Catch:{ all -> 0x2904 }
            java.lang.Class<X.4UA> r0 = X.AnonymousClass4UA.class
            X.0Ty r0 = r2.A01(r0)     // Catch:{ all -> 0x2904 }
            X.4UA r0 = (X.AnonymousClass4UA) r0     // Catch:{ all -> 0x2904 }
            r1.A3D = r0     // Catch:{ all -> 0x2904 }
            X.0XL r2 = A06(r1)     // Catch:{ all -> 0x2904 }
            java.lang.Class<X.94j> r25 = X.C1901794j.class
            r0 = r25
            X.0Ty r0 = r2.A01(r0)     // Catch:{ all -> 0x2904 }
            X.94j r0 = (X.C1901794j) r0     // Catch:{ all -> 0x2904 }
            r1.A4h = r0     // Catch:{ all -> 0x2904 }
            X.0df r5 = A04(r1)     // Catch:{ all -> 0x2904 }
            java.lang.String r4 = "NewCommunityAdminBottomSheetFragment"
            X.0sA r3 = A05(r1)     // Catch:{ all -> 0x2904 }
            r2 = 6
            X.5bK r0 = new X.5bK     // Catch:{ all -> 0x2904 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x2904 }
            r5.A0j(r0, r3, r4)     // Catch:{ all -> 0x2904 }
            X.4UA r0 = r1.A3D     // Catch:{ all -> 0x2904 }
            X.0Wx r3 = r0.A0D     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 219(0xdb, float:3.07E-43)
            X.AnonymousClass6C6.A02(r2, r3, r1, r0)     // Catch:{ all -> 0x2904 }
            X.4UA r0 = r1.A3D     // Catch:{ all -> 0x2904 }
            X.08M r2 = r0.A0G     // Catch:{ all -> 0x2904 }
            X.0sA r0 = A05(r1)     // Catch:{ all -> 0x2904 }
            r3 = 220(0xdc, float:3.08E-43)
            X.C86604Kt.A1N(r0, r2, r1, r3)     // Catch:{ all -> 0x2904 }
            X.4UA r0 = r1.A3D     // Catch:{ all -> 0x2904 }
            X.08M r2 = r0.A0F     // Catch:{ all -> 0x2904 }
            X.0sA r0 = A05(r1)     // Catch:{ all -> 0x2904 }
            X.AnonymousClass6C6.A02(r0, r2, r1, r3)     // Catch:{ all -> 0x2904 }
            X.4UA r0 = r1.A3D     // Catch:{ all -> 0x2904 }
            X.08M r0 = r0.A0H     // Catch:{ all -> 0x2904 }
            X.0Wx r3 = X.C05110Rz.A01(r0)     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 221(0xdd, float:3.1E-43)
            X.AnonymousClass6C6.A02(r2, r3, r1, r0)     // Catch:{ all -> 0x2904 }
            X.2sn r5 = r1.A5A     // Catch:{ all -> 0x2904 }
            X.4FS r7 = A0G(r1)     // Catch:{ all -> 0x2904 }
            X.8qC r8 = r1.A66     // Catch:{ all -> 0x2904 }
            X.1ih r4 = r1.A59     // Catch:{ all -> 0x2904 }
            X.33p r3 = A0D(r1)     // Catch:{ all -> 0x2904 }
            X.2gE r6 = r1.A5B     // Catch:{ all -> 0x2904 }
            X.7rM r2 = new X.7rM     // Catch:{ all -> 0x2904 }
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x2904 }
            r1.A5H = r2     // Catch:{ all -> 0x2904 }
            X.5pX r0 = new X.5pX     // Catch:{ all -> 0x2904 }
            r0.<init>(r2)     // Catch:{ all -> 0x2904 }
            r1.A4o = r0     // Catch:{ all -> 0x2904 }
            r2 = 1
            boolean r0 = X.AnonymousClass000.A1W(r30)
            r1.A6G = r0     // Catch:{ all -> 0x2904 }
            X.1VX r3 = A0E(r1)     // Catch:{ all -> 0x2904 }
            r0 = 1154(0x482, float:1.617E-42)
            boolean r0 = r3.A0X(r0)     // Catch:{ all -> 0x2904 }
            r1.A6b = r0     // Catch:{ all -> 0x2904 }
            X.1VX r3 = A0E(r1)     // Catch:{ all -> 0x2904 }
            r0 = 1395(0x573, float:1.955E-42)
            boolean r0 = r3.A0X(r0)     // Catch:{ all -> 0x2904 }
            r1.A6Z = r0     // Catch:{ all -> 0x2904 }
            boolean r0 = r1.A6G     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x01a0
            X.8Tk r0 = X.C116095pj.A13     // Catch:{ all -> 0x2904 }
            r0.clear()     // Catch:{ all -> 0x2904 }
        L_0x01a0:
            com.whatsapp.nativelibloader.WhatsAppLibLoader r0 = r1.A4S     // Catch:{ all -> 0x2904 }
            boolean r0 = r0.A03()     // Catch:{ all -> 0x2904 }
            r4 = 3
            if (r0 != 0) goto L_0x01bf
            java.lang.String r0 = "conversation/aborting due to native libraries missing"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "on_create_whatsapp_lib_failure"
            r1.A2F(r0)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0.BKe(r4)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0.finish()     // Catch:{ all -> 0x2904 }
            goto L_0x28fe
        L_0x01bf:
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.2sr r0 = r0.getMeManager()     // Catch:{ all -> 0x2904 }
            r0.A0P()     // Catch:{ all -> 0x2904 }
            com.whatsapp.Me r0 = r0.A00     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x28d8
            X.3dV r0 = r1.A3k     // Catch:{ all -> 0x2904 }
            r0.A05()     // Catch:{ all -> 0x2904 }
            boolean r0 = r0.A09     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x28d8
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.2jE r0 = r0.getRegistrationStateManager()     // Catch:{ all -> 0x2904 }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x28d8
            X.5OU r6 = r1.A2e     // Catch:{ all -> 0x2904 }
            android.content.Intent r5 = A01(r1)     // Catch:{ all -> 0x2904 }
            boolean r3 = r1.A6G     // Catch:{ all -> 0x2904 }
            r0 = r30
            X.5Le r8 = r6.A00(r5, r0, r3)     // Catch:{ all -> 0x2904 }
            X.5Wq r3 = r8.A06     // Catch:{ all -> 0x2904 }
            r1.A3S = r3     // Catch:{ all -> 0x2904 }
            int r5 = r8.A02     // Catch:{ all -> 0x2904 }
            if (r5 == r2) goto L_0x28c8
            r0 = 2
            if (r5 == r0) goto L_0x28ae
            if (r5 == r4) goto L_0x2868
            X.4uZ r0 = r8.A08     // Catch:{ all -> 0x2904 }
            r64 = r0
            X.C626936e.A06(r64)     // Catch:{ all -> 0x2904 }
            r1.A4J = r0     // Catch:{ all -> 0x2904 }
            X.2Y0 r4 = r1.A3c     // Catch:{ all -> 0x2904 }
            X.5Wq r5 = X.C105845Wq.A0I     // Catch:{ all -> 0x2904 }
            X.5Wq r0 = r1.A3S     // Catch:{ all -> 0x2904 }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x2904 }
            boolean r5 = X.AnonymousClass000.A1T(r0)
            r6 = 0
            r0 = r64
            X.C162457s7.A0J(r0, r6)     // Catch:{ all -> 0x2904 }
            boolean r0 = X.C627336j.A0L(r64)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x0235
            if (r5 != r2) goto L_0x0224
            X.21b r5 = X.C371321b.CTWA     // Catch:{ all -> 0x2904 }
            goto L_0x0226
        L_0x0224:
            X.21b r5 = X.C371321b.USERNAME     // Catch:{ all -> 0x2904 }
        L_0x0226:
            monitor-enter(r4)     // Catch:{ all -> 0x2904 }
            X.66R r0 = r4.A00     // Catch:{ all -> 0x2865 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x2865 }
            X.0Qw r2 = (X.C04840Qw) r2     // Catch:{ all -> 0x2865 }
            r0 = r64
            r2.A08(r0, r5)     // Catch:{ all -> 0x2865 }
            monitor-exit(r4)     // Catch:{ all -> 0x2904 }
        L_0x0235:
            android.content.Intent r4 = A01(r1)     // Catch:{ all -> 0x2904 }
            java.lang.String r2 = "chatlockEntryPoint"
            r0 = 8
            int r7 = r4.getIntExtra(r2, r0)     // Catch:{ all -> 0x2904 }
            X.5aW r5 = r1.A2G     // Catch:{ all -> 0x2904 }
            X.4eZ r0 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.0df r0 = r0.getSupportFragmentManager()     // Catch:{ all -> 0x2904 }
            java.lang.String r2 = "com.whatsapp.HomeActivity.ConversationFragment"
            X.0eF r4 = r0.A0D(r2)     // Catch:{ all -> 0x2904 }
            if (r4 != 0) goto L_0x0257
            X.4eZ r4 = A09(r1)     // Catch:{ all -> 0x2904 }
        L_0x0257:
            X.4eZ r0 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.0O1 r0 = r5.A04(r4, r0, r7)     // Catch:{ all -> 0x2904 }
            r1.A0n = r0     // Catch:{ all -> 0x2904 }
            X.5aW r4 = r1.A2G     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            boolean r0 = r4.A0I(r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x0297
            X.5aW r6 = r1.A2G     // Catch:{ all -> 0x2904 }
            X.4eZ r0 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.0df r0 = r0.getSupportFragmentManager()     // Catch:{ all -> 0x2904 }
            X.0eF r5 = r0.A0D(r2)     // Catch:{ all -> 0x2904 }
            if (r5 != 0) goto L_0x027f
            X.4eZ r5 = A09(r1)     // Catch:{ all -> 0x2904 }
        L_0x027f:
            X.4eZ r4 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.4uZ r2 = r1.A4J     // Catch:{ all -> 0x2904 }
            r0 = 0
            X.C162457s7.A0J(r5, r0)     // Catch:{ all -> 0x2904 }
            X.C18260x0.A0Q(r4, r2)     // Catch:{ all -> 0x2904 }
            boolean r0 = r6.A01     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x0297
            X.0O1 r0 = r6.A04(r5, r4, r7)     // Catch:{ all -> 0x2904 }
            r6.A07(r0, r2, r7)     // Catch:{ all -> 0x2904 }
        L_0x0297:
            X.3ZH r0 = r8.A07     // Catch:{ all -> 0x2904 }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x2904 }
            r1.A3n = r0     // Catch:{ all -> 0x2904 }
            boolean r0 = r0.A0U()     // Catch:{ all -> 0x2904 }
            r1.A6V = r0     // Catch:{ all -> 0x2904 }
            X.1VX r2 = r1.A41     // Catch:{ all -> 0x2904 }
            r0 = 6579(0x19b3, float:9.219E-42)
            boolean r15 = r2.A0X(r0)     // Catch:{ all -> 0x2904 }
            if (r15 == 0) goto L_0x02c4
            X.2gb r2 = r1.A3h     // Catch:{ all -> 0x2904 }
            r0 = r30
            r2.A00(r0)     // Catch:{ all -> 0x2904 }
            X.2gb r4 = r1.A3h     // Catch:{ all -> 0x2904 }
            X.4uZ r2 = r1.A4J     // Catch:{ all -> 0x2904 }
            X.4eZ r0 = A09(r1)     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = r0.getLocalClassName()     // Catch:{ all -> 0x2904 }
            r4.A01(r2, r0)     // Catch:{ all -> 0x2904 }
        L_0x02c4:
            X.0XL r2 = A06(r1)     // Catch:{ all -> 0x2904 }
            java.lang.Class<com.whatsapp.conversation.conversationrow.MessageSelectionViewModel> r0 = com.whatsapp.conversation.conversationrow.MessageSelectionViewModel.class
            X.0Ty r0 = r2.A01(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.conversation.conversationrow.MessageSelectionViewModel r0 = (com.whatsapp.conversation.conversationrow.MessageSelectionViewModel) r0     // Catch:{ all -> 0x2904 }
            r1.A2q = r0     // Catch:{ all -> 0x2904 }
            X.08M r4 = r0.A01     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 203(0xcb, float:2.84E-43)
            X.AnonymousClass6C6.A02(r2, r4, r1, r0)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.0sD r9 = r0.getViewModelStoreOwner()     // Catch:{ all -> 0x2904 }
            X.2CS r7 = r1.A1G     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.0vJ r19 = r0.getSavedStateRegistryOwner()     // Catch:{ all -> 0x2904 }
            X.66v r6 = r1.A5l     // Catch:{ all -> 0x2904 }
            X.4uZ r5 = r1.A4J     // Catch:{ all -> 0x2904 }
            X.3ZH r4 = r1.A3n     // Catch:{ all -> 0x2904 }
            X.4eZ r0 = A09(r1)     // Catch:{ all -> 0x2904 }
            android.content.Intent r18 = r0.getIntent()     // Catch:{ all -> 0x2904 }
            com.whatsapp.conversation.conversationrow.MessageSelectionViewModel r2 = r1.A2q     // Catch:{ all -> 0x2904 }
            X.100 r0 = new X.100     // Catch:{ all -> 0x2904 }
            r17 = r0
            r20 = r7
            r21 = r2
            r22 = r4
            r23 = r5
            r24 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x2904 }
            X.0XL r2 = X.AnonymousClass4L0.A0F(r0, r9)     // Catch:{ all -> 0x2904 }
            java.lang.Class<X.4VQ> r0 = X.AnonymousClass4VQ.class
            X.0Ty r4 = r2.A01(r0)     // Catch:{ all -> 0x2904 }
            X.4VQ r4 = (X.AnonymousClass4VQ) r4     // Catch:{ all -> 0x2904 }
            r1.A3B = r4     // Catch:{ all -> 0x2904 }
            android.graphics.Point r2 = X.AnonymousClass4L0.A07()     // Catch:{ all -> 0x2904 }
            X.4eZ r0 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.C86604Kt.A0x(r0, r2)     // Catch:{ all -> 0x2904 }
            int r0 = r2.y     // Catch:{ all -> 0x2904 }
            int r2 = r0 * 2
            android.content.res.Resources r5 = A02(r1)     // Catch:{ all -> 0x2904 }
            r0 = 2131166063(0x7f07036f, float:1.794636E38)
            int r0 = r5.getDimensionPixelSize(r0)     // Catch:{ all -> 0x2904 }
            int r2 = r2 / r0
            r4.A00 = r2     // Catch:{ all -> 0x2904 }
            X.4VQ r2 = r1.A3B     // Catch:{ all -> 0x2904 }
            r0 = 8
            r2.A03 = r0     // Catch:{ all -> 0x2904 }
            X.08M r2 = r2.A0W     // Catch:{ all -> 0x2904 }
            X.0sA r0 = A05(r1)     // Catch:{ all -> 0x2904 }
            r14 = 210(0xd2, float:2.94E-43)
            X.AnonymousClass6C6.A02(r0, r2, r1, r14)     // Catch:{ all -> 0x2904 }
            X.4VQ r0 = r1.A3B     // Catch:{ all -> 0x2904 }
            X.08M r4 = r0.A0V     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 211(0xd3, float:2.96E-43)
            X.AnonymousClass6C6.A02(r2, r4, r1, r0)     // Catch:{ all -> 0x2904 }
            X.4VQ r0 = r1.A3B     // Catch:{ all -> 0x2904 }
            X.4UC r4 = r0.A1A     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 212(0xd4, float:2.97E-43)
            X.AnonymousClass6C6.A02(r2, r4, r1, r0)     // Catch:{ all -> 0x2904 }
            X.4VQ r0 = r1.A3B     // Catch:{ all -> 0x2904 }
            X.4UC r4 = r0.A19     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 213(0xd5, float:2.98E-43)
            X.AnonymousClass6C6.A02(r2, r4, r1, r0)     // Catch:{ all -> 0x2904 }
            X.4VQ r0 = r1.A3B     // Catch:{ all -> 0x2904 }
            X.08M r4 = r0.A0X     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 214(0xd6, float:3.0E-43)
            X.AnonymousClass6C6.A02(r2, r4, r1, r0)     // Catch:{ all -> 0x2904 }
            X.4VQ r0 = r1.A3B     // Catch:{ all -> 0x2904 }
            X.4UC r2 = r0.A1C     // Catch:{ all -> 0x2904 }
            X.0sA r0 = A05(r1)     // Catch:{ all -> 0x2904 }
            r5 = 215(0xd7, float:3.01E-43)
            X.AnonymousClass6C6.A02(r0, r2, r1, r5)     // Catch:{ all -> 0x2904 }
            X.4VQ r0 = r1.A3B     // Catch:{ all -> 0x2904 }
            X.4UC r2 = r0.A1D     // Catch:{ all -> 0x2904 }
            X.0sA r0 = A05(r1)     // Catch:{ all -> 0x2904 }
            r4 = 216(0xd8, float:3.03E-43)
            X.C86604Kt.A1N(r0, r2, r1, r4)     // Catch:{ all -> 0x2904 }
            X.4VQ r0 = r1.A3B     // Catch:{ all -> 0x2904 }
            X.4UC r2 = r0.A14     // Catch:{ all -> 0x2904 }
            X.0sA r0 = A05(r1)     // Catch:{ all -> 0x2904 }
            X.AnonymousClass6C6.A02(r0, r2, r1, r4)     // Catch:{ all -> 0x2904 }
            X.4VQ r0 = r1.A3B     // Catch:{ all -> 0x2904 }
            X.4UC r4 = r0.A15     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 217(0xd9, float:3.04E-43)
            X.AnonymousClass6C6.A02(r2, r4, r1, r0)     // Catch:{ all -> 0x2904 }
            X.4VQ r0 = r1.A3B     // Catch:{ all -> 0x2904 }
            X.08M r2 = r0.A0Z     // Catch:{ all -> 0x2904 }
            X.0sA r0 = A05(r1)     // Catch:{ all -> 0x2904 }
            X.C86604Kt.A1N(r0, r2, r1, r5)     // Catch:{ all -> 0x2904 }
            X.4VQ r0 = r1.A3B     // Catch:{ all -> 0x2904 }
            X.08M r4 = r0.A0S     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 85
            X.AnonymousClass4K2.A00(r2, r4, r1, r0)     // Catch:{ all -> 0x2904 }
            X.4VQ r0 = r1.A3B     // Catch:{ all -> 0x2904 }
            X.4UC r4 = r0.A13     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 204(0xcc, float:2.86E-43)
            X.AnonymousClass6C6.A02(r2, r4, r1, r0)     // Catch:{ all -> 0x2904 }
            X.4VQ r0 = r1.A3B     // Catch:{ all -> 0x2904 }
            X.4UC r4 = r0.A16     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 205(0xcd, float:2.87E-43)
            X.AnonymousClass6C6.A02(r2, r4, r1, r0)     // Catch:{ all -> 0x2904 }
            X.4VQ r0 = r1.A3B     // Catch:{ all -> 0x2904 }
            X.4UC r4 = r0.A17     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 206(0xce, float:2.89E-43)
            X.AnonymousClass6C6.A02(r2, r4, r1, r0)     // Catch:{ all -> 0x2904 }
            X.4VQ r0 = r1.A3B     // Catch:{ all -> 0x2904 }
            X.4UC r4 = r0.A18     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 207(0xcf, float:2.9E-43)
            X.AnonymousClass6C6.A02(r2, r4, r1, r0)     // Catch:{ all -> 0x2904 }
            X.4VQ r0 = r1.A3B     // Catch:{ all -> 0x2904 }
            X.08M r4 = r0.A0Y     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 208(0xd0, float:2.91E-43)
            X.AnonymousClass6C6.A02(r2, r4, r1, r0)     // Catch:{ all -> 0x2904 }
            X.4VQ r0 = r1.A3B     // Catch:{ all -> 0x2904 }
            X.4UC r2 = r0.A1B     // Catch:{ all -> 0x2904 }
            X.0sA r0 = A05(r1)     // Catch:{ all -> 0x2904 }
            r11 = 209(0xd1, float:2.93E-43)
            X.AnonymousClass6C6.A02(r0, r2, r1, r11)     // Catch:{ all -> 0x2904 }
            X.3ZH r0 = r1.A3n     // Catch:{ all -> 0x2904 }
            java.lang.Class<X.1fJ> r24 = X.C27991fJ.class
            r2 = r24
            com.whatsapp.jid.Jid r2 = r0.A0I(r2)     // Catch:{ all -> 0x2904 }
            X.1fJ r2 = (X.C27991fJ) r2     // Catch:{ all -> 0x2904 }
            if (r2 == 0) goto L_0x047c
            X.2ss r0 = r1.A3d     // Catch:{ all -> 0x2904 }
            boolean r0 = r0.A0N(r2)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x047c
            X.2so r0 = r1.A2J     // Catch:{ all -> 0x2904 }
            X.1fJ r7 = r0.A01(r2)     // Catch:{ all -> 0x2904 }
            if (r7 == 0) goto L_0x047c
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.0sD r4 = r0.getViewModelStoreOwner()     // Catch:{ all -> 0x2904 }
            X.5Ev r2 = r1.A1Y     // Catch:{ all -> 0x2904 }
            r0 = 3
            X.0XL r2 = X.C124086Ax.A00(r4, r7, r2, r0)     // Catch:{ all -> 0x2904 }
            java.lang.Class<X.4VM> r0 = X.AnonymousClass4VM.class
            X.0Ty r0 = r2.A01(r0)     // Catch:{ all -> 0x2904 }
            X.4VM r0 = (X.AnonymousClass4VM) r0     // Catch:{ all -> 0x2904 }
            r1.A2K = r0     // Catch:{ all -> 0x2904 }
            X.4UC r4 = r0.A05     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 84
            X.AnonymousClass4K2.A00(r2, r4, r1, r0)     // Catch:{ all -> 0x2904 }
            X.4eZ r6 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.8Gt r5 = new X.8Gt     // Catch:{ all -> 0x2904 }
            r5.<init>(r7)     // Catch:{ all -> 0x2904 }
            X.2so r4 = r1.A2J     // Catch:{ all -> 0x2904 }
            X.4VM r2 = r1.A2K     // Catch:{ all -> 0x2904 }
            X.5gb r0 = new X.5gb     // Catch:{ all -> 0x2904 }
            r0.<init>(r6, r4, r2, r5)     // Catch:{ all -> 0x2904 }
            X.08J r4 = r2.A00     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r4.A0B(r2, r0)     // Catch:{ all -> 0x2904 }
            X.4VM r0 = r1.A2K     // Catch:{ all -> 0x2904 }
            X.4UC r4 = r0.A04     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 13
            X.C100385As.A01(r2, r4, r7, r1, r0)     // Catch:{ all -> 0x2904 }
        L_0x047c:
            X.0XL r2 = A06(r1)     // Catch:{ all -> 0x2904 }
            java.lang.Class<com.whatsapp.community.ConversationCommunityViewModel> r0 = com.whatsapp.community.ConversationCommunityViewModel.class
            X.0Ty r0 = r2.A01(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.community.ConversationCommunityViewModel r0 = (com.whatsapp.community.ConversationCommunityViewModel) r0     // Catch:{ all -> 0x2904 }
            r1.A2L = r0     // Catch:{ all -> 0x2904 }
            X.08M r4 = r0.A03     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 200(0xc8, float:2.8E-43)
            X.AnonymousClass6C6.A02(r2, r4, r1, r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.community.ConversationCommunityViewModel r0 = r1.A2L     // Catch:{ all -> 0x2904 }
            X.08M r4 = r0.A02     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 201(0xc9, float:2.82E-43)
            X.AnonymousClass6C6.A02(r2, r4, r1, r0)     // Catch:{ all -> 0x2904 }
            boolean r0 = r1.A2U()     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x04b9
            com.whatsapp.community.ConversationCommunityViewModel r5 = r1.A2L     // Catch:{ all -> 0x2904 }
            X.4uZ r4 = r1.A4J     // Catch:{ all -> 0x2904 }
            r0 = 0
            android.util.Pair r0 = android.util.Pair.create(r4, r0)     // Catch:{ all -> 0x2904 }
            r5.A00 = r0     // Catch:{ all -> 0x2904 }
            X.4FS r2 = r5.A07     // Catch:{ all -> 0x2904 }
            r0 = 4
            X.C70193a6.A01(r2, r5, r4, r0)     // Catch:{ all -> 0x2904 }
        L_0x04b9:
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.0sD r5 = r0.getViewModelStoreOwner()     // Catch:{ all -> 0x2904 }
            X.5DC r4 = r1.A1C     // Catch:{ all -> 0x2904 }
            X.4uZ r2 = r1.A4J     // Catch:{ all -> 0x2904 }
            r0 = 8
            X.0XL r2 = X.C124086Ax.A00(r5, r2, r4, r0)     // Catch:{ all -> 0x2904 }
            java.lang.Class<X.4Ui> r0 = X.C87674Ui.class
            X.0Ty r0 = r2.A01(r0)     // Catch:{ all -> 0x2904 }
            X.4Ui r0 = (X.C87674Ui) r0     // Catch:{ all -> 0x2904 }
            X.4UC r4 = r0.A04     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 81
            X.AnonymousClass4K2.A00(r2, r4, r1, r0)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.0sD r10 = r0.getViewModelStoreOwner()     // Catch:{ all -> 0x2904 }
            X.2CR r9 = r1.A1D     // Catch:{ all -> 0x2904 }
            X.4uZ r7 = r1.A4J     // Catch:{ all -> 0x2904 }
            X.4UA r6 = r1.A3D     // Catch:{ all -> 0x2904 }
            com.whatsapp.countrygating.viewmodel.CountryGatingViewModel r5 = r1.A3M     // Catch:{ all -> 0x2904 }
            com.whatsapp.tosgating.viewmodel.ToSGatingViewModel r4 = r1.A5P     // Catch:{ all -> 0x2904 }
            X.3ZH r2 = r1.A3n     // Catch:{ all -> 0x2904 }
            X.3Af r0 = new X.3Af     // Catch:{ all -> 0x2904 }
            r17 = r0
            r18 = r9
            r19 = r6
            r20 = r5
            r21 = r2
            r22 = r7
            r23 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x2904 }
            X.0XL r2 = X.AnonymousClass4L0.A0F(r0, r10)     // Catch:{ all -> 0x2904 }
            java.lang.Class<X.4VF> r0 = X.AnonymousClass4VF.class
            X.0Ty r0 = r2.A01(r0)     // Catch:{ all -> 0x2904 }
            X.4VF r0 = (X.AnonymousClass4VF) r0     // Catch:{ all -> 0x2904 }
            r1.A37 = r0     // Catch:{ all -> 0x2904 }
            X.4UC r4 = r0.A0X     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 194(0xc2, float:2.72E-43)
            X.AnonymousClass6C6.A02(r2, r4, r1, r0)     // Catch:{ all -> 0x2904 }
            X.4VF r0 = r1.A37     // Catch:{ all -> 0x2904 }
            X.08M r2 = r0.A02     // Catch:{ all -> 0x2904 }
            X.0sA r0 = A05(r1)     // Catch:{ all -> 0x2904 }
            X.C86604Kt.A1N(r0, r2, r1, r11)     // Catch:{ all -> 0x2904 }
            X.4VF r0 = r1.A37     // Catch:{ all -> 0x2904 }
            X.4UC r4 = r0.A0Y     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 82
            X.AnonymousClass4K2.A00(r2, r4, r1, r0)     // Catch:{ all -> 0x2904 }
            X.4VF r0 = r1.A37     // Catch:{ all -> 0x2904 }
            X.4UC r4 = r0.A0W     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 195(0xc3, float:2.73E-43)
            X.AnonymousClass6C6.A02(r2, r4, r1, r0)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.0sD r5 = r0.getViewModelStoreOwner()     // Catch:{ all -> 0x2904 }
            X.5Eu r4 = r1.A1X     // Catch:{ all -> 0x2904 }
            X.3ZH r2 = r1.A3n     // Catch:{ all -> 0x2904 }
            r0 = 7
            X.0XL r2 = X.C124086Ax.A00(r5, r4, r2, r0)     // Catch:{ all -> 0x2904 }
            java.lang.Class<X.4Ul> r0 = X.AnonymousClass4Ul.class
            X.0Ty r0 = r2.A01(r0)     // Catch:{ all -> 0x2904 }
            X.4Ul r0 = (X.AnonymousClass4Ul) r0     // Catch:{ all -> 0x2904 }
            X.4UC r4 = r0.A05     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 196(0xc4, float:2.75E-43)
            X.AnonymousClass6C6.A02(r2, r4, r1, r0)     // Catch:{ all -> 0x2904 }
            X.0XL r2 = A06(r1)     // Catch:{ all -> 0x2904 }
            java.lang.Class<com.whatsapp.pnh.RequestPhoneNumberViewModel> r0 = com.whatsapp.pnh.RequestPhoneNumberViewModel.class
            X.0Ty r0 = r2.A01(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.pnh.RequestPhoneNumberViewModel r0 = (com.whatsapp.pnh.RequestPhoneNumberViewModel) r0     // Catch:{ all -> 0x2904 }
            r1.A4q = r0     // Catch:{ all -> 0x2904 }
            X.2Ux r4 = r1.A1V     // Catch:{ all -> 0x2904 }
            X.4eZ r2 = A09(r1)     // Catch:{ all -> 0x2904 }
            com.whatsapp.pnh.RequestPhoneNumberViewModel r0 = r1.A4q     // Catch:{ all -> 0x2904 }
            X.2nX r5 = r4.A00(r2, r0)     // Catch:{ all -> 0x2904 }
            r1.A4p = r5     // Catch:{ all -> 0x2904 }
            X.3ZH r0 = r1.A3n     // Catch:{ all -> 0x2904 }
            X.4uZ r2 = r0.A0H     // Catch:{ all -> 0x2904 }
            boolean r0 = r2 instanceof X.C27981fH     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x0594
            X.1fH r2 = (X.C27981fH) r2     // Catch:{ all -> 0x2904 }
            com.whatsapp.pnh.RequestPhoneNumberViewModel r0 = r5.A05     // Catch:{ all -> 0x2904 }
            X.0Wx r4 = r0.A0D(r2)     // Catch:{ all -> 0x2904 }
            X.4eZ r2 = r5.A01     // Catch:{ all -> 0x2904 }
            r0 = 162(0xa2, float:2.27E-43)
            X.AnonymousClass4K2.A00(r2, r4, r5, r0)     // Catch:{ all -> 0x2904 }
        L_0x0594:
            boolean r0 = A0Q(r1)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x05ae
            X.4eZ r4 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.5LO r0 = A0C(r1)     // Catch:{ all -> 0x2904 }
            X.5DR r2 = r0.A01     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            X.4uY r0 = (X.C95804uY) r0     // Catch:{ all -> 0x2904 }
            com.whatsapp.newsletter.viewmodel.NewsletterViewModel r0 = X.AnonymousClass5BS.A00(r2, r4, r0)     // Catch:{ all -> 0x2904 }
            r1.A4T = r0     // Catch:{ all -> 0x2904 }
        L_0x05ae:
            X.5Kh r13 = r1.A2x     // Catch:{ all -> 0x2904 }
            X.4eZ r12 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.1VX r6 = r1.A41     // Catch:{ all -> 0x2904 }
            X.3ZH r5 = r1.A3n     // Catch:{ all -> 0x2904 }
            X.4uZ r4 = r1.A4J     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.0sD r11 = r0.getViewModelStoreOwner()     // Catch:{ all -> 0x2904 }
            r0 = 0
            X.C162457s7.A0J(r12, r0)     // Catch:{ all -> 0x2904 }
            X.C18260x0.A0c(r6, r5, r4, r11)     // Catch:{ all -> 0x2904 }
            boolean r2 = r4 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x2904 }
            r0 = 0
            if (r2 == 0) goto L_0x05d7
            r10 = r4
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10     // Catch:{ all -> 0x2904 }
        L_0x05cf:
            boolean r2 = X.AnonymousClass75P.A00(r6)     // Catch:{ all -> 0x2904 }
            r9 = 1
            if (r2 == 0) goto L_0x05e2
            goto L_0x05d9
        L_0x05d7:
            r10 = r0
            goto L_0x05cf
        L_0x05d9:
            if (r10 == 0) goto L_0x05e2
            boolean r2 = r5.A0T()     // Catch:{ all -> 0x2904 }
            r7 = 1
            if (r2 != 0) goto L_0x05e3
        L_0x05e2:
            r7 = 0
        L_0x05e3:
            r2 = 5811(0x16b3, float:8.143E-42)
            boolean r17 = r6.A0X(r2)     // Catch:{ all -> 0x2904 }
            if (r17 == 0) goto L_0x05f6
            if (r10 == 0) goto L_0x05f6
            X.66o r2 = r13.A02     // Catch:{ all -> 0x2904 }
            boolean r2 = r2.BH2(r4)     // Catch:{ all -> 0x2904 }
            r6 = 1
            if (r2 != 0) goto L_0x05fc
        L_0x05f6:
            r6 = 0
            if (r17 == 0) goto L_0x05fa
            goto L_0x05fc
        L_0x05fa:
            r9 = 0
            goto L_0x0608
        L_0x05fc:
            X.66o r2 = r13.A02     // Catch:{ all -> 0x2904 }
            X.5jK r2 = (X.C112185jK) r2     // Catch:{ all -> 0x2904 }
            X.5TH r2 = r2.A02     // Catch:{ all -> 0x2904 }
            boolean r2 = r2.A01(r4)     // Catch:{ all -> 0x2904 }
            if (r2 == 0) goto L_0x05fa
        L_0x0608:
            boolean r5 = r5.A0R()     // Catch:{ all -> 0x2904 }
            if (r7 != 0) goto L_0x0615
            if (r6 != 0) goto L_0x0615
            if (r9 != 0) goto L_0x0615
            if (r5 != 0) goto L_0x0615
            goto L_0x066c
        L_0x0615:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x2904 }
            java.lang.String r2 = "BotConversationDelegate/createBot3PTextViewModel isBusinessThirdPartyBotEnabled="
            r4.append(r2)     // Catch:{ all -> 0x2904 }
            r4.append(r7)     // Catch:{ all -> 0x2904 }
            java.lang.String r2 = " firstPartyBotCommandsEnabledInBotChat="
            r4.append(r2)     // Catch:{ all -> 0x2904 }
            r4.append(r6)     // Catch:{ all -> 0x2904 }
            java.lang.String r2 = " firstPartyBotCommandsEnabledInInvoke="
            r4.append(r2)     // Catch:{ all -> 0x2904 }
            r4.append(r9)     // Catch:{ all -> 0x2904 }
            java.lang.String r2 = " isBusinessAccount="
            X.C18260x0.A1D(r2, r4, r5)     // Catch:{ all -> 0x2904 }
            android.content.res.Resources r4 = r12.getResources()     // Catch:{ all -> 0x2904 }
            r2 = 2131165432(0x7f0700f8, float:1.794508E38)
            int r4 = r4.getDimensionPixelSize(r2)     // Catch:{ all -> 0x2904 }
            android.content.res.Resources r9 = r12.getResources()     // Catch:{ all -> 0x2904 }
            r2 = 2131165431(0x7f0700f7, float:1.7945079E38)
            float r9 = X.C86664Kz.A01(r9, r2)     // Catch:{ all -> 0x2904 }
            X.5Sc r2 = new X.5Sc     // Catch:{ all -> 0x2904 }
            r2.<init>(r9, r4, r7, r5)     // Catch:{ all -> 0x2904 }
            X.5D2 r4 = r13.A00     // Catch:{ all -> 0x2904 }
            if (r7 != 0) goto L_0x0659
            if (r6 != 0) goto L_0x0659
            if (r5 == 0) goto L_0x065a
        L_0x0659:
            r0 = r10
        L_0x065a:
            r6 = 1
            X.6Af r5 = new X.6Af     // Catch:{ all -> 0x2904 }
            r5.<init>(r4, r0, r2, r6)     // Catch:{ all -> 0x2904 }
            X.0XL r2 = X.AnonymousClass4L0.A0F(r5, r11)     // Catch:{ all -> 0x2904 }
            java.lang.Class<X.4Uy> r0 = X.C87694Uy.class
            X.0Ty r0 = r2.A01(r0)     // Catch:{ all -> 0x2904 }
            X.4Uy r0 = (X.C87694Uy) r0     // Catch:{ all -> 0x2904 }
        L_0x066c:
            r1.A5M = r0     // Catch:{ all -> 0x2904 }
            X.0XL r2 = A06(r1)     // Catch:{ all -> 0x2904 }
            java.lang.Class<com.whatsapp.conversation.viewmodel.SurveyViewModel> r0 = com.whatsapp.conversation.viewmodel.SurveyViewModel.class
            X.0Ty r0 = r2.A01(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.conversation.viewmodel.SurveyViewModel r0 = (com.whatsapp.conversation.viewmodel.SurveyViewModel) r0     // Catch:{ all -> 0x2904 }
            X.66R r0 = r0.A02     // Catch:{ all -> 0x2904 }
            java.lang.Object r4 = r0.getValue()     // Catch:{ all -> 0x2904 }
            X.0Wx r4 = (X.C06270Wx) r4     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 83
            X.AnonymousClass4K2.A00(r2, r4, r1, r0)     // Catch:{ all -> 0x2904 }
            X.9Wq r5 = r1.A4k     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass32Y.A03(r0)     // Catch:{ all -> 0x2904 }
            X.2sr r0 = r1.A1b     // Catch:{ all -> 0x2904 }
            com.whatsapp.jid.PhoneUserJid r2 = X.C56972sr.A04(r0)     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "55"
            boolean r2 = r5.A0w(r4, r2, r0)     // Catch:{ all -> 0x2904 }
            X.99n r0 = r1.A4d     // Catch:{ all -> 0x2904 }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x06c6
            if (r2 == 0) goto L_0x06c6
            X.0XL r2 = A06(r1)     // Catch:{ all -> 0x2904 }
            java.lang.Class<com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel> r0 = com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel.class
            X.0Ty r0 = r2.A01(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel r0 = (com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel) r0     // Catch:{ all -> 0x2904 }
            r1.A4i = r0     // Catch:{ all -> 0x2904 }
            X.66R r0 = r0.A0A     // Catch:{ all -> 0x2904 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x2904 }
            X.0Wx r2 = (X.C06270Wx) r2     // Catch:{ all -> 0x2904 }
            X.0sA r0 = A05(r1)     // Catch:{ all -> 0x2904 }
            X.C86604Kt.A1N(r0, r2, r1, r14)     // Catch:{ all -> 0x2904 }
        L_0x06c6:
            X.33p r0 = A0D(r1)     // Catch:{ all -> 0x2904 }
            android.content.SharedPreferences r2 = X.AnonymousClass0x2.A0F(r0)     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "encrypted_rid"
            java.lang.String r23 = ""
            r4 = r23
            java.lang.String r5 = r2.getString(r0, r4)     // Catch:{ all -> 0x2904 }
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x0703
            X.1VX r2 = A0E(r1)     // Catch:{ all -> 0x2904 }
            r0 = 6084(0x17c4, float:8.525E-42)
            boolean r0 = r2.A0X(r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x0703
            X.5OW r2 = r1.A33     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "conversation-qpl-annotations/rid"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x2904 }
            X.5ND r0 = r2.A05     // Catch:{ all -> 0x2904 }
            X.5ob r4 = new X.5ob     // Catch:{ all -> 0x2904 }
            r4.<init>(r2, r5)     // Catch:{ all -> 0x2904 }
            X.316 r0 = r0.A01     // Catch:{ all -> 0x2904 }
            X.8vZ r2 = r0.A0D     // Catch:{ all -> 0x2904 }
            X.2ck r0 = r0.A0A     // Catch:{ all -> 0x2904 }
            int r0 = r0.A07     // Catch:{ all -> 0x2904 }
            r2.BKd(r4, r0)     // Catch:{ all -> 0x2904 }
        L_0x0703:
            X.5OW r2 = r1.A33     // Catch:{ all -> 0x2904 }
            X.3ZH r0 = r1.A3n     // Catch:{ all -> 0x2904 }
            r2.A00(r0)     // Catch:{ all -> 0x2904 }
            X.5OW r7 = r1.A33     // Catch:{ all -> 0x2904 }
            X.4eZ r6 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.4uZ r5 = r1.A4J     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "conversation-qpl-annotations/wallpaper"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x2904 }
            X.5ND r4 = r7.A05     // Catch:{ all -> 0x2904 }
            r2 = 1
            X.68V r0 = new X.68V     // Catch:{ all -> 0x2904 }
            r0.<init>(r6, r7, r5, r2)     // Catch:{ all -> 0x2904 }
            X.316 r2 = r4.A01     // Catch:{ all -> 0x2904 }
            X.8vZ r4 = r2.A0D     // Catch:{ all -> 0x2904 }
            X.2ck r2 = r2.A0A     // Catch:{ all -> 0x2904 }
            int r2 = r2.A07     // Catch:{ all -> 0x2904 }
            r4.BKd(r0, r2)     // Catch:{ all -> 0x2904 }
            boolean r2 = r8.A0Y     // Catch:{ all -> 0x2904 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x2904 }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x2904 }
            r1.A6P = r2     // Catch:{ all -> 0x2904 }
            boolean r2 = r8.A0a     // Catch:{ all -> 0x2904 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x2904 }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x2904 }
            r1.A6R = r2     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            boolean r0 = r0 instanceof X.C95804uY     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x075d
            X.5LO r0 = A0C(r1)     // Catch:{ all -> 0x2904 }
            X.8qC r0 = r0.A0D     // Catch:{ all -> 0x2904 }
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x2904 }
            X.5Pe r2 = (X.C103985Pe) r2     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            X.4uY r0 = (X.C95804uY) r0     // Catch:{ all -> 0x2904 }
            boolean r2 = r2.A01(r0)     // Catch:{ all -> 0x2904 }
            r0 = 1
            if (r2 != 0) goto L_0x075e
        L_0x075d:
            r0 = 0
        L_0x075e:
            r1.A6X = r0     // Catch:{ all -> 0x2904 }
            boolean r0 = r8.A0S     // Catch:{ all -> 0x2904 }
            r1.A6H = r0     // Catch:{ all -> 0x2904 }
            X.4VQ r2 = r1.A3B     // Catch:{ all -> 0x2904 }
            boolean r0 = r8.A0R     // Catch:{ all -> 0x2904 }
            r2.A0M = r0     // Catch:{ all -> 0x2904 }
            X.2hT r0 = r1.A3W     // Catch:{ all -> 0x2904 }
            r0.A00()     // Catch:{ all -> 0x2904 }
            boolean r0 = r3.A0C     // Catch:{ all -> 0x2904 }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x2904 }
            java.lang.String r2 = "conversation/onCreate entryPoint="
            r4.append(r2)     // Catch:{ all -> 0x2904 }
            java.lang.String r7 = r8.A0F     // Catch:{ all -> 0x2904 }
            X.C18260x0.A1L(r4, r7)     // Catch:{ all -> 0x2904 }
            X.2Xx r2 = r1.A3V     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x078f
            X.2Fn r2 = r2.A00     // Catch:{ all -> 0x2904 }
            X.1VX r4 = r2.A00     // Catch:{ all -> 0x2904 }
            r2 = 976(0x3d0, float:1.368E-42)
            boolean r2 = r4.A0X(r2)     // Catch:{ all -> 0x2904 }
            if (r2 == 0) goto L_0x0895
        L_0x078f:
            r2 = 0
            X.2Xx r4 = r1.A3V     // Catch:{ all -> 0x2904 }
            boolean r4 = r4.A00()     // Catch:{ all -> 0x2904 }
            if (r4 != 0) goto L_0x0895
            X.5IV r0 = r1.A3P     // Catch:{ all -> 0x2904 }
            X.2hn r5 = r0.A02     // Catch:{ all -> 0x2904 }
            X.3ZH r4 = r1.A3n     // Catch:{ all -> 0x2904 }
            java.lang.Class<com.whatsapp.jid.UserJid> r18 = com.whatsapp.jid.UserJid.class
            r0 = r18
            com.whatsapp.jid.Jid r4 = r4.A0I(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4     // Catch:{ all -> 0x2904 }
            if (r4 == 0) goto L_0x07bd
            X.1Qq r0 = r5.A01     // Catch:{ all -> 0x2904 }
            X.2e5 r0 = r0.A00(r4)     // Catch:{ all -> 0x2904 }
            boolean r0 = r0 instanceof X.C22891Qm     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x07bd
            X.2gY r5 = r1.A3U     // Catch:{ all -> 0x2904 }
            X.4uZ r4 = r1.A4J     // Catch:{ all -> 0x2904 }
            r0 = 10
            r5.A01(r4, r0)     // Catch:{ all -> 0x2904 }
        L_0x07bd:
            r1.A6D = r2     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass32Y.A05(r0)     // Catch:{ all -> 0x2904 }
            if (r2 == 0) goto L_0x07d8
            X.1Qs r0 = r1.A3R     // Catch:{ all -> 0x2904 }
            X.2rp r0 = r0.A04     // Catch:{ all -> 0x2904 }
            java.lang.Object r2 = r0.A01(r2)     // Catch:{ all -> 0x2904 }
            X.1Qm r2 = (X.C22891Qm) r2     // Catch:{ all -> 0x2904 }
            if (r2 == 0) goto L_0x07d8
            X.1Qs r0 = r1.A3R     // Catch:{ all -> 0x2904 }
            r0.A06(r2)     // Catch:{ all -> 0x2904 }
        L_0x07d8:
            r1.A6F = r7     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = r8.A0E     // Catch:{ all -> 0x2904 }
            r1.A6E = r0     // Catch:{ all -> 0x2904 }
            X.5JC r4 = r1.A2v     // Catch:{ all -> 0x2904 }
            X.4uZ r11 = r1.A4J     // Catch:{ all -> 0x2904 }
            X.5Wq r2 = r1.A3S     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = r2.A04     // Catch:{ all -> 0x2904 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x0819
            java.lang.String r0 = r2.A08     // Catch:{ all -> 0x2904 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x0819
            X.2ss r0 = r4.A02     // Catch:{ all -> 0x2904 }
            boolean r0 = r0.A0L(r11)     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x0819
            X.1VX r2 = r4.A03     // Catch:{ all -> 0x2904 }
            r0 = 2666(0xa6a, float:3.736E-42)
            boolean r0 = r2.A0X(r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x0819
            X.3Ex r0 = r4.A00     // Catch:{ all -> 0x2904 }
            X.3ZH r0 = r0.A0A(r11)     // Catch:{ all -> 0x2904 }
            X.2sA r9 = r4.A01     // Catch:{ all -> 0x2904 }
            java.lang.String r13 = r0.A0J()     // Catch:{ all -> 0x2904 }
            r12 = 0
            X.21b r10 = X.C371321b.CTWA     // Catch:{ all -> 0x2904 }
            r14 = 1
            r9.A02(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x2904 }
        L_0x0819:
            X.5IV r2 = r1.A3P     // Catch:{ all -> 0x2904 }
            X.5D7 r0 = r2.A01     // Catch:{ all -> 0x2904 }
            X.4UA r7 = r1.A3D     // Catch:{ all -> 0x2904 }
            X.5Rl r6 = r2.A00     // Catch:{ all -> 0x2904 }
            X.5sx r9 = r0.A00     // Catch:{ all -> 0x2904 }
            X.4as r0 = r9.A01     // Catch:{ all -> 0x2904 }
            android.app.Activity r5 = r0.A4W     // Catch:{ all -> 0x2904 }
            X.3Db r0 = r9.A03     // Catch:{ all -> 0x2904 }
            X.3Wi r34 = X.C64333Db.A04(r0)     // Catch:{ all -> 0x2904 }
            X.3Db r0 = r9.A03     // Catch:{ all -> 0x2904 }
            X.5Zz r42 = X.C86634Kw.A0m(r0)     // Catch:{ all -> 0x2904 }
            X.2s4 r35 = X.C64333Db.A07(r0)     // Catch:{ all -> 0x2904 }
            X.5bk r2 = r0.A00     // Catch:{ all -> 0x2904 }
            X.4C1 r4 = r2.A64     // Catch:{ all -> 0x2904 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x2904 }
            X.5GD r4 = (X.AnonymousClass5GD) r4     // Catch:{ all -> 0x2904 }
            X.2rN r43 = X.C64333Db.A8w(r0)     // Catch:{ all -> 0x2904 }
            X.4C1 r2 = r2.A63     // Catch:{ all -> 0x2904 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x2904 }
            X.5Py r2 = (X.C104175Py) r2     // Catch:{ all -> 0x2904 }
            X.4as r9 = r9.A01     // Catch:{ all -> 0x2904 }
            X.2e0 r36 = r9.ACJ()     // Catch:{ all -> 0x2904 }
            X.5Wv r44 = X.C86644Kx.A0b(r0)     // Catch:{ all -> 0x2904 }
            X.5RH r0 = new X.5RH     // Catch:{ all -> 0x2904 }
            r32 = r0
            r33 = r5
            r37 = r7
            r38 = r3
            r39 = r2
            r40 = r4
            r41 = r6
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)     // Catch:{ all -> 0x2904 }
            r1.A3T = r0     // Catch:{ all -> 0x2904 }
            X.1VX r2 = A0E(r1)     // Catch:{ all -> 0x2904 }
            r0 = 508(0x1fc, float:7.12E-43)
            boolean r0 = r2.A0X(r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x088c
            java.lang.String r0 = r1.A6F     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x088c
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass32Y.A05(r0)     // Catch:{ all -> 0x2904 }
            if (r4 == 0) goto L_0x088c
            X.4FS r2 = A0G(r1)     // Catch:{ all -> 0x2904 }
            r0 = 1
            X.C117155rT.A00(r2, r1, r4, r0)     // Catch:{ all -> 0x2904 }
        L_0x088c:
            X.3ZH r0 = r1.A3n     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r0.A0H     // Catch:{ all -> 0x2904 }
            boolean r0 = r0 instanceof X.AnonymousClass1fS     // Catch:{ all -> 0x2904 }
            r1.A6W = r0     // Catch:{ all -> 0x2904 }
            goto L_0x090e
        L_0x0895:
            X.5IV r2 = r1.A3P     // Catch:{ all -> 0x2904 }
            X.2hn r5 = r2.A02     // Catch:{ all -> 0x2904 }
            X.3ZH r4 = r1.A3n     // Catch:{ all -> 0x2904 }
            java.lang.Class<com.whatsapp.jid.UserJid> r18 = com.whatsapp.jid.UserJid.class
            r2 = r18
            com.whatsapp.jid.Jid r4 = r4.A0I(r2)     // Catch:{ all -> 0x2904 }
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4     // Catch:{ all -> 0x2904 }
            if (r4 == 0) goto L_0x08ba
            X.1Qq r2 = r5.A01     // Catch:{ all -> 0x2904 }
            X.2e5 r2 = r2.A00(r4)     // Catch:{ all -> 0x2904 }
            boolean r2 = r2 instanceof X.C22891Qm     // Catch:{ all -> 0x2904 }
            if (r2 == 0) goto L_0x08ba
            X.2gY r5 = r1.A3U     // Catch:{ all -> 0x2904 }
            X.4uZ r4 = r1.A4J     // Catch:{ all -> 0x2904 }
            r2 = 9
            r5.A01(r4, r2)     // Catch:{ all -> 0x2904 }
        L_0x08ba:
            java.lang.String r2 = r3.A04     // Catch:{ all -> 0x2904 }
            r1.A6D = r2     // Catch:{ all -> 0x2904 }
            X.3ZH r2 = r1.A3n     // Catch:{ all -> 0x2904 }
            r4 = r18
            com.whatsapp.jid.Jid r6 = r2.A0I(r4)     // Catch:{ all -> 0x2904 }
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6     // Catch:{ all -> 0x2904 }
            if (r6 == 0) goto L_0x0909
            X.2o4 r5 = r1.A3q     // Catch:{ all -> 0x2904 }
            boolean r4 = r3.A0D     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x08dd
            X.2Fn r0 = r5.A02     // Catch:{ all -> 0x2904 }
            X.1VX r2 = r0.A00     // Catch:{ all -> 0x2904 }
            r0 = 976(0x3d0, float:1.368E-42)
            boolean r2 = r2.A0X(r0)     // Catch:{ all -> 0x2904 }
            r0 = 0
            if (r2 == 0) goto L_0x08de
        L_0x08dd:
            r0 = 1
        L_0x08de:
            r0 = r0 ^ 1
            boolean r0 = r5.A02(r6, r0, r4)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x0909
            X.214 r4 = X.AnonymousClass214.NON_BLOCKING_DISCLOSURE     // Catch:{ all -> 0x2904 }
            X.4uZ r2 = r1.A4J     // Catch:{ all -> 0x2904 }
            X.3ZH r0 = r1.A3n     // Catch:{ all -> 0x2904 }
            boolean r0 = r0.A0R()     // Catch:{ all -> 0x2904 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureFragment r4 = X.AnonymousClass26H.A00(r2, r4, r0)     // Catch:{ all -> 0x2904 }
            r2 = 1
            X.6By r0 = new X.6By     // Catch:{ all -> 0x2904 }
            r0.<init>(r8, r2, r1)     // Catch:{ all -> 0x2904 }
            r4.A06 = r0     // Catch:{ all -> 0x2904 }
            X.0df r0 = A04(r1)     // Catch:{ all -> 0x2904 }
            X.AnonymousClass344.A00(r4, r0)     // Catch:{ all -> 0x2904 }
            goto L_0x07d8
        L_0x0909:
            r1.A1o(r3)     // Catch:{ all -> 0x2904 }
            goto L_0x07d8
        L_0x090e:
            if (r15 != 0) goto L_0x092a
            X.4VQ r0 = r1.A3B     // Catch:{ all -> 0x2904 }
            X.2gb r2 = r0.A0n     // Catch:{ all -> 0x2904 }
            r0 = r30
            r2.A00(r0)     // Catch:{ all -> 0x2904 }
            X.4VQ r0 = r1.A3B     // Catch:{ all -> 0x2904 }
            X.4eZ r2 = A09(r1)     // Catch:{ all -> 0x2904 }
            java.lang.String r4 = r2.getLocalClassName()     // Catch:{ all -> 0x2904 }
            X.2pj r2 = r0.A0o     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r0.A0x     // Catch:{ all -> 0x2904 }
            r2.A02(r0, r4)     // Catch:{ all -> 0x2904 }
        L_0x092a:
            X.4uZ r4 = r1.A4J     // Catch:{ all -> 0x2904 }
            com.whatsapp.jid.UserJid r5 = X.AnonymousClass32Y.A05(r4)     // Catch:{ all -> 0x2904 }
            X.2ss r2 = r1.A3d     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.3Ex r0 = r0.getContactManager()     // Catch:{ all -> 0x2904 }
            int r0 = X.AnonymousClass352.A00(r0, r2, r4)     // Catch:{ all -> 0x2904 }
            if (r0 <= 0) goto L_0x0951
            if (r5 == 0) goto L_0x0951
            X.2hv r0 = r1.A5U     // Catch:{ all -> 0x2904 }
            boolean r0 = r0.A01(r5)     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x0951
            X.33m r4 = A08(r1)     // Catch:{ all -> 0x2904 }
            r2 = 0
            r0 = 0
            r4.A0M(r5, r2, r0, r0)     // Catch:{ all -> 0x2904 }
        L_0x0951:
            r0 = 1
            r1.A6Y = r0     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "inflateViews_start"
            r1.A2F(r0)     // Catch:{ all -> 0x2904 }
            boolean r0 = r1.A2X()     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x0983
            java.lang.String r0 = "conversationBottomSheet"
            r1.A2F(r0)     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131624480(0x7f0e0220, float:1.887614E38)
        L_0x0969:
            r2.setContentView(r0)     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "inflateViews_end"
            r1.A2F(r0)     // Catch:{ all -> 0x2904 }
            X.4eZ r2 = A09(r1)     // Catch:{ all -> 0x2904 }
            r0 = 2131429121(0x7f0b0701, float:1.8479906E38)
            android.view.View r4 = X.C005205m.A00(r2, r0)     // Catch:{ all -> 0x2904 }
            androidx.appcompat.widget.Toolbar r0 = X.C86644Kx.A0K(r4)     // Catch:{ all -> 0x2904 }
            r1.A0r = r0     // Catch:{ all -> 0x2904 }
            goto L_0x098e
        L_0x0983:
            java.lang.String r0 = "conversation"
            r1.A2F(r0)     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131624463(0x7f0e020f, float:1.8876106E38)
            goto L_0x0969
        L_0x098e:
            if (r0 == 0) goto L_0x0a27
            X.66o r2 = X.AnonymousClass5KY.A00(r1)     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            boolean r0 = r2.BH4(r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x09e8
            r0 = 2131433294(0x7f0b174e, float:1.848837E38)
            android.view.ViewGroup r4 = X.C86644Kx.A0I(r4, r0)     // Catch:{ all -> 0x2904 }
            X.66o r2 = X.AnonymousClass5KY.A00(r1)     // Catch:{ all -> 0x2904 }
            androidx.appcompat.widget.Toolbar r0 = r1.A0r     // Catch:{ all -> 0x2904 }
            r4.removeView(r0)     // Catch:{ all -> 0x2904 }
            X.4eZ r7 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.4eZ r4 = A09(r1)     // Catch:{ all -> 0x2904 }
            r0 = 2131433177(0x7f0b16d9, float:1.8488132E38)
            android.view.ViewGroup r6 = X.C86664Kz.A0k(r4, r0)     // Catch:{ all -> 0x2904 }
            r0 = 3
            X.69p r5 = new X.69p     // Catch:{ all -> 0x2904 }
            r5.<init>(r2, r0, r1)     // Catch:{ all -> 0x2904 }
            r4 = 0
            X.C162457s7.A0J(r7, r4)     // Catch:{ all -> 0x2904 }
            r0 = 1
            android.view.LayoutInflater r2 = X.C86604Kt.A0E(r6, r0)     // Catch:{ all -> 0x2904 }
            r0 = 2131624187(0x7f0e00fb, float:1.8875547E38)
            android.view.View r2 = r2.inflate(r0, r6, r4)     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.bonsai.BonsaiToolbar"
            X.C162457s7.A0K(r2, r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.bonsai.BonsaiToolbar r2 = (com.whatsapp.bonsai.BonsaiToolbar) r2     // Catch:{ all -> 0x2904 }
            r6.addView(r2)     // Catch:{ all -> 0x2904 }
            r2.A00 = r7     // Catch:{ all -> 0x2904 }
            r0 = 2131102581(0x7f060b75, float:1.7817604E38)
            X.C107405bG.A08(r7, r0)     // Catch:{ all -> 0x2904 }
            r2.addOnLayoutChangeListener(r5)     // Catch:{ all -> 0x2904 }
            r1.A0r = r2     // Catch:{ all -> 0x2904 }
        L_0x09e8:
            androidx.appcompat.widget.Toolbar r7 = r1.A0r     // Catch:{ all -> 0x2904 }
            r6 = 0
            r7.A07()     // Catch:{ all -> 0x2904 }
            int r5 = r7.getPaddingLeft()     // Catch:{ all -> 0x2904 }
            androidx.appcompat.widget.Toolbar r0 = r1.A0r     // Catch:{ all -> 0x2904 }
            int r4 = r0.getPaddingTop()     // Catch:{ all -> 0x2904 }
            android.content.res.Resources r2 = A02(r1)     // Catch:{ all -> 0x2904 }
            r0 = 2131166130(0x7f0703b2, float:1.7946497E38)
            int r2 = r2.getDimensionPixelSize(r0)     // Catch:{ all -> 0x2904 }
            androidx.appcompat.widget.Toolbar r0 = r1.A0r     // Catch:{ all -> 0x2904 }
            X.C86634Kw.A1B(r0, r7, r5, r4, r2)     // Catch:{ all -> 0x2904 }
            androidx.appcompat.widget.Toolbar r0 = r1.A0r     // Catch:{ all -> 0x2904 }
            r0.setTouchscreenBlocksFocus(r6)     // Catch:{ all -> 0x2904 }
            boolean r0 = r1.A6L     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x0a27
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            androidx.appcompat.widget.Toolbar r0 = r1.A0r     // Catch:{ all -> 0x2904 }
            r2.setSupportActionBar(r0)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.0R8 r0 = r0.getSupportActionBar()     // Catch:{ all -> 0x2904 }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x2904 }
            r0.A0N(r6)     // Catch:{ all -> 0x2904 }
            r0.A0Q(r6)     // Catch:{ all -> 0x2904 }
        L_0x0a27:
            java.lang.String r0 = "setupToolbar"
            r1.A2F(r0)     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131433295(0x7f0b174f, float:1.8488372E38)
            android.view.View r0 = r2.findViewById(r0)     // Catch:{ all -> 0x2904 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ all -> 0x2904 }
            r1.A0Y = r0     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "searchFragmentHolder"
            r1.A2F(r0)     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131429113(0x7f0b06f9, float:1.847989E38)
            android.view.View r6 = r2.findViewById(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.KeyboardPopupLayout r6 = (com.whatsapp.KeyboardPopupLayout) r6     // Catch:{ all -> 0x2904 }
            r1.A1a = r6     // Catch:{ all -> 0x2904 }
            X.4eZ r5 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.4eZ r4 = A09(r1)     // Catch:{ all -> 0x2904 }
            r2 = 2130969255(0x7f0402a7, float:1.7547187E38)
            r0 = 2131100342(0x7f0602b6, float:1.7813063E38)
            int r0 = X.AnonymousClass5Yj.A03(r4, r5, r2, r0)     // Catch:{ all -> 0x2904 }
            r6.setKeyboardPopupBackgroundColor(r0)     // Catch:{ all -> 0x2904 }
            X.4eZ r2 = A09(r1)     // Catch:{ all -> 0x2904 }
            r0 = 2131433177(0x7f0b16d9, float:1.8488132E38)
            android.view.View r0 = X.C005205m.A00(r2, r0)     // Catch:{ all -> 0x2904 }
            r1.A0C = r0     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "conversationLayoutRoot"
            r1.A2F(r0)     // Catch:{ all -> 0x2904 }
            boolean r0 = r1.A2X()     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x0a95
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131429177(0x7f0b0739, float:1.848002E38)
            android.view.View r0 = r2.findViewById(r0)     // Catch:{ all -> 0x2904 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ all -> 0x2904 }
            r1.A0V = r0     // Catch:{ all -> 0x2904 }
            X.4eZ r2 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.1VX r0 = r1.A41     // Catch:{ all -> 0x2904 }
            android.widget.ImageButton r2 = X.AnonymousClass5V8.A00(r2, r0)     // Catch:{ all -> 0x2904 }
            r1.A0f = r2     // Catch:{ all -> 0x2904 }
            r0 = 7
            X.C18290x4.A1G(r2, r1, r0)     // Catch:{ all -> 0x2904 }
        L_0x0a95:
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r2.findViewById(r0)     // Catch:{ all -> 0x2904 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ all -> 0x2904 }
            r1.A0U = r0     // Catch:{ all -> 0x2904 }
            X.4xi r0 = r1.A4E     // Catch:{ all -> 0x2904 }
            boolean r0 = r0.A0E()     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x0ab6
            X.66o r2 = X.AnonymousClass5KY.A00(r1)     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            boolean r0 = r2.BH4(r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x0ae2
        L_0x0ab6:
            X.4eZ r0 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.C107405bG.A06(r0)     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131433885(0x7f0b199d, float:1.8489568E38)
            android.view.View r0 = r2.findViewById(r0)     // Catch:{ all -> 0x2904 }
            r1.A0Q = r0     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x0adc
            boolean r0 = X.C107385bE.A02()     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x0afb
            X.66o r2 = X.AnonymousClass5KY.A00(r1)     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            boolean r0 = r2.BH4(r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x0afb
        L_0x0adc:
            android.view.ViewGroup r2 = r1.A0U     // Catch:{ all -> 0x2904 }
            r0 = 3
            X.AnonymousClass6B8.A00(r2, r1, r0)     // Catch:{ all -> 0x2904 }
        L_0x0ae2:
            X.67C r4 = r1.A2O     // Catch:{ all -> 0x2904 }
            r2 = 2
            X.69O r0 = new X.69O     // Catch:{ all -> 0x2904 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x2904 }
            X.C112715kB.A00(r0, r4)     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131429121(0x7f0b0701, float:1.8479906E38)
            android.view.View r0 = r2.findViewById(r0)     // Catch:{ all -> 0x2904 }
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch:{ all -> 0x2904 }
            r1.A0k = r0     // Catch:{ all -> 0x2904 }
            goto L_0x0b02
        L_0x0afb:
            android.view.View r2 = r1.A0Q     // Catch:{ all -> 0x2904 }
            r0 = 0
            r2.setVisibility(r0)     // Catch:{ all -> 0x2904 }
            goto L_0x0adc
        L_0x0b02:
            if (r0 == 0) goto L_0x0b11
            X.1VX r2 = r1.A41     // Catch:{ all -> 0x2904 }
            r0 = 6989(0x1b4d, float:9.794E-42)
            boolean r0 = r2.A0X(r0)     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x0b11
            r1.A11()     // Catch:{ all -> 0x2904 }
        L_0x0b11:
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            r14 = 2131429655(0x7f0b0917, float:1.8480989E38)
            android.view.View r0 = r0.findViewById(r14)     // Catch:{ all -> 0x2904 }
            r1.A0D = r0     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131432885(0x7f0b15b5, float:1.848754E38)
            android.view.View r0 = r2.findViewById(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.TextEmojiLabel r0 = (com.whatsapp.TextEmojiLabel) r0     // Catch:{ all -> 0x2904 }
            r1.A1j = r0     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131432886(0x7f0b15b6, float:1.8487542E38)
            android.view.View r0 = r2.findViewById(r0)     // Catch:{ all -> 0x2904 }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ all -> 0x2904 }
            r1.A0j = r0     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131432887(0x7f0b15b7, float:1.8487544E38)
            android.view.View r5 = r2.findViewById(r0)     // Catch:{ all -> 0x2904 }
            android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ all -> 0x2904 }
            r1.A0i = r5     // Catch:{ all -> 0x2904 }
            X.33j r4 = r1.A3L     // Catch:{ all -> 0x2904 }
            X.4eZ r2 = A09(r1)     // Catch:{ all -> 0x2904 }
            r0 = 2131231274(0x7f08022a, float:1.8078624E38)
            X.C18270x1.A0d(r2, r5, r4, r0)     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131432888(0x7f0b15b8, float:1.8487546E38)
            android.view.View r0 = r2.findViewById(r0)     // Catch:{ all -> 0x2904 }
            r1.A0I = r0     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131429967(0x7f0b0a4f, float:1.8481622E38)
            android.view.View r0 = r2.findViewById(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0     // Catch:{ all -> 0x2904 }
            r1.A5v = r0     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131428926(0x7f0b063e, float:1.847951E38)
            android.view.View r0 = r2.findViewById(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.TextEmojiLabel r0 = (com.whatsapp.TextEmojiLabel) r0     // Catch:{ all -> 0x2904 }
            r1.A1i = r0     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131429278(0x7f0b079e, float:1.8480224E38)
            android.view.View r2 = r2.findViewById(r0)     // Catch:{ all -> 0x2904 }
            X.5UY r0 = new X.5UY     // Catch:{ all -> 0x2904 }
            r0.<init>(r2)     // Catch:{ all -> 0x2904 }
            r1.A5c = r0     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131427901(0x7f0b023d, float:1.8477431E38)
            android.view.View r2 = r2.findViewById(r0)     // Catch:{ all -> 0x2904 }
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ all -> 0x2904 }
            r1.A0T = r2     // Catch:{ all -> 0x2904 }
            boolean r0 = X.C107385bE.A01()     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x0b9d
            r0 = 16908298(0x102000a, float:2.3877257E-38)
            r2.setAccessibilityTraversalBefore(r0)     // Catch:{ all -> 0x2904 }
        L_0x0b9d:
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131434885(0x7f0b1d85, float:1.8491597E38)
            android.view.View r0 = r2.findViewById(r0)     // Catch:{ all -> 0x2904 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ all -> 0x2904 }
            r1.A0a = r0     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131432817(0x7f0b1571, float:1.8487402E38)
            android.view.View r0 = r2.findViewById(r0)     // Catch:{ all -> 0x2904 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ all -> 0x2904 }
            r1.A0W = r0     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131432818(0x7f0b1572, float:1.8487404E38)
            android.view.View r0 = r2.findViewById(r0)     // Catch:{ all -> 0x2904 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ all -> 0x2904 }
            r1.A0X = r0     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131434764(0x7f0b1d0c, float:1.8491351E38)
            android.view.View r0 = r2.findViewById(r0)     // Catch:{ all -> 0x2904 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ all -> 0x2904 }
            r1.A0Z = r0     // Catch:{ all -> 0x2904 }
            com.whatsapp.KeyboardPopupLayout r2 = r1.A1a     // Catch:{ all -> 0x2904 }
            r0 = 2131428947(0x7f0b0653, float:1.8479553E38)
            X.C06560Yg.A02(r2, r0)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0.getLifecycleOwner()     // Catch:{ all -> 0x2904 }
            r2 = 2131429093(0x7f0b06e5, float:1.847985E38)
            X.4eZ r0 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.5UY r2 = X.AnonymousClass5UY.A01(r0, r2)     // Catch:{ all -> 0x2904 }
            r0 = 0
            android.view.View r17 = X.AnonymousClass5UY.A00(r2, r0)     // Catch:{ all -> 0x2904 }
            r0 = r17
            com.whatsapp.settings.chat.wallpaper.WallPaperView r0 = (com.whatsapp.settings.chat.wallpaper.WallPaperView) r0     // Catch:{ all -> 0x2904 }
            r17 = r0
            X.8JZ r0 = new X.8JZ     // Catch:{ all -> 0x2904 }
            r0.<init>(r1)     // Catch:{ all -> 0x2904 }
            r2 = r17
            r2.A01 = r0     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            android.widget.ListView r2 = r0.getListView()     // Catch:{ all -> 0x2904 }
            com.whatsapp.conversation.ConversationListView r2 = (com.whatsapp.conversation.ConversationListView) r2     // Catch:{ all -> 0x2904 }
            r1.A2f = r2     // Catch:{ all -> 0x2904 }
            r0 = 0
            r2.setDividerHeight(r0)     // Catch:{ all -> 0x2904 }
            X.66o r2 = X.AnonymousClass5KY.A00(r1)     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            boolean r0 = r2.BH2(r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x0cea
            X.66o r15 = X.AnonymousClass5KY.A00(r1)     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "bonsai_start"
            r1.A2F(r0)     // Catch:{ all -> 0x2904 }
            X.3ZH r0 = r1.A3n     // Catch:{ all -> 0x2904 }
            X.4uZ r13 = r0.A0H     // Catch:{ all -> 0x2904 }
            r0 = r15
            X.5jK r0 = (X.C112185jK) r0     // Catch:{ all -> 0x2904 }
            if (r13 == 0) goto L_0x0c54
            X.3GN r0 = r0.A06     // Catch:{ all -> 0x2904 }
            boolean r2 = X.C155477ey.A00(r13)     // Catch:{ all -> 0x2904 }
            if (r2 == 0) goto L_0x0c54
            X.2m4 r2 = r0.A00     // Catch:{ all -> 0x2904 }
            boolean r2 = r2.A00()     // Catch:{ all -> 0x2904 }
            if (r2 == 0) goto L_0x0c54
            java.util.concurrent.ConcurrentHashMap r12 = r0.A06     // Catch:{ all -> 0x2904 }
            java.lang.Object r2 = r12.get(r13)     // Catch:{ all -> 0x2904 }
            if (r2 != 0) goto L_0x0c54
            X.2ss r11 = r0.A04     // Catch:{ all -> 0x2904 }
            X.31A r10 = X.C56982ss.A00(r11, r13)     // Catch:{ all -> 0x2904 }
            if (r10 == 0) goto L_0x0c54
            X.2XZ r2 = r0.A01     // Catch:{ all -> 0x2904 }
            r9 = 0
            boolean r0 = r10 instanceof X.AnonymousClass1RK     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x0c5f
            X.1RK r10 = (X.AnonymousClass1RK) r10     // Catch:{ all -> 0x2904 }
            if (r10 != 0) goto L_0x0cb9
        L_0x0c54:
            X.66o r2 = X.AnonymousClass5KY.A00(r1)     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            boolean r0 = r2.BH4(r0)     // Catch:{ all -> 0x2904 }
            goto L_0x0cc0
        L_0x0c5f:
            X.4uZ r0 = r10.A05()     // Catch:{ all -> 0x2904 }
            boolean r0 = X.C155477ey.A00(r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x0c54
            X.2m4 r0 = r2.A00     // Catch:{ all -> 0x2904 }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x0c54
            X.3dV r0 = r2.A01     // Catch:{ all -> 0x2904 }
            X.4GK r7 = r0.get()     // Catch:{ all -> 0x2904 }
            r0 = r7
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0cca }
            X.2sg r6 = r0.A03     // Catch:{ all -> 0x0cca }
            java.lang.String r2 = "SELECT pip_enabled FROM bot_chat_info WHERE chat_row_id = ?"
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0cca }
            java.lang.Long r4 = r10.A06()     // Catch:{ all -> 0x0cca }
            long r4 = r4.longValue()     // Catch:{ all -> 0x0cca }
            X.AnonymousClass0x2.A1S(r0, r9, r4)     // Catch:{ all -> 0x0cca }
            java.lang.String r4 = "BotChatInfoStore/GET_CHAT_INFO"
            android.database.Cursor r4 = r6.A0E(r2, r4, r0)     // Catch:{ all -> 0x0cca }
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x0cc3 }
            if (r0 != 0) goto L_0x0ca1
            monitor-enter(r10)     // Catch:{ all -> 0x0cc3 }
            monitor-exit(r10)     // Catch:{ all -> 0x0cc3 }
            r4.close()     // Catch:{ all -> 0x0cca }
            r7.close()     // Catch:{ all -> 0x2904 }
            goto L_0x0c54
        L_0x0ca1:
            monitor-enter(r10)     // Catch:{ all -> 0x0cc3 }
            monitor-exit(r10)     // Catch:{ all -> 0x0cc3 }
            java.lang.String r0 = "pip_enabled"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0cc3 }
            boolean r2 = X.C382426h.A00(r4, r0)     // Catch:{ all -> 0x0cc3 }
            X.1RK r0 = new X.1RK     // Catch:{ all -> 0x0cc3 }
            r0.<init>(r10, r2)     // Catch:{ all -> 0x0cc3 }
            r4.close()     // Catch:{ all -> 0x0cca }
            r7.close()     // Catch:{ all -> 0x2904 }
            r10 = r0
        L_0x0cb9:
            r11.A0H(r10, r13)     // Catch:{ all -> 0x2904 }
            r12.put(r13, r10)     // Catch:{ all -> 0x2904 }
            goto L_0x0c54
        L_0x0cc0:
            if (r0 == 0) goto L_0x0ce5
            goto L_0x0cd2
        L_0x0cc3:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0cc5 }
        L_0x0cc5:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r2)     // Catch:{ all -> 0x0cca }
            throw r0     // Catch:{ all -> 0x0cca }
        L_0x0cca:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0ccc }
        L_0x0ccc:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r7, r2)     // Catch:{ all -> 0x2904 }
            goto L_0x2867
        L_0x0cd2:
            com.whatsapp.conversation.ConversationListView r5 = r1.A2f     // Catch:{ all -> 0x2904 }
            X.3ZH r4 = r1.A3n     // Catch:{ all -> 0x2904 }
            X.4eZ r0 = A09(r1)     // Catch:{ all -> 0x2904 }
            android.content.res.Configuration r2 = X.AnonymousClass001.A0M(r0)     // Catch:{ all -> 0x2904 }
            android.view.Window r0 = A03(r1)     // Catch:{ all -> 0x2904 }
            r15.BhO(r2, r0, r5, r4)     // Catch:{ all -> 0x2904 }
        L_0x0ce5:
            java.lang.String r0 = "bonsai_end"
            r1.A2F(r0)     // Catch:{ all -> 0x2904 }
        L_0x0cea:
            com.whatsapp.conversation.ConversationListView r0 = r1.A2f     // Catch:{ all -> 0x2904 }
            android.view.ViewTreeObserver r2 = r0.getViewTreeObserver()     // Catch:{ all -> 0x2904 }
            android.view.ViewTreeObserver$OnPreDrawListener r0 = r1.A6w     // Catch:{ all -> 0x2904 }
            r2.addOnPreDrawListener(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.conversation.ConversationListView r2 = r1.A2f     // Catch:{ all -> 0x2904 }
            boolean r0 = r1.A6b     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x0d00
            r0 = 9
            X.C86614Ku.A1H(r2, r1, r0)     // Catch:{ all -> 0x2904 }
        L_0x0d00:
            X.5D5 r0 = r1.A18     // Catch:{ all -> 0x2904 }
            X.4eZ r4 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.5sx r0 = r0.A00     // Catch:{ all -> 0x2904 }
            X.3Db r0 = r0.A03     // Catch:{ all -> 0x2904 }
            X.2sq r2 = X.C86654Ky.A0T(r0)     // Catch:{ all -> 0x2904 }
            X.5IT r0 = new X.5IT     // Catch:{ all -> 0x2904 }
            r0.<init>(r4, r2)     // Catch:{ all -> 0x2904 }
            r1.A2w = r0     // Catch:{ all -> 0x2904 }
            X.5LO r0 = A0C(r1)     // Catch:{ all -> 0x2904 }
            X.5DT r0 = r0.A03     // Catch:{ all -> 0x2904 }
            X.4eZ r5 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.5sx r0 = r0.A00     // Catch:{ all -> 0x2904 }
            X.3Db r0 = r0.A03     // Catch:{ all -> 0x2904 }
            X.5bk r2 = r0.A00     // Catch:{ all -> 0x2904 }
            X.4C1 r2 = r2.A8E     // Catch:{ all -> 0x2904 }
            java.lang.Object r4 = r2.get()     // Catch:{ all -> 0x2904 }
            X.5m4 r4 = (X.C113835m4) r4     // Catch:{ all -> 0x2904 }
            X.4C1 r0 = r0.A82     // Catch:{ all -> 0x2904 }
            X.8qC r2 = X.C72343dZ.A00(r0)     // Catch:{ all -> 0x2904 }
            X.5JE r0 = new X.5JE     // Catch:{ all -> 0x2904 }
            r0.<init>(r5, r4, r2)     // Catch:{ all -> 0x2904 }
            r1.A2y = r0     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.2sF r6 = r0.getStartupTracker()     // Catch:{ all -> 0x2904 }
            com.whatsapp.conversation.ConversationListView r5 = r1.A2f     // Catch:{ all -> 0x2904 }
            boolean r0 = A0Q(r1)     // Catch:{ all -> 0x2904 }
            r4 = 2
            if (r0 == 0) goto L_0x0d4a
            r4 = 5
        L_0x0d4a:
            r0 = 35
            X.5sD r2 = X.C117615sD.A00(r1, r0)     // Catch:{ all -> 0x2904 }
            r0 = r16
            r6.A03(r5, r2, r0, r4)     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131429572(0x7f0b08c4, float:1.848082E38)
            android.view.View r16 = r2.findViewById(r0)     // Catch:{ all -> 0x2904 }
            r0 = r16
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0     // Catch:{ all -> 0x2904 }
            r16 = r0
            r4 = 2131232985(0x7f0808d9, float:1.8082095E38)
            X.33j r2 = r1.A3L     // Catch:{ all -> 0x2904 }
            X.4eZ r0 = A09(r1)     // Catch:{ all -> 0x2904 }
            r5 = r16
            X.C18270x1.A0d(r0, r5, r2, r4)     // Catch:{ all -> 0x2904 }
            X.5D6 r0 = r1.A19     // Catch:{ all -> 0x2904 }
            X.4eZ r2 = A09(r1)     // Catch:{ all -> 0x2904 }
            android.view.View r2 = X.C005205m.A00(r2, r14)     // Catch:{ all -> 0x2904 }
            X.5sx r0 = r0.A00     // Catch:{ all -> 0x2904 }
            X.3Db r0 = r0.A03     // Catch:{ all -> 0x2904 }
            X.33j r0 = X.C64333Db.A2t(r0)     // Catch:{ all -> 0x2904 }
            X.5KV r5 = new X.5KV     // Catch:{ all -> 0x2904 }
            r5.<init>(r2, r0)     // Catch:{ all -> 0x2904 }
            r1.A2c = r5     // Catch:{ all -> 0x2904 }
            android.widget.FrameLayout r4 = r5.A04     // Catch:{ all -> 0x2904 }
            int r2 = r4.getPaddingLeft()     // Catch:{ all -> 0x2904 }
            int r0 = r4.getPaddingRight()     // Catch:{ all -> 0x2904 }
            int r2 = java.lang.Math.max(r2, r0)     // Catch:{ all -> 0x2904 }
            r0 = 0
            X.C107555bV.A03(r4, r0, r2)     // Catch:{ all -> 0x2904 }
            android.view.View r4 = r5.A02     // Catch:{ all -> 0x2904 }
            r2 = 2131231693(0x7f0803cd, float:1.8079474E38)
            r4.setBackgroundResource(r2)     // Catch:{ all -> 0x2904 }
            r4.setPadding(r0, r0, r0, r0)     // Catch:{ all -> 0x2904 }
            X.4eZ r2 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.1VX r0 = r1.A41     // Catch:{ all -> 0x2904 }
            com.whatsapp.WaImageButton r2 = X.AnonymousClass5V8.A01(r2, r0)     // Catch:{ all -> 0x2904 }
            r1.A0g = r2     // Catch:{ all -> 0x2904 }
            r0 = 2
            X.C18290x4.A1G(r2, r1, r0)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.33i r2 = r0.getSystemServices()     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "android.hardware.type.featurephone"
            boolean r0 = X.C86654Ky.A1X(r2, r0)     // Catch:{ all -> 0x2904 }
            r1.A6U = r0     // Catch:{ all -> 0x2904 }
            X.4eZ r2 = A09(r1)     // Catch:{ all -> 0x2904 }
            r0 = 2131429105(0x7f0b06f1, float:1.8479873E38)
            android.view.View r4 = X.C005205m.A00(r2, r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.conversation.ConversationEntryActionButton r4 = (com.whatsapp.conversation.ConversationEntryActionButton) r4     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.0sD r9 = r0.getViewModelStoreOwner()     // Catch:{ all -> 0x2904 }
            X.5DN r7 = r1.A1R     // Catch:{ all -> 0x2904 }
            X.5TN r6 = r1.A0Y()     // Catch:{ all -> 0x2904 }
            X.1VX r0 = r1.A41     // Catch:{ all -> 0x2904 }
            r5 = 4548(0x11c4, float:6.373E-42)
            boolean r14 = r0.A0X(r5)     // Catch:{ all -> 0x2904 }
            X.1VX r2 = r1.A41     // Catch:{ all -> 0x2904 }
            r0 = 4549(0x11c5, float:6.375E-42)
            boolean r15 = r2.A0X(r0)     // Catch:{ all -> 0x2904 }
            X.4uZ r2 = r1.A4J     // Catch:{ all -> 0x2904 }
            r0 = 1
            X.C86624Kv.A1O(r9, r0, r7)     // Catch:{ all -> 0x2904 }
            r0 = 2
            X.C162457s7.A0J(r6, r0)     // Catch:{ all -> 0x2904 }
            X.5gr r0 = new X.5gr     // Catch:{ all -> 0x2904 }
            r10 = r0
            r11 = r7
            r12 = r6
            r13 = r2
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x2904 }
            X.0XL r2 = X.AnonymousClass4L0.A0F(r0, r9)     // Catch:{ all -> 0x2904 }
            java.lang.Class<X.4VH> r0 = X.AnonymousClass4VH.class
            X.0Ty r0 = r2.A01(r0)     // Catch:{ all -> 0x2904 }
            X.4VH r0 = (X.AnonymousClass4VH) r0     // Catch:{ all -> 0x2904 }
            r1.A38 = r0     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.0sD r7 = r0.getViewModelStoreOwner()     // Catch:{ all -> 0x2904 }
            X.5DO r6 = r1.A1S     // Catch:{ all -> 0x2904 }
            X.5TN r2 = r1.A0Y()     // Catch:{ all -> 0x2904 }
            X.1VX r0 = r1.A41     // Catch:{ all -> 0x2904 }
            boolean r5 = r0.A0X(r5)     // Catch:{ all -> 0x2904 }
            r0 = 1
            X.C86624Kv.A1O(r7, r0, r6)     // Catch:{ all -> 0x2904 }
            r0 = 2
            X.C162457s7.A0J(r2, r0)     // Catch:{ all -> 0x2904 }
            X.5gj r0 = new X.5gj     // Catch:{ all -> 0x2904 }
            r0.<init>(r6, r2, r5)     // Catch:{ all -> 0x2904 }
            X.0XL r2 = X.AnonymousClass4L0.A0F(r0, r7)     // Catch:{ all -> 0x2904 }
            java.lang.Class<X.4Uw> r0 = X.C87684Uw.class
            X.0Ty r0 = r2.A01(r0)     // Catch:{ all -> 0x2904 }
            X.4Uw r0 = (X.C87684Uw) r0     // Catch:{ all -> 0x2904 }
            r1.A3C = r0     // Catch:{ all -> 0x2904 }
            X.4VH r0 = r1.A38     // Catch:{ all -> 0x2904 }
            X.107 r5 = r0.A05     // Catch:{ all -> 0x2904 }
            r2 = 1
            X.923 r0 = new X.923     // Catch:{ all -> 0x2904 }
            r0.<init>(r2)     // Catch:{ all -> 0x2904 }
            X.0Wx r0 = X.C05110Rz.A00(r0, r5)     // Catch:{ all -> 0x2904 }
            X.0Wx r5 = X.C05110Rz.A01(r0)     // Catch:{ all -> 0x2904 }
            X.08J r6 = X.AnonymousClass4L0.A0E()     // Catch:{ all -> 0x2904 }
            X.5gY r0 = new X.5gY     // Catch:{ all -> 0x2904 }
            r0.<init>(r6)     // Catch:{ all -> 0x2904 }
            r6.A0J(r5, r0)     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 217(0xd9, float:3.04E-43)
            X.C86604Kt.A1N(r2, r6, r1, r0)     // Catch:{ all -> 0x2904 }
            X.0sA r0 = A05(r1)     // Catch:{ all -> 0x2904 }
            r6 = 218(0xda, float:3.05E-43)
            X.C86604Kt.A1N(r0, r5, r1, r6)     // Catch:{ all -> 0x2904 }
            X.33j r7 = r1.A3L     // Catch:{ all -> 0x2904 }
            X.0sA r10 = A05(r1)     // Catch:{ all -> 0x2904 }
            X.4eZ r2 = A09(r1)     // Catch:{ all -> 0x2904 }
            r0 = 2131432768(0x7f0b1540, float:1.8487303E38)
            X.5UY r14 = X.AnonymousClass5UY.A01(r2, r0)     // Catch:{ all -> 0x2904 }
            X.4VH r5 = r1.A38     // Catch:{ all -> 0x2904 }
            X.4Uw r2 = r1.A3C     // Catch:{ all -> 0x2904 }
            X.7Wt r0 = new X.7Wt     // Catch:{ all -> 0x2904 }
            r9 = r0
            r11 = r5
            r12 = r2
            r13 = r7
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x2904 }
            r1.A52 = r0     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131432800(0x7f0b1560, float:1.8487368E38)
            android.view.View r2 = r2.findViewById(r0)     // Catch:{ all -> 0x2904 }
            X.5UY r0 = new X.5UY     // Catch:{ all -> 0x2904 }
            r0.<init>(r2)     // Catch:{ all -> 0x2904 }
            r1.A5f = r0     // Catch:{ all -> 0x2904 }
            X.66o r2 = X.AnonymousClass5KY.A00(r1)     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            boolean r0 = r2.BH2(r0)     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x0f22
            X.4Uw r5 = r1.A3C     // Catch:{ all -> 0x2904 }
            X.107 r10 = r5.A04     // Catch:{ all -> 0x2904 }
            java.lang.Object r2 = r10.A07()     // Catch:{ all -> 0x2904 }
            X.5XX r2 = (X.AnonymousClass5XX) r2     // Catch:{ all -> 0x2904 }
            boolean r0 = r2.A00     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x0f1c
            boolean r0 = r2.A03     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x0f1c
            boolean r0 = r2.A02     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x0f1c
            X.33p r5 = r5.A03     // Catch:{ all -> 0x2904 }
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r5)     // Catch:{ all -> 0x2904 }
            java.lang.String r2 = "registration_initialized_time"
            long r13 = X.AnonymousClass0x2.A0B(r0, r2)     // Catch:{ all -> 0x2904 }
            r11 = 0
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0f1c
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x2904 }
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r5)     // Catch:{ all -> 0x2904 }
            long r11 = X.AnonymousClass0x2.A0B(r0, r2)     // Catch:{ all -> 0x2904 }
            long r13 = r13 - r11
            r11 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x0f1c
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r5)     // Catch:{ all -> 0x2904 }
            java.lang.String r2 = "push_to_video_camera_entry_point_nux_shown"
            boolean r0 = X.C18280x3.A1W(r0, r2)     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x0f1c
            java.lang.String r0 = "wa-shared-prefs/setPushToVideoCameraEntryPointNuxShown"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x2904 }
            r0 = 1
            X.C18270x1.A0v(r5, r2, r0)     // Catch:{ all -> 0x2904 }
            java.lang.Object r0 = X.C86634Kw.A0v(r10)     // Catch:{ all -> 0x2904 }
            X.5XX r0 = (X.AnonymousClass5XX) r0     // Catch:{ all -> 0x2904 }
            boolean r9 = r0.A01     // Catch:{ all -> 0x2904 }
            boolean r7 = r0.A00     // Catch:{ all -> 0x2904 }
            boolean r5 = r0.A03     // Catch:{ all -> 0x2904 }
            boolean r2 = r0.A02     // Catch:{ all -> 0x2904 }
            X.5XX r0 = new X.5XX     // Catch:{ all -> 0x2904 }
            r33 = 1
            r32 = r0
            r34 = r9
            r35 = r7
            r36 = r5
            r37 = r2
            r32.<init>(r33, r34, r35, r36, r37)     // Catch:{ all -> 0x2904 }
            r10.A0H(r0)     // Catch:{ all -> 0x2904 }
        L_0x0f1c:
            X.4VH r2 = r1.A38     // Catch:{ all -> 0x2904 }
            r0 = 1
            r2.A0F(r0)     // Catch:{ all -> 0x2904 }
        L_0x0f22:
            r5 = 0
            X.5rC r0 = r1.A0v     // Catch:{ all -> 0x2904 }
            boolean r2 = r0.A07()     // Catch:{ all -> 0x2904 }
            if (r2 == 0) goto L_0x0f3b
            r0.A04()     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0.getActivity()     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "create"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)     // Catch:{ all -> 0x2904 }
            goto L_0x2867
        L_0x0f3b:
            X.4VH r0 = r1.A38     // Catch:{ all -> 0x2904 }
            X.0Wx r0 = r0.A00     // Catch:{ all -> 0x2904 }
            java.lang.Object r0 = r0.A07()     // Catch:{ all -> 0x2904 }
            X.7Zj r0 = (X.C152567Zj) r0     // Catch:{ all -> 0x2904 }
            X.5rC r7 = r1.A0z     // Catch:{ all -> 0x2904 }
            boolean r2 = r7.A07()     // Catch:{ all -> 0x2904 }
            if (r2 == 0) goto L_0x0f64
            if (r0 == 0) goto L_0x0f54
            int r2 = r0.A01     // Catch:{ all -> 0x2904 }
            r0 = 1
            if (r2 == r0) goto L_0x0f64
        L_0x0f54:
            r7.A04()     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0.getViewModelStoreOwner()     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "createSmbViewModel"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)     // Catch:{ all -> 0x2904 }
            goto L_0x2867
        L_0x0f64:
            X.4eZ r7 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.4VH r2 = r1.A38     // Catch:{ all -> 0x2904 }
            r13 = 0
            X.6Bb r0 = new X.6Bb     // Catch:{ all -> 0x2904 }
            r0.<init>(r1, r13)     // Catch:{ all -> 0x2904 }
            r4.A03(r7, r0, r2)     // Catch:{ all -> 0x2904 }
            X.4eZ r0 = A09(r1)     // Catch:{ all -> 0x2904 }
            float r4 = X.C86604Kt.A00(r0)     // Catch:{ all -> 0x2904 }
            X.1VX r2 = r1.A41     // Catch:{ all -> 0x2904 }
            r0 = 1
            X.C162457s7.A0J(r2, r0)     // Catch:{ all -> 0x2904 }
            r0 = 5363(0x14f3, float:7.515E-42)
            int r0 = r2.A0N(r0)     // Catch:{ all -> 0x2904 }
            if (r0 >= 0) goto L_0x0f8b
            r0 = 0
            goto L_0x0f95
        L_0x0f8b:
            float r0 = (float) r0     // Catch:{ all -> 0x2904 }
            float r0 = r0 * r4
            int r0 = X.C1222663s.A01(r0)     // Catch:{ all -> 0x2904 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x2904 }
        L_0x0f95:
            r1.A6A = r0     // Catch:{ all -> 0x2904 }
            X.4VH r0 = r1.A38     // Catch:{ all -> 0x2904 }
            X.107 r4 = r0.A05     // Catch:{ all -> 0x2904 }
            r2 = 2
            X.923 r0 = new X.923     // Catch:{ all -> 0x2904 }
            r0.<init>(r2)     // Catch:{ all -> 0x2904 }
            X.0Wx r0 = X.C05110Rz.A00(r0, r4)     // Catch:{ all -> 0x2904 }
            X.0Wx r2 = X.C05110Rz.A01(r0)     // Catch:{ all -> 0x2904 }
            X.0sA r0 = A05(r1)     // Catch:{ all -> 0x2904 }
            X.AnonymousClass6C6.A02(r0, r2, r1, r6)     // Catch:{ all -> 0x2904 }
            X.4eZ r2 = A09(r1)     // Catch:{ all -> 0x2904 }
            r0 = 2131428485(0x7f0b0485, float:1.8478616E38)
            android.view.View r0 = X.C005205m.A00(r2, r0)     // Catch:{ all -> 0x2904 }
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0     // Catch:{ all -> 0x2904 }
            r1.A0e = r0     // Catch:{ all -> 0x2904 }
            boolean r2 = X.C1001059l.A04     // Catch:{ all -> 0x2904 }
            if (r2 == 0) goto L_0x0fc6
            r0.setPadding(r13, r13, r13, r13)     // Catch:{ all -> 0x2904 }
        L_0x0fc6:
            android.widget.ImageButton r2 = r1.A0e     // Catch:{ all -> 0x2904 }
            r0 = 3
            X.C18290x4.A1G(r2, r1, r0)     // Catch:{ all -> 0x2904 }
            X.5TN r4 = r1.A0Y()     // Catch:{ all -> 0x2904 }
            X.1VX r2 = r1.A41     // Catch:{ all -> 0x2904 }
            r0 = 6256(0x1870, float:8.767E-42)
            boolean r0 = r2.A0X(r0)     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x0fe4
            boolean r0 = r4.A05     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x1126
            android.widget.ImageButton r2 = r1.A0e     // Catch:{ all -> 0x2904 }
            r0 = 7
            X.C1237169m.A00(r2, r4, r1, r0)     // Catch:{ all -> 0x2904 }
        L_0x0fe4:
            r0 = 8
            r1.A1W(r0)     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131428008(0x7f0b02a8, float:1.8477648E38)
            android.view.View r9 = r2.findViewById(r0)     // Catch:{ all -> 0x2904 }
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9     // Catch:{ all -> 0x2904 }
            X.7Dm r4 = new X.7Dm     // Catch:{ all -> 0x2904 }
            r4.<init>(r1)     // Catch:{ all -> 0x2904 }
            X.1VX r0 = r1.A41     // Catch:{ all -> 0x2904 }
            r32 = r0
            X.2sr r0 = r1.A1b     // Catch:{ all -> 0x2904 }
            r22 = r0
            X.4FS r61 = A0G(r1)     // Catch:{ all -> 0x2904 }
            X.2sv r0 = r1.A10     // Catch:{ all -> 0x2904 }
            r21 = r0
            X.2ss r0 = r1.A3d     // Catch:{ all -> 0x2904 }
            r20 = r0
            X.2sD r0 = r1.A5K     // Catch:{ all -> 0x2904 }
            r19 = r0
            X.3LP r15 = r1.A42     // Catch:{ all -> 0x2904 }
            X.4eZ r45 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.2sq r14 = r1.A27     // Catch:{ all -> 0x2904 }
            X.2qY r12 = r1.A3m     // Catch:{ all -> 0x2904 }
            X.2rx r11 = r1.A2S     // Catch:{ all -> 0x2904 }
            X.33p r53 = A0D(r1)     // Catch:{ all -> 0x2904 }
            X.2so r10 = r1.A2J     // Catch:{ all -> 0x2904 }
            X.1iB r6 = r1.A3p     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.2sj r55 = r0.getGroupParticipantsManager()     // Catch:{ all -> 0x2904 }
            X.64Q r5 = r1.A28     // Catch:{ all -> 0x2904 }
            X.4eZ r47 = r0.getActivity()     // Catch:{ all -> 0x2904 }
            r0 = 38
            X.5sD r2 = new X.5sD     // Catch:{ all -> 0x2904 }
            r2.<init>((java.lang.Object) r4, (int) r0)     // Catch:{ all -> 0x2904 }
            r7 = 39
            X.5sD r0 = new X.5sD     // Catch:{ all -> 0x2904 }
            r0.<init>((java.lang.Object) r4, (int) r7)     // Catch:{ all -> 0x2904 }
            X.5UU r44 = new X.5UU     // Catch:{ all -> 0x2904 }
            r46 = r21
            r48 = r22
            r49 = r14
            r50 = r5
            r51 = r10
            r52 = r11
            r54 = r20
            r56 = r12
            r57 = r6
            r58 = r32
            r59 = r15
            r60 = r19
            r62 = r2
            r63 = r0
            r44.<init>(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63)     // Catch:{ all -> 0x2904 }
            X.5DD r0 = r1.A1F     // Catch:{ all -> 0x2904 }
            X.4eZ r35 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.4eZ r37 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.4uZ r12 = r1.A4J     // Catch:{ all -> 0x2904 }
            com.whatsapp.conversation.ConversationListView r11 = r1.A2f     // Catch:{ all -> 0x2904 }
            X.5sx r5 = r0.A00     // Catch:{ all -> 0x2904 }
            X.3Db r2 = r5.A03     // Catch:{ all -> 0x2904 }
            X.1VX r47 = X.C64333Db.A4B(r2)     // Catch:{ all -> 0x2904 }
            X.2sr r38 = X.C64333Db.A06(r2)     // Catch:{ all -> 0x2904 }
            X.2ss r45 = X.C64333Db.A39(r2)     // Catch:{ all -> 0x2904 }
            X.4C1 r0 = r2.AWF     // Catch:{ all -> 0x2904 }
            java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x2904 }
            X.2sD r7 = (X.C56572sD) r7     // Catch:{ all -> 0x2904 }
            X.3LP r48 = r2.Akp()     // Catch:{ all -> 0x2904 }
            X.3Ex r42 = X.C64333Db.A26(r2)     // Catch:{ all -> 0x2904 }
            X.8y5 r54 = X.C86614Ku.A0o(r2)     // Catch:{ all -> 0x2904 }
            X.2sq r39 = X.C86654Ky.A0T(r2)     // Catch:{ all -> 0x2904 }
            X.3Lq r49 = X.C64333Db.A5A(r2)     // Catch:{ all -> 0x2904 }
            X.2qz r52 = X.C64333Db.A8F(r2)     // Catch:{ all -> 0x2904 }
            X.4C1 r0 = r2.AZj     // Catch:{ all -> 0x2904 }
            java.lang.Object r6 = r0.get()     // Catch:{ all -> 0x2904 }
            X.30v r6 = (X.C614530v) r6     // Catch:{ all -> 0x2904 }
            X.2mi r50 = X.C86654Ky.A0Z(r2)     // Catch:{ all -> 0x2904 }
            X.4C1 r0 = r2.A3A     // Catch:{ all -> 0x2904 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x2904 }
            X.66o r0 = (X.C1229766o) r0     // Catch:{ all -> 0x2904 }
            r0.getClass()     // Catch:{ all -> 0x2904 }
            X.4ai r10 = new X.4ai     // Catch:{ all -> 0x2904 }
            r10.<init>(r0)     // Catch:{ all -> 0x2904 }
            X.2Jm r41 = r2.Ahy()     // Catch:{ all -> 0x2904 }
            X.4as r0 = r5.A01     // Catch:{ all -> 0x2904 }
            X.4C1 r0 = r0.A31     // Catch:{ all -> 0x2904 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x2904 }
            X.64Q r0 = (X.AnonymousClass64Q) r0     // Catch:{ all -> 0x2904 }
            X.5RI r2 = new X.5RI     // Catch:{ all -> 0x2904 }
            r32 = r2
            r33 = r9
            r34 = r11
            r36 = r10
            r40 = r0
            r43 = r4
            r46 = r6
            r51 = r12
            r53 = r7
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)     // Catch:{ all -> 0x2904 }
            r1.A31 = r2     // Catch:{ all -> 0x2904 }
            X.5Au r38 = new X.5Au     // Catch:{ all -> 0x2904 }
            r38.<init>()     // Catch:{ all -> 0x2904 }
            X.5MA r5 = r1.A1W     // Catch:{ all -> 0x2904 }
            X.4eZ r33 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.4eZ r36 = A09(r1)     // Catch:{ all -> 0x2904 }
            r0 = 1
            X.6AH r4 = new X.6AH     // Catch:{ all -> 0x2904 }
            r4.<init>(r1, r0)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.48y r34 = r0.B0u()     // Catch:{ all -> 0x2904 }
            X.66e r2 = r1.A78     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            r32 = r5
            r35 = r4
            r37 = r2
            r39 = r0
            X.4fP r2 = r32.A00(r33, r34, r35, r36, r37, r38, r39)     // Catch:{ all -> 0x2904 }
            r1.A3s = r2     // Catch:{ all -> 0x2904 }
            java.util.Set r0 = r1.A7L     // Catch:{ all -> 0x2904 }
            r107 = r0
            r0.add(r2)     // Catch:{ all -> 0x2904 }
            java.lang.String r14 = r8.A0D     // Catch:{ all -> 0x2904 }
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x114f
            java.lang.String r0 = r3.A09     // Catch:{ all -> 0x2904 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x114f
            goto L_0x115c
        L_0x1126:
            X.5kW r7 = new X.5kW     // Catch:{ all -> 0x2904 }
            r7.<init>(r1)     // Catch:{ all -> 0x2904 }
            r0 = 3
            X.5Bt r6 = new X.5Bt     // Catch:{ all -> 0x2904 }
            r6.<init>(r7, r0, r1)     // Catch:{ all -> 0x2904 }
            r0 = 36
            X.5sD r4 = X.C117615sD.A00(r1, r0)     // Catch:{ all -> 0x2904 }
            r2 = 37
            X.5sD r0 = new X.5sD     // Catch:{ all -> 0x2904 }
            r0.<init>((java.lang.Object) r7, (int) r2)     // Catch:{ all -> 0x2904 }
            X.5fP r2 = new X.5fP     // Catch:{ all -> 0x2904 }
            r2.<init>(r6, r1, r4, r0)     // Catch:{ all -> 0x2904 }
            android.widget.ImageButton r0 = r1.A0e     // Catch:{ all -> 0x2904 }
            r0.setOnTouchListener(r2)     // Catch:{ all -> 0x2904 }
            android.widget.ImageButton r0 = r1.A0e     // Catch:{ all -> 0x2904 }
            r0.setOnClickListener(r5)     // Catch:{ all -> 0x2904 }
            goto L_0x0fe4
        L_0x114f:
            java.util.HashMap r2 = A7S     // Catch:{ all -> 0x2904 }
            com.whatsapp.jid.Jid r0 = A0F(r1)     // Catch:{ all -> 0x2904 }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x2904 }
            r4 = 0
            if (r0 == 0) goto L_0x115d
        L_0x115c:
            r4 = 1
        L_0x115d:
            X.5IV r0 = r1.A3P     // Catch:{ all -> 0x2904 }
            X.2hn r2 = r0.A02     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A05(r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x116f
            X.2z9 r0 = r2.A00(r0)     // Catch:{ all -> 0x2904 }
            r0.A01 = r4     // Catch:{ all -> 0x2904 }
        L_0x116f:
            java.lang.String r0 = "on_create_conversation_start"
            r1.A2F(r0)     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "conversation/createconversation"
            X.33M r21 = new X.33M     // Catch:{ all -> 0x2904 }
            r2 = r21
            r2.<init>((java.lang.String) r0)     // Catch:{ all -> 0x2904 }
            r1.A19()     // Catch:{ all -> 0x2904 }
            X.4eZ r33 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.4uZ r12 = r1.A4J     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.5Tv r36 = r0.getConversationRowInflater()     // Catch:{ all -> 0x2904 }
            X.2sH r39 = r0.getTime()     // Catch:{ all -> 0x2904 }
            X.2sr r11 = r1.A1b     // Catch:{ all -> 0x2904 }
            X.35J r10 = r1.A4x     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.2qz r46 = r0.getFMessageDatabase()     // Catch:{ all -> 0x2904 }
            X.2lf r9 = r1.A4Q     // Catch:{ all -> 0x2904 }
            X.5KY r0 = A0B(r1)     // Catch:{ all -> 0x2904 }
            X.5Yz r7 = r0.A01     // Catch:{ all -> 0x2904 }
            X.676 r6 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.5MS r5 = r1.A2l     // Catch:{ all -> 0x2904 }
            X.5LO r0 = A0C(r1)     // Catch:{ all -> 0x2904 }
            X.8qC r0 = r0.A0D     // Catch:{ all -> 0x2904 }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x2904 }
            X.5Pe r4 = (X.C103985Pe) r4     // Catch:{ all -> 0x2904 }
            X.1VX r2 = r1.A41     // Catch:{ all -> 0x2904 }
            X.33p r0 = r1.A3K     // Catch:{ all -> 0x2904 }
            X.4On r20 = new X.4On     // Catch:{ all -> 0x2904 }
            r32 = r20
            r34 = r11
            r35 = r5
            r37 = r6
            r38 = r7
            r40 = r0
            r41 = r2
            r42 = r12
            r43 = r9
            r44 = r4
            r45 = r10
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)     // Catch:{ all -> 0x2904 }
            android.database.DataSetObserver r0 = r1.A6o     // Catch:{ all -> 0x2904 }
            r2 = r20
            r2.registerDataSetObserver(r0)     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131429844(0x7f0b09d4, float:1.8481372E38)
            android.view.View r4 = r2.findViewById(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.mentions.MentionableEntry r4 = (com.whatsapp.mentions.MentionableEntry) r4     // Catch:{ all -> 0x2904 }
            r1.A4P = r4     // Catch:{ all -> 0x2904 }
            if (r4 == 0) goto L_0x12ab
            X.5WS r2 = new X.5WS     // Catch:{ all -> 0x2904 }
            r2.<init>()     // Catch:{ all -> 0x2904 }
            X.68u r0 = new X.68u     // Catch:{ all -> 0x2904 }
            r0.<init>(r2, r13, r1)     // Catch:{ all -> 0x2904 }
            r4.A0F = r0     // Catch:{ all -> 0x2904 }
            r0 = 2131231693(0x7f0803cd, float:1.8079474E38)
            r1.A1Q(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.mentions.MentionableEntry r2 = r1.A4P     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            boolean r0 = r2.A0K(r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x122c
            X.4eZ r2 = A09(r1)     // Catch:{ all -> 0x2904 }
            r0 = 2131431361(0x7f0b0fc1, float:1.848445E38)
            android.view.View r4 = X.C005205m.A00(r2, r0)     // Catch:{ all -> 0x2904 }
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4     // Catch:{ all -> 0x2904 }
            r1.A0c = r4     // Catch:{ all -> 0x2904 }
            com.whatsapp.mentions.MentionableEntry r2 = r1.A4P     // Catch:{ all -> 0x2904 }
            X.8Hg r0 = new X.8Hg     // Catch:{ all -> 0x2904 }
            r0.<init>(r1)     // Catch:{ all -> 0x2904 }
            r2.A0C = r0     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            r37 = 1
            r36 = r13
            r32 = r2
            r33 = r4
            r34 = r0
            r35 = r13
            r32.A0H(r33, r34, r35, r36, r37)     // Catch:{ all -> 0x2904 }
        L_0x122c:
            r1.A0r()     // Catch:{ all -> 0x2904 }
            com.whatsapp.mentions.MentionableEntry r5 = r1.A4P     // Catch:{ all -> 0x2904 }
            r0 = 1
            android.text.InputFilter[] r4 = new android.text.InputFilter[r0]     // Catch:{ all -> 0x2904 }
            X.5ZT r2 = r1.A5q     // Catch:{ all -> 0x2904 }
            X.5e5 r0 = new X.5e5     // Catch:{ all -> 0x2904 }
            r0.<init>(r2)     // Catch:{ all -> 0x2904 }
            r4[r13] = r0     // Catch:{ all -> 0x2904 }
            r5.setFilters(r4)     // Catch:{ all -> 0x2904 }
            com.whatsapp.mentions.MentionableEntry r4 = r1.A4P     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131430743(0x7f0b0d57, float:1.8483196E38)
            android.view.View r0 = r2.findViewById(r0)     // Catch:{ all -> 0x2904 }
            r4.A05 = r0     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131432806(0x7f0b1566, float:1.848738E38)
            android.view.View r0 = r2.findViewById(r0)     // Catch:{ all -> 0x2904 }
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0     // Catch:{ all -> 0x2904 }
            r1.A0d = r0     // Catch:{ all -> 0x2904 }
            X.5rC r0 = r1.A0y     // Catch:{ all -> 0x2904 }
            boolean r0 = r0.A07()     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x1272
            X.1VX r0 = r1.A41     // Catch:{ all -> 0x2904 }
            boolean r0 = X.AnonymousClass75P.A00(r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x12c4
            X.3ZH r0 = r1.A3n     // Catch:{ all -> 0x2904 }
            boolean r0 = r0.A0T()     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x12c4
        L_0x1272:
            android.widget.FrameLayout r2 = r1.A0d     // Catch:{ all -> 0x2904 }
            r0 = 8
            r2.setVisibility(r0)     // Catch:{ all -> 0x2904 }
        L_0x1279:
            X.4Uy r0 = r1.A5M     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x12ab
            java.lang.String r0 = "ConversationDelegate/botCommandTextViewModel non-nul, setting up BotCommandsUIHelper"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x2904 }
            X.4eZ r2 = A09(r1)     // Catch:{ all -> 0x2904 }
            r0 = 2131431361(0x7f0b0fc1, float:1.848445E38)
            android.view.ViewGroup r33 = X.C86664Kz.A0m(r2, r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.mentions.MentionableEntry r5 = r1.A4P     // Catch:{ all -> 0x2904 }
            X.4Uy r4 = r1.A5M     // Catch:{ all -> 0x2904 }
            X.0sA r34 = A05(r1)     // Catch:{ all -> 0x2904 }
            X.5mB r2 = r1.A2m     // Catch:{ all -> 0x2904 }
            X.5jL r0 = new X.5jL     // Catch:{ all -> 0x2904 }
            r32 = r0
            r35 = r2
            r36 = r5
            r37 = r4
            r32.<init>(r33, r34, r35, r36, r37)     // Catch:{ all -> 0x2904 }
            X.8F3 r2 = new X.8F3     // Catch:{ all -> 0x2904 }
            r2.<init>(r1)     // Catch:{ all -> 0x2904 }
            r0.A00 = r2     // Catch:{ all -> 0x2904 }
        L_0x12ab:
            X.1VX r2 = r1.A41     // Catch:{ all -> 0x2904 }
            X.2vE r4 = X.C58422vE.A01     // Catch:{ all -> 0x2904 }
            r0 = 4093(0xffd, float:5.736E-42)
            boolean r0 = r2.A0Y(r4, r0)     // Catch:{ all -> 0x2904 }
            r11 = 0
            if (r0 == 0) goto L_0x130f
            X.1VX r2 = r1.A41     // Catch:{ all -> 0x2904 }
            r0 = 6004(0x1774, float:8.413E-42)
            boolean r2 = r2.A0Y(r4, r0)     // Catch:{ all -> 0x2904 }
            r0 = 1
            if (r2 != 0) goto L_0x1310
            goto L_0x130f
        L_0x12c4:
            X.1VX r2 = r1.A41     // Catch:{ all -> 0x2904 }
            r0 = 5811(0x16b3, float:8.143E-42)
            boolean r0 = r2.A0X(r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x12d7
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            boolean r0 = X.C155477ey.A00(r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x12d7
            goto L_0x1272
        L_0x12d7:
            X.3ZH r0 = r1.A3n     // Catch:{ all -> 0x2904 }
            boolean r0 = r0.A0R()     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x12ed
            r0 = 26
            X.5sD r2 = X.C117615sD.A00(r1, r0)     // Catch:{ all -> 0x2904 }
            r1.A6C = r2     // Catch:{ all -> 0x2904 }
            X.4FS r0 = r1.A5i     // Catch:{ all -> 0x2904 }
            r0.BkM(r2)     // Catch:{ all -> 0x2904 }
            goto L_0x1279
        L_0x12ed:
            X.5rC r0 = r1.A0y     // Catch:{ all -> 0x2904 }
            boolean r0 = r0.A07()     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x1279
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131434052(0x7f0b1a44, float:1.8489907E38)
            r2.findViewById(r0)     // Catch:{ all -> 0x2904 }
            X.5rC r0 = r1.A0y     // Catch:{ all -> 0x2904 }
            r0.A04()     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "makeQuickReplyHelper"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)     // Catch:{ all -> 0x2904 }
            goto L_0x2867
        L_0x130f:
            r0 = 0
        L_0x1310:
            r1.A6T = r0     // Catch:{ all -> 0x2904 }
            X.4uZ r2 = r1.A4J     // Catch:{ all -> 0x2904 }
            boolean r0 = r2 instanceof X.C95804uY     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x131f
            boolean r0 = r1.A6X     // Catch:{ all -> 0x2904 }
            X.4uY r2 = (X.C95804uY) r2     // Catch:{ all -> 0x2904 }
            r1.A1x(r2, r0)     // Catch:{ all -> 0x2904 }
        L_0x131f:
            com.whatsapp.conversation.ConversationListView r0 = r1.A2f     // Catch:{ all -> 0x2904 }
            r2 = r20
            r0.setAdapter(r2)     // Catch:{ all -> 0x2904 }
            boolean r0 = r8.A0X     // Catch:{ all -> 0x2904 }
            X.33b r2 = r1.A4U     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x13ca
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            r2.A08(r0)     // Catch:{ all -> 0x2904 }
            r0 = 1
            r1.A6e = r0     // Catch:{ all -> 0x2904 }
            X.5mB r4 = r1.A2m     // Catch:{ all -> 0x2904 }
            X.4uZ r2 = r1.A4J     // Catch:{ all -> 0x2904 }
            r4.A06(r2, r0)     // Catch:{ all -> 0x2904 }
            android.content.Intent r2 = A01(r1)     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "fromNotification"
            boolean r0 = r2.getBooleanExtra(r0, r13)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x1366
            android.content.Intent r2 = A01(r1)     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "last_notification_keep_in_chat"
            boolean r0 = r2.getBooleanExtra(r0, r13)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x1366
            X.33p r6 = A0D(r1)     // Catch:{ all -> 0x2904 }
            X.4eZ r0 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.0df r5 = r0.getSupportFragmentManager()     // Catch:{ all -> 0x2904 }
            X.4uZ r4 = r1.A4J     // Catch:{ all -> 0x2904 }
            r2 = 0
            r0 = 1
            com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog.A00(r5, r6, r2, r4, r0)     // Catch:{ all -> 0x2904 }
        L_0x1366:
            X.33p r0 = r1.A3K     // Catch:{ all -> 0x2904 }
            android.content.SharedPreferences$Editor r2 = X.C18270x1.A03(r0)     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "newsletter_message_received"
            X.C18270x1.A0l(r2, r0, r13)     // Catch:{ all -> 0x2904 }
            boolean r0 = r8.A0W     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x1392
            X.3XI r0 = r1.A4V     // Catch:{ all -> 0x2904 }
            r0.A02()     // Catch:{ all -> 0x2904 }
            java.lang.String r5 = r8.A0O     // Catch:{ all -> 0x2904 }
            if (r5 == 0) goto L_0x138a
            X.5jr r4 = r1.A2D     // Catch:{ all -> 0x2904 }
            java.lang.String r2 = "show_vc_lobby"
            X.5Zu r0 = new X.5Zu     // Catch:{ all -> 0x2904 }
            r0.<init>((java.lang.String) r2, (java.lang.Object) r5)     // Catch:{ all -> 0x2904 }
            r4.A00(r0)     // Catch:{ all -> 0x2904 }
        L_0x138a:
            X.5mB r4 = r1.A2m     // Catch:{ all -> 0x2904 }
            r2 = 4
            r0 = r64
            r4.A06(r0, r2)     // Catch:{ all -> 0x2904 }
        L_0x1392:
            java.lang.String r0 = "conversation/createconv/statusbar/cancel"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x2904 }
            r1.A6k = r13     // Catch:{ all -> 0x2904 }
            android.content.Intent r2 = A01(r1)     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "ig_post_url"
            java.lang.String r0 = r2.getStringExtra(r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x13a9
            r0 = 1
            r1.A2M(r0)     // Catch:{ all -> 0x2904 }
        L_0x13a9:
            boolean r0 = r8.A0Z     // Catch:{ all -> 0x2904 }
            r22 = 0
            if (r0 == 0) goto L_0x154c
            boolean r0 = r1.A6G     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x154c
            boolean r0 = r8.A0T     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x154c
            X.5G5 r0 = r1.A2h     // Catch:{ all -> 0x2904 }
            java.util.HashMap r2 = r0.A00     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            r2.remove(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.conversation.ConversationListView r2 = r1.A2f     // Catch:{ all -> 0x2904 }
            r0 = 1
            r2.A0P = r0     // Catch:{ all -> 0x2904 }
            java.util.ArrayList r7 = r8.A0P     // Catch:{ all -> 0x2904 }
            if (r7 == 0) goto L_0x1400
            goto L_0x13cf
        L_0x13ca:
            r0 = 1
            r2.A0D(r0)     // Catch:{ all -> 0x2904 }
            goto L_0x1366
        L_0x13cf:
            X.5Ul r9 = r1.A1f     // Catch:{ all -> 0x2509 }
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2509 }
            java.util.List r38 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x2509 }
            java.lang.String r6 = r8.A0G     // Catch:{ all -> 0x2509 }
            int r5 = r8.A01     // Catch:{ all -> 0x2509 }
            boolean r4 = r8.A0V     // Catch:{ all -> 0x2509 }
            X.4eZ r33 = A09(r1)     // Catch:{ all -> 0x2509 }
            X.4eZ r34 = A09(r1)     // Catch:{ all -> 0x2509 }
            r2 = 1
            X.92Q r0 = new X.92Q     // Catch:{ all -> 0x2509 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x2509 }
            r32 = r9
            r35 = r0
            r36 = r22
            r37 = r6
            r39 = r7
            r40 = r5
            r41 = r13
            r42 = r4
            r32.A03(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x2509 }
            goto L_0x154c
        L_0x1400:
            byte r2 = r8.A00     // Catch:{ all -> 0x2904 }
            r0 = 4
            if (r2 != r0) goto L_0x1455
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.2oU r6 = r0.getWAContext()     // Catch:{ all -> 0x2904 }
            X.3Ex r5 = r0.getContactManager()     // Catch:{ all -> 0x2904 }
            X.33i r4 = r1.A3G     // Catch:{ all -> 0x2904 }
            X.33j r0 = r1.A3L     // Catch:{ all -> 0x2904 }
            X.5Y4 r2 = new X.5Y4     // Catch:{ all -> 0x2904 }
            r2.<init>(r5, r4, r6, r0)     // Catch:{ all -> 0x2904 }
            X.5Xx r4 = r1.A14     // Catch:{ all -> 0x2904 }
            java.lang.String r6 = r8.A0N     // Catch:{ all -> 0x2904 }
            X.33j r0 = r2.A03     // Catch:{ 6zK -> 0x1528 }
            X.5Wg r9 = new X.5Wg     // Catch:{ 6zK -> 0x1528 }
            r9.<init>(r4, r0)     // Catch:{ 6zK -> 0x1528 }
            r2.A05(r6)     // Catch:{ 6zK -> 0x1528 }
            X.5a1 r7 = r2.A04     // Catch:{ 6zK -> 0x1528 }
            java.util.List r0 = r7.A06     // Catch:{ 6zK -> 0x1528 }
            if (r0 == 0) goto L_0x1533
            X.3Ex r5 = r2.A00     // Catch:{ 6zK -> 0x1528 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ 6zK -> 0x1528 }
        L_0x1432:
            boolean r0 = r10.hasNext()     // Catch:{ 6zK -> 0x1528 }
            if (r0 == 0) goto L_0x144f
            X.7OD r4 = X.AnonymousClass4L0.A0R(r10)     // Catch:{ 6zK -> 0x1528 }
            java.lang.String r0 = r4.A02     // Catch:{ 6zK -> 0x1528 }
            X.3ZH r2 = r5.A0C(r0)     // Catch:{ 6zK -> 0x1528 }
            if (r2 == 0) goto L_0x1432
            r0 = r18
            com.whatsapp.jid.Jid r0 = r2.A0I(r0)     // Catch:{ 6zK -> 0x1528 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ 6zK -> 0x1528 }
            r4.A01 = r0     // Catch:{ 6zK -> 0x1528 }
            goto L_0x1432
        L_0x144f:
            java.lang.String r6 = r9.A01(r7)     // Catch:{ 6zK -> 0x1528 }
            goto L_0x1533
        L_0x1455:
            r0 = 14
            if (r2 != r0) goto L_0x146e
            X.33m r5 = A08(r1)     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            java.util.ArrayList r4 = r8.A0Q     // Catch:{ all -> 0x2904 }
            boolean r2 = r1.A6P     // Catch:{ all -> 0x2904 }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x2904 }
            r6 = r22
            r5.A0W(r6, r0, r4, r2)     // Catch:{ all -> 0x2904 }
            goto L_0x154c
        L_0x146e:
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x14e0
            java.lang.String r6 = r3.A09     // Catch:{ all -> 0x2904 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x14e0
            X.5IV r0 = r1.A3P     // Catch:{ all -> 0x2904 }
            X.2hn r4 = r0.A02     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass32Y.A05(r0)     // Catch:{ all -> 0x2904 }
            r0 = 1
            r4.A01(r2, r0)     // Catch:{ all -> 0x2904 }
            java.lang.String r4 = r3.A05     // Catch:{ all -> 0x2904 }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x14d6
            X.5RH r2 = r1.A3T     // Catch:{ all -> 0x2904 }
            boolean r0 = r2.A0U     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x14a1
            boolean r0 = r3.A0E     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x14a1
            int r2 = r2.A0H     // Catch:{ all -> 0x2904 }
            r0 = 2
            if (r2 == r0) goto L_0x14aa
        L_0x14a1:
            java.util.HashMap r2 = X.AnonymousClass2C1.A02     // Catch:{ all -> 0x2904 }
            com.whatsapp.jid.Jid r0 = A0F(r1)     // Catch:{ all -> 0x2904 }
            r2.put(r0, r4)     // Catch:{ all -> 0x2904 }
        L_0x14aa:
            com.whatsapp.jid.UserJid r0 = r3.A01     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x14cf
            java.lang.String r5 = r0.user     // Catch:{ all -> 0x2904 }
        L_0x14b0:
            boolean r4 = r3.A0E     // Catch:{ all -> 0x2904 }
            boolean r2 = r3.A0F     // Catch:{ all -> 0x2904 }
            X.7Ns r0 = new X.7Ns     // Catch:{ all -> 0x2904 }
            r32 = r0
            r33 = r5
            r34 = r14
            r35 = r6
            r36 = r4
            r37 = r2
            r32.<init>(r33, r34, r35, r36, r37)     // Catch:{ all -> 0x2904 }
            java.util.HashMap r4 = A7S     // Catch:{ all -> 0x2904 }
            com.whatsapp.jid.Jid r2 = A0F(r1)     // Catch:{ all -> 0x2904 }
            r4.put(r2, r0)     // Catch:{ all -> 0x2904 }
            goto L_0x154c
        L_0x14cf:
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            java.lang.String r5 = r0.getRawString()     // Catch:{ all -> 0x2904 }
            goto L_0x14b0
        L_0x14d6:
            java.util.HashMap r2 = X.AnonymousClass2C1.A02     // Catch:{ all -> 0x2904 }
            com.whatsapp.jid.Jid r0 = A0F(r1)     // Catch:{ all -> 0x2904 }
            r2.remove(r0)     // Catch:{ all -> 0x2904 }
            goto L_0x14aa
        L_0x14e0:
            java.lang.String r4 = r8.A0K     // Catch:{ all -> 0x2904 }
            if (r4 == 0) goto L_0x154c
            int r0 = r4.length()     // Catch:{ all -> 0x2904 }
            if (r0 <= 0) goto L_0x154c
            boolean r0 = r8.A0U     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x14f8
            java.util.HashMap r2 = X.AnonymousClass2C1.A02     // Catch:{ all -> 0x2904 }
            com.whatsapp.jid.Jid r0 = A0F(r1)     // Catch:{ all -> 0x2904 }
            r2.put(r0, r4)     // Catch:{ all -> 0x2904 }
            goto L_0x154c
        L_0x14f8:
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.5Zz r0 = r0.getLinkifyWeb()     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = r0.A03(r4)     // Catch:{ all -> 0x2904 }
            X.3Ls r33 = X.C57782uC.A00(r0)     // Catch:{ all -> 0x2904 }
            X.33m r32 = A08(r1)     // Catch:{ all -> 0x2904 }
            com.whatsapp.jid.Jid r0 = A0F(r1)     // Catch:{ all -> 0x2904 }
            java.util.List r37 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x2904 }
            boolean r2 = r1.A6P     // Catch:{ all -> 0x2904 }
            boolean r0 = r1.A6R     // Catch:{ all -> 0x2904 }
            r35 = r22
            r38 = r22
            r34 = r22
            r36 = r4
            r39 = r2
            r40 = r0
            r32.A0C(r33, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x2904 }
            r1.A6R = r13     // Catch:{ all -> 0x2904 }
            goto L_0x154c
        L_0x1528:
            r4 = move-exception
            java.lang.String r2 = "addWaIdsToVCard"
            X.23q r0 = new X.23q     // Catch:{ all -> 0x2904 }
            r0.<init>(r4)     // Catch:{ all -> 0x2904 }
            com.whatsapp.util.Log.e(r2, r0)     // Catch:{ all -> 0x2904 }
        L_0x1533:
            X.33m r32 = A08(r1)     // Catch:{ all -> 0x2904 }
            X.4uZ r4 = r1.A4J     // Catch:{ all -> 0x2904 }
            java.lang.String r2 = r8.A0M     // Catch:{ all -> 0x2904 }
            boolean r0 = r1.A6P     // Catch:{ all -> 0x2904 }
            java.util.List r36 = java.util.Collections.singletonList(r4)     // Catch:{ all -> 0x2904 }
            r33 = r22
            r34 = r2
            r35 = r6
            r37 = r0
            r32.A0V(r33, r34, r35, r36, r37)     // Catch:{ all -> 0x2904 }
        L_0x154c:
            java.util.HashMap r2 = X.AnonymousClass2C1.A02     // Catch:{ all -> 0x2904 }
            X.3ZH r0 = r1.A3n     // Catch:{ all -> 0x2904 }
            java.lang.Class<X.4uZ> r5 = X.C95814uZ.class
            com.whatsapp.jid.Jid r0 = r0.A0I(r5)     // Catch:{ all -> 0x2904 }
            java.lang.String r4 = X.C18320x8.A0e(r0, r2)     // Catch:{ all -> 0x2904 }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x15da
            java.util.HashMap r2 = A7T     // Catch:{ all -> 0x2904 }
            X.3ZH r0 = r1.A3n     // Catch:{ all -> 0x2904 }
            com.whatsapp.jid.Jid r0 = r0.A0I(r5)     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = X.C18320x8.A0e(r0, r2)     // Catch:{ all -> 0x2904 }
            java.util.List r2 = X.C624435a.A03(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.mentions.MentionableEntry r0 = r1.A4P     // Catch:{ all -> 0x2904 }
            r0.setMentionableText(r4, r2)     // Catch:{ all -> 0x2904 }
            r1.A1J()     // Catch:{ all -> 0x2904 }
            X.4eZ r32 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.5Y0 r36 = r0.getEmojiLoader()     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.33i r35 = r0.getSystemServices()     // Catch:{ all -> 0x2904 }
            X.2y5 r2 = r1.A4r     // Catch:{ all -> 0x2904 }
            com.whatsapp.mentions.MentionableEntry r0 = r1.A4P     // Catch:{ all -> 0x2904 }
            android.text.Editable r33 = r0.getEditableText()     // Catch:{ all -> 0x2904 }
            com.whatsapp.mentions.MentionableEntry r0 = r1.A4P     // Catch:{ all -> 0x2904 }
            android.text.TextPaint r34 = r0.getPaint()     // Catch:{ all -> 0x2904 }
            r38 = 2131102273(0x7f060a41, float:1.781698E38)
            boolean r0 = r1.A6T     // Catch:{ all -> 0x2904 }
            r37 = r2
            r39 = r0
            X.C107635bd.A0F(r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.5Zz r0 = r0.getLinkifyWeb()     // Catch:{ all -> 0x2904 }
            java.lang.String r10 = r0.A03(r4)     // Catch:{ all -> 0x2904 }
            X.4UA r0 = r1.A3D     // Catch:{ all -> 0x2904 }
            r0.A0N(r10)     // Catch:{ all -> 0x2904 }
            X.4UA r2 = r1.A3D     // Catch:{ all -> 0x2904 }
            r0 = 1
            r2.A0A = r0     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = r2.A07     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x15ce
            boolean r0 = r2.A0R()     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x15ce
            X.08M r9 = r2.A0H     // Catch:{ all -> 0x2904 }
            X.59D r7 = X.AnonymousClass59D.LOADING     // Catch:{ all -> 0x2904 }
            X.5SA r6 = new X.5SA     // Catch:{ all -> 0x2904 }
            r2 = r22
            r6.<init>(r2, r7, r2)     // Catch:{ all -> 0x2904 }
            r9.A0H(r6)     // Catch:{ all -> 0x2904 }
        L_0x15ce:
            X.4UA r6 = r1.A3D     // Catch:{ all -> 0x2509 }
            X.4uZ r2 = r1.A4J     // Catch:{ all -> 0x2509 }
            X.7aS r0 = r1.A0X()     // Catch:{ all -> 0x2509 }
            r6.A0I(r0, r2, r10)     // Catch:{ all -> 0x2509 }
            goto L_0x15e4
        L_0x15da:
            com.whatsapp.mentions.MentionableEntry r0 = r1.A4P     // Catch:{ all -> 0x2904 }
            r2 = r22
            r0.setText(r2)     // Catch:{ all -> 0x2904 }
            r1.A0s()     // Catch:{ all -> 0x2904 }
        L_0x15e4:
            boolean r0 = X.C107575bX.A0F(r4)     // Catch:{ all -> 0x2904 }
            r2 = 8
            if (r0 == 0) goto L_0x15f9
            X.8y5 r0 = r1.A5a     // Catch:{ all -> 0x2904 }
            boolean r0 = r0.BFD()     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x15f5
            r2 = 0
        L_0x15f5:
            r1.A1W(r2)     // Catch:{ all -> 0x2904 }
            goto L_0x15fc
        L_0x15f9:
            r1.A1W(r2)     // Catch:{ all -> 0x2904 }
        L_0x15fc:
            java.util.HashMap r2 = A7S     // Catch:{ all -> 0x2904 }
            X.3ZH r0 = r1.A3n     // Catch:{ all -> 0x2904 }
            com.whatsapp.jid.Jid r0 = r0.A0I(r5)     // Catch:{ all -> 0x2904 }
            java.lang.Object r10 = r2.get(r0)     // Catch:{ all -> 0x2904 }
            X.7Ns r10 = (X.C149747Ns) r10     // Catch:{ all -> 0x2904 }
            if (r10 == 0) goto L_0x16af
            X.5IV r0 = r1.A3P     // Catch:{ all -> 0x2904 }
            X.5Rl r0 = r0.A00     // Catch:{ all -> 0x2904 }
            r2 = 1029386189(0x3d5b2fcd, float:0.053512383)
            X.8JP r0 = r0.A01     // Catch:{ all -> 0x2904 }
            boolean r0 = r0.BI5(r2)     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x1624
            X.5IV r0 = r1.A3P     // Catch:{ all -> 0x2904 }
            X.5Rl r2 = r0.A00     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "chats_list_screen"
            r2.A01(r0)     // Catch:{ all -> 0x2904 }
        L_0x1624:
            X.5IV r0 = r1.A3P     // Catch:{ all -> 0x2904 }
            X.2hn r4 = r0.A02     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass32Y.A05(r0)     // Catch:{ all -> 0x2904 }
            r0 = 2
            r4.A01(r2, r0)     // Catch:{ all -> 0x2904 }
            X.4UA r2 = r1.A3D     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = r10.A02     // Catch:{ all -> 0x2904 }
            r2.A0N(r0)     // Catch:{ all -> 0x2904 }
            X.5IV r0 = r1.A3P     // Catch:{ all -> 0x2904 }
            X.5Rl r5 = r0.A00     // Catch:{ all -> 0x2904 }
            boolean r0 = r10.A03     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x1646
            boolean r0 = r10.A04     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x1646
            r11 = 1
        L_0x1646:
            java.lang.String r4 = "preview_load_starts"
            if (r11 == 0) goto L_0x1654
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "icebreaker_"
            java.lang.String r4 = X.AnonymousClass000.A0V(r0, r4, r2)     // Catch:{ all -> 0x2904 }
        L_0x1654:
            r5.A00(r4)     // Catch:{ all -> 0x2904 }
            X.4UA r9 = r1.A3D     // Catch:{ all -> 0x2904 }
            X.5Zz r4 = r9.A0W     // Catch:{ all -> 0x2904 }
            X.2s4 r2 = r9.A0J     // Catch:{ all -> 0x2904 }
            X.1Hk r0 = new X.1Hk     // Catch:{ all -> 0x2904 }
            r0.<init>((X.C56492s4) r2, (X.C149747Ns) r10, (X.C106685Zz) r4)     // Catch:{ all -> 0x2904 }
            r9.A01 = r0     // Catch:{ all -> 0x2904 }
            X.59D r2 = X.AnonymousClass59D.LOADING     // Catch:{ all -> 0x2904 }
            r9.A0H(r0, r2)     // Catch:{ all -> 0x2904 }
            X.2ah r7 = new X.2ah     // Catch:{ all -> 0x2904 }
            r7.<init>(r9, r3, r10)     // Catch:{ all -> 0x2904 }
            X.3Wi r6 = r9.A0I     // Catch:{ all -> 0x2904 }
            X.4FS r5 = r9.A0d     // Catch:{ all -> 0x2904 }
            X.31C r4 = r9.A0Y     // Catch:{ all -> 0x2904 }
            X.1im r2 = r9.A0L     // Catch:{ all -> 0x2904 }
            X.3TZ r0 = new X.3TZ     // Catch:{ all -> 0x2904 }
            r33 = r6
            r34 = r2
            r35 = r7
            r36 = r4
            r37 = r5
            r32 = r0
            r32.<init>(r33, r34, r35, r36, r37)     // Catch:{ all -> 0x2904 }
            X.4FS r4 = r0.A07     // Catch:{ all -> 0x2904 }
            r2 = 46
            X.C117155rT.A00(r4, r0, r10, r2)     // Catch:{ all -> 0x2904 }
            java.util.List r4 = r9.A0e     // Catch:{ all -> 0x2904 }
            r2 = 19
            X.5sE r0 = X.C117625sE.A00(r0, r2)     // Catch:{ all -> 0x2904 }
            r4.add(r0)     // Catch:{ all -> 0x2904 }
            X.08M r4 = r7.A00     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 14
            X.C100385As.A01(r2, r4, r10, r1, r0)     // Catch:{ all -> 0x2904 }
            boolean r0 = r3.A0H     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x16af
            com.whatsapp.mentions.MentionableEntry r0 = r1.A4P     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x16af
            r0.A07(r13)     // Catch:{ all -> 0x2904 }
        L_0x16af:
            X.4eZ r0 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.5MG r19 = new X.5MG     // Catch:{ all -> 0x2904 }
            r2 = r19
            r2.<init>(r0)     // Catch:{ all -> 0x2904 }
            boolean r0 = r1.A6V     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x195d
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            X.1fJ r44 = X.AnonymousClass34R.A03(r0)     // Catch:{ all -> 0x2904 }
            X.C626936e.A06(r44)     // Catch:{ all -> 0x2904 }
            boolean r0 = r1.A6Z     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x16db
            X.4u5 r2 = new X.4u5     // Catch:{ all -> 0x2904 }
            r3 = r20
            r0 = r44
            r2.<init>(r3, r1, r0)     // Catch:{ all -> 0x2904 }
            r1.A4A = r2     // Catch:{ all -> 0x2904 }
            X.1iV r0 = r1.A4B     // Catch:{ all -> 0x2904 }
            r0.A06(r2)     // Catch:{ all -> 0x2904 }
        L_0x16db:
            X.5DP r0 = r1.A1T     // Catch:{ all -> 0x2904 }
            X.4eZ r46 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.5Tv r3 = r2.getConversationRowInflater()     // Catch:{ all -> 0x2904 }
            X.4eZ r2 = r2.getActivity()     // Catch:{ all -> 0x2904 }
            X.5Uq r63 = r3.A01(r2)     // Catch:{ all -> 0x2904 }
            X.3ZH r4 = r1.A3n     // Catch:{ all -> 0x2904 }
            X.0sA r47 = A05(r1)     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.0sD r48 = r2.getViewModelStoreOwner()     // Catch:{ all -> 0x2904 }
            X.5sx r0 = r0.A00     // Catch:{ all -> 0x2904 }
            X.3Db r0 = r0.A03     // Catch:{ all -> 0x2904 }
            X.2sH r65 = X.C64333Db.A2p(r0)     // Catch:{ all -> 0x2904 }
            X.1VX r72 = X.C64333Db.A4B(r0)     // Catch:{ all -> 0x2904 }
            X.3Wi r50 = X.C64333Db.A04(r0)     // Catch:{ all -> 0x2904 }
            X.2sr r51 = X.C64333Db.A06(r0)     // Catch:{ all -> 0x2904 }
            X.4FS r80 = X.C64333Db.A8y(r0)     // Catch:{ all -> 0x2904 }
            X.2ss r67 = X.C64333Db.A39(r0)     // Catch:{ all -> 0x2904 }
            X.5Y0 r71 = X.C64333Db.A3o(r0)     // Catch:{ all -> 0x2904 }
            X.5UX r59 = X.C86614Ku.A0R(r0)     // Catch:{ all -> 0x2904 }
            X.3Ex r60 = X.C64333Db.A26(r0)     // Catch:{ all -> 0x2904 }
            X.4C1 r2 = r0.A6W     // Catch:{ all -> 0x2904 }
            java.lang.Object r3 = r2.get()     // Catch:{ all -> 0x2904 }
            X.2nK r3 = (X.C53582nK) r3     // Catch:{ all -> 0x2904 }
            X.2rN r78 = X.C64333Db.A8w(r0)     // Catch:{ all -> 0x2904 }
            X.8y5 r79 = X.C86614Ku.A0o(r0)     // Catch:{ all -> 0x2904 }
            X.5ZU r62 = X.C64333Db.A28(r0)     // Catch:{ all -> 0x2904 }
            X.33j r66 = X.C64333Db.A2t(r0)     // Catch:{ all -> 0x2904 }
            X.1in r61 = X.C86614Ku.A0S(r0)     // Catch:{ all -> 0x2904 }
            X.3Lq r73 = X.C64333Db.A5A(r0)     // Catch:{ all -> 0x2904 }
            X.2lX r76 = X.C86644Kx.A0W(r0)     // Catch:{ all -> 0x2904 }
            X.1ib r55 = X.C86624Kv.A0N(r0)     // Catch:{ all -> 0x2904 }
            X.3Ej r58 = X.C86654Ky.A0X(r0)     // Catch:{ all -> 0x2904 }
            X.2so r57 = X.C64333Db.A1k(r0)     // Catch:{ all -> 0x2904 }
            X.4C1 r2 = r0.A5U     // Catch:{ all -> 0x2904 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x2904 }
            X.2Vj r2 = (X.C44272Vj) r2     // Catch:{ all -> 0x2904 }
            X.1ia r54 = X.C86654Ky.A0S(r0)     // Catch:{ all -> 0x2904 }
            X.2j0 r74 = X.C86664Kz.A1A(r0)     // Catch:{ all -> 0x2904 }
            X.2sj r69 = X.C64333Db.A3G(r0)     // Catch:{ all -> 0x2904 }
            X.30g r64 = X.C86624Kv.A0P(r0)     // Catch:{ all -> 0x2904 }
            X.3Lo r68 = X.C86634Kw.A0f(r0)     // Catch:{ all -> 0x2904 }
            X.1iV r75 = X.C86624Kv.A0T(r0)     // Catch:{ all -> 0x2904 }
            X.64J r52 = X.C86614Ku.A0N(r0)     // Catch:{ all -> 0x2904 }
            X.4mB r0 = new X.4mB     // Catch:{ all -> 0x2904 }
            r45 = r0
            r49 = r3
            r53 = r19
            r56 = r2
            r70 = r4
            r77 = r44
            r45.<init>(r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80)     // Catch:{ all -> 0x2904 }
            r1.A2Z = r0     // Catch:{ all -> 0x2904 }
            X.5DI r2 = r1.A1L     // Catch:{ all -> 0x2904 }
            X.4eZ r45 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.4eZ r53 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            r73 = r0
            X.3ZH r0 = r1.A3n     // Catch:{ all -> 0x2904 }
            r85 = r0
            X.5sx r4 = r2.A00     // Catch:{ all -> 0x2904 }
            X.3Db r2 = r4.A03     // Catch:{ all -> 0x2904 }
            X.2sH r75 = X.C64333Db.A2p(r2)     // Catch:{ all -> 0x2904 }
            X.1VX r89 = X.C64333Db.A4B(r2)     // Catch:{ all -> 0x2904 }
            X.3Wi r54 = X.C64333Db.A04(r2)     // Catch:{ all -> 0x2904 }
            X.2sr r55 = X.C64333Db.A06(r2)     // Catch:{ all -> 0x2904 }
            X.4FS r105 = X.C64333Db.A8y(r2)     // Catch:{ all -> 0x2904 }
            X.2ss r79 = X.C64333Db.A39(r2)     // Catch:{ all -> 0x2904 }
            X.4aj r46 = X.C88744aj.A00     // Catch:{ all -> 0x2904 }
            X.4C1 r0 = r2.AUd     // Catch:{ all -> 0x2904 }
            java.lang.Object r43 = r0.get()     // Catch:{ all -> 0x2904 }
            r0 = r43
            X.3Mh r0 = (X.C66663Mh) r0     // Catch:{ all -> 0x2904 }
            r43 = r0
            X.33m r57 = X.C64333Db.A08(r2)     // Catch:{ all -> 0x2904 }
            X.3LP r90 = r2.Akp()     // Catch:{ all -> 0x2904 }
            X.4C1 r0 = r2.ASQ     // Catch:{ all -> 0x2904 }
            java.lang.Object r42 = r0.get()     // Catch:{ all -> 0x2904 }
            r0 = r42
            X.5TW r0 = (X.AnonymousClass5TW) r0     // Catch:{ all -> 0x2904 }
            r42 = r0
            X.5UX r68 = X.C86614Ku.A0R(r2)     // Catch:{ all -> 0x2904 }
            X.3Ex r69 = X.C64333Db.A26(r2)     // Catch:{ all -> 0x2904 }
            X.5ZU r71 = X.C64333Db.A28(r2)     // Catch:{ all -> 0x2904 }
            X.8y5 r104 = X.C86614Ku.A0o(r2)     // Catch:{ all -> 0x2904 }
            X.33j r77 = X.C64333Db.A2t(r2)     // Catch:{ all -> 0x2904 }
            X.2rN r103 = X.C64333Db.A8w(r2)     // Catch:{ all -> 0x2904 }
            X.4C1 r0 = r2.AGU     // Catch:{ all -> 0x2904 }
            java.lang.Object r41 = r0.get()     // Catch:{ all -> 0x2904 }
            r0 = r41
            X.2hF r0 = (X.C49882hF) r0     // Catch:{ all -> 0x2904 }
            r41 = r0
            X.4C1 r0 = r2.ARB     // Catch:{ all -> 0x2904 }
            java.lang.Object r40 = r0.get()     // Catch:{ all -> 0x2904 }
            r0 = r40
            X.3S3 r0 = (X.AnonymousClass3S3) r0     // Catch:{ all -> 0x2904 }
            r40 = r0
            X.5bk r3 = r2.A00     // Catch:{ all -> 0x2904 }
            X.4C1 r0 = r3.ABs     // Catch:{ all -> 0x2904 }
            java.lang.Object r39 = r0.get()     // Catch:{ all -> 0x2904 }
            r0 = r39
            X.2iC r0 = (X.C50452iC) r0     // Catch:{ all -> 0x2904 }
            r39 = r0
            X.4C1 r0 = r2.A4D     // Catch:{ all -> 0x2904 }
            java.lang.Object r38 = r0.get()     // Catch:{ all -> 0x2904 }
            r0 = r38
            X.1iI r0 = (X.C29111iI) r0     // Catch:{ all -> 0x2904 }
            r38 = r0
            X.4C1 r0 = r2.A4k     // Catch:{ all -> 0x2904 }
            java.lang.Object r37 = r0.get()     // Catch:{ all -> 0x2904 }
            r0 = r37
            X.2bT r0 = (X.C46342bT) r0     // Catch:{ all -> 0x2904 }
            r37 = r0
            X.1in r70 = X.C86614Ku.A0S(r2)     // Catch:{ all -> 0x2904 }
            X.4C1 r0 = r2.A4R     // Catch:{ all -> 0x2904 }
            java.lang.Object r36 = r0.get()     // Catch:{ all -> 0x2904 }
            r0 = r36
            X.2sW r0 = (X.C56762sW) r0     // Catch:{ all -> 0x2904 }
            r36 = r0
            X.5mB r74 = X.C86644Kx.A0T(r2)     // Catch:{ all -> 0x2904 }
            X.1R1 r100 = X.C86634Kw.A0p(r2)     // Catch:{ all -> 0x2904 }
            X.4C1 r0 = r3.A52     // Catch:{ all -> 0x2904 }
            java.lang.Object r35 = r0.get()     // Catch:{ all -> 0x2904 }
            r0 = r35
            X.2gU r0 = (X.C49412gU) r0     // Catch:{ all -> 0x2904 }
            r35 = r0
            X.1ib r63 = X.C86624Kv.A0N(r2)     // Catch:{ all -> 0x2904 }
            X.3Ej r67 = X.C86654Ky.A0X(r2)     // Catch:{ all -> 0x2904 }
            X.4C1 r0 = r2.APF     // Catch:{ all -> 0x2904 }
            java.lang.Object r34 = r0.get()     // Catch:{ all -> 0x2904 }
            r0 = r34
            X.2xc r0 = (X.C59862xc) r0     // Catch:{ all -> 0x2904 }
            r34 = r0
            X.4C1 r0 = r2.AZC     // Catch:{ all -> 0x2904 }
            java.lang.Object r33 = r0.get()     // Catch:{ all -> 0x2904 }
            r0 = r33
            X.2qY r0 = (X.C55562qY) r0     // Catch:{ all -> 0x2904 }
            r33 = r0
            X.4C1 r0 = r2.AUB     // Catch:{ all -> 0x2904 }
            java.lang.Object r32 = r0.get()     // Catch:{ all -> 0x2904 }
            r0 = r32
            X.30F r0 = (X.AnonymousClass30F) r0     // Catch:{ all -> 0x2904 }
            r32 = r0
            X.4C1 r0 = r2.AWC     // Catch:{ all -> 0x2904 }
            java.lang.Object r15 = r0.get()     // Catch:{ all -> 0x2904 }
            X.2R8 r15 = (X.AnonymousClass2R8) r15     // Catch:{ all -> 0x2904 }
            X.33p r76 = X.C64333Db.A2s(r2)     // Catch:{ all -> 0x2904 }
            X.2so r66 = X.C64333Db.A1k(r2)     // Catch:{ all -> 0x2904 }
            X.4C1 r0 = r2.AIT     // Catch:{ all -> 0x2904 }
            java.lang.Object r14 = r0.get()     // Catch:{ all -> 0x2904 }
            X.2rn r14 = (X.C56322rn) r14     // Catch:{ all -> 0x2904 }
            X.4C1 r0 = r2.APC     // Catch:{ all -> 0x2904 }
            java.lang.Object r12 = r0.get()     // Catch:{ all -> 0x2904 }
            X.33h r12 = (X.C620533h) r12     // Catch:{ all -> 0x2904 }
            X.4C1 r0 = r2.AUD     // Catch:{ all -> 0x2904 }
            java.lang.Object r11 = r0.get()     // Catch:{ all -> 0x2904 }
            X.1iZ r11 = (X.C29281iZ) r11     // Catch:{ all -> 0x2904 }
            X.1iB r86 = X.C64333Db.A3S(r2)     // Catch:{ all -> 0x2904 }
            X.4as r0 = r4.A01     // Catch:{ all -> 0x2904 }
            X.4C1 r4 = r0.A37     // Catch:{ all -> 0x2904 }
            java.lang.Object r10 = r4.get()     // Catch:{ all -> 0x2904 }
            X.5M8 r10 = (X.AnonymousClass5M8) r10     // Catch:{ all -> 0x2904 }
            X.4C1 r4 = r2.A5U     // Catch:{ all -> 0x2904 }
            java.lang.Object r9 = r4.get()     // Catch:{ all -> 0x2904 }
            X.2Vj r9 = (X.C44272Vj) r9     // Catch:{ all -> 0x2904 }
            X.4C1 r4 = r0.A38     // Catch:{ all -> 0x2904 }
            java.lang.Object r7 = r4.get()     // Catch:{ all -> 0x2904 }
            X.5M9 r7 = (X.AnonymousClass5M9) r7     // Catch:{ all -> 0x2904 }
            X.2sj r81 = X.C64333Db.A3G(r2)     // Catch:{ all -> 0x2904 }
            X.4C1 r3 = r3.A2L     // Catch:{ all -> 0x2904 }
            java.lang.Object r6 = r3.get()     // Catch:{ all -> 0x2904 }
            X.2aG r6 = (X.C45592aG) r6     // Catch:{ all -> 0x2904 }
            X.30g r72 = X.C86624Kv.A0P(r2)     // Catch:{ all -> 0x2904 }
            X.3Lo r80 = X.C86634Kw.A0f(r2)     // Catch:{ all -> 0x2904 }
            X.4C1 r3 = r2.A8K     // Catch:{ all -> 0x2904 }
            java.lang.Object r5 = r3.get()     // Catch:{ all -> 0x2904 }
            X.2hv r5 = (X.C50282hv) r5     // Catch:{ all -> 0x2904 }
            X.1iV r92 = X.C86624Kv.A0T(r2)     // Catch:{ all -> 0x2904 }
            X.4C1 r3 = r0.A1D     // Catch:{ all -> 0x2904 }
            java.lang.Object r4 = r3.get()     // Catch:{ all -> 0x2904 }
            X.64i r4 = (X.C1224264i) r4     // Catch:{ all -> 0x2904 }
            X.4C1 r0 = r0.A39     // Catch:{ all -> 0x2904 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x2904 }
            X.5Em r3 = (X.C101365Em) r3     // Catch:{ all -> 0x2904 }
            X.2lX r93 = X.C86644Kx.A0W(r2)     // Catch:{ all -> 0x2904 }
            X.5BY r96 = new X.5BY     // Catch:{ all -> 0x2904 }
            r96.<init>()     // Catch:{ all -> 0x2904 }
            X.4C1 r0 = r2.AZv     // Catch:{ all -> 0x2904 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x2904 }
            X.2bw r0 = (X.C46622bw) r0     // Catch:{ all -> 0x2904 }
            X.4mN r22 = new X.4mN     // Catch:{ all -> 0x2904 }
            r48 = r46
            r49 = r46
            r47 = r46
            r50 = r10
            r51 = r7
            r52 = r3
            r56 = r43
            r58 = r19
            r59 = r4
            r60 = r35
            r61 = r0
            r62 = r42
            r64 = r37
            r65 = r9
            r78 = r36
            r82 = r14
            r83 = r12
            r84 = r33
            r87 = r15
            r88 = r34
            r91 = r41
            r94 = r44
            r95 = r39
            r97 = r40
            r98 = r32
            r99 = r11
            r101 = r6
            r102 = r5
            r106 = r38
            r44 = r22
            r44.<init>(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106)     // Catch:{ all -> 0x2904 }
        L_0x1948:
            boolean r0 = r1.A6L     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x1954
            X.4fR r2 = r1.A2Z     // Catch:{ all -> 0x2904 }
            if (r2 == 0) goto L_0x1954
            androidx.appcompat.widget.Toolbar r0 = r1.A0r     // Catch:{ all -> 0x2904 }
            r2.A0E = r0     // Catch:{ all -> 0x2904 }
        L_0x1954:
            X.4fR r2 = r1.A2Z     // Catch:{ all -> 0x2904 }
            r0 = r107
            r0.add(r2)     // Catch:{ all -> 0x2904 }
            goto L_0x1dfe
        L_0x195d:
            boolean r0 = r1.A6W     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x1a99
            X.4uZ r3 = r1.A4J     // Catch:{ all -> 0x2904 }
            boolean r0 = r3 instanceof X.AnonymousClass1fI     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x1a96
            X.1fI r3 = (X.AnonymousClass1fI) r3     // Catch:{ all -> 0x2904 }
        L_0x1969:
            X.C626936e.A06(r3)     // Catch:{ all -> 0x2904 }
            X.4eZ r33 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.1VX r50 = A0E(r1)     // Catch:{ all -> 0x2904 }
            X.3Wi r35 = A07(r1)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.2sr r36 = r0.getMeManager()     // Catch:{ all -> 0x2904 }
            X.4FS r55 = A0G(r1)     // Catch:{ all -> 0x2904 }
            X.2ss r0 = r1.A3d     // Catch:{ all -> 0x2904 }
            r32 = r0
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.5Y0 r49 = r0.getEmojiLoader()     // Catch:{ all -> 0x2904 }
            X.5UX r0 = r1.A2Q     // Catch:{ all -> 0x2904 }
            r22 = r0
            X.2nK r15 = r1.A13     // Catch:{ all -> 0x2904 }
            X.676 r14 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.2rN r53 = r14.getGroupChatUtils()     // Catch:{ all -> 0x2904 }
            X.8y5 r12 = r1.A5a     // Catch:{ all -> 0x2904 }
            X.5ZU r43 = r14.getWAContactNames()     // Catch:{ all -> 0x2904 }
            X.33j r11 = r1.A3L     // Catch:{ all -> 0x2904 }
            X.1in r10 = r1.A2R     // Catch:{ all -> 0x2904 }
            X.1ib r9 = r1.A2F     // Catch:{ all -> 0x2904 }
            X.1ia r7 = r1.A1s     // Catch:{ all -> 0x2904 }
            X.30g r6 = r1.A2V     // Catch:{ all -> 0x2904 }
            X.3Lo r5 = r1.A3e     // Catch:{ all -> 0x2904 }
            X.1iV r4 = r1.A4B     // Catch:{ all -> 0x2904 }
            X.64J r2 = r1.A1k     // Catch:{ all -> 0x2904 }
            X.3ZH r0 = r1.A3n     // Catch:{ all -> 0x2904 }
            r56 = r0
            X.4m8 r0 = new X.4m8     // Catch:{ all -> 0x2904 }
            r34 = r15
            r37 = r2
            r38 = r19
            r39 = r7
            r40 = r9
            r41 = r22
            r42 = r10
            r44 = r6
            r45 = r11
            r46 = r32
            r47 = r5
            r48 = r56
            r51 = r4
            r52 = r3
            r54 = r12
            r32 = r0
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)     // Catch:{ all -> 0x2904 }
            r1.A2Z = r0     // Catch:{ all -> 0x2904 }
            X.5D4 r0 = r1.A17     // Catch:{ all -> 0x2904 }
            X.4eZ r33 = r14.getActivity()     // Catch:{ all -> 0x2904 }
            X.4eZ r40 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.676 r12 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.5sx r2 = r0.A00     // Catch:{ all -> 0x2904 }
            X.3Db r0 = r2.A03     // Catch:{ all -> 0x2904 }
            X.1VX r58 = X.C64333Db.A4B(r0)     // Catch:{ all -> 0x2904 }
            X.3Wi r41 = X.C64333Db.A04(r0)     // Catch:{ all -> 0x2904 }
            X.2sr r42 = X.C64333Db.A06(r0)     // Catch:{ all -> 0x2904 }
            X.4FS r66 = X.C64333Db.A8y(r0)     // Catch:{ all -> 0x2904 }
            X.2ss r54 = X.C64333Db.A39(r0)     // Catch:{ all -> 0x2904 }
            X.4aj r34 = X.C88744aj.A00     // Catch:{ all -> 0x2904 }
            X.4C1 r4 = r0.AUd     // Catch:{ all -> 0x2904 }
            java.lang.Object r11 = r4.get()     // Catch:{ all -> 0x2904 }
            X.3Mh r11 = (X.C66663Mh) r11     // Catch:{ all -> 0x2904 }
            X.33m r44 = X.C64333Db.A08(r0)     // Catch:{ all -> 0x2904 }
            X.3LP r59 = r0.Akp()     // Catch:{ all -> 0x2904 }
            X.4C1 r4 = r0.ASQ     // Catch:{ all -> 0x2904 }
            java.lang.Object r10 = r4.get()     // Catch:{ all -> 0x2904 }
            X.5TW r10 = (X.AnonymousClass5TW) r10     // Catch:{ all -> 0x2904 }
            X.8y5 r65 = X.C86614Ku.A0o(r0)     // Catch:{ all -> 0x2904 }
            X.33j r53 = X.C64333Db.A2t(r0)     // Catch:{ all -> 0x2904 }
            X.5bk r4 = r0.A00     // Catch:{ all -> 0x2904 }
            X.4C1 r4 = r4.ABs     // Catch:{ all -> 0x2904 }
            java.lang.Object r9 = r4.get()     // Catch:{ all -> 0x2904 }
            X.2iC r9 = (X.C50452iC) r9     // Catch:{ all -> 0x2904 }
            X.4C1 r4 = r0.A4k     // Catch:{ all -> 0x2904 }
            java.lang.Object r7 = r4.get()     // Catch:{ all -> 0x2904 }
            X.2bT r7 = (X.C46342bT) r7     // Catch:{ all -> 0x2904 }
            X.1in r49 = X.C86614Ku.A0S(r0)     // Catch:{ all -> 0x2904 }
            X.5mB r51 = X.C86644Kx.A0T(r0)     // Catch:{ all -> 0x2904 }
            X.1R1 r63 = X.C86634Kw.A0p(r0)     // Catch:{ all -> 0x2904 }
            X.1ib r47 = X.C86624Kv.A0N(r0)     // Catch:{ all -> 0x2904 }
            X.33p r52 = X.C64333Db.A2s(r0)     // Catch:{ all -> 0x2904 }
            X.1iB r57 = X.C64333Db.A3S(r0)     // Catch:{ all -> 0x2904 }
            X.4as r2 = r2.A01     // Catch:{ all -> 0x2904 }
            X.4C1 r4 = r2.A37     // Catch:{ all -> 0x2904 }
            java.lang.Object r6 = r4.get()     // Catch:{ all -> 0x2904 }
            X.5M8 r6 = (X.AnonymousClass5M8) r6     // Catch:{ all -> 0x2904 }
            X.4C1 r4 = r2.A38     // Catch:{ all -> 0x2904 }
            java.lang.Object r5 = r4.get()     // Catch:{ all -> 0x2904 }
            X.5M9 r5 = (X.AnonymousClass5M9) r5     // Catch:{ all -> 0x2904 }
            X.3Lo r55 = X.C86634Kw.A0f(r0)     // Catch:{ all -> 0x2904 }
            X.4C1 r4 = r0.A8K     // Catch:{ all -> 0x2904 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x2904 }
            X.2hv r4 = (X.C50282hv) r4     // Catch:{ all -> 0x2904 }
            X.1iV r60 = X.C86624Kv.A0T(r0)     // Catch:{ all -> 0x2904 }
            X.4C1 r0 = r2.A39     // Catch:{ all -> 0x2904 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x2904 }
            X.5Em r0 = (X.C101365Em) r0     // Catch:{ all -> 0x2904 }
            X.4mL r22 = new X.4mL     // Catch:{ all -> 0x2904 }
            r36 = r34
            r32 = r22
            r35 = r34
            r37 = r6
            r38 = r5
            r39 = r0
            r43 = r11
            r45 = r19
            r46 = r10
            r48 = r7
            r50 = r12
            r61 = r3
            r62 = r9
            r64 = r4
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)     // Catch:{ all -> 0x2904 }
            goto L_0x1948
        L_0x1a96:
            r3 = 0
            goto L_0x1969
        L_0x1a99:
            boolean r0 = A0Q(r1)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x1c33
            X.5LO r0 = A0C(r1)     // Catch:{ all -> 0x2904 }
            X.5DS r2 = r0.A02     // Catch:{ all -> 0x2904 }
            X.4eZ r33 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            boolean r3 = r0 instanceof X.C95804uY     // Catch:{ all -> 0x2904 }
            if (r3 == 0) goto L_0x1c30
            X.4uY r0 = (X.C95804uY) r0     // Catch:{ all -> 0x2904 }
        L_0x1ab1:
            X.C626936e.A06(r0)     // Catch:{ all -> 0x2904 }
            X.3ZH r6 = r1.A3n     // Catch:{ all -> 0x2904 }
            X.5sx r2 = r2.A00     // Catch:{ all -> 0x2904 }
            X.3Db r4 = r2.A03     // Catch:{ all -> 0x2904 }
            X.1VX r52 = X.C64333Db.A4B(r4)     // Catch:{ all -> 0x2904 }
            X.3Wi r36 = X.C64333Db.A04(r4)     // Catch:{ all -> 0x2904 }
            X.2sr r37 = X.C64333Db.A06(r4)     // Catch:{ all -> 0x2904 }
            X.4FS r58 = X.C64333Db.A8y(r4)     // Catch:{ all -> 0x2904 }
            X.2ss r48 = X.C64333Db.A39(r4)     // Catch:{ all -> 0x2904 }
            X.5Y0 r51 = X.C64333Db.A3o(r4)     // Catch:{ all -> 0x2904 }
            X.5UX r42 = X.C86614Ku.A0R(r4)     // Catch:{ all -> 0x2904 }
            X.4C1 r3 = r4.A6W     // Catch:{ all -> 0x2904 }
            java.lang.Object r5 = r3.get()     // Catch:{ all -> 0x2904 }
            X.2nK r5 = (X.C53582nK) r5     // Catch:{ all -> 0x2904 }
            X.8y5 r57 = X.C86614Ku.A0o(r4)     // Catch:{ all -> 0x2904 }
            X.5ZU r44 = X.C64333Db.A28(r4)     // Catch:{ all -> 0x2904 }
            X.33j r47 = X.C64333Db.A2t(r4)     // Catch:{ all -> 0x2904 }
            X.2rN r56 = X.C64333Db.A8w(r4)     // Catch:{ all -> 0x2904 }
            X.1in r43 = X.C86614Ku.A0S(r4)     // Catch:{ all -> 0x2904 }
            X.1ib r41 = X.C86624Kv.A0N(r4)     // Catch:{ all -> 0x2904 }
            X.1ia r40 = X.C86654Ky.A0S(r4)     // Catch:{ all -> 0x2904 }
            X.30g r45 = X.C86624Kv.A0P(r4)     // Catch:{ all -> 0x2904 }
            X.3Lo r49 = X.C86634Kw.A0f(r4)     // Catch:{ all -> 0x2904 }
            X.1iV r53 = X.C86624Kv.A0T(r4)     // Catch:{ all -> 0x2904 }
            X.4as r2 = r2.A01     // Catch:{ all -> 0x2904 }
            X.4C1 r2 = r2.A1L     // Catch:{ all -> 0x2904 }
            java.lang.Object r3 = r2.get()     // Catch:{ all -> 0x2904 }
            X.5DR r3 = (X.AnonymousClass5DR) r3     // Catch:{ all -> 0x2904 }
            X.64J r38 = X.C86614Ku.A0N(r4)     // Catch:{ all -> 0x2904 }
            X.2sH r46 = X.C64333Db.A2p(r4)     // Catch:{ all -> 0x2904 }
            X.5bk r2 = r4.A00     // Catch:{ all -> 0x2904 }
            X.4C1 r2 = r2.A85     // Catch:{ all -> 0x2904 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x2904 }
            X.5QQ r2 = (X.AnonymousClass5QQ) r2     // Catch:{ all -> 0x2904 }
            X.4mC r4 = new X.4mC     // Catch:{ all -> 0x2904 }
            r34 = r5
            r35 = r3
            r39 = r19
            r50 = r6
            r54 = r0
            r55 = r2
            r32 = r4
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)     // Catch:{ all -> 0x2904 }
            r1.A2Z = r4     // Catch:{ all -> 0x2904 }
            X.5LO r0 = A0C(r1)     // Catch:{ all -> 0x2904 }
            X.5DQ r2 = r0.A00     // Catch:{ all -> 0x2904 }
            X.4eZ r33 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.4eZ r41 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            r51 = r0
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            r65 = r0
            X.3ZH r0 = r1.A3n     // Catch:{ all -> 0x2904 }
            r32 = r0
            X.5sx r2 = r2.A00     // Catch:{ all -> 0x2904 }
            X.3Db r0 = r2.A03     // Catch:{ all -> 0x2904 }
            X.1VX r62 = X.C64333Db.A4B(r0)     // Catch:{ all -> 0x2904 }
            X.3Wi r42 = X.C64333Db.A04(r0)     // Catch:{ all -> 0x2904 }
            X.2sr r43 = X.C64333Db.A06(r0)     // Catch:{ all -> 0x2904 }
            X.4FS r72 = X.C64333Db.A8y(r0)     // Catch:{ all -> 0x2904 }
            X.2ss r58 = X.C64333Db.A39(r0)     // Catch:{ all -> 0x2904 }
            X.4aj r34 = X.C88744aj.A00     // Catch:{ all -> 0x2904 }
            X.4C1 r3 = r0.AUd     // Catch:{ all -> 0x2904 }
            java.lang.Object r15 = r3.get()     // Catch:{ all -> 0x2904 }
            X.3Mh r15 = (X.C66663Mh) r15     // Catch:{ all -> 0x2904 }
            X.33m r45 = X.C64333Db.A08(r0)     // Catch:{ all -> 0x2904 }
            X.3LP r63 = r0.Akp()     // Catch:{ all -> 0x2904 }
            X.4C1 r3 = r0.ASQ     // Catch:{ all -> 0x2904 }
            java.lang.Object r14 = r3.get()     // Catch:{ all -> 0x2904 }
            X.5TW r14 = (X.AnonymousClass5TW) r14     // Catch:{ all -> 0x2904 }
            X.33j r56 = X.C64333Db.A2t(r0)     // Catch:{ all -> 0x2904 }
            X.4C1 r3 = r0.A4k     // Catch:{ all -> 0x2904 }
            java.lang.Object r12 = r3.get()     // Catch:{ all -> 0x2904 }
            X.2bT r12 = (X.C46342bT) r12     // Catch:{ all -> 0x2904 }
            X.1in r50 = X.C86614Ku.A0S(r0)     // Catch:{ all -> 0x2904 }
            X.5mB r52 = X.C86644Kx.A0T(r0)     // Catch:{ all -> 0x2904 }
            X.1R1 r70 = X.C86634Kw.A0p(r0)     // Catch:{ all -> 0x2904 }
            X.1ib r48 = X.C86624Kv.A0N(r0)     // Catch:{ all -> 0x2904 }
            X.33p r55 = X.C64333Db.A2s(r0)     // Catch:{ all -> 0x2904 }
            X.1iB r61 = X.C64333Db.A3S(r0)     // Catch:{ all -> 0x2904 }
            X.4as r2 = r2.A01     // Catch:{ all -> 0x2904 }
            X.4C1 r3 = r2.A37     // Catch:{ all -> 0x2904 }
            java.lang.Object r11 = r3.get()     // Catch:{ all -> 0x2904 }
            X.5M8 r11 = (X.AnonymousClass5M8) r11     // Catch:{ all -> 0x2904 }
            X.4C1 r3 = r2.A38     // Catch:{ all -> 0x2904 }
            java.lang.Object r10 = r3.get()     // Catch:{ all -> 0x2904 }
            X.5M9 r10 = (X.AnonymousClass5M9) r10     // Catch:{ all -> 0x2904 }
            X.3Lo r59 = X.C86634Kw.A0f(r0)     // Catch:{ all -> 0x2904 }
            X.4C1 r3 = r0.A8K     // Catch:{ all -> 0x2904 }
            java.lang.Object r9 = r3.get()     // Catch:{ all -> 0x2904 }
            X.2hv r9 = (X.C50282hv) r9     // Catch:{ all -> 0x2904 }
            X.1iV r64 = X.C86624Kv.A0T(r0)     // Catch:{ all -> 0x2904 }
            X.4C1 r3 = r2.A39     // Catch:{ all -> 0x2904 }
            java.lang.Object r7 = r3.get()     // Catch:{ all -> 0x2904 }
            X.5Em r7 = (X.C101365Em) r7     // Catch:{ all -> 0x2904 }
            X.4C1 r2 = r2.A1L     // Catch:{ all -> 0x2904 }
            java.lang.Object r6 = r2.get()     // Catch:{ all -> 0x2904 }
            X.5DR r6 = (X.AnonymousClass5DR) r6     // Catch:{ all -> 0x2904 }
            X.5bk r2 = r0.A00     // Catch:{ all -> 0x2904 }
            X.4C1 r3 = r2.ABs     // Catch:{ all -> 0x2904 }
            java.lang.Object r5 = r3.get()     // Catch:{ all -> 0x2904 }
            X.2iC r5 = (X.C50452iC) r5     // Catch:{ all -> 0x2904 }
            X.2sH r54 = X.C64333Db.A2p(r0)     // Catch:{ all -> 0x2904 }
            X.4C1 r3 = r0.A51     // Catch:{ all -> 0x2904 }
            java.lang.Object r4 = r3.get()     // Catch:{ all -> 0x2904 }
            X.1hu r4 = (X.C28871hu) r4     // Catch:{ all -> 0x2904 }
            X.4C1 r3 = r0.ANq     // Catch:{ all -> 0x2904 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x2904 }
            X.5YD r3 = (X.AnonymousClass5YD) r3     // Catch:{ all -> 0x2904 }
            X.33i r53 = X.C64333Db.A2o(r0)     // Catch:{ all -> 0x2904 }
            X.4C1 r2 = r2.A8A     // Catch:{ all -> 0x2904 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x2904 }
            X.5Pe r2 = (X.C103985Pe) r2     // Catch:{ all -> 0x2904 }
            X.5UP r67 = X.C86634Kw.A0n(r0)     // Catch:{ all -> 0x2904 }
            X.4mO r22 = new X.4mO     // Catch:{ all -> 0x2904 }
            r36 = r34
            r35 = r34
            r37 = r6
            r38 = r11
            r39 = r10
            r40 = r7
            r44 = r15
            r46 = r19
            r47 = r14
            r49 = r12
            r57 = r4
            r60 = r32
            r66 = r5
            r68 = r3
            r69 = r2
            r71 = r9
            r32 = r22
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72)     // Catch:{ all -> 0x2904 }
            goto L_0x1948
        L_0x1c30:
            r0 = 0
            goto L_0x1ab1
        L_0x1c33:
            X.66o r2 = X.AnonymousClass5KY.A00(r1)     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            boolean r0 = r2.BH4(r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x1d02
            X.66o r0 = X.AnonymousClass5KY.A00(r1)     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r2.getGlobalUI()     // Catch:{ all -> 0x2904 }
            X.4uZ r2 = r1.A4J     // Catch:{ all -> 0x2904 }
            android.widget.LinearLayout r9 = r1.A0k     // Catch:{ all -> 0x2904 }
            android.view.ViewGroup r4 = r1.A0U     // Catch:{ all -> 0x2904 }
            android.view.Window r7 = A03(r1)     // Catch:{ all -> 0x2904 }
            X.3ZH r10 = r1.A3n     // Catch:{ all -> 0x2904 }
            X.4eZ r6 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.5jK r0 = (X.C112185jK) r0     // Catch:{ all -> 0x2904 }
            r3 = 1
            X.C162457s7.A0J(r2, r3)     // Catch:{ all -> 0x2904 }
            r3 = 2
            X.C162457s7.A0J(r9, r3)     // Catch:{ all -> 0x2904 }
            r3 = 3
            X.C18260x0.A0b(r4, r7, r10, r3)     // Catch:{ all -> 0x2904 }
            r3 = 7
            X.C162457s7.A0J(r6, r3)     // Catch:{ all -> 0x2904 }
            X.2E5 r3 = r0.A00     // Catch:{ all -> 0x2904 }
            X.3dX r3 = r3.A00     // Catch:{ all -> 0x2904 }
            X.3Db r3 = r3.A01     // Catch:{ all -> 0x2904 }
            X.1VX r51 = X.C64333Db.A4B(r3)     // Catch:{ all -> 0x2904 }
            X.3Wi r35 = X.C64333Db.A04(r3)     // Catch:{ all -> 0x2904 }
            X.2sr r36 = X.C64333Db.A06(r3)     // Catch:{ all -> 0x2904 }
            X.4FS r56 = X.C64333Db.A8y(r3)     // Catch:{ all -> 0x2904 }
            X.2ss r47 = X.C64333Db.A39(r3)     // Catch:{ all -> 0x2904 }
            X.5Y0 r50 = X.C64333Db.A3o(r3)     // Catch:{ all -> 0x2904 }
            X.5UX r42 = X.C86614Ku.A0R(r3)     // Catch:{ all -> 0x2904 }
            X.4C1 r4 = r3.A6W     // Catch:{ all -> 0x2904 }
            java.lang.Object r5 = r4.get()     // Catch:{ all -> 0x2904 }
            X.2nK r5 = (X.C53582nK) r5     // Catch:{ all -> 0x2904 }
            X.2rN r54 = X.C64333Db.A8w(r3)     // Catch:{ all -> 0x2904 }
            X.8y5 r55 = X.C86614Ku.A0o(r3)     // Catch:{ all -> 0x2904 }
            X.5ZU r44 = X.C64333Db.A28(r3)     // Catch:{ all -> 0x2904 }
            X.33j r46 = X.C64333Db.A2t(r3)     // Catch:{ all -> 0x2904 }
            X.1in r43 = X.C86614Ku.A0S(r3)     // Catch:{ all -> 0x2904 }
            X.4C1 r4 = r3.A3A     // Catch:{ all -> 0x2904 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x2904 }
            X.66o r4 = (X.C1229766o) r4     // Catch:{ all -> 0x2904 }
            X.1ib r41 = X.C86624Kv.A0N(r3)     // Catch:{ all -> 0x2904 }
            X.1ia r39 = X.C86654Ky.A0S(r3)     // Catch:{ all -> 0x2904 }
            X.30g r45 = X.C86624Kv.A0P(r3)     // Catch:{ all -> 0x2904 }
            X.3Lo r48 = X.C86634Kw.A0f(r3)     // Catch:{ all -> 0x2904 }
            X.1iV r52 = X.C86624Kv.A0T(r3)     // Catch:{ all -> 0x2904 }
            X.64J r37 = X.C86614Ku.A0N(r3)     // Catch:{ all -> 0x2904 }
            X.4m9 r3 = new X.4m9     // Catch:{ all -> 0x2904 }
            r33 = r6
            r34 = r5
            r38 = r19
            r40 = r4
            r49 = r10
            r53 = r2
            r32 = r3
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)     // Catch:{ all -> 0x2904 }
            X.0XL r5 = X.AnonymousClass0x9.A0H(r6)     // Catch:{ all -> 0x2904 }
            java.lang.Class<com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel> r4 = com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel.class
            X.0Ty r4 = r5.A01(r4)     // Catch:{ all -> 0x2904 }
            com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel r4 = (com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel) r4     // Catch:{ all -> 0x2904 }
            boolean r0 = r0.BH3(r2)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x1cf0
            X.C112185jK.A00(r9, r7, r6, r4, r2)     // Catch:{ all -> 0x2904 }
        L_0x1cf0:
            X.3Z6 r2 = X.AnonymousClass3Z6.A02(r3, r4)     // Catch:{ all -> 0x2904 }
            java.lang.Object r0 = r2.first     // Catch:{ all -> 0x2904 }
            X.4fR r0 = (X.C89884fR) r0     // Catch:{ all -> 0x2904 }
            r1.A2Z = r0     // Catch:{ all -> 0x2904 }
            java.lang.Object r0 = r2.second     // Catch:{ all -> 0x2904 }
            com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel r0 = (com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel) r0     // Catch:{ all -> 0x2904 }
            r1.A29 = r0     // Catch:{ all -> 0x2904 }
            goto L_0x1948
        L_0x1d02:
            X.5DH r0 = r1.A1K     // Catch:{ all -> 0x2904 }
            X.4eZ r33 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.3Lo r12 = r1.A3e     // Catch:{ all -> 0x2904 }
            X.4uZ r11 = r1.A4J     // Catch:{ all -> 0x2904 }
            X.C626936e.A06(r11)     // Catch:{ all -> 0x2904 }
            X.3ZH r10 = r1.A3n     // Catch:{ all -> 0x2904 }
            X.0sA r34 = A05(r1)     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.0sD r35 = r2.getViewModelStoreOwner()     // Catch:{ all -> 0x2904 }
            X.5sx r3 = r0.A00     // Catch:{ all -> 0x2904 }
            X.3Db r0 = r3.A03     // Catch:{ all -> 0x2904 }
            X.2sH r50 = X.C64333Db.A2p(r0)     // Catch:{ all -> 0x2904 }
            X.1VX r57 = X.C64333Db.A4B(r0)     // Catch:{ all -> 0x2904 }
            X.3Wi r39 = X.C64333Db.A04(r0)     // Catch:{ all -> 0x2904 }
            X.2sr r40 = X.C64333Db.A06(r0)     // Catch:{ all -> 0x2904 }
            X.4FS r65 = X.C64333Db.A8y(r0)     // Catch:{ all -> 0x2904 }
            X.4C1 r2 = r0.AaZ     // Catch:{ all -> 0x2904 }
            java.lang.Object r7 = r2.get()     // Catch:{ all -> 0x2904 }
            X.2gy r7 = (X.C49712gy) r7     // Catch:{ all -> 0x2904 }
            X.2ss r53 = X.C64333Db.A39(r0)     // Catch:{ all -> 0x2904 }
            X.5Y0 r56 = X.C64333Db.A3o(r0)     // Catch:{ all -> 0x2904 }
            X.3LP r58 = r0.Akp()     // Catch:{ all -> 0x2904 }
            X.5bk r2 = r0.A00     // Catch:{ all -> 0x2904 }
            X.4C1 r4 = r2.ABB     // Catch:{ all -> 0x2904 }
            java.lang.Object r6 = r4.get()     // Catch:{ all -> 0x2904 }
            X.5Mi r6 = (X.C103295Mi) r6     // Catch:{ all -> 0x2904 }
            X.5UX r46 = X.C86614Ku.A0R(r0)     // Catch:{ all -> 0x2904 }
            X.4C1 r4 = r0.A6W     // Catch:{ all -> 0x2904 }
            java.lang.Object r5 = r4.get()     // Catch:{ all -> 0x2904 }
            X.2nK r5 = (X.C53582nK) r5     // Catch:{ all -> 0x2904 }
            X.2rN r63 = X.C64333Db.A8w(r0)     // Catch:{ all -> 0x2904 }
            X.8y5 r64 = X.C86614Ku.A0o(r0)     // Catch:{ all -> 0x2904 }
            X.5ZU r48 = X.C64333Db.A28(r0)     // Catch:{ all -> 0x2904 }
            X.33j r51 = X.C64333Db.A2t(r0)     // Catch:{ all -> 0x2904 }
            X.4C1 r4 = r0.Aat     // Catch:{ all -> 0x2904 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x2904 }
            X.2mu r4 = (X.C53322mu) r4     // Catch:{ all -> 0x2904 }
            X.4C1 r9 = r0.AZn     // Catch:{ all -> 0x2904 }
            X.8qC r67 = X.C72343dZ.A00(r9)     // Catch:{ all -> 0x2904 }
            X.1in r47 = X.C86614Ku.A0S(r0)     // Catch:{ all -> 0x2904 }
            X.1ib r45 = X.C86624Kv.A0N(r0)     // Catch:{ all -> 0x2904 }
            X.4C1 r9 = r0.A3A     // Catch:{ all -> 0x2904 }
            X.4ai r36 = X.C88734ai.A00(r9)     // Catch:{ all -> 0x2904 }
            X.1ia r44 = X.C86654Ky.A0S(r0)     // Catch:{ all -> 0x2904 }
            X.30g r49 = X.C86624Kv.A0P(r0)     // Catch:{ all -> 0x2904 }
            X.1iV r59 = X.C86624Kv.A0T(r0)     // Catch:{ all -> 0x2904 }
            X.4C1 r2 = r2.A0a     // Catch:{ all -> 0x2904 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x2904 }
            X.5FA r2 = (X.AnonymousClass5FA) r2     // Catch:{ all -> 0x2904 }
            X.4C1 r9 = r0.A6G     // Catch:{ all -> 0x2904 }
            X.8qC r68 = X.C72343dZ.A00(r9)     // Catch:{ all -> 0x2904 }
            X.4as r3 = r3.A01     // Catch:{ all -> 0x2904 }
            X.4C1 r3 = r3.A0L     // Catch:{ all -> 0x2904 }
            X.8qC r69 = X.C72343dZ.A00(r3)     // Catch:{ all -> 0x2904 }
            X.64J r41 = X.C86614Ku.A0N(r0)     // Catch:{ all -> 0x2904 }
            X.2hn r52 = r0.Aje()     // Catch:{ all -> 0x2904 }
            X.2mi r60 = X.C86654Ky.A0Z(r0)     // Catch:{ all -> 0x2904 }
            X.4mA r0 = new X.4mA     // Catch:{ all -> 0x2904 }
            r37 = r5
            r38 = r2
            r42 = r7
            r43 = r19
            r54 = r12
            r55 = r10
            r61 = r11
            r62 = r6
            r66 = r4
            r32 = r0
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69)     // Catch:{ all -> 0x2904 }
            r1.A2Z = r0     // Catch:{ all -> 0x2904 }
            X.66o r2 = X.AnonymousClass5KY.A00(r1)     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            boolean r0 = r2.BH2(r0)     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x1948
            X.2Us r4 = r1.A1E     // Catch:{ all -> 0x2904 }
            X.4eZ r33 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.4eZ r34 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.676 r3 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.4uZ r2 = r1.A4J     // Catch:{ all -> 0x2904 }
            X.3ZH r0 = r1.A3n     // Catch:{ all -> 0x2904 }
            r32 = r4
            r35 = r19
            r36 = r3
            r37 = r0
            r38 = r2
            X.4mM r22 = r32.A00(r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x2904 }
            goto L_0x1948
        L_0x1dfe:
            if (r22 == 0) goto L_0x1e0a
            r2 = r22
            r0.add(r2)     // Catch:{ all -> 0x2904 }
            java.util.Set r0 = r1.A7M     // Catch:{ all -> 0x2904 }
            r0.add(r2)     // Catch:{ all -> 0x2904 }
        L_0x1e0a:
            com.whatsapp.mentions.MentionableEntry r0 = r1.A4P     // Catch:{ all -> 0x2904 }
            r0.requestFocus()     // Catch:{ all -> 0x2904 }
            X.5WZ r2 = new X.5WZ     // Catch:{ all -> 0x2904 }
            r2.<init>(r8, r1)     // Catch:{ all -> 0x2904 }
            X.5PZ r0 = new X.5PZ     // Catch:{ all -> 0x2904 }
            r0.<init>(r2)     // Catch:{ all -> 0x2904 }
            r1.A2b = r0     // Catch:{ all -> 0x2904 }
            r1.A1N()     // Catch:{ all -> 0x2904 }
            X.5PZ r0 = r1.A2b     // Catch:{ all -> 0x2904 }
            java.lang.Class<X.4m6> r2 = X.C92104m6.class
            X.5WZ r0 = r0.A00     // Catch:{ all -> 0x2904 }
            X.5rH r0 = r0.A00(r2)     // Catch:{ all -> 0x2904 }
            X.4m6 r0 = (X.C92104m6) r0     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x1e45
            boolean r3 = r0.A06()     // Catch:{ all -> 0x2904 }
            boolean r2 = r0.A07()     // Catch:{ all -> 0x2904 }
            if (r3 == 0) goto L_0x1e3c
            if (r2 == 0) goto L_0x1e42
            r0.A09()     // Catch:{ all -> 0x2904 }
            goto L_0x1e45
        L_0x1e3c:
            if (r2 == 0) goto L_0x1e45
            r0.A05(r13)     // Catch:{ all -> 0x2904 }
            goto L_0x1e45
        L_0x1e42:
            r0.A03()     // Catch:{ all -> 0x2904 }
        L_0x1e45:
            X.5PZ r0 = r1.A2b     // Catch:{ all -> 0x2904 }
            java.lang.Class<X.4m5> r2 = X.C92094m5.class
            X.5WZ r0 = r0.A00     // Catch:{ all -> 0x2904 }
            X.5rH r0 = r0.A00(r2)     // Catch:{ all -> 0x2904 }
            X.4m5 r0 = (X.C92094m5) r0     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x1e68
            boolean r3 = r0.A06()     // Catch:{ all -> 0x2904 }
            boolean r2 = r0.A07()     // Catch:{ all -> 0x2904 }
            if (r3 == 0) goto L_0x1e63
            if (r2 != 0) goto L_0x1e68
            r0.A03()     // Catch:{ all -> 0x2904 }
            goto L_0x1e68
        L_0x1e63:
            if (r2 == 0) goto L_0x1e68
            r0.A05(r13)     // Catch:{ all -> 0x2904 }
        L_0x1e68:
            X.5PZ r2 = r1.A2b     // Catch:{ all -> 0x2904 }
            java.lang.Class<X.1PN> r0 = X.AnonymousClass1PN.class
            r2.A01(r0)     // Catch:{ all -> 0x2904 }
            X.9ao r0 = r1.A4f     // Catch:{ all -> 0x2904 }
            r2 = r20
            java.util.List r2 = r2.A0a     // Catch:{ all -> 0x2904 }
            r2.add(r0)     // Catch:{ all -> 0x2904 }
            r21.A07()     // Catch:{ all -> 0x2904 }
            X.1VX r2 = r1.A41     // Catch:{ all -> 0x2904 }
            r0 = 5532(0x159c, float:7.752E-42)
            boolean r0 = r2.A0X(r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x1e95
            X.4eZ r3 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.4N8 r2 = new X.4N8     // Catch:{ all -> 0x2904 }
            r2.<init>(r1)     // Catch:{ all -> 0x2904 }
            X.0N1 r0 = new X.0N1     // Catch:{ all -> 0x2904 }
            r0.<init>(r3, r2)     // Catch:{ all -> 0x2904 }
            r1.A0s = r0     // Catch:{ all -> 0x2904 }
        L_0x1e95:
            java.lang.String r0 = "on_create_conversation_end"
            r1.A2F(r0)     // Catch:{ all -> 0x2904 }
            X.9Wq r2 = r1.A4k     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            int r3 = r2.A0C(r0)     // Catch:{ all -> 0x2904 }
            X.4eZ r2 = A09(r1)     // Catch:{ all -> 0x2904 }
            r0 = 2131432134(0x7f0b12c6, float:1.8486017E38)
            X.5UY r2 = X.AnonymousClass5UY.A01(r2, r0)     // Catch:{ all -> 0x2904 }
            r1.A5e = r2     // Catch:{ all -> 0x2904 }
            X.8Jt r0 = new X.8Jt     // Catch:{ all -> 0x2904 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x2904 }
            r2.A09(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.mentions.MentionableEntry r0 = r1.A4P     // Catch:{ all -> 0x2904 }
            boolean r0 = X.C86634Kw.A1X(r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x1ecd
            boolean r0 = r1.A2Z(r3)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x1ecd
            r1.A1U(r3)     // Catch:{ all -> 0x2904 }
            X.5UY r0 = r1.A5e     // Catch:{ all -> 0x2904 }
            r0.A06(r13)     // Catch:{ all -> 0x2904 }
        L_0x1ecd:
            X.5Ag r51 = new X.5Ag     // Catch:{ all -> 0x2904 }
            r51.<init>()     // Catch:{ all -> 0x2904 }
            X.4eZ r35 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.4eZ r33 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.1VX r59 = A0E(r1)     // Catch:{ all -> 0x2904 }
            X.3Wi r37 = A07(r1)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.5Wv r72 = r0.getImeUtils()     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.2sr r39 = r0.getMeManager()     // Catch:{ all -> 0x2904 }
            X.2qk r0 = r1.A15     // Catch:{ all -> 0x2904 }
            r34 = r0
            X.5Ul r0 = r1.A1f     // Catch:{ all -> 0x2904 }
            r40 = r0
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.3Dh r36 = r0.getFMessageIO()     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.4FV r60 = r2.getWamRuntime()     // Catch:{ all -> 0x2904 }
            X.2iF r0 = r1.A22     // Catch:{ all -> 0x2904 }
            r45 = r0
            X.33m r41 = r2.getUserActions()     // Catch:{ all -> 0x2904 }
            X.5XF r0 = r1.A1y     // Catch:{ all -> 0x2904 }
            r44 = r0
            X.2fI r0 = r1.A4O     // Catch:{ all -> 0x2904 }
            r64 = r0
            X.2zf r58 = r2.getStorageUtils()     // Catch:{ all -> 0x2904 }
            X.1fd r0 = r1.A4L     // Catch:{ all -> 0x2904 }
            r63 = r0
            X.2PX r0 = r1.A26     // Catch:{ all -> 0x2904 }
            r46 = r0
            X.53r r0 = r1.A5W     // Catch:{ all -> 0x2904 }
            r74 = r0
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.33i r55 = r0.getSystemServices()     // Catch:{ all -> 0x2904 }
            X.2sq r0 = r1.A27     // Catch:{ all -> 0x2904 }
            r32 = r0
            X.2gq r0 = r1.A4l     // Catch:{ all -> 0x2904 }
            r22 = r0
            X.2s6 r0 = r1.A3F     // Catch:{ all -> 0x2904 }
            r21 = r0
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.2Xk r49 = r0.getContactAccessHelper()     // Catch:{ all -> 0x2904 }
            X.5ZR r56 = r0.getWaPermissionsHelper()     // Catch:{ all -> 0x2904 }
            X.33p r57 = r0.getWaSharedPreferences()     // Catch:{ all -> 0x2904 }
            X.5XO r0 = r1.A5V     // Catch:{ all -> 0x2904 }
            r20 = r0
            X.5Th r0 = r1.A1r     // Catch:{ all -> 0x2904 }
            r19 = r0
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.33g r43 = r0.getBusinessProfileManager()     // Catch:{ all -> 0x2904 }
            X.1id r71 = r0.getScreenLockStateProvider()     // Catch:{ all -> 0x2904 }
            X.2y5 r15 = r1.A4r     // Catch:{ all -> 0x2904 }
            X.676 r14 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.5mA r52 = r14.getMessageAudioPlayerProvider()     // Catch:{ all -> 0x2904 }
            X.4eZ r0 = r14.getActivity()     // Catch:{ all -> 0x2904 }
            X.3FF r2 = new X.3FF     // Catch:{ all -> 0x2904 }
            r2.<init>(r0)     // Catch:{ all -> 0x2904 }
            X.4uZ r12 = r1.A4J     // Catch:{ all -> 0x2904 }
            boolean r11 = r1.A6P     // Catch:{ all -> 0x2904 }
            com.whatsapp.KeyboardPopupLayout r10 = r1.A1a     // Catch:{ all -> 0x2904 }
            com.whatsapp.mentions.MentionableEntry r9 = r1.A4P     // Catch:{ all -> 0x2904 }
            X.94j r7 = r1.A4h     // Catch:{ all -> 0x2904 }
            com.whatsapp.community.ConversationCommunityViewModel r6 = r1.A2L     // Catch:{ all -> 0x2904 }
            X.9Rm r5 = r1.A4j     // Catch:{ all -> 0x2904 }
            X.9Tp r4 = r1.A4g     // Catch:{ all -> 0x2904 }
            X.5MZ r3 = r1.A43     // Catch:{ all -> 0x2904 }
            X.4fS r0 = new X.4fS     // Catch:{ all -> 0x2904 }
            r38 = r10
            r42 = r19
            r47 = r32
            r48 = r6
            r50 = r14
            r53 = r2
            r54 = r21
            r61 = r3
            r62 = r12
            r65 = r9
            r66 = r4
            r67 = r7
            r68 = r5
            r69 = r22
            r70 = r15
            r73 = r20
            r75 = r11
            r32 = r0
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75)     // Catch:{ all -> 0x2904 }
            r1.A2a = r0     // Catch:{ all -> 0x2904 }
            r2 = r107
            r2.add(r0)     // Catch:{ all -> 0x2904 }
            java.util.Set r0 = r1.A7K     // Catch:{ all -> 0x2904 }
            X.4fS r2 = r1.A2a     // Catch:{ all -> 0x2904 }
            r0.add(r2)     // Catch:{ all -> 0x2904 }
            java.util.Set r3 = r1.A7N     // Catch:{ all -> 0x2904 }
            X.4fS r2 = r1.A2a     // Catch:{ all -> 0x2904 }
            r3.add(r2)     // Catch:{ all -> 0x2904 }
            X.676 r3 = r1.A2z     // Catch:{ all -> 0x2904 }
            r2 = 2131429586(0x7f0b08d2, float:1.8480849E38)
            android.view.View r3 = r3.findViewById(r2)     // Catch:{ all -> 0x2904 }
            if (r3 == 0) goto L_0x2032
            X.1VX r4 = A0E(r1)     // Catch:{ all -> 0x2904 }
            r2 = 1416(0x588, float:1.984E-42)
            boolean r2 = r4.A0X(r2)     // Catch:{ all -> 0x2904 }
            if (r2 == 0) goto L_0x2032
            X.5DE r2 = r1.A1H     // Catch:{ all -> 0x2904 }
            com.whatsapp.mentions.MentionableEntry r6 = r1.A4P     // Catch:{ all -> 0x2904 }
            X.4uZ r5 = r1.A4J     // Catch:{ all -> 0x2904 }
            X.5sx r2 = r2.A00     // Catch:{ all -> 0x2904 }
            X.4as r4 = r2.A01     // Catch:{ all -> 0x2904 }
            android.app.Activity r4 = r4.A4W     // Catch:{ all -> 0x2904 }
            X.3Db r7 = r2.A03     // Catch:{ all -> 0x2904 }
            X.5Ul r35 = X.C86644Kx.A0L(r7)     // Catch:{ all -> 0x2904 }
            X.3Db r2 = r2.A03     // Catch:{ all -> 0x2904 }
            X.3Wi r34 = X.C64333Db.A04(r2)     // Catch:{ all -> 0x2904 }
            X.5ZR r38 = X.C64333Db.A2r(r2)     // Catch:{ all -> 0x2904 }
            X.53q r42 = r2.Ao7()     // Catch:{ all -> 0x2904 }
            X.3Ex r36 = X.C64333Db.A26(r2)     // Catch:{ all -> 0x2904 }
            X.5ZU r37 = X.C64333Db.A28(r2)     // Catch:{ all -> 0x2904 }
            X.5Y0 r39 = X.C64333Db.A3o(r2)     // Catch:{ all -> 0x2904 }
            X.4FV r40 = X.C64333Db.A4H(r2)     // Catch:{ all -> 0x2904 }
            X.5iA r2 = new X.5iA     // Catch:{ all -> 0x2904 }
            r41 = r5
            r43 = r6
            r32 = r2
            r33 = r4
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x2904 }
            X.5DF r4 = r1.A1I     // Catch:{ all -> 0x2904 }
            X.5sx r4 = r4.A00     // Catch:{ all -> 0x2904 }
            X.4as r5 = r4.A01     // Catch:{ all -> 0x2904 }
            android.app.Activity r5 = r5.A4W     // Catch:{ all -> 0x2904 }
            X.3Db r6 = r4.A03     // Catch:{ all -> 0x2904 }
            X.2sH r35 = X.C64333Db.A2p(r6)     // Catch:{ all -> 0x2904 }
            X.3Db r4 = r4.A03     // Catch:{ all -> 0x2904 }
            X.4FV r36 = X.C64333Db.A4H(r4)     // Catch:{ all -> 0x2904 }
            X.53q r37 = r4.Ao7()     // Catch:{ all -> 0x2904 }
            X.5fC r4 = new X.5fC     // Catch:{ all -> 0x2904 }
            r32 = r4
            r33 = r5
            r34 = r2
            r32.<init>(r33, r34, r35, r36, r37)     // Catch:{ all -> 0x2904 }
            r3.setOnDragListener(r4)     // Catch:{ all -> 0x2904 }
            r0.add(r2)     // Catch:{ all -> 0x2904 }
        L_0x2032:
            X.74P r37 = new X.74P     // Catch:{ all -> 0x2904 }
            r37.<init>()     // Catch:{ all -> 0x2904 }
            X.4uZ r6 = r1.A4J     // Catch:{ all -> 0x2904 }
            X.4eZ r33 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.3Wi r36 = A07(r1)     // Catch:{ all -> 0x2904 }
            X.4FS r42 = A0G(r1)     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.33i r38 = r2.getSystemServices()     // Catch:{ all -> 0x2904 }
            X.34u r5 = r1.A57     // Catch:{ all -> 0x2904 }
            X.4eZ r35 = A09(r1)     // Catch:{ all -> 0x2904 }
            com.whatsapp.conversation.ConversationListView r3 = r1.A2f     // Catch:{ all -> 0x2904 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x2904 }
            r2 = 40
            X.5sD r4 = new X.5sD     // Catch:{ all -> 0x2904 }
            r4.<init>((java.lang.Object) r3, (int) r2)     // Catch:{ all -> 0x2904 }
            com.whatsapp.KeyboardPopupLayout r3 = r1.A1a     // Catch:{ all -> 0x2904 }
            X.4fQ r2 = new X.4fQ     // Catch:{ all -> 0x2904 }
            r32 = r2
            r34 = r3
            r39 = r6
            r40 = r5
            r41 = r17
            r43 = r4
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x2904 }
            r1.A3E = r2     // Catch:{ all -> 0x2904 }
            r3 = r107
            r3.add(r2)     // Catch:{ all -> 0x2904 }
            X.4fQ r2 = r1.A3E     // Catch:{ all -> 0x2904 }
            X.3Cy r2 = r2.A02     // Catch:{ all -> 0x2904 }
            r0.add(r2)     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "lifecycle_callbacks_start"
            r1.A2F(r0)     // Catch:{ all -> 0x2904 }
            java.util.Iterator r4 = r107.iterator()     // Catch:{ all -> 0x2904 }
        L_0x2087:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x209b
            android.app.Application$ActivityLifecycleCallbacks r2 = X.C86664Kz.A0R(r4)     // Catch:{ all -> 0x2904 }
            X.4eZ r0 = A09(r1)     // Catch:{ all -> 0x2904 }
            r3 = r30
            r2.onActivityCreated(r0, r3)     // Catch:{ all -> 0x2904 }
            goto L_0x2087
        L_0x209b:
            java.lang.String r0 = "lifecycle_callbacks_end"
            r1.A2F(r0)     // Catch:{ all -> 0x2904 }
            X.4On r5 = A0A(r1)     // Catch:{ all -> 0x2904 }
            boolean r0 = A0Q(r1)     // Catch:{ all -> 0x2904 }
            r4 = 0
            if (r0 != 0) goto L_0x20f2
            boolean r0 = r1.A2U()     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x20f2
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            android.content.res.Resources r2 = r0.getResources()     // Catch:{ all -> 0x2904 }
            r0 = 2131166096(0x7f070390, float:1.7946428E38)
            int r3 = r2.getDimensionPixelSize(r0)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            android.content.res.Resources r2 = r0.getResources()     // Catch:{ all -> 0x2904 }
            r0 = 2131166095(0x7f07038f, float:1.7946426E38)
            int r0 = r2.getDimensionPixelSize(r0)     // Catch:{ all -> 0x2904 }
            int r3 = r3 * 2
            int r3 = r3 + r0
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            android.content.res.Resources r2 = r0.getResources()     // Catch:{ all -> 0x2904 }
            r0 = 2131167344(0x7f070870, float:1.7948959E38)
            int r3 = X.C86654Ky.A02(r2, r0, r3)     // Catch:{ all -> 0x2904 }
            android.util.DisplayMetrics r2 = new android.util.DisplayMetrics     // Catch:{ all -> 0x2904 }
            r2.<init>()     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            android.view.WindowManager r0 = r0.getWindowManager()     // Catch:{ all -> 0x2904 }
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch:{ all -> 0x2904 }
            r0.getMetrics(r2)     // Catch:{ all -> 0x2904 }
            int r0 = r2.widthPixels     // Catch:{ all -> 0x2904 }
            if (r0 <= r3) goto L_0x20f2
            r4 = 1
        L_0x20f2:
            r5.A0E = r4     // Catch:{ all -> 0x2904 }
            X.4eZ r2 = A09(r1)     // Catch:{ all -> 0x2904 }
            r0 = 2131427535(0x7f0b00cf, float:1.847669E38)
            android.view.View r0 = X.C005205m.A00(r2, r0)     // Catch:{ all -> 0x2904 }
            r1.A0B = r0     // Catch:{ all -> 0x2904 }
            X.C107295b4.A02(r0)     // Catch:{ all -> 0x2904 }
            android.view.View r3 = r1.A0B     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131895737(0x7f1225b9, float:1.9426315E38)
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x2904 }
            r3.setContentDescription(r0)     // Catch:{ all -> 0x2904 }
            X.4eZ r2 = A09(r1)     // Catch:{ all -> 0x2904 }
            r0 = 2131427536(0x7f0b00d0, float:1.8476691E38)
            X.C005205m.A00(r2, r0)     // Catch:{ all -> 0x2904 }
            X.3ZH r2 = r1.A3n     // Catch:{ all -> 0x2904 }
            r0 = r18
            com.whatsapp.jid.Jid r5 = r2.A0I(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5     // Catch:{ all -> 0x2904 }
            X.3ZH r0 = r1.A3n     // Catch:{ all -> 0x2904 }
            boolean r0 = r0.A0R()     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x218d
            if (r5 == 0) goto L_0x218d
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.0sD r4 = r0.getViewModelStoreOwner()     // Catch:{ all -> 0x2904 }
            X.8nL r0 = r1.A25     // Catch:{ all -> 0x2904 }
            X.5Qn r3 = r0.Azv(r5)     // Catch:{ all -> 0x2904 }
            X.5DG r2 = r1.A1J     // Catch:{ all -> 0x2904 }
            X.5ge r0 = new X.5ge     // Catch:{ all -> 0x2904 }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x2904 }
            X.0XL r2 = X.AnonymousClass4L0.A0F(r0, r4)     // Catch:{ all -> 0x2904 }
            java.lang.Class<X.4Tl> r0 = X.C87574Tl.class
            X.0Ty r0 = r2.A01(r0)     // Catch:{ all -> 0x2904 }
            X.4Tl r0 = (X.C87574Tl) r0     // Catch:{ all -> 0x2904 }
            r1.A1q = r0     // Catch:{ all -> 0x2904 }
            X.5Qn r0 = r0.A00     // Catch:{ all -> 0x2904 }
            X.0Wx r3 = r0.A03     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 198(0xc6, float:2.77E-43)
            X.AnonymousClass6C6.A02(r2, r3, r1, r0)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.0sD r2 = r0.getViewModelStoreOwner()     // Catch:{ all -> 0x2904 }
            X.8nE r0 = r1.A1v     // Catch:{ all -> 0x2904 }
            X.0Ty r0 = X.C86604Kt.A0L(r2, r0, r5)     // Catch:{ all -> 0x2904 }
            X.4Ty r0 = (X.C87604Ty) r0     // Catch:{ all -> 0x2904 }
            r1.A1w = r0     // Catch:{ all -> 0x2904 }
            X.08M r3 = r0.A00     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 199(0xc7, float:2.79E-43)
            X.AnonymousClass6C6.A02(r2, r3, r1, r0)     // Catch:{ all -> 0x2904 }
            X.4h0 r0 = new X.4h0     // Catch:{ all -> 0x2904 }
            r0.<init>(r1)     // Catch:{ all -> 0x2904 }
            r1.A1u = r0     // Catch:{ all -> 0x2904 }
            X.8qC r0 = r1.A5y     // Catch:{ all -> 0x2904 }
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x2904 }
            X.2zi r2 = (X.C61102zi) r2     // Catch:{ all -> 0x2904 }
            X.2UT r0 = r1.A1u     // Catch:{ all -> 0x2904 }
            r2.A06(r0)     // Catch:{ all -> 0x2904 }
        L_0x218d:
            X.4eZ r2 = A09(r1)     // Catch:{ all -> 0x2904 }
            r0 = 2131433254(0x7f0b1726, float:1.8488288E38)
            X.5UY r3 = X.AnonymousClass5UY.A01(r2, r0)     // Catch:{ all -> 0x2904 }
            r1.A5g = r3     // Catch:{ all -> 0x2904 }
            r2 = 11
            X.6B7 r0 = new X.6B7     // Catch:{ all -> 0x2904 }
            r0.<init>((X.C113245l7) r1, (int) r2)     // Catch:{ all -> 0x2904 }
            r3.A09(r0)     // Catch:{ all -> 0x2904 }
            r0 = 1
            r1.A2N(r0)     // Catch:{ all -> 0x2904 }
            X.5UY r3 = r1.A5g     // Catch:{ all -> 0x2904 }
            r2 = 4
            X.5eU r0 = new X.5eU     // Catch:{ all -> 0x2904 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x2904 }
            r3.A07(r0)     // Catch:{ all -> 0x2904 }
            X.4eZ r2 = A09(r1)     // Catch:{ all -> 0x2904 }
            r0 = 2131431816(0x7f0b1188, float:1.8485372E38)
            X.5UY r3 = X.AnonymousClass5UY.A01(r2, r0)     // Catch:{ all -> 0x2904 }
            r1.A5h = r3     // Catch:{ all -> 0x2904 }
            r2 = 10
            X.6B7 r0 = new X.6B7     // Catch:{ all -> 0x2904 }
            r0.<init>((X.C113245l7) r1, (int) r2)     // Catch:{ all -> 0x2904 }
            r3.A09(r0)     // Catch:{ all -> 0x2904 }
            X.5UY r3 = r1.A5h     // Catch:{ all -> 0x2904 }
            r2 = 5
            X.5eU r0 = new X.5eU     // Catch:{ all -> 0x2904 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x2904 }
            r3.A07(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.conversation.ConversationListView r2 = r1.A2f     // Catch:{ all -> 0x2904 }
            r0 = 1
            r2.setScrollbarFadingEnabled(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.conversation.ConversationListView r2 = r1.A2f     // Catch:{ all -> 0x2904 }
            android.widget.AbsListView$OnScrollListener r0 = r1.A6x     // Catch:{ all -> 0x2904 }
            r2.setOnScrollListener(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.mentions.MentionableEntry r2 = r1.A4P     // Catch:{ all -> 0x2904 }
            r0 = 1
            r2.setScrollbarFadingEnabled(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.mentions.MentionableEntry r2 = r1.A4P     // Catch:{ all -> 0x2904 }
            android.text.TextWatcher r0 = r1.A6t     // Catch:{ all -> 0x2904 }
            r2.addTextChangedListener(r0)     // Catch:{ all -> 0x2904 }
            boolean r0 = r1.A6T     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x2203
            X.33j r3 = r1.A3L     // Catch:{ all -> 0x2904 }
            com.whatsapp.mentions.MentionableEntry r0 = r1.A4P     // Catch:{ all -> 0x2904 }
            X.52O r2 = new X.52O     // Catch:{ all -> 0x2904 }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x2904 }
            r1.A5L = r2     // Catch:{ all -> 0x2904 }
            com.whatsapp.mentions.MentionableEntry r0 = r1.A4P     // Catch:{ all -> 0x2904 }
            r0.addTextChangedListener(r2)     // Catch:{ all -> 0x2904 }
        L_0x2203:
            boolean r0 = A0Q(r1)     // Catch:{ all -> 0x2904 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x2212
            com.whatsapp.mentions.MentionableEntry r2 = r1.A4P     // Catch:{ all -> 0x2904 }
            android.text.TextWatcher r0 = r1.A6r     // Catch:{ all -> 0x2904 }
            r2.addTextChangedListener(r0)     // Catch:{ all -> 0x2904 }
        L_0x2212:
            com.whatsapp.mentions.MentionableEntry r2 = r1.A4P     // Catch:{ all -> 0x2904 }
            android.widget.TextView$OnEditorActionListener r0 = r1.A6y     // Catch:{ all -> 0x2904 }
            r2.setOnEditorActionListener(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.mentions.MentionableEntry r2 = r1.A4P     // Catch:{ all -> 0x2904 }
            android.view.View$OnClickListener r0 = r1.A6v     // Catch:{ all -> 0x2904 }
            r2.setOnClickListener(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.mentions.MentionableEntry r2 = r1.A4P     // Catch:{ all -> 0x2904 }
            r0 = 41
            X.5sD r0 = X.C117615sD.A00(r1, r0)     // Catch:{ all -> 0x2904 }
            r2.setupEnterIsSend(r0)     // Catch:{ all -> 0x2904 }
            r2 = 6
            r0 = r16
            X.C18290x4.A1G(r0, r1, r2)     // Catch:{ all -> 0x2904 }
            com.whatsapp.mentions.MentionableEntry r0 = r1.A4P     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = X.C18290x4.A0m(r0)     // Catch:{ all -> 0x2904 }
            boolean r2 = X.C107575bX.A0F(r0)     // Catch:{ all -> 0x2904 }
            r1.A6a = r2     // Catch:{ all -> 0x2904 }
            X.4VH r0 = r1.A38     // Catch:{ all -> 0x2904 }
            r0.A0G(r2)     // Catch:{ all -> 0x2904 }
            X.4Uw r0 = r1.A3C     // Catch:{ all -> 0x2904 }
            r0.A0E(r2)     // Catch:{ all -> 0x2904 }
            if (r2 != 0) goto L_0x2258
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.8vZ r4 = r0.getQuickPerformanceLogger()     // Catch:{ all -> 0x2904 }
            java.lang.String r3 = "composer_has_text"
            r2 = 703926750(0x29f511de, float:1.0883285E-13)
            r0 = 1
            r4.markerAnnotate((int) r2, (java.lang.String) r3, (boolean) r0)     // Catch:{ all -> 0x2904 }
        L_0x2258:
            X.1VX r2 = r1.A41     // Catch:{ all -> 0x2904 }
            r0 = 3403(0xd4b, float:4.769E-42)
            boolean r0 = r2.A0X(r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x22b1
            X.10k r0 = r1.A5C     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x229e
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.0sD r4 = r0.getViewModelStoreOwner()     // Catch:{ all -> 0x2904 }
            X.1VX r3 = r1.A41     // Catch:{ all -> 0x2904 }
            X.2QZ r2 = r1.A5F     // Catch:{ all -> 0x2904 }
            X.3Ad r0 = new X.3Ad     // Catch:{ all -> 0x2904 }
            r0.<init>(r3, r2)     // Catch:{ all -> 0x2904 }
            X.0XL r2 = X.AnonymousClass4L0.A0F(r0, r4)     // Catch:{ all -> 0x2904 }
            java.lang.Class<X.10k> r0 = X.AnonymousClass10k.class
            X.0Ty r2 = r2.A01(r0)     // Catch:{ all -> 0x2904 }
            X.10k r2 = (X.AnonymousClass10k) r2     // Catch:{ all -> 0x2904 }
            r1.A5C = r2     // Catch:{ all -> 0x2904 }
            X.7rM r0 = r1.A5H     // Catch:{ all -> 0x2904 }
            r0.A01 = r2     // Catch:{ all -> 0x2904 }
            X.3Wi r3 = A07(r1)     // Catch:{ all -> 0x2904 }
            X.10k r2 = r1.A5C     // Catch:{ all -> 0x2904 }
            X.5Nu r0 = new X.5Nu     // Catch:{ all -> 0x2904 }
            r0.<init>(r3, r2)     // Catch:{ all -> 0x2904 }
            r1.A5E = r0     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            com.whatsapp.emoji.search.EmojiSearchProvider r2 = r0.getEmojiSearchProvider()     // Catch:{ all -> 0x2904 }
            r0 = 0
            r2.A01(r0)     // Catch:{ all -> 0x2904 }
        L_0x229e:
            boolean r0 = r1.A2X()     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x22b1
            X.10k r0 = r1.A5C     // Catch:{ all -> 0x2904 }
            X.08M r3 = r0.A03     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 202(0xca, float:2.83E-43)
            X.AnonymousClass6C6.A02(r2, r3, r1, r0)     // Catch:{ all -> 0x2904 }
        L_0x22b1:
            boolean r0 = r1.A2X()     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x23a3
            X.4eZ r2 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.1VX r0 = r1.A41     // Catch:{ all -> 0x2904 }
            android.widget.ImageButton r4 = X.AnonymousClass5V8.A00(r2, r0)     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "emojiPopup_start"
            r1.A2F(r0)     // Catch:{ all -> 0x2904 }
            X.5PB r3 = r1.A44     // Catch:{ all -> 0x2904 }
            X.4eZ r0 = A09(r1)     // Catch:{ all -> 0x2904 }
            r3.A00 = r0     // Catch:{ all -> 0x2904 }
            com.whatsapp.KeyboardPopupLayout r2 = r1.A1a     // Catch:{ all -> 0x2904 }
            com.whatsapp.mentions.MentionableEntry r0 = r1.A4P     // Catch:{ all -> 0x2904 }
            r3.A02 = r2     // Catch:{ all -> 0x2904 }
            r3.A01 = r4     // Catch:{ all -> 0x2904 }
            r3.A03 = r0     // Catch:{ all -> 0x2904 }
            X.5RE r0 = r1.A3X     // Catch:{ all -> 0x2904 }
            X.AnonymousClass5PB.A00(r0, r3)     // Catch:{ all -> 0x2904 }
            boolean r0 = A0Q(r1)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x22ed
            X.1VX r2 = r1.A41     // Catch:{ all -> 0x2904 }
            r0 = 6110(0x17de, float:8.562E-42)
            boolean r0 = r2.A0X(r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x2318
        L_0x22ed:
            X.5PB r9 = r1.A44     // Catch:{ all -> 0x2904 }
            X.5RE r0 = r1.A3X     // Catch:{ all -> 0x2904 }
            X.10k r7 = r1.A5C     // Catch:{ all -> 0x2904 }
            X.7rM r2 = r1.A5H     // Catch:{ all -> 0x2904 }
            X.5RA r2 = r0.A01(r7, r2)     // Catch:{ all -> 0x2904 }
            r9.A07 = r2     // Catch:{ all -> 0x2904 }
            X.2sn r6 = r0.A0I     // Catch:{ all -> 0x2904 }
            X.33O r5 = r0.A0G     // Catch:{ all -> 0x2904 }
            X.2mV r4 = r0.A0K     // Catch:{ all -> 0x2904 }
            X.5LY r3 = r0.A05     // Catch:{ all -> 0x2904 }
            X.2gE r2 = r0.A0J     // Catch:{ all -> 0x2904 }
            X.5Qz r0 = new X.5Qz     // Catch:{ all -> 0x2904 }
            r14 = r0
            r15 = r3
            r16 = r5
            r17 = r6
            r18 = r2
            r19 = r7
            r20 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x2904 }
            r9.A04 = r0     // Catch:{ all -> 0x2904 }
        L_0x2318:
            X.5PB r0 = r1.A44     // Catch:{ all -> 0x2904 }
            X.4qq r2 = r0.A01()     // Catch:{ all -> 0x2904 }
            r1.A45 = r2     // Catch:{ all -> 0x2904 }
            X.2aG r0 = r1.A5T     // Catch:{ all -> 0x2904 }
            r2.A0D = r0     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            android.widget.PopupWindow$OnDismissListener r0 = r0.getOnPopupWindowDismissListener()     // Catch:{ all -> 0x2904 }
            r2.setOnDismissListener(r0)     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.4FV r38 = r2.getWamRuntime()     // Catch:{ all -> 0x2904 }
            X.2r8 r9 = r1.A49     // Catch:{ all -> 0x2904 }
            r0 = 2131430353(0x7f0b0bd1, float:1.8482405E38)
            android.view.View r7 = r2.findViewById(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.gifsearch.GifSearchContainer r7 = (com.whatsapp.gifsearch.GifSearchContainer) r7     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131429717(0x7f0b0955, float:1.8481115E38)
            android.view.View r6 = r2.findViewById(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.emoji.search.EmojiSearchContainer r6 = (com.whatsapp.emoji.search.EmojiSearchContainer) r6     // Catch:{ all -> 0x2904 }
            X.4qq r5 = r1.A45     // Catch:{ all -> 0x2904 }
            X.4eZ r33 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.5Y0 r36 = r0.getEmojiLoader()     // Catch:{ all -> 0x2904 }
            X.1ej r4 = r1.A3t     // Catch:{ all -> 0x2904 }
            X.33j r3 = r1.A3L     // Catch:{ all -> 0x2904 }
            X.2y5 r2 = r1.A4r     // Catch:{ all -> 0x2904 }
            X.4qu r0 = new X.4qu     // Catch:{ all -> 0x2904 }
            r32 = r0
            r34 = r3
            r35 = r4
            r37 = r6
            r39 = r5
            r40 = r7
            r41 = r9
            r42 = r2
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x2904 }
            r1.A46 = r0     // Catch:{ all -> 0x2904 }
            X.5pX r3 = r1.A4o     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.4qq r0 = r1.A45     // Catch:{ all -> 0x2904 }
            r3.A01(r0, r2)     // Catch:{ all -> 0x2904 }
            X.4qq r2 = r1.A45     // Catch:{ all -> 0x2904 }
            X.4CE r0 = r1.A70     // Catch:{ all -> 0x2904 }
            r2.A0C(r0)     // Catch:{ all -> 0x2904 }
            r0 = 23
            X.5sD r0 = X.C117615sD.A00(r1, r0)     // Catch:{ all -> 0x2904 }
            r2.A0E = r0     // Catch:{ all -> 0x2904 }
            X.8GS r0 = new X.8GS     // Catch:{ all -> 0x2904 }
            r0.<init>(r1)     // Catch:{ all -> 0x2904 }
            r2.A0A = r0     // Catch:{ all -> 0x2904 }
            X.4BP r0 = r1.A7G     // Catch:{ all -> 0x2904 }
            r2.A0J(r0)     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "emojiPopup_end"
            r1.A2F(r0)     // Catch:{ all -> 0x2904 }
            X.4qu r2 = r1.A46     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            r2.A00 = r0     // Catch:{ all -> 0x2904 }
            r2.A00 = r0     // Catch:{ all -> 0x2904 }
        L_0x23a3:
            X.5pX r2 = r1.A4o     // Catch:{ all -> 0x2904 }
            X.93Z r0 = new X.93Z     // Catch:{ all -> 0x2904 }
            r0.<init>(r1, r13)     // Catch:{ all -> 0x2904 }
            r2.A01 = r0     // Catch:{ all -> 0x2904 }
            X.4BP r0 = r1.A7G     // Catch:{ all -> 0x2904 }
            r2.A04 = r0     // Catch:{ all -> 0x2904 }
            com.whatsapp.mentions.MentionableEntry r3 = r1.A4P     // Catch:{ all -> 0x2904 }
            android.content.Context r0 = r3.getContext()     // Catch:{ all -> 0x2904 }
            float r4 = X.C86604Kt.A00(r0)     // Catch:{ all -> 0x2904 }
            r0 = 1069547520(0x3fc00000, float:1.5)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r2 = 6
            if (r0 >= 0) goto L_0x23c9
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r2 = 4
            if (r0 < 0) goto L_0x23c9
            r2 = 5
        L_0x23c9:
            r3.setMaxLines(r2)     // Catch:{ all -> 0x2904 }
            X.4xc r2 = r1.A5s     // Catch:{ all -> 0x2904 }
            X.8uW r0 = r1.A7I     // Catch:{ all -> 0x2904 }
            r2.A06(r0)     // Catch:{ all -> 0x2904 }
            X.1VX r2 = r1.A41     // Catch:{ all -> 0x2904 }
            r0 = 6989(0x1b4d, float:9.794E-42)
            boolean r0 = r2.A0X(r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x23e8
            X.5TW r0 = r1.A2E     // Catch:{ all -> 0x2904 }
            boolean r0 = r0.A03()     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x23e8
            r1.A11()     // Catch:{ all -> 0x2904 }
        L_0x23e8:
            X.4xf r2 = r1.A5p     // Catch:{ all -> 0x2904 }
            X.5UH r0 = r1.A7H     // Catch:{ all -> 0x2904 }
            r2.A06(r0)     // Catch:{ all -> 0x2904 }
            X.4xe r2 = r1.A2r     // Catch:{ all -> 0x2904 }
            X.7fY r0 = r1.A74     // Catch:{ all -> 0x2904 }
            r2.A06(r0)     // Catch:{ all -> 0x2904 }
            X.4xY r2 = r1.A5n     // Catch:{ all -> 0x2904 }
            X.5G7 r0 = r1.A77     // Catch:{ all -> 0x2904 }
            r2.A06(r0)     // Catch:{ all -> 0x2904 }
            X.1iW r2 = r1.A4a     // Catch:{ all -> 0x2904 }
            X.2Ub r0 = r1.A7D     // Catch:{ all -> 0x2904 }
            r2.A06(r0)     // Catch:{ all -> 0x2904 }
            X.1ia r2 = r1.A1s     // Catch:{ all -> 0x2904 }
            X.4CK r0 = r1.A71     // Catch:{ all -> 0x2904 }
            r2.A06(r0)     // Catch:{ all -> 0x2904 }
            X.1ih r2 = r1.A59     // Catch:{ all -> 0x2904 }
            X.2sh r0 = r1.A7F     // Catch:{ all -> 0x2904 }
            r2.A06(r0)     // Catch:{ all -> 0x2904 }
            X.7rM r0 = r1.A5H     // Catch:{ all -> 0x2904 }
            X.1ih r2 = r0.A0B     // Catch:{ all -> 0x2904 }
            X.2sh r0 = r0.A09     // Catch:{ all -> 0x2904 }
            r2.A06(r0)     // Catch:{ all -> 0x2904 }
            X.4xh r2 = r1.A5G     // Catch:{ all -> 0x2904 }
            X.2Fh r0 = r1.A76     // Catch:{ all -> 0x2904 }
            r2.A06(r0)     // Catch:{ all -> 0x2904 }
            X.1if r2 = r1.A4e     // Catch:{ all -> 0x2904 }
            X.2uu r0 = r1.A75     // Catch:{ all -> 0x2904 }
            r2.A06(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.tosgating.viewmodel.ToSGatingViewModel r0 = r1.A5P     // Catch:{ all -> 0x2904 }
            X.08M r3 = r0.A01     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 219(0xdb, float:3.07E-43)
            X.C86604Kt.A1N(r2, r3, r1, r0)     // Catch:{ all -> 0x2904 }
            boolean r0 = X.AnonymousClass5XU.A00()     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x2484
            java.lang.String r0 = "conversation/device-not-supported"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            com.whatsapp.DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment r0 = new com.whatsapp.DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment     // Catch:{ all -> 0x2904 }
            r0.<init>()     // Catch:{ all -> 0x2904 }
            r2.Boo(r0)     // Catch:{ all -> 0x2904 }
        L_0x244b:
            X.4VQ r0 = r1.A3B     // Catch:{ all -> 0x2904 }
            X.4eZ r3 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.5dw r5 = r8.A05     // Catch:{ all -> 0x2904 }
            X.5G5 r2 = r0.A0e     // Catch:{ all -> 0x2904 }
            java.util.HashMap r4 = r2.A00     // Catch:{ all -> 0x2904 }
            X.4uZ r2 = r0.A0x     // Catch:{ all -> 0x2904 }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ all -> 0x2904 }
            X.34x r4 = (X.C624134x) r4     // Catch:{ all -> 0x2904 }
            if (r5 == 0) goto L_0x24ce
            X.33C r4 = new X.33C     // Catch:{ all -> 0x2904 }
            r4.<init>()     // Catch:{ all -> 0x2904 }
            java.io.File r2 = r8.A0B     // Catch:{ all -> 0x2904 }
            r4.A0F = r2     // Catch:{ all -> 0x2904 }
            X.5JG r2 = new X.5JG     // Catch:{ all -> 0x2904 }
            r2.<init>(r4, r5, r8, r0)     // Catch:{ all -> 0x2904 }
            X.4FS r5 = r0.A1E     // Catch:{ all -> 0x2904 }
            X.53r r6 = r0.A12     // Catch:{ all -> 0x2904 }
            X.54a r0 = new X.54a     // Catch:{ all -> 0x2904 }
            r0.<init>(r3, r2, r6)     // Catch:{ all -> 0x2904 }
            r2 = 1
            java.io.File[] r3 = new java.io.File[r2]     // Catch:{ all -> 0x2904 }
            java.io.File r2 = r4.A0F     // Catch:{ all -> 0x2904 }
            r3[r13] = r2     // Catch:{ all -> 0x2904 }
            r5.BkL(r0, r3)     // Catch:{ all -> 0x2904 }
            goto L_0x250b
        L_0x2484:
            X.5XU r0 = r1.A1d     // Catch:{ all -> 0x2904 }
            boolean r0 = r0.A03()     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x249d
            java.lang.String r0 = "conversation/clock-wrong"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x2904 }
            X.4eZ r3 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.3Lt r2 = r1.A4R     // Catch:{ all -> 0x2904 }
            X.33b r0 = r1.A4U     // Catch:{ all -> 0x2904 }
            X.C621533t.A02(r3, r2, r0)     // Catch:{ all -> 0x2904 }
            goto L_0x244b
        L_0x249d:
            X.5XU r0 = r1.A1d     // Catch:{ all -> 0x2904 }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x24b6
            java.lang.String r0 = "conversation/software-expired"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x2904 }
            X.4eZ r3 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.3Lt r2 = r1.A4R     // Catch:{ all -> 0x2904 }
            X.33b r0 = r1.A4U     // Catch:{ all -> 0x2904 }
            X.C621533t.A03(r3, r2, r0)     // Catch:{ all -> 0x2904 }
            goto L_0x244b
        L_0x24b6:
            X.5Z4 r0 = r1.A1g     // Catch:{ all -> 0x2904 }
            int r0 = r0.A01()     // Catch:{ all -> 0x2904 }
            if (r0 <= 0) goto L_0x244b
            java.lang.String r0 = "conversation/software-about-to-expire"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x2904 }
            X.4eZ r2 = A09(r1)     // Catch:{ all -> 0x2904 }
            r0 = 115(0x73, float:1.61E-43)
            X.C621433s.A01(r2, r0)     // Catch:{ all -> 0x2904 }
            goto L_0x244b
        L_0x24ce:
            if (r4 == 0) goto L_0x24df
            long r2 = r4.A1L     // Catch:{ all -> 0x2904 }
            X.2qz r5 = r0.A11     // Catch:{ all -> 0x2509 }
            X.34x r2 = X.C55122pp.A00(r5, r2)     // Catch:{ all -> 0x2509 }
            if (r2 == 0) goto L_0x24db
            r4 = r2
        L_0x24db:
            r0.A0S(r4)     // Catch:{ all -> 0x2904 }
            goto L_0x250b
        L_0x24df:
            X.1fJ r6 = r8.A09     // Catch:{ all -> 0x2904 }
            if (r6 == 0) goto L_0x24fa
            X.2sH r2 = r0.A0i     // Catch:{ all -> 0x2904 }
            long r2 = r2.A0H()     // Catch:{ all -> 0x2904 }
            java.lang.String r5 = r8.A0I     // Catch:{ all -> 0x2904 }
            java.lang.String r4 = r8.A0H     // Catch:{ all -> 0x2904 }
            X.1nT r3 = X.C385328b.A00(r6, r5, r4, r2)     // Catch:{ all -> 0x2904 }
            r2 = r23
            r3.A1Z(r2)     // Catch:{ all -> 0x2904 }
        L_0x24f6:
            r0.A0S(r3)     // Catch:{ all -> 0x2904 }
            goto L_0x250b
        L_0x24fa:
            java.lang.Long r2 = r8.A0C     // Catch:{ all -> 0x2904 }
            if (r2 == 0) goto L_0x250b
            long r2 = r2.longValue()     // Catch:{ all -> 0x2904 }
            X.2qz r4 = r0.A11     // Catch:{ all -> 0x2509 }
            X.34x r3 = X.C55122pp.A00(r4, r2)     // Catch:{ all -> 0x2509 }
            goto L_0x24f6
        L_0x2509:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x2904 }
        L_0x250b:
            if (r109 == 0) goto L_0x251b
            java.lang.String r2 = "keyboard_visible"
            r0 = r30
            boolean r0 = r0.getBoolean(r2)     // Catch:{ all -> 0x2904 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x2904 }
            r1.A69 = r0     // Catch:{ all -> 0x2904 }
        L_0x251b:
            r26.A07()     // Catch:{ all -> 0x2904 }
            X.0XL r2 = A06(r1)     // Catch:{ all -> 0x2904 }
            r0 = r25
            X.0Ty r0 = r2.A01(r0)     // Catch:{ all -> 0x2904 }
            X.94j r0 = (X.C1901794j) r0     // Catch:{ all -> 0x2904 }
            r1.A4h = r0     // Catch:{ all -> 0x2904 }
            X.4On r4 = A0A(r1)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.5JR r3 = r0.getFirstDrawMonitor()     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.5ND r2 = r0.getInteractionPerfTracker()     // Catch:{ all -> 0x2904 }
            X.5OW r0 = r1.A33     // Catch:{ all -> 0x2904 }
            r4.A0B = r3     // Catch:{ all -> 0x2904 }
            r4.A0A = r2     // Catch:{ all -> 0x2904 }
            r4.A09 = r0     // Catch:{ all -> 0x2904 }
            android.os.Bundle r2 = r8.A04     // Catch:{ all -> 0x2904 }
            if (r2 == 0) goto L_0x25f3
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x2904 }
            r1.A69 = r0     // Catch:{ all -> 0x2904 }
            boolean r0 = r1.A2S()     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x2566
            r4 = 53
            com.whatsapp.invites.PromptSendGroupInviteDialogFragment r3 = new com.whatsapp.invites.PromptSendGroupInviteDialogFragment     // Catch:{ all -> 0x2904 }
            r3.<init>()     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "invite_intent_code"
            r2.putInt(r0, r4)     // Catch:{ all -> 0x2904 }
            r3.A0u(r2)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0.Boo(r3)     // Catch:{ all -> 0x2904 }
        L_0x2566:
            X.1VX r3 = r1.A41     // Catch:{ all -> 0x2904 }
            r0 = 4136(0x1028, float:5.796E-42)
            boolean r0 = r3.A0X(r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x2598
            r0 = r27
            boolean r0 = r2.containsKey(r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x2598
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x2904 }
            r0 = 33
            if (r3 >= r0) goto L_0x2587
            r0 = r27
            android.os.Parcelable r3 = r2.getParcelable(r0)     // Catch:{ all -> 0x2904 }
            android.content.Intent r3 = (android.content.Intent) r3     // Catch:{ all -> 0x2904 }
            goto L_0x2591
        L_0x2587:
            java.lang.Class<android.content.Intent> r3 = android.content.Intent.class
            r0 = r27
            java.lang.Object r3 = r2.getParcelable(r0, r3)     // Catch:{ all -> 0x2904 }
            android.content.Intent r3 = (android.content.Intent) r3     // Catch:{ all -> 0x2904 }
        L_0x2591:
            if (r3 == 0) goto L_0x2598
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0.startActivity(r3)     // Catch:{ all -> 0x2904 }
        L_0x2598:
            r0 = r28
            boolean r0 = r2.containsKey(r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x25b7
            X.4eZ r0 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.0zH r3 = X.AnonymousClass5V0.A00(r0)     // Catch:{ all -> 0x2904 }
            r0 = r28
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x2904 }
            r3.A0g(r0)     // Catch:{ all -> 0x2904 }
            X.C19340zH.A06(r3)     // Catch:{ all -> 0x2904 }
            r3.A0S()     // Catch:{ all -> 0x2904 }
        L_0x25b7:
            r0 = r29
            boolean r0 = r2.containsKey(r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x25f3
            r0 = r29
            android.os.Bundle r0 = r2.getBundle(r0)     // Catch:{ all -> 0x2904 }
            java.util.List r18 = X.C107395bF.A04(r0)     // Catch:{ all -> 0x2904 }
            if (r18 == 0) goto L_0x25f3
            boolean r0 = r18.isEmpty()     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x25f3
            X.4FS r3 = r1.A5i     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x2904 }
            java.util.ArrayList r17 = X.AnonymousClass002.A0J(r0)     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "include_captions"
            boolean r19 = r2.getBoolean(r0, r13)     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "appended_message"
            java.lang.String r16 = r2.getString(r0)     // Catch:{ all -> 0x2904 }
            X.54M r0 = new X.54M     // Catch:{ all -> 0x2904 }
            r14 = r0
            r15 = r1
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x2904 }
            X.AnonymousClass0x7.A1B(r0, r3)     // Catch:{ all -> 0x2904 }
        L_0x25f3:
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.2lX r2 = r0.getSuspensionManager()     // Catch:{ all -> 0x2904 }
            X.3ZH r0 = r1.A3n     // Catch:{ all -> 0x2904 }
            boolean r0 = r2.A01(r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x263c
            X.3ZH r2 = r1.A3n     // Catch:{ all -> 0x2904 }
            r0 = r24
            com.whatsapp.jid.Jid r6 = r2.A0I(r0)     // Catch:{ all -> 0x2904 }
            X.1fJ r6 = (X.C27991fJ) r6     // Catch:{ all -> 0x2904 }
            X.C626936e.A06(r6)     // Catch:{ all -> 0x2904 }
            X.5GK r2 = r1.A4C     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.2sj r0 = r0.getGroupParticipantsManager()     // Catch:{ all -> 0x2904 }
            boolean r5 = r0.A0C(r6)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.2sj r0 = r0.getGroupParticipantsManager()     // Catch:{ all -> 0x2904 }
            boolean r4 = r0.A0D(r6)     // Catch:{ all -> 0x2904 }
            X.68d r3 = new X.68d     // Catch:{ all -> 0x2904 }
            r3.<init>(r1, r13)     // Catch:{ all -> 0x2904 }
            X.1VX r2 = r2.A00     // Catch:{ all -> 0x2904 }
            r0 = 3180(0xc6c, float:4.456E-42)
            boolean r0 = r2.A0X(r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x2747
            com.whatsapp.groupenforcements.ui.GroupSuspendBottomSheet r2 = com.whatsapp.groupenforcements.ui.GroupSuspendBottomSheet.A00(r3, r6, r5, r4)     // Catch:{ all -> 0x2904 }
        L_0x2637:
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0.Boo(r2)     // Catch:{ all -> 0x2904 }
        L_0x263c:
            X.4uZ r3 = r1.A4J     // Catch:{ all -> 0x2904 }
            if (r3 == 0) goto L_0x2665
            X.2ss r2 = r1.A3d     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.3Ex r0 = r0.getContactManager()     // Catch:{ all -> 0x2904 }
            int r2 = X.AnonymousClass352.A00(r0, r2, r3)     // Catch:{ all -> 0x2904 }
            X.33j r0 = r1.A3L     // Catch:{ all -> 0x2904 }
            java.lang.String r3 = X.AnonymousClass352.A02(r0, r2)     // Catch:{ all -> 0x2904 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x2665
            X.4eZ r2 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.33i r0 = r0.getSystemServices()     // Catch:{ all -> 0x2904 }
            X.C107295b4.A00(r2, r0, r3)     // Catch:{ all -> 0x2904 }
        L_0x2665:
            X.33p r0 = A0D(r1)     // Catch:{ all -> 0x2904 }
            android.content.SharedPreferences r2 = X.AnonymousClass0x2.A0F(r0)     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "ptt_fast_playback_player_state"
            int r0 = r2.getInt(r0, r13)     // Catch:{ all -> 0x2904 }
            X.C116095pj.A12 = r0     // Catch:{ all -> 0x2904 }
            android.content.Intent r3 = A01(r1)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.9U4 r0 = r0.getPaymentsManager()     // Catch:{ all -> 0x2904 }
            X.9oC r0 = r0.A0G()     // Catch:{ all -> 0x2904 }
            X.9TY r2 = r0.B9X()     // Catch:{ all -> 0x2904 }
            if (r2 != 0) goto L_0x2715
            java.lang.String r0 = "PAY: BrazilSMBPaymentActivity/shouldShowUpsell : paymentsMerchantUpsellHelper is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x2904 }
        L_0x268e:
            X.3LP r2 = r1.A42     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            boolean r0 = X.C57362tW.A00(r2, r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x26ba
            X.33p r0 = A0D(r1)     // Catch:{ all -> 0x2904 }
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r0)     // Catch:{ all -> 0x2904 }
            java.lang.String r3 = "wac_intro_shown"
            boolean r0 = r0.getBoolean(r3, r13)     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x26ba
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            com.whatsapp.WAChatIntroBottomSheet r0 = new com.whatsapp.WAChatIntroBottomSheet     // Catch:{ all -> 0x2904 }
            r0.<init>()     // Catch:{ all -> 0x2904 }
            r2.Boo(r0)     // Catch:{ all -> 0x2904 }
            X.33p r2 = A0D(r1)     // Catch:{ all -> 0x2904 }
            r0 = 1
            X.C18270x1.A0v(r2, r3, r0)     // Catch:{ all -> 0x2904 }
        L_0x26ba:
            java.lang.String r2 = r8.A0J     // Catch:{ all -> 0x2904 }
            if (r2 == 0) goto L_0x26d2
            X.2Zm r4 = r1.A4G     // Catch:{ all -> 0x2904 }
            X.676 r3 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 1
            X.C162457s7.A0J(r3, r0)     // Catch:{ all -> 0x2904 }
            org.json.JSONObject r0 = X.AnonymousClass0x9.A1H(r2)     // Catch:{ all -> 0x2904 }
            X.2mj r2 = X.AnonymousClass27W.A00(r0)     // Catch:{ all -> 0x2904 }
            r0 = 1
            r4.A00(r3, r2, r0)     // Catch:{ all -> 0x2904 }
        L_0x26d2:
            android.widget.LinearLayout r3 = r1.A0k     // Catch:{ all -> 0x2904 }
            if (r3 == 0) goto L_0x26e3
            boolean r0 = r1.A6K     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x26e3
            r2 = 3
            X.691 r0 = new X.691     // Catch:{ all -> 0x2904 }
            r0.<init>((X.C113245l7) r1, (int) r2)     // Catch:{ all -> 0x2904 }
            r3.addOnLayoutChangeListener(r0)     // Catch:{ all -> 0x2904 }
        L_0x26e3:
            X.1VX r2 = r1.A41     // Catch:{ all -> 0x2904 }
            X.C162457s7.A0J(r2, r13)     // Catch:{ all -> 0x2904 }
            r0 = 4268(0x10ac, float:5.981E-42)
            boolean r0 = r2.A0X(r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x2712
            X.4eZ r2 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.1VX r0 = r1.A41     // Catch:{ all -> 0x2904 }
            android.widget.ImageButton r0 = X.AnonymousClass5V8.A00(r2, r0)     // Catch:{ all -> 0x2904 }
        L_0x26fa:
            r1.A0h = r0     // Catch:{ all -> 0x2904 }
            r1.A1J()     // Catch:{ all -> 0x2904 }
            boolean r3 = r1.A6G     // Catch:{ all -> 0x2904 }
            android.content.Intent r2 = A01(r1)     // Catch:{ all -> 0x2904 }
            X.4eZ r4 = A09(r1)     // Catch:{ all -> 0x2904 }
            r0 = 1
            X.C162457s7.A0J(r2, r0)     // Catch:{ all -> 0x2904 }
            r0 = 2
            X.C162457s7.A0J(r4, r0)     // Catch:{ all -> 0x2904 }
            goto L_0x274d
        L_0x2712:
            android.widget.ImageButton r0 = r1.A0g     // Catch:{ all -> 0x2904 }
            goto L_0x26fa
        L_0x2715:
            if (r3 == 0) goto L_0x268e
            java.lang.String r0 = "extra_merchant_upsell_enabled"
            boolean r0 = r3.getBooleanExtra(r0, r13)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x268e
            boolean r0 = r2.A01()     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x268e
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            X.9U4 r0 = r0.getPaymentsManager()     // Catch:{ all -> 0x2904 }
            X.9oC r0 = r0.A0G()     // Catch:{ all -> 0x2904 }
            X.9TY r3 = r0.B9X()     // Catch:{ all -> 0x2904 }
            X.C626936e.A06(r3)     // Catch:{ all -> 0x2904 }
            X.4eZ r2 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.4eZ r0 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.043 r0 = r3.A00(r2, r0)     // Catch:{ all -> 0x2904 }
            r0.show()     // Catch:{ all -> 0x2904 }
            goto L_0x268e
        L_0x2747:
            com.whatsapp.groupenforcements.ui.CreateGroupSuspendDialog r2 = com.whatsapp.groupenforcements.ui.CreateGroupSuspendDialog.A00(r6, r5)     // Catch:{ all -> 0x2904 }
            goto L_0x2637
        L_0x274d:
            if (r3 != 0) goto L_0x2771
            java.lang.String r0 = "show_expired_newsletter_message_dialog"
            boolean r0 = r2.getBooleanExtra(r0, r13)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x275e
            r3 = 2131894648(0x7f122178, float:1.9424107E38)
            r2 = 2131894647(0x7f122177, float:1.9424105E38)
            goto L_0x276c
        L_0x275e:
            java.lang.String r0 = "show_revoked_newsletter_message_dialog"
            boolean r0 = r2.getBooleanExtra(r0, r13)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x2771
            r3 = 2131894652(0x7f12217c, float:1.9424115E38)
            r2 = 2131894651(0x7f12217b, float:1.9424113E38)
        L_0x276c:
            java.lang.Object[] r0 = new java.lang.Object[r13]     // Catch:{ all -> 0x2904 }
            r4.Box(r0, r3, r2)     // Catch:{ all -> 0x2904 }
        L_0x2771:
            X.3ZH r0 = r1.A3n     // Catch:{ all -> 0x2904 }
            boolean r0 = r0.A0T()     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x2781
            X.1VX r0 = r1.A41     // Catch:{ all -> 0x2904 }
            boolean r0 = X.AnonymousClass75P.A00(r0)     // Catch:{ all -> 0x2904 }
            goto L_0x280e
        L_0x2781:
            X.66o r2 = X.AnonymousClass5KY.A00(r1)     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r1.A4J     // Catch:{ all -> 0x2904 }
            boolean r0 = r2.BH2(r0)     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x2808
            X.1VX r2 = r1.A41     // Catch:{ all -> 0x2904 }
            r0 = 5794(0x16a2, float:8.119E-42)
            boolean r0 = r2.A0X(r0)     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x2810
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131429713(0x7f0b0951, float:1.8481106E38)
            android.view.View r6 = r2.findViewById(r0)     // Catch:{ all -> 0x2904 }
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6     // Catch:{ all -> 0x2904 }
            if (r6 == 0) goto L_0x28fe
            X.0XL r2 = A06(r1)     // Catch:{ all -> 0x2904 }
            java.lang.Class<com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel> r0 = com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel.class
            X.0Ty r5 = r2.A01(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel r5 = (com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel) r5     // Catch:{ all -> 0x2904 }
            r1.A2B = r5     // Catch:{ all -> 0x2904 }
            X.4uZ r4 = r1.A4J     // Catch:{ all -> 0x2904 }
            r5.A00 = r4     // Catch:{ all -> 0x2904 }
            boolean r0 = r4 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x27d7
            X.1io r3 = r5.A03     // Catch:{ all -> 0x2904 }
            java.lang.Iterable r0 = r3.A05()     // Catch:{ all -> 0x2904 }
            X.6Bf r2 = r5.A01     // Catch:{ all -> 0x2904 }
            boolean r0 = X.C73723fy.A0U(r0, r2)     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x27cb
            r3.A06(r2)     // Catch:{ all -> 0x2904 }
        L_0x27cb:
            X.4FS r3 = r5.A06     // Catch:{ all -> 0x2904 }
            r2 = 35
            X.5rV r0 = new X.5rV     // Catch:{ all -> 0x2904 }
            r0.<init>(r5, r2, r4)     // Catch:{ all -> 0x2904 }
            r3.BkP(r0)     // Catch:{ all -> 0x2904 }
        L_0x27d7:
            X.4Uy r0 = r1.A5M     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x27e6
            X.107 r3 = r0.A05     // Catch:{ all -> 0x2904 }
            X.0sA r2 = A05(r1)     // Catch:{ all -> 0x2904 }
            r0 = 222(0xde, float:3.11E-43)
            X.AnonymousClass6C6.A02(r2, r3, r1, r0)     // Catch:{ all -> 0x2904 }
        L_0x27e6:
            X.66o r9 = X.AnonymousClass5KY.A00(r1)     // Catch:{ all -> 0x2904 }
            com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel r0 = r1.A2B     // Catch:{ all -> 0x2904 }
            X.107 r2 = r0.A05     // Catch:{ all -> 0x2904 }
            X.0sA r7 = A05(r1)     // Catch:{ all -> 0x2904 }
            X.4eZ r8 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.33j r10 = r1.A3L     // Catch:{ all -> 0x2904 }
            X.5jK r9 = (X.C112185jK) r9     // Catch:{ all -> 0x2904 }
            r0 = 3
            X.C18260x0.A0b(r7, r8, r10, r0)     // Catch:{ all -> 0x2904 }
            X.5gc r5 = new X.5gc     // Catch:{ all -> 0x2904 }
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x2904 }
            r2.A0B(r7, r5)     // Catch:{ all -> 0x2904 }
            goto L_0x28fe
        L_0x2808:
            X.3ZH r0 = r1.A3n     // Catch:{ all -> 0x2904 }
            boolean r0 = r0.A0R()     // Catch:{ all -> 0x2904 }
        L_0x280e:
            if (r0 == 0) goto L_0x28fe
        L_0x2810:
            X.4uZ r6 = r1.A4J     // Catch:{ all -> 0x2904 }
            X.676 r2 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0 = 2131427964(0x7f0b027c, float:1.847756E38)
            android.view.View r5 = r2.findViewById(r0)     // Catch:{ all -> 0x2904 }
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5     // Catch:{ all -> 0x2904 }
            if (r5 == 0) goto L_0x28fe
            if (r6 == 0) goto L_0x28fe
            X.4eZ r2 = A09(r1)     // Catch:{ all -> 0x2904 }
            X.4Qj r0 = new X.4Qj     // Catch:{ all -> 0x2904 }
            r0.<init>(r2)     // Catch:{ all -> 0x2904 }
            r1.A2A = r0     // Catch:{ all -> 0x2904 }
            X.4V1 r4 = r0.getViewModel()     // Catch:{ all -> 0x2904 }
            r4.A00 = r6     // Catch:{ all -> 0x2904 }
            boolean r0 = r6 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x2904 }
            if (r0 == 0) goto L_0x2853
            X.1io r3 = r4.A09     // Catch:{ all -> 0x2904 }
            java.lang.Iterable r0 = r3.A05()     // Catch:{ all -> 0x2904 }
            X.6Bf r2 = r4.A05     // Catch:{ all -> 0x2904 }
            boolean r0 = X.C73723fy.A0U(r0, r2)     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x2847
            r3.A06(r2)     // Catch:{ all -> 0x2904 }
        L_0x2847:
            X.4FS r3 = r4.A0C     // Catch:{ all -> 0x2904 }
            r2 = 34
            X.5rV r0 = new X.5rV     // Catch:{ all -> 0x2904 }
            r0.<init>(r4, r2, r6)     // Catch:{ all -> 0x2904 }
            r3.BkP(r0)     // Catch:{ all -> 0x2904 }
        L_0x2853:
            X.4Qj r0 = r1.A2A     // Catch:{ all -> 0x2904 }
            r5.addView(r0)     // Catch:{ all -> 0x2904 }
            com.whatsapp.KeyboardPopupLayout r3 = r1.A1a     // Catch:{ all -> 0x2904 }
            r2 = 2
            X.691 r0 = new X.691     // Catch:{ all -> 0x2904 }
            r0.<init>((X.C113245l7) r1, (int) r2)     // Catch:{ all -> 0x2904 }
            r3.addOnLayoutChangeListener(r0)     // Catch:{ all -> 0x2904 }
            goto L_0x28fe
        L_0x2865:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x2904 }
        L_0x2867:
            throw r0     // Catch:{ all -> 0x2904 }
        L_0x2868:
            java.lang.String r0 = "fail_tell_a_friend"
            r1.A2F(r0)     // Catch:{ all -> 0x2904 }
            X.4eZ r0 = A09(r1)     // Catch:{ all -> 0x2904 }
            java.lang.String r6 = r8.A0L     // Catch:{ all -> 0x2904 }
            android.net.Uri r5 = r8.A03     // Catch:{ all -> 0x2904 }
            android.content.Intent r3 = X.C18320x8.A07()     // Catch:{ all -> 0x2904 }
            java.lang.String r2 = r0.getPackageName()     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "com.whatsapp.conversationslist.SmsDefaultAppWarning"
            r3.setClassName(r2, r0)     // Catch:{ all -> 0x2904 }
            r3.setData(r5)     // Catch:{ all -> 0x2904 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x2890
            java.lang.String r0 = "sms_body"
            r3.putExtra(r0, r6)     // Catch:{ all -> 0x2904 }
        L_0x2890:
            r3.setData(r5)     // Catch:{ all -> 0x2904 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x2904 }
            if (r0 != 0) goto L_0x289e
            java.lang.String r0 = "sms_body"
            r3.putExtra(r0, r6)     // Catch:{ all -> 0x2904 }
        L_0x289e:
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0.startActivity(r3)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0.finish()     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0.BKe(r4)     // Catch:{ all -> 0x2904 }
            goto L_0x28fe
        L_0x28ae:
            java.lang.String r0 = "fail_display_name"
            r1.A2F(r0)     // Catch:{ all -> 0x2904 }
            X.2oD r3 = r1.A2j     // Catch:{ all -> 0x2904 }
            X.4uZ r0 = r8.A08     // Catch:{ all -> 0x2904 }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x2904 }
            r3.A00(r0, r2, r2, r2)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0.finish()     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0.BKe(r4)     // Catch:{ all -> 0x2904 }
            goto L_0x28fe
        L_0x28c8:
            java.lang.String r0 = "fail"
            r1.A2F(r0)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0.finish()     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0.BKe(r4)     // Catch:{ all -> 0x2904 }
            goto L_0x28fe
        L_0x28d8:
            java.lang.String r0 = "conversation/create/no-me-or-msgstore-db"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x2904 }
            java.lang.String r0 = "no_msg_store"
            r1.A2F(r0)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0.getGlobalUI()     // Catch:{ all -> 0x2904 }
            X.4eZ r0 = A09(r1)     // Catch:{ all -> 0x2904 }
            android.content.Intent r2 = X.C627736r.A03(r0)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0.startActivity(r2)     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0.finish()     // Catch:{ all -> 0x2904 }
            X.676 r0 = r1.A2z     // Catch:{ all -> 0x2904 }
            r0.BKe(r4)     // Catch:{ all -> 0x2904 }
        L_0x28fe:
            r0 = r31
            r1.A2F(r0)
            return
        L_0x2904:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x2906 }
        L_0x2906:
            r2 = move-exception
            r0 = r31
            r1.A2F(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113245l7.A1d(android.os.Bundle):void");
    }
}
